package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzems implements zzeun {

    @Nullable
    private final String zza;

    public zzems(@Nullable String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (str != null) {
            zzcuuVar.zza.putString("arek", str);
        }
    }
}
