package com.medallia.digital.mobilesdk;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
class AppRatingContract extends EngagementContract {
    private String appRatingId;
    private String appRatingLanguage;
    private String appRatingUrl;
    private String customParams;
    private boolean isAppRatingDirectApi;
    private boolean isDarkModeEnabled;

    public AppRatingContract(String str, InviteData inviteData, JSONObject jSONObject, String str2, String str3, String str4, String str5, boolean z, boolean z2) {
        super(str, inviteData, jSONObject);
        this.appRatingId = str2;
        this.appRatingUrl = str3;
        this.customParams = str4;
        this.appRatingLanguage = str5;
        this.isDarkModeEnabled = z;
        this.isAppRatingDirectApi = z2;
    }

    public String getAppRatingId() {
        return this.appRatingId;
    }

    public String getAppRatingLanguage() {
        return this.appRatingLanguage;
    }

    public String getAppRatingUrl() {
        return this.appRatingUrl;
    }

    public boolean isAppRatingDirectApi() {
        return this.isAppRatingDirectApi;
    }

    public boolean isDarkModeEnabled() {
        return this.isDarkModeEnabled;
    }

    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"appRatingId\":");
            sb.append(l3.c(this.appRatingId));
            sb.append(",\"inviteData\":");
            sb.append(getInviteData() != null ? getInviteData().toJsonString() : "null");
            sb.append(",\"triggerData\":");
            sb.append(getTriggerData() != null ? getTriggerData().toString() : "null");
            sb.append(",\"appRatingUrl\":");
            sb.append(l3.c(this.appRatingUrl));
            sb.append(",\"customParams\":");
            sb.append(l3.c(this.customParams));
            sb.append(",\"appRatingLanguage\":");
            sb.append(l3.c(this.appRatingLanguage));
            sb.append(",\"isDarkModeEnabled\":");
            sb.append(this.isDarkModeEnabled);
            sb.append(",\"isAppRatingDirectApi\":");
            sb.append(this.isAppRatingDirectApi);
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public AppRatingContract(JSONObject jSONObject) {
        String strB;
        super(jSONObject);
        try {
            if (jSONObject.has("appRatingId") && !jSONObject.isNull("appRatingId")) {
                this.appRatingId = jSONObject.getString("appRatingId");
            }
            if (jSONObject.has("appRatingUrl") && !jSONObject.isNull("appRatingUrl")) {
                this.appRatingUrl = jSONObject.getString("appRatingUrl");
            }
            if (jSONObject.has("customParams")) {
                if (jSONObject.get("customParams") instanceof JSONArray) {
                    strB = jSONObject.getJSONArray("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof JSONObject) {
                    strB = jSONObject.getJSONObject("customParams").toString();
                } else if (jSONObject.get("customParams") instanceof String) {
                    strB = l3.b(jSONObject.getString("customParams"));
                }
                this.customParams = strB;
            }
            if (jSONObject.has("appRatingLanguage") && !jSONObject.isNull("appRatingLanguage")) {
                this.appRatingLanguage = jSONObject.getString("appRatingLanguage");
            }
            if (jSONObject.has("isDarkModeEnabled") && !jSONObject.isNull("isDarkModeEnabled")) {
                this.isDarkModeEnabled = jSONObject.getBoolean("isDarkModeEnabled");
            }
            if (!jSONObject.has("isAppRatingDirectApi") || jSONObject.isNull("isAppRatingDirectApi")) {
                return;
            }
            this.isAppRatingDirectApi = jSONObject.getBoolean("isAppRatingDirectApi");
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
