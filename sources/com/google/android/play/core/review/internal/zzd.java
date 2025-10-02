package com.google.android.play.core.review.internal;

import android.os.Bundle;
import android.os.Parcel;

/* loaded from: classes6.dex */
public final class zzd extends zza implements zzf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.review.internal.zzf
    public final void g1(String str, Bundle bundle, zzh zzhVar) {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
        parcelObtain.writeString(str);
        int i = zzc.f14760a;
        parcelObtain.writeInt(1);
        bundle.writeToParcel(parcelObtain, 0);
        parcelObtain.writeStrongBinder(zzhVar);
        try {
            this.d.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }
}
