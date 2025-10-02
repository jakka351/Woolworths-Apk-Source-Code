package com.dynatrace.android.lifecycle.appstart;

import android.app.Application;
import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.Core;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Dynatrace;
import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.events.lifecycle.AppStartActionObserverImpl;
import com.dynatrace.android.agent.events.lifecycle.AppStartSegment;
import com.dynatrace.android.agent.events.lifecycle.AppStartSegmentFactory;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.measurement.MeasurementProviderImpl;
import com.dynatrace.android.agent.util.Utility;
import com.dynatrace.android.lifecycle.SimpleClassNameGenerator;
import com.dynatrace.android.lifecycle.appstart.AppStartAction;
import com.dynatrace.android.useraction.AppStartAggregatorImpl;
import com.dynatrace.android.useraction.AppStartPlaceholderSegment;
import com.dynatrace.android.useraction.DTXAutoActionWrapper;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class AppStartController {
    public static final String h;

    /* renamed from: a, reason: collision with root package name */
    public final MeasurementProviderImpl f14167a;
    public final AppStartAggregatorImpl b;
    public final AppStartActionObserverImpl c;
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final ActivityStateListener e;
    public final Application f;
    public AppStartAction.Builder g;

    static {
        boolean z = Global.f14077a;
        h = "dtxAppStartController";
    }

    public AppStartController(MeasurementProviderImpl measurementProviderImpl, AppStartAggregatorImpl appStartAggregatorImpl, AppStartActionObserverImpl appStartActionObserverImpl, Application application) {
        this.f14167a = measurementProviderImpl;
        this.b = appStartAggregatorImpl;
        this.c = appStartActionObserverImpl;
        this.f = application;
        this.e = new ActivityStateListener(this, measurementProviderImpl);
    }

    public final void a(MeasurementPoint measurementPoint, String str) {
        DTXAutoAction dTXAutoAction;
        if (this.d.compareAndSet(false, true)) {
            AppStartAction.Builder builder = this.g;
            builder.c = measurementPoint;
            builder.f14166a = str;
            AppStartAction appStartAction = new AppStartAction(builder);
            if (Global.f14077a) {
                Utility.h(h, "AppStart action completed: " + appStartAction);
            }
            AppStartActionObserverImpl appStartActionObserverImpl = this.c;
            DTXAutoActionWrapper dTXAutoActionWrapper = appStartAction.c;
            if (dTXAutoActionWrapper != null && !dTXAutoActionWrapper.f14182a.e) {
                if (!AdkSettings.l.f.h && (dTXAutoAction = DTXAutoAction.J) != null) {
                    dTXAutoAction.u();
                }
                if (Dynatrace.a()) {
                    AppStartSegmentFactory appStartSegmentFactory = appStartActionObserverImpl.f14119a;
                    DTXAutoAction dTXAutoAction2 = dTXAutoActionWrapper.f14182a;
                    Session session = dTXAutoAction2.h;
                    int i = dTXAutoAction2.i;
                    appStartSegmentFactory.getClass();
                    if (Global.f14077a) {
                        Utility.h(AppStartSegmentFactory.f14121a, "captured AppStart action: " + appStartAction);
                    }
                    long j = session.f14113a;
                    MeasurementPoint measurementPoint2 = appStartAction.b;
                    long j2 = measurementPoint2.f14128a;
                    MeasurementPoint measurementPoint3 = new MeasurementPoint(j2 - j, measurementPoint2.b);
                    String str2 = appStartAction.f14165a;
                    String strA = str2 != null ? new SimpleClassNameGenerator().a(str2) : null;
                    AppStartSegment.Builder builder2 = new AppStartSegment.Builder();
                    builder2.f14120a = strA;
                    builder2.b = session;
                    builder2.c = i;
                    DTXAutoActionWrapper dTXAutoActionWrapper2 = appStartAction.c;
                    builder2.d = dTXAutoActionWrapper2 != null ? dTXAutoActionWrapper2.f14182a.m : 0L;
                    builder2.e = EventType.m;
                    builder2.f = measurementPoint3;
                    MeasurementPoint measurementPoint4 = appStartAction.d;
                    builder2.g = measurementPoint4 != null ? new MeasurementPoint(measurementPoint4.f14128a - j2, measurementPoint4.b) : null;
                    builder2.h = true;
                    Core.f(new AppStartSegment(builder2), 15);
                }
                AppStartPlaceholderSegment appStartPlaceholderSegment = appStartAction.e;
                Core.j.e(appStartPlaceholderSegment);
                appStartPlaceholderSegment.q(true);
                dTXAutoActionWrapper.c();
            } else if (Global.f14077a) {
                Utility.h(AppStartActionObserverImpl.b, "Parent action is not available anymore, discard action '" + appStartAction.f14165a + "'");
            }
            this.f.unregisterActivityLifecycleCallbacks(this.e);
        }
    }
}
