package kotlin.time;

import io.jsonwebtoken.JwtParser;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class DurationKt {
    public static final long a(String str) {
        DurationUnit durationUnit;
        char cCharAt;
        int length = str.length();
        if (length == 0) {
            throw new IllegalArgumentException("The string is empty");
        }
        int i = Duration.g;
        char cCharAt2 = str.charAt(0);
        int i2 = (cCharAt2 == '+' || cCharAt2 == '-') ? 1 : 0;
        boolean z = i2 > 0 && StringsKt.X(str, '-');
        if (length <= i2) {
            throw new IllegalArgumentException("No components");
        }
        if (str.charAt(i2) != 'P') {
            throw new IllegalArgumentException();
        }
        int i3 = i2 + 1;
        if (i3 == length) {
            throw new IllegalArgumentException();
        }
        DurationUnit durationUnit2 = null;
        long jL = 0;
        boolean z2 = false;
        while (i3 < length) {
            if (str.charAt(i3) != 'T') {
                int i4 = i3;
                while (i4 < str.length() && (('0' <= (cCharAt = str.charAt(i4)) && cCharAt < ':') || StringsKt.p("+-.", cCharAt))) {
                    i4++;
                }
                String strSubstring = str.substring(i3, i4);
                Intrinsics.g(strSubstring, "substring(...)");
                if (strSubstring.length() == 0) {
                    throw new IllegalArgumentException();
                }
                int length2 = strSubstring.length() + i3;
                if (length2 < 0 || length2 >= str.length()) {
                    throw new IllegalArgumentException("Missing unit for value ".concat(strSubstring));
                }
                char cCharAt3 = str.charAt(length2);
                int i5 = length2 + 1;
                if (z2) {
                    if (cCharAt3 == 'H') {
                        durationUnit = DurationUnit.j;
                    } else if (cCharAt3 == 'M') {
                        durationUnit = DurationUnit.i;
                    } else {
                        if (cCharAt3 != 'S') {
                            throw new IllegalArgumentException("Invalid duration ISO time unit: " + cCharAt3);
                        }
                        durationUnit = DurationUnit.h;
                    }
                } else {
                    if (cCharAt3 != 'D') {
                        throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + cCharAt3);
                    }
                    durationUnit = DurationUnit.k;
                }
                if (durationUnit2 != null && durationUnit2.compareTo(durationUnit) <= 0) {
                    throw new IllegalArgumentException("Unexpected order of duration components");
                }
                int iB = StringsKt.B(strSubstring, JwtParser.SEPARATOR_CHAR, 0, 6);
                if (durationUnit != DurationUnit.h || iB <= 0) {
                    jL = Duration.l(jL, h(e(strSubstring), durationUnit));
                } else {
                    String strSubstring2 = strSubstring.substring(0, iB);
                    Intrinsics.g(strSubstring2, "substring(...)");
                    long jL2 = Duration.l(jL, h(e(strSubstring2), durationUnit));
                    String strSubstring3 = strSubstring.substring(iB);
                    Intrinsics.g(strSubstring3, "substring(...)");
                    jL = Duration.l(jL2, f(Double.parseDouble(strSubstring3), durationUnit));
                }
                durationUnit2 = durationUnit;
                i3 = i5;
            } else {
                if (z2 || (i3 = i3 + 1) == length) {
                    throw new IllegalArgumentException();
                }
                z2 = true;
            }
        }
        return z ? Duration.o(jL) : jL;
    }

    public static final long b(long j) {
        long j2 = (j << 1) + 1;
        int i = Duration.g;
        int i2 = DurationJvmKt.f24681a;
        return j2;
    }

    public static final long c(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? b(RangesKt.e(j, -4611686018427387903L, 4611686018427387903L)) : d(j * 1000000);
    }

    public static final long d(long j) {
        long j2 = j << 1;
        int i = Duration.g;
        int i2 = DurationJvmKt.f24681a;
        return j2;
    }

    public static final long e(String str) {
        char cCharAt;
        int length = str.length();
        int i = (length <= 0 || !StringsKt.p("+-", str.charAt(0))) ? 0 : 1;
        if (length - i > 16) {
            int i2 = i;
            while (true) {
                if (i < length) {
                    char cCharAt2 = str.charAt(i);
                    if (cCharAt2 == '0') {
                        if (i2 == i) {
                            i2++;
                        }
                    } else if ('1' > cCharAt2 || cCharAt2 >= ':') {
                        break;
                    }
                    i++;
                } else if (length - i2 > 16) {
                    return str.charAt(0) == '-' ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
            }
        }
        return (!StringsKt.W(str, "+", false) || length <= 1 || '0' > (cCharAt = str.charAt(1)) || cCharAt >= ':') ? Long.parseLong(str) : Long.parseLong(StringsKt.s(1, str));
    }

    public static final long f(double d, DurationUnit unit) {
        Intrinsics.h(unit, "unit");
        double dA = DurationUnitKt__DurationUnitJvmKt.a(d, unit, DurationUnit.e);
        if (Double.isNaN(dA)) {
            throw new IllegalArgumentException("Duration value cannot be NaN.");
        }
        long jC = MathKt.c(dA);
        return (-4611686018426999999L > jC || jC >= 4611686018427000000L) ? c(MathKt.c(DurationUnitKt__DurationUnitJvmKt.a(d, unit, DurationUnit.g))) : d(jC);
    }

    public static final long g(int i, DurationUnit unit) {
        Intrinsics.h(unit, "unit");
        return unit.compareTo(DurationUnit.h) <= 0 ? d(DurationUnitKt__DurationUnitJvmKt.c(i, unit, DurationUnit.e)) : h(i, unit);
    }

    public static final long h(long j, DurationUnit unit) {
        Intrinsics.h(unit, "unit");
        DurationUnit durationUnit = DurationUnit.e;
        long jC = DurationUnitKt__DurationUnitJvmKt.c(4611686018426999999L, durationUnit, unit);
        return ((-jC) > j || j > jC) ? b(RangesKt.e(DurationUnitKt__DurationUnitJvmKt.b(j, unit, DurationUnit.g), -4611686018427387903L, 4611686018427387903L)) : d(DurationUnitKt__DurationUnitJvmKt.c(j, unit, durationUnit));
    }
}
