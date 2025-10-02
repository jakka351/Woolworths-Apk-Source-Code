package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
final class ProxyNotificationPreferences {
    public static SharedPreferences a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }
}
