package me.oriient.navigation.common;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes8.dex */
public final class L extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26216a;
    public final /* synthetic */ NavigationManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(NavigationManagerImpl navigationManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = navigationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new L(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new L(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26216a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            this.b.getELog().d("NavigationManager", "Clean navigation core");
            this.b._liveNavigationWaypoints = EmptyList.d;
            this.b._liveFinalWaypoint = null;
            this.b.updateWaypointsCounter();
            this.b.pendingPositions.clear();
            this.b.cancelCurrentRequest();
            this.b.lastRoute = null;
            InterfaceC1783y interfaceC1783y = this.b.navigationCore;
            if (interfaceC1783y != null) {
                this.f26216a = 1;
                me.oriient.navigation.ondevice.J j = (me.oriient.navigation.ondevice.J) interfaceC1783y;
                Object objF = BuildersKt.f(((CoroutineScope) j.f.getD()).getE(), new me.oriient.navigation.ondevice.w(j, null), this);
                if (objF != coroutineSingletons) {
                    objF = unit;
                }
                if (objF == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.b.navigationCore = null;
        this.b.currentConfig = null;
        return unit;
    }
}
