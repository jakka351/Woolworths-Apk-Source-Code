package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Processor;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkLauncher;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

@RestrictTo
/* loaded from: classes2.dex */
public class SystemAlarmDispatcher implements ExecutionListener {
    public static final String o = Logger.g("SystemAlarmDispatcher");
    public final Context d;
    public final TaskExecutor e;
    public final WorkTimer f;
    public final Processor g;
    public final WorkManagerImpl h;
    public final CommandHandler i;
    public final ArrayList j;
    public Intent k;
    public SystemAlarmService l;
    public final StartStopTokens m;
    public final WorkLauncher n;

    public static class AddRunnable implements Runnable {
        public final SystemAlarmDispatcher d;
        public final Intent e;
        public final int f;

        public AddRunnable(int i, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
            this.d = systemAlarmDispatcher;
            this.e = intent;
            this.f = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Intent intent = this.e;
            this.d.a(this.f, intent);
        }
    }

    public interface CommandsCompletedListener {
    }

    public static class DequeueAndCheckForCompletion implements Runnable {
        public final SystemAlarmDispatcher d;

        public DequeueAndCheckForCompletion(SystemAlarmDispatcher systemAlarmDispatcher) {
            this.d = systemAlarmDispatcher;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[Catch: all -> 0x0043, TryCatch #0 {all -> 0x0043, blocks: (B:4:0x0015, B:6:0x0019, B:8:0x003f, B:11:0x0045, B:12:0x004c, B:13:0x004d, B:14:0x0057, B:18:0x0061, B:20:0x0069, B:21:0x006b, B:25:0x0075, B:27:0x0082, B:35:0x00a5, B:31:0x0099, B:32:0x009a, B:34:0x00a2, B:39:0x00a9, B:22:0x006c, B:23:0x0072, B:15:0x0058, B:16:0x005e), top: B:42:0x0015, inners: #1, #2 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r6 = this;
                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher r0 = r6.d
                java.lang.String r1 = "Removing command "
                androidx.work.Logger r2 = androidx.work.Logger.e()
                java.lang.String r3 = androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.o
                java.lang.String r4 = "Checking if commands are complete."
                r2.a(r3, r4)
                androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.b()
                java.util.ArrayList r2 = r0.j
                monitor-enter(r2)
                android.content.Intent r4 = r0.k     // Catch: java.lang.Throwable -> L43
                if (r4 == 0) goto L4d
                androidx.work.Logger r4 = androidx.work.Logger.e()     // Catch: java.lang.Throwable -> L43
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
                r5.<init>(r1)     // Catch: java.lang.Throwable -> L43
                android.content.Intent r1 = r0.k     // Catch: java.lang.Throwable -> L43
                r5.append(r1)     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L43
                r4.a(r3, r1)     // Catch: java.lang.Throwable -> L43
                java.util.ArrayList r1 = r0.j     // Catch: java.lang.Throwable -> L43
                r4 = 0
                java.lang.Object r1 = r1.remove(r4)     // Catch: java.lang.Throwable -> L43
                android.content.Intent r1 = (android.content.Intent) r1     // Catch: java.lang.Throwable -> L43
                android.content.Intent r4 = r0.k     // Catch: java.lang.Throwable -> L43
                boolean r1 = r1.equals(r4)     // Catch: java.lang.Throwable -> L43
                if (r1 == 0) goto L45
                r1 = 0
                r0.k = r1     // Catch: java.lang.Throwable -> L43
                goto L4d
            L43:
                r0 = move-exception
                goto Laa
            L45:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L43
                java.lang.String r1 = "Dequeue-d command is not the first."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L43
                throw r0     // Catch: java.lang.Throwable -> L43
            L4d:
                androidx.work.impl.utils.taskexecutor.TaskExecutor r1 = r0.e     // Catch: java.lang.Throwable -> L43
                androidx.work.impl.utils.SerialExecutorImpl r1 = r1.d()     // Catch: java.lang.Throwable -> L43
                androidx.work.impl.background.systemalarm.CommandHandler r4 = r0.i     // Catch: java.lang.Throwable -> L43
                java.lang.Object r5 = r4.f     // Catch: java.lang.Throwable -> L43
                monitor-enter(r5)     // Catch: java.lang.Throwable -> L43
                java.util.HashMap r4 = r4.e     // Catch: java.lang.Throwable -> La7
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> La7
                monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
                if (r4 == 0) goto L9a
                java.util.ArrayList r4 = r0.j     // Catch: java.lang.Throwable -> L43
                boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L43
                if (r4 == 0) goto L9a
                java.lang.Object r4 = r1.g     // Catch: java.lang.Throwable -> L43
                monitor-enter(r4)     // Catch: java.lang.Throwable -> L43
                java.util.ArrayDeque r1 = r1.d     // Catch: java.lang.Throwable -> L97
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L97
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L97
                if (r1 == 0) goto L9a
                androidx.work.Logger r1 = androidx.work.Logger.e()     // Catch: java.lang.Throwable -> L43
                java.lang.String r4 = "No more commands & intents."
                r1.a(r3, r4)     // Catch: java.lang.Throwable -> L43
                androidx.work.impl.background.systemalarm.SystemAlarmService r0 = r0.l     // Catch: java.lang.Throwable -> L43
                if (r0 == 0) goto La5
                r1 = 1
                r0.f = r1     // Catch: java.lang.Throwable -> L43
                androidx.work.Logger r1 = androidx.work.Logger.e()     // Catch: java.lang.Throwable -> L43
                java.lang.String r3 = androidx.work.impl.background.systemalarm.SystemAlarmService.g     // Catch: java.lang.Throwable -> L43
                java.lang.String r4 = "All commands completed in dispatcher"
                r1.a(r3, r4)     // Catch: java.lang.Throwable -> L43
                androidx.work.impl.utils.WakeLocks.a()     // Catch: java.lang.Throwable -> L43
                r0.stopSelf()     // Catch: java.lang.Throwable -> L43
                goto La5
            L97:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L97
                throw r0     // Catch: java.lang.Throwable -> L43
            L9a:
                java.util.ArrayList r1 = r0.j     // Catch: java.lang.Throwable -> L43
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L43
                if (r1 != 0) goto La5
                r0.c()     // Catch: java.lang.Throwable -> L43
            La5:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
                return
            La7:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> La7
                throw r0     // Catch: java.lang.Throwable -> L43
            Laa:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L43
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.DequeueAndCheckForCompletion.run():void");
        }
    }

    public SystemAlarmDispatcher(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.d = applicationContext;
        StartStopTokens startStopTokensA = StartStopTokens.Companion.a(true);
        this.m = startStopTokensA;
        WorkManagerImpl workManagerImplE = WorkManagerImpl.e(systemAlarmService);
        this.h = workManagerImplE;
        this.i = new CommandHandler(applicationContext, workManagerImplE.b.d, startStopTokensA);
        this.f = new WorkTimer(workManagerImplE.b.g);
        Processor processor = workManagerImplE.f;
        this.g = processor;
        TaskExecutor taskExecutor = workManagerImplE.d;
        this.e = taskExecutor;
        this.n = new WorkLauncherImpl(processor, taskExecutor);
        processor.a(this);
        this.j = new ArrayList();
        this.k = null;
    }

    public static void b() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i, Intent intent) {
        Logger loggerE = Logger.e();
        String str = o;
        loggerE.a(str, "Adding command " + intent + " (" + i + ")");
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            Logger.e().h(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            b();
            synchronized (this.j) {
                try {
                    Iterator it = this.j.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i);
        synchronized (this.j) {
            try {
                boolean zIsEmpty = this.j.isEmpty();
                this.j.add(intent);
                if (zIsEmpty) {
                    c();
                }
            } finally {
            }
        }
    }

    public final void c() {
        b();
        PowerManager.WakeLock wakeLockB = WakeLocks.b(this.d, "ProcessCommand");
        try {
            wakeLockB.acquire();
            this.h.d.b(new Runnable() { // from class: androidx.work.impl.background.systemalarm.SystemAlarmDispatcher.1
                @Override // java.lang.Runnable
                public final void run() {
                    Executor executorC;
                    DequeueAndCheckForCompletion dequeueAndCheckForCompletion;
                    synchronized (SystemAlarmDispatcher.this.j) {
                        SystemAlarmDispatcher systemAlarmDispatcher = SystemAlarmDispatcher.this;
                        systemAlarmDispatcher.k = (Intent) systemAlarmDispatcher.j.get(0);
                    }
                    Intent intent = SystemAlarmDispatcher.this.k;
                    if (intent != null) {
                        String action = intent.getAction();
                        int intExtra = SystemAlarmDispatcher.this.k.getIntExtra("KEY_START_ID", 0);
                        Logger loggerE = Logger.e();
                        String str = SystemAlarmDispatcher.o;
                        loggerE.a(str, "Processing command " + SystemAlarmDispatcher.this.k + ", " + intExtra);
                        PowerManager.WakeLock wakeLockB2 = WakeLocks.b(SystemAlarmDispatcher.this.d, action + " (" + intExtra + ")");
                        try {
                            Logger.e().a(str, "Acquiring operation wake lock (" + action + ") " + wakeLockB2);
                            wakeLockB2.acquire();
                            SystemAlarmDispatcher systemAlarmDispatcher2 = SystemAlarmDispatcher.this;
                            systemAlarmDispatcher2.i.a(intExtra, systemAlarmDispatcher2.k, systemAlarmDispatcher2);
                            Logger.e().a(str, "Releasing operation wake lock (" + action + ") " + wakeLockB2);
                            wakeLockB2.release();
                            executorC = SystemAlarmDispatcher.this.e.c();
                            dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                        } catch (Throwable th) {
                            try {
                                Logger loggerE2 = Logger.e();
                                String str2 = SystemAlarmDispatcher.o;
                                loggerE2.d(str2, "Unexpected error in onHandleIntent", th);
                                Logger.e().a(str2, "Releasing operation wake lock (" + action + ") " + wakeLockB2);
                                wakeLockB2.release();
                                executorC = SystemAlarmDispatcher.this.e.c();
                                dequeueAndCheckForCompletion = new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this);
                            } catch (Throwable th2) {
                                Logger.e().a(SystemAlarmDispatcher.o, "Releasing operation wake lock (" + action + ") " + wakeLockB2);
                                wakeLockB2.release();
                                SystemAlarmDispatcher.this.e.c().execute(new DequeueAndCheckForCompletion(SystemAlarmDispatcher.this));
                                throw th2;
                            }
                        }
                        executorC.execute(dequeueAndCheckForCompletion);
                    }
                }
            });
        } finally {
            wakeLockB.release();
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void d(WorkGenerationalId workGenerationalId, boolean z) {
        Executor executorC = this.e.c();
        String str = CommandHandler.i;
        Intent intent = new Intent(this.d, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        CommandHandler.c(intent, workGenerationalId);
        executorC.execute(new AddRunnable(0, intent, this));
    }
}
