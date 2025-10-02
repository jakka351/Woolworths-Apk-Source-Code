package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.WithinAppServiceBinder;
import com.google.firebase.messaging.threads.PoolableExecutors;
import java.util.concurrent.ExecutorService;

@SuppressLint
/* loaded from: classes6.dex */
public abstract class EnhancedIntentService extends Service {
    static final long MESSAGE_TIMEOUT_S = 20;
    private static final String TAG = "EnhancedIntentService";
    public static final /* synthetic */ int d = 0;
    private Binder binder;
    private int lastStartId;

    @VisibleForTesting
    final ExecutorService executor = PoolableExecutors.b.a(new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
    private final Object lock = new Object();
    private int runningTasks = 0;

    /* renamed from: com.google.firebase.messaging.EnhancedIntentService$1, reason: invalid class name */
    public class AnonymousClass1 implements WithinAppServiceBinder.IntentHandler {
        public AnonymousClass1() {
        }
    }

    public final void a(Intent intent) {
        if (intent != null) {
            WakeLockHolder.a(intent);
        }
        synchronized (this.lock) {
            try {
                int i = this.runningTasks - 1;
                this.runningTasks = i;
                if (i == 0) {
                    stopSelfResultHook(this.lastStartId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Task b(final Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.executor.execute(new Runnable() { // from class: com.google.firebase.messaging.b
            @Override // java.lang.Runnable
            public final void run() {
                Intent intent2 = intent;
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                int i = EnhancedIntentService.d;
                EnhancedIntentService enhancedIntentService = this.d;
                enhancedIntentService.getClass();
                try {
                    enhancedIntentService.handleIntent(intent2);
                } finally {
                    taskCompletionSource2.setResult(null);
                }
            }
        });
        return taskCompletionSource.getTask();
    }

    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable(TAG, 3)) {
                Log.d(TAG, "Service received bind request");
            }
            if (this.binder == null) {
                this.binder = new WithinAppServiceBinder(new AnonymousClass1());
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.binder;
    }

    @Override // android.app.Service
    @CallSuper
    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, int i2) {
        synchronized (this.lock) {
            this.lastStartId = i2;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            a(intent);
            return 2;
        }
        Task taskB = b(startCommandIntent);
        if (taskB.isComplete()) {
            a(intent);
            return 2;
        }
        taskB.addOnCompleteListener(new androidx.arch.core.executor.a(2), new OnCompleteListener() { // from class: com.google.firebase.messaging.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                int i3 = EnhancedIntentService.d;
                this.d.a(intent);
            }
        });
        return 3;
    }

    public boolean stopSelfResultHook(int i) {
        return stopSelfResult(i);
    }
}
