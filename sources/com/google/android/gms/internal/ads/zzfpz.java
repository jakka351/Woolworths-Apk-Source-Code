package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzfpz extends Exception {
    private final int zza;

    public zzfpz(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzfpz(int i, Throwable th) {
        super(th);
        this.zza = i;
    }
}
