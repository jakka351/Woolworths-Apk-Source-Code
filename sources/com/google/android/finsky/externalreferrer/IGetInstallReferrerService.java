package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.a.a;
import com.google.android.a.b;
import com.google.android.a.c;

/* loaded from: classes.dex */
public interface IGetInstallReferrerService extends IInterface {

    /* loaded from: classes2.dex */
    public static abstract class Stub extends b implements IGetInstallReferrerService {
        public static final /* synthetic */ int d = 0;

        public static class Proxy extends a implements IGetInstallReferrerService {
            @Override // com.google.android.finsky.externalreferrer.IGetInstallReferrerService
            public final Bundle c(Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                int i = c.f14385a;
                parcelObtain.writeInt(1);
                bundle.writeToParcel(parcelObtain, 0);
                parcelObtain = Parcel.obtain();
                try {
                    this.d.transact(1, parcelObtain, parcelObtain, 0);
                    parcelObtain.readException();
                    parcelObtain.recycle();
                    return (Bundle) (parcelObtain.readInt() == 0 ? null : (Parcelable) Bundle.CREATOR.createFromParcel(parcelObtain));
                } catch (RuntimeException e) {
                    throw e;
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        @Override // com.google.android.a.b
        public final boolean h1(int i, Parcel parcel, Parcel parcel2) {
            if (i != 1) {
                return false;
            }
            Parcelable.Creator creator = Bundle.CREATOR;
            int i2 = c.f14385a;
            Bundle bundleC = c((Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel)));
            parcel2.writeNoException();
            if (bundleC == null) {
                parcel2.writeInt(0);
                return true;
            }
            parcel2.writeInt(1);
            bundleC.writeToParcel(parcel2, 1);
            return true;
        }
    }

    Bundle c(Bundle bundle);
}
