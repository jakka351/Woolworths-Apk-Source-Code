package kotlin.text;

import kotlin.Metadata;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@JvmName
/* loaded from: classes7.dex */
public final class UStringsKt {
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final byte a(java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            kotlin.UInt r0 = c(r3)
            r1 = 0
            if (r0 == 0) goto L1e
            int r0 = r0.d
            r2 = 255(0xff, float:3.57E-43)
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L17
            goto L1e
        L17:
            byte r0 = (byte) r0
            kotlin.UByte r2 = new kotlin.UByte
            r2.<init>(r0)
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r2 == 0) goto L24
            byte r3 = r2.d
            return r3
        L24:
            kotlin.text.StringsKt__StringNumberConversionsKt.b(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.UStringsKt.a(java.lang.String):byte");
    }

    public static final int b(String str) {
        Intrinsics.h(str, "<this>");
        UInt uIntC = c(str);
        if (uIntC != null) {
            return uIntC.d;
        }
        StringsKt__StringNumberConversionsKt.b(str);
        throw null;
    }

    public static final UInt c(String str) {
        int i;
        Intrinsics.h(str, "<this>");
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.j(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new UInt(i2);
    }

    public static final long d(String str) {
        Intrinsics.h(str, "<this>");
        ULong uLongE = e(str);
        if (uLongE != null) {
            return uLongE.d;
        }
        StringsKt__StringNumberConversionsKt.b(str);
        throw null;
    }

    public static final ULong e(String str) {
        Intrinsics.h(str, "<this>");
        CharsKt.b(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (Intrinsics.j(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 10;
        long j2 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, j);
                if (Long.compareUnsigned(j2, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j3 = j2 * j;
            long j4 = (iDigit & 4294967295L) + j3;
            if (Long.compareUnsigned(j4, j3) < 0) {
                return null;
            }
            i++;
            j2 = j4;
        }
        return new ULong(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final short f(java.lang.String r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r3, r0)
            kotlin.UInt r0 = c(r3)
            r1 = 0
            if (r0 == 0) goto L1f
            int r0 = r0.d
            r2 = 65535(0xffff, float:9.1834E-41)
            int r2 = java.lang.Integer.compareUnsigned(r0, r2)
            if (r2 <= 0) goto L18
            goto L1f
        L18:
            short r0 = (short) r0
            kotlin.UShort r2 = new kotlin.UShort
            r2.<init>(r0)
            goto L20
        L1f:
            r2 = r1
        L20:
            if (r2 == 0) goto L25
            short r3 = r2.d
            return r3
        L25:
            kotlin.text.StringsKt__StringNumberConversionsKt.b(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.UStringsKt.f(java.lang.String):short");
    }
}
