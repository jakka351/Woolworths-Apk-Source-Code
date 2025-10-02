package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* loaded from: classes5.dex */
final class zzgjn extends zzgjp {
    public zzgjn() {
        super(null);
    }

    public static final zzgjp zzf(int i) {
        return i < 0 ? zzgjp.zzb : i > 0 ? zzgjp.zzc : zzgjp.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zza(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzb(int i, int i2) {
        return zzf(Integer.compare(i, i2));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzc(boolean z, boolean z2) {
        return zzf(Boolean.compare(z2, z));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final zzgjp zzd(boolean z, boolean z2) {
        return zzf(Boolean.compare(z, z2));
    }

    @Override // com.google.android.gms.internal.ads.zzgjp
    public final int zze() {
        return 0;
    }
}
