package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class zzetn implements zzeun {
    private final String zza;
    private final int zzb;

    public zzetn(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        bundle.putString("request_id", this.zza);
        if (this.zzb == 2) {
            bundle.putInt("sod", 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuu) obj).zzb.putString("request_id", this.zza);
    }
}
