package com.swrve.sdk;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.salesforce.marketingcloud.storage.db.k;
import com.swrve.sdk.config.SwrveInAppMessageConfig;
import com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException;
import com.swrve.sdk.messaging.SwrveActionType;
import com.swrve.sdk.messaging.SwrveButton;
import com.swrve.sdk.messaging.SwrveInAppCampaign;
import com.swrve.sdk.messaging.SwrveMessage;
import com.swrve.sdk.messaging.SwrveMessageFormat;
import com.swrve.sdk.messaging.SwrveMessagePage;
import com.swrve.sdk.messaging.SwrveOrientation;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* loaded from: classes6.dex */
class InAppMessageHandler {
    public final SwrveInAppMessageActivity b;
    public final Bundle c;
    public final Map d;
    public final SwrveMessage e;
    public final SwrveMessageFormat f;

    /* renamed from: a, reason: collision with root package name */
    public final SwrveBase f19034a = (SwrveBase) SwrveSDKBase.f19075a;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* renamed from: com.swrve.sdk.InAppMessageHandler$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f19035a;

        static {
            int[] iArr = new int[SwrveActionType.values().length];
            f19035a = iArr;
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19035a[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19035a[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19035a[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19035a[5] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19035a[6] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19035a[7] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19035a[8] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f19035a[2] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public InAppMessageHandler(SwrveInAppMessageActivity swrveInAppMessageActivity, Intent intent, Bundle bundle) {
        SwrveMessage swrveMessageQ0;
        this.b = swrveInAppMessageActivity;
        this.c = bundle;
        if (bundle != null && bundle.containsKey("SENT_NAVIGATION_EVENTS")) {
            for (long j : bundle.getLongArray("SENT_NAVIGATION_EVENTS")) {
                this.g.add(Long.valueOf(j));
            }
        }
        if (bundle != null && bundle.containsKey("SENT_PAGEVIEW_EVENTS")) {
            for (long j2 : bundle.getLongArray("SENT_PAGEVIEW_EVENTS")) {
                this.h.add(Long.valueOf(j2));
            }
        }
        if (intent == null || intent.getExtras() == null) {
            return;
        }
        Bundle extras = intent.getExtras();
        int i = extras.getInt("message_id");
        SwrveBase swrveBase = this.f19034a;
        swrveBase.getClass();
        SwrveMessageFormat swrveMessageFormat = null;
        try {
            swrveMessageQ0 = swrveBase.q0(i);
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            swrveMessageQ0 = null;
        }
        this.e = swrveMessageQ0;
        if (swrveMessageQ0 == null && extras.getBoolean("ad_message_key")) {
            SwrveDeeplinkManager swrveDeeplinkManager = this.f19034a.Z;
            SwrveMessage swrveMessage = swrveDeeplinkManager != null ? swrveDeeplinkManager.g : null;
            if (swrveMessage == null) {
                SwrveLogger.e("Not showing messages: no candidate messages", new Object[0]);
            }
            this.e = swrveMessage;
        }
        if (this.e == null) {
            return;
        }
        SwrveOrientation swrveOrientation = swrveInAppMessageActivity.getResources().getConfiguration().orientation == 1 ? SwrveOrientation.d : SwrveOrientation.e;
        ArrayList arrayList = this.e.e;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SwrveMessageFormat swrveMessageFormat2 = (SwrveMessageFormat) it.next();
                if (swrveMessageFormat2.c == swrveOrientation) {
                    swrveMessageFormat = swrveMessageFormat2;
                    break;
                }
            }
        }
        this.f = swrveMessageFormat;
        if (swrveMessageFormat == null) {
            this.f = (SwrveMessageFormat) this.e.e.get(0);
        }
        this.d = (Map) extras.getSerializable("message_personalization");
    }

    public final void a(HashMap map, HashMap map2) {
        String str = (String) map2.get("key");
        String str2 = (String) map2.get("value");
        try {
            String strA = SwrveTextTemplating.a(str2, this.d);
            if (SwrveHelper.p(str) || SwrveHelper.p(strA)) {
                return;
            }
            map.put(str, strA);
        } catch (SwrveSDKTextTemplatingException unused) {
            SwrveLogger.d("Failed to resolve personalization in InAppMessageHandler for key:%s value:%s", str, str2);
        }
    }

    public final void b(long j) {
        long j2;
        String str;
        SwrveMessageFormat swrveMessageFormat = this.f;
        if (swrveMessageFormat.e.containsKey(Long.valueOf(j))) {
            SwrveMessagePage swrveMessagePage = (SwrveMessagePage) swrveMessageFormat.e.get(Long.valueOf(j));
            j2 = swrveMessagePage.d;
            str = swrveMessagePage.c;
        } else {
            j2 = 0;
            str = "";
        }
        d(0L, "os_back_button", "", j2, str);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public final void c(SwrveButton swrveButton, String str, long j, String str2) {
        SwrveActionType swrveActionType = swrveButton.z;
        String str3 = swrveButton.u;
        String str4 = swrveButton.x;
        int iOrdinal = swrveActionType.ordinal();
        SwrveMessage swrveMessage = this.e;
        SwrveInAppMessageActivity swrveInAppMessageActivity = this.b;
        SwrveBase swrveBase = this.f19034a;
        switch (iOrdinal) {
            case 0:
                d(swrveButton.v, swrveButton.u, swrveButton.x, j, str2);
                break;
            case 1:
                swrveBase.N0(swrveButton, j, str2);
                swrveMessage.d.q();
                SwrveInAppMessageConfig swrveInAppMessageConfig = swrveBase.l.g;
                Bundle bundleG = au.com.woolworths.shop.checkout.ui.confirmation.c.g("buttonName", str3);
                try {
                    ?? r7 = SwrveCommon.f19047a;
                    if (r7 != 0) {
                        r7.w();
                    }
                    SwrveLogger.b("SwrveSDK: Opening deeplink: %s", str);
                    swrveInAppMessageActivity.startActivity(SwrveIntentHelper.a(bundleG, str));
                } catch (Exception e) {
                    SwrveLogger.c("SwrveSDK: could not open deeplink uri:%s", e, str);
                }
                f(str4, swrveActionType, str3);
                break;
            case 3:
                swrveBase.N0(swrveButton, j, str2);
                swrveMessage.d.q();
                try {
                    ((ClipboardManager) swrveInAppMessageActivity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("simple text", str));
                    SwrveInAppMessageConfig swrveInAppMessageConfig2 = swrveBase.l.g;
                } catch (Exception e2) {
                    SwrveLogger.c("Couldn't copy text to clipboard: %s", e2, str);
                }
                f(str4, SwrveActionType.g, str3);
                break;
            case 4:
                swrveBase.N0(swrveButton, j, str2);
                if (SwrveHelper.p(str)) {
                    SwrveLogger.d("Swrve requestCapabilityButtonClicked but action is null.", new Object[0]);
                    break;
                } else {
                    int i = SwrvePermissionRequesterActivity.e;
                    Intent intent = new Intent(swrveInAppMessageActivity, (Class<?>) SwrvePermissionRequesterActivity.class);
                    intent.addFlags(268435456);
                    intent.putExtra("PERMISSION", str);
                    swrveInAppMessageActivity.startActivity(intent);
                    break;
                }
            case 5:
                long j2 = Long.parseLong(str4);
                long j3 = swrveButton.v;
                Long lValueOf = Long.valueOf(j3);
                ArrayList arrayList = this.g;
                if (arrayList.contains(lValueOf)) {
                    SwrveLogger.g("SwrveSDK: Navigation event for button_id %s already sent.", Long.valueOf(j3));
                    break;
                } else {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        String strValueOf = String.valueOf(swrveMessage.f19098a);
                        String strValueOf2 = String.valueOf(j);
                        HashMap map = new HashMap();
                        if (SwrveHelper.o(str2)) {
                            map.put("pageName", str2);
                        }
                        if (SwrveHelper.o(str3)) {
                            map.put("buttonName", str3);
                        }
                        if (j2 > 0) {
                            map.put("to", Long.valueOf(j2));
                        }
                        if (j3 > 0) {
                            map.put("buttonId", Long.valueOf(j3));
                        }
                        int i2 = Swrve.r0;
                        map.put(k.a.b, SwrveHelper.k(swrveInAppMessageActivity));
                        map.put("deviceType", SwrveHelper.j(swrveInAppMessageActivity));
                        swrveBase.f(swrveInAppMessageActivity, swrveBase.getUserId(), EventHelper.a(jCurrentTimeMillis, strValueOf, "iam", "navigation", strValueOf2, "", map, swrveBase.p()));
                        arrayList.add(Long.valueOf(j3));
                        break;
                    } catch (Exception e3) {
                        SwrveLogger.c("SwrveSDK: Could not send navigation event for id:%s", e3, Integer.valueOf(swrveMessage.f19098a));
                        break;
                    }
                }
            case 6:
                swrveBase.N0(swrveButton, j, str2);
                Intent intent2 = new Intent();
                intent2.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent2.putExtra("android.provider.extra.APP_PACKAGE", swrveInAppMessageActivity.getPackageName());
                swrveInAppMessageActivity.startActivity(intent2);
                break;
            case 7:
                swrveBase.N0(swrveButton, j, str2);
                Intent intent3 = new Intent();
                intent3.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent3.setData(Uri.fromParts("package", swrveInAppMessageActivity.getPackageName(), null));
                swrveInAppMessageActivity.startActivity(intent3);
                break;
            case 8:
                try {
                    Class.forName("com.swrve.sdk.geo.SwrveGeoSDK").getMethod("start", Activity.class).invoke(null, swrveInAppMessageActivity);
                    break;
                } catch (ClassNotFoundException unused) {
                    SwrveLogger.g("SwrveGeoSDK is not integrated.", new Object[0]);
                    break;
                } catch (Exception e4) {
                    SwrveLogger.c("SwrveGeoSDK could not be started.", e4, new Object[0]);
                    break;
                }
        }
        JSONArray jSONArray = swrveButton.B;
        if (jSONArray != null && jSONArray.length() != 0) {
            ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
            scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new a(0, this, jSONArray, scheduledExecutorServiceNewSingleThreadScheduledExecutor), 2, TimeUnit.SECONDS);
        }
        JSONArray jSONArray2 = swrveButton.C;
        if (jSONArray2 == null || jSONArray2.length() == 0) {
            return;
        }
        try {
            HashMap map2 = new HashMap();
            for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                a(map2, SwrveHelper.a(jSONArray2.getJSONObject(i3)));
            }
            if (map2.size() > 0) {
                swrveBase.t(map2);
            }
        } catch (Exception e5) {
            SwrveLogger.c("Could not queue custom user updates associated with this button", e5, new Object[0]);
        }
    }

    public final void d(long j, String str, String str2, long j2, String str3) {
        int i;
        long j3;
        int i2 = this.e.f19098a;
        SwrveBase swrveBase = this.f19034a;
        SwrveInAppMessageActivity swrveInAppMessageActivity = this.b;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            String strValueOf = String.valueOf(i2);
            String strValueOf2 = String.valueOf(j2);
            HashMap map = new HashMap();
            if (SwrveHelper.o(str3)) {
                i = i2;
                try {
                    j3 = jCurrentTimeMillis;
                    map.put("pageName", str3);
                } catch (Exception e) {
                    e = e;
                    SwrveLogger.c("SwrveSDK: Could not send dismiss event for id:%s", e, Integer.valueOf(i));
                    SwrveInAppMessageConfig swrveInAppMessageConfig = swrveBase.l.g;
                    f(str2, SwrveActionType.d, str);
                }
            } else {
                i = i2;
                j3 = jCurrentTimeMillis;
            }
            if (SwrveHelper.o(str)) {
                map.put("buttonName", str);
            }
            if (j > 0) {
                map.put("buttonId", "" + j);
            }
            int i3 = Swrve.r0;
            map.put(k.a.b, SwrveHelper.k(swrveInAppMessageActivity));
            map.put("deviceType", SwrveHelper.j(swrveInAppMessageActivity));
            swrveBase.f(swrveInAppMessageActivity, swrveBase.getUserId(), EventHelper.a(j3, strValueOf, "iam", "dismiss", strValueOf2, "", map, swrveBase.p()));
        } catch (Exception e2) {
            e = e2;
            i = i2;
        }
        SwrveInAppMessageConfig swrveInAppMessageConfig2 = swrveBase.l.g;
        f(str2, SwrveActionType.d, str);
    }

    public final void e(long j, long j2, String str) {
        SwrveMessageFormat swrveMessageFormat = this.f;
        d(j2, str, "dismiss", j, swrveMessageFormat.e.containsKey(Long.valueOf(j)) ? ((SwrveMessagePage) swrveMessageFormat.e.get(Long.valueOf(j))).c : "");
    }

    public final void f(String str, SwrveActionType swrveActionType, String str2) {
        if (QaUser.l()) {
            SwrveInAppCampaign swrveInAppCampaign = this.e.d;
            int i = swrveInAppCampaign.c;
            int iX = swrveInAppCampaign.x();
            int iOrdinal = swrveActionType.ordinal();
            String str3 = iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? "" : "clipboard" : "install" : "deeplink" : "dismiss";
            try {
                QaUser.j().b(i, iX, str2, str3, SwrveHelper.p(str) ? str3 : str);
            } catch (Exception e) {
                SwrveLogger.c("Error trying to queue campaign-button-clicked qalogevent.", e, new Object[0]);
            }
        }
    }
}
