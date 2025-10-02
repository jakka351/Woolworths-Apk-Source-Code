package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgzt extends RuntimeException {
    public zzgzt(String str) {
        super(str);
    }

    public static Object zza(zzgzs zzgzsVar) {
        try {
            return zzgzsVar.zza();
        } catch (Exception e) {
            throw new zzgzt(e);
        }
    }

    public zzgzt(String str, Throwable th) {
        super(str, th);
    }

    public zzgzt(Throwable th) {
        super(th);
    }
}
