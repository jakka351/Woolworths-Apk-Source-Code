package com.google.firebase.crashlytics.internal.concurrency;

import androidx.compose.runtime.snapshots.a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class CrashlyticsWorker implements Executor {
    public final ExecutorService d;
    public final Object e = new Object();
    public Task f = Tasks.forResult(null);

    public CrashlyticsWorker(ExecutorService executorService) {
        this.d = executorService;
    }

    public final Task a(Runnable runnable) {
        Task taskContinueWithTask;
        synchronized (this.e) {
            taskContinueWithTask = this.f.continueWithTask(this.d, new a(runnable, 9));
            this.f = taskContinueWithTask;
        }
        return taskContinueWithTask;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(runnable);
    }
}
