package com.swrve.sdk;

import android.app.NotificationChannel;

/* loaded from: classes.dex */
public class SwrveNotificationConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Class f19063a;
    public final NotificationChannel b;
    public final String c;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public Class f19064a;
        public final NotificationChannel b;
        public String c;

        public Builder(NotificationChannel notificationChannel) {
            this.b = notificationChannel;
        }
    }

    public SwrveNotificationConfig(Builder builder) {
        this.f19063a = builder.f19064a;
        this.b = builder.b;
        this.c = builder.c;
    }
}
