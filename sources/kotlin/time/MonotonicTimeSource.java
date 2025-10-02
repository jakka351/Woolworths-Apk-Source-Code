package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.time.TimeSource;

@SinceKotlin
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MonotonicTimeSource implements TimeSource.WithComparableMarks {

    /* renamed from: a, reason: collision with root package name */
    public static final long f24684a = System.nanoTime();
    public static final /* synthetic */ int b = 0;

    public static long a() {
        return System.nanoTime() - f24684a;
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
