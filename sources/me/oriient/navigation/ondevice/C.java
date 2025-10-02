package me.oriient.navigation.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes8.dex */
public final class C extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f26273a;
    public final /* synthetic */ J b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(J j, Continuation continuation) {
        super(2, continuation);
        this.b = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C c = new C(this.b, continuation);
        c.f26273a = obj;
        return c;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C c = new C(this.b, (Continuation) obj2);
        c.f26273a = (NavigationData) obj;
        return c.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        NavigationData navigationData = (NavigationData) this.f26273a;
        NdkBridgeImpl ndkBridgeImpl = (NdkBridgeImpl) ((p) this.b.c.getD());
        ndkBridgeImpl.getClass();
        Intrinsics.h(navigationData, "navigationData");
        Outcome outcomeA = ndkBridgeImpl.a(new s(ndkBridgeImpl, navigationData));
        if (outcomeA instanceof Outcome.Success) {
            NdkBridgeImpl.f = true;
        }
        return outcomeA;
    }
}
