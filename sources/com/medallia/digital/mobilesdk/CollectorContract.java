package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class CollectorContract {
    private Boolean enabled;
    private Integer frequency;
    private Lifetime lifetime;

    public CollectorContract(Boolean bool, Integer num, Lifetime lifetime) {
        this.enabled = bool;
        this.frequency = num;
        this.lifetime = lifetime;
    }

    public Integer getFrequency() {
        return this.frequency;
    }

    public Lifetime getLifetime() {
        return this.lifetime;
    }

    public Boolean isEnabled() {
        return this.enabled;
    }

    public CollectorContract setEnabled(boolean z) {
        this.enabled = Boolean.valueOf(z);
        return this;
    }

    public String toJsonString() {
        String str;
        String str2;
        try {
            if (this.lifetime == null) {
                str = "null";
            } else {
                str = "\"" + this.lifetime + "\"";
            }
            if (this.frequency == null) {
                str2 = "";
            } else {
                str2 = ",\"frequency\":" + this.frequency;
            }
            return "{\"enabled\":" + this.enabled + str2 + ",\"lifetime\":" + str + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public CollectorContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has("enabled") && !jSONObject.isNull("enabled")) {
                this.enabled = Boolean.valueOf(jSONObject.getBoolean("enabled"));
            }
            if (jSONObject.has("frequency") && !jSONObject.isNull("frequency")) {
                this.frequency = Integer.valueOf(jSONObject.getInt("frequency"));
            }
            if (!jSONObject.has("lifetime") || jSONObject.isNull("lifetime")) {
                return;
            }
            this.lifetime = Lifetime.fromString(jSONObject.getString("lifetime"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
