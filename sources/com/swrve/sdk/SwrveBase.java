package com.swrve.sdk;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.marketing.SwrveInteractor$identityResponse$1;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.nnlllnn;
import com.medallia.digital.mobilesdk.l8;
import com.medallia.digital.mobilesdk.q2;
import com.salesforce.marketingcloud.storage.db.k;
import com.swrve.sdk.SwrveCampaignInfluence;
import com.swrve.sdk.SwrveImageScaler;
import com.swrve.sdk.SwrveRunnables;
import com.swrve.sdk.config.SwrveConfig;
import com.swrve.sdk.config.SwrveConfigBase;
import com.swrve.sdk.config.SwrveEmbeddedMessageConfig;
import com.swrve.sdk.config.SwrveInAppMessageConfig;
import com.swrve.sdk.exceptions.SwrveSDKTextTemplatingException;
import com.swrve.sdk.localstorage.LocalStorage;
import com.swrve.sdk.localstorage.SQLiteLocalStorage;
import com.swrve.sdk.localstorage.SwrveMultiLayerLocalStorage;
import com.swrve.sdk.messaging.SwrveBaseCampaign;
import com.swrve.sdk.messaging.SwrveButton;
import com.swrve.sdk.messaging.SwrveCampaignState;
import com.swrve.sdk.messaging.SwrveEmbeddedCampaign;
import com.swrve.sdk.messaging.SwrveEmbeddedMessage;
import com.swrve.sdk.messaging.SwrveInAppCampaign;
import com.swrve.sdk.messaging.SwrveMessage;
import com.swrve.sdk.messaging.SwrveMessageCenterDetails;
import com.swrve.sdk.messaging.SwrveOrientation;
import com.swrve.sdk.rest.IRESTResponseListener;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class SwrveBase<T, C extends SwrveConfigBase> extends SwrveImp<T, C> implements ISwrveBase<T, C>, ISwrveCommon {
    public static final /* synthetic */ int p0 = 0;

    /* renamed from: com.swrve.sdk.SwrveBase$1, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass1 extends RESTCacheResponseListener {
        @Override // com.swrve.sdk.rest.IRESTResponseListener
        public final void a(Exception exc) {
            SwrveLogger.c("AB Test exception", exc, new Object[0]);
            throw null;
        }

        @Override // com.swrve.sdk.RESTCacheResponseListener
        public final void c(int i, String str) {
            SwrveLogger.e("Got AB Test response code %s", Integer.valueOf(i));
            if (!SwrveHelper.p(str)) {
                throw null;
            }
        }
    }

    /* renamed from: com.swrve.sdk.SwrveBase$3, reason: invalid class name */
    class AnonymousClass3 extends ArrayList<String> {
    }

    /* renamed from: com.swrve.sdk.SwrveBase$5, reason: invalid class name */
    /* loaded from: classes6.dex */
    class AnonymousClass5 implements SwrveIdentityResponse {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f19044a;
        public final /* synthetic */ String b;
        public final /* synthetic */ SwrveIdentityResponse c;

        public AnonymousClass5(String str, String str2, SwrveIdentityResponse swrveIdentityResponse) {
            this.f19044a = str;
            this.b = str2;
            this.c = swrveIdentityResponse;
        }

        @Override // com.swrve.sdk.SwrveIdentityResponse
        public final void a(String str, String str2) throws Throwable {
            SwrveUser swrveUser = new SwrveUser(str2, this.f19044a, true);
            SwrveBase swrveBase = SwrveBase.this;
            SQLiteLocalStorage sQLiteLocalStorage = swrveBase.s.b;
            if (sQLiteLocalStorage != null) {
                SQLiteDatabase sQLiteDatabase = sQLiteLocalStorage.f19085a;
                if (sQLiteDatabase.isOpen()) {
                    sQLiteDatabase.beginTransaction();
                    try {
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("swrve_user_id", swrveUser.b());
                        contentValues.put("external_user_id", swrveUser.a());
                        contentValues.put("verified", Boolean.valueOf(swrveUser.c()));
                        sQLiteLocalStorage.j("users", contentValues, "external_user_id= ?", new String[]{swrveUser.a()});
                        sQLiteDatabase.setTransactionSuccessful();
                    } finally {
                        sQLiteDatabase.endTransaction();
                    }
                }
            }
            Date date = new Date();
            SharedPreferences.Editor editorEdit = ((Context) swrveBase.e.get()).getSharedPreferences("swrve_prefs", 0).edit();
            editorEdit.putLong(YU.a.g(str2, "_identify_date"), date.getTime());
            editorEdit.commit();
            if (!this.b.equalsIgnoreCase(str2)) {
                swrveBase.c0 = true;
            }
            swrveBase.U0(str2);
            SwrveIdentityResponse swrveIdentityResponse = this.c;
            if (swrveIdentityResponse != null) {
                swrveIdentityResponse.a(str, str2);
            }
        }

        @Override // com.swrve.sdk.SwrveIdentityResponse
        public final void b(int i, String str) throws Throwable {
            SwrveBase swrveBase = SwrveBase.this;
            if (i == 403) {
                SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveBase.s;
                String userId = swrveBase.getUserId();
                SQLiteLocalStorage sQLiteLocalStorage = swrveMultiLayerLocalStorage.b;
                if (sQLiteLocalStorage != null) {
                    synchronized (sQLiteLocalStorage) {
                        try {
                            if (sQLiteLocalStorage.f19085a.isOpen()) {
                                sQLiteLocalStorage.f19085a.delete("users", "swrve_user_id= ?", new String[]{userId});
                            }
                        } catch (Exception e) {
                            SwrveLogger.c("Exception deleting user for userId: %s", e, userId);
                        }
                    }
                }
            }
            swrveBase.U0(this.b);
            SwrveIdentityResponse swrveIdentityResponse = this.c;
            if (swrveIdentityResponse != null) {
                swrveIdentityResponse.b(i, str);
            }
        }
    }

    public static boolean H0(Activity activity) {
        String canonicalName = activity.getClass().getCanonicalName();
        if (canonicalName == null || !canonicalName.contains("SwrveNotificationEngageActivity")) {
            return false;
        }
        SwrveLogger.g("SwrveNotificationEngageActivity has been launched so skip ActivityLifecycleCallbacks method and use next Activity that is launched", new Object[0]);
        return true;
    }

    public static boolean J0(String str) {
        if (str == null) {
            SwrveLogger.d("Event names cannot be null. This event will not be sent.", new Object[0]);
            return false;
        }
        if (str.trim().isEmpty()) {
            SwrveLogger.d("Event names cannot be empty. This event will not be sent.", new Object[0]);
            return false;
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.add("Swrve.");
        anonymousClass3.add("swrve.");
        Iterator<String> it = anonymousClass3.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (str.startsWith(next)) {
                SwrveLogger.d("Event names cannot begin with %s* This event will not be sent. Eventname:%s", next, str);
                return false;
            }
        }
        return true;
    }

    public static String r0(SwrveEmbeddedMessage swrveEmbeddedMessage, Map map) {
        if (swrveEmbeddedMessage == null) {
            return null;
        }
        try {
            return swrveEmbeddedMessage.e == SwrveEmbeddedMessage.EMBEDDED_CAMPAIGN_TYPE.e ? SwrveTextTemplating.b(swrveEmbeddedMessage.d, map) : SwrveTextTemplating.a(swrveEmbeddedMessage.d, map);
        } catch (SwrveSDKTextTemplatingException e) {
            SwrveEmbeddedCampaign swrveEmbeddedCampaign = swrveEmbeddedMessage.c;
            try {
                QaUser.j().f(swrveEmbeddedCampaign.e(), swrveEmbeddedMessage.f19096a, swrveEmbeddedMessage.d);
            } catch (Exception e2) {
                SwrveLogger.c("Error trying to queue embedded-personalization-failed qalogevent.", e2, new Object[0]);
            }
            SwrveLogger.c("Campaign id:%s Could not resolve, error with personalization", e, Integer.valueOf(swrveEmbeddedCampaign.e()));
            return null;
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String A() {
        return i() + "/1/batch";
    }

    public final HashMap A0(String str) {
        String strC = this.s.c(str, "SwrveSDK.userJoinedTime");
        HashMap map = new HashMap();
        map.put("api_key", this.i);
        map.put("user", this.j.c());
        map.put(k.a.q, this.g);
        map.put("joined", strC);
        map.put("version", String.valueOf(10));
        map.put("language", this.k);
        this.l.getClass();
        map.put("app_store", "google");
        map.put("embedded_campaign_version", String.valueOf(4));
        map.put("in_app_version", String.valueOf(16));
        map.put("push_inbox_version", String.valueOf(1));
        map.put("device_width", String.valueOf(this.R));
        map.put("device_height", String.valueOf(this.S));
        map.put("device_dpi", String.valueOf(this.T));
        map.put("android_device_xdpi", String.valueOf(this.U));
        map.put("android_device_ydpi", String.valueOf(this.V));
        map.put("orientation", "Both".toLowerCase(Locale.US));
        map.put(nnlllnn.nnlllln.ww0077w0077ww, SwrveImp.Q());
        map.put("os_version", Build.VERSION.RELEASE);
        Context context = (Context) this.e.get();
        if (context != null) {
            map.put("os", E0(context));
            map.put("device_type", SwrveHelper.j(context));
        }
        return map;
    }

    @Override // com.swrve.sdk.SwrveImp, com.swrve.sdk.ISwrveCampaignManager
    public final Date B() {
        return new Date();
    }

    public final int B0() {
        return ((Context) this.e.get()).getSharedPreferences("swrve_prefs", 0).getInt("swrve_identity_refresh_period", SwrveImp.o0);
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void C() {
        this.l.getClass();
    }

    public final ArrayList C0(SwrveOrientation swrveOrientation) {
        ArrayList arrayList = new ArrayList();
        if (I0()) {
            HashMap mapH0 = h0(null);
            ArrayList arrayList2 = this.B;
            if (arrayList2 != null) {
                synchronized (arrayList2) {
                    for (int i = 0; i < this.B.size(); i++) {
                        try {
                            SwrveBaseCampaign swrveBaseCampaign = (SwrveBaseCampaign) this.B.get(i);
                            if (swrveBaseCampaign.o() && swrveBaseCampaign.k() != SwrveCampaignState.Status.f && swrveBaseCampaign.n(new Date()) && swrveBaseCampaign.t(swrveOrientation) && swrveBaseCampaign.a(super.H(), mapH0)) {
                                if (swrveBaseCampaign instanceof SwrveInAppCampaign) {
                                    SwrveMessage swrveMessageU = ((SwrveInAppCampaign) swrveBaseCampaign).u();
                                    if (N(swrveMessageU)) {
                                        SwrveLogger.g("SwrveSDK filtering message center IAM as it requests a capability/permission that is already granted or redundant action.", new Object[0]);
                                    } else if (SwrveMessageTextTemplatingChecks.a(swrveMessageU, mapH0)) {
                                        M0(swrveMessageU.i(), mapH0);
                                        arrayList.add(swrveBaseCampaign);
                                    }
                                } else {
                                    arrayList.add(swrveBaseCampaign);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void D(String str) {
        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
        try {
            L0();
            swrveMultiLayerLocalStorage.a(getUserId(), str);
            swrveMultiLayerLocalStorage.b();
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: Exception saving event to storage.", e, new Object[0]);
        }
    }

    public final int D0(String str) {
        String strC = this.s.c("", SwrveHelper.h(str));
        if (SwrveHelper.o(strC)) {
            return Integer.parseInt(strC);
        }
        return 0;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void E(String str, Map map) {
        if (I0()) {
            try {
                if (J0(str)) {
                    if (map.size() > 0) {
                        new JSONObject(map);
                    }
                    HashMap map2 = new HashMap();
                    map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                    f0(this.j.c(), "event", map2, map, true);
                }
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    public abstract String E0(Context context);

    @Override // com.swrve.sdk.ISwrveBase
    public final void F(SwrveBaseCampaign swrveBaseCampaign) {
        if (I0()) {
            swrveBaseCampaign.s(SwrveCampaignState.Status.e);
            i0(getUserId());
        }
    }

    public final synchronized void F0(Activity activity) throws Throwable {
        Throwable th;
        Exception exc;
        String strC;
        SharedPreferences sharedPreferences;
        au.com.woolworths.foundation.swrve.embedded.campaign.a aVar;
        try {
            try {
                if (this.j.b() == SwrveTrackingState.g) {
                    try {
                        this.O = false;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.j.f(SwrveTrackingState.e);
                this.P = true;
                if (this.O) {
                    return;
                }
                this.O = true;
                try {
                    strC = this.j.c();
                    this.Q = new Date();
                    this.r = B().getTime();
                    this.G = true;
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new m(this, scheduledExecutorServiceNewSingleThreadScheduledExecutor, 1), this.l.g.c, TimeUnit.MILLISECONDS);
                    File fileC = c(activity);
                    this.F.d = fileC;
                    SwrveLogger.b("SwrveSDK using cache directory at %s", fileC.getPath());
                    L0();
                    v0();
                    if (this.A == null) {
                        try {
                            SwrveResourceManager swrveResourceManager = new SwrveResourceManager();
                            swrveResourceManager.f19074a = new HashMap();
                            new ArrayList();
                            this.A = swrveResourceManager;
                        } catch (Exception e) {
                            exc = e;
                            SwrveLogger.c("Swrve init failed", exc, new Object[0]);
                        }
                    }
                    W(strC);
                    SwrveEmbeddedMessageConfig swrveEmbeddedMessageConfig = this.l.h;
                    if (swrveEmbeddedMessageConfig != null && (aVar = swrveEmbeddedMessageConfig.f19079a) != null) {
                        this.n = aVar;
                    }
                    this.m = new SwrveEventListener(this, this.n);
                    T0();
                    this.r = B().getTime() + this.q;
                    G0();
                    sharedPreferences = activity.getSharedPreferences("swrve_prefs", 0);
                    String string = sharedPreferences.getString("swrve.referrer_id", null);
                    if (!SwrveHelper.p(string)) {
                        HashMap map = new HashMap();
                        map.put("swrve.referrer_id", string);
                        SwrveLogger.e("Received install referrer, so sending userUpdate:%s", map);
                        t(map);
                        sharedPreferences.edit().remove("swrve.referrer_id").apply();
                    }
                    J((Context) this.d.get());
                } catch (Exception e2) {
                    e = e2;
                }
                try {
                    l0(new b(this, strC, this, this.j.a(), 1));
                } catch (Exception e3) {
                    e = e3;
                    exc = e;
                    SwrveLogger.c("Swrve init failed", exc, new Object[0]);
                }
                if (SwrveHelper.p(this.k)) {
                    SwrveHelper.r("Language needed to use in-app messages");
                    throw null;
                }
                this.l.getClass();
                if (SwrveHelper.p("google")) {
                    SwrveHelper.r("App store needed to use in-app messages");
                    throw null;
                }
                V(strC);
                SwrveInAppMessageConfig swrveInAppMessageConfig = this.l.g;
                this.J = Integer.valueOf(y0());
                this.K = Integer.valueOf(B0());
                T(strC);
                U(strC);
                this.l.getClass();
                this.H = Integer.valueOf(sharedPreferences.getInt("swrve_cr_flush_frequency", 60000));
                this.I = Integer.valueOf(((Context) this.e.get()).getSharedPreferences("swrve_prefs", 0).getInt("swrve_cr_flush_delay", 5000));
                this.L = this.s.c(strC, "swrve.etag");
                this.h0 = this.s.c(strC, "swrve.pushinboxhash");
                k0(true);
                w0();
                Q0();
                SwrveLogger.e("Init finished", new Object[0]);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void G(int i) {
        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
        SQLiteLocalStorage sQLiteLocalStorage = swrveMultiLayerLocalStorage.b;
        if (sQLiteLocalStorage != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            SQLiteDatabase sQLiteDatabase = sQLiteLocalStorage.f19085a;
            if (sQLiteDatabase.isOpen()) {
                sQLiteDatabase.beginTransaction();
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("notification_id", Integer.valueOf(i));
                    contentValues.put("time", Long.valueOf(jCurrentTimeMillis));
                    sQLiteLocalStorage.j("notifications_authenticated", contentValues, "notification_id= ?", new String[]{String.valueOf(i)});
                    sQLiteDatabase.setTransactionSuccessful();
                } finally {
                }
            }
            sQLiteDatabase = swrveMultiLayerLocalStorage.b.f19085a;
            if (sQLiteDatabase.isOpen()) {
                sQLiteDatabase.beginTransaction();
                try {
                    sQLiteDatabase.execSQL("DELETE FROM notifications_authenticated WHERE notification_id IN (SELECT notification_id FROM notifications_authenticated ORDER BY time DESC LIMIT -1 OFFSET 100)");
                    sQLiteDatabase.setTransactionSuccessful();
                } finally {
                }
            }
        }
    }

    public final void G0() {
        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
        if (SwrveHelper.p(swrveMultiLayerLocalStorage.c(this.j.c(), "SwrveSDK.userJoinedTime"))) {
            swrveMultiLayerLocalStorage.g(this.j.c(), "SwrveSDK.userJoinedTime", String.valueOf(this.Q.getTime()));
            if (this.c0) {
                return;
            }
            f0(this.j.c(), "event", androidx.constraintlayout.core.state.a.r(AppMeasurementSdk.ConditionalUserProperty.NAME, "Swrve.first_session"), null, true);
        }
    }

    public final boolean I0() {
        if (this.j.b() == SwrveTrackingState.g) {
            SwrveLogger.h("Warning: SwrveSDK is stopped and needs to be started before calling this api.", new Object[0]);
            return false;
        }
        if (this.P) {
            return true;
        }
        SwrveLogger.h("Warning: SwrveSDK needs to be started before calling this api.", new Object[0]);
        return false;
    }

    public final Bitmap K0(String str, String str2) {
        Bitmap bitmapZ0;
        if (str != null) {
            bitmapZ0 = z0(l().getAbsolutePath() + q2.c + SwrveHelper.u(str.getBytes()));
        } else {
            bitmapZ0 = null;
        }
        if (bitmapZ0 != null || str2 == null) {
            return bitmapZ0;
        }
        return z0(l().getAbsolutePath() + q2.c + str2);
    }

    public final void L0() {
        SwrveConfig swrveConfig = this.l;
        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
        if (swrveMultiLayerLocalStorage != null) {
            try {
                if (swrveMultiLayerLocalStorage.b != null) {
                    return;
                }
            } catch (Exception e) {
                SwrveLogger.c("Swrve error opening database.", e, new Object[0]);
                return;
            }
        }
        Context context = (Context) this.e.get();
        swrveConfig.getClass();
        swrveMultiLayerLocalStorage.b = new SQLiteLocalStorage(context);
    }

    public final SwrveMessageCenterDetails M0(SwrveMessageCenterDetails swrveMessageCenterDetails, HashMap map) {
        if (swrveMessageCenterDetails == null) {
            return null;
        }
        try {
            String strE = swrveMessageCenterDetails.e();
            if (strE != null) {
                strE = SwrveTextTemplating.a(strE, map);
            }
            String str = strE;
            String strA = swrveMessageCenterDetails.a();
            if (strA != null) {
                strA = SwrveTextTemplating.a(strA, map);
            }
            String str2 = strA;
            String strD = swrveMessageCenterDetails.d();
            if (strD != null) {
                strD = SwrveTextTemplating.a(strD, map);
            }
            String str3 = strD;
            String strB = swrveMessageCenterDetails.b();
            if (strB != null) {
                strB = SwrveTextTemplating.a(strB, map);
            }
            String strC = swrveMessageCenterDetails.c();
            K0(str3, strC);
            return new SwrveMessageCenterDetails(str, str2, str3, strB, strC);
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK: exception personalizing the SwrveMessageCenterDetails", e, new Object[0]);
            return null;
        }
    }

    public final void N0(SwrveButton swrveButton, long j, String str) {
        String str2 = "Swrve.Messages.Message-" + swrveButton.j().getId() + ".click";
        SwrveLogger.e("Sending click event: %s(%s)", str2, swrveButton.k());
        HashMap map = new HashMap();
        map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, swrveButton.k());
        map.put("embedded", "false");
        if (swrveButton.i() > 0) {
            map.put("buttonId", String.valueOf(swrveButton.i()));
        }
        if (j > 0) {
            map.put("contextId", String.valueOf(j));
        }
        if (SwrveHelper.o(str)) {
            map.put("pageName", str);
        }
        map.put(k.a.b, SwrveHelper.k(P()));
        map.put("deviceType", SwrveHelper.j(P()));
        HashMap map2 = new HashMap();
        map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str2);
        f0(this.j.c(), "event", map2, map, false);
    }

    public final void O0(int i, String str) {
        String strE = YU.a.e(i, "Swrve.Messages.Message-", ".impression");
        SwrveLogger.e(YU.a.A("Sending view event: %s", strE), new Object[0]);
        HashMap map = new HashMap();
        map.put("embedded", str);
        map.put(k.a.b, SwrveHelper.k(P()));
        map.put("deviceType", SwrveHelper.j(P()));
        HashMap map2 = new HashMap();
        map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, strE);
        f0(this.j.c(), "event", map2, map, false);
        i0(this.j.c());
    }

    public final void P0() throws Throwable {
        synchronized (this.d0) {
            try {
                try {
                    for (EventQueueItem eventQueueItem : this.d0) {
                        f0(eventQueueItem.f19033a, eventQueueItem.b, eventQueueItem.c, eventQueueItem.d, eventQueueItem.e);
                    }
                    if (this.d0.size() > 0) {
                        S0();
                    }
                    this.d0.clear();
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Q0() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveBase.Q0():void");
    }

    public final void R0() {
        if (I0()) {
            try {
                this.l.getClass();
                final String userId = getUserId();
                g0(new Runnable() { // from class: com.swrve.sdk.SwrveBase.2
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        String str = userId;
                        SwrveBase swrveBase = SwrveBase.this;
                        HashMap mapA0 = swrveBase.A0(str);
                        SwrveConfig swrveConfig = swrveBase.l;
                        swrveConfig.getClass();
                        if (!SwrveHelper.p(swrveBase.L)) {
                            mapA0.put("etag", swrveBase.L);
                        }
                        try {
                            swrveBase.t.b(swrveConfig.b + "/api/1/user_content", mapA0, new IRESTResponseListener() { // from class: com.swrve.sdk.SwrveBase.2.1
                                @Override // com.swrve.sdk.rest.IRESTResponseListener
                                public final void a(Exception exc) {
                                    SwrveBase swrveBase2 = SwrveBase.this;
                                    if (!swrveBase2.M) {
                                        swrveBase2.M = true;
                                        swrveBase2.I();
                                        swrveBase2.Z();
                                    }
                                    SwrveLogger.c("Error downloading resources and campaigns", exc, new Object[0]);
                                }

                                /* JADX WARN: Removed duplicated region for block: B:38:0x00ff A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:41:0x0114 A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:44:0x0129 A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:52:0x0164 A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:55:0x0183 A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:63:0x01b9 A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:68:0x01c9 A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:71:0x01e7 A[Catch: JSONException -> 0x0089, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                /* JADX WARN: Removed duplicated region for block: B:76:0x0204 A[Catch: JSONException -> 0x0089, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0089, blocks: (B:16:0x0071, B:18:0x007d, B:36:0x00f9, B:38:0x00ff, B:39:0x010e, B:41:0x0114, B:42:0x0123, B:44:0x0129, B:45:0x0138, B:47:0x013e, B:49:0x014a, B:50:0x015e, B:52:0x0164, B:53:0x017d, B:55:0x0183, B:57:0x01a2, B:59:0x01a8, B:61:0x01ae, B:66:0x01c3, B:68:0x01c9, B:69:0x01df, B:71:0x01e7, B:73:0x01f3, B:74:0x01fc, B:76:0x0204, B:81:0x021a, B:80:0x0212, B:82:0x0229, B:84:0x022f, B:86:0x0235, B:88:0x0239, B:63:0x01b9, B:65:0x01bf, B:21:0x008c, B:23:0x0092, B:28:0x00b4, B:33:0x00c1, B:27:0x00a9, B:34:0x00e5, B:90:0x023e, B:91:0x0247, B:24:0x009e, B:15:0x006c, B:77:0x020d), top: B:100:0x006c, inners: #0, #2, #3 }] */
                                @Override // com.swrve.sdk.rest.IRESTResponseListener
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                                */
                                public final void b(com.swrve.sdk.rest.RESTResponse r21) throws java.lang.Throwable {
                                    /*
                                        Method dump skipped, instructions count: 613
                                        To view this dump change 'Code comments level' option to 'DEBUG'
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveBase.AnonymousClass2.AnonymousClass1.b(com.swrve.sdk.rest.RESTResponse):void");
                                }
                            });
                        } catch (UnsupportedEncodingException e) {
                            SwrveLogger.c("Could not update resources and campaigns, invalid parameters", e, new Object[0]);
                        }
                    }
                });
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    public final void S0() {
        if (I0()) {
            try {
                u0(this.j.c(), this.j.a(), true);
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    public final void T0() {
        if (I0()) {
            try {
                final long time = B().getTime();
                g0(new Runnable() { // from class: com.swrve.sdk.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        long j = time;
                        int i = SwrveBase.p0;
                        SwrveBase swrveBase = this.d;
                        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveBase.s;
                        int iP = swrveBase.p();
                        ArrayList arrayList = new ArrayList();
                        try {
                            arrayList.add(EventHelper.b("session_start", null, null, iP, j));
                        } catch (Exception e) {
                            SwrveLogger.c("Exception building session start event", e, new Object[0]);
                        }
                        try {
                            String strC = swrveBase.j.c();
                            String strA = SwrveLocalStorageUtil.a(swrveMultiLayerLocalStorage);
                            SwrveEventsManagerImp swrveEventsManagerImp = new SwrveEventsManagerImp((Context) swrveBase.e.get(), swrveBase.l, swrveBase.t, strC, swrveBase.g, swrveBase.j.a(), strA);
                            LocalStorage localStorage = swrveMultiLayerLocalStorage.b;
                            if (localStorage == null) {
                                localStorage = swrveMultiLayerLocalStorage.f19088a;
                            }
                            swrveEventsManagerImp.c(arrayList, localStorage);
                        } catch (Exception e2) {
                            SwrveLogger.c("Exception sending session start event", e2, new Object[0]);
                        }
                        ISwrveEventListener iSwrveEventListener = swrveBase.m;
                        if (iSwrveEventListener != null) {
                            ((SwrveEventListener) iSwrveEventListener).b(EventHelper.e("session_start", null), null);
                        }
                        QaUser.p(arrayList);
                    }
                });
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[LOOP:1: B:37:0x00a7->B:39:0x00ad, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U0(java.lang.String r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveBase.U0(java.lang.String):void");
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void a() {
        this.l.getClass();
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final int b() {
        this.l.getClass();
        return 60000;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final File c(Context context) {
        this.l.getClass();
        return context.getCacheDir();
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String d(String str) {
        SwrveConfig swrveConfig = this.l;
        try {
            Context context = (Context) this.e.get();
            swrveConfig.getClass();
            return new SQLiteLocalStorage(context).i(str, super.S(str));
        } catch (Exception e) {
            SwrveLogger.c(YU.a.h("Error getting cached data. userId:", str, " key:swrve.q1"), e, new Object[0]);
            return null;
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void e() {
        this.l.getClass();
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void f(Context context, String str, ArrayList arrayList) {
        QaUser.p(new ArrayList(arrayList));
        new SwrveBackgroundEventSender(this, context).c(str, arrayList);
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void g(SwrveBaseCampaign swrveBaseCampaign) {
        if (!I0() || swrveBaseCampaign == null) {
            return;
        }
        swrveBaseCampaign.s(SwrveCampaignState.Status.f);
        i0(getUserId());
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String getApiKey() {
        try {
            return this.i;
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return null;
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final int getAppId() {
        return this.h;
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String getAppVersion() {
        return this.g;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final SwrveConfigBase getConfig() {
        try {
            return this.l;
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return null;
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String getDeviceId() {
        L0();
        return SwrveLocalStorageUtil.a(this.s);
    }

    @Override // com.swrve.sdk.ISwrveBase, com.swrve.sdk.ISwrveCommon
    public final String getUserId() {
        try {
            return this.j.c();
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return null;
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String h() {
        return this.j.a();
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final String i() {
        return this.l.f19078a.toString();
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void k(SwrveResourcesListener swrveResourcesListener) {
        try {
            this.o = swrveResourcesListener;
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
        }
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final File l() {
        try {
            return this.F.d;
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return null;
        }
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void m(String str, SwrveInteractor$identityResponse$1 swrveInteractor$identityResponse$1) {
        if (this.l.i == SwrveInitMode.e) {
            throw new RuntimeException("Cannot call Identify when running on SwrveInitMode.MANAGED mode");
        }
        try {
            s0(str, swrveInteractor$identityResponse$1, true);
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
        }
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void n(SwrveEmbeddedMessage swrveEmbeddedMessage, String str) {
        if (I0()) {
            try {
                n0(swrveEmbeddedMessage, str);
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    public final void n0(SwrveEmbeddedMessage swrveEmbeddedMessage, String str) {
        if (swrveEmbeddedMessage == null) {
            return;
        }
        String strM = YU.a.m(new StringBuilder("Swrve.Messages.Message-"), swrveEmbeddedMessage.f19096a, ".click");
        SwrveLogger.e("Sending click event: %s(%s)", strM, str);
        HashMap map = new HashMap();
        map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
        map.put("embedded", "true");
        HashMap map2 = new HashMap();
        map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, strM);
        f0(this.j.c(), "event", map2, map, false);
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void o(String str) {
        if (I0()) {
            try {
                if (J0(str)) {
                    HashMap map = new HashMap();
                    map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str);
                    f0(this.j.c(), "event", map, null, true);
                }
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Type inference failed for: r28v1, types: [com.swrve.sdk.messaging.SwrveBaseCampaign] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.swrve.sdk.messaging.SwrveBaseMessage o0(java.lang.String r25, java.util.Map r26, com.swrve.sdk.messaging.SwrveOrientation r27, java.util.Date r28) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.SwrveBase.o0(java.lang.String, java.util.Map, com.swrve.sdk.messaging.SwrveOrientation, java.util.Date):com.swrve.sdk.messaging.SwrveBaseMessage");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.e = new WeakReference(activity.getApplicationContext());
        this.f = new WeakReference(activity);
        a0(new d(this, activity, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (H0(activity)) {
            return;
        }
        this.l.getClass();
        a0(new e(this, 0));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.e = new WeakReference(activity.getApplicationContext());
        this.f = new WeakReference(activity);
        a0(new d(this, activity, 1));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (H0(activity)) {
            return;
        }
        this.l.getClass();
        a0(new d(this, activity, 2));
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final synchronized int p() {
        int i;
        try {
            L0();
            String strC = this.s.c(this.j.c(), "seqnum");
            i = SwrveHelper.p(strC) ? 1 : 1 + Integer.parseInt(strC);
            this.s.g(this.j.c(), "seqnum", Integer.toString(i));
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public final JSONObject p0() throws JSONException, PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        SwrveConfig swrveConfig = this.l;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("swrve.device_name", SwrveImp.Q());
        jSONObject.put("swrve.os_version", Build.VERSION.RELEASE);
        jSONObject.put("swrve.os_int_version", Build.VERSION.SDK_INT);
        Context context = (Context) this.e.get();
        if (context != null) {
            try {
                String str = SwrveHelper.f19056a;
                try {
                    applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                } catch (Exception e) {
                    SwrveLogger.c("", e, new Object[0]);
                }
                int i = applicationInfo != null ? applicationInfo.targetSdkVersion : 0;
                jSONObject.put("swrve.app_target_version", i);
                jSONObject.put("swrve.device_width", this.R);
                jSONObject.put("swrve.device_height", this.S);
                jSONObject.put("swrve.device_dpi", this.T);
                jSONObject.put("swrve.android_device_xdpi", this.U);
                jSONObject.put("swrve.android_device_ydpi", this.V);
                if (!SwrveHelper.p(this.W)) {
                    jSONObject.put("swrve.sim_operator.name", this.W);
                }
                if (!SwrveHelper.p(this.X)) {
                    jSONObject.put("swrve.sim_operator.iso_country_code", this.X);
                }
                if (!SwrveHelper.p(this.Y)) {
                    jSONObject.put("swrve.sim_operator.code", this.Y);
                }
                jSONObject.put("swrve.device_type", SwrveHelper.j(context));
            } catch (Exception e2) {
                SwrveLogger.c("Get device screen info failed", e2, new Object[0]);
            }
            jSONObject.put("swrve.os", E0(context));
            jSONObject.put("swrve.language", this.k);
            jSONObject.put("swrve.device_region", Locale.getDefault().getCountry());
            jSONObject.put("swrve.sdk_version", "Android 11.3.0");
            swrveConfig.getClass();
            jSONObject.put("swrve.app_store", "google");
            jSONObject.put("swrve.sdk_flavour", SwrveFlavour.d);
            String lowerCase = swrveConfig.i.toString().toLowerCase(Locale.ENGLISH);
            if (swrveConfig.j) {
                lowerCase = YU.a.g(lowerCase, "_auto");
            }
            jSONObject.put("swrve.sdk_init_mode", lowerCase);
            jSONObject.put("swrve.tracking_state", this.j.b());
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            jSONObject.put("swrve.timezone_name", gregorianCalendar.getTimeZone().getID());
            jSONObject.put("swrve.utc_offset_seconds", gregorianCalendar.getTimeZone().getOffset(System.currentTimeMillis()) / 1000);
            Context context2 = (Context) this.e.get();
            if (SwrveHelper.c == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    jCurrentTimeMillis = context2.getPackageManager().getPackageInfo(context2.getPackageName(), 0).firstInstallTime;
                } catch (PackageManager.NameNotFoundException e3) {
                    SwrveLogger.c("Could not get package info to retrieve appInstallTime so using current date.", e3, new Object[0]);
                }
                SwrveHelper.c = SwrveHelper.b.format(new Date(jCurrentTimeMillis));
            }
            jSONObject.put("swrve.install_date", SwrveHelper.c);
            NotificationManager notificationManager = new NotificationManagerCompat(context).b;
            boolean zAreNotificationsEnabled = notificationManager.areNotificationsEnabled();
            jSONObject.put("swrve.permission.notifications_enabled", zAreNotificationsEnabled);
            jSONObject.put("swrve.permission.notifications_importance", notificationManager.getImportance());
            if (zAreNotificationsEnabled) {
                jSONObject.put("swrve.support.rich_buttons", true);
                jSONObject.put("swrve.support.rich_attachment", true);
                jSONObject.put("swrve.can_receive_authenticated_push", true);
            }
            if (Build.VERSION.SDK_INT >= 33) {
                jSONObject.put("swrve.permission.android.notification", SwrveHelper.i(ContextCompat.a(context, "android.permission.POST_NOTIFICATIONS")));
                SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
                int iD0 = D0("android.permission.POST_NOTIFICATIONS");
                Activity activityO = O();
                if (activityO != null && iD0 < 2) {
                    String strC = swrveMultiLayerLocalStorage.c("", "permission_rationale_was_true_android.permission.POST_NOTIFICATIONS");
                    boolean zM = ActivityCompat.m(activityO, "android.permission.POST_NOTIFICATIONS");
                    if (zM) {
                        if (iD0 != 1) {
                            swrveMultiLayerLocalStorage.g("", SwrveHelper.h("android.permission.POST_NOTIFICATIONS"), "1");
                        }
                        iD0 = 1;
                    } else if (SwrveHelper.o(strC)) {
                        swrveMultiLayerLocalStorage.g("", SwrveHelper.h("android.permission.POST_NOTIFICATIONS"), "2");
                        iD0 = 2;
                    }
                    if (zM && SwrveHelper.p(strC)) {
                        swrveMultiLayerLocalStorage.g("", "permission_rationale_was_true_android.permission.POST_NOTIFICATIONS", "True");
                    }
                }
                jSONObject.put("swrve.permission.android.notification_answered_times", iD0);
                if (O() != null) {
                    jSONObject.put("swrve.permission.android.notification_show_rationale", ActivityCompat.m(O(), "android.permission.POST_NOTIFICATIONS"));
                }
            }
            if (l() != null) {
                jSONObject.put("swrve.usable_space", new File(l().getAbsoluteFile().toString()).getUsableSpace());
            }
            jSONObject.put("swrve.support.push_inbox", true);
        }
        x0(jSONObject);
        return jSONObject;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void q(SwrveEmbeddedMessage swrveEmbeddedMessage) {
        if (I0() && swrveEmbeddedMessage != null) {
            try {
                SwrveCampaignDisplayer swrveCampaignDisplayer = this.C;
                swrveCampaignDisplayer.d = SwrveHelper.b(new Date(), swrveCampaignDisplayer.e, 13);
                this.C.f--;
                SwrveEmbeddedCampaign swrveEmbeddedCampaign = swrveEmbeddedMessage.c;
                if (swrveEmbeddedCampaign != null) {
                    swrveEmbeddedCampaign.p();
                }
                O0(swrveEmbeddedMessage.f19096a, "true");
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    public final SwrveMessage q0(int i) {
        ArrayList arrayList = this.B;
        SwrveMessage swrveMessageW = null;
        if (arrayList != null && arrayList.size() > 0) {
            synchronized (this.B) {
                try {
                    Iterator it = this.B.iterator();
                    while (it.hasNext() && swrveMessageW == null) {
                        SwrveBaseCampaign swrveBaseCampaign = (SwrveBaseCampaign) it.next();
                        if (swrveBaseCampaign instanceof SwrveInAppCampaign) {
                            swrveMessageW = ((SwrveInAppCampaign) swrveBaseCampaign).w(i);
                        }
                    }
                } finally {
                }
            }
        }
        if (swrveMessageW == null) {
            SwrveLogger.e("Not showing messages: no candidate messages", new Object[0]);
        }
        return swrveMessageW;
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final String r(SwrveEmbeddedMessage swrveEmbeddedMessage, Map map) {
        if (!I0()) {
            return null;
        }
        try {
            return r0(swrveEmbeddedMessage, map);
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return null;
        }
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void s() {
        if (I0()) {
            try {
                L(this.j.c(), p0());
            } catch (Exception e) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            }
        }
    }

    public final void s0(final String str, final SwrveIdentityResponse swrveIdentityResponse, final boolean z) {
        ExecutorService executorService = this.y;
        if (SwrveHelper.p(str)) {
            SwrveLogger.b("External user id cannot be null or empty", new Object[0]);
            if (swrveIdentityResponse != null) {
                swrveIdentityResponse.b(-1, "External user id cannot be null or empty");
                return;
            }
            return;
        }
        if (executorService.isShutdown()) {
            SwrveLogger.e("Cannot identify while sdk is shutdown", new Object[0]);
        } else {
            executorService.execute(new SwrveRunnables.AnonymousClass1(new Runnable() { // from class: com.swrve.sdk.g
                /* JADX WARN: Removed duplicated region for block: B:38:0x0096  */
                /* JADX WARN: Removed duplicated region for block: B:44:0x00a5  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x00bb  */
                /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
                /* JADX WARN: Removed duplicated region for block: B:86:0x0131  */
                /* JADX WARN: Removed duplicated region for block: B:87:0x0136  */
                /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x018b  */
                /* JADX WARN: Type inference failed for: r11v3, types: [boolean] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() throws java.lang.Throwable {
                    /*
                        Method dump skipped, instructions count: 508
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.swrve.sdk.g.run():void");
                }
            }));
        }
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final void t(Map map) {
        if (I0()) {
            try {
                HashMap map2 = new HashMap();
                try {
                    map2.put(k.a.h, new JSONObject(map));
                    f0(this.j.c(), "user", map2, null, true);
                } catch (Exception e) {
                    SwrveLogger.c("SwrveSDK: JSONException when encoding user attributes. Not queueing.", e, new Object[0]);
                }
            } catch (Exception e2) {
                SwrveLogger.c("Exception thrown in Swrve SDK", e2, new Object[0]);
            }
        }
    }

    public final void t0(Activity activity) {
        SwrveConfig swrveConfig = this.l;
        SwrveLogger.e("onResume", new Object[0]);
        this.f0 = activity.getClass().getCanonicalName();
        boolean z = B().getTime() > this.r;
        if (z) {
            T0();
        } else {
            swrveConfig.getClass();
            S0();
        }
        this.r = B().getTime() + this.q;
        k0(z);
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new m(this, scheduledExecutorServiceNewSingleThreadScheduledExecutor, 1), swrveConfig.g.c, TimeUnit.MILLISECONDS);
        SwrveCampaignInfluence swrveCampaignInfluence = this.a0;
        Context contextP = P();
        swrveCampaignInfluence.getClass();
        SharedPreferences sharedPreferences = contextP.getSharedPreferences("swrve.influenced_data_v2", 0);
        ArrayList arrayListA = SwrveCampaignInfluence.a(sharedPreferences);
        if (!arrayListA.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            long time = new Date().getTime();
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                SwrveCampaignInfluence.InfluenceData influenceData = (SwrveCampaignInfluence.InfluenceData) it.next();
                try {
                    long j = influenceData.d;
                    String str = influenceData.b;
                    String str2 = influenceData.f19046a;
                    long j2 = j - time;
                    if (j2 >= 0 && j > 0) {
                        HashMap map = new HashMap();
                        map.put("id", Long.valueOf(influenceData.a()));
                        map.put("campaignType", "push");
                        map.put("actionType", "influenced");
                        HashMap map2 = new HashMap();
                        map2.put("delta", String.valueOf(j2 / l8.b.b));
                        map2.put("silent", String.valueOf(influenceData.e));
                        if (SwrveHelper.o(str2)) {
                            map2.put(k.a.b, str2);
                        }
                        if (SwrveHelper.o(str)) {
                            map2.put("trackingData", str);
                        }
                        arrayList.add(EventHelper.b("generic_campaign_event", map, map2, p(), System.currentTimeMillis()));
                    }
                } catch (JSONException e) {
                    SwrveLogger.c("Could not obtain push influenced data:", e, new Object[0]);
                }
            }
            if (!arrayList.isEmpty()) {
                f(contextP, getUserId(), arrayList);
            }
            sharedPreferences.edit().clear().commit();
        }
        if (this.b0 != null) {
            Bundle bundle = new Bundle();
            bundle.putString(NotificationResult.Notification.CAMPAIGN, this.b0);
            if (this.Z == null) {
                this.Z = new SwrveDeeplinkManager(A0(this.j.c()), (SwrveConfig) getConfig(), P(), this.F, this.t);
            }
            this.Z.c(bundle);
            this.b0 = null;
        }
    }

    @Override // com.swrve.sdk.ISwrveCampaignManager
    public final Date u() {
        if (!I0()) {
            return new Date();
        }
        try {
            return this.Q;
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return null;
        }
    }

    public final void u0(final String str, final String str2, final boolean z) {
        if (this.j.b() == SwrveTrackingState.f) {
            SwrveLogger.b("SwrveSDK tracking state:EVENT_SENDING_PAUSED so cannot send events now.", new Object[0]);
        } else if (SwrveHelper.o(str) && SwrveHelper.o(str2)) {
            g0(new Runnable() { // from class: com.swrve.sdk.c
                @Override // java.lang.Runnable
                public final void run() {
                    SwrveBase swrveBase = this.d;
                    String str3 = str;
                    boolean z2 = z;
                    String str4 = str2;
                    int i = SwrveBase.p0;
                    if (swrveBase.s.d(1, str3).isEmpty()) {
                        SwrveLogger.b("SwrveSDK no event to send", new Object[0]);
                        return;
                    }
                    if (z2) {
                        swrveBase.N = true;
                    }
                    String deviceId = swrveBase.getDeviceId();
                    Context context = (Context) swrveBase.e.get();
                    SwrveConfig swrveConfig = swrveBase.l;
                    SwrveEventsManagerImp swrveEventsManagerImp = new SwrveEventsManagerImp(context, swrveConfig, swrveBase.t, str3, swrveBase.g, str4, deviceId);
                    SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = swrveBase.s;
                    synchronized (SwrveMultiLayerLocalStorage.d) {
                        swrveConfig.getClass();
                        swrveEventsManagerImp.b(swrveMultiLayerLocalStorage.d(50, str3));
                    }
                }
            });
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final void v(String str) {
        if (I0()) {
            this.b0 = str;
        }
    }

    public abstract void v0();

    @Override // com.swrve.sdk.ISwrveCommon
    public final void w() {
        this.l.getClass();
    }

    public final void w0() {
        SwrveMultiLayerLocalStorage swrveMultiLayerLocalStorage = this.s;
        if (Build.VERSION.SDK_INT >= 33) {
            String strI = SwrveHelper.i(ContextCompat.a(P(), "android.permission.POST_NOTIFICATIONS"));
            String strC = swrveMultiLayerLocalStorage.c("", "permission_current_android.permission.POST_NOTIFICATIONS");
            if (SwrveHelper.p(strC)) {
                swrveMultiLayerLocalStorage.g("", "permission_current_android.permission.POST_NOTIFICATIONS", strI);
                return;
            }
            if (strI.equals(strC)) {
                return;
            }
            HashMap map = new HashMap();
            if (strI.equals(SwrveHelper.i(0))) {
                map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "Swrve.permission.android.notification.granted");
            } else {
                map.put(AppMeasurementSdk.ConditionalUserProperty.NAME, "Swrve.permission.android.notification.denied");
            }
            f0(this.j.c(), "event", map, new HashMap(), false);
            swrveMultiLayerLocalStorage.g("", "permission_current_android.permission.POST_NOTIFICATIONS", strI);
        }
    }

    @Override // com.swrve.sdk.ISwrveCommon
    public final boolean x() {
        try {
            return this.j.b() == SwrveTrackingState.g;
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return true;
        }
    }

    public abstract void x0(JSONObject jSONObject);

    @Override // com.swrve.sdk.ISwrveCommon
    public final SwrveNotificationConfig y() {
        return this.l.f;
    }

    public final int y0() {
        return ((Context) this.e.get()).getSharedPreferences("swrve_prefs", 0).getInt("swrve_cr_asset_download_limit", SwrveImp.n0);
    }

    @Override // com.swrve.sdk.ISwrveBase
    public final ArrayList z() {
        try {
            return C0(R());
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK", e, new Object[0]);
            return new ArrayList();
        }
    }

    public final Bitmap z0(String str) {
        if (!SwrveHelper.n(str)) {
            return null;
        }
        SwrveImageScaler.BitmapResult bitmapResultA = SwrveImageScaler.a(SwrveHelper.g(P()), SwrveHelper.f(P()), 1, str);
        if (bitmapResultA != null && bitmapResultA.a() != null) {
            return bitmapResultA.a();
        }
        SwrveLogger.h("Could not load bitmap from filePath:%s", str);
        return null;
    }
}
