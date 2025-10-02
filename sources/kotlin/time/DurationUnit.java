package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@SinceKotlin
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/DurationUnit;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DurationUnit {
    public static final DurationUnit e;
    public static final DurationUnit f;
    public static final DurationUnit g;
    public static final DurationUnit h;
    public static final DurationUnit i;
    public static final DurationUnit j;
    public static final DurationUnit k;
    public static final /* synthetic */ DurationUnit[] l;
    public static final /* synthetic */ EnumEntries m;
    public final TimeUnit d;

    static {
        DurationUnit durationUnit = new DurationUnit("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        e = durationUnit;
        DurationUnit durationUnit2 = new DurationUnit("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        f = durationUnit2;
        DurationUnit durationUnit3 = new DurationUnit("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        g = durationUnit3;
        DurationUnit durationUnit4 = new DurationUnit("SECONDS", 3, TimeUnit.SECONDS);
        h = durationUnit4;
        DurationUnit durationUnit5 = new DurationUnit("MINUTES", 4, TimeUnit.MINUTES);
        i = durationUnit5;
        DurationUnit durationUnit6 = new DurationUnit("HOURS", 5, TimeUnit.HOURS);
        j = durationUnit6;
        DurationUnit durationUnit7 = new DurationUnit("DAYS", 6, TimeUnit.DAYS);
        k = durationUnit7;
        DurationUnit[] durationUnitArr = {durationUnit, durationUnit2, durationUnit3, durationUnit4, durationUnit5, durationUnit6, durationUnit7};
        l = durationUnitArr;
        m = EnumEntriesKt.a(durationUnitArr);
    }

    public DurationUnit(String str, int i2, TimeUnit timeUnit) {
        this.d = timeUnit;
    }

    public static DurationUnit valueOf(String str) {
        return (DurationUnit) Enum.valueOf(DurationUnit.class, str);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[]) l.clone();
    }
}
