package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class zzerm implements zzeun {
    public final String zza;
    public final boolean zzb;

    public zzerm(String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        bundle.putString("gct", this.zza);
        if (this.zzb) {
            bundle.putString("de", "1");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuu) obj).zzb.putString("gct", this.zza);
    }
}
