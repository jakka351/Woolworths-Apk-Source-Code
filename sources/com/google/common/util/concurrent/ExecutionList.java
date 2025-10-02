package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.concurrent.Executor;
import java.util.logging.Level;

@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes6.dex */
public final class ExecutionList {
    public static final LazyLogger c = new LazyLogger(ExecutionList.class);

    /* renamed from: a, reason: collision with root package name */
    public RunnableExecutorPair f14963a;
    public boolean b;

    public static final class RunnableExecutorPair {

        /* renamed from: a, reason: collision with root package name */
        public final Runnable f14964a;
        public final Executor b;
        public RunnableExecutorPair c;

        public RunnableExecutorPair(Runnable runnable, Executor executor, RunnableExecutorPair runnableExecutorPair) {
            this.f14964a = runnable;
            this.b = executor;
            this.c = runnableExecutorPair;
        }
    }

    public static void a(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            c.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }
}
