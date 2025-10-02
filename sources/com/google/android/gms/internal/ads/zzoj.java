package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class zzoj implements zzmd {
    private final zzdb zza;
    private final zzbc zzb;
    private final zzbd zzc;
    private final zzoi zzd;
    private final SparseArray zze;
    private zzdr zzf;
    private zzba zzg;
    private zzdl zzh;
    private boolean zzi;

    public zzoj(zzdb zzdbVar) {
        zzdbVar.getClass();
        this.zza = zzdbVar;
        this.zzf = new zzdr(zzeo.zze(), zzdbVar, zzoh.zza);
        zzbc zzbcVar = new zzbc();
        this.zzb = zzbcVar;
        this.zzc = new zzbd();
        this.zzd = new zzoi(zzbcVar);
        this.zze = new SparseArray();
    }

    private final zzme zzad(@Nullable zzup zzupVar) {
        this.zzg.getClass();
        zzbe zzbeVarZze = zzupVar == null ? null : this.zzd.zze(zzupVar);
        if (zzupVar != null && zzbeVarZze != null) {
            return zzaa(zzbeVarZze, zzbeVarZze.zzo(zzupVar.zza, this.zzb).zzc, zzupVar);
        }
        int iZzq = this.zzg.zzq();
        zzbe zzbeVarZzo = this.zzg.zzo();
        if (iZzq >= zzbeVarZzo.zza()) {
            zzbeVarZzo = zzbe.zza;
        }
        return zzaa(zzbeVarZzo, iZzq, null);
    }

    private final zzme zzae() {
        return zzad(this.zzd.zzb());
    }

    private final zzme zzaf() {
        return zzad(this.zzd.zzc());
    }

    private final zzme zzag(int i, @Nullable zzup zzupVar) {
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        if (zzupVar != null) {
            return this.zzd.zze(zzupVar) != null ? zzad(zzupVar) : zzaa(zzbe.zza, i, zzupVar);
        }
        zzbe zzbeVarZzo = zzbaVar.zzo();
        if (i >= zzbeVarZzo.zza()) {
            zzbeVarZzo = zzbe.zza;
        }
        return zzaa(zzbeVarZzo, i, null);
    }

    private final zzme zzah(@Nullable zzat zzatVar) {
        zzup zzupVar;
        return (!(zzatVar instanceof zzhz) || (zzupVar = ((zzhz) zzatVar).zzh) == null) ? zzZ() : zzad(zzupVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzA() {
        if (this.zzi) {
            return;
        }
        final zzme zzmeVarZzZ = zzZ();
        this.zzi = true;
        zzY(zzmeVarZzZ, -1, new zzdm(zzmeVarZzZ) { // from class: com.google.android.gms.internal.ads.zznd
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzB(final int i, final int i2, final boolean z) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1033, new zzdm(zzmeVarZzaf, i, i2, z) { // from class: com.google.android.gms.internal.ads.zzno
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzC(final zzhr zzhrVar) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1007, new zzdm(zzmeVarZzaf, zzhrVar) { // from class: com.google.android.gms.internal.ads.zznz
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzD(final String str, final long j, final long j2) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1008, new zzdm(zzmeVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzoc
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzE(final zzu zzuVar, @Nullable final zzhs zzhsVar) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1009, new zzdm() { // from class: com.google.android.gms.internal.ads.zzod
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzk(zzmeVarZzaf, zzuVar, zzhsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzF(final long j) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1010, new zzdm(zzmeVarZzaf, j) { // from class: com.google.android.gms.internal.ads.zzoe
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzG(final int i, final long j, final long j2) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1011, new zzdm(zzmeVarZzaf, i, j, j2) { // from class: com.google.android.gms.internal.ads.zzof
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzH(final String str) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1012, new zzdm(zzmeVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzog
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzI(final zzhr zzhrVar) {
        final zzme zzmeVarZzae = zzae();
        zzY(zzmeVarZzae, 1013, new zzdm(zzmeVarZzae, zzhrVar) { // from class: com.google.android.gms.internal.ads.zzmi
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzJ(final Exception exc) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1014, new zzdm(zzmeVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmj
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzK(final Exception exc) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1029, new zzdm(zzmeVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmk
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzL(final zzpw zzpwVar) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1031, new zzdm(zzmeVarZzaf, zzpwVar) { // from class: com.google.android.gms.internal.ads.zzml
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzM(final zzpw zzpwVar) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1032, new zzdm(zzmeVarZzaf, zzpwVar) { // from class: com.google.android.gms.internal.ads.zzmm
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzN(final zzhr zzhrVar) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1015, new zzdm(zzmeVarZzaf, zzhrVar) { // from class: com.google.android.gms.internal.ads.zzmo
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzO(final String str, final long j, final long j2) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1016, new zzdm(zzmeVarZzaf, str, j2, j) { // from class: com.google.android.gms.internal.ads.zzmp
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzP(final zzu zzuVar, @Nullable final zzhs zzhsVar) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1017, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmq
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzl(zzmeVarZzaf, zzuVar, zzhsVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzQ(final int i, final long j) {
        final zzme zzmeVarZzae = zzae();
        zzY(zzmeVarZzae, 1018, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmr
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzm(zzmeVarZzae, i, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzR(final String str) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1019, new zzdm(zzmeVarZzaf, str) { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzS(final zzhr zzhrVar) {
        final zzme zzmeVarZzae = zzae();
        zzY(zzmeVarZzae, 1020, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmu
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdm(zzmeVarZzae, zzhrVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzT(final Object obj, final long j) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 26, new zzdm() { // from class: com.google.android.gms.internal.ads.zzmv
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj2) {
                ((zzmg) obj2).zzo(zzmeVarZzaf, obj, j);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzU(final long j, final int i) {
        final zzme zzmeVarZzae = zzae();
        zzY(zzmeVarZzae, 1021, new zzdm(zzmeVarZzae, j, i) { // from class: com.google.android.gms.internal.ads.zzmw
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzV(final Exception exc) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 1030, new zzdm(zzmeVarZzaf, exc) { // from class: com.google.android.gms.internal.ads.zzmx
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzW(final int i) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 1034, new zzdm(zzmeVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzmy
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzyt
    public final void zzX(final int i, final long j, final long j2) {
        final zzme zzmeVarZzad = zzad(this.zzd.zzd());
        zzY(zzmeVarZzad, 1006, new zzdm() { // from class: com.google.android.gms.internal.ads.zzoa
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdl(zzmeVarZzad, i, j, j2);
            }
        });
    }

    public final void zzY(zzme zzmeVar, int i, zzdm zzdmVar) {
        this.zze.put(i, zzmeVar);
        zzdr zzdrVar = this.zzf;
        zzdrVar.zzd(i, zzdmVar);
        zzdrVar.zze();
    }

    public final zzme zzZ() {
        return zzad(this.zzd.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zza(zzba zzbaVar, zzax zzaxVar) {
    }

    @RequiresNonNull
    public final zzme zzaa(zzbe zzbeVar, int i, @Nullable zzup zzupVar) {
        zzup zzupVar2 = true == zzbeVar.zzg() ? null : zzupVar;
        long jZzb = this.zza.zzb();
        boolean z = zzbeVar.equals(this.zzg.zzo()) && i == this.zzg.zzq();
        long jZzp = 0;
        if (zzupVar2 == null || !zzupVar2.zzb()) {
            if (z) {
                jZzp = this.zzg.zzy();
            } else if (!zzbeVar.zzg()) {
                long j = zzbeVar.zzb(i, this.zzc, 0L).zzl;
                jZzp = zzeo.zzp(0L);
            }
        } else if (z && this.zzg.zzw() == zzupVar2.zzb && this.zzg.zzx() == zzupVar2.zzc) {
            jZzp = this.zzg.zzs();
        }
        return new zzme(jZzb, zzbeVar, i, zzupVar2, jZzp, this.zzg.zzo(), this.zzg.zzq(), this.zzd.zza(), this.zzg.zzs(), this.zzg.zzu());
    }

    public final /* synthetic */ void zzab(zzba zzbaVar, zzmg zzmgVar, zzr zzrVar) {
        zzmgVar.zzdn(zzbaVar, new zzmf(zzrVar, this.zze));
    }

    public final /* synthetic */ void zzac() {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 1028, new zzdm(zzmeVarZzZ) { // from class: com.google.android.gms.internal.ads.zzob
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
        this.zzf.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzb(zzbe zzbeVar, final int i) {
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        this.zzd.zzg(zzbaVar);
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 0, new zzdm(zzmeVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zzng
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzc(@Nullable final zzaj zzajVar, final int i) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 1, new zzdm(zzmeVarZzZ, zzajVar, i) { // from class: com.google.android.gms.internal.ads.zznh
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcT(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final int i2) {
        final zzme zzmeVarZzag = zzag(i, zzupVar);
        zzY(zzmeVarZzag, 1000, new zzdm(zzmeVarZzag, zzugVar, zzulVar, i2) { // from class: com.google.android.gms.internal.ads.zzna
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcU(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final zzme zzmeVarZzag = zzag(i, zzupVar);
        zzY(zzmeVarZzag, 1001, new zzdm(zzmeVarZzag, zzugVar, zzulVar) { // from class: com.google.android.gms.internal.ads.zznb
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcV(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar) {
        final zzme zzmeVarZzag = zzag(i, zzupVar);
        zzY(zzmeVarZzag, 1002, new zzdm(zzmeVarZzag, zzugVar, zzulVar) { // from class: com.google.android.gms.internal.ads.zznc
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcW(int i, @Nullable zzup zzupVar, final zzug zzugVar, final zzul zzulVar, final IOException iOException, final boolean z) {
        final zzme zzmeVarZzag = zzag(i, zzupVar);
        zzY(zzmeVarZzag, 1003, new zzdm() { // from class: com.google.android.gms.internal.ads.zzne
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzh(zzmeVarZzag, zzugVar, zzulVar, iOException, z);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzva
    public final void zzcX(int i, @Nullable zzup zzupVar, final zzul zzulVar) {
        final zzme zzmeVarZzag = zzag(i, zzupVar);
        zzY(zzmeVarZzag, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new zzdm() { // from class: com.google.android.gms.internal.ads.zznf
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdk(zzmeVarZzag, zzulVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzd(final zzbm zzbmVar) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 2, new zzdm(zzmeVarZzZ, zzbmVar) { // from class: com.google.android.gms.internal.ads.zzni
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zze(final zzam zzamVar) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 14, new zzdm(zzmeVarZzZ, zzamVar) { // from class: com.google.android.gms.internal.ads.zznv
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzf(final boolean z) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 3, new zzdm(zzmeVarZzZ, z) { // from class: com.google.android.gms.internal.ads.zznj
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzg(final zzaw zzawVar) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 13, new zzdm(zzmeVarZzZ, zzawVar) { // from class: com.google.android.gms.internal.ads.zznk
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzh(final boolean z, final int i) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, -1, new zzdm(zzmeVarZzZ, z, i) { // from class: com.google.android.gms.internal.ads.zznl
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzi(final int i) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 4, new zzdm() { // from class: com.google.android.gms.internal.ads.zznm
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zze(zzmeVarZzZ, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzj(final boolean z, final int i) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 5, new zzdm(zzmeVarZzZ, z, i) { // from class: com.google.android.gms.internal.ads.zznn
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzk(final int i) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 6, new zzdm(zzmeVarZzZ, i) { // from class: com.google.android.gms.internal.ads.zznp
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzl(final boolean z) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 7, new zzdm(zzmeVarZzZ, z) { // from class: com.google.android.gms.internal.ads.zznq
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzm(final zzat zzatVar) {
        final zzme zzmeVarZzah = zzah(zzatVar);
        zzY(zzmeVarZzah, 10, new zzdm() { // from class: com.google.android.gms.internal.ads.zznr
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzg(zzmeVarZzah, zzatVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzn(@Nullable final zzat zzatVar) {
        final zzme zzmeVarZzah = zzah(zzatVar);
        zzY(zzmeVarZzah, 10, new zzdm(zzmeVarZzah, zzatVar) { // from class: com.google.android.gms.internal.ads.zzns
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzo(final zzaz zzazVar, final zzaz zzazVar2, final int i) {
        if (i == 1) {
            this.zzi = false;
            i = 1;
        }
        zzoi zzoiVar = this.zzd;
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        zzoiVar.zzf(zzbaVar);
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 11, new zzdm() { // from class: com.google.android.gms.internal.ads.zznt
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                ((zzmg) obj).zzdj(zzmeVarZzZ, zzazVar, zzazVar2, i);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzp(final zzau zzauVar) {
        final zzme zzmeVarZzZ = zzZ();
        zzY(zzmeVarZzZ, 12, new zzdm(zzmeVarZzZ, zzauVar) { // from class: com.google.android.gms.internal.ads.zznu
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzq(final int i) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 21, new zzdm(zzmeVarZzaf, i) { // from class: com.google.android.gms.internal.ads.zznx
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzr(final float f) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 22, new zzdm(zzmeVarZzaf, f) { // from class: com.google.android.gms.internal.ads.zzmn
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzs(final boolean z) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 23, new zzdm(zzmeVarZzaf, z) { // from class: com.google.android.gms.internal.ads.zznw
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzt(final zzbu zzbuVar) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 25, new zzdm() { // from class: com.google.android.gms.internal.ads.zzny
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
                zzme zzmeVar = zzmeVarZzaf;
                zzbu zzbuVar2 = zzbuVar;
                ((zzmg) obj).zzp(zzmeVar, zzbuVar2);
                int i = zzbuVar2.zzb;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzay
    public final void zzu(final int i, final int i2) {
        final zzme zzmeVarZzaf = zzaf();
        zzY(zzmeVarZzaf, 24, new zzdm(zzmeVarZzaf, i, i2) { // from class: com.google.android.gms.internal.ads.zzmz
            @Override // com.google.android.gms.internal.ads.zzdm
            public final /* synthetic */ void zza(Object obj) {
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    @CallSuper
    public final void zzv(zzmg zzmgVar) {
        this.zzf.zzb(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    @CallSuper
    public final void zzw(zzmg zzmgVar) {
        this.zzf.zzc(zzmgVar);
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    @CallSuper
    public final void zzx(final zzba zzbaVar, Looper looper) {
        boolean z = true;
        if (this.zzg != null && !this.zzd.zzi().isEmpty()) {
            z = false;
        }
        zzghc.zzh(z);
        zzbaVar.getClass();
        this.zzg = zzbaVar;
        this.zzh = this.zza.zzd(looper, null);
        this.zzf = this.zzf.zza(looper, new zzdn() { // from class: com.google.android.gms.internal.ads.zzmh
            @Override // com.google.android.gms.internal.ads.zzdn
            public final /* synthetic */ void zza(Object obj, zzr zzrVar) {
                this.zza.zzab(zzbaVar, (zzmg) obj, zzrVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    @CallSuper
    public final void zzy() {
        zzdl zzdlVar = this.zzh;
        zzdlVar.getClass();
        zzdlVar.zzm(new Runnable() { // from class: com.google.android.gms.internal.ads.zzms
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzac();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzmd
    public final void zzz(List list, @Nullable zzup zzupVar) {
        zzba zzbaVar = this.zzg;
        zzbaVar.getClass();
        this.zzd.zzh(list, zzupVar, zzbaVar);
    }
}
