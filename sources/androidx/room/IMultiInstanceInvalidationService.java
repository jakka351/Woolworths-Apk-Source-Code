package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RestrictTo;
import androidx.room.IMultiInstanceInvalidationCallback;
import io.jsonwebtoken.JwtParser;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo
/* loaded from: classes2.dex */
public interface IMultiInstanceInvalidationService extends IInterface {
    public static final String l3 = "androidx$room$IMultiInstanceInvalidationService".replace('$', JwtParser.SEPARATOR_CHAR);

    public static class Default implements IMultiInstanceInvalidationService {
        @Override // androidx.room.IMultiInstanceInvalidationService
        public final void E0(int i, String[] strArr) {
        }

        @Override // android.os.IInterface
        public final IBinder asBinder() {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IMultiInstanceInvalidationService {
        public static final /* synthetic */ int d = 0;

        public static class Proxy implements IMultiInstanceInvalidationService {
            public IBinder d;

            @Override // androidx.room.IMultiInstanceInvalidationService
            public final void E0(int i, String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IMultiInstanceInvalidationService.l3);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.d.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

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
            String str = IMultiInstanceInvalidationService.l3;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            IMultiInstanceInvalidationCallback callback = null;
            IMultiInstanceInvalidationCallback callback2 = null;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return super.onTransact(i, parcel, parcel2, i2);
                    }
                    ((MultiInstanceInvalidationService$binder$1) this).E0(parcel.readInt(), parcel.createStringArray());
                    return true;
                }
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IMultiInstanceInvalidationCallback.k3);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IMultiInstanceInvalidationCallback)) {
                        IMultiInstanceInvalidationCallback.Stub.Proxy proxy = new IMultiInstanceInvalidationCallback.Stub.Proxy();
                        proxy.d = strongBinder;
                        callback2 = proxy;
                    } else {
                        callback2 = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface;
                    }
                }
                int i3 = parcel.readInt();
                Intrinsics.h(callback2, "callback");
                MultiInstanceInvalidationService multiInstanceInvalidationService = ((MultiInstanceInvalidationService$binder$1) this).e;
                synchronized (multiInstanceInvalidationService.f) {
                    multiInstanceInvalidationService.f.unregister(callback2);
                }
                parcel2.writeNoException();
                return true;
            }
            IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface(IMultiInstanceInvalidationCallback.k3);
                if (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof IMultiInstanceInvalidationCallback)) {
                    IMultiInstanceInvalidationCallback.Stub.Proxy proxy2 = new IMultiInstanceInvalidationCallback.Stub.Proxy();
                    proxy2.d = strongBinder2;
                    callback = proxy2;
                } else {
                    callback = (IMultiInstanceInvalidationCallback) iInterfaceQueryLocalInterface2;
                }
            }
            String string = parcel.readString();
            MultiInstanceInvalidationService$binder$1 multiInstanceInvalidationService$binder$1 = (MultiInstanceInvalidationService$binder$1) this;
            Intrinsics.h(callback, "callback");
            int i4 = 0;
            if (string != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = multiInstanceInvalidationService$binder$1.e;
                synchronized (multiInstanceInvalidationService2.f) {
                    try {
                        int i5 = multiInstanceInvalidationService2.d + 1;
                        multiInstanceInvalidationService2.d = i5;
                        if (multiInstanceInvalidationService2.f.register(callback, Integer.valueOf(i5))) {
                            multiInstanceInvalidationService2.e.put(Integer.valueOf(i5), string);
                            i4 = i5;
                        } else {
                            multiInstanceInvalidationService2.d--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i4);
            return true;
        }
    }

    void E0(int i, String[] strArr);
}
