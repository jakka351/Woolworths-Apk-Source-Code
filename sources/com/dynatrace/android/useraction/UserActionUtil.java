package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.Global;
import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.measurement.MeasurementPoint;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public final class UserActionUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14183a;

    static {
        boolean z = Global.f14077a;
        f14183a = "dtxUserActionSupplier";
    }

    public static DTXAutoAction a(MeasurementPoint measurementPoint, String str) {
        DTXAutoAction dTXAutoActionW = DTXAutoAction.J;
        if (dTXAutoActionW != null && dTXAutoActionW.t >= 9) {
            if (Global.f14077a) {
                Utility.h(f14183a, "Maximum depth of actions reached (10). Do not attach lifecycle action to user action '" + dTXAutoActionW.k + "'");
            }
            dTXAutoActionW = null;
        }
        if (dTXAutoActionW == null) {
            dTXAutoActionW = DTXAutoAction.w(str, Session.b(measurementPoint.f14128a, false), AdkSettings.l.c);
            dTXAutoActionW.b = measurementPoint.f14128a - dTXAutoActionW.h.f14113a;
            dTXAutoActionW.g = measurementPoint.b;
        }
        dTXAutoActionW.u();
        dTXAutoActionW.h.k(TimeLineProvider.b.a());
        return dTXAutoActionW;
    }
}
