package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class zzu {
    public static final /* synthetic */ int zzO = 0;
    public final int zzA;
    public final float zzB;

    @Nullable
    public final byte[] zzC;
    public final int zzD;

    @Nullable
    public final zzh zzE;
    public final int zzF;
    public final int zzG;
    public final int zzH;
    public final int zzI;
    public final int zzJ;
    public final int zzK;
    public final int zzL;
    public final int zzM;
    public final int zzN;
    private int zzP;

    @Nullable
    public final String zza;

    @Nullable
    public final String zzb;
    public final List zzc;

    @Nullable
    public final String zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;

    @Nullable
    public final String zzk;

    @Nullable
    public final zzao zzl;

    @Nullable
    public final Object zzm;

    @Nullable
    public final String zzn;

    @Nullable
    public final String zzo;
    public final int zzp;
    public final int zzq;
    public final List zzr;

    @Nullable
    public final zzp zzs;
    public final long zzt;
    public final boolean zzu;
    public final int zzv;
    public final int zzw;
    public final int zzx;
    public final int zzy;
    public final float zzz;

    static {
        new zzu(new zzs());
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(35, 36);
        Integer.toString(36, 36);
    }

    public /* synthetic */ zzu(zzs zzsVar, byte[] bArr) {
        this(zzsVar);
    }

    public static String zze(@Nullable zzu zzuVar) {
        String str;
        int i;
        int i2;
        StringBuilder sbS = YU.a.s("id=");
        sbS.append(zzuVar.zza);
        sbS.append(", mimeType=");
        sbS.append(zzuVar.zzo);
        String str2 = zzuVar.zzn;
        if (str2 != null) {
            sbS.append(", container=");
            sbS.append(str2);
        }
        int i3 = zzuVar.zzj;
        if (i3 != -1) {
            sbS.append(", bitrate=");
            sbS.append(i3);
        }
        String str3 = zzuVar.zzk;
        if (str3 != null) {
            sbS.append(", codecs=");
            sbS.append(str3);
        }
        zzp zzpVar = zzuVar.zzs;
        if (zzpVar != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i4 = 0; i4 < zzpVar.zzb; i4++) {
                UUID uuid = zzpVar.zza(i4).zza;
                if (uuid.equals(zzf.zzb)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(zzf.zzc)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(zzf.zze)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(zzf.zzd)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(zzf.zza)) {
                    linkedHashSet.add("universal");
                } else {
                    String string = uuid.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 10);
                    sb.append("unknown (");
                    sb.append(string);
                    sb.append(")");
                    linkedHashSet.add(sb.toString());
                }
            }
            sbS.append(", drm=[");
            zzggw.zzb(sbS, linkedHashSet, ",");
            sbS.append(']');
        }
        int i5 = zzuVar.zzv;
        if (i5 != -1 && (i2 = zzuVar.zzw) != -1) {
            androidx.constraintlayout.core.state.a.t(i5, i2, ", res=", "x", sbS);
        }
        int i6 = zzuVar.zzx;
        if (i6 != -1 && (i = zzuVar.zzy) != -1) {
            androidx.constraintlayout.core.state.a.t(i6, i, ", decRes=", "x", sbS);
        }
        float f = zzuVar.zzB;
        int i7 = zzgmu.zza;
        double d = f;
        if (Math.copySign((-1.0d) + d, 1.0d) > 0.001d && d != 1.0d && (!Double.isNaN(d) || !Double.isNaN(1.0d))) {
            sbS.append(", par=");
            Object[] objArr = {Float.valueOf(f)};
            String str4 = zzeo.zza;
            sbS.append(String.format(Locale.US, "%.3f", objArr));
        }
        zzh zzhVar = zzuVar.zzE;
        if (zzhVar != null && (zzhVar.zze() || zzhVar.zzf())) {
            sbS.append(", color=");
            sbS.append(zzhVar.zzg());
        }
        float f2 = zzuVar.zzz;
        if (f2 != -1.0f) {
            sbS.append(", fps=");
            sbS.append(f2);
        }
        int i8 = zzuVar.zzF;
        if (i8 != -1) {
            sbS.append(", maxSubLayers=");
            sbS.append(i8);
        }
        int i9 = zzuVar.zzG;
        if (i9 != -1) {
            sbS.append(", channels=");
            sbS.append(i9);
        }
        int i10 = zzuVar.zzH;
        if (i10 != -1) {
            sbS.append(", sample_rate=");
            sbS.append(i10);
        }
        String str5 = zzuVar.zzd;
        if (str5 != null) {
            sbS.append(", language=");
            sbS.append(str5);
        }
        List list = zzuVar.zzc;
        if (!list.isEmpty()) {
            sbS.append(", labels=[");
            zzggw.zzb(sbS, zzgkp.zzc(list, zzt.zza), ",");
            sbS.append("]");
        }
        int i11 = zzuVar.zze;
        if (i11 != 0) {
            sbS.append(", selectionFlags=[");
            String str6 = zzeo.zza;
            ArrayList arrayList = new ArrayList();
            if ((i11 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i11 & 2) != 0) {
                arrayList.add("forced");
            }
            zzggw.zzb(sbS, arrayList, ",");
            sbS.append("]");
        }
        int i12 = zzuVar.zzf;
        if (i12 != 0) {
            sbS.append(", roleFlags=[");
            int i13 = i12 & 32768;
            String str7 = zzeo.zza;
            ArrayList arrayList2 = new ArrayList();
            if ((i12 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i12 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i12 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i12 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i12 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i12 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i12 & 64) != 0) {
                arrayList2.add("caption");
            }
            if ((i12 & 128) != 0) {
                arrayList2.add(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            }
            if ((i12 & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i12 & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i12 & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i12 & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i12 & 4096) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i12 & 8192) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i12 & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if (i13 != 0) {
                arrayList2.add("auxiliary");
            }
            zzggw.zzb(sbS, arrayList2, ",");
            sbS.append("]");
        }
        if ((i12 & 32768) != 0) {
            sbS.append(", auxiliaryTrackType=");
            int i14 = zzuVar.zzg;
            String str8 = zzeo.zza;
            if (i14 == 0) {
                str = AdError.UNDEFINED_DOMAIN;
            } else if (i14 == 1) {
                str = "original";
            } else if (i14 == 2) {
                str = "depth-linear";
            } else if (i14 == 3) {
                str = "depth-inverse";
            } else {
                if (i14 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sbS.append(str);
        }
        return sbS.toString();
    }

    public final boolean equals(@Nullable Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && zzu.class == obj.getClass()) {
            zzu zzuVar = (zzu) obj;
            int i2 = this.zzP;
            if ((i2 == 0 || (i = zzuVar.zzP) == 0 || i2 == i) && this.zze == zzuVar.zze && this.zzf == zzuVar.zzf && this.zzg == zzuVar.zzg && this.zzh == zzuVar.zzh && this.zzi == zzuVar.zzi && this.zzp == zzuVar.zzp && this.zzt == zzuVar.zzt && this.zzv == zzuVar.zzv && this.zzw == zzuVar.zzw && this.zzx == zzuVar.zzx && this.zzy == zzuVar.zzy && this.zzA == zzuVar.zzA && this.zzD == zzuVar.zzD && this.zzF == zzuVar.zzF && this.zzG == zzuVar.zzG && this.zzH == zzuVar.zzH && this.zzI == zzuVar.zzI && this.zzJ == zzuVar.zzJ && this.zzK == zzuVar.zzK && this.zzL == zzuVar.zzL && this.zzN == zzuVar.zzN && Float.compare(this.zzz, zzuVar.zzz) == 0 && Float.compare(this.zzB, zzuVar.zzB) == 0 && Objects.equals(this.zza, zzuVar.zza) && Objects.equals(this.zzb, zzuVar.zzb) && this.zzc.equals(zzuVar.zzc) && Objects.equals(this.zzk, zzuVar.zzk) && Objects.equals(this.zzn, zzuVar.zzn) && Objects.equals(this.zzo, zzuVar.zzo) && Objects.equals(this.zzd, zzuVar.zzd) && Arrays.equals(this.zzC, zzuVar.zzC) && Objects.equals(this.zzl, zzuVar.zzl) && Objects.equals(this.zzE, zzuVar.zzE) && Objects.equals(this.zzs, zzuVar.zzs) && zzd(zzuVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzP;
        if (i != 0) {
            return i;
        }
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int iHashCode2 = this.zzc.hashCode() + YU.a.B(iHashCode + 527, 31, str2 == null ? 0 : str2.hashCode(), 31);
        String str3 = this.zzd;
        int iB = (((((((((YU.a.B(iHashCode2, 31, str3 == null ? 0 : str3.hashCode(), 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + this.zzh) * 31) + this.zzi) * 31;
        String str4 = this.zzk;
        int iHashCode3 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        zzao zzaoVar = this.zzl;
        int iHashCode4 = iHashCode3 + (zzaoVar == null ? 0 : zzaoVar.hashCode());
        String str5 = this.zzn;
        int iB2 = YU.a.B(iHashCode4, 961, str5 == null ? 0 : str5.hashCode(), 31);
        int iA = ((((((((((((((((((((androidx.compose.ui.input.pointer.a.a(this.zzB, (androidx.compose.ui.input.pointer.a.a(this.zzz, (((((((((((((iB2 + (this.zzo != null ? r2.hashCode() : 0)) * 31) + this.zzp) * 31) + ((int) this.zzt)) * 31) + this.zzv) * 31) + this.zzw) * 31) + this.zzx) * 31) + this.zzy) * 31, 31) + this.zzA) * 31, 31) + this.zzD) * 31) + this.zzF) * 31) + this.zzG) * 31) + this.zzH) * 31) + this.zzI) * 31) + this.zzJ) * 31) + this.zzK) * 31) + this.zzL) * 31) - 1) * 31) - 1) * 31) + this.zzN;
        this.zzP = iA;
        return iA;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzE);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzn;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzo;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zzk;
        int length5 = String.valueOf(str5).length();
        int i = this.zzj;
        int length6 = String.valueOf(i).length();
        String str6 = this.zzd;
        int length7 = String.valueOf(str6).length();
        int i2 = this.zzv;
        int length8 = String.valueOf(i2).length();
        int i3 = this.zzw;
        int length9 = String.valueOf(i3).length();
        float f = this.zzz;
        int length10 = String.valueOf(f).length();
        int length11 = strValueOf.length();
        int i4 = this.zzG;
        int length12 = String.valueOf(i4).length();
        int i5 = this.zzH;
        StringBuilder sb = new StringBuilder(length + 9 + length2 + 2 + length3 + 2 + length4 + 2 + length5 + 2 + length6 + 2 + length7 + 3 + length8 + 2 + length9 + 2 + length10 + 2 + length11 + 4 + length12 + 2 + String.valueOf(i5).length() + 2);
        androidx.constraintlayout.core.state.a.B(sb, "Format(", str, ", ", str2);
        androidx.constraintlayout.core.state.a.B(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(i);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(f);
        sb.append(", ");
        sb.append(strValueOf);
        sb.append("], [");
        sb.append(i4);
        return androidx.constraintlayout.core.state.a.k(sb, ", ", i5, "])");
    }

    public final zzs zza() {
        return new zzs(this, null);
    }

    public final zzu zzb(int i) {
        zzs zzsVar = new zzs(this, null);
        zzsVar.zzL(i);
        return new zzu(zzsVar);
    }

    public final int zzc() {
        int i;
        int i2 = this.zzv;
        if (i2 == -1 || (i = this.zzw) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public final boolean zzd(zzu zzuVar) {
        List list = this.zzr;
        int size = list.size();
        List list2 = zzuVar.zzr;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    private zzu(zzs zzsVar) {
        boolean z;
        String str;
        this.zza = zzsVar.zzN();
        String strZzh = zzeo.zzh(zzsVar.zzQ());
        this.zzd = strZzh;
        if (zzsVar.zzP().isEmpty() && zzsVar.zzO() != null) {
            this.zzc = zzgjz.zzj(new zzw(strZzh, zzsVar.zzO()));
            this.zzb = zzsVar.zzO();
        } else if (!zzsVar.zzP().isEmpty() && zzsVar.zzO() == null) {
            this.zzc = zzsVar.zzP();
            List listZzP = zzsVar.zzP();
            Iterator it = listZzP.iterator();
            while (true) {
                if (!it.hasNext()) {
                    str = ((zzw) listZzP.get(0)).zzb;
                    break;
                }
                zzw zzwVar = (zzw) it.next();
                if (TextUtils.equals(zzwVar.zza, strZzh)) {
                    str = zzwVar.zzb;
                    break;
                }
            }
            this.zzb = str;
        } else if (zzsVar.zzP().isEmpty() && zzsVar.zzO() == null) {
            z = true;
            zzghc.zzh(z);
            this.zzc = zzsVar.zzP();
            this.zzb = zzsVar.zzO();
        } else {
            for (int i = 0; i < zzsVar.zzP().size(); i++) {
                if (((zzw) zzsVar.zzP().get(i)).zzb.equals(zzsVar.zzO())) {
                    z = true;
                    break;
                }
            }
            z = false;
            zzghc.zzh(z);
            this.zzc = zzsVar.zzP();
            this.zzb = zzsVar.zzO();
        }
        this.zze = zzsVar.zzR();
        zzghc.zzi(zzsVar.zzT() == 0 || (zzsVar.zzS() & 32768) != 0, "Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set");
        this.zzf = zzsVar.zzS();
        this.zzg = zzsVar.zzT();
        int iZzU = zzsVar.zzU();
        this.zzh = iZzU;
        int iZzV = zzsVar.zzV();
        this.zzi = iZzV;
        this.zzj = iZzV != -1 ? iZzV : iZzU;
        this.zzk = zzsVar.zzW();
        this.zzl = zzsVar.zzX();
        this.zzm = null;
        this.zzn = zzsVar.zzY();
        this.zzo = zzsVar.zzZ();
        this.zzp = zzsVar.zzaa();
        this.zzq = zzsVar.zzab();
        this.zzr = zzsVar.zzac() == null ? Collections.EMPTY_LIST : zzsVar.zzac();
        zzp zzpVarZzad = zzsVar.zzad();
        this.zzs = zzpVarZzad;
        this.zzt = zzsVar.zzae();
        this.zzu = zzsVar.zzaf();
        this.zzv = zzsVar.zzag();
        this.zzw = zzsVar.zzah();
        this.zzx = zzsVar.zzai();
        this.zzy = zzsVar.zzaj();
        this.zzz = zzsVar.zzak();
        this.zzA = zzsVar.zzal() == -1 ? 0 : zzsVar.zzal();
        this.zzB = zzsVar.zzam() == -1.0f ? 1.0f : zzsVar.zzam();
        this.zzC = zzsVar.zzan();
        this.zzD = zzsVar.zzao();
        this.zzE = zzsVar.zzap();
        this.zzF = zzsVar.zzaq();
        this.zzG = zzsVar.zzar();
        this.zzH = zzsVar.zzas();
        this.zzI = zzsVar.zzat();
        this.zzJ = zzsVar.zzau() == -1 ? 0 : zzsVar.zzau();
        this.zzK = zzsVar.zzav() != -1 ? zzsVar.zzav() : 0;
        this.zzL = zzsVar.zzaw();
        this.zzM = zzsVar.zzax();
        if (zzsVar.zzay() != 0 || zzpVarZzad == null) {
            this.zzN = zzsVar.zzay();
        } else {
            this.zzN = 1;
        }
    }
}
