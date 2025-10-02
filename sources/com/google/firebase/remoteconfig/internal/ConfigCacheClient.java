package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import androidx.annotation.AnyThread;
import coil3.decode.d;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@AnyThread
/* loaded from: classes.dex */
public class ConfigCacheClient {
    public static final HashMap d = new HashMap();
    public static final androidx.arch.core.executor.a e = new androidx.arch.core.executor.a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Executor f15760a;
    public final ConfigStorageClient b;
    public Task c = null;

    public static class AwaitListener<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        public final CountDownLatch d = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.d.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(Exception exc) {
            this.d.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(Object obj) {
            this.d.countDown();
        }
    }

    public ConfigCacheClient(Executor executor, ConfigStorageClient configStorageClient) {
        this.f15760a = executor;
        this.b = configStorageClient;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AwaitListener awaitListener = new AwaitListener();
        Executor executor = e;
        task.addOnSuccessListener(executor, awaitListener);
        task.addOnFailureListener(executor, awaitListener);
        task.addOnCanceledListener(executor, awaitListener);
        if (!awaitListener.d.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task b() {
        try {
            Task task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                this.c = Tasks.call(this.f15760a, new d(this.b, 2));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }

    public final ConfigContainer c() {
        synchronized (this) {
            try {
                Task task = this.c;
                if (task != null && task.isSuccessful()) {
                    return (ConfigContainer) this.c.getResult();
                }
                try {
                    Task taskB = b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (ConfigContainer) a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                    Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task d(final ConfigContainer configContainer) {
        Callable callable = new Callable() { // from class: com.google.firebase.remoteconfig.internal.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ConfigCacheClient configCacheClient = this.d;
                ConfigContainer configContainer2 = configContainer;
                ConfigStorageClient configStorageClient = configCacheClient.b;
                synchronized (configStorageClient) {
                    FileOutputStream fileOutputStreamOpenFileOutput = configStorageClient.f15773a.openFileOutput(configStorageClient.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(configContainer2.f15761a.toString().getBytes("UTF-8"));
                    } finally {
                        fileOutputStreamOpenFileOutput.close();
                    }
                }
                return null;
            }
        };
        Executor executor = this.f15760a;
        return Tasks.call(executor, callable).onSuccessTask(executor, new androidx.work.d(4, this, configContainer));
    }
}
