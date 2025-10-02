package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IUnusedAppRestrictionsBackportService extends IInterface {
    public static final String g3 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportService".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IUnusedAppRestrictionsBackportService {
        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public final void M0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportService {

        public static class Proxy implements IUnusedAppRestrictionsBackportService {
            public IBinder d;

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public final void M0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IUnusedAppRestrictionsBackportService.g3);
                    parcelObtain.writeStrongInterface(iUnusedAppRestrictionsBackportCallback);
                    this.d.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }
        }

        public static IUnusedAppRestrictionsBackportService h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IUnusedAppRestrictionsBackportService.g3);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportService)) {
                return (IUnusedAppRestrictionsBackportService) iInterfaceQueryLocalInterface;
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
            IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback;
            String str = IUnusedAppRestrictionsBackportService.g3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                iUnusedAppRestrictionsBackportCallback = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IUnusedAppRestrictionsBackportCallback.f3);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IUnusedAppRestrictionsBackportCallback)) {
                    IUnusedAppRestrictionsBackportCallback.Stub.Proxy proxy = new IUnusedAppRestrictionsBackportCallback.Stub.Proxy();
                    proxy.d = strongBinder;
                    iUnusedAppRestrictionsBackportCallback = proxy;
                } else {
                    iUnusedAppRestrictionsBackportCallback = (IUnusedAppRestrictionsBackportCallback) iInterfaceQueryLocalInterface;
                }
            }
            M0(iUnusedAppRestrictionsBackportCallback);
            return true;
        }
    }

    void M0(IUnusedAppRestrictionsBackportCallback iUnusedAppRestrictionsBackportCallback);
}
