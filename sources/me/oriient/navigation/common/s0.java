package me.oriient.navigation.common;

import java.util.List;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import me.oriient.internal.infra.di.DependencyInjection;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.dataModel.navigation.NavigationConfig;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.Route;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class s0 implements q0 {

    @NotNull
    private static final r0 Companion = new r0();

    /* renamed from: a, reason: collision with root package name */
    public final Lazy f26265a;
    public final Lazy b;
    public final Lazy c;

    public s0() {
        DependencyInjection dependencyInjectionA = DiKt.a();
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f26265a = dependencyInjectionA.inject(reflectionFactory.b(Logger.class));
        this.b = DiKt.a().inject(reflectionFactory.b(n0.class));
        this.c = DiKt.a().inject(reflectionFactory.b(InterfaceC1781w.class));
    }

    public final Pair a(NavigationConfig navigationConfig, NavigationPosition navigationPosition, Route route, List list, NavigationPosition navigationPosition2, boolean z) {
        Route route2;
        NavigationPosition navigationPosition3;
        if (navigationPosition.getCoordinate().plainDistanceTo(navigationPosition2.getCoordinate()) > navigationConfig.getMaxPositionJumpMeters()) {
            return new Pair(route, Boolean.FALSE);
        }
        ((Logger) this.f26265a.getD()).d("TailTrimmer", "Applying position [" + navigationPosition2.getCoordinate().getX() + ", " + navigationPosition2.getCoordinate().getY() + ']');
        AbstractC1765f abstractC1765fA = ((p0) ((n0) this.b.getD())).a(navigationConfig, route, navigationPosition2);
        if (abstractC1765fA instanceof C1760a ? true : abstractC1765fA instanceof C1762c) {
            return new Pair(route, Boolean.FALSE);
        }
        if (abstractC1765fA instanceof C1763d) {
            return new Pair(((C1763d) abstractC1765fA).f26236a, Boolean.TRUE);
        }
        if (!(abstractC1765fA instanceof C1764e ? true : abstractC1765fA instanceof C1761b)) {
            throw new NoWhenBranchMatchedException();
        }
        if (z || (navigationPosition3 = (NavigationPosition) CollectionsKt.P(list)) == null) {
            route2 = route;
        } else {
            route2 = route;
            a(navigationConfig, navigationPosition, route2, list, navigationPosition3, true);
        }
        return new Pair(route2, Boolean.FALSE);
    }
}
