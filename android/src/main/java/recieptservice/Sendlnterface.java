/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package recieptservice.com.recieptservice;
// Declare any non-default types here with import statements
public interface Sendlnterface extends android.os.IInterface
{
  /** Default implementation for Sendlnterface. */
  public static class Default implements recieptservice.com.recieptservice.Sendlnterface
  {
    @Override public int send(byte[] data, int type, int send_len) throws android.os.RemoteException
    {
      return 0;
    }
    @Override public void close() throws android.os.RemoteException
    {
    }
    @Override public void setVersionCallback(recieptservice.com.recieptservice.VersionCallback v) throws android.os.RemoteException
    {
    }
    @Override public void setPSAMDataCallback(recieptservice.com.recieptservice.PSAMData v) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements recieptservice.com.recieptservice.Sendlnterface
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an recieptservice.com.recieptservice.Sendlnterface interface,
     * generating a proxy if needed.
     */
    public static recieptservice.com.recieptservice.Sendlnterface asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof recieptservice.com.recieptservice.Sendlnterface))) {
        return ((recieptservice.com.recieptservice.Sendlnterface)iin);
      }
      return new recieptservice.com.recieptservice.Sendlnterface.Stub.Proxy(obj);
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
        case TRANSACTION_send:
        {
          byte[] _arg0;
          _arg0 = data.createByteArray();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _result = this.send(_arg0, _arg1, _arg2);
          reply.writeNoException();
          reply.writeInt(_result);
          break;
        }
        case TRANSACTION_close:
        {
          this.close();
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setVersionCallback:
        {
          recieptservice.com.recieptservice.VersionCallback _arg0;
          _arg0 = recieptservice.com.recieptservice.VersionCallback.Stub.asInterface(data.readStrongBinder());
          this.setVersionCallback(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setPSAMDataCallback:
        {
          recieptservice.com.recieptservice.PSAMData _arg0;
          _arg0 = recieptservice.com.recieptservice.PSAMData.Stub.asInterface(data.readStrongBinder());
          this.setPSAMDataCallback(_arg0);
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
    private static class Proxy implements recieptservice.com.recieptservice.Sendlnterface
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
      @Override public int send(byte[] data, int type, int send_len) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeByteArray(data);
          _data.writeInt(type);
          _data.writeInt(send_len);
          boolean _status = mRemote.transact(Stub.TRANSACTION_send, _data, _reply, 0);
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void close() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_close, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setVersionCallback(recieptservice.com.recieptservice.VersionCallback v) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(v);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setVersionCallback, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setPSAMDataCallback(recieptservice.com.recieptservice.PSAMData v) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(v);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPSAMDataCallback, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_send = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_close = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_setVersionCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setPSAMDataCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  public static final java.lang.String DESCRIPTOR = "recieptservice.com.recieptservice.Sendlnterface";
  public int send(byte[] data, int type, int send_len) throws android.os.RemoteException;
  public void close() throws android.os.RemoteException;
  public void setVersionCallback(recieptservice.com.recieptservice.VersionCallback v) throws android.os.RemoteException;
  public void setPSAMDataCallback(recieptservice.com.recieptservice.PSAMData v) throws android.os.RemoteException;
}
