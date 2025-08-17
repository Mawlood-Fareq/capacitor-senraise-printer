/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package recieptservice.com.recieptservice;
public interface PrinterInterface extends android.os.IInterface
{
  /** Default implementation for PrinterInterface. */
  public static class Default implements recieptservice.com.recieptservice.PrinterInterface
  {
    @Override public void printEpson(byte[] data) throws android.os.RemoteException
    {
    }
    @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
    {
      return null;
    }
    @Override public void printText(java.lang.String text) throws android.os.RemoteException
    {
    }
    @Override public void printBitmap(android.graphics.Bitmap pic) throws android.os.RemoteException
    {
    }
    @Override public void printBarCode(java.lang.String data, int symbology, int height, int width) throws android.os.RemoteException
    {
    }
    @Override public void printQRCode(java.lang.String data, int modulesize, int errorlevel) throws android.os.RemoteException
    {
    }
    @Override public void setAlignment(int alignment) throws android.os.RemoteException
    {
    }
    @Override public void setTextSize(float textSize) throws android.os.RemoteException
    {
    }
    @Override public void nextLine(int line) throws android.os.RemoteException
    {
    }
    @Override public void printTableText(java.lang.String[] text, int[] weight, int[] alignment) throws android.os.RemoteException
    {
    }
    @Override public void setTextBold(boolean bold) throws android.os.RemoteException
    {
    }
    @Override public void beginWork() throws android.os.RemoteException
    {
    }
    @Override public void endWork() throws android.os.RemoteException
    {
    }
    @Override public void setDark(int value) throws android.os.RemoteException
    {
    }
    @Override public void setLineHeight(float lineHeight) throws android.os.RemoteException
    {
    }
    @Override public void setTextDoubleWidth(boolean enable) throws android.os.RemoteException
    {
    }
    @Override public void setTextDoubleHeight(boolean enable) throws android.os.RemoteException
    {
    }
    @Override public void printPDF417Code(java.lang.String data, int modulesize, int errorlevel) throws android.os.RemoteException
    {
    }
    @Override public void setCode(java.lang.String code) throws android.os.RemoteException
    {
    }
    @Override public void print128BarCode(java.lang.String data, int type, int height, int width) throws android.os.RemoteException
    {
    }
    @Override public boolean getScannerStatus() throws android.os.RemoteException
    {
      return false;
    }
    /**   检卡接口 */
    @Override public void checkPSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
    {
    }
    /**   激活接口 */
    @Override public void activatePSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
    {
    }
    /**   反激活接口 */
    @Override public void deactivatePSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
    {
    }
    /**   通信接口 */
    @Override public void transmitPSAMCard(int timeout, byte[] data, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements recieptservice.com.recieptservice.PrinterInterface
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an recieptservice.com.recieptservice.PrinterInterface interface,
     * generating a proxy if needed.
     */
    public static recieptservice.com.recieptservice.PrinterInterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof recieptservice.com.recieptservice.PrinterInterface))) {
        return ((recieptservice.com.recieptservice.PrinterInterface)iin);
      }
      return new recieptservice.com.recieptservice.PrinterInterface.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_printEpson:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.printEpson(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getServiceVersion:
        {
          java.lang.String _result = this.getServiceVersion();
          reply.writeNoException();
          reply.writeString(_result);
          break;
        }
        case TRANSACTION_printText:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.printText(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_printBitmap:
        {
          android.graphics.Bitmap _arg0;
          _arg0 = _Parcel.readTypedObject(data, android.graphics.Bitmap.CREATOR);
          this.printBitmap(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_printBarCode:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          this.printBarCode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_printQRCode:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.printQRCode(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setAlignment:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.setAlignment(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setTextSize:
        {
          float _arg0;
          _arg0 = data.readFloat();
          this.setTextSize(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_nextLine:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.nextLine(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_printTableText:
        {
          java.lang.String[] _arg0;
          _arg0 = data.createStringArray();
          int[] _arg1;
          _arg1 = data.createIntArray();
          int[] _arg2;
          _arg2 = data.createIntArray();
          this.printTableText(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setTextBold:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setTextBold(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_beginWork:
        {
          this.beginWork();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_endWork:
        {
          this.endWork();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setDark:
        {
          int _arg0;
          _arg0 = data.readInt();
          this.setDark(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setLineHeight:
        {
          float _arg0;
          _arg0 = data.readFloat();
          this.setLineHeight(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setTextDoubleWidth:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setTextDoubleWidth(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setTextDoubleHeight:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.setTextDoubleHeight(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_printPDF417Code:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          this.printPDF417Code(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setCode:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.setCode(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_print128BarCode:
        {
          java.lang.String _arg0;
          _arg0 = data.readString();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          this.print128BarCode(_arg0, _arg1, _arg2, _arg3);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_getScannerStatus:
        {
          boolean _result = this.getScannerStatus();
          reply.writeNoException();
          reply.writeInt(((_result)?(1):(0)));
          break;
        }
        case TRANSACTION_checkPSAMCard:
        {
          int _arg0;
          _arg0 = data.readInt();
          recieptservice.com.recieptservice.PSAMCallback _arg1;
          _arg1 = recieptservice.com.recieptservice.PSAMCallback.Stub.asInterface(data.readStrongBinder());
          this.checkPSAMCard(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_activatePSAMCard:
        {
          int _arg0;
          _arg0 = data.readInt();
          recieptservice.com.recieptservice.PSAMCallback _arg1;
          _arg1 = recieptservice.com.recieptservice.PSAMCallback.Stub.asInterface(data.readStrongBinder());
          this.activatePSAMCard(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_deactivatePSAMCard:
        {
          int _arg0;
          _arg0 = data.readInt();
          recieptservice.com.recieptservice.PSAMCallback _arg1;
          _arg1 = recieptservice.com.recieptservice.PSAMCallback.Stub.asInterface(data.readStrongBinder());
          this.deactivatePSAMCard(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_transmitPSAMCard:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          recieptservice.com.recieptservice.PSAMCallback _arg2;
          _arg2 = recieptservice.com.recieptservice.PSAMCallback.Stub.asInterface(data.readStrongBinder());
          this.transmitPSAMCard(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements recieptservice.com.recieptservice.PrinterInterface
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void printEpson(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printEpson, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public java.lang.String getServiceVersion() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        java.lang.String _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getServiceVersion, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readString();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void printText(java.lang.String text) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(text);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printText, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBitmap(android.graphics.Bitmap pic) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, pic, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBitmap, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printBarCode(java.lang.String data, int symbology, int height, int width) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          _data.writeInt(symbology);
          _data.writeInt(height);
          _data.writeInt(width);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printBarCode, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printQRCode(java.lang.String data, int modulesize, int errorlevel) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          _data.writeInt(modulesize);
          _data.writeInt(errorlevel);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printQRCode, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setAlignment(int alignment) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(alignment);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAlignment, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextSize(float textSize) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(textSize);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextSize, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void nextLine(int line) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(line);
          boolean _status = mRemote.transact(Stub.TRANSACTION_nextLine, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printTableText(java.lang.String[] text, int[] weight, int[] alignment) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStringArray(text);
          _data.writeIntArray(weight);
          _data.writeIntArray(alignment);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printTableText, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextBold(boolean bold) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((bold)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextBold, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void beginWork() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_beginWork, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void endWork() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_endWork, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setDark(int value) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(value);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDark, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setLineHeight(float lineHeight) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeFloat(lineHeight);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLineHeight, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextDoubleWidth(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextDoubleWidth, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setTextDoubleHeight(boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((enable)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTextDoubleHeight, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void printPDF417Code(java.lang.String data, int modulesize, int errorlevel) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          _data.writeInt(modulesize);
          _data.writeInt(errorlevel);
          boolean _status = mRemote.transact(Stub.TRANSACTION_printPDF417Code, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setCode(java.lang.String code) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(code);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCode, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void print128BarCode(java.lang.String data, int type, int height, int width) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(data);
          _data.writeInt(type);
          _data.writeInt(height);
          _data.writeInt(width);
          boolean _status = mRemote.transact(Stub.TRANSACTION_print128BarCode, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public boolean getScannerStatus() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        boolean _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getScannerStatus, _data, _reply, 0);
          _reply.readException();
          _result = (0!=_reply.readInt());
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      /**   检卡接口 */
      @Override public void checkPSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(timeout);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_checkPSAMCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**   激活接口 */
      @Override public void activatePSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(timeout);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_activatePSAMCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**   反激活接口 */
      @Override public void deactivatePSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(timeout);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deactivatePSAMCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      /**   通信接口 */
      @Override public void transmitPSAMCard(int timeout, byte[] data, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(timeout);
          _data.writeByteArray(data);
          _data.writeStrongInterface(callback);
          boolean _status = mRemote.transact(Stub.TRANSACTION_transmitPSAMCard, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_printEpson = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getServiceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_printText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_printBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_printBarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_printQRCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setAlignment = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setTextSize = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_nextLine = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_printTableText = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setTextBold = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_beginWork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_endWork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_setDark = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_setLineHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_setTextDoubleWidth = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setTextDoubleHeight = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_printPDF417Code = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_setCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_print128BarCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_getScannerStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_checkPSAMCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_activatePSAMCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_deactivatePSAMCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_transmitPSAMCard = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
  }
  public static final java.lang.String DESCRIPTOR = "recieptservice.com.recieptservice.PrinterInterface";
  public void printEpson(byte[] data) throws android.os.RemoteException;
  public java.lang.String getServiceVersion() throws android.os.RemoteException;
  public void printText(java.lang.String text) throws android.os.RemoteException;
  public void printBitmap(android.graphics.Bitmap pic) throws android.os.RemoteException;
  public void printBarCode(java.lang.String data, int symbology, int height, int width) throws android.os.RemoteException;
  public void printQRCode(java.lang.String data, int modulesize, int errorlevel) throws android.os.RemoteException;
  public void setAlignment(int alignment) throws android.os.RemoteException;
  public void setTextSize(float textSize) throws android.os.RemoteException;
  public void nextLine(int line) throws android.os.RemoteException;
  public void printTableText(java.lang.String[] text, int[] weight, int[] alignment) throws android.os.RemoteException;
  public void setTextBold(boolean bold) throws android.os.RemoteException;
  public void beginWork() throws android.os.RemoteException;
  public void endWork() throws android.os.RemoteException;
  public void setDark(int value) throws android.os.RemoteException;
  public void setLineHeight(float lineHeight) throws android.os.RemoteException;
  public void setTextDoubleWidth(boolean enable) throws android.os.RemoteException;
  public void setTextDoubleHeight(boolean enable) throws android.os.RemoteException;
  public void printPDF417Code(java.lang.String data, int modulesize, int errorlevel) throws android.os.RemoteException;
  public void setCode(java.lang.String code) throws android.os.RemoteException;
  public void print128BarCode(java.lang.String data, int type, int height, int width) throws android.os.RemoteException;
  public boolean getScannerStatus() throws android.os.RemoteException;
  /**   检卡接口 */
  public void checkPSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException;
  /**   激活接口 */
  public void activatePSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException;
  /**   反激活接口 */
  public void deactivatePSAMCard(int timeout, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException;
  /**   通信接口 */
  public void transmitPSAMCard(int timeout, byte[] data, recieptservice.com.recieptservice.PSAMCallback callback) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
