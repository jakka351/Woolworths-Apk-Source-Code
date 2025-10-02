package me.oriient.positioningengine.support;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.services.sensorsManager.support.SupportSensorsManager;

/* loaded from: classes8.dex */
public final class c0 extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c0 f26519a = new c0();

    public c0() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SupportSensorsManager.SensorIssuesCounter sensorIssuesCounter = (SupportSensorsManager.SensorIssuesCounter) obj;
        return Integer.valueOf(sensorIssuesCounter != null ? sensorIssuesCounter.getNumZeros() : 0);
    }
}
