package com.medallia.digital.mobilesdk;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
final class e2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16438a = "CSAT";

    public static JSONObject a(JSONObject jSONObject, FormConfigurations formConfigurations) throws JSONException {
        if (formConfigurations == null || formConfigurations.getFeedbackPayloadExcludedTypes() == null || formConfigurations.getFeedbackPayloadExcludedTypes().isEmpty()) {
            return new JSONObject();
        }
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("components");
            JSONArray jSONArray2 = new JSONArray();
            ArrayList<String> feedbackPayloadExcludedTypes = formConfigurations.getFeedbackPayloadExcludedTypes();
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (jSONObject2.has("type") && !feedbackPayloadExcludedTypes.contains(jSONObject2.getString("type"))) {
                    jSONObject2.put("isCsat", jSONObject2.has("role") && f16438a.equals(jSONObject2.getString("role")));
                    jSONArray2.put(jSONObject2);
                }
            }
            jSONObject.put("components", jSONArray2);
            return jSONObject;
        } catch (Exception e) {
            a4.c(e.getMessage());
            return null;
        }
    }
}
