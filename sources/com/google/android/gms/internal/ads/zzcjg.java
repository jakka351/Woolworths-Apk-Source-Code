package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzcjg implements zzdoq {
    private final zzcih zza;
    private zzfaf zzb;
    private zzezj zzc;
    private zzdbs zzd;
    private zzcvb zze;

    public /* synthetic */ zzcjg(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdoq, com.google.android.gms.internal.ads.zzcuy
    /* renamed from: zza */
    public final zzdor zzh() {
        zzhqf.zzc(this.zzd, zzdbs.class);
        zzhqf.zzc(this.zze, zzcvb.class);
        return new zzcjh(this.zza, new zzcry(), new zzfei(), new zzctz(), new zzdtb(), this.zzd, this.zze, zzehv.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdoq
    public final /* synthetic */ zzdoq zzb(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoq
    public final /* synthetic */ zzdoq zzc(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoq
    public final /* bridge */ /* synthetic */ zzdoq zzd(zzcvb zzcvbVar) {
        this.zze = zzcvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoq
    public final /* bridge */ /* synthetic */ zzdoq zze(zzdbs zzdbsVar) {
        this.zzd = zzdbsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoq, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzi(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoq, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzj(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }
}
