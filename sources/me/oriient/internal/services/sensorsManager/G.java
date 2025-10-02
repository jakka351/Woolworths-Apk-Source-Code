package me.oriient.internal.services.sensorsManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;

/* loaded from: classes7.dex */
public final class G extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final G f25554a = new G();

    public G() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SensorFreezeMonitorImpl((CoroutineContextProvider) di.get(reflectionFactory.b(CoroutineContextProvider.class)), (Logger) InternalDiKt.getDi().get(reflectionFactory.b(Logger.class)), (TimeProvider) InternalDiKt.getDi().get(reflectionFactory.b(TimeProvider.class)));
    }
}
