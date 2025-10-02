package me.oriient.ipssdk.realtime.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.internal.services.sensorsManager.support.SensorIssuesELogSenderImpl;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.realtime.ofs.b4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1623b4 extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1623b4 f26050a = new C1623b4();

    public C1623b4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        return new SensorIssuesELogSenderImpl((ELog) di.get(reflectionFactory.b(ELog.class)), (TimeProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(TimeProvider.class)));
    }
}
