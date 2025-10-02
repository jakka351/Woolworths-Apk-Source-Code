package kotlin.text;

import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class HexExtensionsKt {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f24673a;
    public static final long[] b;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f24673a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        b = jArr;
    }

    public static final void a(int i, int i2, String str) {
        int i3 = i2 - i;
        if (i3 < 1) {
            Intrinsics.f(str, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = str.substring(i, i2);
            Intrinsics.g(strSubstring, "substring(...)");
            StringBuilder sbP = androidx.constraintlayout.core.state.a.p("Expected at least 1 hexadecimal digits at index ", i, ", but was \"", strSubstring, "\" of length ");
            sbP.append(i3);
            throw new NumberFormatException(sbP.toString());
        }
        if (i3 > 16) {
            int i4 = (i3 + i) - 16;
            while (i < i4) {
                if (str.charAt(i) != '0') {
                    StringBuilder sbR = YU.a.r(i, "Expected the hexadecimal digit '0' at index ", ", but was '");
                    sbR.append(str.charAt(i));
                    sbR.append("'.\nThe result won't fit the type being parsed.");
                    throw new NumberFormatException(sbR.toString());
                }
                i++;
            }
        }
    }

    public static long b(int i, int i2, String str) {
        HexFormat format = HexFormat.d;
        Intrinsics.h(str, "<this>");
        Intrinsics.h(format, "format");
        AbstractList.Companion.a(i, i2, str.length());
        if (format.c.f24676a) {
            a(i, i2, str);
            return c(i, i2, str);
        }
        if (i2 - i > 0) {
            a(i, i2, str);
            return c(i, i2, str);
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.g(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"\" and suffix \"\", but was ".concat(strSubstring));
    }

    public static final long c(int i, int i2, String str) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = b[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            StringBuilder sbR = YU.a.r(i, "Expected a hexadecimal digit at index ", ", but was ");
            sbR.append(str.charAt(i));
            throw new NumberFormatException(sbR.toString());
        }
        return j;
    }
}
