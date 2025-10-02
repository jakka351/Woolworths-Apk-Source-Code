package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes6.dex */
public final class ExecutionSequencer {

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$1, reason: invalid class name */
    class AnonymousClass1 implements AsyncCallable<Object> {
        public final String toString() {
            throw null;
        }
    }

    /* renamed from: com.google.common.util.concurrent.ExecutionSequencer$2, reason: invalid class name */
    class AnonymousClass2 implements AsyncCallable<Object> {
        public final String toString() {
            throw null;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RunningState {
        public static final RunningState d;
        public static final /* synthetic */ RunningState[] e;

        /* JADX INFO: Fake field, exist only in values array */
        RunningState EF0;

        static {
            RunningState runningState = new RunningState("NOT_RUN", 0);
            RunningState runningState2 = new RunningState("CANCELLED", 1);
            d = runningState2;
            e = new RunningState[]{runningState, runningState2, new RunningState("STARTED", 2)};
        }

        public static RunningState valueOf(String str) {
            return (RunningState) Enum.valueOf(RunningState.class, str);
        }

        public static RunningState[] values() {
            return (RunningState[]) e.clone();
        }
    }

    public static final class TaskNonReentrantExecutor extends AtomicReference<RunningState> implements Executor, Runnable {
        public Runnable d;
        public Thread e;

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            if (get() == RunningState.d) {
                return;
            }
            this.e = Thread.currentThread();
            try {
                throw null;
            } catch (Throwable th) {
                this.e = null;
                throw th;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (Thread.currentThread() == this.e) {
                throw null;
            }
            Runnable runnable = this.d;
            Objects.requireNonNull(runnable);
            this.d = null;
            runnable.run();
        }
    }

    public static final class ThreadConfinedTaskQueue {
    }
}
