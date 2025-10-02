package com.medallia.digital.mobilesdk;

import org.json.JSONObject;

/* loaded from: classes.dex */
class EvaluationResult implements x0 {
    private String engagementId;
    private MDEngagementType engagementType;
    private Long nextEvaluationTime;

    public EvaluationResult(String str, Long l, MDEngagementType mDEngagementType) {
        this.engagementId = str;
        this.nextEvaluationTime = l;
        this.engagementType = mDEngagementType;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDEngagementType getEngagementType() {
        return this.engagementType;
    }

    public Long getNextEvaluationTime() {
        return this.nextEvaluationTime;
    }

    @Override // com.medallia.digital.mobilesdk.x0
    public String toJsonString() {
        try {
            StringBuilder sb = new StringBuilder("{\"engagementId\":");
            sb.append(l3.c(this.engagementId));
            sb.append(",\"nextEvaluationTime\":");
            sb.append(this.nextEvaluationTime);
            sb.append(",\"engagementType\":");
            MDEngagementType mDEngagementType = this.engagementType;
            sb.append(l3.c(mDEngagementType != null ? mDEngagementType.toString() : null));
            sb.append("}");
            return sb.toString();
        } catch (Exception e) {
            a4.c(e.getMessage());
            return "";
        }
    }

    public EvaluationResult(JSONObject jSONObject) {
        try {
            if (jSONObject.has("engagementId") && !jSONObject.isNull("engagementId")) {
                this.engagementId = jSONObject.getString("engagementId");
            }
            if (jSONObject.has("nextEvaluationTime") && !jSONObject.isNull("nextEvaluationTime")) {
                this.nextEvaluationTime = Long.valueOf(jSONObject.getLong("nextEvaluationTime"));
            }
            if (!jSONObject.has("engagementType") || jSONObject.isNull("engagementType")) {
                return;
            }
            this.engagementType = MDEngagementType.fromString(jSONObject.getString("engagementType"));
        } catch (Exception e) {
            a4.c(e.getMessage());
        }
    }
}
