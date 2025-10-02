package com.salesforce.marketingcloud.notifications;

import android.app.PendingIntent;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.salesforce.marketingcloud.notifications.NotificationManager;

/* loaded from: classes6.dex */
public class c extends b {
    public c(@NonNull int i, @Nullable NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider) {
        super(i, null, null, notificationChannelIdProvider);
    }

    @Override // com.salesforce.marketingcloud.notifications.b, com.salesforce.marketingcloud.notifications.NotificationManager.NotificationBuilder
    @NonNull
    public NotificationCompat.Builder setupNotificationBuilder(@NonNull Context context, @NonNull NotificationMessage notificationMessage) {
        NotificationCompat.Builder builderA = b.a(context, notificationMessage, a(context, notificationMessage), this.d);
        PendingIntent pendingIntentC = c(context, notificationMessage);
        if (pendingIntentC != null) {
            builderA.g = NotificationManager.redirectIntentForAnalytics(context, pendingIntentC, notificationMessage, true);
        }
        return builderA;
    }
}
