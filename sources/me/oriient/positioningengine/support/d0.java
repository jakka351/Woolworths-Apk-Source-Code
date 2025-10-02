package me.oriient.positioningengine.support;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes8.dex */
public final class d0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final d0 f26521a = new d0();

    public d0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SupportSensorsManager.SensorIssuesCounter sensorIssuesCounter = (SupportSensorsManager.SensorIssuesCounter) obj;
        return Integer.valueOf(sensorIssuesCounter != null ? sensorIssuesCounter.getNumNan() : 0);
    }
}
