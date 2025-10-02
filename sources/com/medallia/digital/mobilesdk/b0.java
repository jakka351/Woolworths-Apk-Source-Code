package com.medallia.digital.mobilesdk;

/* loaded from: classes.dex */
abstract class b0 extends e0 {

    public enum a {
        UserJourneyData,
        FormData,
        Template,
        Resource,
        Feedback,
        AnalyticsData,
        MediaFeedback,
        WorkerManager,
        LocalNotification,
        QuarantineRule
    }

    public abstract a getDataTableObjectType();
}
