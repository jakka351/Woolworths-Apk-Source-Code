package com.google.firebase.perf.transport;

import com.google.firebase.perf.v1.ApplicationProcessState;
import com.google.firebase.perf.v1.PerfMetric;

/* loaded from: classes6.dex */
final class PendingPerfEvent {

    /* renamed from: a, reason: collision with root package name */
    public final PerfMetric.Builder f15717a;
    public final ApplicationProcessState b;

    public PendingPerfEvent(PerfMetric.Builder builder, ApplicationProcessState applicationProcessState) {
        this.f15717a = builder;
        this.b = applicationProcessState;
    }
}
