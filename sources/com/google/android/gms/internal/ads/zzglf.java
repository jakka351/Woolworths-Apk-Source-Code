package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
final class zzglf extends zzgid {
    final transient zzght zza;

    public zzglf(Map map, zzght zzghtVar) {
        super(map);
        this.zza = zzghtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgid, com.google.android.gms.internal.ads.zzgiu
    public final /* bridge */ /* synthetic */ Collection zzc() {
        return (List) this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgiu, com.google.android.gms.internal.ads.zzgix
    public final Set zzh() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgiu, com.google.android.gms.internal.ads.zzgix
    public final Map zzl() {
        return zzm();
    }
}
