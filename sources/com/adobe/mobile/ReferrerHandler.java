package com.adobe.mobile;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import com.adobe.mobile.StaticMethods;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
final class ReferrerHandler {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f13278a = true;
    public static final HashSet b;

    /* renamed from: com.adobe.mobile.ReferrerHandler$1, reason: invalid class name */
    public static class AnonymousClass1 extends HashSet<String> {
    }

    static {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.add("a.acquisition.custom.unique_id");
        anonymousClass1.add("a.acquisition.custom.deeplinkid");
        anonymousClass1.add("a.acquisition.custom.link_deferred");
        b = anonymousClass1;
    }

    public static HashMap a(String str, JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String string = itKeys.next().toString();
                        try {
                            map.put(string, jSONObject2.getString(string));
                        } catch (JSONException unused) {
                            StaticMethods.I("Analytics - Unable to parse acquisition service response (the value for %s is not a string)", string);
                        }
                    }
                }
            } catch (JSONException unused2) {
            }
        }
        return map;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap mapA = a("adobeData", jSONObject);
            HashMap map = new HashMap();
            if (mapA.size() <= 0) {
                return str;
            }
            for (Map.Entry entry : mapA.entrySet()) {
                String str2 = (String) entry.getKey();
                if (!str2.startsWith("a.acquisition.custom.")) {
                    str2 = "a.acquisition.custom." + str2;
                }
                map.put(str2, entry.getValue());
            }
            jSONObject.remove("adobeData");
            jSONObject.put("adobeData", new JSONObject(map));
            return jSONObject.toString();
        } catch (JSONException e) {
            StaticMethods.I("Could not parse adobeData from the response (%s)", e.getMessage());
            return str;
        }
    }

    public static HashMap c(String str) {
        HashMap map;
        HashMap map2 = new HashMap();
        try {
            HashMap mapA = a("adobeData", new JSONObject(str));
            if (mapA.size() <= 0) {
                return map2;
            }
            if (mapA.size() == 0) {
                map = null;
            } else {
                HashMap map3 = new HashMap(mapA);
                Iterator it = map3.entrySet().iterator();
                while (it.hasNext()) {
                    if (b.contains((String) ((Map.Entry) it.next()).getKey())) {
                        it.remove();
                    }
                }
                map = map3;
            }
            map2.putAll(map);
            return map2;
        } catch (JSONException e) {
            StaticMethods.I("Could not parse adobeData from the response (%s)", e.getMessage());
            return map2;
        }
    }

    public static JSONObject d(String str) {
        if (str != null && str.length() != 0) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                try {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("contextData");
                    if (jSONObject2 == null) {
                        StaticMethods.I("Analytics - Unable to parse acquisition service response (no contextData parameter in response)", new Object[0]);
                        return null;
                    }
                    if (jSONObject2.has("a.referrer.campaign.name")) {
                        StaticMethods.I("Analytics - Received Referrer Data(%s)", str);
                        return jSONObject;
                    }
                    StaticMethods.I("Analytics - Acquisition referrer data was not complete (no a.referrer.campaign.name in context data), ignoring", new Object[0]);
                    return null;
                } catch (JSONException unused) {
                    StaticMethods.I("Analytics - Unable to parse acquisition service response (no contextData parameter in response)", new Object[0]);
                    return null;
                }
            } catch (JSONException e) {
                StaticMethods.I("Analytics - Unable to parse response(%s)", e.getLocalizedMessage());
            }
        }
        return null;
    }

    public static void e(String str) {
        if (str == null) {
            return;
        }
        try {
            Activity activityQ = StaticMethods.q();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            activityQ.startActivity(intent);
        } catch (StaticMethods.NullActivityException e) {
            StaticMethods.K(e.getMessage(), new Object[0]);
        } catch (Exception e2) {
            StaticMethods.K("Acquisition - Could not load deep link intent for Acquisition (%s)", e2.toString());
        }
    }
}
