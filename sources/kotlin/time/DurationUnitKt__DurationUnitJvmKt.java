package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes.dex */
class DurationUnitKt__DurationUnitJvmKt {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[TimeUnit.values().length];
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final double a(double d, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.h(sourceUnit, "sourceUnit");
        Intrinsics.h(targetUnit, "targetUnit");
        long jConvert = targetUnit.d.convert(1L, sourceUnit.d);
        return jConvert > 0 ? d * jConvert : d / r8.convert(1L, r9);
    }

    public static final long b(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.h(sourceUnit, "sourceUnit");
        Intrinsics.h(targetUnit, "targetUnit");
        return targetUnit.d.convert(j, sourceUnit.d);
    }

    public static final long c(long j, DurationUnit sourceUnit, DurationUnit targetUnit) {
        Intrinsics.h(sourceUnit, "sourceUnit");
        Intrinsics.h(targetUnit, "targetUnit");
        return targetUnit.d.convert(j, sourceUnit.d);
    }
}
