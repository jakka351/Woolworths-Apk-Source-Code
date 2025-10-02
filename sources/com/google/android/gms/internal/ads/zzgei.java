package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzgei extends zzgeq {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final zzgeq zza(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final zzgeq zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgeq
    public final zzger zzc() {
        return new zzgej(this.zza, this.zzb, null);
    }
}
