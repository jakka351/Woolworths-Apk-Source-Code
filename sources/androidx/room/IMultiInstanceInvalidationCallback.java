package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IMultiInstanceInvalidationCallback extends IInterface {
    public static final String k3 = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IMultiInstanceInvalidationCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // androidx.room.IMultiInstanceInvalidationCallback
        public final void f(String[] strArr) {
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationCallback {

        public static class Proxy implements IMultiInstanceInvalidationCallback {
            public IBinder d;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }

            @Override // androidx.room.IMultiInstanceInvalidationCallback
            public final void f(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationCallback.k3);
                    parcelObtain.writeStringArray(strArr);
                    this.d.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IMultiInstanceInvalidationCallback.k3;
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
            ((MultiInstanceInvalidationClient$callback$1) this).f(parcel.createStringArray());
            return true;
        }
    }

    void f(String[] strArr);
}
