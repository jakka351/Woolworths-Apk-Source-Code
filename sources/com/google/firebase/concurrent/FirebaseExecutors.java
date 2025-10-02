package com.google.firebase.concurrent;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class FirebaseExecutors {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class DirectExecutor implements Executor {
        public static final DirectExecutor d;
        public static final /* synthetic */ DirectExecutor[] e;

        static {
            DirectExecutor directExecutor = new DirectExecutor("INSTANCE", 0);
            d = directExecutor;
            e = new DirectExecutor[]{directExecutor};
        }

        public static DirectExecutor valueOf(String str) {
            return (DirectExecutor) Enum.valueOf(DirectExecutor.class, str);
        }

        public static DirectExecutor[] values() {
            return (DirectExecutor[]) e.clone();
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.run();
        }
    }

    public static Executor a() {
        return DirectExecutor.d;
    }

    public static Executor b(Executor executor) {
        return new SequentialExecutor(executor);
    }
}
