package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.core.os.UserManagerCompat;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.impl.WorkDatabasePathHelper;
import androidx.work.impl.WorkManagerImpl;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    public static final String h = Logger.g("ForceStopRunnable");
    public static final long i = TimeUnit.DAYS.toMillis(3650);
    public final Context d;
    public final WorkManagerImpl e;
    public final PreferenceUtils f;
    public int g = 0;

    @RestrictTo
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public static final String f3997a = Logger.g("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            if (((Logger.LogcatLogger) Logger.e()).c <= 2) {
                Log.v(f3997a, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.c(context);
        }
    }

    public ForceStopRunnable(Context context, WorkManagerImpl workManagerImpl) {
        this.d = context.getApplicationContext();
        this.e = workManagerImpl;
        this.f = workManagerImpl.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i2 = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i2);
        long jCurrentTimeMillis = System.currentTimeMillis() + i;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 514
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.a():void");
    }

    public final boolean b() {
        Configuration configuration = this.e.b;
        configuration.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = h;
        if (zIsEmpty) {
            Logger.e().a(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = ProcessUtils.a(this.d, configuration);
        Logger.e().a(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.d;
        String str = h;
        WorkManagerImpl workManagerImpl = this.e;
        try {
            if (!b()) {
                return;
            }
            while (true) {
                try {
                    WorkDatabasePathHelper.a(context);
                    Logger.e().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e) {
                        int i2 = this.g + 1;
                        this.g = i2;
                        if (i2 >= 3) {
                            String str2 = UserManagerCompat.a(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            Logger.e().d(str, str2, e);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e);
                            workManagerImpl.b.getClass();
                            throw illegalStateException;
                        }
                        Logger.e().b(str, "Retrying after " + (i2 * 300), e);
                        try {
                            Thread.sleep(this.g * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    Logger.e().c(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    workManagerImpl.b.getClass();
                    throw illegalStateException2;
                }
            }
        } finally {
            workManagerImpl.g();
        }
    }
}
