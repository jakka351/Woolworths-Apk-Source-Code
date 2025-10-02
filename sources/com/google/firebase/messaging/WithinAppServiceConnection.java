package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
class WithinAppServiceConnection implements ServiceConnection {
    public final Context d;
    public final Intent e;
    public final ScheduledThreadPoolExecutor f;
    public final ArrayDeque g;
    public WithinAppServiceBinder h;
    public boolean i;

    public static class BindRequest {

        /* renamed from: a, reason: collision with root package name */
        public final Intent f15659a;
        public final TaskCompletionSource b = new TaskCompletionSource();

        public BindRequest(Intent intent) {
            this.f15659a = intent;
        }
    }

    public WithinAppServiceConnection(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.g = new ArrayDeque();
        this.i = false;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.g.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                WithinAppServiceBinder withinAppServiceBinder = this.h;
                if (withinAppServiceBinder == null || !withinAppServiceBinder.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.h.a((BindRequest) this.g.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Task b(Intent intent) {
        BindRequest bindRequest;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            bindRequest = new BindRequest(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f;
            bindRequest.b.getTask().addOnCompleteListener(scheduledThreadPoolExecutor, new i(scheduledThreadPoolExecutor.schedule(new p(bindRequest, 1), 20L, TimeUnit.SECONDS), 3));
            this.g.add(bindRequest);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return bindRequest.b.getTask();
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.i);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.i) {
            return;
        }
        this.i = true;
        try {
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        if (ConnectionTracker.getInstance().bindService(this.d, this.e, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.i = false;
        while (true) {
            ArrayDeque arrayDeque = this.g;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((BindRequest) arrayDeque.poll()).b.trySetResult(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.i = false;
            if (iBinder instanceof WithinAppServiceBinder) {
                this.h = (WithinAppServiceBinder) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.g;
            while (!arrayDeque.isEmpty()) {
                ((BindRequest) arrayDeque.poll()).b.trySetResult(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
