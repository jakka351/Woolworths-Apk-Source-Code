package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class zzeuw implements zzeun {
    private final int zza;
    private final int zzb;

    public zzeuw(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        int i;
        Bundle bundle = ((zzcuu) obj).zza;
        int i2 = this.zza;
        if (i2 == -1 || (i = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        int i3 = com.google.android.gms.ads.internal.client.zzbb.zza;
        if (com.google.android.gms.ads.internal.client.zzbd.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
