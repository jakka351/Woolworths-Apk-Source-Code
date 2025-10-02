package com.medallia.digital.mobilesdk;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import org.json.JSONObject;

/* loaded from: classes.dex */
abstract class EngagementContract extends e0 {
    private InviteData inviteData;
    private String name;
    private JSONObject triggerData;

    public EngagementContract() {
    }

    public InviteData getInviteData() {
        return this.inviteData;
    }

    public String getName() {
        return this.name;
    }

    public JSONObject getTriggerData() {
        return this.triggerData;
    }

    public EngagementContract(String str, InviteData inviteData, JSONObject jSONObject) {
        this.name = str;
        this.inviteData = inviteData;
        this.triggerData = jSONObject;
    }

    public EngagementContract(JSONObject jSONObject) {
        try {
            if (jSONObject.has(AppMeasurementSdk.ConditionalUserProperty.NAME) && !jSONObject.isNull(AppMeasurementSdk.ConditionalUserProperty.NAME)) {
                this.name = jSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            }
            if (jSONObject.has("inviteData") && !jSONObject.isNull("inviteData")) {
                this.inviteData = new InviteData(jSONObject.getJSONObject("inviteData"));
            }
            if (!jSONObject.has("triggerData") || jSONObject.isNull("triggerData")) {
                return;
            }
            this.triggerData = jSONObject.getJSONObject("triggerData");
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }
}
