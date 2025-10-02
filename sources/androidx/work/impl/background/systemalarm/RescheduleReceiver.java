package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3954a = Logger.g("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Logger.e().a(f3954a, "Received intent " + intent);
        try {
            WorkManagerImpl workManagerImplE = WorkManagerImpl.e(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            workManagerImplE.getClass();
            synchronized (WorkManagerImpl.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = workManagerImplE.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    workManagerImplE.i = pendingResultGoAsync;
                    if (workManagerImplE.h) {
                        pendingResultGoAsync.finish();
                        workManagerImplE.i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            Logger.e().d(f3954a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
