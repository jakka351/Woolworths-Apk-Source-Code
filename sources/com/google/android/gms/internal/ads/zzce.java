package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzce extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzce(String str, zzcc zzccVar) {
        String strValueOf = String.valueOf(zzccVar);
        super(YU.a.p(new StringBuilder(str.length() + 1 + strValueOf.length()), str, " ", strValueOf));
    }
}
