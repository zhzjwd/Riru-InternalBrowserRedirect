/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.github.kr328.ibr.remote.server;

public interface IRemoteService extends android.os.IInterface {
  int getVersion() throws android.os.RemoteException;

  String[] queryEnabledPackages() throws android.os.RemoteException;

  com.github.kr328.ibr.remote.model.RuleSet queryRuleSet(String packageName) throws android.os.RemoteException;

  void updateRuleSet(String packageName, com.github.kr328.ibr.remote.model.RuleSet ruleSet) throws android.os.RemoteException;

  void removeRuleSet(String packageName) throws android.os.RemoteException;

  /**
   * Default implementation for IRemoteService.
   */
  class Default implements IRemoteService {
    @Override
    public int getVersion() throws android.os.RemoteException {
      return 0;
    }

    @Override
    public String[] queryEnabledPackages() throws android.os.RemoteException {
      return null;
    }

    @Override
    public com.github.kr328.ibr.remote.model.RuleSet queryRuleSet(String packageName) throws android.os.RemoteException {
      return null;
    }

    @Override
    public void updateRuleSet(String packageName, com.github.kr328.ibr.remote.model.RuleSet ruleSet) throws android.os.RemoteException {
    }

    @Override
    public void removeRuleSet(String packageName) throws android.os.RemoteException {
    }

    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }

  /**
   * Local-side IPC implementation stub class.
   */
  abstract class Stub extends android.os.Binder implements IRemoteService {
    static final int TRANSACTION_getVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_queryEnabledPackages = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_queryRuleSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_updateRuleSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_removeRuleSet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    private static final String DESCRIPTOR = "com.github.kr328.ibr.remote.server.IRemoteService";

    /** Construct the stub at attach it to the interface. */
    public Stub() {
      this.attachInterface(this, DESCRIPTOR);
    }

    /**
     * Cast an IBinder object into an com.github.kr328.ibr.remote.server.IRemoteService interface,
     * generating a proxy if needed.
     */
    public static IRemoteService asInterface(android.os.IBinder obj) {
      if ((obj == null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin != null) && (iin instanceof IRemoteService))) {
        return ((IRemoteService) iin);
      }
      return new Proxy(obj);
    }

    public static boolean setDefaultImpl(IRemoteService impl) {
      if (Proxy.sDefaultImpl == null && impl != null) {
        Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }

    public static IRemoteService getDefaultImpl() {
      return Proxy.sDefaultImpl;
    }

    @Override
    public android.os.IBinder asBinder() {
      return this;
    }

    @Override
    public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException {
      String descriptor = DESCRIPTOR;
      switch (code) {
        case INTERFACE_TRANSACTION: {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_getVersion: {
          data.enforceInterface(descriptor);
          int _result = this.getVersion();
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        case TRANSACTION_queryEnabledPackages: {
          data.enforceInterface(descriptor);
          String[] _result = this.queryEnabledPackages();
          reply.writeNoException();
          reply.writeStringArray(_result);
          return true;
        }
        case TRANSACTION_queryRuleSet: {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          com.github.kr328.ibr.remote.model.RuleSet _result = this.queryRuleSet(_arg0);
          reply.writeNoException();
          if ((_result != null)) {
            reply.writeInt(1);
            _result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          } else {
            reply.writeInt(0);
          }
          return true;
        }
        case TRANSACTION_updateRuleSet: {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          com.github.kr328.ibr.remote.model.RuleSet _arg1;
          if ((0 != data.readInt())) {
            _arg1 = com.github.kr328.ibr.remote.model.RuleSet.CREATOR.createFromParcel(data);
          } else {
            _arg1 = null;
          }
          this.updateRuleSet(_arg0, _arg1);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_removeRuleSet: {
          data.enforceInterface(descriptor);
          String _arg0;
          _arg0 = data.readString();
          this.removeRuleSet(_arg0);
          reply.writeNoException();
          return true;
        }
        default: {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }

    private static class Proxy implements IRemoteService {
      public static IRemoteService sDefaultImpl;
      private android.os.IBinder mRemote;

      Proxy(android.os.IBinder remote) {
        mRemote = remote;
      }

      @Override
      public android.os.IBinder asBinder() {
        return mRemote;
      }

      public String getInterfaceDescriptor() {
        return DESCRIPTOR;
      }

      @Override
      public int getVersion() throws android.os.RemoteException {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVersion, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().getVersion();
          }
          _reply.readException();
          _result = _reply.readInt();
        } finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }

      @Override
      public String[] queryEnabledPackages() throws android.os.RemoteException {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        String[] _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryEnabledPackages, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryEnabledPackages();
          }
          _reply.readException();
          _result = _reply.createStringArray();
        } finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }

      @Override
      public com.github.kr328.ibr.remote.model.RuleSet queryRuleSet(String packageName) throws android.os.RemoteException {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        com.github.kr328.ibr.remote.model.RuleSet _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_queryRuleSet, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().queryRuleSet(packageName);
          }
          _reply.readException();
          if ((0 != _reply.readInt())) {
            _result = com.github.kr328.ibr.remote.model.RuleSet.CREATOR.createFromParcel(_reply);
          } else {
            _result = null;
          }
        } finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }

      @Override
      public void updateRuleSet(String packageName, com.github.kr328.ibr.remote.model.RuleSet ruleSet) throws android.os.RemoteException {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          if ((ruleSet != null)) {
            _data.writeInt(1);
            ruleSet.writeToParcel(_data, 0);
          } else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateRuleSet, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().updateRuleSet(packageName, ruleSet);
            return;
          }
          _reply.readException();
        } finally {
          _reply.recycle();
          _data.recycle();
        }
      }

      @Override
      public void removeRuleSet(String packageName) throws android.os.RemoteException {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(packageName);
          boolean _status = mRemote.transact(Stub.TRANSACTION_removeRuleSet, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().removeRuleSet(packageName);
            return;
          }
          _reply.readException();
        } finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
  }
}