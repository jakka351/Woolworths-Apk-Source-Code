package com.dynatrace.android.lifecycle.event;

import YU.a;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import java.lang.Enum;

/* loaded from: classes.dex */
public class LifecycleEvent<T extends Enum<T>> {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityEventType f14171a;
    public final long b;
    public final int c;

    public LifecycleEvent(ActivityEventType activityEventType, MeasurementPoint measurementPoint) {
        this.f14171a = activityEventType;
        this.b = measurementPoint.f14128a;
        this.c = measurementPoint.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LifecycleEvent lifecycleEvent = (LifecycleEvent) obj;
        return this.b == lifecycleEvent.b && this.c == lifecycleEvent.c && this.f14171a == lifecycleEvent.f14171a;
    }

    public final int hashCode() {
        int iHashCode = this.f14171a.hashCode() * 31;
        long j = this.b;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LifecycleEvent{eventType=");
        sb.append(this.f14171a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", sequenceNumber=");
        return a.l(sb, this.c, '}');
    }
}
