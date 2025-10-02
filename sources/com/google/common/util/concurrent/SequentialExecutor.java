package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.Executor;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
final class SequentialExecutor implements Executor {
    public static final /* synthetic */ int d = 0;

    /* renamed from: com.google.common.util.concurrent.SequentialExecutor$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public final class QueueWorker implements Runnable {
        @Override // java.lang.Runnable
        public final void run() {
            try {
                int i = SequentialExecutor.d;
                throw null;
            } catch (Error unused) {
                int i2 = SequentialExecutor.d;
                throw null;
            }
        }

        public final String toString() {
            Object obj = null;
            obj.getClass();
            return "SequentialExecutorWorker{running=null}";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class WorkerRunningState {
        public static final /* synthetic */ WorkerRunningState[] d = {new WorkerRunningState("IDLE", 0), new WorkerRunningState("QUEUING", 1), new WorkerRunningState("QUEUED", 2), new WorkerRunningState("RUNNING", 3)};

        /* JADX INFO: Fake field, exist only in values array */
        WorkerRunningState EF5;

        public static WorkerRunningState valueOf(String str) {
            return (WorkerRunningState) Enum.valueOf(WorkerRunningState.class, str);
        }

        public static WorkerRunningState[] values() {
            return (WorkerRunningState[]) d.clone();
        }
    }

    static {
        new LazyLogger(SequentialExecutor.class);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        throw null;
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{null}";
    }
}
