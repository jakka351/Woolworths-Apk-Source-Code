package com.google.android.recaptcha.internal;

import java.util.Collection;
import java.util.Objects;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzgp implements zzgx {

    @NotNull
    public static final zzgp zza = new zzgp();

    private zzgp() {
    }

    @Override // com.google.android.recaptcha.internal.zzgx
    public final void zza(int i, @NotNull zzgd zzgdVar, @NotNull zzue... zzueVarArr) throws zzce {
        String strM;
        String str;
        if (zzueVarArr.length != 1) {
            throw new zzce(4, 3, null);
        }
        int i2 = 0;
        Object objZza = zzgdVar.zzc().zza(zzueVarArr[0]);
        if (true != Objects.nonNull(objZza)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzce(4, 5, null);
        }
        if (objZza instanceof int[]) {
            int[] iArr = (int[]) objZza;
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "[");
            int length = iArr.length;
            int i3 = 0;
            while (i2 < length) {
                int i4 = iArr[i2];
                i3++;
                if (i3 > 1) {
                    sb.append((CharSequence) ",");
                }
                sb.append((CharSequence) String.valueOf(i4));
                i2++;
            }
            sb.append((CharSequence) "]");
            strM = sb.toString();
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, Charsets.f24671a);
            } else if (objZza instanceof long[]) {
                long[] jArr = (long[]) objZza;
                StringBuilder sb2 = new StringBuilder();
                sb2.append((CharSequence) "[");
                int length2 = jArr.length;
                int i5 = 0;
                while (i2 < length2) {
                    long j = jArr[i2];
                    i5++;
                    if (i5 > 1) {
                        sb2.append((CharSequence) ",");
                    }
                    sb2.append((CharSequence) String.valueOf(j));
                    i2++;
                }
                sb2.append((CharSequence) "]");
                strM = sb2.toString();
            } else if (objZza instanceof short[]) {
                short[] sArr = (short[]) objZza;
                StringBuilder sb3 = new StringBuilder();
                sb3.append((CharSequence) "[");
                int length3 = sArr.length;
                int i6 = 0;
                while (i2 < length3) {
                    short s = sArr[i2];
                    i6++;
                    if (i6 > 1) {
                        sb3.append((CharSequence) ",");
                    }
                    sb3.append((CharSequence) String.valueOf((int) s));
                    i2++;
                }
                sb3.append((CharSequence) "]");
                strM = sb3.toString();
            } else if (objZza instanceof float[]) {
                float[] fArr = (float[]) objZza;
                StringBuilder sb4 = new StringBuilder();
                sb4.append((CharSequence) "[");
                int length4 = fArr.length;
                int i7 = 0;
                while (i2 < length4) {
                    float f = fArr[i2];
                    i7++;
                    if (i7 > 1) {
                        sb4.append((CharSequence) ",");
                    }
                    sb4.append((CharSequence) String.valueOf(f));
                    i2++;
                }
                sb4.append((CharSequence) "]");
                strM = sb4.toString();
            } else if (objZza instanceof double[]) {
                double[] dArr = (double[]) objZza;
                StringBuilder sb5 = new StringBuilder();
                sb5.append((CharSequence) "[");
                int length5 = dArr.length;
                int i8 = 0;
                while (i2 < length5) {
                    double d = dArr[i2];
                    i8++;
                    if (i8 > 1) {
                        sb5.append((CharSequence) ",");
                    }
                    sb5.append((CharSequence) String.valueOf(d));
                    i2++;
                }
                sb5.append((CharSequence) "]");
                strM = sb5.toString();
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strM = ArraysKt.U((Object[]) objZza, ",", "[", "]", null, 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzce(4, 5, null);
                }
                strM = CollectionsKt.M((Iterable) objZza, ",", "[", "]", null, 56);
            }
            strM = str;
        }
        zzgdVar.zzc().zze(i, strM);
    }
}
