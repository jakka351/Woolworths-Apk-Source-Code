package com.salesforce.marketingcloud;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Store;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public class MCService extends c {
    static final String k = "com.salesforce.marketingcloud.HTTP_REQUEST";
    static final String l = "com.salesforce.marketingcloud.ALARM_WAKE";
    static final String m = "com.salesforce.marketingcloud.SYSTEM_BEHAVIOR";
    static final String n = "com.salesforce.marketingcloud.TOKEN_REQUEST";
    private static final String o = "behavior";
    private static final String p = "data";
    private static final String q = "alarmName";
    private static final String r = "senderId";
    private static final int s = 3000;

    public class a implements OnCompleteListener<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String[] f16826a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;

        public a(String[] strArr, Context context, String str) {
            this.f16826a = strArr;
            this.b = context;
            this.c = str;
        }

        @Override // com.google.android.gms.tasks.OnCompleteListener
        public void onComplete(@NonNull Task<String> task) {
            if (task.isSuccessful()) {
                this.f16826a[0] = task.getResult();
            }
            com.salesforce.marketingcloud.messages.push.a.a(this.b, !TextUtils.isEmpty(this.f16826a[0]), this.c, this.f16826a[0]);
        }
    }

    public static void a(@NonNull Context context, String str) {
        g.d(c.h, "enqueueAlarmWake - %s", str);
        Bundle bundle = new Bundle();
        bundle.putString(q, str);
        a(context, l, bundle);
    }

    public static void b(@NonNull Context context, @NonNull String str) {
        g.d(c.h, "enqueueTokenRequest", new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putString(r, str);
        a(context, n, bundle);
    }

    private static void c(Context context, String str) {
        if (str == null) {
            g.d(c.h, "alarm name not provided", new Object[0]);
            return;
        }
        g.d(c.h, "handleAlarmWakeup - %s", str);
        LocalBroadcastManager.a(context).c(new Intent(com.salesforce.marketingcloud.alarms.b.j).putExtra("com.salesforce.marketingcloud.WAKE_FOR_ALARM", str));
    }

    @VisibleForTesting
    public static void d(Context context, String str) {
        FirebaseMessaging firebaseMessaging;
        if (TextUtils.isEmpty(str)) {
            g.a(c.h, "Unable to refresh system token.  SenderId was invalid", new Object[0]);
            return;
        }
        g.d(c.h, "handleTokenRequest", new Object[0]);
        String[] strArr = {null};
        try {
            Store store = FirebaseMessaging.m;
            synchronized (FirebaseMessaging.class) {
                firebaseMessaging = FirebaseMessaging.getInstance(FirebaseApp.d());
            }
            firebaseMessaging.d().addOnCompleteListener(new a(strArr, context, str));
        } catch (Exception e) {
            g.b(c.h, e, "Failed to retrieve InstanceId from Firebase.", new Object[0]);
        }
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(@NonNull Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.salesforce.marketingcloud.c, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(@Nullable Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }

    public static void a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.http.b bVar) {
        g.d(c.h, "handleHttpRequest - %s", bVar.r());
        a(context, k, bVar.s());
    }

    @VisibleForTesting
    public static void b(Context context, com.salesforce.marketingcloud.http.b bVar) {
        if (bVar == null) {
            g.d(c.h, "request was null", new Object[0]);
        } else {
            g.d(c.h, "handleHttpRequest - %s", bVar.r());
            LocalBroadcastManager.a(context).c(new Intent(com.salesforce.marketingcloud.http.c.j).putExtra(com.salesforce.marketingcloud.http.c.l, bVar.s()).putExtra(com.salesforce.marketingcloud.http.c.k, a(context) ? bVar.j() : com.salesforce.marketingcloud.http.d.a("No connectivity", -1)));
        }
    }

    @Override // com.salesforce.marketingcloud.c
    public /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    public static void a(@NonNull Context context, @NonNull com.salesforce.marketingcloud.behaviors.a aVar, @Nullable Bundle bundle) {
        g.d(c.h, "enqueueSystemBehavior - %s", aVar);
        Bundle bundle2 = new Bundle();
        bundle2.putString(o, aVar.f16855a);
        bundle2.putBundle(p, bundle);
        a(context, m, bundle2);
    }

    private static void b(Context context, com.salesforce.marketingcloud.behaviors.a aVar, Bundle bundle) {
        if (aVar == null) {
            g.d(c.h, "Behavior was null", new Object[0]);
        } else {
            g.d(c.h, "handleSystemBehavior - %s", aVar);
            com.salesforce.marketingcloud.behaviors.c.a(context, aVar, bundle);
        }
    }

    private static void a(Context context, String str, Bundle bundle) {
        c.a(context, MCService.class, 3000, new Intent(str).putExtras(bundle));
    }

    @Override // com.salesforce.marketingcloud.c
    public /* bridge */ /* synthetic */ void b(boolean z) {
        super.b(z);
    }

    private static boolean a(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnectedOrConnecting()) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    @Override // com.salesforce.marketingcloud.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(@androidx.annotation.NonNull android.content.Intent r7) {
        /*
            r6 = this;
            java.lang.String r0 = r7.getAction()
            if (r0 != 0) goto L8
            goto L76
        L8:
            android.content.Context r1 = r6.getApplicationContext()
            r2 = 500(0x1f4, double:2.47E-321)
            r4 = 50
            boolean r2 = com.salesforce.marketingcloud.util.l.a(r2, r4)
            r3 = 0
            if (r2 == 0) goto L8b
            com.salesforce.marketingcloud.MarketingCloudSdk r2 = com.salesforce.marketingcloud.MarketingCloudSdk.getInstance()
            if (r2 == 0) goto L8b
            int r2 = r0.hashCode()
            r4 = -1
            switch(r2) {
                case -1341919505: goto L48;
                case -525195028: goto L3d;
                case 352488053: goto L32;
                case 848031877: goto L27;
                default: goto L25;
            }
        L25:
            r3 = r4
            goto L51
        L27:
            java.lang.String r2 = "com.salesforce.marketingcloud.SYSTEM_BEHAVIOR"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L30
            goto L25
        L30:
            r3 = 3
            goto L51
        L32:
            java.lang.String r2 = "com.salesforce.marketingcloud.HTTP_REQUEST"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L3b
            goto L25
        L3b:
            r3 = 2
            goto L51
        L3d:
            java.lang.String r2 = "com.salesforce.marketingcloud.TOKEN_REQUEST"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L46
            goto L25
        L46:
            r3 = 1
            goto L51
        L48:
            java.lang.String r2 = "com.salesforce.marketingcloud.ALARM_WAKE"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L51
            goto L25
        L51:
            switch(r3) {
                case 0: goto L81;
                case 1: goto L77;
                case 2: goto L69;
                case 3: goto L55;
                default: goto L54;
            }
        L54:
            goto L76
        L55:
            java.lang.String r0 = "behavior"
            java.lang.String r0 = r7.getStringExtra(r0)
            com.salesforce.marketingcloud.behaviors.a r0 = com.salesforce.marketingcloud.behaviors.a.a(r0)
            java.lang.String r2 = "data"
            android.os.Bundle r7 = r7.getBundleExtra(r2)
            b(r1, r0, r7)
            return
        L69:
            android.os.Bundle r7 = r7.getExtras()
            if (r7 == 0) goto L76
            com.salesforce.marketingcloud.http.b r7 = com.salesforce.marketingcloud.http.b.a(r7)
            b(r1, r7)
        L76:
            return
        L77:
            java.lang.String r0 = "senderId"
            java.lang.String r7 = r7.getStringExtra(r0)
            d(r1, r7)
            return
        L81:
            java.lang.String r0 = "alarmName"
            java.lang.String r7 = r7.getStringExtra(r0)
            c(r1, r7)
            return
        L8b:
            java.lang.String r7 = com.salesforce.marketingcloud.c.h
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.String r1 = "MarketingCloudSdk#init must be called in your application's onCreate"
            com.salesforce.marketingcloud.g.e(r7, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.MCService.a(android.content.Intent):void");
    }

    @Override // com.salesforce.marketingcloud.c
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }
}
