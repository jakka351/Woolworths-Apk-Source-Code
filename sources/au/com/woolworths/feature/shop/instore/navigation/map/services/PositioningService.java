package au.com.woolworths.feature.shop.instore.navigation.map.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/services/PositioningService;", "Landroid/app/Service;", "<init>", "()V", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PositioningService extends Service {
    public boolean d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/services/PositioningService$Companion;", "", "", "FOREGROUND_NOTIFICATION_ID", "I", "", "FOREGROUND_CHANNEL_ID", "Ljava/lang/String;", "FOREGROUND_CHANNEL_NAME", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Timber.f27013a.h("createForegroundNotificationChannel", new Object[0]);
        try {
            NotificationChannel notificationChannel = new NotificationChannel("oriient_foreground_service", "oriient channel", 3);
            notificationChannel.setLockscreenVisibility(1);
            notificationChannel.setShowBadge(true);
            notificationChannel.setImportance(3);
            Object systemService = getSystemService("notification");
            Intrinsics.f(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        } catch (RuntimeException e) {
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.c(new ReportOwner(ReportOwner.Squad.u), e, "Failed to create notification channel", 8);
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!this.d) {
            Timber.f27013a.h("createNotification", new Object[0]);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(), "oriient_foreground_service");
            builder.e = NotificationCompat.Builder.c(getString(R.string.foreground_service_title));
            builder.x.icon = R.drawable.wapple_grey;
            builder.k(2, true);
            Notification notificationB = builder.b();
            Intrinsics.g(notificationB, "build(...)");
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    startForeground(987, notificationB, 8);
                } else {
                    startForeground(987, notificationB);
                }
                this.d = true;
            } catch (Exception e) {
                Bark.Companion companion = Bark.f8483a;
                Bark.Barker.h(new ReportOwner(ReportOwner.Squad.u), e, "Failed to start a foreground service", 24);
            }
        }
        return super.onStartCommand(intent, i, i2);
    }
}
