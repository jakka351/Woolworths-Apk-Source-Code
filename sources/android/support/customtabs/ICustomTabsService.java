package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.customtabs.ICustomTabsCallback;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;
import java.util.ArrayList;

@RestrictTo
/* loaded from: classes2.dex */
public interface ICustomTabsService extends IInterface {
    public static final String U2 = "android$support$customtabs$ICustomTabsService".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements ICustomTabsService {
        @Override // android.support.customtabs.ICustomTabsService
        public final boolean L(long j) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final int P(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
            return 0;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean S(ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean Z0(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
            return false;
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean g0(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean k(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean t0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
            return false;
        }

        @Override // android.support.customtabs.ICustomTabsService
        public final boolean u0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsService {

        public static class Proxy implements ICustomTabsService {
            public IBinder d;

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean L(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeLong(0L);
                    this.d.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final int P(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean S(ICustomTabsCallback iCustomTabsCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    this.d.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean Z0(ICustomTabsCallback iCustomTabsCallback, Uri uri) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, uri, 0);
                    this.d.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean g0(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    parcelObtain.writeInt(2);
                    _Parcel.b(parcelObtain, uri, 0);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean k(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, uri, 0);
                    parcelObtain.writeInt(1);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean t0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, uri, 0);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsService
            public final boolean u0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsService.U2);
                    parcelObtain.writeStrongInterface(iCustomTabsCallback);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static ICustomTabsService h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsService.U2);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ICustomTabsService)) {
                return (ICustomTabsService) iInterfaceQueryLocalInterface;
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
            String str = ICustomTabsService.U2;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    boolean zL = L(parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(zL ? 1 : 0);
                    return true;
                case 3:
                    boolean zS = S(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zS ? 1 : 0);
                    return true;
                case 4:
                    ICustomTabsCallback iCustomTabsCallbackH1 = ICustomTabsCallback.Stub.h1(parcel.readStrongBinder());
                    Uri uri = (Uri) _Parcel.a(parcel, Uri.CREATOR);
                    Parcelable.Creator creator = Bundle.CREATOR;
                    boolean zU = U(iCustomTabsCallbackH1, uri, (Bundle) _Parcel.a(parcel, creator), parcel.createTypedArrayList(creator));
                    parcel2.writeNoException();
                    parcel2.writeInt(zU ? 1 : 0);
                    return true;
                case 5:
                    Bundle bundleL = l((Bundle) _Parcel.a(parcel, Bundle.CREATOR), parcel.readString());
                    parcel2.writeNoException();
                    _Parcel.b(parcel2, bundleL, 1);
                    return true;
                case 6:
                    boolean zD = D(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zD ? 1 : 0);
                    return true;
                case 7:
                    boolean zZ0 = Z0(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), (Uri) _Parcel.a(parcel, Uri.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zZ0 ? 1 : 0);
                    return true;
                case 8:
                    int iP = P(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(iP);
                    return true;
                case 9:
                    boolean zG0 = g0(parcel.readInt(), (Uri) _Parcel.a(parcel, Uri.CREATOR), (Bundle) _Parcel.a(parcel, Bundle.CREATOR), ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zG0 ? 1 : 0);
                    return true;
                case 10:
                    boolean zU0 = u0(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zU0 ? 1 : 0);
                    return true;
                case 11:
                    boolean zT0 = t0(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), (Uri) _Parcel.a(parcel, Uri.CREATOR), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(zT0 ? 1 : 0);
                    return true;
                case 12:
                    ICustomTabsCallback iCustomTabsCallbackH12 = ICustomTabsCallback.Stub.h1(parcel.readStrongBinder());
                    boolean zK = k(parcel.readInt(), (Uri) _Parcel.a(parcel, Uri.CREATOR), (Bundle) _Parcel.a(parcel, Bundle.CREATOR), iCustomTabsCallbackH12);
                    parcel2.writeNoException();
                    parcel2.writeInt(zK ? 1 : 0);
                    return true;
                case 13:
                    f1(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 14:
                    n(ICustomTabsCallback.Stub.h1(parcel.readStrongBinder()), parcel.readStrongBinder(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class _Parcel {
        public static Object a(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static void b(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    boolean D(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean L(long j);

    int P(ICustomTabsCallback iCustomTabsCallback, String str, Bundle bundle);

    boolean S(ICustomTabsCallback iCustomTabsCallback);

    boolean U(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle, ArrayList arrayList);

    boolean Z0(ICustomTabsCallback iCustomTabsCallback, Uri uri);

    void f1(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);

    boolean g0(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback);

    boolean k(int i, Uri uri, Bundle bundle, ICustomTabsCallback iCustomTabsCallback);

    Bundle l(Bundle bundle, String str);

    void n(ICustomTabsCallback iCustomTabsCallback, IBinder iBinder, Bundle bundle);

    boolean t0(ICustomTabsCallback iCustomTabsCallback, Uri uri, Bundle bundle);

    boolean u0(ICustomTabsCallback iCustomTabsCallback, Bundle bundle);
}
