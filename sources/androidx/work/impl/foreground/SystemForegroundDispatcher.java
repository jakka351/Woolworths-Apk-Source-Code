package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.constraintlayout.core.state.a;
import androidx.work.ForegroundInfo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.ConstraintsState;
import androidx.work.impl.constraints.OnConstraintsStateChangedListener;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.StopWorkRunnable;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;

@RestrictTo
/* loaded from: classes2.dex */
public class SystemForegroundDispatcher implements OnConstraintsStateChangedListener, ExecutionListener {
    public static final String m = Logger.g("SystemFgDispatcher");
    public final WorkManagerImpl d;
    public final TaskExecutor e;
    public final Object f = new Object();
    public WorkGenerationalId g;
    public final LinkedHashMap h;
    public final HashMap i;
    public final HashMap j;
    public final WorkConstraintsTracker k;
    public SystemForegroundService l;

    public interface Callback {
    }

    public SystemForegroundDispatcher(Context context) {
        WorkManagerImpl workManagerImplE = WorkManagerImpl.e(context);
        this.d = workManagerImplE;
        this.e = workManagerImplE.d;
        this.g = null;
        this.h = new LinkedHashMap();
        this.j = new HashMap();
        this.i = new HashMap();
        this.k = new WorkConstraintsTracker(workManagerImplE.j);
        workManagerImplE.f.a(this);
    }

    public static Intent a(Context context, WorkGenerationalId workGenerationalId, ForegroundInfo foregroundInfo) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.f3985a);
        intent.putExtra("KEY_GENERATION", workGenerationalId.b);
        intent.putExtra("KEY_NOTIFICATION_ID", foregroundInfo.f3900a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", foregroundInfo.b);
        intent.putExtra("KEY_NOTIFICATION", foregroundInfo.c);
        return intent;
    }

    public static Intent b(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    public final void c(Intent intent) {
        if (this.l == null) {
            throw new IllegalStateException("handleNotify was called on the destroyed dispatcher");
        }
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        WorkGenerationalId workGenerationalId = new WorkGenerationalId(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        Logger loggerE = Logger.e();
        StringBuilder sbP = a.p("Notifying with (id:", intExtra, ", workSpecId: ", stringExtra, ", notificationType :");
        sbP.append(intExtra2);
        sbP.append(")");
        loggerE.a(m, sbP.toString());
        if (notification == null) {
            throw new IllegalArgumentException("Notification passed in the intent was null.");
        }
        ForegroundInfo foregroundInfo = new ForegroundInfo(intExtra, intExtra2, notification);
        LinkedHashMap linkedHashMap = this.h;
        linkedHashMap.put(workGenerationalId, foregroundInfo);
        ForegroundInfo foregroundInfo2 = (ForegroundInfo) linkedHashMap.get(this.g);
        if (foregroundInfo2 == null) {
            this.g = workGenerationalId;
        } else {
            this.l.g.notify(intExtra, notification);
            if (Build.VERSION.SDK_INT >= 29) {
                Iterator it = linkedHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    i |= ((ForegroundInfo) ((Map.Entry) it.next()).getValue()).b;
                }
                foregroundInfo = new ForegroundInfo(foregroundInfo2.f3900a, i, foregroundInfo2.c);
            } else {
                foregroundInfo = foregroundInfo2;
            }
        }
        this.l.c(foregroundInfo.f3900a, foregroundInfo.b, foregroundInfo.c);
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void d(WorkGenerationalId workGenerationalId, boolean z) {
        Map.Entry entry;
        synchronized (this.f) {
            try {
                Job job = ((WorkSpec) this.i.remove(workGenerationalId)) != null ? (Job) this.j.remove(workGenerationalId) : null;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        ForegroundInfo foregroundInfo = (ForegroundInfo) this.h.remove(workGenerationalId);
        if (workGenerationalId.equals(this.g)) {
            if (this.h.size() > 0) {
                Iterator it = this.h.entrySet().iterator();
                Object next = it.next();
                while (true) {
                    entry = (Map.Entry) next;
                    if (!it.hasNext()) {
                        break;
                    } else {
                        next = it.next();
                    }
                }
                this.g = (WorkGenerationalId) entry.getKey();
                if (this.l != null) {
                    ForegroundInfo foregroundInfo2 = (ForegroundInfo) entry.getValue();
                    this.l.c(foregroundInfo2.f3900a, foregroundInfo2.b, foregroundInfo2.c);
                    this.l.a(foregroundInfo2.f3900a);
                }
            } else {
                this.g = null;
            }
        }
        SystemForegroundService systemForegroundService = this.l;
        if (foregroundInfo == null || systemForegroundService == null) {
            return;
        }
        Logger.e().a(m, "Removing Notification (id: " + foregroundInfo.f3900a + ", workSpecId: " + workGenerationalId + ", notificationType: " + foregroundInfo.b);
        systemForegroundService.a(foregroundInfo.f3900a);
    }

    @Override // androidx.work.impl.constraints.OnConstraintsStateChangedListener
    public final void e(WorkSpec workSpec, ConstraintsState constraintsState) {
        if (constraintsState instanceof ConstraintsState.ConstraintsNotMet) {
            String str = workSpec.f3990a;
            Logger.e().a(m, "Constraints unmet for WorkSpec " + str);
            WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec);
            int i = ((ConstraintsState.ConstraintsNotMet) constraintsState).f3959a;
            WorkManagerImpl workManagerImpl = this.d;
            workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl.f, new StartStopToken(workGenerationalIdA), true, i));
        }
    }

    public final void f() {
        this.l = null;
        synchronized (this.f) {
            try {
                Iterator it = this.j.values().iterator();
                while (it.hasNext()) {
                    ((Job) it.next()).cancel((CancellationException) null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.f.f(this);
    }

    public final void g(int i) {
        Logger.e().f(m, "Foreground service timed out, FGS type: " + i);
        for (Map.Entry entry : this.h.entrySet()) {
            if (((ForegroundInfo) entry.getValue()).b == i) {
                WorkGenerationalId workGenerationalId = (WorkGenerationalId) entry.getKey();
                WorkManagerImpl workManagerImpl = this.d;
                workManagerImpl.d.b(new StopWorkRunnable(workManagerImpl.f, new StartStopToken(workGenerationalId), true, -128));
            }
        }
        SystemForegroundService systemForegroundService = this.l;
        if (systemForegroundService != null) {
            systemForegroundService.d();
        }
    }
}
