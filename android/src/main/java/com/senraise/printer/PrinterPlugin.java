package com.senraise.printer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Base64;
import android.graphics.BitmapFactory;

import com.getcapacitor.JSArray;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

import org.json.JSONException;

import recieptservice.com.recieptservice.PrinterInterface;

@CapacitorPlugin(name = "Printer")
public class PrinterPlugin extends Plugin {

    // 缺纸异常
    public final static String OUT_OF_PAPER_ACTION = "printer_paper_not_ready";
    // 可以打印
    public final static String NORMAL_ACTION = "printer_paper_ready";
    // 打印头过热异常
    public final static String OVER_HEATING_ACITON = "printer_normal_heat";

    private ServiceConnection connService = new ServiceConnection() {
        @Override
        public void onServiceDisconnected(ComponentName name) {
            printerInterface = null;
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            printerInterface = PrinterInterface.Stub.asInterface(service);
        }
    };
    private PrinterInterface printerInterface;

    private PrinterReceiver receiver = new PrinterReceiver();

    public void load() {
        Intent intent = new Intent();
        intent.setClassName("recieptservice.com.recieptservice", "recieptservice.com.recieptservice.service.PrinterService");
        getContext().startService(intent);
        getContext().bindService(intent, connService, Context.BIND_AUTO_CREATE);
        IntentFilter mFilter = new IntentFilter();
        mFilter.addAction(OUT_OF_PAPER_ACTION);
        mFilter.addAction(NORMAL_ACTION);
        mFilter.addAction(OVER_HEATING_ACITON);
        getContext().registerReceiver(receiver, mFilter,2);
    }

    @PluginMethod
    public void printEpson(PluginCall call) {
        if (printerInterface != null) {
            try {
                JSArray dataArray = call.getArray("data");
                byte[] data = new byte[dataArray.length()];
                for (int i = 0; i < dataArray.length(); i++) {
                    data[i] = (byte) dataArray.getInt(i);
                }
                printerInterface.printEpson(data);
                call.resolve();
            } catch (RemoteException | JSONException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void printText(PluginCall call) {
        if (printerInterface != null) {
            try {
                String text = call.getString("text");
                printerInterface.printText(text);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void printBarCode(PluginCall call) {
        if (printerInterface != null) {
            try {
                String data = call.getString("data");
                int symbology = call.getInt("symbology");
                int height = call.getInt("height");
                int width = call.getInt("width");
                printerInterface.printBarCode(data, symbology, height, width);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void printQRCode(PluginCall call) {
        if (printerInterface != null) {
            try {
                String data = call.getString("data");
                int modulesize = call.getInt("modulesize");
                int errorlevel = call.getInt("errorlevel");
                printerInterface.printQRCode(data, modulesize, errorlevel);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void setAlignment(PluginCall call) {
        if (printerInterface != null) {
            try {
                int alignment = call.getInt("alignment");
                printerInterface.setAlignment(alignment);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void setTextSize(PluginCall call) {
        if (printerInterface != null) {
            try {
                float textSize = call.getFloat("textSize");
                printerInterface.setTextSize(textSize);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void nextLine(PluginCall call) {
        if (printerInterface != null) {
            try {
                int line = call.getInt("line");
                printerInterface.nextLine(line);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void printTableText(PluginCall call) {
        if (printerInterface != null) {
            try {
                JSArray textArray = call.getArray("text");
                JSArray weightArray = call.getArray("weight");
                JSArray alignmentArray = call.getArray("alignment");

                String[] text = new String[textArray.length()];
                int[] weight = new int[weightArray.length()];
                int[] alignment = new int[alignmentArray.length()];

                for (int i = 0; i < textArray.length(); i++) {
                    text[i] = textArray.getString(i);
                }

                for (int i = 0; i < weightArray.length(); i++) {
                    weight[i] = weightArray.getInt(i);
                }

                for (int i = 0; i < alignmentArray.length(); i++) {
                    alignment[i] = alignmentArray.getInt(i);
                }

                printerInterface.printTableText(text, weight, alignment);
                call.resolve();
            } catch (RemoteException | JSONException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void setTextBold(PluginCall call) {
        if (printerInterface != null) {
            try {
                boolean bold = call.getBoolean("bold");
                printerInterface.setTextBold(bold);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void setDark(PluginCall call) {
        if (printerInterface != null) {
            try {
                int value = call.getInt("value");
                printerInterface.setDark(value);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void setLineHeight(PluginCall call) {
        if (printerInterface != null) {
            try {
                float lineHeight = call.getFloat("lineHeight");
                printerInterface.setLineHeight(lineHeight);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void setTextDoubleWidth(PluginCall call) {
        if (printerInterface != null) {
            try {
                boolean enable = call.getBoolean("enable");
                printerInterface.setTextDoubleWidth(enable);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void setTextDoubleHeight(PluginCall call) {
        if (printerInterface != null) {
            try {
                boolean enable = call.getBoolean("enable");
                printerInterface.setTextDoubleHeight(enable);
                call.resolve();
            } catch (RemoteException e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void printBASE64PNG(PluginCall call) {
        if (printerInterface != null) {
            try {
                String pic = call.getString("pic");
                byte[] imageBytes = Base64.decode(pic.split(",")[1], Base64.DEFAULT);
                Bitmap decodedImage = BitmapFactory.decodeByteArray(imageBytes, 0, imageBytes.length);
                printerInterface.printBitmap(decodedImage);
                call.resolve();
            } catch (Exception e) {
                call.reject(e.getMessage());
            }
        }
    }

    @PluginMethod
    public void test(PluginCall call) {
        call.resolve();
    }
}
