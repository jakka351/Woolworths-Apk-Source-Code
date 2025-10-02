package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public class zzdwz extends Exception {
    private final int zza;

    public zzdwz(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdwz(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdwz(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
