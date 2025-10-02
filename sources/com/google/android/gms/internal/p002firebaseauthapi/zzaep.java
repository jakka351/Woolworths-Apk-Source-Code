package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzaep {

    @Nullable
    private String zza;

    @Nullable
    private String zzb;

    private zzaep() {
    }

    public static zzaep zza(String str) {
        zzaep zzaepVar = new zzaep();
        zzaepVar.zza = str;
        return zzaepVar;
    }

    public static zzaep zzb(String str) {
        zzaep zzaepVar = new zzaep();
        zzaepVar.zzb = str;
        return zzaepVar;
    }

    @Nullable
    public final String zza() {
        return this.zza;
    }

    @Nullable
    public final String zzb() {
        return this.zzb;
    }
}
