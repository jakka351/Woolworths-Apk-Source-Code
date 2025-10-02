package com.google.android.gms.internal.ads;

import com.medallia.digital.mobilesdk.q2;

/* loaded from: classes5.dex */
public final class zzanr {
    private final String zza;
    private final int zzb;
    private final int zzc;
    private int zzd;
    private String zze;

    public zzanr(int i, int i2, int i3) {
        this.zza = i != Integer.MIN_VALUE ? YU.a.m(new StringBuilder(String.valueOf(i).length() + 1), i, q2.c) : "";
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = Integer.MIN_VALUE;
        this.zze = "";
    }

    private final void zzd() {
        if (this.zzd == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final void zza() {
        int i = this.zzd;
        int i2 = i == Integer.MIN_VALUE ? this.zzb : i + this.zzc;
        this.zzd = i2;
        String str = this.zza;
        this.zze = YU.a.n(new StringBuilder(str.length() + String.valueOf(i2).length()), str, i2);
    }

    public final int zzb() {
        zzd();
        return this.zzd;
    }

    public final String zzc() {
        zzd();
        return this.zze;
    }
}
