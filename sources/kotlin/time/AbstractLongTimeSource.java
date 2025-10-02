package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@SinceKotlin
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
@WasExperimental
/* loaded from: classes7.dex */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class LongTimeMark implements ComparableTimeMark {
        @Override // kotlin.time.ComparableTimeMark
        public final long U(ComparableTimeMark other) {
            Intrinsics.h(other, "other");
            if (other instanceof LongTimeMark) {
                throw null;
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // java.lang.Comparable
        public final int compareTo(ComparableTimeMark comparableTimeMark) {
            return ComparableTimeMark.DefaultImpls.a(this, comparableTimeMark);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LongTimeMark)) {
                return false;
            }
            U((ComparableTimeMark) obj);
            throw null;
        }

        public final int hashCode() {
            int i = Duration.g;
            return Long.hashCode(0L) + (Long.hashCode(0L) * 37);
        }

        public final String toString() {
            throw null;
        }
    }
}
