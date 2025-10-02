package com.google.android.play.core.review.internal;

import YU.a;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public abstract class zzg extends zzb implements zzh {
    @Override // com.google.android.play.core.review.internal.zzb
    public final boolean h1(int i, Parcel parcel) {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        int i2 = zzc.f14760a;
        Bundle bundle = (Bundle) (parcel.readInt() == 0 ? null : (Parcelable) creator.createFromParcel(parcel));
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(a.d(iDataAvail, "Parcel data not fully consumed, unread size: "));
        }
        zzb(bundle);
        return true;
    }
}
