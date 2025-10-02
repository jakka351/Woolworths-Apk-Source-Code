package com.salesforce.marketingcloud.notifications;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.app.NotificationCompat;
import com.dynatrace.android.callback.Callback;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.medallia.digital.mobilesdk.q2;
import com.salesforce.marketingcloud.R;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.util.l;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@RestrictTo
/* loaded from: classes6.dex */
class b implements NotificationManager.NotificationBuilder {

    /* renamed from: a, reason: collision with root package name */
    private final NotificationManager.NotificationLaunchIntentProvider f17027a;
    private final NotificationManager.NotificationBuilder b;
    private final NotificationManager.NotificationChannelIdProvider c;
    final int d;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17028a;

        static {
            int[] iArr = new int[NotificationMessage.Sound.values().length];
            f17028a = iArr;
            try {
                iArr[NotificationMessage.Sound.CUSTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17028a[NotificationMessage.Sound.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17028a[NotificationMessage.Sound.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b(@DrawableRes int i, @Nullable NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider, @Nullable NotificationManager.NotificationBuilder notificationBuilder, @Nullable NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider) {
        this.f17027a = notificationLaunchIntentProvider;
        this.b = notificationBuilder;
        this.c = notificationChannelIdProvider;
        this.d = i;
    }

    public static String a(Context context, boolean z) {
        android.app.NotificationManager notificationManager;
        if (l.c() && (notificationManager = (android.app.NotificationManager) context.getSystemService("notification")) != null && (notificationManager.getNotificationChannel(NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID) == null || z)) {
            NotificationChannel notificationChannel = new NotificationChannel(NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID, context.getString(R.string.mcsdk_foreground_notification_channel_name), 3);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setShowBadge(false);
            notificationChannel.setSound(null, null);
            notificationChannel.setLockscreenVisibility(0);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID;
    }

    public static String b(Context context, boolean z) {
        android.app.NotificationManager notificationManager;
        if (l.c() && (notificationManager = (android.app.NotificationManager) context.getSystemService("notification")) != null && (notificationManager.getNotificationChannel(NotificationManager.DEFAULT_CHANNEL_ID) == null || z)) {
            NotificationChannel notificationChannel = new NotificationChannel(NotificationManager.DEFAULT_CHANNEL_ID, context.getString(R.string.mcsdk_default_notification_channel_name), 3);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setShowBadge(true);
            notificationChannel.setLockscreenVisibility(0);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return NotificationManager.DEFAULT_CHANNEL_ID;
    }

    public PendingIntent c(Context context, @NonNull NotificationMessage notificationMessage) {
        try {
            NotificationManager.NotificationLaunchIntentProvider notificationLaunchIntentProvider = this.f17027a;
            if (notificationLaunchIntentProvider != null) {
                return notificationLaunchIntentProvider.getNotificationPendingIntent(context, notificationMessage);
            }
        } catch (IllegalArgumentException e) {
            g.b(NotificationManager.d, e, "Missing FLAG_IMMUTABLE or FLAG_MUTABLE flag in PendingIntent", new Object[0]);
        }
        int iA = l.a(134217728);
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            return null;
        }
        Intent intentA = NotificationManager.a(launchIntentForPackage, notificationMessage);
        intentA.addFlags(134217728);
        return PendingIntent.getActivity(context, notificationMessage.notificationId(), intentA, iA);
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager.NotificationBuilder
    @NonNull
    public NotificationCompat.Builder setupNotificationBuilder(@NonNull Context context, @NonNull NotificationMessage notificationMessage) {
        NotificationCompat.Builder builderA;
        NotificationManager.NotificationBuilder notificationBuilder = this.b;
        if (notificationBuilder != null) {
            try {
                builderA = notificationBuilder.setupNotificationBuilder(context, notificationMessage);
            } catch (Exception e) {
                g.b(NotificationManager.d, e, "Custom notification builder threw an exception.  Using default notification builder.", new Object[0]);
            }
        } else {
            builderA = null;
        }
        if (builderA == null) {
            builderA = a(context, notificationMessage, b(context, notificationMessage), this.d);
            PendingIntent pendingIntentC = c(context, notificationMessage);
            if (pendingIntentC != null) {
                builderA.g = NotificationManager.redirectIntentForAnalytics(context, pendingIntentC, notificationMessage, true);
            }
        }
        return builderA;
    }

    private static Bitmap a(String str) throws IOException {
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            Callback.v(uRLConnectionOpenConnection);
            HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(uRLConnectionOpenConnection));
            httpURLConnection.setDoInput(true);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.connect();
            return BitmapFactory.decodeStream(Callback.b(httpURLConnection));
        } catch (Exception e) {
            g.b(NotificationManager.d, e, "Unable to download image %s", str);
            return null;
        }
    }

    @SuppressLint
    public String b(Context context, NotificationMessage notificationMessage) {
        String notificationChannelId;
        NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider = this.c;
        if (notificationChannelIdProvider != null) {
            try {
                notificationChannelId = notificationChannelIdProvider.getNotificationChannelId(context, notificationMessage);
            } catch (Exception e) {
                g.b(NotificationManager.d, e, "Exception thrown while app determined channel id for notification message.", new Object[0]);
            }
        } else {
            notificationChannelId = null;
        }
        if (notificationChannelId != null) {
            return notificationChannelId;
        }
        b(context, false);
        return NotificationManager.DEFAULT_CHANNEL_ID;
    }

    private static Uri a(Context context, String str, Uri uri) {
        int identifier = context.getResources().getIdentifier(b(str), "raw", context.getPackageName());
        if (identifier <= 0) {
            return uri;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + q2.c + identifier);
    }

    private static String b(String str) {
        return (str == null || str.lastIndexOf(46) <= 0) ? str : str.substring(0, str.lastIndexOf(46));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static androidx.core.app.NotificationCompat.Builder a(android.content.Context r5, com.salesforce.marketingcloud.notifications.NotificationMessage r6, java.lang.String r7, int r8) {
        /*
            androidx.core.app.NotificationCompat$Builder r0 = new androidx.core.app.NotificationCompat$Builder
            r0.<init>(r5, r7)
            android.content.pm.ApplicationInfo r7 = r5.getApplicationInfo()
            int r7 = r7.icon
            r1 = 1
            if (r7 <= 0) goto L24
            android.content.res.Resources r2 = r5.getResources()
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeResource(r2, r7)
            if (r7 != 0) goto L1a
            r7 = 0
            goto L22
        L1a:
            androidx.core.graphics.drawable.IconCompat r2 = new androidx.core.graphics.drawable.IconCompat
            r2.<init>(r1)
            r2.b = r7
            r7 = r2
        L22:
            r0.h = r7
        L24:
            android.app.Notification r7 = r0.x
            r7.icon = r8
            java.lang.String r7 = r6.title()
            r0.h(r7)
            java.lang.String r7 = r6.mediaUrl()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            r8 = 0
            if (r7 != 0) goto L73
            java.lang.String r7 = r6.mediaUrl()     // Catch: java.lang.Exception -> L63
            android.graphics.Bitmap r7 = a(r7)     // Catch: java.lang.Exception -> L63
            if (r7 == 0) goto L73
            androidx.core.app.NotificationCompat$BigPictureStyle r2 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch: java.lang.Exception -> L63
            r2.<init>()     // Catch: java.lang.Exception -> L63
            androidx.core.graphics.drawable.IconCompat r3 = new androidx.core.graphics.drawable.IconCompat     // Catch: java.lang.Exception -> L63
            r3.<init>(r1)     // Catch: java.lang.Exception -> L63
            r3.b = r7     // Catch: java.lang.Exception -> L63
            r2.e = r3     // Catch: java.lang.Exception -> L63
            java.lang.String r7 = r6.alert()     // Catch: java.lang.Exception -> L63
            java.lang.CharSequence r7 = androidx.core.app.NotificationCompat.Builder.c(r7)     // Catch: java.lang.Exception -> L63
            r2.c = r7     // Catch: java.lang.Exception -> L63
            r2.d = r1     // Catch: java.lang.Exception -> L63
            r0.q(r2)     // Catch: java.lang.Exception -> L63
            r7 = r1
            goto L74
        L63:
            r7 = move-exception
            java.lang.String r2 = com.salesforce.marketingcloud.notifications.NotificationManager.d
            java.lang.String r3 = r6.mediaUrl()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r4 = "Unable to load notification image %s"
            com.salesforce.marketingcloud.g.b(r2, r7, r4, r3)
        L73:
            r7 = r8
        L74:
            if (r7 != 0) goto L85
            java.lang.String r2 = r6.mediaAltText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L85
            java.lang.String r2 = r6.mediaAltText()
            goto L89
        L85:
            java.lang.String r2 = r6.alert()
        L89:
            r0.g(r2)
            r0.r(r2)
            if (r7 != 0) goto La9
            androidx.core.app.NotificationCompat$BigTextStyle r7 = new androidx.core.app.NotificationCompat$BigTextStyle
            r7.<init>()
            java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.Builder.c(r2)
            r7.e = r2
            java.lang.String r2 = r6.title()
            java.lang.CharSequence r2 = androidx.core.app.NotificationCompat.Builder.c(r2)
            r7.b = r2
            r0.q(r7)
        La9:
            int[] r7 = com.salesforce.marketingcloud.notifications.b.a.f17028a
            com.salesforce.marketingcloud.notifications.NotificationMessage$Sound r2 = r6.sound()
            int r2 = r2.ordinal()
            r7 = r7[r2]
            if (r7 == r1) goto Lce
            r5 = 2
            if (r7 == r5) goto Lc8
            r5 = 3
            if (r7 == r5) goto Lbe
            goto Ld9
        Lbe:
            java.lang.String r5 = com.salesforce.marketingcloud.notifications.NotificationManager.d
            java.lang.Object[] r6 = new java.lang.Object[r8]
            java.lang.String r7 = "No sound was set for notification."
            com.salesforce.marketingcloud.g.a(r5, r7, r6)
            goto Ld9
        Lc8:
            android.net.Uri r5 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
        Lca:
            r0.p(r5)
            goto Ld9
        Lce:
            java.lang.String r6 = r6.soundName()
            android.net.Uri r7 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            android.net.Uri r5 = a(r5, r6, r7)
            goto Lca
        Ld9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.b.a(android.content.Context, com.salesforce.marketingcloud.notifications.NotificationMessage, java.lang.String, int):androidx.core.app.NotificationCompat$Builder");
    }

    @SuppressLint
    public String a(Context context, NotificationMessage notificationMessage) {
        String notificationChannelId;
        NotificationManager.NotificationChannelIdProvider notificationChannelIdProvider = this.c;
        if (notificationChannelIdProvider != null) {
            try {
                notificationChannelId = notificationChannelIdProvider.getNotificationChannelId(context, notificationMessage);
            } catch (Exception e) {
                g.b(NotificationManager.d, e, "Exception thrown while app determined channel id for notification message.", new Object[0]);
            }
        } else {
            notificationChannelId = null;
        }
        if (notificationChannelId != null) {
            return notificationChannelId;
        }
        a(context, false);
        return NotificationManager.DEFAULT_FOREGROUND_CHANNEL_ID;
    }
}
