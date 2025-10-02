package android.support.v4.os;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IResultReceiver2 extends IInterface {
    public static final String b3 = "android$support$v4$os$IResultReceiver2".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IResultReceiver2 {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IResultReceiver2 {

        public static class Proxy implements IResultReceiver2 {
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
            String str = IResultReceiver2.b3;
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
            parcel.readInt();
            R();
            return true;
        }
    }

    public static class _Parcel {
    }

    void R();
}
