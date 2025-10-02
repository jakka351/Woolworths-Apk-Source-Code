package kotlin.ranges;

import androidx.camera.core.impl.b;
import androidx.compose.ui.unit.Dp;
import androidx.constraintlayout.core.state.a;
import io.jsonwebtoken.JwtParser;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"kotlin/ranges/RangesKt__RangesKt", "kotlin/ranges/RangesKt___RangesKt"}, k = 4, mv = {2, 2, 0}, xi = 49)
/* loaded from: classes.dex */
public final class RangesKt extends RangesKt___RangesKt {
    public static double a(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException(b.p(a.n(d3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), d2, JwtParser.SEPARATOR_CHAR));
    }

    public static float b(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + JwtParser.SEPARATOR_CHAR);
    }

    public static int c(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + JwtParser.SEPARATOR_CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(int i, IntRange range) {
        Intrinsics.h(range, "range");
        int i2 = range.e;
        int i3 = range.d;
        if (range instanceof ClosedFloatingPointRange) {
            return ((Number) f(Integer.valueOf(i), (ClosedFloatingPointRange) range)).intValue();
        }
        if (!range.isEmpty()) {
            return i < Integer.valueOf(i3).intValue() ? Integer.valueOf(i3).intValue() : i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + JwtParser.SEPARATOR_CHAR);
    }

    public static long e(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException(b.q(b.t(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum "), j2, JwtParser.SEPARATOR_CHAR));
    }

    public static Comparable f(Comparable comparable, ClosedFloatingPointRange range) {
        Intrinsics.h(range, "range");
        if (!range.isEmpty()) {
            return (!range.b(comparable, range.getStart()) || range.b(range.getStart(), comparable)) ? (!range.b(range.getEndInclusive(), comparable) || range.b(comparable, range.getEndInclusive())) ? comparable : range.getEndInclusive() : range.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + JwtParser.SEPARATOR_CHAR);
    }

    public static Comparable g(Comparable comparable, ClosedRange range) {
        Intrinsics.h(range, "range");
        if (range instanceof ClosedFloatingPointRange) {
            return f(comparable, (ClosedFloatingPointRange) range);
        }
        if (!range.isEmpty()) {
            return comparable.compareTo(range.getStart()) < 0 ? range.getStart() : comparable.compareTo(range.getEndInclusive()) > 0 ? range.getEndInclusive() : comparable;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + range + JwtParser.SEPARATOR_CHAR);
    }

    public static Comparable h(Integer num, Integer num2, Integer num3) {
        if (num2 == null || num3 == null) {
            if (num2 != null && num.compareTo(num2) < 0) {
                return num2;
            }
            if (num3 != null && num.compareTo(num3) > 0) {
                return num3;
            }
        } else {
            if (num2.compareTo(num3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + num3 + " is less than minimum " + num2 + JwtParser.SEPARATOR_CHAR);
            }
            if (num.compareTo(num2) < 0) {
                return num2;
            }
            if (num.compareTo(num3) > 0) {
                return num3;
            }
        }
        return num;
    }

    public static ClosedFloatingPointRange i(double d, double d2) {
        return new ClosedDoubleRange(d, d2);
    }

    public static ClosedFloatingPointRange j(float f, float f2) {
        return new ClosedFloatRange(f, f2);
    }

    public static ClosedRange k(Dp dp, Dp dp2) {
        return new ComparableRange(dp, dp2);
    }

    public static OpenEndRange l(ZonedDateTime zonedDateTime, ZonedDateTime that) {
        Intrinsics.h(zonedDateTime, "<this>");
        Intrinsics.h(that, "that");
        return new ComparableOpenEndRange(zonedDateTime, that);
    }

    public static IntProgression m(IntRange intRange) {
        return new IntProgression(intRange.e, intRange.d, -intRange.f);
    }

    public static IntProgression n(int i, IntRange intRange) {
        Intrinsics.h(intRange, "<this>");
        boolean z = i > 0;
        Integer numValueOf = Integer.valueOf(i);
        if (!z) {
            throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + JwtParser.SEPARATOR_CHAR);
        }
        int i2 = intRange.d;
        int i3 = intRange.e;
        if (intRange.f <= 0) {
            i = -i;
        }
        return new IntProgression(i2, i3, i);
    }

    public static IntRange o(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? IntRange.g : new IntRange(i, i2 - 1, 1);
    }
}
