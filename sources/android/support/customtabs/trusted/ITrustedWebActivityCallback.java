package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface ITrustedWebActivityCallback extends IInterface {
    public static final String Y2 = "android$support$customtabs$trusted$ITrustedWebActivityCallback".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements ITrustedWebActivityCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityCallback {

        public static class Proxy implements ITrustedWebActivityCallback {
            public IBinder d;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }
        }

        public static ITrustedWebActivityCallback h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ITrustedWebActivityCallback.Y2);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ITrustedWebActivityCallback)) {
                return (ITrustedWebActivityCallback) iInterfaceQueryLocalInterface;
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
            String str = ITrustedWebActivityCallback.Y2;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.readString();
            G0();
            throw null;
        }
    }

    public static class _Parcel {
    }

    void G0();
}
