package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class TargetRuleEngineContract extends e0 {
    private String url;
    private String version;

    public TargetRuleEngineContract(String str, String str2) {
        this.url = str;
        this.version = str2;
    }

    public String getUrl() {
        return this.url;
    }

    public String getVersion() {
        return this.version;
    }

    public String toJsonString() {
        try {
            return "{\"url\":" + l3.c(this.url) + ",\"version\":" + l3.c(this.version) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public TargetRuleEngineContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("url") && !jSONObject.isNull("url")) {
                this.url = jSONObject.getString("url");
            }
            if (!jSONObject.has("version") || jSONObject.isNull("version")) {
                return;
            }
            this.version = jSONObject.getString("version");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
