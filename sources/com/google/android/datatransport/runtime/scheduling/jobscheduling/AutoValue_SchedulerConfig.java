package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.time.Clock;
import java.util.Map;

/* loaded from: classes.dex */
final class AutoValue_SchedulerConfig extends SchedulerConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Clock f14471a;
    public final Map b;

    public AutoValue_SchedulerConfig(Clock clock, Map map) {
        if (clock == null) {
            throw new NullPointerException("Null clock");
        }
        this.f14471a = clock;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.b = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Clock a() {
        return this.f14471a;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    public final Map d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SchedulerConfig)) {
            return false;
        }
        SchedulerConfig schedulerConfig = (SchedulerConfig) obj;
        return this.f14471a.equals(schedulerConfig.a()) && this.b.equals(schedulerConfig.d());
    }

    public final int hashCode() {
        return ((this.f14471a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f14471a + ", values=" + this.b + "}";
    }
}
