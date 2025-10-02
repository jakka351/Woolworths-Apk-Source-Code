package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzerq implements zzeun {

    @Nullable
    private final Integer zza;

    public zzerq(@Nullable Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        zzcuu zzcuuVar = (zzcuu) obj;
        if (num != null) {
            zzcuuVar.zza.putInt("dspct", Math.min(num.intValue(), 20));
        }
    }
}
