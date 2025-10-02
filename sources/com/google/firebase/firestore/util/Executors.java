package com.google.firebase.firestore.util;

import android.os.AsyncTask;
import com.google.android.gms.tasks.TaskExecutors;
import java.util.concurrent.Executor;

/* loaded from: classes6.dex */
public final class Executors {

    /* renamed from: a, reason: collision with root package name */
    public static final Executor f15600a = TaskExecutors.MAIN_THREAD;
    public static final androidx.arch.core.executor.a b = new androidx.arch.core.executor.a(2);
    public static final Executor c;

    static {
        Executor executor = AsyncTask.THREAD_POOL_EXECUTOR;
        c = new ThrottledForwardingExecutor();
    }
}
