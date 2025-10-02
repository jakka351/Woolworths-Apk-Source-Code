package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.medallia.digital.mobilesdk.q2;
import java.util.Arrays;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes5.dex */
public final class zzh {
    public static final zzh zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;
    public final int zzf;
    public final int zzg;
    private int zzh;

    static {
        zzg zzgVar = new zzg();
        zzgVar.zza(1);
        zzgVar.zzb(2);
        zzgVar.zzc(3);
        zza = zzgVar.zzg();
        zzg zzgVar2 = new zzg();
        zzgVar2.zza(1);
        zzgVar2.zzb(1);
        zzgVar2.zzc(2);
        zzgVar2.zzg();
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
    }

    public /* synthetic */ zzh(int i, int i2, int i3, byte[] bArr, int i4, int i5, byte[] bArr2) {
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = bArr;
        this.zzf = i4;
        this.zzg = i5;
    }

    @EnsuresNonNullIf
    public static boolean zza(@Nullable zzh zzhVar) {
        if (zzhVar == null) {
            return true;
        }
        int i = zzhVar.zzb;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = zzhVar.zzc;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = zzhVar.zzd;
        if ((i3 != -1 && i3 != 3) || zzhVar.zze != null) {
            return false;
        }
        int i4 = zzhVar.zzg;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = zzhVar.zzf;
        return i5 == -1 || i5 == 8;
    }

    @Pure
    public static int zzb(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    @Pure
    public static int zzc(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    private static String zzh(int i) {
        return i != -1 ? i != 6 ? i != 1 ? i != 2 ? YU.a.n(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color space ", i) : "BT601" : "BT709" : "BT2020" : "Unset color space";
    }

    private static String zzi(int i) {
        return i != -1 ? i != 10 ? i != 1 ? i != 2 ? i != 3 ? i != 6 ? i != 7 ? YU.a.n(new StringBuilder(String.valueOf(i).length() + 25), "Undefined color transfer ", i) : "HLG" : "ST2084 PQ" : "SDR SMPTE 170M" : "sRGB" : "Linear" : "Gamma 2.2" : "Unset color transfer";
    }

    private static String zzj(int i) {
        return i != -1 ? i != 1 ? i != 2 ? YU.a.n(new StringBuilder(String.valueOf(i).length() + 22), "Undefined color range ", i) : "Limited range" : "Full range" : "Unset color range";
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzh.class == obj.getClass()) {
            zzh zzhVar = (zzh) obj;
            if (this.zzb == zzhVar.zzb && this.zzc == zzhVar.zzc && this.zzd == zzhVar.zzd && Arrays.equals(this.zze, zzhVar.zze) && this.zzf == zzhVar.zzf && this.zzg == zzhVar.zzg) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzh;
        if (i != 0) {
            return i;
        }
        int iD = ((androidx.compose.ui.input.pointer.a.d((((((this.zzb + 527) * 31) + this.zzc) * 31) + this.zzd) * 31, 31, this.zze) + this.zzf) * 31) + this.zzg;
        this.zzh = iD;
        return iD;
    }

    public final String toString() {
        int i = this.zzf;
        int i2 = this.zzd;
        int i3 = this.zzc;
        String strZzh = zzh(this.zzb);
        String strZzj = zzj(i3);
        String strZzi = zzi(i2);
        String strM = i != -1 ? YU.a.m(new StringBuilder(String.valueOf(i).length() + 8), i, "bit Luma") : "NA";
        int i4 = this.zzg;
        String strM2 = i4 != -1 ? YU.a.m(new StringBuilder(String.valueOf(i4).length() + 10), i4, "bit Chroma") : "NA";
        boolean z = this.zze != null;
        StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.e(au.com.woolworths.shop.checkout.ui.confirmation.c.e(au.com.woolworths.shop.checkout.ui.confirmation.c.e(au.com.woolworths.shop.checkout.ui.confirmation.c.e(strZzh.length() + 12, 2, strZzj) + strZzi.length() + 2, 2, String.valueOf(z)), 2, strM), 1, strM2));
        sb.append("ColorInfo(");
        sb.append(strZzh);
        sb.append(", ");
        sb.append(strZzj);
        sb.append(", ");
        sb.append(strZzi);
        sb.append(", ");
        sb.append(z);
        androidx.constraintlayout.core.state.a.B(sb, ", ", strM, ", ", strM2);
        sb.append(")");
        return sb.toString();
    }

    public final zzg zzd() {
        return new zzg(this, null);
    }

    public final boolean zze() {
        return (this.zzf == -1 || this.zzg == -1) ? false : true;
    }

    public final boolean zzf() {
        return (this.zzb == -1 || this.zzc == -1 || this.zzd == -1) ? false : true;
    }

    public final String zzg() {
        String strJ;
        String string;
        if (zzf()) {
            String strZzh = zzh(this.zzb);
            String strZzj = zzj(this.zzc);
            String strZzi = zzi(this.zzd);
            String str = zzeo.zza;
            Locale locale = Locale.US;
            strJ = androidx.constraintlayout.core.state.a.j(strZzh, q2.c, strZzj, q2.c, strZzi);
        } else {
            strJ = "NA/NA/NA";
        }
        if (zze()) {
            int i = this.zzf;
            int i2 = this.zzg;
            StringBuilder sb = new StringBuilder(au.com.woolworths.shop.checkout.ui.confirmation.c.a(i, 1) + String.valueOf(i2).length());
            sb.append(i);
            sb.append(q2.c);
            sb.append(i2);
            string = sb.toString();
        } else {
            string = "NA/NA";
        }
        return YU.a.p(new StringBuilder(string.length() + strJ.length() + 1), strJ, q2.c, string);
    }
}
