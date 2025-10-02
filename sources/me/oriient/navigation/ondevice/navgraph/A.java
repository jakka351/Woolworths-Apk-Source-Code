package me.oriient.navigation.ondevice.navgraph;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.services.dataPriorityLoader.DataPriorityLoader;

/* loaded from: classes8.dex */
public final class A implements NavGraphRepository {

    /* renamed from: a, reason: collision with root package name */
    public final NavGraphPriorityLoader f26294a;
    public final InterfaceC1795a b;

    public A(NavGraphPriorityLoader navGraphPriorityLoader, InterfaceC1795a navGraphCache) {
        Intrinsics.h(navGraphPriorityLoader, "navGraphPriorityLoader");
        Intrinsics.h(navGraphCache, "navGraphCache");
        this.f26294a = navGraphPriorityLoader;
        this.b = navGraphCache;
    }

    @Override // me.oriient.navigation.ondevice.navgraph.NavGraphRepository
    public final Object cleanData(String str, Continuation continuation) {
        v vVar = (v) ((InterfaceC1798d) ((C1797c) this.b).f26309a.getD());
        vVar.getClass();
        vVar.a(new C1806l(vVar, str));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.navigation.ondevice.navgraph.NavGraphRepository
    public final Object cleanExpiredData(double d, Continuation continuation) {
        v vVar = (v) ((InterfaceC1798d) ((C1797c) this.b).f26309a.getD());
        vVar.getClass();
        vVar.a(new C1802h(vVar, d));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        return Unit.f24250a;
    }

    @Override // me.oriient.navigation.ondevice.navgraph.NavGraphRepository
    public final Object getNavGraph(String str, String str2, double d, Continuation continuation) {
        return DataPriorityLoader.DefaultImpls.loadData$default(this.f26294a, new w(str, str2), d, false, continuation, 4, null);
    }

    @Override // me.oriient.navigation.ondevice.navgraph.NavGraphRepository
    public final Object cleanData(Continuation continuation) {
        Object objClean = ((C1797c) this.b).clean(continuation);
        return objClean == CoroutineSingletons.d ? objClean : Unit.f24250a;
    }
}
