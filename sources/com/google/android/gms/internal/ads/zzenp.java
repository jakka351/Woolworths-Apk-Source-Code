package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzenp implements zzeun {

    @Nullable
    private final String zza;
    private final boolean zzb;

    public zzenp(@Nullable String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        String str = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (str != null) {
            Bundle bundleZza = zzfdr.zza(zzcuuVar.zza, "pii");
            bundleZza.putString("afai", str);
            bundleZza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
