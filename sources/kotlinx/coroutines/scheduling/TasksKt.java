package kotlinx.coroutines.scheduling;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlinx.coroutines.internal.SystemPropsKt;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002*\f\b\u0000\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"", "TaskContext", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TasksKt {

    /* renamed from: a, reason: collision with root package name */
    public static final String f24739a;
    public static final long b;
    public static final int c;
    public static final int d;
    public static final long e;
    public static final NanoTimeSource f;

    static {
        String strC = SystemPropsKt.c("kotlinx.coroutines.scheduler.default.name");
        if (strC == null) {
            strC = "DefaultDispatcher";
        }
        f24739a = strC;
        b = SystemPropsKt.b(100000L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.resolution.ns");
        int iA = SystemPropsKt.a();
        if (iA < 2) {
            iA = 2;
        }
        c = SystemPropsKt.d(iA, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        d = SystemPropsKt.d(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        e = TimeUnit.SECONDS.toNanos(SystemPropsKt.b(60L, 1L, Long.MAX_VALUE, "kotlinx.coroutines.scheduler.keep.alive.sec"));
        f = NanoTimeSource.f24738a;
    }
}
