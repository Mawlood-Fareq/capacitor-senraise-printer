/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package recieptservice.com.recieptservice;
public interface PSAMCallback extends android.os.IInterface
{
  /** Default implementation for PSAMCallback. */
  public static class Default implements recieptservice.com.recieptservice.PSAMCallback
  {
    @Override public void success(byte[] data) throws android.os.RemoteException
    {
    }
    @Override public void error(int errorCode, java.lang.String errorMsg) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements recieptservice.com.recieptservice.PSAMCallback
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an recieptservice.com.recieptservice.PSAMCallback interface,
     * generating a proxy if needed.
     */
    public static recieptservice.com.recieptservice.PSAMCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof recieptservice.com.recieptservice.PSAMCallback))) {
        return ((recieptservice.com.recieptservice.PSAMCallback)iin);
      }
      return new recieptservice.com.recieptservice.PSAMCallback.Stub.Proxy(obj);
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
        case TRANSACTION_success:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          this.success(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_error:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          this.error(_arg0, _arg1);
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
    private static class Proxy implements recieptservice.com.recieptservice.PSAMCallback
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
      @Override public void success(byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_success, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void error(int errorCode, java.lang.String errorMsg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(errorCode);
          _data.writeString(errorMsg);
          boolean _status = mRemote.transact(Stub.TRANSACTION_error, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_success = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_error = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
  }
  public static final java.lang.String DESCRIPTOR = "recieptservice.com.recieptservice.PSAMCallback";
  public void success(byte[] data) throws android.os.RemoteException;
  public void error(int errorCode, java.lang.String errorMsg) throws android.os.RemoteException;
}
