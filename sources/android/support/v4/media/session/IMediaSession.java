package android.support.v4.media.session;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaControllerCallback;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.List;

/* loaded from: classes2.dex */
public interface IMediaSession extends IInterface {

    public static abstract class Stub extends Binder implements IMediaSession {

        public static class Proxy implements IMediaSession {
            public IBinder d;

            @Override // android.support.v4.media.session.IMediaSession
            public final void H(IMediaControllerCallback iMediaControllerCallback) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.v4.media.session.IMediaSession");
                    parcelObtain.writeStrongBinder((IMediaControllerCallback.Stub) iMediaControllerCallback);
                    this.d.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.support.v4.media.session.IMediaSession
            public final boolean X0() {
                throw null;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.d;
            }
        }

        public static IMediaSession h1(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.v4.media.session.IMediaSession");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof IMediaSession)) {
                return (IMediaSession) iInterfaceQueryLocalInterface;
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
            IInterface iInterfaceQueryLocalInterface;
            IMediaControllerCallback iMediaControllerCallback = null;
            if (i == 51) {
                parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                if (parcel.readInt() != 0) {
                    RatingCompat.CREATOR.createFromParcel(parcel);
                }
                if (parcel.readInt() != 0) {
                }
                d1();
                throw null;
            }
            if (i == 1598968902) {
                parcel2.writeString("android.support.v4.media.session.IMediaSession");
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    y(parcel.readInt() != 0 ? MediaSessionCompat.ResultReceiverWrapper.CREATOR.createFromParcel(parcel) : null);
                    throw null;
                case 2:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                    }
                    X0();
                    throw null;
                case 3:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder strongBinder = parcel.readStrongBinder();
                    if (strongBinder != null) {
                        IInterface iInterfaceQueryLocalInterface2 = strongBinder.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback");
                        if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IMediaControllerCallback)) {
                            IMediaControllerCallback.Stub.Proxy proxy = new IMediaControllerCallback.Stub.Proxy();
                            proxy.d = strongBinder;
                            iMediaControllerCallback = proxy;
                        } else {
                            iMediaControllerCallback = (IMediaControllerCallback) iInterfaceQueryLocalInterface2;
                        }
                    }
                    H(iMediaControllerCallback);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    IBinder strongBinder2 = parcel.readStrongBinder();
                    if (strongBinder2 != null && (iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("android.support.v4.media.session.IMediaControllerCallback")) != null && (iInterfaceQueryLocalInterface instanceof IMediaControllerCallback)) {
                    }
                    k0();
                    throw null;
                case 5:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    I();
                    throw null;
                case 6:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    F();
                    throw null;
                case 7:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    b();
                    throw null;
                case 8:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    w();
                    throw null;
                case 9:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    t();
                    throw null;
                case 10:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    X();
                    throw null;
                case 11:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    p0();
                    throw null;
                case 12:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    parcel.readInt();
                    parcel.readString();
                    s0();
                    throw null;
                case 13:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    q();
                    throw null;
                case 14:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    h0();
                    throw null;
                case 15:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    u();
                    throw null;
                case 16:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                    }
                    if (parcel.readInt() != 0) {
                    }
                    z0();
                    throw null;
                case 17:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readLong();
                    n0();
                    throw null;
                case 18:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    pause();
                    throw null;
                case 19:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    stop();
                    throw null;
                case 20:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    next();
                    throw null;
                case 21:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    previous();
                    throw null;
                case 22:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    N0();
                    throw null;
                case 23:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    o();
                    throw null;
                case 24:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readLong();
                    B0();
                    throw null;
                case 25:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        RatingCompat.CREATOR.createFromParcel(parcel);
                    }
                    M();
                    throw null;
                case 26:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    D0();
                    throw null;
                case 27:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    getMetadata();
                    throw null;
                case 28:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    s();
                    throw null;
                case 29:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    List listY0 = Y0();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(listY0);
                    return true;
                case 30:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    J();
                    throw null;
                case 31:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    getExtras();
                    throw null;
                case 32:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    e0();
                    throw null;
                case 33:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    p();
                    throw null;
                case 34:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    o0();
                    throw null;
                case 35:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                    C();
                    throw null;
                case 36:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                    }
                    if (parcel.readInt() != 0) {
                    }
                    z();
                    throw null;
                case 37:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    r();
                    throw null;
                case 38:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 39:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    P0();
                    throw null;
                case 40:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    I0();
                    throw null;
                case 42:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    parcel.readInt();
                    v();
                    throw null;
                case 43:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    if (parcel.readInt() != 0) {
                        MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
                    }
                    O0();
                    throw null;
                case 44:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    x();
                    throw null;
                case 45:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    A();
                    throw null;
                case 46:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    f0();
                    throw null;
                case 47:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    w0();
                    throw null;
                case 48:
                    parcel.enforceInterface("android.support.v4.media.session.IMediaSession");
                    parcel.readInt();
                    K();
                    throw null;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    boolean A();

    void B0();

    void C();

    void D0();

    String F();

    void H(IMediaControllerCallback iMediaControllerCallback);

    boolean I();

    void I0();

    CharSequence J();

    void K();

    void M();

    void N0();

    void O0();

    void P0();

    ParcelableVolumeInfo X();

    boolean X0();

    List Y0();

    String b();

    void d1();

    int e0();

    void f0();

    Bundle getExtras();

    MediaMetadataCompat getMetadata();

    void h0();

    void k0();

    void n0();

    void next();

    void o();

    void o0();

    void p();

    void p0();

    void pause();

    void previous();

    void q();

    int r();

    PlaybackStateCompat s();

    void s0();

    void stop();

    long t();

    void u();

    void v();

    PendingIntent w();

    int w0();

    void x();

    void y(MediaSessionCompat.ResultReceiverWrapper resultReceiverWrapper);

    void z();

    void z0();
}
