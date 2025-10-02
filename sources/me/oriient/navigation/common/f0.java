package me.oriient.navigation.common;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class f0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26240a;
    public final /* synthetic */ NavigationManagerImpl b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(NavigationManagerImpl navigationManagerImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.b = navigationManagerImpl;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new f0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new f0(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26240a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.b.getLogger().d("NavigationManager", "preloadNavigationData() called with: buildingId = " + this.c);
        InterfaceC1783y interfaceC1783y = this.b.navigationCore;
        if (interfaceC1783y == null) {
            return new Outcome.Failure(new NavigationError.InternalError("Navigation service is not ready"));
        }
        String str = this.c;
        this.f26240a = 1;
        me.oriient.navigation.ondevice.J j = (me.oriient.navigation.ondevice.J) interfaceC1783y;
        Object objF = BuildersKt.f(((CoroutineScope) j.f.getD()).getE(), new me.oriient.navigation.ondevice.H(j, str, null), this);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
