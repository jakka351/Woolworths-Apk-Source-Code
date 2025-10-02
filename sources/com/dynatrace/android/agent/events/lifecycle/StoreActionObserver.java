package com.dynatrace.android.agent.events.lifecycle;

import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.lifecycle.DisplaySegment;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.SimpleClassNameGenerator;
import com.dynatrace.android.lifecycle.action.LifecycleAction;
import com.dynatrace.android.lifecycle.action.LifecycleActionObserver;
import com.dynatrace.android.lifecycle.event.ActivityEventType;
import com.dynatrace.android.useraction.LifecyclePlaceholderSegment;
import com.dynatrace.android.useraction.UserAction;
import java.util.HashMap;

/* loaded from: classes.dex */
public class StoreActionObserver implements LifecycleActionObserver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14125a;

    static {
        boolean z = Global.f14077a;
        f14125a = "dtxStoreActionObserver";
    }

    public final void a(LifecycleAction lifecycleAction) {
        DisplaySegment displaySegment;
        UserAction userActionH = lifecycleAction.h();
        if (userActionH == null || userActionH.a()) {
            if (Global.f14077a) {
                Utility.h(f14125a, "Parent action is not available anymore, discard lifecycle action '" + lifecycleAction.getName() + "'");
                return;
            }
            return;
        }
        if (Dynatrace.a()) {
            Session sessionD = userActionH.d();
            int iE = userActionH.e();
            synchronized (lifecycleAction) {
                try {
                    if (Global.f14077a) {
                        Utility.h(DisplaySegmentFactory.f14123a, "captured lifecycle action: " + lifecycleAction);
                    }
                    HashMap mapE = lifecycleAction.e();
                    long j = sessionD.f14113a;
                    long j2 = lifecycleAction.b().f14128a;
                    MeasurementPoint measurementPointA = DisplaySegmentFactory.a(j, lifecycleAction.b());
                    SimpleClassNameGenerator simpleClassNameGenerator = new SimpleClassNameGenerator();
                    DisplaySegment.Builder builder = new DisplaySegment.Builder();
                    builder.f14122a = simpleClassNameGenerator.a(lifecycleAction.getName());
                    builder.b = sessionD;
                    builder.c = iE;
                    builder.d = lifecycleAction.h() != null ? lifecycleAction.h().b() : 0L;
                    ActivityEventType activityEventType = ActivityEventType.d;
                    builder.e = mapE.containsKey(activityEventType) ? EventType.n : EventType.o;
                    builder.f = measurementPointA;
                    builder.g = DisplaySegmentFactory.a(j2, (MeasurementPoint) mapE.get(activityEventType));
                    builder.h = DisplaySegmentFactory.a(j2, (MeasurementPoint) mapE.get(ActivityEventType.e));
                    builder.i = DisplaySegmentFactory.a(j2, (MeasurementPoint) mapE.get(ActivityEventType.f));
                    builder.j = DisplaySegmentFactory.a(j2, lifecycleAction.g());
                    builder.k = true;
                    displaySegment = new DisplaySegment(builder);
                } catch (Throwable th) {
                    throw th;
                }
            }
            Core.f(displaySegment, 15);
        }
        LifecyclePlaceholderSegment lifecyclePlaceholderSegmentD = lifecycleAction.d();
        Core.j.e(lifecyclePlaceholderSegmentD);
        lifecyclePlaceholderSegmentD.q(true);
    }
}
