package kotlin.text;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntProgression;
import kotlin.ranges.IntRange;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/text/StringsKt")
@SourceDebugExtension
/* loaded from: classes.dex */
public class StringsKt__StringsKt extends StringsKt__StringsJVMKt {
    public static final int c(CharSequence charSequence, String string, int i, boolean z) {
        Intrinsics.h(charSequence, "<this>");
        Intrinsics.h(string, "string");
        return (z || !(charSequence instanceof String)) ? d(charSequence, string, i, charSequence.length(), z, false) : ((String) charSequence).indexOf(string, i);
    }

    public static final int d(CharSequence charSequence, CharSequence charSequence2, int i, int i2, boolean z, boolean z2) {
        IntProgression intProgression;
        if (z2) {
            int iA = StringsKt.A(charSequence);
            if (i > iA) {
                i = iA;
            }
            if (i2 < 0) {
                i2 = 0;
            }
            intProgression = new IntProgression(i, i2, -1);
        } else {
            if (i < 0) {
                i = 0;
            }
            int length = charSequence.length();
            if (i2 > length) {
                i2 = length;
            }
            intProgression = new IntRange(i, i2, 1);
        }
        boolean z3 = charSequence instanceof String;
        int i3 = intProgression.f;
        int i4 = intProgression.e;
        int i5 = intProgression.d;
        if (!z3 || !(charSequence2 instanceof String)) {
            boolean z4 = z;
            if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
                while (true) {
                    CharSequence charSequence3 = charSequence;
                    CharSequence charSequence4 = charSequence2;
                    boolean z5 = z4;
                    z4 = z5;
                    if (!f(charSequence4, 0, charSequence3, i5, charSequence2.length(), z5)) {
                        if (i5 == i4) {
                            break;
                        }
                        i5 += i3;
                        charSequence2 = charSequence4;
                        charSequence = charSequence3;
                    } else {
                        return i5;
                    }
                }
            }
        } else if ((i3 > 0 && i5 <= i4) || (i3 < 0 && i4 <= i5)) {
            int i6 = i5;
            while (true) {
                String str = (String) charSequence2;
                boolean z6 = z;
                if (!StringsKt.K(0, i6, str.length(), str, (String) charSequence, z6)) {
                    if (i6 == i4) {
                        break;
                    }
                    i6 += i3;
                    z = z6;
                } else {
                    return i6;
                }
            }
        }
        return -1;
    }

    public static final int e(CharSequence charSequence, char[] cArr, int i, boolean z) {
        Intrinsics.h(charSequence, "<this>");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(ArraysKt.c0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int iA = StringsKt.A(charSequence);
        if (i > iA) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (CharsKt__CharKt.a(c, cCharAt, z)) {
                    return i;
                }
            }
            if (i == iA) {
                return -1;
            }
            i++;
        }
    }

    public static final boolean f(CharSequence charSequence, int i, CharSequence other, int i2, int i3, boolean z) {
        Intrinsics.h(charSequence, "<this>");
        Intrinsics.h(other, "other");
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > other.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!CharsKt__CharKt.a(charSequence.charAt(i + i4), other.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static final void g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(YU.a.d(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List h(int i, CharSequence charSequence, String str) {
        g(i);
        int iC = c(charSequence, str, 0, false);
        if (iC == -1 || i == 1) {
            return CollectionsKt.Q(charSequence.toString());
        }
        boolean z = i > 0;
        int i2 = 10;
        if (z && i <= 10) {
            i2 = i;
        }
        ArrayList arrayList = new ArrayList(i2);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iC).toString());
            length = str.length() + iC;
            if (z && arrayList.size() == i - 1) {
                break;
            }
            iC = c(charSequence, str, length, false);
        } while (iC != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static boolean i(CharSequence charSequence, String str) {
        Intrinsics.h(str, "<this>");
        return charSequence instanceof String ? StringsKt.W(str, (String) charSequence, false) : f(str, 0, charSequence, 0, charSequence.length(), false);
    }

    public static final String j(CharSequence charSequence, IntRange range) {
        Intrinsics.h(charSequence, "<this>");
        Intrinsics.h(range, "range");
        return charSequence.subSequence(range.d, range.e + 1).toString();
    }
}
