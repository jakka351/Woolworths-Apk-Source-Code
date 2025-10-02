package com.dynatrace.android.lifecycle.action;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.event.LifecycleEvent;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;
import java.lang.Enum;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public interface LifecycleAction<T extends Enum<T>> {
    AtomicBoolean a();

    MeasurementPoint b();

    void c(LifecycleEvent lifecycleEvent);

    LifecyclePlaceholderSegment d();

    HashMap e();

    void f(MeasurementPoint measurementPoint);

    MeasurementPoint g();

    String getName();

    UserAction h();
}
