package okhttp3.internal.concurrent;

import YU.a;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilJvmKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "AwaitIdleTask", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TaskQueue {

    /* renamed from: a, reason: collision with root package name */
    public final TaskRunner f26707a;
    public final String b;
    public boolean c;
    public Task d;
    public final ArrayList e;
    public boolean f;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public static final class AwaitIdleTask extends Task {
        public final CountDownLatch e;

        public AwaitIdleTask() {
            super(a.o(new StringBuilder(), _UtilJvmKt.b, " awaitIdle"), false);
            this.e = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long a() {
            this.e.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        Intrinsics.h(name, "name");
        this.f26707a = taskRunner;
        this.b = name;
        this.e = new ArrayList();
    }

    public static void b(TaskQueue taskQueue, final String name, long j, final Function0 block, int i) {
        if ((i & 2) != 0) {
            j = 0;
        }
        final boolean z = (i & 4) != 0;
        taskQueue.getClass();
        Intrinsics.h(name, "name");
        Intrinsics.h(block, "block");
        taskQueue.c(new Task(z, name) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public final long a() {
                block.invoke();
                return -1L;
            }
        }, j);
    }

    public final boolean a() {
        Task task = this.d;
        if (task != null && task.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((Task) arrayList.get(size)).b) {
                Logger logger = this.f26707a.e;
                Task task2 = (Task) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(Task task, long j) {
        Intrinsics.h(task, "task");
        synchronized (this.f26707a) {
            if (!this.c) {
                if (e(task, j, false)) {
                    this.f26707a.c(this);
                }
            } else if (task.b) {
                Logger logger = this.f26707a.e;
                if (logger.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger, task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                Logger logger2 = this.f26707a.e;
                if (logger2.isLoggable(Level.FINE)) {
                    TaskLoggerKt.a(logger2, task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean e(okhttp3.internal.concurrent.Task r12, long r13, boolean r15) {
        /*
            r11 = this;
            okhttp3.internal.concurrent.TaskRunner r0 = r11.f26707a
            java.util.logging.Logger r0 = r0.e
            java.lang.String r1 = "task"
            kotlin.jvm.internal.Intrinsics.h(r12, r1)
            okhttp3.internal.concurrent.TaskQueue r1 = r12.c
            if (r1 != r11) goto Le
            goto L12
        Le:
            if (r1 != 0) goto L8a
            r12.c = r11
        L12:
            long r1 = java.lang.System.nanoTime()
            long r3 = r1 + r13
            java.util.ArrayList r5 = r11.e
            int r6 = r5.indexOf(r12)
            r7 = 0
            r8 = -1
            if (r6 == r8) goto L39
            long r9 = r12.d
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 > 0) goto L36
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r13 = r0.isLoggable(r13)
            if (r13 == 0) goto L89
            java.lang.String r13 = "already scheduled"
            okhttp3.internal.concurrent.TaskLoggerKt.a(r0, r12, r11, r13)
            return r7
        L36:
            r5.remove(r6)
        L39:
            r12.d = r3
            java.util.logging.Level r6 = java.util.logging.Level.FINE
            boolean r6 = r0.isLoggable(r6)
            if (r6 == 0) goto L5f
            if (r15 == 0) goto L51
            long r3 = r3 - r1
            java.lang.String r15 = okhttp3.internal.concurrent.TaskLoggerKt.b(r3)
            java.lang.String r3 = "run again after "
            java.lang.String r15 = r3.concat(r15)
            goto L5c
        L51:
            long r3 = r3 - r1
            java.lang.String r15 = okhttp3.internal.concurrent.TaskLoggerKt.b(r3)
            java.lang.String r3 = "scheduled after "
            java.lang.String r15 = r3.concat(r15)
        L5c:
            okhttp3.internal.concurrent.TaskLoggerKt.a(r0, r12, r11, r15)
        L5f:
            java.util.Iterator r15 = r5.iterator()
            r0 = r7
        L64:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L7b
            java.lang.Object r3 = r15.next()
            okhttp3.internal.concurrent.Task r3 = (okhttp3.internal.concurrent.Task) r3
            long r3 = r3.d
            long r3 = r3 - r1
            int r3 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r3 <= 0) goto L78
            goto L7c
        L78:
            int r0 = r0 + 1
            goto L64
        L7b:
            r0 = r8
        L7c:
            if (r0 != r8) goto L82
            int r0 = r5.size()
        L82:
            r5.add(r0, r12)
            if (r0 != 0) goto L89
            r12 = 1
            return r12
        L89:
            return r7
        L8a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "task is in multiple queues"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.concurrent.TaskQueue.e(okhttp3.internal.concurrent.Task, long, boolean):boolean");
    }

    public final void f() {
        TaskRunner taskRunner = this.f26707a;
        TimeZone timeZone = _UtilJvmKt.f26699a;
        synchronized (taskRunner) {
            this.c = true;
            if (a()) {
                this.f26707a.c(this);
            }
        }
    }

    /* renamed from: toString, reason: from getter */
    public final String getB() {
        return this.b;
    }
}
