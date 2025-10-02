package androidx.work.impl.background.greedy;

import androidx.room.b;
import androidx.work.RunnableScheduler;
import androidx.work.impl.DefaultRunnableScheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkLauncherImpl;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/work/impl/background/greedy/TimeLimiter;", "", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TimeLimiter {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableScheduler f3949a;
    public final WorkLauncherImpl b;
    public final long c;
    public final Object d;
    public final LinkedHashMap e;

    public TimeLimiter(DefaultRunnableScheduler runnableScheduler, WorkLauncherImpl workLauncherImpl) {
        Intrinsics.h(runnableScheduler, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.f3949a = runnableScheduler;
        this.b = workLauncherImpl;
        this.c = millis;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public final void a(StartStopToken token) {
        Runnable runnable;
        Intrinsics.h(token, "token");
        synchronized (this.d) {
            runnable = (Runnable) this.e.remove(token);
        }
        if (runnable != null) {
            this.f3949a.b(runnable);
        }
    }

    public final void b(StartStopToken token) {
        Intrinsics.h(token, "token");
        b bVar = new b(1, this, token);
        synchronized (this.d) {
        }
        this.f3949a.a(bVar, this.c);
    }
}
