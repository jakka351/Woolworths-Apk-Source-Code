package android.support.customtabs;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IPostMessageService extends IInterface {
    public static final String X2 = "android$support$customtabs$IPostMessageService".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IPostMessageService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.IPostMessageService
        public final void h(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            throw null;
        }
    }

    public static abstract class Stub extends Binder implements IPostMessageService {

        public static class Proxy implements IPostMessageService {
            public IBinder d;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }

            @Override // android.support.customtabs.IPostMessageService
            public final void h(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                throw null;
            }
        }

        public static IPostMessageService h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IPostMessageService.X2);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IPostMessageService)) {
                return (IPostMessageService) iInterfaceQueryLocalInterface;
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
            String str = IPostMessageService.X2;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 2) {
                h(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                parcel2.writeNoException();
                return true;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            T0(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
            return true;
        }
    }

    public static class _Parcel {
    }

    void T0(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    void h(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);
}
