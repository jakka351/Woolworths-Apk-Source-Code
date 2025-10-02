package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class ConfigurationUUID {
    private String ocqUuid;
    private String url;
    private String uuid;

    public ConfigurationUUID(JSONObject jSONObject) {
        try {
            if (jSONObject.has("url")) {
                this.url = jSONObject.getString("url");
            }
            if (jSONObject.has("uuid")) {
                this.uuid = jSONObject.getString("uuid");
            }
            if (jSONObject.has("ocqUUID")) {
                this.ocqUuid = jSONObject.getString("ocqUUID");
            }
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }

    public String getOcqUuid() {
        return this.ocqUuid;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String toJsonString() {
        try {
            return "{\"url\":" + l3.c(this.url) + ",\"uuid\":" + l3.c(this.uuid) + ",\"ocqUUID\":" + l3.c(this.ocqUuid) + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }
}
