package com.adobe.marketing.mobile;

import com.adobe.marketing.mobile.Event;
import com.adobe.marketing.mobile.util.JSONUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class EventCoder {
    public static Event a(String str) throws JSONException {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    string = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                } catch (JSONException unused) {
                    string = null;
                }
                try {
                    string2 = jSONObject.getString("uuid");
                } catch (JSONException unused2) {
                    string2 = null;
                }
                try {
                    string3 = jSONObject.getString("source");
                } catch (JSONException unused3) {
                    string3 = null;
                }
                try {
                    string4 = jSONObject.getString("type");
                } catch (JSONException unused4) {
                    string4 = null;
                }
                HashMap mapC = JSONUtils.c(jSONObject.optJSONObject("data"));
                long jOptLong = jSONObject.optLong("timestamp", 0L);
                try {
                    string5 = jSONObject.getString("responseId");
                } catch (JSONException unused5) {
                    string5 = null;
                }
                try {
                    string6 = jSONObject.getString("parentId");
                } catch (JSONException unused6) {
                    string6 = null;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("mask");
                Event.Builder builder = new Event.Builder(string, string4, string3, jSONArrayOptJSONArray != null ? (String[]) JSONUtils.b(jSONArrayOptJSONArray).toArray(new String[0]) : null);
                Event event = builder.f13159a;
                if (string2 != null) {
                    builder.e();
                    event.b = string2;
                }
                builder.e();
                event.f = jOptLong;
                builder.d(mapC);
                builder.e();
                event.g = string5;
                builder.e();
                event.h = string6;
                return builder.a();
            } catch (JSONException unused7) {
            }
        }
        return null;
    }

    public static String b(Event event) throws JSONException {
        if (event == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.NAME, event.f13158a);
            jSONObject.put("type", event.d);
            jSONObject.put("source", event.c);
            jSONObject.put("uuid", event.b);
            jSONObject.put("timestamp", event.f);
            jSONObject.put("data", JSONObject.wrap(event.e));
            jSONObject.put("responseId", event.g);
            jSONObject.put("parentId", event.h);
            jSONObject.put("mask", JSONObject.wrap(event.i));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }
}
