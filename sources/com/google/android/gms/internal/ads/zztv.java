package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zztv implements zzva, zzrq {
    final /* synthetic */ zztx zza;
    private final Object zzb;
    private zzuz zzc;
    private zzrp zzd;

    public zztv(zztx zztxVar, Object obj) {
        Objects.requireNonNull(zztxVar);
        this.zza = zztxVar;
        this.zzc = zztxVar.zzf(null);
        this.zzd = zztxVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, @Nullable zzup zzupVar) {
        zzup zzupVarZzx;
        if (zzupVar != null) {
            zzupVarZzx = this.zza.zzx(this.zzb, zzupVar);
            if (zzupVarZzx == null) {
                return false;
            }
        } else {
            zzupVarZzx = null;
        }
        zztx zztxVar = this.zza;
        zztxVar.zzw(this.zzb, 0);
        zzuz zzuzVar = this.zzc;
        int i2 = zzuzVar.zza;
        if (!Objects.equals(zzuzVar.zzb, zzupVarZzx)) {
            this.zzc = zztxVar.zzg(0, zzupVarZzx);
        }
        zzrp zzrpVar = this.zzd;
        int i3 = zzrpVar.zza;
        if (Objects.equals(zzrpVar.zzb, zzupVarZzx)) {
            return true;
        }
        this.zzd = zztxVar.zzi(0, zzupVarZzx);
        return true;
    }

    private final zzul zzg(zzul zzulVar, @Nullable zzup zzupVar) {
        zztx zztxVar = this.zza;
        Object obj = this.zzb;
        zztxVar.zzy(obj, zzulVar.zzc, zzupVar);
        zztxVar.zzy(obj, zzulVar.zzd, zzupVar);
        return zzulVar;
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcT(int i, @Nullable zzup zzupVar, zzug zzugVar, zzul zzulVar, int i2) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzd(zzugVar, zzulVar, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcU(int i, @Nullable zzup zzupVar, zzug zzugVar, zzul zzulVar) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zze(zzugVar, zzulVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcV(int i, @Nullable zzup zzupVar, zzug zzugVar, zzul zzulVar) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzf(zzugVar, zzulVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcW(int i, @Nullable zzup zzupVar, zzug zzugVar, zzul zzulVar, IOException iOException, boolean z) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzg(zzugVar, zzulVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcX(int i, @Nullable zzup zzupVar, zzul zzulVar) {
        if (zzf(0, zzupVar)) {
            zzuz zzuzVar = this.zzc;
            zzg(zzulVar, zzupVar);
            zzuzVar.zzh(zzulVar);
        }
    }
}
