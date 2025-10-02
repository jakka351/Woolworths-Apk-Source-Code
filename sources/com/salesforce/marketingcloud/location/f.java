package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.RestrictTo;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint
@RestrictTo
/* loaded from: classes6.dex */
public abstract class f extends com.salesforce.marketingcloud.f {
    public static final String d = "NO_GPS_HARDWARE";
    public static final String e = "RECEIVER_NOT_DECLARED_IN_MANIFEST";
    public static final int f = -1;
    private static final String g = "LocationManager";
    static final String h = com.salesforce.marketingcloud.g.a(g);
    protected static final String i = "com.salesforce.marketingcloud.location.LOCATION_UPDATE";
    protected static final String j = "com.salesforce.marketingcloud.location.GEOFENCE_ERROR";
    protected static final String k = "com.salesforce.marketingcloud.location.GEOFENCE_EVENT";
    protected static final String l = "extra_location";
    protected static final String m = "extra_transition";
    protected static final String n = "extra_fence_ids";
    protected static final String o = "extra_error_code";
    protected static final String p = "extra_error_message";

    public abstract void a(c cVar);

    @RequiresPermission
    public abstract void a(e eVar);

    public abstract void a(List<String> list);

    public abstract void a(b... bVarArr);

    public boolean a() {
        return false;
    }

    public abstract void b();

    public abstract void b(c cVar);

    public abstract void b(e eVar);

    @Override // com.salesforce.marketingcloud.d
    @NonNull
    public final String componentName() {
        return g;
    }

    public static f a(Context context, MarketingCloudConfig marketingCloudConfig) {
        Exception exc;
        boolean zB = com.salesforce.marketingcloud.util.d.b();
        Boolean bool = null;
        Exception exc2 = null;
        if (zB) {
            boolean zA = LocationReceiver.a(context);
            Boolean boolValueOf = Boolean.valueOf(zA);
            if (zA) {
                try {
                    return new h(context, marketingCloudConfig);
                } catch (Exception e2) {
                    exc2 = e2;
                    com.salesforce.marketingcloud.g.b(h, exc2, "Unable to create real instance of %s", g);
                }
            }
            exc = exc2;
            bool = boolValueOf;
        } else {
            com.salesforce.marketingcloud.g.e(h, "GooglePlayServices Location dependency missing from build.", new Object[0]);
            exc = null;
        }
        return new a(marketingCloudConfig, bool, zB, exc);
    }

    @RestrictTo
    public static Intent a(int i2, String str) {
        return new Intent(j).putExtra(o, i2).putExtra(p, str);
    }

    @RestrictTo
    public static Intent a(int i2, @NonNull List<String> list, @Nullable Location location) {
        Intent intent = new Intent(k);
        intent.putExtra(m, i2);
        if (list instanceof ArrayList) {
            intent.putStringArrayListExtra(n, (ArrayList) list);
        } else {
            intent.putStringArrayListExtra(n, new ArrayList<>(list));
        }
        if (location != null) {
            intent.putExtra(l, location);
        }
        return intent;
    }

    private static JSONObject a(MarketingCloudConfig marketingCloudConfig) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("geofencingEnabled", marketingCloudConfig.geofencingEnabled());
            jSONObject.put("proximityEnabled", marketingCloudConfig.proximityEnabled());
            return jSONObject;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(h, e2, "Error creating LocationManager state.", new Object[0]);
            return jSONObject;
        }
    }

    public static JSONObject a(MarketingCloudConfig marketingCloudConfig, int i2, String str) throws JSONException {
        JSONObject jSONObjectA = a(marketingCloudConfig);
        try {
            jSONObjectA.put("apiCode", i2);
            jSONObjectA.put("apiMessage", str);
            return jSONObjectA;
        } catch (Exception e2) {
            com.salesforce.marketingcloud.g.b(h, e2, "Error creating LocationManager state.", new Object[0]);
            return jSONObjectA;
        }
    }

    public static JSONObject a(MarketingCloudConfig marketingCloudConfig, Boolean bool, boolean z, Exception exc) throws JSONException {
        JSONObject jSONObjectA = a(marketingCloudConfig);
        try {
            jSONObjectA.put("serviceAvailable", bool);
            jSONObjectA.put("gmsLocationDependencyAvailable", z);
            if (exc == null) {
                return jSONObjectA;
            }
            jSONObjectA.put("exceptionMessage", exc.getMessage());
            return jSONObjectA;
        } catch (JSONException e2) {
            com.salesforce.marketingcloud.g.b(h, e2, "Error creating LocationManager state.", new Object[0]);
            return jSONObjectA;
        }
    }

    public static Intent a(@NonNull Location location) {
        return new Intent(i).putExtra(l, location);
    }
}
