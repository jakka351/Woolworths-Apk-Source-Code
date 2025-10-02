package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzxt extends zzxv implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzxt(int i, zzbf zzbfVar, int i2, zzxo zzxoVar, int i3, @Nullable String str, @Nullable String str2) {
        int iZzj;
        super(i, zzbfVar, i2);
        int i4 = 0;
        this.zzf = zzln.zzZ(i3, false);
        int i5 = this.zzd.zze;
        int i6 = zzxoVar.zzC;
        this.zzg = 1 == (i5 & 1);
        this.zzh = (i5 & 2) != 0;
        zzgjz zzgjzVarZzj = str2 != null ? zzgjz.zzj(str2) : zzxoVar.zzy.isEmpty() ? zzgjz.zzj("") : zzxoVar.zzy;
        int i7 = 0;
        while (true) {
            if (i7 >= zzgjzVarZzj.size()) {
                iZzj = 0;
                i7 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzyd.zzj(this.zzd, (String) zzgjzVarZzj.get(i7), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.zzi = i7;
        this.zzj = iZzj;
        int iZzm = zzyd.zzm(this.zzd.zzf, str2 != null ? 1088 : 0);
        this.zzk = iZzm;
        zzu zzuVar = this.zzd;
        this.zzn = (1088 & zzuVar.zzf) != 0;
        int iZzn = zzyd.zzn(zzuVar, zzxoVar.zzz);
        this.zzl = iZzn;
        int iZzj2 = zzyd.zzj(this.zzd, str, zzyd.zzi(str) == null);
        this.zzm = iZzj2;
        boolean z = iZzj > 0 || (zzxoVar.zzy.isEmpty() && iZzm > 0) || ((zzxoVar.zzy.isEmpty() && iZzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && iZzj2 > 0));
        if (zzln.zzZ(i3, zzxoVar.zzV) && z) {
            i4 = 1;
        }
        this.zze = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxt zzxtVar) {
        zzgjp zzgjpVarZza = zzgjp.zzg().zzd(this.zzf, zzxtVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzxtVar.zzi), zzglj.zzb().zza());
        int i = this.zzj;
        zzgjp zzgjpVarZzb = zzgjpVarZza.zzb(i, zzxtVar.zzj);
        int i2 = this.zzk;
        zzgjp zzgjpVarZzb2 = zzgjpVarZzb.zzb(i2, zzxtVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzxtVar.zzl), zzglj.zzb().zza()).zzd(this.zzg, zzxtVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxtVar.zzh), i == 0 ? zzglj.zzb() : zzglj.zzb().zza()).zzb(this.zzm, zzxtVar.zzm);
        if (i2 == 0) {
            zzgjpVarZzb2 = zzgjpVarZzb2.zzc(this.zzn, zzxtVar.zzn);
        }
        return zzgjpVarZzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        return false;
    }
}
