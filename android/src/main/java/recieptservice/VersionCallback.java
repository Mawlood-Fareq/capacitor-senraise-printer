/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package recieptservice.com.recieptservice;
// Declare any non-default types here with import statements
public interface VersionCallback extends android.os.IInterface
{
  /** Default implementation for VersionCallback. */
  public static class Default implements recieptservice.com.recieptservice.VersionCallback
  {
    @Override public void onflash(int version, int progress) throws android.os.RemoteException
    {
    }
    @Override public void paper(boolean ready) throws android.os.RemoteException
    {
    }
    @Override public void error(boolean ready) throws android.os.RemoteException
    {
    }
    @Override public void ready() throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements recieptservice.com.recieptservice.VersionCallback
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an recieptservice.com.recieptservice.VersionCallback interface,
     * generating a proxy if needed.
     */
    public static recieptservice.com.recieptservice.VersionCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof recieptservice.com.recieptservice.VersionCallback))) {
        return ((recieptservice.com.recieptservice.VersionCallback)iin);
      }
      return new recieptservice.com.recieptservice.VersionCallback.Stub.Proxy(obj);
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
        case TRANSACTION_onflash:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          this.onflash(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_paper:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.paper(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_error:
        {
          boolean _arg0;
          _arg0 = (0!=data.readInt());
          this.error(_arg0);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_ready:
        {
          this.ready();
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
    private static class Proxy implements recieptservice.com.recieptservice.VersionCallback
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
      @Override public void onflash(int version, int progress) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(version);
          _data.writeInt(progress);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onflash, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void paper(boolean ready) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((ready)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_paper, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void error(boolean ready) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(((ready)?(1):(0)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_error, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void ready() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_ready, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onflash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_paper = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_error = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_ready = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  public static final java.lang.String DESCRIPTOR = "recieptservice.com.recieptservice.VersionCallback";
  public void onflash(int version, int progress) throws android.os.RemoteException;
  public void paper(boolean ready) throws android.os.RemoteException;
  public void error(boolean ready) throws android.os.RemoteException;
  public void ready() throws android.os.RemoteException;
}
