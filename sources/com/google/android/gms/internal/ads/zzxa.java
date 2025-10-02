package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Objects;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

/* loaded from: classes5.dex */
final class zzxa extends zzxv implements Comparable {
    private final int zze;
    private final boolean zzf;

    @Nullable
    private final String zzg;
    private final zzxo zzh;
    private final boolean zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;
    private final int zzo;
    private final int zzp;
    private final boolean zzq;
    private final int zzr;
    private final int zzs;
    private final int zzt;
    private final int zzu;
    private final boolean zzv;
    private final boolean zzw;
    private final boolean zzx;

    public zzxa(int i, zzbf zzbfVar, int i2, zzxo zzxoVar, int i3, boolean z, zzghd zzghdVar, int i4) {
        int i5;
        int iZzj;
        int iHashCode;
        int iZzj2;
        boolean z2;
        super(i, zzbfVar, i2);
        this.zzh = zzxoVar;
        int i6 = 1;
        int i7 = true != zzxoVar.zzT ? 16 : 24;
        this.zzg = zzyd.zzi(this.zzd.zzd);
        this.zzi = zzln.zzZ(i3, false);
        int i8 = 0;
        while (true) {
            i5 = Integer.MAX_VALUE;
            if (i8 >= zzxoVar.zzq.size()) {
                iZzj = 0;
                i8 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj = zzyd.zzj(this.zzd, (String) zzxoVar.zzq.get(i8), false);
                if (iZzj > 0) {
                    break;
                } else {
                    i8++;
                }
            }
        }
        this.zzk = i8;
        this.zzj = iZzj;
        this.zzl = zzyd.zzm(this.zzd.zzf, 0);
        this.zzm = zzyd.zzn(this.zzd, zzxoVar.zzr);
        zzu zzuVar = this.zzd;
        int i9 = zzuVar.zzf;
        this.zzn = i9 == 0 || (i9 & 1) != 0;
        this.zzq = 1 == (zzuVar.zze & 1);
        String str = zzuVar.zzo;
        this.zzx = str != null && ((iHashCode = str.hashCode()) == -2123537834 ? str.equals("audio/eac3-joc") : !(iHashCode == 187078297 ? !str.equals("audio/ac4") : !(iHashCode == 1504698186 && str.equals("audio/iamf"))));
        int i10 = zzuVar.zzG;
        this.zzr = i10;
        this.zzs = zzuVar.zzH;
        int i11 = zzuVar.zzj;
        this.zzt = i11;
        this.zzf = (i11 == -1 || i11 <= zzxoVar.zzu) && (i10 == -1 || i10 <= zzxoVar.zzt) && zzghdVar.zza(zzuVar);
        String str2 = zzeo.zza;
        String[] strArrSplit = Resources.getSystem().getConfiguration().getLocales().toLanguageTags().split(",", -1);
        for (int i12 = 0; i12 < strArrSplit.length; i12++) {
            strArrSplit[i12] = zzeo.zzh(strArrSplit[i12]);
        }
        int i13 = 0;
        while (true) {
            if (i13 >= strArrSplit.length) {
                iZzj2 = 0;
                i13 = Integer.MAX_VALUE;
                break;
            } else {
                iZzj2 = zzyd.zzj(this.zzd, strArrSplit[i13], false);
                if (iZzj2 > 0) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        this.zzo = i13;
        this.zzp = iZzj2;
        int i14 = 0;
        while (true) {
            if (i14 >= zzxoVar.zzv.size()) {
                break;
            }
            String str3 = this.zzd.zzo;
            if (str3 != null && str3.equals(zzxoVar.zzv.get(i14))) {
                i5 = i14;
                break;
            }
            i14++;
        }
        this.zzu = i5;
        this.zzv = (i3 & KyberEngine.KyberPolyBytes) == 128;
        this.zzw = (i3 & 64) == 64;
        zzxo zzxoVar2 = this.zzh;
        if (zzln.zzZ(i3, zzxoVar2.zzV) && ((z2 = this.zzf) || zzxoVar2.zzO)) {
            int i15 = zzxoVar2.zzw.zzb;
            if (zzln.zzZ(i3, false) && z2 && this.zzd.zzj != -1 && ((zzxoVar2.zzX || !z) && (i7 & i3) != 0)) {
                i6 = 2;
            }
        } else {
            i6 = 0;
        }
        this.zze = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxa zzxaVar) {
        boolean z = this.zzf;
        zzglj zzgljVarZza = (z && this.zzi) ? zzyd.zzc : zzyd.zzc.zza();
        zzgjp zzgjpVarZza = zzgjp.zzg().zzd(this.zzi, zzxaVar.zzi).zza(Integer.valueOf(this.zzk), Integer.valueOf(zzxaVar.zzk), zzglj.zzb().zza()).zzb(this.zzj, zzxaVar.zzj).zzb(this.zzl, zzxaVar.zzl).zza(Integer.valueOf(this.zzm), Integer.valueOf(zzxaVar.zzm), zzglj.zzb().zza()).zzd(this.zzq, zzxaVar.zzq).zzd(this.zzn, zzxaVar.zzn).zza(Integer.valueOf(this.zzo), Integer.valueOf(zzxaVar.zzo), zzglj.zzb().zza()).zzb(this.zzp, zzxaVar.zzp).zzd(z, zzxaVar.zzf).zza(Integer.valueOf(this.zzu), Integer.valueOf(zzxaVar.zzu), zzglj.zzb().zza());
        boolean z2 = this.zzh.zzF;
        zzgjp zzgjpVarZza2 = zzgjpVarZza.zzd(this.zzv, zzxaVar.zzv).zzd(this.zzw, zzxaVar.zzw).zzd(this.zzx, zzxaVar.zzx).zza(Integer.valueOf(this.zzr), Integer.valueOf(zzxaVar.zzr), zzgljVarZza).zza(Integer.valueOf(this.zzs), Integer.valueOf(zzxaVar.zzs), zzgljVarZza);
        if (Objects.equals(this.zzg, zzxaVar.zzg)) {
            zzgjpVarZza2 = zzgjpVarZza2.zza(Integer.valueOf(this.zzt), Integer.valueOf(zzxaVar.zzt), zzgljVarZza);
        }
        return zzgjpVarZza2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        String str;
        int i;
        zzxa zzxaVar = (zzxa) zzxvVar;
        boolean z = this.zzh.zzR;
        zzu zzuVar = this.zzd;
        int i2 = zzuVar.zzG;
        if (i2 == -1) {
            return false;
        }
        zzu zzuVar2 = zzxaVar.zzd;
        return i2 == zzuVar2.zzG && (str = zzuVar.zzo) != null && TextUtils.equals(str, zzuVar2.zzo) && (i = zzuVar.zzH) != -1 && i == zzuVar2.zzH && this.zzv == zzxaVar.zzv && this.zzw == zzxaVar.zzw;
    }
}
