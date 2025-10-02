package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes5.dex */
public final class zzesf implements zzeun {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final boolean zzd;
    private final boolean zze;

    public zzesf(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = z3;
        this.zze = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuu) obj).zza;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z = this.zzb;
        bundle.putInt("test_mode", z ? 1 : 0);
        boolean z2 = this.zzc;
        bundle.putInt("linked_device", z2 ? 1 : 0);
        if (z || z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjY)).booleanValue()) {
                bundle.putInt("risd", !this.zzd ? 1 : 0);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkc)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeun
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuu) obj).zzb;
        String str = this.zza;
        if (!str.isEmpty()) {
            bundle.putString("inspector_extras", str);
        }
        boolean z = this.zzb;
        bundle.putInt("test_mode", z ? 1 : 0);
        boolean z2 = this.zzc;
        bundle.putInt("linked_device", z2 ? 1 : 0);
        if (z || z2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkc)).booleanValue()) {
                bundle.putBoolean("collect_response_logs", this.zze);
            }
        }
    }
}
