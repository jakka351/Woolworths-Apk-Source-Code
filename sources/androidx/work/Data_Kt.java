package androidx.work;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"work-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Data_Kt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3898a;

    static {
        String strG = Logger.g("Data");
        Intrinsics.g(strG, "tagWithPrefix(\"Data\")");
        f3898a = strG;
    }

    public static final Boolean[] a(boolean[] zArr) {
        int length = zArr.length;
        Boolean[] boolArr = new Boolean[length];
        for (int i = 0; i < length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    public static final Byte[] b(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    public static final Double[] c(double[] dArr) {
        int length = dArr.length;
        Double[] dArr2 = new Double[length];
        for (int i = 0; i < length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    public static final Float[] d(float[] fArr) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    public static final Integer[] e(int[] iArr) {
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static final Long[] f(long[] jArr) {
        int length = jArr.length;
        Long[] lArr = new Long[length];
        for (int i = 0; i < length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }
}
