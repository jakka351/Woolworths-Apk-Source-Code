package com.google.androidbrowserhelper.trusted;

import android.app.NotificationChannel;
import android.content.ContextWrapper;
import androidx.core.app.NotificationManagerCompat;
import java.util.Locale;

/* loaded from: classes6.dex */
public class NotificationUtils {
    public static boolean a(ContextWrapper contextWrapper, String str) {
        if (!new NotificationManagerCompat(contextWrapper).b.areNotificationsEnabled()) {
            return false;
        }
        NotificationChannel notificationChannelB = new NotificationManagerCompat(contextWrapper).b(b(str));
        return notificationChannelB == null || notificationChannelB.getImportance() != 0;
    }

    public static String b(String str) {
        return str.toLowerCase(Locale.ROOT).replace(' ', '_') + "_channel_id";
    }
}
