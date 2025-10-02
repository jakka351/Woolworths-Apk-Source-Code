package com.medallia.digital.mobilesdk;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
class KillStatus {
    private Boolean isKilled;
    private Long restorePollingInterval;
    private Boolean shouldCheckRestoreOnOsChange;

    public KillStatus() {
    }

    public Long getRestorePollingInterval() {
        return this.restorePollingInterval;
    }

    public Boolean getShouldCheckRestoreOnOsChange() {
        return this.shouldCheckRestoreOnOsChange;
    }

    public Boolean isKilled() {
        return this.isKilled;
    }

    public String toJsonString() {
        try {
            return "{\"isKilled\":" + this.isKilled + ",\"restorePollingInterval\":" + this.restorePollingInterval + ",\"shouldCheckRestoreOnOsChange\":" + this.shouldCheckRestoreOnOsChange + "}";
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public KillStatus(Boolean bool, Long l, Boolean bool2) {
        this.isKilled = bool;
        this.restorePollingInterval = l;
        this.shouldCheckRestoreOnOsChange = bool2;
    }

    public KillStatus(JSONObject jSONObject) {
        try {
            if (jSONObject.has("isKilled") && !jSONObject.isNull("isKilled")) {
                this.isKilled = Boolean.valueOf(jSONObject.getBoolean("isKilled"));
            }
            if (jSONObject.has("restorePollingInterval") && !jSONObject.isNull("restorePollingInterval")) {
                this.restorePollingInterval = Long.valueOf(jSONObject.getLong("restorePollingInterval"));
            }
            if (!jSONObject.has("shouldCheckRestoreOnOsChange") || jSONObject.isNull("shouldCheckRestoreOnOsChange")) {
                return;
            }
            this.shouldCheckRestoreOnOsChange = Boolean.valueOf(jSONObject.getBoolean("shouldCheckRestoreOnOsChange"));
        } catch (JSONException e) {
            a4.c(e.getMessage());
        }
    }
}
