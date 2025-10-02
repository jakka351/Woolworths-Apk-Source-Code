package androidx.core.app.unusedapprestrictions;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface IUnusedAppRestrictionsBackportCallback extends IInterface {
    public static final String f3 = "androidx$core$app$unusedapprestrictions$IUnusedAppRestrictionsBackportCallback".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IUnusedAppRestrictionsBackportCallback {
        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IUnusedAppRestrictionsBackportCallback {

        public static class Proxy implements IUnusedAppRestrictionsBackportCallback {
            public IBinder d;

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = IUnusedAppRestrictionsBackportCallback.f3;
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
            A0(parcel.readInt() != 0, parcel.readInt() != 0);
            throw null;
        }
    }

    void A0(boolean z, boolean z2);
}
