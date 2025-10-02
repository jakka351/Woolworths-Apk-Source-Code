package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.services.sensorsManager.ForegroundServiceMonitor;
import me.oriient.internal.services.sensorsManager.SystemSensorManager;
import me.oriient.internal.services.sensorsManager.support.SensorsDataProviderFactoryImpl;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* loaded from: classes2.dex */
public final class C extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C f25717a = new C();

    public C() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SensorsDataProviderFactoryImpl((ForegroundServiceMonitor) di.get(reflectionFactory.b(ForegroundServiceMonitor.class)), (SystemSensorManager) DependencyInjectionKt.getDi().get(reflectionFactory.b(SystemSensorManager.class)));
    }
}
