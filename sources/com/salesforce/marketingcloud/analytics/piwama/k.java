package com.salesforce.marketingcloud.analytics.piwama;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.salesforce.marketingcloud.MarketingCloudConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class k extends j {
    public k(@NonNull MarketingCloudConfig marketingCloudConfig, @NonNull com.salesforce.marketingcloud.storage.j jVar) {
        super(marketingCloudConfig, jVar);
    }

    @Override // com.salesforce.marketingcloud.analytics.piwama.j
    @NonNull
    public JSONObject a(@NonNull JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("app_name", this.b.getAppPackageName());
            jSONObject3.put("app_id", this.b.applicationId());
            String strB = this.f16850a.c().b(com.salesforce.marketingcloud.storage.c.g, null);
            if (!TextUtils.isEmpty(strB)) {
                jSONObject.put("user_id", strB);
            }
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
        return new Object[]{"?session_id=" + this.f16850a.c().b(com.salesforce.marketingcloud.storage.c.f, "")};
    }
}
