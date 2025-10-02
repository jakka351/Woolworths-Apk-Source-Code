package me.oriient.navigation.common;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes8.dex */
public final class F implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationManagerImpl f26211a;

    public F(NavigationManagerImpl navigationManagerImpl) {
        this.f26211a = navigationManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        if (((String) obj) != null) {
            NavigationManagerImpl navigationManagerImpl = this.f26211a;
            l0 metricsManager = navigationManagerImpl.getMetricsManager();
            int size = navigationManagerImpl._liveNavigationWaypoints.size();
            m0 m0Var = (m0) metricsManager;
            m0Var.b = 0L;
            me.oriient.navigation.common.models.d dVar = m0Var.f26253a;
            dVar.d = 0L;
            dVar.e = 0L;
            dVar.b = 0;
            dVar.c = 0;
            dVar.f26255a = size;
        }
        return Unit.f24250a;
    }
}
