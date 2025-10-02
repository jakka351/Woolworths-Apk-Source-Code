package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public final class zzahz {
    private final String zza;
    private final zzajg zzb;

    public zzahz(String str, zzajg zzajgVar) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = (zzajg) Preconditions.checkNotNull(zzajgVar);
    }

    public final zzajg zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }
}
