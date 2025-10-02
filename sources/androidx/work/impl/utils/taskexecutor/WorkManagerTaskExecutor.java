package androidx.work.impl.utils.taskexecutor;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.work.impl.utils.SerialExecutorImpl;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;

@RestrictTo
/* loaded from: classes.dex */
public class WorkManagerTaskExecutor implements TaskExecutor {

    /* renamed from: a, reason: collision with root package name */
    public final SerialExecutorImpl f4014a;
    public final CoroutineDispatcher b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final Executor d = new Executor() { // from class: androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor.1
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            WorkManagerTaskExecutor.this.c.post(runnable);
        }
    };

    public WorkManagerTaskExecutor(ExecutorService executorService) {
        SerialExecutorImpl serialExecutorImpl = new SerialExecutorImpl(executorService);
        this.f4014a = serialExecutorImpl;
        this.b = ExecutorsKt.a(serialExecutorImpl);
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final CoroutineDispatcher a() {
        return this.b;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final Executor c() {
        return this.d;
    }

    @Override // androidx.work.impl.utils.taskexecutor.TaskExecutor
    public final SerialExecutorImpl d() {
        return this.f4014a;
    }
}
