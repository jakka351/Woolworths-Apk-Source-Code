package com.swrve.sdk;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class EventHelper {
    public static ArrayList a(long j, String str, String str2, String str3, String str4, String str5, Map map, int i) {
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        map2.put("id", str);
        map2.put("campaignType", str2);
        map2.put("actionType", str3);
        if (SwrveHelper.o(str4)) {
            map2.put("contextId", str4);
        }
        if (SwrveHelper.o(str5)) {
            map2.put("campaignId", str5);
        }
        arrayList.add(b("generic_campaign_event", map2, map, i, j));
        return arrayList;
    }

    public static String b(String str, HashMap map, Map map2, int i, long j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", str);
        jSONObject.put("time", j);
        if (i > 0) {
            jSONObject.put("seqnum", i);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
        }
        if (map2 != null && map2.size() > 0) {
            jSONObject.put("payload", new JSONObject(map2));
        }
        return jSONObject.toString();
    }

    public static String c(LinkedHashMap linkedHashMap, String str, String str2, String str3, String str4) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user", str);
        jSONObject.put("session_token", str3);
        jSONObject.put("version", "3");
        jSONObject.put(k.a.q, str2);
        jSONObject.put("unique_device_id", str4);
        JSONArray jSONArray = new JSONArray();
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            jSONArray.put(new JSONObject((String) ((Map.Entry) it.next()).getValue()));
        }
        jSONObject.put("data", jSONArray);
        return jSONObject.toString();
    }

    public static String d(String str) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject(str);
        return (!jSONObject.has("data") || (jSONArray = jSONObject.getJSONArray("data")) == null || jSONArray.length() <= 0) ? "" : jSONArray.getString(0);
    }

    public static String e(String str, HashMap map) {
        switch (str) {
            case "buy_in":
                return "Swrve.buy_in";
            case "session_end":
                return "Swrve.session.end";
            case "iap":
                return "Swrve.iap";
            case "user":
                return "Swrve.user_properties_changed";
            case "currency_given":
                return "Swrve.currency_given";
            case "event":
                return (String) map.get(AppMeasurementSdk.ConditionalUserProperty.NAME);
            case "session_start":
                return "Swrve.session.start";
            case "purchase":
                return "Swrve.user_purchase";
            default:
                return "";
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public static String f(ArrayList arrayList) {
        String userId = SwrveCommon.f19047a.getUserId();
        String appVersion = SwrveCommon.f19047a.getAppVersion();
        String strH = SwrveCommon.f19047a.h();
        String deviceId = SwrveCommon.f19047a.getDeviceId();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(-1L, (String) arrayList.get(0));
        return c(linkedHashMap, userId, appVersion, strH, deviceId);
    }

    /* JADX WARN: Type inference failed for: r14v2, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public static ArrayList g(Bundle bundle, long j, boolean z, String str) throws JSONException {
        String str2 = SwrveHelper.f19056a;
        Object obj = bundle.get("_p");
        String string = obj != null ? obj.toString() : null;
        if (SwrveHelper.p(string)) {
            Object obj2 = bundle.get("_sp");
            string = obj2 != null ? obj2.toString() : null;
        }
        if (!SwrveHelper.o(string)) {
            return new ArrayList();
        }
        String string2 = bundle.getString("_p");
        HashMap map = new HashMap();
        if (SwrveHelper.p(string2)) {
            string2 = bundle.getString("_sp");
            map.put("silent", String.valueOf(true));
        } else {
            map.put("silent", String.valueOf(false));
        }
        String str3 = string2;
        map.put("displayed", String.valueOf(z));
        if (SwrveHelper.o(str)) {
            map.put("reason", str);
        }
        if (bundle.containsKey("_td")) {
            map.put("trackingData", bundle.getString("_td"));
        }
        if (bundle.containsKey("_smp")) {
            map.put(k.a.b, bundle.getString("_smp"));
        }
        JSONObject jSONObject = new JSONObject();
        if (bundle.containsKey("provider.message_id")) {
            jSONObject.put("provider.message_id", bundle.getString("provider.message_id"));
        }
        if (bundle.containsKey("provider.sent_time")) {
            jSONObject.put("provider.sent_time", bundle.getString("provider.sent_time"));
        }
        if (bundle.containsKey(NotificationMessage.NOTIF_KEY_SID)) {
            jSONObject.put(NotificationMessage.NOTIF_KEY_SID, bundle.getString(NotificationMessage.NOTIF_KEY_SID));
        }
        if (bundle.containsKey("provider.priority")) {
            jSONObject.put("provider.priority", bundle.getString("provider.priority"));
        }
        if (bundle.containsKey("provider.original_priority")) {
            jSONObject.put("provider.original_priority", bundle.getString("provider.original_priority"));
        }
        if (bundle.containsKey("channel_id")) {
            jSONObject.put("channel_id", bundle.getString("channel_id"));
        }
        if (bundle.containsKey("channel_parent_id")) {
            jSONObject.put("channel_parent_id", bundle.getString("channel_parent_id"));
        }
        if (jSONObject.length() > 0) {
            map.put("additional_info", jSONObject);
        }
        return a(j, str3, "push", "delivered", null, null, map, SwrveCommon.f19047a.p());
    }

    public static String h(long j, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("time", j);
        jSONObject.put("type", "qa_log_event");
        jSONObject.put("log_source", "sdk");
        jSONObject.put("log_type", str);
        jSONObject.put("log_details", new JSONObject(str2));
        return jSONObject.toString();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public static void i(Context context, String str, String str2, HashMap map) {
        try {
            ?? r2 = SwrveCommon.f19047a;
            ArrayList arrayList = new ArrayList();
            int iP = r2.p();
            if ("geo".equalsIgnoreCase(str)) {
                SwrveLogger.b("Sending generic engaged event.", new Object[0]);
                arrayList = a(System.currentTimeMillis(), str2, "geo", "engaged", "", "", map, iP);
            } else if ("push".equalsIgnoreCase(str)) {
                String str3 = "Swrve.Messages.Push-" + str2 + ".engaged";
                SwrveLogger.b("Sending engaged event: %s", str3);
                HashMap map2 = new HashMap();
                map2.put(AppMeasurementSdk.ConditionalUserProperty.NAME, str3);
                arrayList.add(b("event", map2, map, iP, System.currentTimeMillis()));
            }
            r2.f(context, r2.getUserId(), arrayList);
        } catch (Exception e) {
            SwrveLogger.c("Exception trying to send engaged event.", e, new Object[0]);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.swrve.sdk.ISwrveCommon, java.lang.Object] */
    public static void j(Context context, String str, JSONObject jSONObject) {
        try {
            ?? r0 = SwrveCommon.f19047a;
            HashMap map = new HashMap();
            map.put(k.a.h, jSONObject);
            map.put("user_initiated", "false");
            String strB = b("device_update", map, null, r0.p(), System.currentTimeMillis());
            ArrayList arrayList = new ArrayList();
            arrayList.add(strB);
            r0.f(context, str, arrayList);
        } catch (Exception e) {
            SwrveLogger.c("SwrveSDK couldn't send uninitiated device_update event.", e, new Object[0]);
        }
    }
}
