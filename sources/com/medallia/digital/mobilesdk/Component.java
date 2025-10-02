package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class Component {
    private String id;
    private boolean isCsat;
    private String role;
    private String type;
    private String uniqueName;
    private String value;

    public Component() {
    }

    public String getId() {
        return this.id;
    }

    public String getRole() {
        return this.role;
    }

    public String getType() {
        return this.type;
    }

    public String getUniqueName() {
        return this.uniqueName;
    }

    public String getValue() {
        return this.value;
    }

    public boolean isCsat() {
        return this.isCsat;
    }

    public void setCsat(boolean z) {
        this.isCsat = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setRole(String str) {
        this.role = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUniqueName(String str) {
        this.uniqueName = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public Component(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.id = str;
        this.uniqueName = str2;
        this.type = str3;
        this.value = str4;
        this.isCsat = z;
        this.role = str5;
    }

    public Component(JSONObject jSONObject) {
        try {
            if (jSONObject.has("id") && !jSONObject.isNull("id")) {
                this.id = jSONObject.getString("id");
            }
            if (jSONObject.has("uniqueName") && !jSONObject.isNull("uniqueName")) {
                this.uniqueName = jSONObject.getString("uniqueName");
            }
            if (jSONObject.has("type") && !jSONObject.isNull("type")) {
                this.type = jSONObject.getString("type");
            }
            if (jSONObject.has("value") && !jSONObject.isNull("value")) {
                this.value = jSONObject.getString("value");
            }
            if (jSONObject.has("isCsat") && !jSONObject.isNull("isCsat")) {
                this.isCsat = jSONObject.getBoolean("isCsat");
            }
            if (!jSONObject.has("role") || jSONObject.isNull("role")) {
                return;
            }
            this.role = jSONObject.getString("role");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
