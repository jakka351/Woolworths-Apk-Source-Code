package kotlin.collections.unsigned;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.collections.CollectionsKt;

@Metadata(d1 = {"kotlin/collections/unsigned/UArraysKt___UArraysJvmKt", "kotlin/collections/unsigned/UArraysKt___UArraysKt"}, k = 4, mv = {2, 2, 0}, pn = "kotlin.collections", xi = 49)
/* loaded from: classes7.dex */
public final class UArraysKt extends UArraysKt___UArraysKt {
    public static boolean a(short[] sArr, short[] sArr2) {
        if (sArr == null) {
            sArr = null;
        }
        if (sArr2 == null) {
            sArr2 = null;
        }
        return Arrays.equals(sArr, sArr2);
    }

    public static boolean b(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            iArr = null;
        }
        if (iArr2 == null) {
            iArr2 = null;
        }
        return Arrays.equals(iArr, iArr2);
    }

    public static boolean c(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            bArr = null;
        }
        if (bArr2 == null) {
            bArr2 = null;
        }
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean d(long[] jArr, long[] jArr2) {
        return Arrays.equals(jArr, jArr2);
    }

    public static String e(byte[] bArr) {
        String strM;
        return (bArr == null || (strM = CollectionsKt.M(new UByteArray(bArr), ", ", "[", "]", null, 56)) == null) ? "null" : strM;
    }

    public static String f(int[] iArr) {
        String strM;
        return (iArr == null || (strM = CollectionsKt.M(new UIntArray(iArr), ", ", "[", "]", null, 56)) == null) ? "null" : strM;
    }

    public static String g(short[] sArr) {
        String strM;
        return (sArr == null || (strM = CollectionsKt.M(new UShortArray(sArr), ", ", "[", "]", null, 56)) == null) ? "null" : strM;
    }

    public static String h(long[] jArr) {
        String strM = CollectionsKt.M(new ULongArray(jArr), ", ", "[", "]", null, 56);
        return strM == null ? "null" : strM;
    }
}
