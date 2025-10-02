package com.swrve.sdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class SwrveResourceManager {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f19074a;

    public static void b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList = new ArrayList();
        try {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(itKeys.next());
                jSONObject2.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                jSONObject2.getInt("case_index");
                arrayList.add(new SwrveABTestDetails());
            }
        } catch (Exception e) {
            SwrveLogger.c("Exception thrown in Swrve SDK, could not parse AB Test details", e, new Object[0]);
        }
    }

    public final void a(JSONArray jSONArray) {
        try {
            int length = jSONArray.length();
            synchronized (this.f19074a) {
                try {
                    this.f19074a = new HashMap();
                    for (int i = 0; i < length; i++) {
                        JSONObject jSONObject = jSONArray.getJSONObject(i);
                        String string = jSONObject.getString("uid");
                        SwrveHelper.a(jSONObject);
                        this.f19074a.put(string, new SwrveResource());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (JSONException unused) {
            SwrveLogger.e("Invalid JSON received for resources, resources not updated", new Object[0]);
        }
    }
}
