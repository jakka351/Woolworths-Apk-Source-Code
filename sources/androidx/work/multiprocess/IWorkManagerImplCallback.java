package androidx.work.multiprocess;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IWorkManagerImplCallback extends IInterface {
    public static final String o3 = "androidx$work$multiprocess$IWorkManagerImplCallback".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IWorkManagerImplCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IWorkManagerImplCallback {

        public static class Proxy implements IWorkManagerImplCallback {
            public IBinder d;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }
        }

        public static IWorkManagerImplCallback h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IWorkManagerImplCallback.o3);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IWorkManagerImplCallback)) {
                return (IWorkManagerImplCallback) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.d = iBinder;
            return proxy;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IWorkManagerImplCallback.o3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                parcel.createByteArray();
                onSuccess();
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.readString();
            c();
            return true;
        }
    }

    void c();

    void onSuccess();
}
