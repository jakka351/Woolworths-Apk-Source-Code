package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@RestrictTo
/* loaded from: classes.dex */
public interface TaskExecutor {
    default CoroutineDispatcher a() {
        return ExecutorsKt.a(d());
    }

    default void b(Runnable runnable) {
        d().execute(runnable);
    }

    Executor c();

    SerialExecutorImpl d();
}
