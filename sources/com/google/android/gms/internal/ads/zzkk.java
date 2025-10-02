package com.google.android.gms.internal.ads;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes5.dex */
public final class zzkk {
    private long zza;
    private float zzb;
    private long zzc;

    public zzkk() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    public final zzkk zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzkk zzb(float f) {
        boolean z = true;
        if (f <= BitmapDescriptorFactory.HUE_RED && f != -3.4028235E38f) {
            z = false;
        }
        zzghc.zza(z);
        this.zzb = f;
        return this;
    }

    public final zzkk zzc(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzghc.zza(z);
        this.zzc = j;
        return this;
    }

    public final zzkl zzd() {
        return new zzkl(this, null);
    }

    public final /* synthetic */ long zze() {
        return this.zza;
    }

    public final /* synthetic */ float zzf() {
        return this.zzb;
    }

    public final /* synthetic */ long zzg() {
        return this.zzc;
    }

    public /* synthetic */ zzkk(zzkl zzklVar, byte[] bArr) {
        this.zza = zzklVar.zza;
        this.zzb = zzklVar.zzb;
        this.zzc = zzklVar.zzc;
    }
}
