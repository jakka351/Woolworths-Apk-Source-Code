package me.oriient.internal.services.remoteLog.di;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.rest.RestServiceImpl;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.remoteLog.EmptyRestRequestReporter;

/* loaded from: classes7.dex */
public final class b extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25528a = new b();

    public b() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        DependencyInjectionImpl dependencyInjectionImpl = i.f25535a;
        if (dependencyInjectionImpl == null) {
            Intrinsics.p("di");
            throw null;
        }
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        CoroutineContextProvider coroutineContextProvider = (CoroutineContextProvider) dependencyInjectionImpl.get(reflectionFactory.b(CoroutineContextProvider.class));
        EmptyRestRequestReporter emptyRestRequestReporter = new EmptyRestRequestReporter();
        DependencyInjectionImpl dependencyInjectionImpl2 = i.f25535a;
        if (dependencyInjectionImpl2 != null) {
            return new RestServiceImpl(coroutineContextProvider, emptyRestRequestReporter, (TimeProvider) dependencyInjectionImpl2.get(reflectionFactory.b(TimeProvider.class)), null, 8, null);
        }
        Intrinsics.p("di");
        throw null;
    }
}
