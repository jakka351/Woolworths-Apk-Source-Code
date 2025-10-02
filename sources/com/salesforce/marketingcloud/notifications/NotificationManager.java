package com.salesforce.marketingcloud.notifications;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.NotificationOpenedService;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.internal.h;
import com.salesforce.marketingcloud.internal.i;
import com.salesforce.marketingcloud.util.l;

/* loaded from: classes6.dex */
public abstract class NotificationManager {

    @NonNull
    @MCKeep
    public static final String ACTION_NOTIFICATION_CLICKED = "com.salesforce.marketingcloud.NOTIFICATION_CLICKED";

    @NonNull
    @MCKeep
    public static final String DEFAULT_CHANNEL_ID = "com.salesforce.marketingcloud.DEFAULT_CHANNEL";

    @NonNull
    @MCKeep
    public static final String DEFAULT_FOREGROUND_CHANNEL_ID = "com.salesforce.marketingcloud.DEFAULT_FOREGROUND_CHANNEL";
    static final String d = g.a("NotificationManager");

    @NonNull
    private static final String e = "com.salesforce.marketingcloud.notifications.EXTRA_MESSAGE";

    @MCKeep
    public interface NotificationBuilder {
        @NonNull
        NotificationCompat.Builder setupNotificationBuilder(@NonNull Context context, @NonNull NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface NotificationChannelIdProvider {
        @NonNull
        String getNotificationChannelId(@NonNull Context context, @NonNull NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface NotificationLaunchIntentProvider {
        @Nullable
        PendingIntent getNotificationPendingIntent(@NonNull Context context, @NonNull NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface NotificationMessageDisplayedListener {
        void onNotificationMessageDisplayed(@NonNull NotificationMessage notificationMessage);
    }

    @MCKeep
    public interface ShouldShowNotificationListener {
        boolean shouldShowNotification(@NonNull NotificationMessage notificationMessage);
    }

    @NonNull
    public static Intent a(@NonNull Intent intent, @NonNull NotificationMessage notificationMessage) {
        return intent.putExtra(e, i.a(notificationMessage));
    }

    @MCKeep
    public static void cancelNotificationMessage(@NonNull Context context, @NonNull NotificationMessage notificationMessage) {
        if (notificationMessage.notificationId() >= 0) {
            ((android.app.NotificationManager) context.getSystemService("notification")).cancel("com.marketingcloud.salesforce.notifications.TAG", notificationMessage.notificationId());
        }
    }

    @NonNull
    @MCKeep
    public static String createDefaultNotificationChannel(@NonNull Context context) {
        return b.b(context, false);
    }

    @NonNull
    @MCKeep
    public static String createForegroundNotificationChannel(@NonNull Context context) {
        return b.a(context, false);
    }

    @Nullable
    @MCKeep
    public static NotificationMessage extractMessage(@NonNull Intent intent) {
        try {
            return (NotificationMessage) i.a(intent.getByteArrayExtra(e), NotificationMessage.CREATOR);
        } catch (Exception e2) {
            g.b(d, e2, "Unable to retrieve NotificationMessage from Intent (%s).", intent);
            return null;
        }
    }

    @NonNull
    @MCKeep
    public static NotificationCompat.Builder getDefaultNotificationBuilder(@NonNull Context context, @NonNull NotificationMessage notificationMessage, @NonNull String str, @DrawableRes int i) {
        return b.a(context, notificationMessage, str, i);
    }

    @Nullable
    @MCKeep
    public static PendingIntent redirectIntentForAnalytics(@NonNull Context context, @NonNull PendingIntent pendingIntent, @NonNull RemoteMessage remoteMessage, boolean z) {
        try {
            return redirectIntentForAnalytics(context, pendingIntent, h.a(remoteMessage.getData()), z);
        } catch (Exception e2) {
            g.b(d, e2, "Failed to create {NotificationMessage} from {RemoteMessage}, not processing {PendingIntent} for analytics.", new Object[0]);
            return null;
        }
    }

    @MCKeep
    public abstract boolean areNotificationsEnabled();

    @MCKeep
    public abstract void disableNotifications();

    @MCKeep
    public abstract void enableNotifications();

    @MCKeep
    public abstract void registerNotificationMessageDisplayedListener(@NonNull NotificationMessageDisplayedListener notificationMessageDisplayedListener);

    @MCKeep
    public abstract void setShouldShowNotificationListener(@Nullable ShouldShowNotificationListener shouldShowNotificationListener);

    @MCKeep
    public abstract void unregisterNotificationMessageDisplayedListener(@NonNull NotificationMessageDisplayedListener notificationMessageDisplayedListener);

    @NonNull
    @MCKeep
    public static String createDefaultNotificationChannel(@NonNull Context context, boolean z) {
        return b.b(context, z);
    }

    @NonNull
    @MCKeep
    public static PendingIntent redirectIntentForAnalytics(@NonNull Context context, @NonNull PendingIntent pendingIntent, @NonNull NotificationMessage notificationMessage, boolean z) {
        Bundle bundle = new Bundle(3);
        bundle.putByteArray(e, i.a(notificationMessage));
        bundle.putParcelable("com.salesforce.marketingcloud.notifications.EXTRA_OPEN_INTENT", pendingIntent);
        bundle.putBoolean("com.salesforce.marketingcloud.notifications.EXTRA_AUTO_CANCEL", z);
        Uri uriFromParts = Uri.fromParts("mcsdk", "pushOpen", String.valueOf(System.currentTimeMillis()));
        int iA = l.a(1073741824);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getActivity(context, 0, NotificationOpenActivity.a(context, bundle).setData(uriFromParts), iA) : PendingIntent.getService(context, 0, NotificationOpenedService.b(context, bundle).setData(uriFromParts), iA);
    }
}
