package com.google.firebase.crashlytics.internal.concurrency;

import androidx.arch.core.executor.a;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class CrashlyticsTasks {

    /* renamed from: a, reason: collision with root package name */
    public static final a f15285a = new a(2);

    public static Task a(Task task, Task task2) {
        CancellationTokenSource cancellationTokenSource = new CancellationTokenSource();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationTokenSource.getToken());
        com.adobe.marketing.mobile.launch.rulesengine.download.a aVar = new com.adobe.marketing.mobile.launch.rulesengine.download.a(1, taskCompletionSource, new AtomicBoolean(false), cancellationTokenSource);
        a aVar2 = f15285a;
        task.continueWithTask(aVar2, aVar);
        task2.continueWithTask(aVar2, aVar);
        return taskCompletionSource.getTask();
    }
}
