package com.google.android.gms.internal.p002firebaseauthapi;

import YU.a;

/* loaded from: classes5.dex */
final class zzan {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzan(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(this.zzb);
        return new IllegalArgumentException(a.p(a.v("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(this.zza), "=", String.valueOf(this.zzc)));
    }
}
