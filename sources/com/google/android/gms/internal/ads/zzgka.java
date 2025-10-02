package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzgka {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzgka(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        int length3 = strValueOf3.length();
        StringBuilder sb = new StringBuilder(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.a(length, 33, length2, 5, length3) + 1 + strValueOf4.length());
        androidx.constraintlayout.core.state.a.B(sb, "Multiple entries with same key: ", strValueOf, "=", strValueOf2);
        return new IllegalArgumentException(androidx.constraintlayout.core.state.a.l(sb, " and ", strValueOf3, "=", strValueOf4));
    }
}
