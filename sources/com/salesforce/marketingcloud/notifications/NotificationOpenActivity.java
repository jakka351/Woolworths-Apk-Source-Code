package com.salesforce.marketingcloud.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.PowerManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.FragmentActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.MarketingCloudSdk;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.util.l;
import java.util.concurrent.TimeUnit;

@RestrictTo
/* loaded from: classes6.dex */
public class NotificationOpenActivity extends FragmentActivity {
    private static final String b = g.a("NotificationOpenActivity");

    /* renamed from: a, reason: collision with root package name */
    private BroadcastReceiver f17023a;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NotificationOpenActivity.this.a();
        }
    }

    @NonNull
    public static Intent a(@NonNull Context context, @NonNull Bundle bundle) {
        return new Intent(context, (Class<?>) NotificationOpenActivity.class).setAction(NotificationManager.ACTION_NOTIFICATION_CLICKED).putExtras(bundle).setFlags(8388608);
    }

    private void b(Context context, Bundle bundle) {
        LocalBroadcastManager.a(context).c(new Intent(com.salesforce.marketingcloud.notifications.a.n).putExtras(bundle));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent() == null) {
            a();
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(com.salesforce.marketingcloud.notifications.a.o);
        intentFilter.setPriority(999);
        this.f17023a = new a();
        LocalBroadcastManager.a(this).b(this.f17023a, intentFilter);
        PowerManager.WakeLock wakeLockNewWakeLock = null;
        try {
            try {
                PowerManager powerManager = (PowerManager) getSystemService("power");
                String str = b;
                wakeLockNewWakeLock = powerManager.newWakeLock(1, str);
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(TimeUnit.SECONDS.toMillis(30L));
                if (!l.a(500L, 50L) || MarketingCloudSdk.getInstance() == null) {
                    g.e(str, "MarketingCloudSdk#init must be called in your application's onCreate", new Object[0]);
                } else if (NotificationManager.ACTION_NOTIFICATION_CLICKED.equals(getIntent().getAction())) {
                    b(getApplicationContext(), getIntent().getExtras());
                }
                if (!wakeLockNewWakeLock.isHeld()) {
                    return;
                }
            } catch (Exception e) {
                g.b(b, e, "Encountered exception while handling action: %s", getIntent().getAction());
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

    public void a() {
        if (this.f17023a != null) {
            try {
                LocalBroadcastManager.a(this).d(this.f17023a);
            } catch (IllegalArgumentException unused) {
                g.e(b, "com.salesforce.marketingcloud.notifications.open.RECEIVED Receiver is not registered.", new Object[0]);
            }
        }
        if (isFinishing()) {
            return;
        }
        finish();
    }
}
