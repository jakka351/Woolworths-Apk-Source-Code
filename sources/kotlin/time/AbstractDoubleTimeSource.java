package kotlin.time;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Deprecated
@ExperimentalTime
/* loaded from: classes7.dex */
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DoubleTimeMark implements ComparableTimeMark {
        @Override // kotlin.time.ComparableTimeMark
        public final long U(ComparableTimeMark other) {
            Intrinsics.h(other, "other");
            if (other instanceof DoubleTimeMark) {
                if (Duration.f(0L)) {
                    return 0L;
                }
                Duration.l(0L, Duration.o(0L));
                throw null;
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // java.lang.Comparable
        public final int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.a(this, comparableTimeMark);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DoubleTimeMark)) {
                return false;
            }
            U((ComparableTimeMark) obj);
            int i = Duration.g;
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }
}
