package com.swrve.sdk;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import com.salesforce.marketingcloud.storage.db.k;
import com.swrve.sdk.notifications.model.SwrveNotificationButton;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes6.dex */
class SwrveNotificationEngage {

    /* renamed from: a, reason: collision with root package name */
    public final Context f19065a;
    public Bundle b;
    public Bundle c;
    public String d;
    public String e;
    public HashMap f;

    /* renamed from: com.swrve.sdk.SwrveNotificationEngage$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19066a;

        static {
            int[] iArr = new int[SwrveNotificationButton.ActionType.values().length];
            f19066a = iArr;
            try {
                iArr[SwrveNotificationButton.ActionType.OPEN_URL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19066a[SwrveNotificationButton.ActionType.OPEN_APP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19066a[SwrveNotificationButton.ActionType.OPEN_CAMPAIGN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19066a[SwrveNotificationButton.ActionType.DISMISS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public SwrveNotificationEngage(Context context) {
        this.f19065a = context;
    }

    public final HashMap a() {
        Bundle bundle = this.b.getBundle("event_payload");
        String str = SwrveHelper.f19056a;
        HashMap map = new HashMap();
        if (bundle != null) {
            for (String str2 : bundle.keySet()) {
                map.put(str2, bundle.getString(str2));
            }
        }
        if (this.c.containsKey("_td")) {
            map.put("trackingData", this.c.getString("_td"));
        }
        if (this.c.containsKey("_smp")) {
            map.put(k.a.b, this.c.getString("_smp"));
        }
        return map;
    }

    /* JADX WARN: Type inference failed for: r0v19, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v17, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v19, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v7, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void b(String str) throws PendingIntent.CanceledException, ClassNotFoundException {
        SwrveLogger.b("SwrveSDK: Handle button engagement pushId: %s, with contextId: %s", this.d, str);
        String string = this.b.getString("action_url");
        if (SwrveHelper.o(string)) {
            this.f.put("deeplink", string);
        }
        String str2 = this.e;
        String str3 = this.d;
        HashMap map = this.f;
        Context context = this.f19065a;
        EventHelper.i(context, str2, str3, map);
        this.f.put("buttonText", this.b.getString("button_text"));
        String str4 = this.e;
        String str5 = this.d;
        HashMap map2 = this.f;
        try {
            ?? r0 = SwrveCommon.f19047a;
            ArrayList arrayListA = EventHelper.a(System.currentTimeMillis(), str5, str4, "button_click", str, null, map2, r0.p());
            SwrveLogger.b("Sending button_click for id:%s contextId:%s campaignType:%s", str5, str, str4);
            r0.f(context, r0.getUserId(), arrayListA);
        } catch (Exception e) {
            SwrveLogger.c("Exception trying to send button click event.", e, new Object[0]);
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(this.b.getInt("notification_id"));
        if (((SwrveNotificationButton.ActionType) this.b.get("action_type")) == SwrveNotificationButton.ActionType.OPEN_CAMPAIGN) {
            ?? r15 = SwrveCommon.f19047a;
            if (SwrveHelper.o(string)) {
                r15.v(string);
            }
        }
        if (SwrveCommon.f19047a.y() != null) {
            SwrveCommon.f19047a.y().getClass();
        }
        int i = AnonymousClass1.f19066a[((SwrveNotificationButton.ActionType) this.b.get("action_type")).ordinal()];
        if (i == 1) {
            e(this.c, string);
        } else if (i == 2) {
            d(this.c);
        } else {
            if (i != 3) {
                return;
            }
            d(this.c);
        }
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void c() throws PendingIntent.CanceledException, ClassNotFoundException {
        SwrveLogger.b("SwrveSDK: Handle notification engagement pushId: %s", this.d);
        String string = this.b.getString(NotificationResult.Notification.CAMPAIGN);
        ?? r1 = SwrveCommon.f19047a;
        if (SwrveHelper.o(string)) {
            r1.v(string);
        }
        String string2 = this.c.getString("_sd");
        if (SwrveHelper.o(string2)) {
            this.f.put("deeplink", string2);
        }
        EventHelper.i(this.f19065a, this.e, this.d, this.f);
        if (SwrveCommon.f19047a.y() != null) {
            SwrveCommon.f19047a.y().getClass();
        }
        if (SwrveHelper.o(string2)) {
            e(this.c, string2);
        } else {
            d(this.c);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void d(Bundle bundle) throws PendingIntent.CanceledException, ClassNotFoundException {
        Class<?> cls;
        String str;
        SwrveCommon.f19047a.y();
        SwrveNotificationConfig swrveNotificationConfigY = SwrveCommon.f19047a.y();
        Context context = this.f19065a;
        Intent intent = null;
        if (swrveNotificationConfigY == null || (cls = swrveNotificationConfigY.f19063a) == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(packageManager.getLaunchIntentForPackage(context.getPackageName()), 65536);
                if (resolveInfoResolveActivity != null) {
                    str = resolveInfoResolveActivity.activityInfo.name;
                    if (str.startsWith(".")) {
                        str = context.getPackageName() + str;
                    }
                } else {
                    str = null;
                }
            } catch (Exception e) {
                SwrveLogger.c("Exception getting activity class to start when notification is engaged.", e, new Object[0]);
            }
            if (SwrveHelper.o(str)) {
                if (str.startsWith(".")) {
                    str = context.getPackageName() + str;
                }
                cls = Class.forName(str);
            } else {
                cls = null;
            }
        }
        if (cls != null) {
            intent = new Intent(context, cls);
            intent.putExtra("notification", bundle);
            intent.setAction("openActivity");
            intent.addFlags(335609856);
        }
        PendingIntent.getActivity(context, (int) (new Date().getTime() % 2147483647L), intent, 201326592).send();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void e(Bundle bundle, String str) {
        SwrveCommon.f19047a.y();
        Intent intentA = SwrveIntentHelper.a(bundle, str);
        ?? r0 = SwrveCommon.f19047a;
        if (r0 != 0) {
            r0.w();
        }
        SwrveLogger.b("SwrveSDK: Opening deeplink: %s", str);
        this.f19065a.startActivity(intentA);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void f(Intent intent) {
        Bundle bundle;
        if (intent == null || intent.getExtras() == null || intent.getExtras().isEmpty()) {
            return;
        }
        try {
            Bundle extras = intent.getExtras();
            this.b = extras;
            bundle = extras.getBundle("notification");
            this.c = bundle;
        } catch (Exception e) {
            SwrveLogger.c("SwrveNotificationEngage.processIntent", e, new Object[0]);
        }
        if (bundle == null) {
            return;
        }
        Object obj = bundle.get("_p");
        String string = obj != null ? obj.toString() : null;
        this.d = string;
        if (SwrveHelper.p(string)) {
            return;
        }
        this.f19065a.getSharedPreferences("swrve.influenced_data_v2", 0).edit().remove(this.d).apply();
        this.e = this.b.getString("campaign_type");
        this.f = a();
        String string2 = this.b.getString("context_id_key");
        if (SwrveHelper.o(string2)) {
            b(string2);
        } else {
            c();
        }
        try {
            SwrveCommon.f19047a.e();
        } catch (Exception e2) {
            SwrveLogger.c("SwrveNotificationEngage.executeCustomNotificationListener Error executing CustomNotificationListener", e2, new Object[0]);
        }
    }
}
