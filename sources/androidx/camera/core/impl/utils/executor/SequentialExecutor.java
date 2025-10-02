package androidx.camera.core.impl.utils.executor;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class SequentialExecutor implements Executor {
    public final Executor e;
    public final ArrayDeque d = new ArrayDeque();
    public final QueueWorker f = new QueueWorker();
    public WorkerRunningState g = WorkerRunningState.d;
    public long h = 0;

    public final class QueueWorker implements Runnable {
        public QueueWorker() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
        
            if (r1 == false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0044, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x004b, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        
            androidx.camera.core.Logger.c("SequentialExecutor", "Exception while executing runnable " + r3, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0034 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L49
                java.util.ArrayDeque r2 = r2.d     // Catch: java.lang.Throwable -> L49
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L49
                if (r0 != 0) goto L28
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = r0.g     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r4 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.g     // Catch: java.lang.Throwable -> L1c
                if (r3 != r4) goto L1e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
            L14:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L3e
            L1c:
                r0 = move-exception
                goto L63
            L1e:
                long r5 = r0.h     // Catch: java.lang.Throwable -> L1c
                r7 = 1
                long r5 = r5 + r7
                r0.h = r5     // Catch: java.lang.Throwable -> L1c
                r0.g = r4     // Catch: java.lang.Throwable -> L1c
                r0 = 1
            L28:
                androidx.camera.core.impl.utils.executor.SequentialExecutor r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                java.util.ArrayDeque r3 = r3.d     // Catch: java.lang.Throwable -> L1c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L1c
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1c
                if (r3 != 0) goto L3f
                androidx.camera.core.impl.utils.executor.SequentialExecutor r0 = androidx.camera.core.impl.utils.executor.SequentialExecutor.this     // Catch: java.lang.Throwable -> L1c
                androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.d     // Catch: java.lang.Throwable -> L1c
                r0.g = r3     // Catch: java.lang.Throwable -> L1c
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                if (r1 == 0) goto L3e
                goto L14
            L3e:
                return
            L3f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L49
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.Throwable -> L49 java.lang.RuntimeException -> L4b
                goto L2
            L49:
                r0 = move-exception
                goto L65
            L4b:
                r2 = move-exception
                java.lang.String r4 = "SequentialExecutor"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L49
                r5.<init>()     // Catch: java.lang.Throwable -> L49
                java.lang.String r6 = "Exception while executing runnable "
                r5.append(r6)     // Catch: java.lang.Throwable -> L49
                r5.append(r3)     // Catch: java.lang.Throwable -> L49
                java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L49
                androidx.camera.core.Logger.c(r4, r3, r2)     // Catch: java.lang.Throwable -> L49
                goto L2
            L63:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
                throw r0     // Catch: java.lang.Throwable -> L49
            L65:
                if (r1 == 0) goto L6e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L6e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.QueueWorker.a():void");
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                a();
            } catch (Error e) {
                synchronized (SequentialExecutor.this.d) {
                    SequentialExecutor.this.g = WorkerRunningState.d;
                    throw e;
                }
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WorkerRunningState {
        public static final WorkerRunningState d;
        public static final WorkerRunningState e;
        public static final WorkerRunningState f;
        public static final WorkerRunningState g;
        public static final /* synthetic */ WorkerRunningState[] h;

        static {
            WorkerRunningState workerRunningState = new WorkerRunningState("IDLE", 0);
            d = workerRunningState;
            WorkerRunningState workerRunningState2 = new WorkerRunningState("QUEUING", 1);
            e = workerRunningState2;
            WorkerRunningState workerRunningState3 = new WorkerRunningState("QUEUED", 2);
            f = workerRunningState3;
            WorkerRunningState workerRunningState4 = new WorkerRunningState("RUNNING", 3);
            g = workerRunningState4;
            h = new WorkerRunningState[]{workerRunningState, workerRunningState2, workerRunningState3, workerRunningState4};
        }

        public static WorkerRunningState valueOf(String str) {
            return (WorkerRunningState) Enum.valueOf(WorkerRunningState.class, str);
        }

        public static WorkerRunningState[] values() {
            return (WorkerRunningState[]) h.clone();
        }
    }

    public SequentialExecutor(Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void execute(final java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.ArrayDeque r0 = r7.d
            monitor-enter(r0)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r7.g     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.g     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r2 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.f     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.h     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$1 r1 = new androidx.camera.core.impl.utils.executor.SequentialExecutor$1     // Catch: java.lang.Throwable -> L6d
            r1.<init>()     // Catch: java.lang.Throwable -> L6d
            java.util.ArrayDeque r8 = r7.d     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r8 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.e     // Catch: java.lang.Throwable -> L6d
            r7.g = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.e     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            androidx.camera.core.impl.utils.executor.SequentialExecutor$QueueWorker r5 = r7.f     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r7.g
            if (r0 == r8) goto L2e
            goto L69
        L2e:
            java.util.ArrayDeque r0 = r7.d
            monitor-enter(r0)
            long r5 = r7.h     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r1 = r7.g     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.g = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.ArrayDeque r2 = r7.d
            monitor-enter(r2)
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r0 = r7.g     // Catch: java.lang.Throwable -> L55
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.d     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            androidx.camera.core.impl.utils.executor.SequentialExecutor$WorkerRunningState r3 = androidx.camera.core.impl.utils.executor.SequentialExecutor.WorkerRunningState.e     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.ArrayDeque r0 = r7.d     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
        L69:
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.ArrayDeque r1 = r7.d     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.executor.SequentialExecutor.execute(java.lang.Runnable):void");
    }
}
