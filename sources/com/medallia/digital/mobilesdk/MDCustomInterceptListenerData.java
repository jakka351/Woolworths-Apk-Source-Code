package com.medallia.digital.mobilesdk;

/* loaded from: classes6.dex */
public class MDCustomInterceptListenerData {
    private MDCustomInterceptPayload customInterceptPayload;
    private String engagementId;
    private MDEngagementType engagementType;
    private long formPreloadTimestamp;
    private long targetingEvaluationTimestamp;

    public MDCustomInterceptListenerData(long j, long j2, String str, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
        updateParams(j, j2, str, mDEngagementType, mDCustomInterceptPayload);
    }

    private void updateParams(long j, long j2, String str, MDEngagementType mDEngagementType, MDCustomInterceptPayload mDCustomInterceptPayload) {
        this.formPreloadTimestamp = j;
        this.targetingEvaluationTimestamp = j2;
        this.engagementId = str;
        this.engagementType = mDEngagementType;
        this.customInterceptPayload = mDCustomInterceptPayload;
    }

    public MDCustomInterceptPayload getCustomInterceptPayload() {
        return this.customInterceptPayload;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public MDEngagementType getEngagementType() {
        return this.engagementType;
    }

    public long getFormPreloadTimestamp() {
        return this.formPreloadTimestamp;
    }

    public long getTargetingEvaluationTimestamp() {
        return this.targetingEvaluationTimestamp;
    }
}
