package com.salesforce.marketingcloud.notifications;

import android.os.Build;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.salesforce.marketingcloud.MCKeep;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.util.l;
import java.util.Locale;

@MCKeep
/* loaded from: classes6.dex */
public class NotificationCustomizationOptions {
    static final String TAG = g.a("NotificationCustomizationOptions");
    final NotificationManager.NotificationChannelIdProvider channelIdProvider;
    final NotificationManager.NotificationLaunchIntentProvider launchIntentProvider;
    final NotificationManager.NotificationBuilder notificationBuilder;
    final int smallIconResId;

    private NotificationCustomizationOptions(int i, NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider, NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider, NotificationManager.NotificationBuilder notificationBuilder) {
        this.smallIconResId = i;
        this.launchIntentProvider = notificationLaunchIntentProvider;
        this.channelIdProvider = notificationChannelIdProvider;
        this.notificationBuilder = notificationBuilder;
    }

    private static String classNameOrNull(Object obj) {
        return obj != null ? obj.getClass().getName() : "null";
    }

    @NonNull
    public static NotificationCustomizationOptions create(@DrawableRes int i) {
        return new NotificationCustomizationOptions(i, null, null, null);
    }

    @Nullable
    public NotificationManager.NotificationBuilder getNotificationBuilder() {
        return this.notificationBuilder;
    }

    @NonNull
    public String toString() {
        NotificationManager.NotificationBuilder notificationBuilder = this.notificationBuilder;
        if (notificationBuilder == null) {
            return String.format(l.f17084a, "{smallIconResId=%d, launchIntentProvider=%s, channelIdProvider=%s}", Integer.valueOf(this.smallIconResId), classNameOrNull(this.launchIntentProvider), classNameOrNull(this.channelIdProvider));
        }
        Locale locale = l.f17084a;
        return YU.a.h("{notificationBuilder=", classNameOrNull(notificationBuilder), "}");
    }

    @NonNull
    public static NotificationCustomizationOptions create(@DrawableRes int i, @Nullable NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider, @Nullable NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider) {
        if (notificationLaunchIntentProvider != null && Build.VERSION.SDK_INT >= 31) {
            g.c(TAG, "Make sure FLAG_IMMUTABLE or FLAG_MUTABLE for Pending Intent is set because of Targeting S+ (version 31 and above) ", new Object[0]);
        }
        return new NotificationCustomizationOptions(i, notificationLaunchIntentProvider, notificationChannelIdProvider, null);
    }

    @NonNull
    public static NotificationCustomizationOptions create(@NonNull NotificationManager.NotificationBuilder notificationBuilder) {
        if (notificationBuilder != null) {
            return new NotificationCustomizationOptions(0, null, null, notificationBuilder);
        }
        throw new IllegalArgumentException("The provided NotificationManager.NotificationBuilder cannot be null.");
    }
}
