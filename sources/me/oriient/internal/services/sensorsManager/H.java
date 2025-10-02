package me.oriient.internal.services.sensorsManager;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.di.InternalDiKt;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSenderImpl;

/* loaded from: classes7.dex */
public final class H extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final H f25555a = new H();

    public H() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = InternalDiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SensorIssuesELogSenderImpl((ELog) di.get(reflectionFactory.b(ELog.class)), (TimeProvider) InternalDiKt.getDi().get(reflectionFactory.b(TimeProvider.class)));
    }
}
