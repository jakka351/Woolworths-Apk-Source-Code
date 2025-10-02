package me.oriient.ipssdk.common.ofs;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.rest.RestRequestsReporter;
import me.oriient.internal.infra.rest.RestServiceImpl;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.auth.UnauthenticatedRestServiceImpl;
import me.oriient.ipssdk.base.di.DependencyInjectionKt;

/* renamed from: me.oriient.ipssdk.common.ofs.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1547e extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C1547e f25745a = new C1547e();

    public C1547e() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjection di = DependencyInjectionKt.getDi();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        RestServiceImpl restServiceImpl = new RestServiceImpl((CoroutineContextProvider) di.get(reflectionFactory.b(CoroutineContextProvider.class)), (RestRequestsReporter) DependencyInjectionKt.getDi().get(reflectionFactory.b(RestRequestsReporter.class)), (TimeProvider) DependencyInjectionKt.getDi().get(reflectionFactory.b(TimeProvider.class)), null, 8, null);
        restServiceImpl.setLogger((Logger) DependencyInjectionKt.getDi().get(reflectionFactory.b(Logger.class)));
        return new UnauthenticatedRestServiceImpl(restServiceImpl);
    }
}
