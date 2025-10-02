package com.salesforce.marketingcloud;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes6.dex */
public class NotificationOpenedService extends IntentService {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16832a = g.a("NotificationOpenedService");

    public NotificationOpenedService() {
        super(f16832a);
    }

    private static void a(Context context, Bundle bundle) {
        LocalBroadcastManager.a(context).c(new Intent(com.salesforce.marketingcloud.notifications.a.n).putExtras(bundle));
    }

    @NonNull
    public static Intent b(@NonNull Context context, @NonNull Bundle bundle) {
        return new Intent(context, (Class<?>) NotificationOpenedService.class).setAction(NotificationManager.ACTION_NOTIFICATION_CLICKED).putExtras(bundle);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = null;
        try {
            try {
                PowerManager powerManager = (PowerManager) getSystemService("power");
                String str = f16832a;
                wakeLockNewWakeLock = powerManager.newWakeLock(1, str);
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(TimeUnit.SECONDS.toMillis(30L));
                if (!com.salesforce.marketingcloud.util.l.a(500L, 50L) || MarketingCloudSdk.getInstance() == null) {
                    g.e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
                } else if (NotificationManager.ACTION_NOTIFICATION_CLICKED.equals(intent.getAction())) {
                    a(getApplicationContext(), intent.getExtras());
                }
                if (!wakeLockNewWakeLock.isHeld()) {
                    return;
                }
            } catch (Exception e) {
                g.b(f16832a, e, "Encountered exception while handling action: %s", intent.getAction());
                if (0 == 0 || !wakeLockNewWakeLock.isHeld()) {
                    return;
                }
            }
            try {
                wakeLockNewWakeLock.release();
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            if (0 != 0 && wakeLockNewWakeLock.isHeld()) {
                try {
                    wakeLockNewWakeLock.release();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }
}
