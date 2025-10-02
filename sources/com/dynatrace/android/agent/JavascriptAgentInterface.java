package com.dynatrace.android.agent;

import android.webkit.JavascriptInterface;
import com.dynatrace.android.agent.conf.UserPrivacyOptions;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.util.Utility;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class JavascriptAgentInterface {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14078a;

    static {
        boolean z = Global.f14077a;
        f14078a = "dtxJavascriptAgentInterface";
    }

    @JavascriptInterface
    public void applyUserPrivacyOptions(int i, boolean z) {
        String str = Dynatrace.f14076a;
        if (Global.b.get()) {
            AdkSettings.l.f.getClass();
        }
    }

    @JavascriptInterface
    public String getUserPrivacyOptions() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        UserPrivacyOptions userPrivacyOptions = Session.a().i.f14094a;
        try {
            jSONObject.put("dataCollectionLevel", userPrivacyOptions.f14104a.d);
            jSONObject.put("crashReportingOptedIn", userPrivacyOptions.b);
            return jSONObject.toString();
        } catch (JSONException e) {
            if (!Global.f14077a) {
                return "";
            }
            Utility.h(f14078a, "Exception while creating JSON object for UserPrivacyOptions: " + e.getMessage());
            return "";
        }
    }

    @JavascriptInterface
    public void incrementActionCount() {
        if (Dynatrace.a()) {
            Session.c(false);
        }
    }
}
