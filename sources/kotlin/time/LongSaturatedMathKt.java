package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LongSaturatedMathKt {
    public static final long a(long j) {
        if (j < 0) {
            int i = Duration.g;
            return Duration.f;
        }
        int i2 = Duration.g;
        return Duration.e;
    }

    public static final long b(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.h(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.g;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.o(a(j3));
        }
        long jB = DurationUnitKt__DurationUnitJvmKt.b(1L, durationUnit2, durationUnit);
        long j4 = (j / jB) - (j2 / jB);
        long j5 = (j % jB) - (j2 % jB);
        int i = Duration.g;
        return Duration.l(DurationKt.h(j4, durationUnit2), DurationKt.h(j5, durationUnit));
    }
}
