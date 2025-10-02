package com.medallia.digital.mobilesdk;

import android.app.NotificationChannel;
import androidx.core.app.NotificationManagerCompat;
import com.medallia.digital.mobilesdk.s0;
import java.util.Locale;

/* loaded from: classes.dex */
public class w3 extends y5<Boolean> {
    public w3(x5 x5Var, n0 n0Var) {
        super(x5Var, n0Var);
    }

    private boolean r() {
        NotificationManagerCompat notificationManagerCompat = new NotificationManagerCompat(i4.c().d());
        if (!notificationManagerCompat.b.areNotificationsEnabled()) {
            a4.b("Notification ManagerCompat areNotificationsEnabled: false");
            return false;
        }
        NotificationChannel notificationChannelB = notificationManagerCompat.b("Medallia Digital");
        if (notificationChannelB != null) {
            StringBuilder sb = new StringBuilder("Notification ManagerCompat channel: ");
            sb.append(notificationChannelB.getImportance() != 0);
            a4.b(sb.toString());
            if (notificationChannelB.getImportance() == 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public /* bridge */ /* synthetic */ String b() {
        return super.b();
    }

    @Override // com.medallia.digital.mobilesdk.m0
    public CollectorContract c() {
        return s0.a.R;
    }

    @Override // com.medallia.digital.mobilesdk.y5
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public Boolean j() {
        a4.b("LocalNotificationsEnabledCollector collectValue was called");
        boolean zR = r();
        Locale locale = Locale.US;
        a4.b("Collectors > LocalNotifications is enable : " + zR);
        return Boolean.valueOf(zR);
    }
}
