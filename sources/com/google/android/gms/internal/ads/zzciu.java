package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzciu implements zzdtw {
    private final zzcih zza;
    private final zzcix zzb;
    private Long zzc;
    private String zzd;

    public /* synthetic */ zzciu(zzcih zzcihVar, zzcix zzcixVar, byte[] bArr) {
        this.zza = zzcihVar;
        this.zzb = zzcixVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdtw
    public final zzdtx zza() {
        zzhqf.zzc(this.zzc, Long.class);
        zzhqf.zzc(this.zzd, String.class);
        return new zzciv(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzdtw
    public final /* bridge */ /* synthetic */ zzdtw zzb(String str) {
        str.getClass();
        this.zzd = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdtw
    public final /* bridge */ /* synthetic */ zzdtw zzc(long j) {
        this.zzc = Long.valueOf(j);
        return this;
    }
}
