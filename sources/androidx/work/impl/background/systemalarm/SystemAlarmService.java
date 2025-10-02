package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleService;
import androidx.work.Logger;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;

@RestrictTo
/* loaded from: classes2.dex */
public class SystemAlarmService extends LifecycleService implements SystemAlarmDispatcher.CommandsCompletedListener {
    public static final String g = Logger.g("SystemAlarmService");
    public SystemAlarmDispatcher e;
    public boolean f;

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onCreate() {
        super.onCreate();
        SystemAlarmDispatcher systemAlarmDispatcher = new SystemAlarmDispatcher(this);
        this.e = systemAlarmDispatcher;
        if (systemAlarmDispatcher.l != null) {
            Logger.e().c(SystemAlarmDispatcher.o, "A completion listener for SystemAlarmDispatcher already exists.");
        } else {
            systemAlarmDispatcher.l = this;
        }
        this.f = false;
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.f = true;
        SystemAlarmDispatcher systemAlarmDispatcher = this.e;
        systemAlarmDispatcher.getClass();
        Logger.e().a(SystemAlarmDispatcher.o, "Destroying SystemAlarmDispatcher");
        systemAlarmDispatcher.g.f(systemAlarmDispatcher);
        systemAlarmDispatcher.l = null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.f) {
            Logger.e().f(g, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            SystemAlarmDispatcher systemAlarmDispatcher = this.e;
            systemAlarmDispatcher.getClass();
            Logger loggerE = Logger.e();
            String str = SystemAlarmDispatcher.o;
            loggerE.a(str, "Destroying SystemAlarmDispatcher");
            systemAlarmDispatcher.g.f(systemAlarmDispatcher);
            systemAlarmDispatcher.l = null;
            SystemAlarmDispatcher systemAlarmDispatcher2 = new SystemAlarmDispatcher(this);
            this.e = systemAlarmDispatcher2;
            if (systemAlarmDispatcher2.l != null) {
                Logger.e().c(str, "A completion listener for SystemAlarmDispatcher already exists.");
            } else {
                systemAlarmDispatcher2.l = this;
            }
            this.f = false;
        }
        if (intent == null) {
            return 3;
        }
        this.e.a(i2, intent);
        return 3;
    }
}
