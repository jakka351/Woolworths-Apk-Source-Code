package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzgqh {
    private boolean zza;

    @Nullable
    private final zzgqs zzc;
    private final zzgqf zzb = zzgqf.zza;
    private zzgqi zzd = null;

    @Nullable
    private zzgqj zze = null;

    public /* synthetic */ zzgqh(zzgqs zzgqsVar, byte[] bArr) {
        this.zzc = zzgqsVar;
    }

    public final zzgqh zza() {
        zzgqj zzgqjVar = this.zze;
        if (zzgqjVar != null) {
            zzgqjVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzgqh zzb() {
        this.zzd = zzgqi.zza;
        return this;
    }

    public final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    public final /* synthetic */ void zzd(boolean z) {
        this.zza = false;
    }

    public final /* synthetic */ zzgqf zze() {
        return this.zzb;
    }

    public final /* synthetic */ zzgqs zzf() {
        return this.zzc;
    }

    public final /* synthetic */ zzgqi zzg() {
        return this.zzd;
    }

    public final /* synthetic */ zzgqj zzh() {
        return this.zze;
    }

    public final /* synthetic */ void zzi(zzgqj zzgqjVar) {
        this.zze = zzgqjVar;
    }
}
