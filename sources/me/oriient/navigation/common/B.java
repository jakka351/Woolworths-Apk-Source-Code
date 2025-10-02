package me.oriient.navigation.common;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.navigation.common.models.NavigationPosition;

/* loaded from: classes8.dex */
public final class B implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationManagerImpl f26206a;

    public B(NavigationManagerImpl navigationManagerImpl) {
        this.f26206a = navigationManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objUpdateRoute = this.f26206a.updateRoute((NavigationPosition) obj, continuation);
        return objUpdateRoute == CoroutineSingletons.d ? objUpdateRoute : Unit.f24250a;
    }
}
