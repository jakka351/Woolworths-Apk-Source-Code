package okhttp3.internal.url;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal._UtilCommonKt;
import okio.Buffer;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class _UrlKt {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f26768a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static String a(int i, int i2, int i3, String str, String str2, boolean z) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        int i5 = i2;
        boolean z2 = (i3 & 8) != 0 ? false : z;
        boolean z3 = (i3 & 16) == 0;
        boolean z4 = (i3 & 32) == 0;
        boolean z5 = (i3 & 64) == 0;
        Intrinsics.h(str, "<this>");
        return b(str, i4, i5, str2, z2, z3, z4, z5, 128);
    }

    public static String b(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, int i3) {
        int i4 = (i3 & 1) != 0 ? 0 : i;
        int length = (i3 & 2) != 0 ? str.length() : i2;
        boolean z5 = (i3 & 8) != 0 ? false : z;
        boolean z6 = (i3 & 16) != 0 ? false : z2;
        boolean z7 = (i3 & 64) == 0 ? z4 : false;
        Intrinsics.h(str, "<this>");
        int iCharCount = i4;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i5 = 128;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z7) || StringsKt.p(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))) || (iCodePointAt == 43 && z3)))) {
                Buffer buffer = new Buffer();
                buffer.r0(i4, iCharCount, str);
                Buffer buffer2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z5 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 32 && str2 == " !\"#$&'()+,/:;<=>?@[\\]^`{|}~") {
                            buffer.t0("+");
                        } else if (iCodePointAt2 == 43 && z3) {
                            buffer.t0(z5 ? "+" : "%2B");
                        } else if (iCodePointAt2 < 32 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i5 && !z7) || StringsKt.p(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z5 || (z6 && !c(iCharCount, length, str)))))) {
                            if (buffer2 == null) {
                                buffer2 = new Buffer();
                            }
                            buffer2.z0(iCodePointAt2);
                            while (!buffer2.X1()) {
                                byte b = buffer2.readByte();
                                buffer.Y(37);
                                char[] cArr = f26768a;
                                buffer.Y(cArr[((b & 255) >> 4) & 15]);
                                buffer.Y(cArr[b & 15]);
                            }
                        } else {
                            buffer.z0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i5 = 128;
                }
                return buffer.v();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i4, length);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final boolean c(int i, int i2, String str) {
        Intrinsics.h(str, "<this>");
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && _UtilCommonKt.n(str.charAt(i + 1)) != -1 && _UtilCommonKt.n(str.charAt(i3)) != -1;
    }

    public static String d(int i, int i2, int i3, String str) {
        int i4;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        boolean z = (i3 & 4) == 0;
        Intrinsics.h(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i2) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z)) {
                Buffer buffer = new Buffer();
                buffer.r0(i, iCharCount, str);
                while (iCharCount < i2) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i4 = iCharCount + 2) < i2) {
                        int iN = _UtilCommonKt.n(str.charAt(iCharCount + 1));
                        int iN2 = _UtilCommonKt.n(str.charAt(i4));
                        if (iN == -1 || iN2 == -1) {
                            buffer.z0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            buffer.Y((iN << 4) + iN2);
                            iCharCount = Character.charCount(iCodePointAt) + i4;
                        }
                    } else if (iCodePointAt == 43 && z) {
                        buffer.Y(32);
                        iCharCount++;
                    } else {
                        buffer.z0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return buffer.v();
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i2);
        Intrinsics.g(strSubstring, "substring(...)");
        return strSubstring;
    }
}
