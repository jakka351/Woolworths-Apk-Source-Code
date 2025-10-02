package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class a extends j {
    private static final Object[] v = {""};

    public a(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar) {
        super(marketingCloudConfig, jVar);
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.j
    @NonNull
    public JSONObject a(@NonNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("api_key", "849f26e2-2df6-11e4-ab12-14109fdc48df");
            jSONObject2.put("app_id", this.b.applicationId());
            String strB = this.f16850a.c().b(com.salesforce.marketingcloud.storage.c.g, null);
            if (!TextUtils.isEmpty(strB)) {
                jSONObject2.put("user_id", strB);
            }
            String strB2 = this.f16850a.c().b(com.salesforce.marketingcloud.storage.c.f, null);
            if (!TextUtils.isEmpty(strB2)) {
                jSONObject2.put("session_id", strB2);
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", this.b.getAppPackageName());
            jSONObject3.put("user_info", jSONObject);
            jSONObject2.put("payload", jSONObject3);
            return jSONObject2;
        } catch (JSONException e) {
            com.salesforce.marketingcloud.g.b(i.m, e, "Failed to construct PiWama payload JSON Object.", new Object[0]);
            return new JSONObject();
        }
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.j
    @NonNull
    public Object[] b() {
        return v;
    }
}
