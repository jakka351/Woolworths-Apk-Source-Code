package com.google.android.gms.internal.ads;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public final class zzayb {
    public static final /* synthetic */ int zza = 0;
    private static final ClassLoader zzb = zzayb.class.getClassLoader();

    private zzayb() {
    }

    public static boolean zza(Parcel parcel) {
        return parcel.readInt() != 0;
    }

    public static Parcelable zzb(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void zzc(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void zzd(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static void zze(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static ArrayList zzf(Parcel parcel) {
        return parcel.readArrayList(zzb);
    }

    public static HashMap zzg(Parcel parcel) {
        return parcel.readHashMap(zzb);
    }

    public static void zzh(Parcel parcel) {
        int iDataAvail = parcel.dataAvail();
        if (iDataAvail > 0) {
            throw new BadParcelableException(YU.a.n(new StringBuilder(String.valueOf(iDataAvail).length() + 45), "Parcel data not fully consumed, unread size: ", iDataAvail));
        }
    }
}
