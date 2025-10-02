package au.com.woolworths.feature.shop.myorders.pickup.manager;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class NotificationHelper extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public NotificationManager f7883a;

    public NotificationHelper(Context context) {
        super(context);
        if (this.f7883a == null) {
            this.f7883a = (NotificationManager) getSystemService("notification");
        }
        NotificationManager notificationManager = this.f7883a;
        String string = getString(R.string.pickup_channel_name);
        String string2 = getString(R.string.pickup_channel_description);
        NotificationChannel notificationChannel = new NotificationChannel("pickup_notification_channel", string, 3);
        notificationChannel.setDescription(string2);
        notificationChannel.enableLights(true);
        notificationChannel.setLightColor(-16711936);
        notificationChannel.enableVibration(true);
        notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
        notificationManager.createNotificationChannel(notificationChannel);
    }
}
