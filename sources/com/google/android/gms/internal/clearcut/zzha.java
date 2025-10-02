package com.google.android.gms.internal.clearcut;

import androidx.compose.ui.input.pointer.a;
import com.google.android.gms.internal.clearcut.zzge;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzha extends zzfu<zzha> implements Cloneable {
    private byte[] zzbjn;
    private zzge.zzd zzbjo;
    public byte[] zzbjp;
    private String zzbjq;
    private String zzbjr;
    private zzgy zzbjs;
    private String zzbjt;
    public long zzbju;
    private zzgz zzbjv;
    public byte[] zzbjw;
    private String zzbjx;
    private int zzbjy;
    private int[] zzbjz;
    private long zzbka;
    private zzge.zzs zzbkb;
    public boolean zzbkc;
    public long zzbjf = 0;
    public long zzbjg = 0;
    private long zzbjh = 0;
    private String tag = "";
    public int zzbji = 0;
    private String zzbjj = "";
    private int zzbjk = 0;
    private boolean zzbjl = false;
    private zzhb[] zzbjm = zzhb.zzge();

    public zzha() {
        byte[] bArr = zzgb.zzse;
        this.zzbjn = bArr;
        this.zzbjo = null;
        this.zzbjp = bArr;
        this.zzbjq = "";
        this.zzbjr = "";
        this.zzbjs = null;
        this.zzbjt = "";
        this.zzbju = 180000L;
        this.zzbjv = null;
        this.zzbjw = bArr;
        this.zzbjx = "";
        this.zzbjy = 0;
        this.zzbjz = zzgb.zzrx;
        this.zzbka = 0L;
        this.zzbkb = null;
        this.zzbkc = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: zzgd, reason: merged with bridge method [inline-methods] */
    public final zzha clone() {
        try {
            zzha zzhaVar = (zzha) super.clone();
            zzhb[] zzhbVarArr = this.zzbjm;
            if (zzhbVarArr != null && zzhbVarArr.length > 0) {
                zzhaVar.zzbjm = new zzhb[zzhbVarArr.length];
                int i = 0;
                while (true) {
                    zzhb[] zzhbVarArr2 = this.zzbjm;
                    if (i >= zzhbVarArr2.length) {
                        break;
                    }
                    zzhb zzhbVar = zzhbVarArr2[i];
                    if (zzhbVar != null) {
                        zzhaVar.zzbjm[i] = (zzhb) zzhbVar.clone();
                    }
                    i++;
                }
            }
            zzge.zzd zzdVar = this.zzbjo;
            if (zzdVar != null) {
                zzhaVar.zzbjo = zzdVar;
            }
            zzgy zzgyVar = this.zzbjs;
            if (zzgyVar != null) {
                zzhaVar.zzbjs = (zzgy) zzgyVar.clone();
            }
            zzgz zzgzVar = this.zzbjv;
            if (zzgzVar != null) {
                zzhaVar.zzbjv = (zzgz) zzgzVar.clone();
            }
            int[] iArr = this.zzbjz;
            if (iArr != null && iArr.length > 0) {
                zzhaVar.zzbjz = (int[]) iArr.clone();
            }
            zzge.zzs zzsVar = this.zzbkb;
            if (zzsVar != null) {
                zzhaVar.zzbkb = zzsVar;
            }
            return zzhaVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzha)) {
            return false;
        }
        zzha zzhaVar = (zzha) obj;
        if (this.zzbjf != zzhaVar.zzbjf || this.zzbjg != zzhaVar.zzbjg) {
            return false;
        }
        String str = this.tag;
        if (str == null) {
            if (zzhaVar.tag != null) {
                return false;
            }
        } else if (!str.equals(zzhaVar.tag)) {
            return false;
        }
        if (this.zzbji != zzhaVar.zzbji) {
            return false;
        }
        String str2 = this.zzbjj;
        if (str2 == null) {
            if (zzhaVar.zzbjj != null) {
                return false;
            }
        } else if (!str2.equals(zzhaVar.zzbjj)) {
            return false;
        }
        if (!zzfy.equals(this.zzbjm, zzhaVar.zzbjm) || !Arrays.equals(this.zzbjn, zzhaVar.zzbjn)) {
            return false;
        }
        zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar == null) {
            if (zzhaVar.zzbjo != null) {
                return false;
            }
        } else if (!zzdVar.equals(zzhaVar.zzbjo)) {
            return false;
        }
        if (!Arrays.equals(this.zzbjp, zzhaVar.zzbjp)) {
            return false;
        }
        String str3 = this.zzbjq;
        if (str3 == null) {
            if (zzhaVar.zzbjq != null) {
                return false;
            }
        } else if (!str3.equals(zzhaVar.zzbjq)) {
            return false;
        }
        String str4 = this.zzbjr;
        if (str4 == null) {
            if (zzhaVar.zzbjr != null) {
                return false;
            }
        } else if (!str4.equals(zzhaVar.zzbjr)) {
            return false;
        }
        zzgy zzgyVar = this.zzbjs;
        if (zzgyVar == null) {
            if (zzhaVar.zzbjs != null) {
                return false;
            }
        } else if (!zzgyVar.equals(zzhaVar.zzbjs)) {
            return false;
        }
        String str5 = this.zzbjt;
        if (str5 == null) {
            if (zzhaVar.zzbjt != null) {
                return false;
            }
        } else if (!str5.equals(zzhaVar.zzbjt)) {
            return false;
        }
        if (this.zzbju != zzhaVar.zzbju) {
            return false;
        }
        zzgz zzgzVar = this.zzbjv;
        if (zzgzVar == null) {
            if (zzhaVar.zzbjv != null) {
                return false;
            }
        } else if (!zzgzVar.equals(zzhaVar.zzbjv)) {
            return false;
        }
        if (!Arrays.equals(this.zzbjw, zzhaVar.zzbjw)) {
            return false;
        }
        String str6 = this.zzbjx;
        if (str6 == null) {
            if (zzhaVar.zzbjx != null) {
                return false;
            }
        } else if (!str6.equals(zzhaVar.zzbjx)) {
            return false;
        }
        if (!zzfy.equals(this.zzbjz, zzhaVar.zzbjz)) {
            return false;
        }
        zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar == null) {
            if (zzhaVar.zzbkb != null) {
                return false;
            }
        } else if (!zzsVar.equals(zzhaVar.zzbkb)) {
            return false;
        }
        if (this.zzbkc != zzhaVar.zzbkc) {
            return false;
        }
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            return this.zzrj.equals(zzhaVar.zzrj);
        }
        zzfw zzfwVar2 = zzhaVar.zzrj;
        return zzfwVar2 == null || zzfwVar2.isEmpty();
    }

    public final int hashCode() {
        long j = this.zzbjf;
        long j2 = this.zzbjg;
        int i = (((553293672 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961;
        String str = this.tag;
        int iHashCode = 0;
        int iHashCode2 = (((i + (str == null ? 0 : str.hashCode())) * 31) + this.zzbji) * 31;
        String str2 = this.zzbjj;
        int iHashCode3 = Arrays.hashCode(this.zzbjn) + ((((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961) + 1237) * 31) + zzfy.hashCode(this.zzbjm)) * 31);
        zzge.zzd zzdVar = this.zzbjo;
        int iD = a.d(((iHashCode3 * 31) + (zzdVar == null ? 0 : zzdVar.hashCode())) * 31, 31, this.zzbjp);
        String str3 = this.zzbjq;
        int iHashCode4 = (iD + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zzbjr;
        int iHashCode5 = iHashCode4 + (str4 == null ? 0 : str4.hashCode());
        zzgy zzgyVar = this.zzbjs;
        int iHashCode6 = ((iHashCode5 * 31) + (zzgyVar == null ? 0 : zzgyVar.hashCode())) * 31;
        String str5 = this.zzbjt;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        long j3 = this.zzbju;
        zzgz zzgzVar = this.zzbjv;
        int iD2 = a.d((((iHashCode7 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (zzgzVar == null ? 0 : zzgzVar.hashCode())) * 31, 31, this.zzbjw);
        String str6 = this.zzbjx;
        int iHashCode8 = zzfy.hashCode(this.zzbjz) + ((iD2 + (str6 == null ? 0 : str6.hashCode())) * 961);
        zzge.zzs zzsVar = this.zzbkb;
        int iHashCode9 = ((((iHashCode8 * 961) + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31) + (this.zzbkc ? 1231 : 1237)) * 31;
        zzfw zzfwVar = this.zzrj;
        if (zzfwVar != null && !zzfwVar.isEmpty()) {
            iHashCode = this.zzrj.hashCode();
        }
        return iHashCode9 + iHashCode;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final void zza(zzfs zzfsVar) throws IOException {
        long j = this.zzbjf;
        if (j != 0) {
            zzfsVar.zzi(1, j);
        }
        String str = this.tag;
        if (str != null && !str.equals("")) {
            zzfsVar.zza(2, this.tag);
        }
        zzhb[] zzhbVarArr = this.zzbjm;
        int i = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzhb[] zzhbVarArr2 = this.zzbjm;
                if (i2 >= zzhbVarArr2.length) {
                    break;
                }
                zzhb zzhbVar = zzhbVarArr2[i2];
                if (zzhbVar != null) {
                    zzfsVar.zza(3, zzhbVar);
                }
                i2++;
            }
        }
        byte[] bArr = this.zzbjn;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            zzfsVar.zza(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            zzfsVar.zza(6, this.zzbjp);
        }
        zzgy zzgyVar = this.zzbjs;
        if (zzgyVar != null) {
            zzfsVar.zza(7, zzgyVar);
        }
        String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            zzfsVar.zza(8, this.zzbjq);
        }
        zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar != null) {
            zzfsVar.zze(9, zzdVar);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            zzfsVar.zzc(11, i3);
        }
        String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            zzfsVar.zza(13, this.zzbjr);
        }
        String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            zzfsVar.zza(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            zzfsVar.zzb(15, 0);
            zzfsVar.zzn(zzfs.zzj(j2));
        }
        zzgz zzgzVar = this.zzbjv;
        if (zzgzVar != null) {
            zzfsVar.zza(16, zzgzVar);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            zzfsVar.zzi(17, j3);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            zzfsVar.zza(18, this.zzbjw);
        }
        int[] iArr = this.zzbjz;
        if (iArr != null && iArr.length > 0) {
            while (true) {
                int[] iArr2 = this.zzbjz;
                if (i >= iArr2.length) {
                    break;
                }
                zzfsVar.zzc(20, iArr2[i]);
                i++;
            }
        }
        zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar != null) {
            zzfsVar.zze(23, zzsVar);
        }
        String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            zzfsVar.zza(24, this.zzbjx);
        }
        boolean z = this.zzbkc;
        if (z) {
            zzfsVar.zzb(25, z);
        }
        String str6 = this.zzbjj;
        if (str6 != null && !str6.equals("")) {
            zzfsVar.zza(26, this.zzbjj);
        }
        super.zza(zzfsVar);
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    public final int zzen() {
        int[] iArr;
        int iZzen = super.zzen();
        long j = this.zzbjf;
        if (j != 0) {
            iZzen += zzfs.zzd(1, j);
        }
        String str = this.tag;
        if (str != null && !str.equals("")) {
            iZzen += zzfs.zzb(2, this.tag);
        }
        zzhb[] zzhbVarArr = this.zzbjm;
        int i = 0;
        if (zzhbVarArr != null && zzhbVarArr.length > 0) {
            int i2 = 0;
            while (true) {
                zzhb[] zzhbVarArr2 = this.zzbjm;
                if (i2 >= zzhbVarArr2.length) {
                    break;
                }
                zzhb zzhbVar = zzhbVarArr2[i2];
                if (zzhbVar != null) {
                    iZzen = zzfs.zzb(3, zzhbVar) + iZzen;
                }
                i2++;
            }
        }
        byte[] bArr = this.zzbjn;
        byte[] bArr2 = zzgb.zzse;
        if (!Arrays.equals(bArr, bArr2)) {
            iZzen += zzfs.zzb(4, this.zzbjn);
        }
        if (!Arrays.equals(this.zzbjp, bArr2)) {
            iZzen += zzfs.zzb(6, this.zzbjp);
        }
        zzgy zzgyVar = this.zzbjs;
        if (zzgyVar != null) {
            iZzen += zzfs.zzb(7, zzgyVar);
        }
        String str2 = this.zzbjq;
        if (str2 != null && !str2.equals("")) {
            iZzen += zzfs.zzb(8, this.zzbjq);
        }
        zzge.zzd zzdVar = this.zzbjo;
        if (zzdVar != null) {
            iZzen += zzbn.zzc(9, zzdVar);
        }
        int i3 = this.zzbji;
        if (i3 != 0) {
            iZzen += zzfs.zzs(i3) + zzfs.zzr(11);
        }
        String str3 = this.zzbjr;
        if (str3 != null && !str3.equals("")) {
            iZzen += zzfs.zzb(13, this.zzbjr);
        }
        String str4 = this.zzbjt;
        if (str4 != null && !str4.equals("")) {
            iZzen += zzfs.zzb(14, this.zzbjt);
        }
        long j2 = this.zzbju;
        if (j2 != 180000) {
            iZzen += zzfs.zzo(zzfs.zzj(j2)) + zzfs.zzr(15);
        }
        zzgz zzgzVar = this.zzbjv;
        if (zzgzVar != null) {
            iZzen += zzfs.zzb(16, zzgzVar);
        }
        long j3 = this.zzbjg;
        if (j3 != 0) {
            iZzen += zzfs.zzd(17, j3);
        }
        if (!Arrays.equals(this.zzbjw, bArr2)) {
            iZzen += zzfs.zzb(18, this.zzbjw);
        }
        int[] iArr2 = this.zzbjz;
        if (iArr2 != null && iArr2.length > 0) {
            int iZzs = 0;
            while (true) {
                iArr = this.zzbjz;
                if (i >= iArr.length) {
                    break;
                }
                iZzs += zzfs.zzs(iArr[i]);
                i++;
            }
            iZzen = iZzen + iZzs + (iArr.length * 2);
        }
        zzge.zzs zzsVar = this.zzbkb;
        if (zzsVar != null) {
            iZzen += zzbn.zzc(23, zzsVar);
        }
        String str5 = this.zzbjx;
        if (str5 != null && !str5.equals("")) {
            iZzen += zzfs.zzb(24, this.zzbjx);
        }
        if (this.zzbkc) {
            iZzen += zzfs.zzr(25) + 1;
        }
        String str6 = this.zzbjj;
        return (str6 == null || str6.equals("")) ? iZzen : zzfs.zzb(26, this.zzbjj) + iZzen;
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu
    /* renamed from: zzeo */
    public final /* synthetic */ zzfu clone() throws CloneNotSupportedException {
        return (zzha) clone();
    }

    @Override // com.google.android.gms.internal.clearcut.zzfu, com.google.android.gms.internal.clearcut.zzfz
    /* renamed from: zzep */
    public final /* synthetic */ zzfz clone() throws CloneNotSupportedException {
        return (zzha) clone();
    }
}
