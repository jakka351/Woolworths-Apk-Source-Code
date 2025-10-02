package me.oriient.positioningengine.support;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes8.dex */
public final class f0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final f0 f26552a = new f0();

    public f0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SupportSensorsManager.SensorIssuesCounter sensorIssuesCounter = (SupportSensorsManager.SensorIssuesCounter) obj;
        return Integer.valueOf(sensorIssuesCounter != null ? sensorIssuesCounter.getNumClockCorrections() : 0);
    }
}
