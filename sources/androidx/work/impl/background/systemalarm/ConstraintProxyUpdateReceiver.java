package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.Logger;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.impl.utils.PackageManagerHelper;

/* loaded from: classes2.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f3952a = Logger.g("ConstrntProxyUpdtRecvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, final Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            final BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            WorkManagerImpl.e(context).d.b(new Runnable() { // from class: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver.1
                @Override // java.lang.Runnable
                public final void run() {
                    BroadcastReceiver.PendingResult pendingResult = pendingResultGoAsync;
                    Context context2 = context;
                    Intent intent2 = intent;
                    try {
                        boolean booleanExtra = intent2.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                        boolean booleanExtra2 = intent2.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                        boolean booleanExtra3 = intent2.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                        boolean booleanExtra4 = intent2.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                        Logger.e().a(ConstraintProxyUpdateReceiver.f3952a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                        PackageManagerHelper.a(context2, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                        PackageManagerHelper.a(context2, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                        PackageManagerHelper.a(context2, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                        PackageManagerHelper.a(context2, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
                    } finally {
                        pendingResult.finish();
                    }
                }
            });
        } else {
            Logger.e().a(f3952a, "Ignoring unknown action " + action);
        }
    }
}
