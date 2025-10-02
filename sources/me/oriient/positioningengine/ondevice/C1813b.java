package me.oriient.positioningengine.ondevice;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: me.oriient.positioningengine.ondevice.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1813b extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26410a;
    public final /* synthetic */ I b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813b(I i, Continuation continuation) {
        super(2, continuation);
        this.b = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1813b(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1813b(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26410a;
        if (i == 0) {
            ResultKt.b(obj);
            I i2 = this.b;
            this.f26410a = 1;
            if (I.a(i2, this) == coroutineSingletons) {
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
