package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzcie implements zzdhc {
    private final zzcih zza;
    private zzfaf zzb;
    private zzezj zzc;
    private zzdbs zzd;
    private zzcvb zze;
    private zzdgy zzf;
    private zzcoh zzg;

    public /* synthetic */ zzcie(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc, com.google.android.gms.internal.ads.zzcuy
    /* renamed from: zza */
    public final zzdhd zzh() {
        zzhqf.zzc(this.zzd, zzdbs.class);
        zzhqf.zzc(this.zze, zzcvb.class);
        zzhqf.zzc(this.zzf, zzdgy.class);
        zzhqf.zzc(this.zzg, zzcoh.class);
        return new zzcif(this.zza, this.zzg, this.zzf, new zzcry(), new zzfei(), new zzctz(), new zzdtb(), this.zzd, this.zze, zzehv.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    public final /* synthetic */ zzdhc zzb(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    public final /* synthetic */ zzdhc zzc(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    public final /* bridge */ /* synthetic */ zzdhc zzd(zzcoh zzcohVar) {
        this.zzg = zzcohVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    public final /* bridge */ /* synthetic */ zzdhc zze(zzdgy zzdgyVar) {
        this.zzf = zzdgyVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    public final /* bridge */ /* synthetic */ zzdhc zzf(zzcvb zzcvbVar) {
        this.zze = zzcvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc
    public final /* bridge */ /* synthetic */ zzdhc zzg(zzdbs zzdbsVar) {
        this.zzd = zzdbsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzi(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdhc, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzj(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }
}
