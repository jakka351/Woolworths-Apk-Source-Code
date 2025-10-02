package com.adobe.mobile;

/* loaded from: classes4.dex */
final class AnalyticsTrackBeacon {
    public static void a() {
        TargetWorker.m("a.beacon.uuid");
        TargetWorker.m("a.beacon.major");
        TargetWorker.m("a.beacon.minor");
        TargetWorker.m("a.beacon.prox");
        Lifecycle.n("a.beacon.uuid");
        Lifecycle.n("a.beacon.major");
        Lifecycle.n("a.beacon.minor");
        Lifecycle.n("a.beacon.prox");
    }
}
