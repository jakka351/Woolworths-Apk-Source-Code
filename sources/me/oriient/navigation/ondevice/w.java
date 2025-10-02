package me.oriient.navigation.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.elog.ELog;

/* loaded from: classes8.dex */
public final class w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f26360a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(J j, Continuation continuation) {
        super(2, continuation);
        this.f26360a = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new w(this.f26360a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new w(this.f26360a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ((ELog) this.f26360a.b.getD()).v("OnDeviceNavigationCore", "OnDeviceNavigationEngine deInit called");
        NdkBridgeImpl ndkBridgeImpl = (NdkBridgeImpl) ((p) this.f26360a.c.getD());
        ndkBridgeImpl.getClass();
        ndkBridgeImpl.a(new u(ndkBridgeImpl));
        return Unit.f24250a;
    }
}
