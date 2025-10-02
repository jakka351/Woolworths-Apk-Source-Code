package android.support.v4.os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.support.v4.os.IResultReceiver;
import androidx.annotation.RestrictTo;

@SuppressLint
@RestrictTo
/* loaded from: classes2.dex */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new AnonymousClass1();
    public IResultReceiver d;

    /* renamed from: android.support.v4.os.ResultReceiver$1, reason: invalid class name */
    public class AnonymousClass1 implements Parcelable.Creator<ResultReceiver> {
        @Override // android.os.Parcelable.Creator
        public final ResultReceiver createFromParcel(Parcel parcel) {
            IResultReceiver iResultReceiver;
            ResultReceiver resultReceiver = new ResultReceiver();
            IBinder strongBinder = parcel.readStrongBinder();
            int i = IResultReceiver.Stub.d;
            if (strongBinder == null) {
                iResultReceiver = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IResultReceiver.c3);
                if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResultReceiver)) {
                    IResultReceiver.Stub.Proxy proxy = new IResultReceiver.Stub.Proxy();
                    proxy.d = strongBinder;
                    iResultReceiver = proxy;
                } else {
                    iResultReceiver = (IResultReceiver) iInterfaceQueryLocalInterface;
                }
            }
            resultReceiver.d = iResultReceiver;
            return resultReceiver;
        }

        @Override // android.os.Parcelable.Creator
        public final ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    public class MyResultReceiver extends IResultReceiver.Stub {
        public MyResultReceiver() {
            attachInterface(this, IResultReceiver.c3);
        }

        @Override // android.support.v4.os.IResultReceiver
        public final void G(int i, Bundle bundle) {
            ResultReceiver.this.a(i, bundle);
        }
    }

    public class MyRunnable implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    public void a(int i, Bundle bundle) {
    }

    public final void b(int i, Bundle bundle) {
        IResultReceiver iResultReceiver = this.d;
        if (iResultReceiver != null) {
            try {
                iResultReceiver.G(i, bundle);
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            try {
                if (this.d == null) {
                    this.d = new MyResultReceiver();
                }
                parcel.writeStrongBinder(this.d.asBinder());
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
