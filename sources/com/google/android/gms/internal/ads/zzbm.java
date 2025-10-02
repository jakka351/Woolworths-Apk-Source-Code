package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzbm {
    public static final zzbm zza = new zzbm(zzgjz.zzi());
    private final zzgjz zzb;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
    }

    public zzbm(List list) {
        this.zzb = zzgjz.zzq(list);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzbm.class != obj.getClass()) {
            return false;
        }
        return this.zzb.equals(((zzbm) obj).zzb);
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final zzgjz zza() {
        return this.zzb;
    }

    public final boolean zzb(int i) {
        int i2 = 0;
        while (true) {
            zzgjz zzgjzVar = this.zzb;
            if (i2 >= zzgjzVar.size()) {
                return false;
            }
            zzbl zzblVar = (zzbl) zzgjzVar.get(i2);
            if (zzblVar.zzb() && zzblVar.zzd() == i) {
                return true;
            }
            i2++;
        }
    }
}
