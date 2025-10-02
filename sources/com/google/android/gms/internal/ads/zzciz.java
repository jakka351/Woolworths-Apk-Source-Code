package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzciz implements zzdgg {
    private final zzcih zza;
    private zzfaf zzb;
    private zzezj zzc;
    private zzdbs zzd;
    private zzcvb zze;
    private zzejp zzf;

    public /* synthetic */ zzciz(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg, com.google.android.gms.internal.ads.zzcuy
    /* renamed from: zza */
    public final zzdgh zzh() {
        zzhqf.zzc(this.zzd, zzdbs.class);
        zzhqf.zzc(this.zze, zzcvb.class);
        zzhqf.zzc(this.zzf, zzejp.class);
        return new zzcja(this.zza, new zzcry(), new zzfei(), new zzctz(), new zzdtb(), this.zzd, this.zze, zzehv.zza(), this.zzf, null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* synthetic */ zzdgg zzb(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* synthetic */ zzdgg zzc(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* bridge */ /* synthetic */ zzdgg zzd(zzejp zzejpVar) {
        this.zzf = zzejpVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* bridge */ /* synthetic */ zzdgg zze(zzcvb zzcvbVar) {
        this.zze = zzcvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg
    public final /* bridge */ /* synthetic */ zzdgg zzf(zzdbs zzdbsVar) {
        this.zzd = zzdbsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzi(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdgg, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzj(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }
}
