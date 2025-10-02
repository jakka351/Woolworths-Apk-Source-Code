package android.support.customtabs.trusted;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface ITrustedWebActivityService extends IInterface {
    public static final String Z2 = "android$support$customtabs$trusted$ITrustedWebActivityService".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements ITrustedWebActivityService {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements ITrustedWebActivityService {

        public static class Proxy implements ITrustedWebActivityService {
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
            String str = ITrustedWebActivityService.Z2;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    Bundle bundleB = B((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    _Parcel.a(parcel2, bundleB);
                    return true;
                case 3:
                    W0((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    int iU0 = U0();
                    parcel2.writeNoException();
                    parcel2.writeInt(iU0);
                    return true;
                case 5:
                    Bundle bundleJ0 = J0();
                    parcel2.writeNoException();
                    _Parcel.a(parcel2, bundleJ0);
                    return true;
                case 6:
                    Bundle bundleV0 = V0((Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null));
                    parcel2.writeNoException();
                    _Parcel.a(parcel2, bundleV0);
                    return true;
                case 7:
                    Bundle bundleR0 = r0();
                    parcel2.writeNoException();
                    _Parcel.a(parcel2, bundleR0);
                    return true;
                case 8:
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
                case 9:
                    Bundle bundleJ02 = j0(parcel.readString(), (Bundle) (parcel.readInt() != 0 ? Bundle.CREATOR.createFromParcel(parcel) : null), parcel.readStrongBinder());
                    parcel2.writeNoException();
                    _Parcel.a(parcel2, bundleJ02);
                    return true;
            }
        }
    }

    public static class _Parcel {
        public static void a(Parcel parcel, Bundle bundle) {
            if (bundle == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                bundle.writeToParcel(parcel, 1);
            }
        }
    }

    Bundle B(Bundle bundle);

    Bundle J0();

    int U0();

    Bundle V0(Bundle bundle);

    void W0(Bundle bundle);

    Bundle j0(String str, Bundle bundle, IBinder iBinder);

    Bundle r0();
}
