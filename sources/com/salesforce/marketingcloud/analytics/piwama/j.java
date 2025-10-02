package com.salesforce.marketingcloud.analytics.piwama;

import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import com.salesforce.marketingcloud.location.LatLon;
import com.salesforce.marketingcloud.messages.RegionMessageManager;
import com.salesforce.marketingcloud.messages.push.PushMessageManager;
import com.salesforce.marketingcloud.registration.RegistrationManager;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import me.oriient.internal.infra.rest.RequestBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
abstract class j {
    static final String c = "api_key";
    static final String d = "app_id";
    static final String e = "app_name";
    static final String f = "user_info";
    static final String g = "payload";
    static final String h = "849f26e2-2df6-11e4-ab12-14109fdc48df";
    private static final Map<String, String> i = Collections.unmodifiableMap(new a());
    private static final String j = "device";
    private static final String k = "details";
    private static final String l = "manufacturer";
    private static final String m = "device_id";
    private static final String n = "push_enabled";
    private static final String o = "location";
    private static final String p = "latitude";
    private static final String q = "longitude";
    private static final String r = "platform";
    private static final String s = "platform_version";
    private static final String t = "device_type";
    private static final String u = "email";

    /* renamed from: a, reason: collision with root package name */
    final com.salesforce.marketingcloud.storage.j f16850a;
    final MarketingCloudConfig b;

    public class a extends ArrayMap {
        public a() {
            super(0);
            put(RequestBuilder.CONTENT_TYPE, "application/json; charset=utf-8");
            put("Connection", "close");
        }
    }

    public j(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar) {
        this.b = marketingCloudConfig;
        this.f16850a = jVar;
    }

    @VisibleForTesting
    public String a(JSONObject jSONObject, List<com.salesforce.marketingcloud.analytics.b> list) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(g);
        String string = "{}";
        if (jSONObjectOptJSONObject != null) {
            JSONArray jSONArray = new JSONArray();
            for (com.salesforce.marketingcloud.analytics.b bVar : list) {
                try {
                    if (bVar.e() != null) {
                        jSONArray.put(new JSONObject(bVar.e()));
                    }
                } catch (Exception e2) {
                    com.salesforce.marketingcloud.g.b(i.m, e2, "Failed to add the PI AnalyticItem Event to the event list.", new Object[0]);
                }
            }
            if (jSONArray.length() > 0) {
                try {
                    jSONObjectOptJSONObject.put("events", jSONArray);
                    string = jSONObject.toString();
                } catch (Exception e3) {
                    com.salesforce.marketingcloud.g.b(i.m, e3, "Failed to add the PI AnalyticItem Events to the payload.", new Object[0]);
                }
                jSONObjectOptJSONObject.remove("events");
            }
        }
        return string;
    }

    @NonNull
    public abstract JSONObject a(@NonNull JSONObject jSONObject);

    @NonNull
    public abstract Object[] b();

    @VisibleForTesting
    @WorkerThread
    public JSONObject a(@NonNull RegistrationManager registrationManager, @NonNull PushMessageManager pushMessageManager, @NonNull RegionMessageManager regionMessageManager, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_id", registrationManager.getDeviceId());
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("email", str);
            }
            jSONObject.put("details", a(pushMessageManager));
            JSONObject jSONObjectA = a(regionMessageManager);
            if (jSONObjectA != null) {
                jSONObject.put(o, jSONObjectA);
            }
            jSONObject.put(j, a());
            return jSONObject;
        } catch (JSONException e2) {
            com.salesforce.marketingcloud.g.b(i.m, e2, "Could not create User Info object.", new Object[0]);
            return jSONObject;
        }
    }

    @NonNull
    @VisibleForTesting
    public JSONObject a(@NonNull PushMessageManager pushMessageManager) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("push_enabled", pushMessageManager.isPushEnabled());
        return jSONObject;
    }

    @VisibleForTesting
    public JSONObject a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(l, Build.MANUFACTURER);
        jSONObject.put("platform", "Android");
        jSONObject.put("platform_version", Build.VERSION.RELEASE);
        jSONObject.put(t, Build.MODEL);
        return jSONObject;
    }

    @Nullable
    @VisibleForTesting
    @WorkerThread
    public JSONObject a(@NonNull RegionMessageManager regionMessageManager) throws JSONException {
        LatLon latLonF;
        if ((!regionMessageManager.isGeofenceMessagingEnabled() && !regionMessageManager.isProximityMessagingEnabled()) || (latLonF = this.f16850a.r().f(this.f16850a.b())) == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("latitude", latLonF.latitude());
        jSONObject.put("longitude", latLonF.longitude());
        return jSONObject;
    }

    @NonNull
    @WorkerThread
    public com.salesforce.marketingcloud.http.b a(@NonNull RegistrationManager registrationManager, @NonNull PushMessageManager pushMessageManager, @NonNull RegionMessageManager regionMessageManager, @NonNull List<com.salesforce.marketingcloud.analytics.b> list) {
        return com.salesforce.marketingcloud.http.a.i.a(this.b, this.f16850a.c(), b(), a(a(a(registrationManager, pushMessageManager, regionMessageManager, list.get(0).f())), list), i);
    }
}
