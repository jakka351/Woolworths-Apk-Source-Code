package me.oriient.internal.services.sensorsManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSender;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesMonitorImpl;

/* loaded from: classes7.dex */
public final class I extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final I f25556a = new I();

    public I() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SensorIssuesMonitorImpl((Logger) di.get(reflectionFactory.b(Logger.class)), (SensorIssuesELogSender) InternalDiKt.getDi().get(reflectionFactory.b(SensorIssuesELogSender.class)), (SensorFreezeMonitor) InternalDiKt.getDi().get(reflectionFactory.b(SensorFreezeMonitor.class)));
    }
}
