package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class zzkz implements zzkr {
    public final zzuk zza;
    public int zzd;
    public boolean zze;
    public final List zzc = new ArrayList();
    public final Object zzb = new Object();

    public zzkz(zzur zzurVar, boolean z) {
        this.zza = new zzuk(zzurVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final Object zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkr
    public final zzbe zzb() {
        return this.zza.zzz();
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
