package me.oriient.navigation.common;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.StateFlow;
import me.oriient.navigation.common.models.NavigationBuilding;

/* loaded from: classes8.dex */
public final class E extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26210a;
    public final /* synthetic */ NavigationManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(NavigationManagerImpl navigationManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = navigationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new E(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26210a;
        if (i == 0) {
            ResultKt.b(obj);
            StateFlow<NavigationBuilding> currentBuilding = this.b.getPositionProvider().getCurrentBuilding();
            D d = new D(this.b);
            this.f26210a = 1;
            if (currentBuilding.collect(d, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
