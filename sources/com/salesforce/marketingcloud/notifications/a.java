package com.salesforce.marketingcloud.notifications;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.salesforce.marketingcloud.InitializationStatus;
import com.salesforce.marketingcloud.e;
import com.salesforce.marketingcloud.g;
import com.salesforce.marketingcloud.notifications.NotificationManager;
import com.salesforce.marketingcloud.storage.j;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class a extends NotificationManager implements e {
    public static final String n = "com.salesforce.marketingcloud.notifications.OPENED";
    public static final String o = "com.salesforce.marketingcloud.notifications.open.RECEIVED";
    public static final String p = "com.salesforce.marketingcloud.notifications.MESSAGE";
    static final String q = "com.salesforce.marketingcloud.notifications.EXTRA_OPEN_INTENT";
    static final String r = "com.salesforce.marketingcloud.notifications.EXTRA_AUTO_CANCEL";
    public static final int s = -1;
    static final String t = "com.marketingcloud.salesforce.notifications.TAG";

    @VisibleForTesting
    static final String u = "com.marketingcloud.salesforce.notifications.ENABLED";

    @VisibleForTesting
    static final String v = "notification_id_key";
    final com.salesforce.marketingcloud.notifications.b f;
    final Context g;
    private final j h;
    private final com.salesforce.marketingcloud.analytics.j j;
    private NotificationManager.ShouldShowNotificationListener k;
    private BroadcastReceiver l;
    private boolean m = true;
    private final Set<NotificationManager.NotificationMessageDisplayedListener> i = new ArraySet(0);

    /* renamed from: com.salesforce.marketingcloud.notifications.a$a, reason: collision with other inner class name */
    public class C0374a extends Thread {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ NotificationMessage f17025a;
        final /* synthetic */ b b;

        public C0374a(NotificationMessage notificationMessage, b bVar) {
            this.f17025a = notificationMessage;
            this.b = bVar;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @SuppressLint
        public void run() {
            int iNotificationId;
            android.app.NotificationManager notificationManager;
            a aVar = a.this;
            NotificationCompat.Builder builder = aVar.f.setupNotificationBuilder(aVar.g, this.f17025a);
            try {
                notificationManager = (android.app.NotificationManager) a.this.g.getSystemService("notification");
            } catch (Exception e) {
                g.b(NotificationManager.d, e, "Unable to show notification due to an exception thrown by Android.", new Object[0]);
            }
            if (notificationManager != null) {
                notificationManager.notify(a.t, this.f17025a.notificationId(), builder.b());
                a.this.a(this.f17025a);
                iNotificationId = this.f17025a.notificationId();
            } else {
                iNotificationId = -1;
            }
            b bVar = this.b;
            if (bVar != null) {
                bVar.a(iNotificationId);
            }
        }
    }

    public interface b {
        void a(int i);
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) throws PendingIntent.CanceledException {
            if (intent == null) {
                g.a(NotificationManager.d, "Received null intent", new Object[0]);
                return;
            }
            LocalBroadcastManager.a(context).c(new Intent(a.o));
            String action = intent.getAction();
            if (action == null) {
                g.a(NotificationManager.d, "Received null action", new Object[0]);
            } else if (a.n.equals(action)) {
                a.this.a(context, NotificationManager.extractMessage(intent), (PendingIntent) intent.getParcelableExtra(a.q), intent.getBooleanExtra(a.r, true));
            } else {
                g.a(NotificationManager.d, "Received unknown action: %s", action);
            }
        }
    }

    @VisibleForTesting
    public a(Context context, j jVar, com.salesforce.marketingcloud.notifications.b bVar, com.salesforce.marketingcloud.analytics.j jVar2) {
        this.g = context;
        this.h = jVar;
        this.f = bVar;
        this.j = (com.salesforce.marketingcloud.analytics.j) com.salesforce.marketingcloud.util.j.a(jVar2, "MessageAnalyticEventListener is null.");
    }

    private void a(@NonNull Context context) {
        if (this.h == null) {
            return;
        }
        NotificationManagerCompat notificationManagerCompat = new NotificationManagerCompat(context);
        int i = this.h.f().getInt(v, -1);
        for (int i2 = 0; i >= 0 && i2 < 100; i2++) {
            notificationManagerCompat.b.cancel(t, i);
            i--;
        }
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final synchronized boolean areNotificationsEnabled() {
        return this.m;
    }

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return "NotificationManager";
    }

    @Override // com.salesforce.marketingcloud.d
    @Nullable
    public final JSONObject componentState() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notificationsEnabled", areNotificationsEnabled());
            NotificationManager.ShouldShowNotificationListener shouldShowNotificationListener = this.k;
            if (shouldShowNotificationListener == null) {
                return jSONObject;
            }
            jSONObject.put("shouldShowNotificationListener", shouldShowNotificationListener.getClass().getName());
            return jSONObject;
        } catch (JSONException e) {
            g.b(NotificationManager.d, e, "Unable to create component state for %s", componentName());
            return jSONObject;
        }
    }

    @Override // com.salesforce.marketingcloud.e
    public void controlChannelInit(int i) {
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final synchronized void disableNotifications() {
        if (this.m) {
            this.m = false;
            a();
        }
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final synchronized void enableNotifications() {
        if (this.m) {
            return;
        }
        this.m = true;
        a();
    }

    @Override // com.salesforce.marketingcloud.e
    public final void init(@NonNull InitializationStatus.a aVar, int i) {
        this.m = this.h.f().getBoolean(u, true);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(n);
        this.l = new c();
        LocalBroadcastManager.a(this.g).b(this.l, intentFilter);
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final void registerNotificationMessageDisplayedListener(@NonNull NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener) {
        if (notificationMessageDisplayedListener == null) {
            return;
        }
        synchronized (this.i) {
            this.i.add(notificationMessageDisplayedListener);
        }
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public void setShouldShowNotificationListener(@Nullable NotificationManager.ShouldShowNotificationListener shouldShowNotificationListener) {
        this.k = shouldShowNotificationListener;
    }

    @Override // com.salesforce.marketingcloud.d
    public final void tearDown(boolean z) {
        if (z) {
            a(this.g);
        }
        Context context = this.g;
        if (context != null) {
            LocalBroadcastManager.a(context).d(this.l);
        }
    }

    @Override // com.salesforce.marketingcloud.notifications.NotificationManager
    public final void unregisterNotificationMessageDisplayedListener(@NonNull NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener) {
        synchronized (this.i) {
            this.i.remove(notificationMessageDisplayedListener);
        }
    }

    @SuppressLint
    public static a a(@NonNull Context context, @NonNull j jVar, @NonNull NotificationCustomizationOptions notificationCustomizationOptions, @NonNull com.salesforce.marketingcloud.analytics.j jVar2) {
        return new a(context, jVar, new com.salesforce.marketingcloud.notifications.b(notificationCustomizationOptions.smallIconResId, notificationCustomizationOptions.launchIntentProvider, notificationCustomizationOptions.notificationBuilder, notificationCustomizationOptions.channelIdProvider), jVar2);
    }

    public void a(NotificationMessage notificationMessage) {
        synchronized (this.i) {
            if (!this.i.isEmpty()) {
                for (NotificationManager.NotificationMessageDisplayedListener notificationMessageDisplayedListener : this.i) {
                    if (notificationMessageDisplayedListener != null) {
                        try {
                            notificationMessageDisplayedListener.onNotificationMessageDisplayed(notificationMessage);
                        } catch (Exception e) {
                            g.b(NotificationManager.d, e, "%s threw an exception while processing notification message (%s)", notificationMessageDisplayedListener.getClass().getName(), notificationMessage.id());
                        }
                    }
                }
            }
        }
        try {
            this.j.b(notificationMessage);
        } catch (Exception e2) {
            g.b(NotificationManager.d, e2, "Failed to log analytics for message displayed.", new Object[0]);
        }
    }

    public void a(Context context, NotificationMessage notificationMessage, PendingIntent pendingIntent, boolean z) throws PendingIntent.CanceledException {
        g.a(NotificationManager.d, "Notification open Event Logged for id : (%s)", notificationMessage.id());
        this.j.a(notificationMessage);
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (PendingIntent.CanceledException e) {
                g.b(NotificationManager.d, e, "Failed to send notification's open action PendingIntent.", new Object[0]);
            }
        }
        if (z) {
            NotificationManager.cancelNotificationMessage(context, notificationMessage);
        }
        if (Build.VERSION.SDK_INT <= 30) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable(p, notificationMessage);
        com.salesforce.marketingcloud.behaviors.c.a(context, com.salesforce.marketingcloud.behaviors.a.BEHAVIOR_SDK_NOTIFICATION_OPENED, bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5 A[Catch: all -> 0x001d, TryCatch #2 {, blocks: (B:3:0x0001, B:5:0x0008, B:7:0x0019, B:13:0x0022, B:15:0x002d, B:17:0x0038, B:20:0x003d, B:23:0x0045, B:26:0x004a, B:29:0x004f, B:34:0x006f, B:40:0x0088, B:42:0x00a3, B:37:0x0076, B:43:0x00a7, B:45:0x00c5, B:46:0x00ca, B:32:0x0055), top: B:55:0x0001, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void a(@androidx.annotation.NonNull com.salesforce.marketingcloud.notifications.NotificationMessage r9, @androidx.annotation.Nullable com.salesforce.marketingcloud.notifications.a.b r10) {
        /*
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.areNotificationsEnabled()     // Catch: java.lang.Throwable -> L1d
            r1 = -1
            if (r0 != 0) goto L22
            java.lang.String r0 = com.salesforce.marketingcloud.notifications.NotificationManager.d     // Catch: java.lang.Throwable -> L1d
            java.lang.String r9 = r9.id()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r9 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "Notifications are not enabled.  Message %s will not be displayed"
            com.salesforce.marketingcloud.g.a(r0, r2, r9)     // Catch: java.lang.Throwable -> L1d
            if (r10 == 0) goto L20
            r10.a(r1)     // Catch: java.lang.Throwable -> L1d
            goto L20
        L1d:
            r9 = move-exception
            goto Ldb
        L20:
            monitor-exit(r8)
            return
        L22:
            java.lang.String r0 = r9.alert()     // Catch: java.lang.Throwable -> L1d
            int r0 = android.text.TextUtils.getTrimmedLength(r0)     // Catch: java.lang.Throwable -> L1d
            r2 = 0
            if (r0 != 0) goto L3d
            java.lang.String r9 = com.salesforce.marketingcloud.notifications.NotificationManager.d     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r0 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "Notifications with no alert message are not shown."
            com.salesforce.marketingcloud.g.a(r9, r2, r0)     // Catch: java.lang.Throwable -> L1d
            if (r10 == 0) goto L3b
            r10.a(r1)     // Catch: java.lang.Throwable -> L1d
        L3b:
            monitor-exit(r8)
            return
        L3d:
            int r0 = r9.notificationId()     // Catch: java.lang.Throwable -> L1d
            if (r0 < 0) goto L4a
            if (r10 == 0) goto L48
            r10.a(r1)     // Catch: java.lang.Throwable -> L1d
        L48:
            monitor-exit(r8)
            return
        L4a:
            com.salesforce.marketingcloud.notifications.NotificationManager$ShouldShowNotificationListener r0 = r8.k     // Catch: java.lang.Throwable -> L1d
            r3 = 1
            if (r0 == 0) goto La7
            boolean r0 = r0.shouldShowNotification(r9)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L54
            goto L6f
        L54:
            r0 = move-exception
            java.lang.String r4 = com.salesforce.marketingcloud.notifications.NotificationManager.d     // Catch: java.lang.Throwable -> L1d
            com.salesforce.marketingcloud.notifications.NotificationManager$ShouldShowNotificationListener r5 = r8.k     // Catch: java.lang.Throwable -> L1d
            java.lang.Class r5 = r5.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = r9.id()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = "%s threw an exception while processing shouldShowNotification() for messageId: %s"
            com.salesforce.marketingcloud.g.b(r4, r0, r6, r5)     // Catch: java.lang.Throwable -> L1d
            r0 = r3
        L6f:
            com.salesforce.marketingcloud.analytics.j r4 = r8.j     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L75
            r4.a(r9, r0)     // Catch: java.lang.Throwable -> L1d java.lang.Exception -> L75
            goto L85
        L75:
            r4 = move-exception
            java.lang.String r5 = com.salesforce.marketingcloud.notifications.NotificationManager.d     // Catch: java.lang.Throwable -> L1d
            java.lang.String r6 = r9.id()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L1d
            java.lang.String r7 = "Failed to log Should Show Notification analytic for messageId: %s"
            com.salesforce.marketingcloud.g.b(r5, r4, r7, r6)     // Catch: java.lang.Throwable -> L1d
        L85:
            if (r0 == 0) goto L88
            goto La7
        L88:
            java.lang.String r0 = com.salesforce.marketingcloud.notifications.NotificationManager.d     // Catch: java.lang.Throwable -> L1d
            com.salesforce.marketingcloud.notifications.NotificationManager$ShouldShowNotificationListener r2 = r8.k     // Catch: java.lang.Throwable -> L1d
            java.lang.Class r2 = r2.getClass()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r9 = r9.id()     // Catch: java.lang.Throwable -> L1d
            java.lang.Object[] r9 = new java.lang.Object[]{r2, r9}     // Catch: java.lang.Throwable -> L1d
            java.lang.String r2 = "%s responded false to shouldShowNotification() for messageId: %s"
            com.salesforce.marketingcloud.g.a(r0, r2, r9)     // Catch: java.lang.Throwable -> L1d
            if (r10 == 0) goto Ld9
            r10.a(r1)     // Catch: java.lang.Throwable -> L1d
            goto Ld9
        La7:
            com.salesforce.marketingcloud.storage.j r0 = r8.h     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences r0 = r0.f()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "notification_id_key"
            int r1 = r0.getInt(r1, r2)     // Catch: java.lang.Throwable -> L1d
            com.salesforce.marketingcloud.internal.h.a(r9, r1)     // Catch: java.lang.Throwable -> L1d
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = "notification_id_key"
            int r4 = r9.notificationId()     // Catch: java.lang.Throwable -> L1d
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 >= r5) goto Lca
            int r2 = r9.notificationId()     // Catch: java.lang.Throwable -> L1d
            int r2 = r2 + r3
        Lca:
            android.content.SharedPreferences$Editor r0 = r0.putInt(r1, r2)     // Catch: java.lang.Throwable -> L1d
            r0.apply()     // Catch: java.lang.Throwable -> L1d
            com.salesforce.marketingcloud.notifications.a$a r0 = new com.salesforce.marketingcloud.notifications.a$a     // Catch: java.lang.Throwable -> L1d
            r0.<init>(r9, r10)     // Catch: java.lang.Throwable -> L1d
            r0.start()     // Catch: java.lang.Throwable -> L1d
        Ld9:
            monitor-exit(r8)
            return
        Ldb:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L1d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.notifications.a.a(com.salesforce.marketingcloud.notifications.NotificationMessage, com.salesforce.marketingcloud.notifications.a$b):void");
    }

    private void a() {
        j jVar = this.h;
        if (jVar != null) {
            jVar.f().edit().putBoolean(u, this.m).apply();
        }
    }
}
