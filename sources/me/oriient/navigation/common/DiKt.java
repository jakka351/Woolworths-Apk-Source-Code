package me.oriient.navigation.common;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.navigation.ondevice.InterfaceC1785a;
import me.oriient.navigation.ondevice.navgraph.C1797c;
import me.oriient.navigation.ondevice.navgraph.InterfaceC1798d;
import me.oriient.navigation.ondevice.navgraph.NavGraphPriorityLoader;
import me.oriient.navigation.ondevice.navgraph.NavGraphRepository;
import me.oriient.navigation.ondevice.util.NavAlgoCoreErrorHandler;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lme/oriient/internal/infra/di/DependencyInjection;", "diBase", "", "initializeNavigationDi", "(Lme/oriient/internal/infra/di/DependencyInjection;)V", "service-navigation_publishRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class DiKt {

    /* renamed from: a, reason: collision with root package name */
    public static DependencyInjection f26209a;

    public static final DependencyInjection a() {
        DependencyInjection dependencyInjection = f26209a;
        if (dependencyInjection != null) {
            return dependencyInjection;
        }
        Intrinsics.p("di");
        throw null;
    }

    @Keep
    public static final void initializeNavigationDi(@NotNull DependencyInjection diBase) {
        Intrinsics.h(diBase, "diBase");
        if (f26209a != null) {
            return;
        }
        f26209a = diBase;
        C1773n c1773n = C1773n.f26258a;
        DependencyInjection dependencyInjectionA = a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        dependencyInjectionA.registerSingleton(reflectionFactory.b(InterfaceC1781w.class), null, c1773n);
        a().registerSingleton(reflectionFactory.b(u0.class), null, C1774o.f26259a);
        a().registerSingleton(reflectionFactory.b(InterfaceC1784z.class), null, C1775p.f26260a);
        a().registerSingleton(reflectionFactory.b(n0.class), null, C1776q.f26262a);
        a().registerSingleton(reflectionFactory.b(q0.class), null, r.f26263a);
        C1797c c1797c = new C1797c();
        a().registerSingleton(reflectionFactory.b(NavGraphPriorityLoader.class), null, new C1777s(c1797c));
        a().registerSingleton(reflectionFactory.b(NavGraphRepository.class), null, new C1778t(c1797c));
        a().registerSingleton(reflectionFactory.b(me.oriient.navigation.ondevice.navgraph.B.class), null, C1779u.f26268a);
        a().registerSingleton(reflectionFactory.b(InterfaceC1785a.class), null, C1780v.f26269a);
        a().registerSingleton(reflectionFactory.b(me.oriient.navigation.ondevice.p.class), null, C1766g.f26241a);
        a().registerSingleton(reflectionFactory.b(InterfaceC1798d.class), null, C1767h.f26243a);
        a().registerSingleton(reflectionFactory.b(NavAlgoCoreErrorHandler.class), null, C1768i.f26245a);
        a().registerSingleton(reflectionFactory.b(l0.class), null, C1769j.f26247a);
        a().registerSingleton(reflectionFactory.b(me.oriient.navigation.turnByTurn.m.class), null, C1770k.f26249a);
        a().registerSingleton(reflectionFactory.b(me.oriient.navigation.turnByTurn.a.class), null, C1771l.f26251a);
        a().registerSingleton(reflectionFactory.b(me.oriient.navigation.turnByTurn.e.class), null, C1772m.f26252a);
    }
}
