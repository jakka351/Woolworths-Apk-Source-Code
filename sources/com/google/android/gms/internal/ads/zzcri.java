package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzcri {
    private final zzfcu zza;
    private final zzfcj zzb;
    private final String zzc;

    public zzcri(zzfcu zzfcuVar, zzfcj zzfcjVar, @Nullable String str) {
        this.zza = zzfcuVar;
        this.zzb = zzfcjVar;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfcu zza() {
        return this.zza;
    }

    public final zzfcj zzb() {
        return this.zzb;
    }

    public final zzfcm zzc() {
        return this.zza.zzb.zzb;
    }

    public final String zzd() {
        return this.zzc;
    }
}
