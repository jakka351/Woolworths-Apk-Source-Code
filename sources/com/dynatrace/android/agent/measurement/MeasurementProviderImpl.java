package com.dynatrace.android.agent.measurement;

import com.dynatrace.android.agent.TimeLineProvider;
import com.dynatrace.android.agent.util.Utility;

/* loaded from: classes.dex */
public class MeasurementProviderImpl implements MeasurementProvider {

    /* renamed from: a, reason: collision with root package name */
    public final TimeLineProvider f14129a;

    public MeasurementProviderImpl(TimeLineProvider timeLineProvider) {
        this.f14129a = timeLineProvider;
    }

    public final MeasurementPoint a() {
        return new MeasurementPoint(this.f14129a.a(), Utility.b.getAndIncrement());
    }
}
