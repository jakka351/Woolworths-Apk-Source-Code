package com.swrve.sdk;

import android.os.Bundle;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class SwrvePushManagerHelper {
    public static String a(Bundle bundle) throws JSONException {
        String string = bundle.getString("_s.JsonPayload");
        try {
            JSONObject jSONObject = string != null ? new JSONObject(string) : new JSONObject();
            Set<String> setKeySet = ((Bundle) bundle.clone()).keySet();
            setKeySet.removeAll(SwrveNotificationInternalPayloadConstants.f19067a);
            for (String str : setKeySet) {
                if (!jSONObject.has(str)) {
                    jSONObject.put(str, bundle.get(str));
                }
            }
            return jSONObject.toString();
        } catch (Exception e) {
            SwrveLogger.c("Error getting json payload.", e, new Object[0]);
            return "";
        }
    }
}
