package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import androidx.annotation.Nullable;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

@SuppressLint
/* loaded from: classes5.dex */
public final class zzdc {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb = {0, 0, 0, 1};
    private static final String[] zzc = {"", "A", "B", "C"};
    private static final Pattern zzd = Pattern.compile("^\\D?(\\d+)$");

    @Nullable
    public static String zza(byte[] bArr) {
        zzef zzefVar = new zzef(bArr);
        if (!zzh(zzefVar, 31)) {
            return null;
        }
        zzefVar.zzk(4);
        int iZzs = zzefVar.zzs();
        int iZzs2 = zzefVar.zzs();
        if (!zzh(zzefVar, 0)) {
            return null;
        }
        zzefVar.zzQ();
        String strZzK = zzefVar.zzK(4, StandardCharsets.UTF_8);
        if (strZzK.equals("mp4a")) {
            zzefVar.zzQ();
            zzefVar.zzk(2);
            zzee zzeeVar = new zzee();
            zzeeVar.zza(zzefVar);
            int iZzj = zzeeVar.zzj(5);
            if (iZzj == 31) {
                iZzj = zzeeVar.zzj(6) + 32;
            }
            StringBuilder sb = new StringBuilder(strZzK.length() + 4 + String.valueOf(iZzj).length());
            sb.append(strZzK);
            sb.append(".40.");
            sb.append(iZzj);
            strZzK = sb.toString();
        }
        Object[] objArr = {Integer.valueOf(iZzs), Integer.valueOf(iZzs2), strZzK};
        String str = zzeo.zza;
        return String.format(Locale.US, "iamf.%03X.%03X.%s", objArr);
    }

    public static String zzb(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String zzc(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        int i5;
        Object[] objArr = {zzc[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(true != z ? Matrix.MATRIX_TYPE_RANDOM_LT : 'H'), Integer.valueOf(i4)};
        String str = zzeo.zza;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int i6 = 6;
        while (true) {
            if (i6 <= 0) {
                break;
            }
            int i7 = i6 - 1;
            if (iArr[i7] != 0) {
                break;
            }
            i6 = i7;
        }
        for (i5 = 0; i5 < i6; i5++) {
            sb.append(String.format(".%02X", Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static String zzd(byte[] bArr) {
        int length = bArr.length;
        zzghc.zzd(length >= 17, "Invalid APV CSD length: %s", length);
        byte b = bArr[0];
        zzghc.zzd(b == 1, "Invalid APV CSD version: %s", b);
        byte b2 = bArr[5];
        byte b3 = bArr[6];
        byte b4 = bArr[7];
        String str = zzeo.zza;
        Locale locale = Locale.US;
        StringBuilder sbQ = YU.a.q(b2, b3, "apv1.apvf", ".apvl", ".apvb");
        sbQ.append((int) b4);
        return sbQ.toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:408:0x068d  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x03fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0120  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zze(com.google.android.gms.internal.ads.zzu r26) {
        /*
            Method dump skipped, instructions count: 2060
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdc.zze(com.google.android.gms.internal.ads.zzu):android.util.Pair");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzf(java.lang.String r8, java.lang.String[] r9, @androidx.annotation.Nullable com.google.android.gms.internal.ads.zzh r10) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdc.zzf(java.lang.String, java.lang.String[], com.google.android.gms.internal.ads.zzh):android.util.Pair");
    }

    public static byte[] zzg(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2 + 4];
        System.arraycopy(zzb, 0, bArr2, 0, 4);
        System.arraycopy(bArr, i, bArr2, 4, i2);
        return bArr2;
    }

    private static boolean zzh(zzef zzefVar, int i) {
        if ((zzefVar.zzs() >> 3) != i) {
            return false;
        }
        zzefVar.zzQ();
        return true;
    }
}
