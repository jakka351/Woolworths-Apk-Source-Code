package com.dynatrace.android.lifecycle;

import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.events.lifecycle.FinishedActionObserver;
import com.dynatrace.android.agent.events.lifecycle.StoreActionObserver;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.action.LifecycleActionFactoryImpl;
import com.dynatrace.android.lifecycle.action.LifecycleActionImpl;
import com.dynatrace.android.lifecycle.callback.ComponentIdentity;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.lifecycle.event.LifecycleEvent;
import com.dynatrace.android.useraction.ActionAggregatorImpl;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;
import com.dynatrace.android.useraction.UserActionUtil;
import java.util.HashMap;

/* loaded from: classes.dex */
public class LifecycleController {
    public static final String f;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14158a = new HashMap();
    public final FinishedActionObserver b;
    public final StoreActionObserver c;
    public final MeasurementProviderImpl d;
    public final ActionAggregatorImpl e;

    static {
        boolean z = Global.f14077a;
        f = "dtxLifecycleController";
    }

    public LifecycleController(LifecycleActionFactoryImpl lifecycleActionFactoryImpl, FinishedActionObserver finishedActionObserver, StoreActionObserver storeActionObserver, MeasurementProviderImpl measurementProviderImpl, ActionAggregatorImpl actionAggregatorImpl) {
        this.b = finishedActionObserver;
        this.c = storeActionObserver;
        this.d = measurementProviderImpl;
        this.e = actionAggregatorImpl;
    }

    public final void a(ComponentIdentity componentIdentity, ActivityEventType activityEventType) {
        MeasurementPoint measurementPointA;
        LifecycleAction lifecycleActionImpl = (LifecycleAction) this.f14158a.get(componentIdentity);
        if (lifecycleActionImpl != null) {
            measurementPointA = this.d.a();
        } else {
            if (Global.f14077a) {
                Utility.h(f, "start activity monitoring for " + componentIdentity);
            }
            MeasurementPoint measurementPointA2 = this.d.a();
            MeasurementPoint measurementPointA3 = this.d.a();
            MeasurementPoint measurementPointA4 = this.d.a();
            DTXAutoAction dTXAutoActionA = UserActionUtil.a(measurementPointA2, this.e.f14180a.a(componentIdentity.f14170a));
            DTXAutoActionWrapper dTXAutoActionWrapper = new DTXAutoActionWrapper(dTXAutoActionA);
            String str = componentIdentity.f14170a;
            LifecycleActionImpl.ImmutableData immutableData = new LifecycleActionImpl.ImmutableData();
            immutableData.f14160a = str;
            immutableData.b = measurementPointA3;
            immutableData.c = dTXAutoActionWrapper;
            immutableData.d = new LifecyclePlaceholderSegment(str, EventType.f, dTXAutoActionA.m, dTXAutoActionA.h, dTXAutoActionA.i, false, dTXAutoActionA);
            lifecycleActionImpl = new LifecycleActionImpl(immutableData);
            LifecyclePlaceholderSegment lifecyclePlaceholderSegmentD = lifecycleActionImpl.d();
            lifecyclePlaceholderSegmentD.w = this;
            lifecyclePlaceholderSegmentD.x = lifecycleActionImpl;
            dTXAutoActionWrapper.f(lifecyclePlaceholderSegmentD);
            Core.j.a(lifecyclePlaceholderSegmentD);
            this.f14158a.put(componentIdentity, lifecycleActionImpl);
            measurementPointA = measurementPointA4;
        }
        LifecycleEvent lifecycleEvent = new LifecycleEvent(activityEventType, measurementPointA);
        synchronized (lifecycleActionImpl) {
            lifecycleActionImpl.c(lifecycleEvent);
        }
    }

    public final void b(ComponentIdentity componentIdentity) {
        LifecycleAction lifecycleAction = (LifecycleAction) this.f14158a.remove(componentIdentity);
        if (lifecycleAction == null) {
            return;
        }
        if (Global.f14077a) {
            Utility.h(f, "finish activity monitoring for " + componentIdentity);
        }
        if (lifecycleAction.a().compareAndSet(false, true)) {
            lifecycleAction.f(this.d.a());
            this.b.f14124a.a(lifecycleAction);
            UserAction userActionH = lifecycleAction.h();
            if (userActionH == null || userActionH.a()) {
                return;
            }
            userActionH.c();
        }
    }
}
