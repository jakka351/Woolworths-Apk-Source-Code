package com.dynatrace.android.agent.mixed;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.util.Utility;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class BaseRequestData {
    public static final String b;

    /* renamed from: a, reason: collision with root package name */
    public final String f14136a;

    static {
        boolean z = Global.f14077a;
        b = "dtxBaseRequestData";
    }

    public BaseRequestData(String str) {
        this.f14136a = str;
    }

    public final JSONObject a(int i) throws JSONException {
        String str = this.f14136a;
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("has_request", true);
            jSONObject.put("url.full", str);
            if (i > 0) {
                jSONObject.put("http.response.status_code", i);
            }
            if (i >= 400 && i <= 599) {
                jSONObject.put("has_error", true);
                jSONObject.put("has_failed_request", true);
            }
            return jSONObject;
        } catch (JSONException e) {
            if (Global.f14077a) {
                Utility.h(b, e.getMessage());
            }
            return null;
        }
    }
}
