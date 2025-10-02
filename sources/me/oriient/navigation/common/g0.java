package me.oriient.navigation.common;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.navigation.common.models.NavigationPosition;
import me.oriient.navigation.common.models.NavigationWaypoint;

/* loaded from: classes8.dex */
public final class g0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26242a;
    public final /* synthetic */ NavigationManagerImpl b;
    public final /* synthetic */ InterfaceC1783y c;
    public final /* synthetic */ NavigationPosition d;
    public final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(NavigationManagerImpl navigationManagerImpl, InterfaceC1783y interfaceC1783y, NavigationPosition navigationPosition, List list, Continuation continuation) {
        super(2, continuation);
        this.b = navigationManagerImpl;
        this.c = interfaceC1783y;
        this.d = navigationPosition;
        this.e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new g0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26242a;
        if (i == 0) {
            ResultKt.b(obj);
            NavigationManagerImpl navigationManagerImpl = this.b;
            InterfaceC1783y interfaceC1783y = this.c;
            NavigationPosition navigationPosition = this.d;
            List list = this.e;
            NavigationWaypoint navigationWaypoint = navigationManagerImpl._liveFinalWaypoint;
            this.f26242a = 1;
            if (navigationManagerImpl.calculateRouteImpl(interfaceC1783y, navigationPosition, list, navigationWaypoint, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
