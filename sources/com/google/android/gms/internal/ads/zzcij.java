package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes.dex */
final class zzcij implements zzcnx {
    private final zzcih zza;
    private zzfaf zzb;
    private zzezj zzc;
    private zzdbs zzd;
    private zzcvb zze;

    public /* synthetic */ zzcij(zzcih zzcihVar, byte[] bArr) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx, com.google.android.gms.internal.ads.zzcuy
    /* renamed from: zza */
    public final zzcny zzh() {
        zzhqf.zzc(this.zzd, zzdbs.class);
        zzhqf.zzc(this.zze, zzcvb.class);
        return new zzcik(this.zza, new zzcry(), new zzfei(), new zzctz(), new zzdtb(), this.zzd, this.zze, zzehv.zza(), null, this.zzb, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final /* synthetic */ zzcnx zzb(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final /* synthetic */ zzcnx zzc(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final /* bridge */ /* synthetic */ zzcnx zzd(zzcvb zzcvbVar) {
        this.zze = zzcvbVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx
    public final /* bridge */ /* synthetic */ zzcnx zze(zzdbs zzdbsVar) {
        this.zzd = zzdbsVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzi(@Nullable zzezj zzezjVar) {
        this.zzc = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcnx, com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzj(@Nullable zzfaf zzfafVar) {
        this.zzb = zzfafVar;
        return this;
    }
}
