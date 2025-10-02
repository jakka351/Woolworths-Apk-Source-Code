package com.dynatrace.android.lifecycle.action;

import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.lifecycle.event.LifecycleEvent;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;
import java.lang.Enum;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class LifecycleActionImpl<T extends Enum<T>> implements LifecycleAction<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f14159a;
    public final MeasurementPoint b;
    public final DTXAutoActionWrapper c;
    public final LifecyclePlaceholderSegment d;
    public MeasurementPoint g;
    public final HashMap f = new HashMap();
    public final AtomicBoolean e = new AtomicBoolean(false);

    public static class ImmutableData {

        /* renamed from: a, reason: collision with root package name */
        public String f14160a;
        public MeasurementPoint b;
        public DTXAutoActionWrapper c;
        public LifecyclePlaceholderSegment d;
    }

    public LifecycleActionImpl(ImmutableData immutableData) {
        this.f14159a = immutableData.f14160a;
        this.b = immutableData.b;
        this.c = immutableData.c;
        this.d = immutableData.d;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final AtomicBoolean a() {
        return this.e;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final MeasurementPoint b() {
        return this.b;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final void c(LifecycleEvent lifecycleEvent) {
        this.f.put(lifecycleEvent.f14171a, new MeasurementPoint(lifecycleEvent.b, lifecycleEvent.c));
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final LifecyclePlaceholderSegment d() {
        return this.d;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final HashMap e() {
        return this.f;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final void f(MeasurementPoint measurementPoint) {
        this.g = measurementPoint;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final MeasurementPoint g() {
        return this.g;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final String getName() {
        return this.f14159a;
    }

    @Override // com.dynatrace.android.lifecycle.action.LifecycleAction
    public final UserAction h() {
        return this.c;
    }

    public final String toString() {
        return "LifecycleActionImpl{name='" + this.f14159a + "', startPoint=" + this.b + ", endPoint=" + this.g + ", parentAction=" + this.c + ", lifecycleEvents=" + this.f + '}';
    }
}
