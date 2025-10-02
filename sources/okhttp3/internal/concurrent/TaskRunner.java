package okhttp3.internal.concurrent;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "Lokhttp3/internal/concurrent/Lockable;", "Backend", "RealBackend", "Companion", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TaskRunner implements Lockable {
    public static final Logger n;
    public static final TaskRunner o;
    public final RealBackend d;
    public final Logger e;
    public int f;
    public boolean g;
    public long h;
    public int i;
    public int j;
    public final ArrayList k;
    public final ArrayList l;
    public final TaskRunner$runnable$1 m;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002À\u0006\u0003"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Backend {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(int i) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "okhttp"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @SourceDebugExtension
    public static final class RealBackend implements Backend {

        /* renamed from: a, reason: collision with root package name */
        public final ThreadPoolExecutor f26708a;

        public RealBackend(a aVar) {
            this.f26708a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), aVar);
        }
    }

    static {
        new Companion(0);
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        Intrinsics.g(logger, "getLogger(...)");
        n = logger;
        String name = _UtilJvmKt.b + " TaskRunner";
        Intrinsics.h(name, "name");
        o = new TaskRunner(new RealBackend(new a(name, true)));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [okhttp3.internal.concurrent.TaskRunner$runnable$1] */
    public TaskRunner(RealBackend realBackend) {
        Logger logger = n;
        Intrinsics.h(logger, "logger");
        this.d = realBackend;
        this.e = logger;
        this.f = ModuleDescriptor.MODULE_VERSION;
        this.k = new ArrayList();
        this.l = new ArrayList();
        this.m = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public final void run() {
                Task taskB;
                long jNanoTime;
                Task taskB2;
                TaskRunner taskRunner = this.d;
                synchronized (taskRunner) {
                    taskRunner.j++;
                    taskB = taskRunner.b();
                }
                if (taskB == null) {
                    return;
                }
                Thread threadCurrentThread = Thread.currentThread();
                String name = threadCurrentThread.getName();
                while (true) {
                    try {
                        threadCurrentThread.setName(taskB.f26706a);
                        Logger logger2 = this.d.e;
                        TaskQueue taskQueue = taskB.c;
                        Intrinsics.e(taskQueue);
                        boolean zIsLoggable = logger2.isLoggable(Level.FINE);
                        if (zIsLoggable) {
                            jNanoTime = System.nanoTime();
                            TaskLoggerKt.a(logger2, taskB, taskQueue, "starting");
                        } else {
                            jNanoTime = -1;
                        }
                        try {
                            long jA = taskB.a();
                            if (zIsLoggable) {
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "finished run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            TaskRunner taskRunner2 = this.d;
                            synchronized (taskRunner2) {
                                TaskRunner.a(taskRunner2, taskB, jA, true);
                                taskB2 = taskRunner2.b();
                            }
                            if (taskB2 == null) {
                                threadCurrentThread.setName(name);
                                return;
                            }
                            taskB = taskB2;
                        } catch (Throwable th) {
                            if (zIsLoggable) {
                                TaskLoggerKt.a(logger2, taskB, taskQueue, "failed a run in " + TaskLoggerKt.b(System.nanoTime() - jNanoTime));
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        try {
                            TaskRunner taskRunner3 = this.d;
                            synchronized (taskRunner3) {
                                TaskRunner.a(taskRunner3, taskB, -1L, false);
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            threadCurrentThread.setName(name);
                            throw th3;
                        }
                    }
                }
            }
        };
    }

    public static final void a(TaskRunner taskRunner, Task task, long j, boolean z) {
        TimeZone timeZone = _UtilJvmKt.f26699a;
        TaskQueue taskQueue = task.c;
        Intrinsics.e(taskQueue);
        if (taskQueue.d != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean z2 = taskQueue.f;
        taskQueue.f = false;
        taskQueue.d = null;
        taskRunner.k.remove(taskQueue);
        if (j != -1 && !z2 && !taskQueue.c) {
            taskQueue.e(task, j, true);
        }
        if (taskQueue.e.isEmpty()) {
            return;
        }
        taskRunner.l.add(taskQueue);
        if (z) {
            return;
        }
        taskRunner.e();
    }

    public final Task b() {
        boolean z;
        TimeZone timeZone = _UtilJvmKt.f26699a;
        while (true) {
            ArrayList arrayList = this.l;
            if (arrayList.isEmpty()) {
                break;
            }
            long jNanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).e.get(0);
                long jMax = Math.max(0L, task2.d - jNanoTime);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z = true;
                        break;
                    }
                    task = task2;
                }
            }
            ArrayList arrayList2 = this.k;
            if (task != null) {
                TimeZone timeZone2 = _UtilJvmKt.f26699a;
                task.d = -1L;
                TaskQueue taskQueue = task.c;
                Intrinsics.e(taskQueue);
                taskQueue.e.remove(task);
                arrayList.remove(taskQueue);
                taskQueue.d = task;
                arrayList2.add(taskQueue);
                if (z || (!this.g && !arrayList.isEmpty())) {
                    e();
                }
                return task;
            }
            if (!this.g) {
                this.g = true;
                this.h = jNanoTime + jMin;
                try {
                    try {
                        TimeZone timeZone3 = _UtilJvmKt.f26699a;
                        if (jMin > 0) {
                            long j = jMin / 1000000;
                            long j2 = jMin - (1000000 * j);
                            if (j > 0 || jMin > 0) {
                                wait(j, (int) j2);
                            }
                        }
                    } catch (InterruptedException unused) {
                        TimeZone timeZone4 = _UtilJvmKt.f26699a;
                        for (int size = arrayList2.size() - 1; -1 < size; size--) {
                            ((TaskQueue) arrayList2.get(size)).a();
                        }
                        for (int size2 = arrayList.size() - 1; -1 < size2; size2--) {
                            TaskQueue taskQueue2 = (TaskQueue) arrayList.get(size2);
                            taskQueue2.a();
                            if (taskQueue2.e.isEmpty()) {
                                arrayList.remove(size2);
                            }
                        }
                    }
                } finally {
                    this.g = false;
                }
            } else if (jMin < this.h - jNanoTime) {
                notify();
            }
        }
        return null;
    }

    public final void c(TaskQueue taskQueue) {
        Intrinsics.h(taskQueue, "taskQueue");
        TimeZone timeZone = _UtilJvmKt.f26699a;
        if (taskQueue.d == null) {
            boolean zIsEmpty = taskQueue.e.isEmpty();
            ArrayList arrayList = this.l;
            if (zIsEmpty) {
                arrayList.remove(taskQueue);
            } else {
                byte[] bArr = _UtilCommonKt.f26698a;
                Intrinsics.h(arrayList, "<this>");
                if (!arrayList.contains(taskQueue)) {
                    arrayList.add(taskQueue);
                }
            }
        }
        if (this.g) {
            notify();
        } else {
            e();
        }
    }

    public final TaskQueue d() {
        int i;
        synchronized (this) {
            i = this.f;
            this.f = i + 1;
        }
        return new TaskQueue(this, YU.a.d(i, "Q"));
    }

    public final void e() {
        TimeZone timeZone = _UtilJvmKt.f26699a;
        int i = this.i;
        if (i > this.j) {
            return;
        }
        this.i = i + 1;
        TaskRunner$runnable$1 runnable = this.m;
        Intrinsics.h(runnable, "runnable");
        this.d.f26708a.execute(runnable);
    }
}
