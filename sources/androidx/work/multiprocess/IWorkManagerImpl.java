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
public interface IWorkManagerImpl extends IInterface {
    public static final String n3 = "androidx$work$multiprocess$IWorkManagerImpl".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IWorkManagerImpl {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImpl {

        public static class Proxy implements IWorkManagerImpl {
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
            String str = IWorkManagerImpl.n3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    K0();
                    return true;
                case 2:
                    parcel.readString();
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    j();
                    return true;
                case 3:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    Q();
                    return true;
                case 4:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    x0();
                    return true;
                case 5:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    a0();
                    return true;
                case 6:
                    parcel.readString();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    d();
                    return true;
                case 7:
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    R0();
                    return true;
                case 8:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    i();
                    return true;
                case 9:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    c0();
                    return true;
                case 10:
                    parcel.createByteArray();
                    IWorkManagerImplCallback.Stub.h1(parcel.readStrongBinder());
                    q0();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void K0();

    void Q();

    void R0();

    void a0();

    void c0();

    void d();

    void i();

    void j();

    void q0();

    void x0();
}
