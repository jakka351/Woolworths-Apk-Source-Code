package me.oriient.internal.services.remoteLog.di;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.di.DependencyInjectionImpl;
import me.oriient.internal.infra.networkManager.NetworkManager;
import me.oriient.internal.infra.powerManager.PowerManager;
import me.oriient.internal.infra.rest.RestService;
import me.oriient.internal.infra.scheduler.Scheduler;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.internal.infra.utils.core.time.TimeProvider;
import me.oriient.internal.services.remoteLog.database.DatabaseService;

/* loaded from: classes7.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static DependencyInjectionImpl f25535a;

    public static final synchronized void a(Context context) {
        try {
            Intrinsics.h(context, "context");
            if (f25535a == null) {
                DependencyInjectionImpl dependencyInjectionImpl = new DependencyInjectionImpl(null, false, 3, null);
                f25535a = dependencyInjectionImpl;
                ReflectionFactory reflectionFactory = Reflection.f24268a;
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl, reflectionFactory.b(CoroutineContextProvider.class), null, a.f25527a, 2, null);
                DependencyInjectionImpl dependencyInjectionImpl2 = f25535a;
                if (dependencyInjectionImpl2 == null) {
                    Intrinsics.p("di");
                    throw null;
                }
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl2, reflectionFactory.b(RestService.class), null, b.f25528a, 2, null);
                DependencyInjectionImpl dependencyInjectionImpl3 = f25535a;
                if (dependencyInjectionImpl3 == null) {
                    Intrinsics.p("di");
                    throw null;
                }
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl3, reflectionFactory.b(NetworkManager.class), null, new c(context), 2, null);
                DependencyInjectionImpl dependencyInjectionImpl4 = f25535a;
                if (dependencyInjectionImpl4 == null) {
                    Intrinsics.p("di");
                    throw null;
                }
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl4, reflectionFactory.b(Scheduler.class), null, new d(context), 2, null);
                DependencyInjectionImpl dependencyInjectionImpl5 = f25535a;
                if (dependencyInjectionImpl5 == null) {
                    Intrinsics.p("di");
                    throw null;
                }
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl5, reflectionFactory.b(PowerManager.class), null, new e(context), 2, null);
                DependencyInjectionImpl dependencyInjectionImpl6 = f25535a;
                if (dependencyInjectionImpl6 == null) {
                    Intrinsics.p("di");
                    throw null;
                }
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl6, reflectionFactory.b(TimeProvider.class), null, f.f25532a, 2, null);
                DependencyInjectionImpl dependencyInjectionImpl7 = f25535a;
                if (dependencyInjectionImpl7 == null) {
                    Intrinsics.p("di");
                    throw null;
                }
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl7, reflectionFactory.b(DatabaseService.class), null, new g(context), 2, null);
                DependencyInjectionImpl dependencyInjectionImpl8 = f25535a;
                if (dependencyInjectionImpl8 == null) {
                    Intrinsics.p("di");
                    throw null;
                }
                DependencyInjection.DefaultImpls.registerSingleton$default(dependencyInjectionImpl8, reflectionFactory.b(me.oriient.internal.services.remoteLog.e.class), null, h.f25534a, 2, null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
