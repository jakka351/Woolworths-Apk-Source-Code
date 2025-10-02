package androidx.work.impl.background.systemalarm;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.SystemIdInfo;
import androidx.work.impl.model.SystemIdInfoDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.utils.IdGenerator;
import kotlin.jvm.internal.Intrinsics;

@RestrictTo
/* loaded from: classes2.dex */
class Alarms {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3950a = Logger.g("Alarms");

    public static void a(Context context, WorkGenerationalId workGenerationalId, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = CommandHandler.i;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        CommandHandler.c(intent, workGenerationalId);
        PendingIntent service = PendingIntent.getService(context, i, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        Logger.e().a(f3950a, "Cancelling existing alarm with (workSpecId, systemId) (" + workGenerationalId + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, WorkGenerationalId workGenerationalId, long j) {
        SystemIdInfoDao systemIdInfoDaoW = workDatabase.w();
        SystemIdInfo systemIdInfoD = systemIdInfoDaoW.d(workGenerationalId);
        if (systemIdInfoD != null) {
            int i = systemIdInfoD.c;
            a(context, workGenerationalId, i);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = CommandHandler.i;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            CommandHandler.c(intent, workGenerationalId);
            PendingIntent service = PendingIntent.getService(context, i, intent, 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j, service);
                return;
            }
            return;
        }
        Object objP = workDatabase.p(new androidx.webkit.internal.a(new IdGenerator(workDatabase), 2));
        Intrinsics.g(objP, "workDatabase.runInTransa…NAGER_ID_KEY) }\n        )");
        int iIntValue = ((Number) objP).intValue();
        systemIdInfoDaoW.b(new SystemIdInfo(workGenerationalId.f3985a, workGenerationalId.b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = CommandHandler.i;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        CommandHandler.c(intent2, workGenerationalId);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j, service2);
        }
    }
}
