package com.google.android.gms.measurement;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzjp;
import com.google.android.gms.measurement.internal.zzjq;
import com.google.android.gms.measurement.internal.zzlk;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
final class zzb extends zzc {
    private final zzlk zza;

    public zzb(zzlk zzlkVar) {
        super(null);
        Preconditions.checkNotNull(zzlkVar);
        this.zza = zzlkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zza(String str, String str2, Bundle bundle) {
        this.zza.zza(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzb(String str, String str2, Bundle bundle, long j) {
        this.zza.zzb(str, str2, bundle, j);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Map zzc(boolean z) {
        return this.zza.zzd(null, null, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Map zzd(String str, String str2, boolean z) {
        return this.zza.zzd(str, str2, z);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zze(zzjp zzjpVar) {
        this.zza.zze(zzjpVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzf(zzjq zzjqVar) {
        this.zza.zzf(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzg(zzjq zzjqVar) {
        this.zza.zzg(zzjqVar);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzh() {
        return this.zza.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzj() {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final String zzk() {
        return this.zza.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzm(String str) {
        this.zza.zzm(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzn(String str) {
        this.zza.zzn(str);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzo(Bundle bundle) {
        this.zza.zzo(bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final void zzp(String str, String str2, Bundle bundle) {
        this.zza.zzp(str, str2, bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final List zzq(String str, String str2) {
        return this.zza.zzq(str, str2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final int zzr(String str) {
        return this.zza.zzr(str);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Boolean zzs() {
        return (Boolean) this.zza.zzx(4);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Integer zzt() {
        return (Integer) this.zza.zzx(3);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final String zzu() {
        return (String) this.zza.zzx(0);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Long zzv() {
        return (Long) this.zza.zzx(1);
    }

    @Override // com.google.android.gms.measurement.zzc
    public final Double zzw() {
        return (Double) this.zza.zzx(2);
    }

    @Override // com.google.android.gms.measurement.internal.zzlk
    public final Object zzx(int i) {
        return this.zza.zzx(i);
    }
}
