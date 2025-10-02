package com.adobe.mobile;

import com.adobe.mobile.StaticMethods;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
class TargetJsonBuilder {
    public static JSONObject a() {
        try {
            return new JSONObject();
        } catch (JSONException e) {
            StaticMethods.K("Target - Error adding parameters to JSON Object (%s)", e.getLocalizedMessage());
            return null;
        }
    }

    public static JSONObject b(HashMap map) throws JSONException {
        JSONObject jSONObjectA = a();
        if (jSONObjectA == null) {
            jSONObjectA = new JSONObject();
        }
        try {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    jSONObjectA.put((String) entry.getKey(), entry.getValue());
                }
            }
            return jSONObjectA;
        } catch (JSONException e) {
            StaticMethods.K("Target - Failed to append target internal parameters to the target request json (%s)", e);
            return jSONObjectA;
        }
    }

    public static JSONObject c(List list, HashMap map) throws JSONException {
        HashMap map2;
        String str;
        String str2;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("client", MobileConfig.b().o);
        jSONObject.put("contentAsJson", false);
        if (MobileConfig.b().m()) {
            long j = MobileConfig.b().q;
            if (j != 0) {
                jSONObject.put("environmentId", j);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        final VisitorIDService visitorIDServiceI = VisitorIDService.i();
        visitorIDServiceI.getClass();
        FutureTask futureTask = new FutureTask(new Callable<HashMap<String, Object>>() { // from class: com.adobe.mobile.VisitorIDService.11
            public AnonymousClass11() {
            }

            @Override // java.util.concurrent.Callable
            public final HashMap<String, Object> call() {
                VisitorIDService visitorIDService = VisitorIDService.this;
                if (VisitorIDService.f(visitorIDService) == null || VisitorIDService.f(visitorIDService).length() <= 0) {
                    return null;
                }
                HashMap<String, Object> map3 = new HashMap<>();
                String str3 = visitorIDService.f;
                if (str3 != null && str3.length() > 0) {
                    map3.put("blob", visitorIDService.f);
                }
                String str4 = visitorIDService.e;
                if (str4 != null && str4.length() > 0) {
                    map3.put("dcsLocationHint", visitorIDService.e);
                }
                return map3;
            }
        });
        visitorIDServiceI.j.execute(futureTask);
        String string = null;
        try {
            map2 = (HashMap) futureTask.get();
        } catch (Exception e) {
            StaticMethods.J("ID Service - Unable to retrieve target parameters from queue(%s)", e.getLocalizedMessage());
            map2 = null;
        }
        if (map2 != null && !map2.isEmpty()) {
            for (Map.Entry entry : map2.entrySet()) {
                jSONObject2.put((String) entry.getKey(), entry.getValue());
            }
        }
        String strB = AudienceManagerWorker.b();
        if (!d(strB)) {
            jSONObject2.put("dataPartnerUserId", strB);
        }
        String strA = AudienceManagerWorker.a();
        if (!d(strA)) {
            jSONObject2.put("dataPartnerId", strA);
        }
        try {
            string = StaticMethods.B().getString("AAMUserId", null);
        } catch (StaticMethods.NullContextException e2) {
            StaticMethods.I("Target - Error getting uuid from shared preferences (%s).", e2.getMessage());
        }
        if (!d(string)) {
            jSONObject2.put("uuid", string);
        }
        if (jSONObject2.length() > 0) {
            jSONObject.put("aamParameters", jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        String strJ = TargetWorker.j();
        if (!d(strJ)) {
            jSONObject3.put("tntId", strJ);
        }
        String strI = TargetWorker.i();
        if (!d(strI)) {
            jSONObject3.put("thirdPartyId", strI);
        }
        String strG = VisitorIDService.i().g();
        if (!d(strG)) {
            jSONObject3.put("marketingCloudVisitorId", strG);
        }
        List<VisitorID> listA = Visitor.a();
        if (listA != null && !listA.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            for (VisitorID visitorID : listA) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("id", visitorID.b);
                jSONObject4.put("integrationCode", visitorID.f13283a);
                jSONObject4.put("authenticatedState", visitorID.c.e);
                jSONArray.put(jSONObject4);
            }
            jSONObject3.put("customerIds", jSONArray);
        }
        if (jSONObject3.length() > 0) {
            jSONObject.put("id", jSONObject3);
        }
        JSONObject jSONObjectA = a();
        if (jSONObjectA != null && jSONObjectA.length() > 0) {
            jSONObject.put("profileParameters", jSONObjectA);
        }
        new JSONArray();
        if (list != null && !list.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray2.put((JSONObject) it.next());
            }
            jSONObject.put("notifications", jSONArray2);
        }
        new JSONArray();
        if (TargetPreviewManager.d().f() != null) {
            TargetPreviewManager targetPreviewManagerD = TargetPreviewManager.d();
            synchronized (targetPreviewManagerD.f) {
                str = targetPreviewManagerD.e;
            }
            if (str != null) {
                try {
                    TargetPreviewManager targetPreviewManagerD2 = TargetPreviewManager.d();
                    synchronized (targetPreviewManagerD2.f) {
                        str2 = targetPreviewManagerD2.e;
                    }
                    JSONObject jSONObject5 = new JSONObject(str2);
                    Iterator<String> itKeys = jSONObject5.keys();
                    if (itKeys != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject.put(next, jSONObject5.get(next));
                        }
                    }
                } catch (Exception e3) {
                    StaticMethods.J("Target - Could not compile the target preview params with the Target request! (%s)", e3);
                }
            }
        }
        return jSONObject;
    }

    public static boolean d(String str) {
        return str == null || str.isEmpty();
    }

    public static JSONObject e(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
        jSONObject2.put("timestamp", System.currentTimeMillis());
        jSONObject2.remove("content");
        jSONObject2.remove("clientSideAnalyticsLoggingPayload");
        jSONObject2.remove("errorType");
        jSONObject2.remove("parameters");
        jSONObject2.remove("order");
        jSONObject2.remove("product");
        return jSONObject2;
    }
}
