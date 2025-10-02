package me.oriient.navigation.common;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes8.dex */
public final class X extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26227a;
    public final /* synthetic */ NavigationManagerImpl b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(NavigationManagerImpl navigationManagerImpl, boolean z, Continuation continuation) {
        super(2, continuation);
        this.b = navigationManagerImpl;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new X(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new X(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26227a;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.b._isLiveNavigationEnabled == this.c) {
                return unit;
            }
            this.b.getELog().d("NavigationManager", "Set live navigation enabled", new W(this.c));
            this.b._isLiveNavigationEnabled = this.c;
            boolean z = this.c;
            if (z) {
                NavigationManagerImpl navigationManagerImpl = this.b;
                this.f26227a = 1;
                if (NavigationManagerImpl.updateRoute$default(navigationManagerImpl, null, this, 1, null) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (!z) {
                this.b.cancelCurrentRequest();
                this.b.lastRoute = null;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return unit;
    }
}
