package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzqb extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzu zzc;

    public zzqb(int i, zzu zzuVar, boolean z) {
        super(YU.a.n(new StringBuilder(String.valueOf(i).length() + 25), "AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzuVar;
    }
}
