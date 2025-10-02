package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/TimeSource;", "", "WithComparableMarks", "Monotonic", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental
/* loaded from: classes.dex */
public interface TimeSource {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Monotonic implements WithComparableMarks {

        @SinceKotlin
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @JvmInline
        @WasExperimental
        public static final class ValueTimeMark implements ComparableTimeMark {
            public final long d;

            @Override // kotlin.time.ComparableTimeMark
            public final long U(ComparableTimeMark other) {
                Intrinsics.h(other, "other");
                boolean z = other instanceof ValueTimeMark;
                long j = this.d;
                if (!z) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + other);
                }
                long j2 = ((ValueTimeMark) other).d;
                int i = MonotonicTimeSource.b;
                DurationUnit unit = DurationUnit.e;
                Intrinsics.h(unit, "unit");
                if (((j2 - 1) | 1) != Long.MAX_VALUE) {
                    return (1 | (j - 1)) == Long.MAX_VALUE ? LongSaturatedMathKt.a(j) : LongSaturatedMathKt.b(j, j2, unit);
                }
                if (j != j2) {
                    return Duration.o(LongSaturatedMathKt.a(j2));
                }
                int i2 = Duration.g;
                return 0L;
            }

            @Override // java.lang.Comparable
            public final int compareTo(ComparableTimeMark comparableTimeMark) {
                return ComparableTimeMark.DefaultImpls.a(this, comparableTimeMark);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof ValueTimeMark) {
                    return this.d == ((ValueTimeMark) obj).d;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.d);
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.d + ')';
            }
        }

        public final String toString() {
            int i = MonotonicTimeSource.b;
            return "TimeSource(System.nanoTime())";
        }
    }

    @SinceKotlin
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @WasExperimental
    public interface WithComparableMarks extends TimeSource {
    }
}
