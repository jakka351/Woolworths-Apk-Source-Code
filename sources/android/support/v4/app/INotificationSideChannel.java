package android.support.v4.app;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import io.jsonwebtoken.JwtParser;

@RestrictTo
/* loaded from: classes2.dex */
public interface INotificationSideChannel extends IInterface {
    public static final String a3 = "android$support$v4$app$INotificationSideChannel".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements INotificationSideChannel {
        @Override // android.support.v4.app.INotificationSideChannel
        public final void L0(String str) {
            throw null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public final void Y(String str, int i, String str2, Notification notification) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public final void i0(int i, String str, String str2) {
            throw null;
        }
    }

    public static abstract class Stub extends Binder implements INotificationSideChannel {

        public static class Proxy implements INotificationSideChannel {
            public IBinder d;

            @Override // android.support.v4.app.INotificationSideChannel
            public final void L0(String str) {
                throw null;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void Y(String str, int i, String str2, Notification notification) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(INotificationSideChannel.a3);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString("Medallia Digital Notifications Tag");
                    parcelObtain.writeInt(1);
                    notification.writeToParcel(parcelObtain, 0);
                    this.d.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public final void i0(int i, String str, String str2) {
                throw null;
            }
        }

        public static INotificationSideChannel h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.a3);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof INotificationSideChannel)) {
                return (INotificationSideChannel) iInterfaceQueryLocalInterface;
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
            String str = INotificationSideChannel.a3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                Y(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) (parcel.readInt() != 0 ? Notification.CREATOR.createFromParcel(parcel) : null));
                throw null;
            }
            if (i == 2) {
                i0(parcel.readInt(), parcel.readString(), parcel.readString());
                throw null;
            }
            if (i != 3) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            L0(parcel.readString());
            throw null;
        }
    }

    public static class _Parcel {
    }

    void L0(String str);

    void Y(String str, int i, String str2, Notification notification);

    void i0(int i, String str, String str2);
}
