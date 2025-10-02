package androidx.work.impl.background.systemalarm;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.work.Clock;
import androidx.work.Constraints;
import androidx.work.Logger;
import androidx.work.NetworkType;
import androidx.work.SystemClock;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

@RestrictTo
/* loaded from: classes2.dex */
public class CommandHandler implements ExecutionListener {
    public static final String i = Logger.g("CommandHandler");
    public final Context d;
    public final HashMap e = new HashMap();
    public final Object f = new Object();
    public final Clock g;
    public final StartStopTokens h;

    public CommandHandler(Context context, SystemClock systemClock, StartStopTokens startStopTokens) {
        this.d = context;
        this.g = systemClock;
        this.h = startStopTokens;
    }

    public static WorkGenerationalId b(Intent intent) {
        return new WorkGenerationalId(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, WorkGenerationalId workGenerationalId) {
        intent.putExtra("KEY_WORKSPEC_ID", workGenerationalId.f3985a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", workGenerationalId.b);
    }

    public final void a(int i2, Intent intent, SystemAlarmDispatcher systemAlarmDispatcher) {
        List<StartStopToken> listRemove;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            Logger.e().a(i, "Handling constraints changed " + intent);
            Context context = this.d;
            ConstraintsCommandHandler constraintsCommandHandler = new ConstraintsCommandHandler(context, this.g, i2, systemAlarmDispatcher);
            ArrayList arrayListS = systemAlarmDispatcher.h.c.z().s();
            String str = ConstraintProxy.f3951a;
            Iterator it = arrayListS.iterator();
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            while (it.hasNext()) {
                Constraints constraints = ((WorkSpec) it.next()).j;
                z |= constraints.e;
                z2 |= constraints.c;
                z3 |= constraints.f;
                z4 |= constraints.f3893a != NetworkType.d;
                if (z && z2 && z3 && z4) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f3952a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z2).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z4);
            context.sendBroadcast(intent2);
            ArrayList arrayList = new ArrayList(arrayListS.size());
            long jCurrentTimeMillis = constraintsCommandHandler.f3953a.currentTimeMillis();
            Iterator it2 = arrayListS.iterator();
            while (it2.hasNext()) {
                WorkSpec workSpec = (WorkSpec) it2.next();
                if (jCurrentTimeMillis >= workSpec.a() && (!workSpec.b() || constraintsCommandHandler.c.a(workSpec))) {
                    arrayList.add(workSpec);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                WorkSpec workSpec2 = (WorkSpec) it3.next();
                String str3 = workSpec2.f3990a;
                WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, workGenerationalIdA);
                Logger.e().a(ConstraintsCommandHandler.d, "Creating a delay_met command for workSpec with id (" + str3 + ")");
                systemAlarmDispatcher.e.c().execute(new SystemAlarmDispatcher.AddRunnable(constraintsCommandHandler.b, intent3, systemAlarmDispatcher));
            }
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            Logger.e().a(i, "Handling reschedule " + intent + ", " + i2);
            systemAlarmDispatcher.h.h();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            Logger.e().c(i, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            Context context2 = this.d;
            WorkGenerationalId workGenerationalIdB = b(intent);
            Logger loggerE = Logger.e();
            String str4 = i;
            loggerE.a(str4, "Handling schedule work for " + workGenerationalIdB);
            WorkDatabase workDatabase = systemAlarmDispatcher.h.c;
            workDatabase.c();
            try {
                WorkSpec workSpecT = workDatabase.z().t(workGenerationalIdB.f3985a);
                if (workSpecT == null) {
                    Logger.e().h(str4, "Skipping scheduling " + workGenerationalIdB + " because it's no longer in the DB");
                    return;
                }
                if (workSpecT.b.a()) {
                    Logger.e().h(str4, "Skipping scheduling " + workGenerationalIdB + "because it is finished.");
                    return;
                }
                long jA = workSpecT.a();
                if (workSpecT.b()) {
                    Logger.e().a(str4, "Opportunistically setting an alarm for " + workGenerationalIdB + "at " + jA);
                    Alarms.b(context2, workDatabase, workGenerationalIdB, jA);
                    Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                    systemAlarmDispatcher.e.c().execute(new SystemAlarmDispatcher.AddRunnable(i2, intent4, systemAlarmDispatcher));
                } else {
                    Logger.e().a(str4, "Setting up Alarms for " + workGenerationalIdB + "at " + jA);
                    Alarms.b(context2, workDatabase, workGenerationalIdB, jA);
                }
                workDatabase.r();
                return;
            } finally {
                workDatabase.l();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f) {
                try {
                    WorkGenerationalId workGenerationalIdB2 = b(intent);
                    Logger loggerE2 = Logger.e();
                    String str5 = i;
                    loggerE2.a(str5, "Handing delay met for " + workGenerationalIdB2);
                    if (this.e.containsKey(workGenerationalIdB2)) {
                        Logger.e().a(str5, "WorkSpec " + workGenerationalIdB2 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        DelayMetCommandHandler delayMetCommandHandler = new DelayMetCommandHandler(this.d, i2, systemAlarmDispatcher, this.h.d(workGenerationalIdB2));
                        this.e.put(workGenerationalIdB2, delayMetCommandHandler);
                        delayMetCommandHandler.f();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                Logger.e().h(i, "Ignoring intent " + intent);
                return;
            }
            WorkGenerationalId workGenerationalIdB3 = b(intent);
            boolean z5 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            Logger.e().a(i, "Handling onExecutionCompleted " + intent + ", " + i2);
            d(workGenerationalIdB3, z5);
            return;
        }
        StartStopTokens startStopTokens = this.h;
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        if (extras2.containsKey("KEY_WORKSPEC_GENERATION")) {
            int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            StartStopToken startStopTokenB = startStopTokens.b(new WorkGenerationalId(string, i3));
            listRemove = arrayList2;
            if (startStopTokenB != null) {
                arrayList2.add(startStopTokenB);
                listRemove = arrayList2;
            }
        } else {
            listRemove = startStopTokens.remove(string);
        }
        for (StartStopToken startStopToken : listRemove) {
            Logger.e().a(i, "Handing stopWork work for " + string);
            systemAlarmDispatcher.n.b(startStopToken);
            Context context3 = this.d;
            WorkDatabase workDatabase2 = systemAlarmDispatcher.h.c;
            WorkGenerationalId workGenerationalId = startStopToken.f3931a;
            String str6 = Alarms.f3950a;
            SystemIdInfoDao systemIdInfoDaoW = workDatabase2.w();
            SystemIdInfo systemIdInfoD = systemIdInfoDaoW.d(workGenerationalId);
            if (systemIdInfoD != null) {
                Alarms.a(context3, workGenerationalId, systemIdInfoD.c);
                Logger.e().a(Alarms.f3950a, "Removing SystemIdInfo for workSpecId (" + workGenerationalId + ")");
                systemIdInfoDaoW.a(workGenerationalId);
            }
            systemAlarmDispatcher.d(startStopToken.f3931a, false);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public final void d(WorkGenerationalId workGenerationalId, boolean z) {
        synchronized (this.f) {
            try {
                DelayMetCommandHandler delayMetCommandHandler = (DelayMetCommandHandler) this.e.remove(workGenerationalId);
                this.h.b(workGenerationalId);
                if (delayMetCommandHandler != null) {
                    delayMetCommandHandler.g(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
