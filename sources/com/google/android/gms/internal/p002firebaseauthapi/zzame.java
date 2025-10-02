package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzame<K, V> {
    public static <K, V> int zza(zzamd<K, V> zzamdVar, K k, V v) {
        return zzakx.zza(zzamdVar.zza, 1, k) + zzakx.zza(zzamdVar.zzc, 2, v);
    }

    public static <K, V> void zza(zzakn zzaknVar, zzamd<K, V> zzamdVar, K k, V v) throws IOException {
        zzakx.zza(zzaknVar, zzamdVar.zza, 1, k);
        zzakx.zza(zzaknVar, zzamdVar.zzc, 2, v);
    }
}
