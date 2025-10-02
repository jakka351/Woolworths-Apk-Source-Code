package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public final class zzd {
    public final int zza = 0;

    public zzd(int i, float f) {
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzd.class == obj.getClass()) {
            if (Float.compare(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(BitmapDescriptorFactory.HUE_RED) + 16337;
    }
}
