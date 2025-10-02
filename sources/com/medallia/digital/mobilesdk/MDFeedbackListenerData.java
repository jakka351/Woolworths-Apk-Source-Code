package com.medallia.digital.mobilesdk;

/* loaded from: classes6.dex */
public class MDFeedbackListenerData {
    private String engagementId;
    private String feedbackClientCorrelationId;
    private String feedbackPayload;
    private long timestamp;

    public MDFeedbackListenerData(String str, long j, String str2, String str3) {
        updateParams(str, j, str2, str3);
    }

    private void updateParams(String str, long j, String str2, String str3) {
        this.feedbackClientCorrelationId = str;
        this.timestamp = j;
        this.feedbackPayload = str2;
        this.engagementId = str3;
    }

    public String getEngagementId() {
        return this.engagementId;
    }

    public String getFeedbackClientCorrelationId() {
        return this.feedbackClientCorrelationId;
    }

    public String getFeedbackPayload() {
        return this.feedbackPayload;
    }

    public long getTimestamp() {
        return this.timestamp;
    }
}
