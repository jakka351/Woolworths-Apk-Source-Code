package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@RestrictTo
/* loaded from: classes2.dex */
public class DelayMetCommandHandler implements OnConstraintsStateChangedListener, WorkTimer.TimeLimitExceededListener {
    public static final String r = Logger.g("DelayMetCommandHandler");
    public final Context d;
    public final int e;
    public final WorkGenerationalId f;
    public final SystemAlarmDispatcher g;
    public final WorkConstraintsTracker h;
    public final Object i;
    public int j;
    public final SerialExecutor k;
    public final Executor l;
    public PowerManager.WakeLock m;
    public boolean n;
    public final StartStopToken o;
    public final CoroutineDispatcher p;
    public volatile Job q;

    public DelayMetCommandHandler(Context context, int i, SystemAlarmDispatcher systemAlarmDispatcher, StartStopToken startStopToken) {
        this.d = context;
        this.e = i;
        this.g = systemAlarmDispatcher;
        this.f = startStopToken.f3931a;
        this.o = startStopToken;
        Trackers trackers = systemAlarmDispatcher.h.j;
        TaskExecutor taskExecutor = systemAlarmDispatcher.e;
        this.k = taskExecutor.d();
        this.l = taskExecutor.c();
        this.p = taskExecutor.a();
        this.h = new WorkConstraintsTracker(trackers);
        this.n = false;
        this.j = 0;
        this.i = new Object();
    }

    public static void b(DelayMetCommandHandler delayMetCommandHandler) {
        int i = delayMetCommandHandler.e;
        Executor executor = delayMetCommandHandler.l;
        Context context = delayMetCommandHandler.d;
        SystemAlarmDispatcher systemAlarmDispatcher = delayMetCommandHandler.g;
        WorkGenerationalId workGenerationalId = delayMetCommandHandler.f;
        String str = workGenerationalId.f3985a;
        int i2 = delayMetCommandHandler.j;
        String str2 = r;
        if (i2 >= 2) {
            Logger.e().a(str2, "Already stopped work for " + str);
            return;
        }
        delayMetCommandHandler.j = 2;
        Logger.e().a(str2, "Stopping work for WorkSpec " + str);
        String str3 = CommandHandler.i;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        CommandHandler.c(intent, workGenerationalId);
        executor.execute(new SystemAlarmDispatcher.AddRunnable(i, intent, systemAlarmDispatcher));
        if (!systemAlarmDispatcher.g.e(workGenerationalId.f3985a)) {
            Logger.e().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        Logger.e().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        CommandHandler.c(intent2, workGenerationalId);
        executor.execute(new SystemAlarmDispatcher.AddRunnable(i, intent2, systemAlarmDispatcher));
    }

    public static void c(DelayMetCommandHandler delayMetCommandHandler) {
        if (delayMetCommandHandler.j != 0) {
            Logger.e().a(r, "Already started work for " + delayMetCommandHandler.f);
            return;
        }
        delayMetCommandHandler.j = 1;
        Logger.e().a(r, "onAllConstraintsMet for " + delayMetCommandHandler.f);
        if (!delayMetCommandHandler.g.g.g(delayMetCommandHandler.o, null)) {
            delayMetCommandHandler.d();
            return;
        }
        WorkTimer workTimer = delayMetCommandHandler.g.f;
        WorkGenerationalId workGenerationalId = delayMetCommandHandler.f;
        synchronized (workTimer.d) {
            Logger.e().a(WorkTimer.e, "Starting timer for " + workGenerationalId);
            workTimer.a(workGenerationalId);
            WorkTimer.WorkTimerRunnable workTimerRunnable = new WorkTimer.WorkTimerRunnable(workTimer, workGenerationalId);
            workTimer.b.put(workGenerationalId, workTimerRunnable);
            workTimer.c.put(workGenerationalId, delayMetCommandHandler);
            workTimer.f4008a.a(workTimerRunnable, 600000L);
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public final void a(WorkGenerationalId workGenerationalId) {
        Logger.e().a(r, "Exceeded time limits on execution for " + workGenerationalId);
        this.k.execute(new a(this, 0));
    }

    public final void d() {
        synchronized (this.i) {
            try {
                if (this.q != null) {
                    ((JobSupport) this.q).cancel((CancellationException) null);
                }
                this.g.f.a(this.f);
                PowerManager.WakeLock wakeLock = this.m;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger.e().a(r, "Releasing wakelock " + this.m + "for WorkSpec " + this.f);
                    this.m.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void e(WorkSpec workSpec, ConstraintsState constraintsState) {
        boolean z = constraintsState instanceof ConstraintsState.ConstraintsMet;
        SerialExecutor serialExecutor = this.k;
        if (z) {
            serialExecutor.execute(new a(this, 1));
        } else {
            serialExecutor.execute(new a(this, 0));
        }
    }

    public final void f() {
        String str = this.f.f3985a;
        Context context = this.d;
        StringBuilder sbT = YU.a.t(str, " (");
        sbT.append(this.e);
        sbT.append(")");
        this.m = WakeLocks.b(context, sbT.toString());
        Logger loggerE = Logger.e();
        String str2 = r;
        loggerE.a(str2, "Acquiring wakelock " + this.m + "for WorkSpec " + str);
        this.m.acquire();
        WorkSpec workSpecT = this.g.h.c.z().t(str);
        if (workSpecT == null) {
            this.k.execute(new a(this, 0));
            return;
        }
        boolean zB = workSpecT.b();
        this.n = zB;
        if (zB) {
            this.q = WorkConstraintsTrackerKt.a(this.h, workSpecT, this.p, this);
        } else {
            Logger.e().a(str2, "No constraints for ".concat(str));
            this.k.execute(new a(this, 1));
        }
    }

    public final void g(boolean z) {
        Logger loggerE = Logger.e();
        StringBuilder sb = new StringBuilder("onExecuted ");
        WorkGenerationalId workGenerationalId = this.f;
        sb.append(workGenerationalId);
        sb.append(", ");
        sb.append(z);
        loggerE.a(r, sb.toString());
        d();
        int i = this.e;
        SystemAlarmDispatcher systemAlarmDispatcher = this.g;
        Executor executor = this.l;
        Context context = this.d;
        if (z) {
            String str = CommandHandler.i;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            CommandHandler.c(intent, workGenerationalId);
            executor.execute(new SystemAlarmDispatcher.AddRunnable(i, intent, systemAlarmDispatcher));
        }
        if (this.n) {
            String str2 = CommandHandler.i;
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            executor.execute(new SystemAlarmDispatcher.AddRunnable(i, intent2, systemAlarmDispatcher));
        }
    }
}
