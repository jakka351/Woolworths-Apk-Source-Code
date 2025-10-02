package android.support.customtabs;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IEngagementSignalsCallback extends IInterface {
    public static final String W2 = "android$support$customtabs$IEngagementSignalsCallback".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IEngagementSignalsCallback {
        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void E() {
            throw null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void H0() {
            throw null;
        }

        @Override // android.support.customtabs.IEngagementSignalsCallback
        public final void Z() {
            throw null;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IEngagementSignalsCallback {

        public static class Proxy implements IEngagementSignalsCallback {
            public IBinder d;

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public final void E() {
                throw null;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public final void H0() {
                throw null;
            }

            @Override // android.support.customtabs.IEngagementSignalsCallback
            public final void Z() {
                throw null;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }
        }

        public static IEngagementSignalsCallback h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IEngagementSignalsCallback.W2);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IEngagementSignalsCallback)) {
                return (IEngagementSignalsCallback) iInterfaceQueryLocalInterface;
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
            String str = IEngagementSignalsCallback.W2;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                parcel.readInt();
                E();
                throw null;
            }
            if (i == 3) {
                parcel.readInt();
                H0();
                throw null;
            }
            if (i != 4) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.readInt();
            Z();
            throw null;
        }
    }

    public static class _Parcel {
    }

    void E();

    void H0();

    void Z();
}
