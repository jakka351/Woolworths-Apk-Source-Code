package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class zzxn {
    public static zzxn zzg(@NonNull Iterable iterable, int i, int i2, float f) {
        Iterator it = iterable.iterator();
        int iMax = 0;
        int iMin = i;
        int iMin2 = i2;
        int iMax2 = 0;
        while (it.hasNext()) {
            Point point = (Point) it.next();
            iMin = Math.min(iMin, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax = Math.max(iMax, point.x);
            iMax2 = Math.max(iMax2, point.y);
        }
        float f2 = i;
        float f3 = i2;
        return new zzxg((iMin + BitmapDescriptorFactory.HUE_RED) / f2, (iMin2 + BitmapDescriptorFactory.HUE_RED) / f3, (iMax + BitmapDescriptorFactory.HUE_RED) / f2, (iMax2 + BitmapDescriptorFactory.HUE_RED) / f3, BitmapDescriptorFactory.HUE_RED);
    }

    public abstract float zza();

    public abstract float zzb();

    public abstract float zzc();

    public abstract float zzd();

    public abstract float zze();

    public final float zzf() {
        if (!zzh()) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return (zzd() - zze()) * (zzb() - zzc());
    }

    public final boolean zzh() {
        return zzc() >= BitmapDescriptorFactory.HUE_RED && zzc() < zzb() && zzb() <= 1.0f && zze() >= BitmapDescriptorFactory.HUE_RED && zze() < zzd() && zzd() <= 1.0f;
    }
}
