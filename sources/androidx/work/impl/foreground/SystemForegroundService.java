package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.constraints.WorkConstraintsTrackerKt;
import androidx.work.impl.foreground.SystemForegroundDispatcher;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.CancelWorkRunnable;
import java.util.UUID;

@RestrictTo
/* loaded from: classes2.dex */
public class SystemForegroundService extends LifecycleService implements SystemForegroundDispatcher.Callback {
    public static final String h = Logger.g("SystemFgService");
    public boolean e;
    public SystemForegroundDispatcher f;
    public NotificationManager g;

    @RequiresApi
    public static class Api29Impl {
        public static void a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
            systemForegroundService.startForeground(i, notification, i2);
        }
    }

    @RequiresApi
    public static class Api31Impl {
        public static void a(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
            try {
                systemForegroundService.startForeground(i, notification, i2);
            } catch (ForegroundServiceStartNotAllowedException e) {
                Logger.e().i(SystemForegroundService.h, "Unable to start foreground service", e);
            } catch (SecurityException e2) {
                Logger.e().i(SystemForegroundService.h, "Unable to start foreground service", e2);
            }
        }
    }

    public final void a(int i) {
        this.g.cancel(i);
    }

    public final void b() {
        this.g = (NotificationManager) getApplicationContext().getSystemService("notification");
        SystemForegroundDispatcher systemForegroundDispatcher = new SystemForegroundDispatcher(getApplicationContext());
        this.f = systemForegroundDispatcher;
        if (systemForegroundDispatcher.l != null) {
            Logger.e().c(SystemForegroundDispatcher.m, "A callback already exists.");
        } else {
            systemForegroundDispatcher.l = this;
        }
    }

    public final void c(int i, int i2, Notification notification) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            Api31Impl.a(this, i, notification, i2);
        } else if (i3 >= 29) {
            Api29Impl.a(this, i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    public final void d() {
        this.e = true;
        Logger.e().a(h, "Shutting down.");
        stopForeground(true);
        stopSelf();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f.f();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.e) {
            Logger.e().f(h, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f.f();
            b();
            this.e = false;
        }
        if (intent == null) {
            return 3;
        }
        final SystemForegroundDispatcher systemForegroundDispatcher = this.f;
        systemForegroundDispatcher.getClass();
        String str = SystemForegroundDispatcher.m;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            Logger.e().f(str, "Started foreground service " + intent);
            final String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            systemForegroundDispatcher.e.b(new Runnable() { // from class: androidx.work.impl.foreground.SystemForegroundDispatcher.1
                public final /* synthetic */ String d;

                public AnonymousClass1(final String stringExtra2) {
                    str = stringExtra2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    WorkSpec workSpec;
                    Processor processor = SystemForegroundDispatcher.this.d.f;
                    String str2 = str;
                    synchronized (processor.k) {
                        try {
                            WorkerWrapper workerWrapperC = processor.c(str2);
                            workSpec = workerWrapperC != null ? workerWrapperC.f3941a : null;
                        } finally {
                        }
                    }
                    if (workSpec == null || !workSpec.b()) {
                        return;
                    }
                    synchronized (SystemForegroundDispatcher.this.f) {
                        SystemForegroundDispatcher.this.i.put(WorkSpecKt.a(workSpec), workSpec);
                        SystemForegroundDispatcher systemForegroundDispatcher2 = SystemForegroundDispatcher.this;
                        SystemForegroundDispatcher.this.j.put(WorkSpecKt.a(workSpec), WorkConstraintsTrackerKt.a(systemForegroundDispatcher2.k, workSpec, systemForegroundDispatcher2.e.a(), SystemForegroundDispatcher.this));
                    }
                }
            });
            systemForegroundDispatcher.c(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            systemForegroundDispatcher.c(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            Logger.e().f(str, "Stopping foreground service");
            SystemForegroundService systemForegroundService = systemForegroundDispatcher.l;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.d();
            return 3;
        }
        Logger.e().f(str, "Stopping foreground work for " + intent);
        String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
            return 3;
        }
        WorkManagerImpl workManagerImpl = systemForegroundDispatcher.d;
        UUID uuidFromString = UUID.fromString(stringExtra2);
        workManagerImpl.getClass();
        CancelWorkRunnable.b(workManagerImpl, uuidFromString);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.f.g(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.f.g(i2);
    }
}
