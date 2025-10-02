package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.work.multiprocess.IWorkManagerImplCallback;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IListenableWorkerImpl extends IInterface {
    public static final String m3 = "androidx$work$multiprocess$IListenableWorkerImpl".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IListenableWorkerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IListenableWorkerImpl {

        public static class Proxy implements IListenableWorkerImpl {
            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return null;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IListenableWorkerImpl.m3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                parcel.createByteArray();
                IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                m0();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.createByteArray();
            IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
            F0();
            return true;
        }
    }

    void F0();

    void m0();
}
