package me.oriient.navigation.common;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import me.oriient.navigation.common.models.NavigationBuilding;

/* loaded from: classes8.dex */
public final class D implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NavigationManagerImpl f26208a;

    public D(NavigationManagerImpl navigationManagerImpl) {
        this.f26208a = navigationManagerImpl;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        InterfaceC1783y interfaceC1783y;
        NavigationBuilding navigationBuilding = (NavigationBuilding) obj;
        Unit unit = Unit.f24250a;
        if (navigationBuilding != null && (interfaceC1783y = this.f26208a.navigationCore) != null) {
            me.oriient.navigation.ondevice.J j = (me.oriient.navigation.ondevice.J) interfaceC1783y;
            Object objF = BuildersKt.f(((CoroutineScope) j.f.getD()).getE(), new me.oriient.navigation.ondevice.I(j, navigationBuilding.getId(), null), continuation);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            if (objF != coroutineSingletons) {
                objF = unit;
            }
            if (objF == coroutineSingletons) {
                return objF;
            }
        }
        return unit;
    }
}
