package com.senraise.printer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.getcapacitor.JSObject;

public class PrinterReceiver extends BroadcastReceiver {
    private final PrinterPlugin plugin;

    public PrinterReceiver(PrinterPlugin plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onReceive(Context context, Intent data) {
        String action = data.getAction();
        Log.d("PrinterReceiver", action);

        if (plugin != null) {
            JSObject ret = new JSObject();
            ret.put("status", action);
            plugin.notifyListeners("printerStatus", ret, true);
        }
    }
}
