package me.oriient.ipssdk.common.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import androidx.compose.ui.viewinterop.a;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J\u0016\u0010\u0011\u001a\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013H\u0007J\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007J$\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J(\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0013J,\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0018H\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lme/oriient/ipssdk/common/utils/SdkExecutors;", "", "()V", "BLOCKING_DEQUE", "Ljava/util/concurrent/LinkedBlockingDeque;", "Ljava/lang/Runnable;", "POOL_EXECUTOR", "Ljava/util/concurrent/ThreadPoolExecutor;", "POOL_EXECUTOR_KEEP_ALIVE_TIME_MILLI", "", "SCHEDULED_POOL_EXECUTOR", "Ljava/util/concurrent/ScheduledThreadPoolExecutor;", "UI_HANDLER", "Landroid/os/Handler;", "postToMainThread", "", "runnable", "runInBackground", "lambda", "Lkotlin/Function0;", "schedule", "Ljava/util/concurrent/ScheduledFuture;", "delay", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "task", "scheduleAtFixedRate", "command", "initialDelay", "period", "unit", "me.oriient.sdk-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SdkExecutors {

    @NotNull
    private static final LinkedBlockingDeque<Runnable> BLOCKING_DEQUE;

    @NotNull
    private static final ThreadPoolExecutor POOL_EXECUTOR;
    private static final long POOL_EXECUTOR_KEEP_ALIVE_TIME_MILLI = 100;

    @NotNull
    public static final SdkExecutors INSTANCE = new SdkExecutors();

    @NotNull
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());

    @NotNull
    private static final ScheduledThreadPoolExecutor SCHEDULED_POOL_EXECUTOR = new ScheduledThreadPoolExecutor(4);

    static {
        LinkedBlockingDeque<Runnable> linkedBlockingDeque = new LinkedBlockingDeque<>();
        BLOCKING_DEQUE = linkedBlockingDeque;
        POOL_EXECUTOR = new ThreadPoolExecutor(1, Runtime.getRuntime().availableProcessors(), 100L, TimeUnit.MILLISECONDS, linkedBlockingDeque);
    }

    private SdkExecutors() {
    }

    @JvmStatic
    public static final void postToMainThread(@NotNull Runnable runnable) {
        Intrinsics.h(runnable, "runnable");
        UI_HANDLER.post(runnable);
    }

    @JvmStatic
    public static final void runInBackground(@NotNull Runnable runnable) {
        Intrinsics.h(runnable, "runnable");
        POOL_EXECUTOR.submit(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runInBackground$lambda$0(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @JvmStatic
    @NotNull
    public static final ScheduledFuture<?> schedule(@NotNull Runnable runnable, long delay, @NotNull TimeUnit timeUnit) {
        Intrinsics.h(runnable, "runnable");
        Intrinsics.h(timeUnit, "timeUnit");
        ScheduledFuture<?> scheduledFutureSchedule = SCHEDULED_POOL_EXECUTOR.schedule(runnable, delay, timeUnit);
        Intrinsics.g(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void schedule$lambda$1(Function0 tmp0) {
        Intrinsics.h(tmp0, "$tmp0");
        tmp0.invoke();
    }

    @JvmStatic
    @NotNull
    public static final ScheduledFuture<?> scheduleAtFixedRate(@NotNull Runnable command, long initialDelay, long period, @NotNull TimeUnit unit) {
        Intrinsics.h(command, "command");
        Intrinsics.h(unit, "unit");
        ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = SCHEDULED_POOL_EXECUTOR.scheduleAtFixedRate(command, initialDelay, period, unit);
        Intrinsics.g(scheduledFutureScheduleAtFixedRate, "scheduleAtFixedRate(...)");
        return scheduledFutureScheduleAtFixedRate;
    }

    @JvmStatic
    public static final void runInBackground(@NotNull Function0<Unit> lambda) {
        Intrinsics.h(lambda, "lambda");
        POOL_EXECUTOR.submit(new a(12, lambda));
    }

    @NotNull
    public final ScheduledFuture<?> schedule(long delay, @NotNull TimeUnit timeUnit, @NotNull Function0<Unit> task) {
        Intrinsics.h(timeUnit, "timeUnit");
        Intrinsics.h(task, "task");
        ScheduledFuture<?> scheduledFutureSchedule = SCHEDULED_POOL_EXECUTOR.schedule(new a(11, task), delay, timeUnit);
        Intrinsics.g(scheduledFutureSchedule, "schedule(...)");
        return scheduledFutureSchedule;
    }
}
