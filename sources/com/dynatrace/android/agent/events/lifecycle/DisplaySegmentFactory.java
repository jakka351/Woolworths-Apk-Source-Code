package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.SegmentFactory;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.event.ActivityEventType;

/* loaded from: classes.dex */
public class DisplaySegmentFactory implements SegmentFactory<LifecycleAction<ActivityEventType>, DisplaySegment> {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14123a;

    static {
        boolean z = Global.f14077a;
        f14123a = "dtxDisplaySegmentFactory";
    }

    public static MeasurementPoint a(long j, MeasurementPoint measurementPoint) {
        if (measurementPoint == null) {
            return null;
        }
        return new MeasurementPoint(measurementPoint.f14128a - j, measurementPoint.b);
    }
}
