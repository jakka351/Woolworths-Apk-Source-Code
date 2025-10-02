package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface ICustomTabsCallback extends IInterface {
    public static final String T2 = "android$support$customtabs$ICustomTabsCallback".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements ICustomTabsCallback {
        @Override // android.support.customtabs.ICustomTabsCallback
        public final void O(int i, int i2, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void Q0(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void S0(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void V(int i, Bundle bundle) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void b1(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void c1(Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void e(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void e1(int i, Uri uri, boolean z, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final Bundle g(String str, Bundle bundle) {
            return null;
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void v0(String str, Bundle bundle) {
        }

        @Override // android.support.customtabs.ICustomTabsCallback
        public final void y0(Bundle bundle) {
        }
    }

    public static abstract class Stub extends Binder implements ICustomTabsCallback {

        public static class Proxy implements ICustomTabsCallback {
            public IBinder d;

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void O(int i, int i2, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(8, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void Q0(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(11, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void S0(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(12, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void V(int i, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    parcelObtain.writeInt(i);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void b1(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void c1(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void e(int i, int i2, int i3, int i4, int i5, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(10, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void e1(int i, Uri uri, boolean z, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    parcelObtain.writeInt(i);
                    _Parcel.b(parcelObtain, uri, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(6, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final Bundle g(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (Bundle) _Parcel.a(parcelObtain2, Bundle.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void v0(String str, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    parcelObtain.writeString(str);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.customtabs.ICustomTabsCallback
            public final void y0(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(ICustomTabsCallback.T2);
                    _Parcel.b(parcelObtain, bundle, 0);
                    this.d.transact(9, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static ICustomTabsCallback h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ICustomTabsCallback.T2);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof ICustomTabsCallback)) {
                return (ICustomTabsCallback) iInterfaceQueryLocalInterface;
            }
            Proxy proxy = new Proxy();
            proxy.d = iBinder;
            return proxy;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = ICustomTabsCallback.T2;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            switch (i) {
                case 2:
                    V(parcel.readInt(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 3:
                    v0(parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 4:
                    c1((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    b1(parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 6:
                    e1(parcel.readInt(), (Uri) _Parcel.a(parcel, Uri.CREATOR), parcel.readInt() != 0, (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 7:
                    Bundle bundleG = g(parcel.readString(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    parcel2.writeNoException();
                    _Parcel.b(parcel2, bundleG, 1);
                    return true;
                case 8:
                    O(parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 9:
                    y0((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 10:
                    e(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), (Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 11:
                    Q0((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
                    return true;
                case 12:
                    S0((Bundle) _Parcel.a(parcel, Bundle.CREATOR));
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

    void O(int i, int i2, Bundle bundle);

    void Q0(Bundle bundle);

    void S0(Bundle bundle);

    void V(int i, Bundle bundle);

    void b1(String str, Bundle bundle);

    void c1(Bundle bundle);

    void e(int i, int i2, int i3, int i4, int i5, Bundle bundle);

    void e1(int i, Uri uri, boolean z, Bundle bundle);

    Bundle g(String str, Bundle bundle);

    void v0(String str, Bundle bundle);

    void y0(Bundle bundle);
}
