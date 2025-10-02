package me.oriient.positioningengine.support.device_data;

import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.OriientApiProvider;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.services.elog.ELog;
import me.oriient.positioningengine.common.DiKt;
import me.oriient.positioningengine.support.engineManager.PositioningEngineCredentials;

/* loaded from: classes8.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26522a;
    public final Lazy b;

    public b() {
        DependencyInjection di = DiKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26522a = di.inject(reflectionFactory.b(ELog.class));
        this.b = DiKt.getDi().inject(reflectionFactory.b(CoroutineContextProvider.class));
    }

    public final DeviceDataRepositoryImpl a(PositioningEngineCredentials credentials, OriientApiProvider oriientApiProvider, double d) {
        Intrinsics.h(credentials, "credentials");
        Intrinsics.h(oriientApiProvider, "oriientApiProvider");
        return new DeviceDataRepositoryImpl(new DeviceDataRestImpl((long) (d * TimeUnit.SECONDS.toMillis(1L))), (ELog) this.f26522a.getD(), (CoroutineContextProvider) this.b.getD());
    }
}
