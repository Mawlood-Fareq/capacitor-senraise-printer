package com.senraise.printer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.getcapacitor.Bridge;

public class PrinterReceiver extends BroadcastReceiver {
    private Bridge bridge;

    public PrinterReceiver() {
    }

    public PrinterReceiver(Bridge bridge) {
        this.bridge = bridge;
    }

    @Override
    public void onReceive(Context context, Intent data) {
        String action = data.getAction();
        String type = "PrinterStatus";
        Log.d("PrinterReceiver", action);

        if (bridge != null) {
            bridge.triggerJSEvent("printerStatus", "window", "{ \"status\": \"" + action + "\" }");
        }
    }
}
