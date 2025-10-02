package com.google.firebase.messaging;

import android.os.SystemClock;
import androidx.core.app.NotificationCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes6.dex */
public final class CommonNotificationBuilder {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f15636a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    public static class DisplayNotificationInfo {

        /* renamed from: a, reason: collision with root package name */
        public final NotificationCompat.Builder f15637a;
        public final String b;

        public DisplayNotificationInfo(NotificationCompat.Builder builder, String str) {
            this.f15637a = builder;
            this.b = str;
        }
    }
}
