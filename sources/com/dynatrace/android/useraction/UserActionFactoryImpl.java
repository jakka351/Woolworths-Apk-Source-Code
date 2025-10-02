package com.dynatrace.android.useraction;

import com.dynatrace.android.agent.AdkSettings;
import com.dynatrace.android.agent.DTXAutoAction;
import com.dynatrace.android.agent.data.Session;
import com.dynatrace.android.agent.measurement.MeasurementPoint;

/* loaded from: classes.dex */
public class UserActionFactoryImpl implements UserActionFactory {
    public final DTXAutoActionWrapper a(MeasurementPoint measurementPoint, String str) {
        String str2 = UserActionUtil.f14183a;
        DTXAutoAction dTXAutoActionW = DTXAutoAction.w(str, Session.b(measurementPoint.f14128a, false), AdkSettings.l.c);
        dTXAutoActionW.b = measurementPoint.f14128a - dTXAutoActionW.h.f14113a;
        dTXAutoActionW.g = measurementPoint.b;
        return new DTXAutoActionWrapper(dTXAutoActionW);
    }
}
