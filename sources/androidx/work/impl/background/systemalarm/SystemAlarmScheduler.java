package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;

@RestrictTo
/* loaded from: classes2.dex */
public class SystemAlarmScheduler implements Scheduler {
    public static final String e = Logger.g("SystemAlarmScheduler");
    public final Context d;

    public SystemAlarmScheduler(@NonNull Context context) {
        this.d = context.getApplicationContext();
    }

    @Override // androidx.work.impl.Scheduler
    public final boolean a() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public final void b(String str) {
        String str2 = CommandHandler.i;
        Context context = this.d;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        context.startService(intent);
    }

    @Override // androidx.work.impl.Scheduler
    public final void c(WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            Logger.e().a(e, "Scheduling work with workSpecId " + workSpec.f3990a);
            WorkGenerationalId workGenerationalIdA = WorkSpecKt.a(workSpec);
            String str = CommandHandler.i;
            Context context = this.d;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            CommandHandler.c(intent, workGenerationalIdA);
            context.startService(intent);
        }
    }
}
