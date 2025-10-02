package com.medallia.digital.mobilesdk;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Icon;
import android.text.TextUtils;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.medallia.digital.mobilesdk.InviteData;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import java.io.File;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;

/* loaded from: classes.dex */
public class v3 implements LifeCycle.h {
    private static final String c = "Medallia Digital Notifications Tag";
    public static final int d = 1000;
    private static v3 e;
    protected static String f;
    private static final BroadcastReceiver g = new a();

    /* renamed from: a, reason: collision with root package name */
    private boolean f16745a;
    private boolean b;

    public class a extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                try {
                    if (intent.hasExtra(MDLocalNotificationConsts.MEDALLIA_DIGITAL_SDK_SURVEY_FORM_ID)) {
                        String stringExtra = intent.getStringExtra(MDLocalNotificationConsts.MEDALLIA_DIGITAL_SDK_SURVEY_FORM_ID);
                        a4.b("decline LN with formId: " + stringExtra);
                        if (!LifeCycle.b().f() && LifeCycle.b().a() != null) {
                            v3.c(stringExtra);
                            return;
                        }
                        a4.b("App is in BG - saving LN id in storage");
                        d7.b().c(d7.a.LN_DEFERRED_IDS, stringExtra);
                    }
                } catch (Exception e) {
                    a4.c(e.getMessage());
                }
            }
        }
    }

    @RequiresApi
    private Notification a(t3 t3Var, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Bitmap bitmapDecodeFile;
        Notification.Builder autoCancel = new Notification.Builder(i4.c().d(), "Medallia Digital").setShowWhen(true).setWhen(System.currentTimeMillis()).setAutoCancel(true);
        autoCancel.setSmallIcon(R.drawable.local_notification_small_icon);
        if (!TextUtils.isEmpty(t3Var.a())) {
            File fileD = g2.d(t3Var.a());
            if (fileD.exists() && (bitmapDecodeFile = BitmapFactory.decodeFile(fileD.getAbsolutePath())) != null) {
                autoCancel.setSmallIcon(Icon.createWithBitmap(bitmapDecodeFile));
            }
        }
        if (t3Var.getTitle() != null && !t3Var.getTitle().isEmpty()) {
            autoCancel.setContentTitle(t3Var.getTitle());
        }
        if (t3Var.b() != null && !t3Var.b().isEmpty()) {
            autoCancel.setContentText(t3Var.b());
        }
        if (t3Var.d() > 0) {
            autoCancel.setTimeoutAfter(t3Var.d());
        }
        if (pendingIntent != null) {
            autoCancel.setContentIntent(pendingIntent);
        }
        if (pendingIntent2 != null) {
            autoCancel.setDeleteIntent(pendingIntent2);
        }
        return autoCancel.build();
    }

    private Notification b(t3 t3Var, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(i4.c().d(), "Medallia Digital");
        builder.m(1);
        builder.i(-1);
        builder.n();
        builder.t(System.currentTimeMillis());
        builder.d(true);
        builder.o(R.drawable.local_notification_small_icon);
        if (t3Var.getTitle() != null && !t3Var.getTitle().isEmpty()) {
            builder.h(t3Var.getTitle());
        }
        if (t3Var.b() != null && !t3Var.b().isEmpty()) {
            builder.g(t3Var.b());
        }
        if (t3Var.d() > 0) {
            builder.s(t3Var.d());
        }
        if (pendingIntent != null) {
            builder.f(pendingIntent);
        }
        if (pendingIntent2 != null) {
            builder.j(pendingIntent2);
        }
        return builder.b();
    }

    private static void c() {
        String packageName = i4.c().b().getPackageName();
        if (packageName == null || packageName.isEmpty()) {
            a4.b("cannot create delete LN broadcast since package name is null or empty");
            return;
        }
        a4.b("delete LN packageName: ".concat(packageName));
        if (f == null) {
            f = "com.medallia.digital.mobilesdk.LocalNotificationDeclineBroadcastFilter".concat(packageName);
        }
        a4.b("delete LN filter: " + f);
        i4.c().b().registerReceiver(g, new IntentFilter(f), 4);
    }

    private void d(String str) throws JSONException {
        AnalyticsBridge.getInstance().reportInvitationDisplayedEvent(str, InviteData.a.LOCAL_NOTIFICATION.toString(), null, null);
        Broadcasts.h.a(Broadcasts.h.a.invitationDisplayed);
    }

    private int e() {
        return 201326592;
    }

    public static v3 f() {
        if (e == null) {
            e = new v3();
        }
        return e;
    }

    private t3 g() {
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.LocalNotification;
        if (f1VarA.c(aVar) > 0) {
            return (t3) f1.a().b(aVar, "getLNWithMinDelay");
        }
        a4.b("LocalNotification DB is empty");
        return null;
    }

    public void h() throws JSONException {
        if (LifeCycle.b().f() || this.f16745a) {
            return;
        }
        a4.e("LocalNotificationService start initialize");
        p4.d().b();
        f1 f1VarA = f1.a();
        b0.a aVar = b0.a.LocalNotification;
        if (f1VarA.c(aVar) > 0) {
            f1.a().a(aVar);
        }
        d7.b().b(d7.a.IS_ON_DESTROY_CALLED, false);
        d7.b().a(d7.a.BG_STARTED_TIMESTAMP);
        LifeCycle.b().a(this);
        this.f16745a = true;
        if (LifeCycle.b().a() != null) {
            d7 d7VarB = d7.b();
            d7.a aVar2 = d7.a.LN_DEFERRED_IDS;
            Set<String> setA = d7VarB.a(aVar2, new HashSet());
            d7.b().b(aVar2, (Set<String>) null);
            d7 d7VarB2 = d7.b();
            d7.a aVar3 = d7.a.LN_DISPLAYED_IDS;
            Set<String> setA2 = d7VarB2.a(aVar3, new HashSet());
            d7.b().b(aVar3, (Set<String>) null);
            if (setA != null && !setA.isEmpty()) {
                Iterator<String> it = setA.iterator();
                while (it.hasNext()) {
                    c(it.next());
                }
            }
            if (setA2 == null || setA2.isEmpty()) {
                return;
            }
            Iterator<String> it2 = setA2.iterator();
            while (it2.hasNext()) {
                d(it2.next());
            }
        }
    }

    public void i() throws JSONException {
        if (!this.f16745a) {
            h();
        }
        if (this.b) {
            return;
        }
        a4.e("LocalNotificationService start initialize for results");
        c();
        LifeCycle.b().a(this);
        p4.d().e();
        this.b = true;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        a4.e("LocalNotificationService onBackground, isInitForResults:" + this.b);
        if (this.b) {
            d();
            if (f1.a().c(b0.a.LocalNotification) > 0) {
                a4.b("LocalNotification DB is not empty - handling BG notifications");
                d7.b().b(d7.a.BG_STARTED_TIMESTAMP, System.currentTimeMillis());
                d7.b().b(d7.a.IS_ON_DESTROY_CALLED, true);
                b();
            } else {
                a4.b("LocalNotification DB is empty");
            }
            p4.d().a();
            this.b = false;
        }
        this.f16745a = false;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() throws JSONException {
        a4.e("LocalNotificationService onForeground");
        h();
    }

    private Notification a(t3 t3Var, Intent intent) {
        PendingIntent pendingIntentB = b(t3Var);
        PendingIntent pendingIntentB2 = intent == null ? t3Var != null ? b(t3Var.getFormId()) : null : a(intent);
        if (t3Var != null) {
            return a(t3Var, pendingIntentB2, pendingIntentB);
        }
        a4.b("LocalNotificationData is null - cannot create Notification");
        return null;
    }

    private PendingIntent b(t3 t3Var) {
        if (t3Var == null) {
            a4.b("LocalNotificationData is null - cannot create Delete PendingIntent");
            return null;
        }
        if (f == null) {
            c();
        }
        if (f == null) {
            a4.b("LocalNotificationData is null - cannot create Delete PendingIntent");
            return null;
        }
        Intent intent = new Intent(f);
        intent.putExtra(MDLocalNotificationConsts.MEDALLIA_DIGITAL_SDK_SURVEY_FORM_ID, t3Var.getFormId());
        return PendingIntent.getBroadcast(i4.c().d(), 0, intent, e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) throws JSONException {
        AnalyticsBridge.getInstance().reportInvitationDeferredEvent(str, InviteData.a.LOCAL_NOTIFICATION.name(), new e3(null, false));
    }

    public void d() {
        try {
            i4.c().b().unregisterReceiver(g);
        } catch (Exception e2) {
            a4.c(e2.getMessage());
        }
        new NotificationManagerCompat(i4.c().d()).b.cancelAll();
    }

    private PendingIntent a(Intent intent) {
        return PendingIntent.getActivity(i4.c().d(), 0, intent, e());
    }

    private PendingIntent b(String str) {
        try {
            Intent launchIntentForPackage = i4.c().b().getPackageManager().getLaunchIntentForPackage(i4.c().b().getPackageName());
            launchIntentForPackage.setAction(str);
            launchIntentForPackage.putExtra(MDLocalNotificationConsts.MEDALLIA_DIGITAL_SDK_SURVEY_FORM_ID, str);
            launchIntentForPackage.addFlags(268435456);
            return a(launchIntentForPackage);
        } catch (Exception e2) {
            a4.c(YU.a.f(e2, new StringBuilder("cannot create local notification intent ")));
            return null;
        }
    }

    public void a() throws JSONException {
        t3 t3VarG = g();
        if (t3VarG == null) {
            a4.b("LocalNotificationData is null - cannot create BG notification");
            return;
        }
        f1.a().a(t3VarG);
        if (LifeCycle.b().f() || LifeCycle.b().a() == null) {
            a4.b("App is in BG - saving LN id in storage");
            d7.b().c(d7.a.LN_DISPLAYED_IDS, t3VarG.getFormId());
        } else {
            d(t3VarG.getFormId());
        }
        a(t3VarG);
    }

    private void a(t3 t3Var) {
        b(t3Var, null);
    }

    public void b() {
        if (LifeCycle.b().f()) {
            t3 t3VarG = g();
            if (t3VarG == null) {
                a4.b("LocalNotificationData is null - cannot create BG LN worker");
                return;
            }
            long jC = t3VarG.c();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jA = d7.b().a(d7.a.BG_STARTED_TIMESTAMP, jCurrentTimeMillis);
            StringBuilder sbT = androidx.camera.core.impl.b.t(jC, "LocalNotificationData workerDelay is: ", " storage: ");
            sbT.append(jA);
            a4.b(au.com.woolworths.shop.checkout.ui.confirmation.c.m(jCurrentTimeMillis, " currentTime: ", sbT));
            p4.d().a(Math.max(0L, jC - ((jCurrentTimeMillis - jA) / 1000)));
        }
    }

    public void b(t3 t3Var, Intent intent) {
        if (t3Var == null) {
            a4.b("LocalNotificationData is null - cannot generate Notification");
            return;
        }
        if (t3Var.getFormId() == null) {
            a4.b("Form ID is null - cannot display Notification");
            return;
        }
        Notification notificationA = a(t3Var, intent);
        if (notificationA == null) {
            a4.b("Notification is null - cannot display Notification");
            return;
        }
        NotificationManagerCompat notificationManagerCompat = new NotificationManagerCompat(i4.c().d());
        notificationManagerCompat.a(new NotificationChannel("Medallia Digital", "Medallia Digital", 4));
        notificationManagerCompat.d(Integer.parseInt(t3Var.getFormId()), notificationA);
    }
}
