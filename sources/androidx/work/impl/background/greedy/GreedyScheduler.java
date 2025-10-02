package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.WorkInfo;
import androidx.work.impl.DefaultRunnableScheduler;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

@RestrictTo
/* loaded from: classes.dex */
public class GreedyScheduler implements Scheduler, OnConstraintsStateChangedListener, ExecutionListener {
    public static final String r = Logger.g("GreedyScheduler");
    public final Context d;
    public final DelayedWorkTracker f;
    public boolean g;
    public final Processor j;
    public final WorkLauncherImpl k;
    public final Configuration l;
    public Boolean n;
    public final WorkConstraintsTracker o;
    public final TaskExecutor p;
    public final TimeLimiter q;
    public final HashMap e = new HashMap();
    public final Object h = new Object();
    public final StartStopTokens i = StartStopTokens.Companion.a(true);
    public final HashMap m = new HashMap();

    public static class AttemptData {

        /* renamed from: a, reason: collision with root package name */
        public final int f3948a;
        public final long b;

        public AttemptData(int i, long j) {
            this.f3948a = i;
            this.b = j;
        }
    }

    public GreedyScheduler(Context context, Configuration configuration, Trackers trackers, Processor processor, WorkLauncherImpl workLauncherImpl, TaskExecutor taskExecutor) {
        this.d = context;
        DefaultRunnableScheduler defaultRunnableScheduler = configuration.g;
        this.f = new DelayedWorkTracker(this, defaultRunnableScheduler, configuration.d);
        this.q = new TimeLimiter(defaultRunnableScheduler, workLauncherImpl);
        this.p = taskExecutor;
        this.o = new WorkConstraintsTracker(trackers);
        this.l = configuration;
        this.j = processor;
        this.k = workLauncherImpl;
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean a() {
        return false;
    }

    @Override // androidx.work.impl.Scheduler
    public final void b(String str) {
        Runnable runnable;
        if (this.n == null) {
            this.n = Boolean.valueOf(ProcessUtils.a(this.d, this.l));
        }
        boolean zBooleanValue = this.n.booleanValue();
        String str2 = r;
        if (!zBooleanValue) {
            Logger.e().f(str2, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.g) {
            this.j.a(this);
            this.g = true;
        }
        Logger.e().a(str2, "Cancelling work ID " + str);
        DelayedWorkTracker delayedWorkTracker = this.f;
        if (delayedWorkTracker != null && (runnable = (Runnable) delayedWorkTracker.d.remove(str)) != null) {
            delayedWorkTracker.b.b(runnable);
        }
        for (StartStopToken startStopToken : this.i.remove(str)) {
            this.q.a(startStopToken);
            this.k.b(startStopToken);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        long jMax;
        if (this.n == null) {
            this.n = Boolean.valueOf(ProcessUtils.a(this.d, this.l));
        }
        if (!this.n.booleanValue()) {
            Logger.e().f(r, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.g) {
            this.j.a(this);
            this.g = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (final WorkSpec workSpec : workSpecArr) {
            if (!this.i.a(WorkSpecKt.a(workSpec))) {
                synchronized (this.h) {
                    try {
                        WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec);
                        AttemptData attemptData = (AttemptData) this.m.get(workGenerationalIdA);
                        if (attemptData == null) {
                            int i = workSpec.k;
                            this.l.d.getClass();
                            attemptData = new AttemptData(i, System.currentTimeMillis());
                            this.m.put(workGenerationalIdA, attemptData);
                        }
                        jMax = (Math.max((workSpec.k - attemptData.f3948a) - 5, 0) * 30000) + attemptData.b;
                    } finally {
                    }
                }
                long jMax2 = Math.max(workSpec.a(), jMax);
                this.l.d.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (workSpec.b == WorkInfo.State.d) {
                    if (jCurrentTimeMillis < jMax2) {
                        final DelayedWorkTracker delayedWorkTracker = this.f;
                        if (delayedWorkTracker != null) {
                            RunnableScheduler runnableScheduler = delayedWorkTracker.b;
                            HashMap map = delayedWorkTracker.d;
                            Runnable runnable = (Runnable) map.remove(workSpec.f3990a);
                            if (runnable != null) {
                                runnableScheduler.b(runnable);
                            }
                            Runnable runnable2 = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Logger loggerE = Logger.e();
                                    String str = DelayedWorkTracker.e;
                                    StringBuilder sb = new StringBuilder("Scheduling work ");
                                    WorkSpec workSpec2 = workSpec;
                                    sb.append(workSpec2.f3990a);
                                    loggerE.a(str, sb.toString());
                                    DelayedWorkTracker.this.f3947a.c(workSpec2);
                                }
                            };
                            map.put(workSpec.f3990a, runnable2);
                            runnableScheduler.a(runnable2, jMax2 - delayedWorkTracker.c.currentTimeMillis());
                        }
                    } else if (workSpec.b()) {
                        Constraints constraints = workSpec.j;
                        if (constraints.d) {
                            Logger.e().a(r, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (constraints.b()) {
                            Logger.e().a(r, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.f3990a);
                        }
                    } else if (!this.i.a(WorkSpecKt.a(workSpec))) {
                        Logger.e().a(r, "Starting work for " + workSpec.f3990a);
                        StartStopToken startStopTokenC = this.i.c(workSpec);
                        this.q.b(startStopTokenC);
                        this.k.c(startStopTokenC, null);
                    }
                }
            }
        }
        synchronized (this.h) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.e().a(r, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        WorkSpec workSpec2 = (WorkSpec) it.next();
                        WorkGenerationalId workGenerationalIdA2 = WorkSpecKt.a(workSpec2);
                        if (!this.e.containsKey(workGenerationalIdA2)) {
                            this.e.put(workGenerationalIdA2, WorkConstraintsTrackerKt.a(this.o, workSpec2, this.p.a(), this));
                        }
                    }
                }
            } finally {
            }
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void d(WorkGenerationalId workGenerationalId, boolean z) {
        Job job;
        StartStopToken startStopTokenB = this.i.b(workGenerationalId);
        if (startStopTokenB != null) {
            this.q.a(startStopTokenB);
        }
        synchronized (this.h) {
            job = (Job) this.e.remove(workGenerationalId);
        }
        if (job != null) {
            Logger.e().a(r, "Stopping tracking for " + workGenerationalId);
            job.cancel((CancellationException) null);
        }
        if (z) {
            return;
        }
        synchronized (this.h) {
            this.m.remove(workGenerationalId);
        }
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void e(WorkSpec workSpec, ConstraintsState constraintsState) {
        WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec);
        boolean z = constraintsState instanceof ConstraintsState.ConstraintsMet;
        WorkLauncherImpl workLauncherImpl = this.k;
        TimeLimiter timeLimiter = this.q;
        String str = r;
        StartStopTokens startStopTokens = this.i;
        if (z) {
            if (startStopTokens.a(workGenerationalIdA)) {
                return;
            }
            Logger.e().a(str, "Constraints met: Scheduling work ID " + workGenerationalIdA);
            StartStopToken startStopTokenD = startStopTokens.d(workGenerationalIdA);
            timeLimiter.b(startStopTokenD);
            workLauncherImpl.c(startStopTokenD, null);
            return;
        }
        Logger.e().a(str, "Constraints not met: Cancelling work ID " + workGenerationalIdA);
        StartStopToken startStopTokenB = startStopTokens.b(workGenerationalIdA);
        if (startStopTokenB != null) {
            timeLimiter.a(startStopTokenB);
            workLauncherImpl.a(startStopTokenB, ((ConstraintsState.ConstraintsNotMet) constraintsState).getF3959a());
        }
    }
}
