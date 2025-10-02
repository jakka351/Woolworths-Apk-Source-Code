package me.oriient.internal.services.eventManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f25456a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(w wVar, Continuation continuation) {
        super(2, continuation);
        this.f25456a = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new h(this.f25456a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.f25456a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        int i = g.$EnumSwitchMapping$0[((EventManagerState) this.f25456a.f.getValue()).ordinal()];
        if (i == 1) {
            this.f25456a.o.clear();
            w wVar = this.f25456a;
            wVar.a(wVar.f, EventManagerState.CONNECTING);
            w.c(this.f25456a);
        } else if (i == 2) {
            w wVar2 = this.f25456a;
            wVar2.a(wVar2.f, EventManagerState.CONNECTING);
            w.c(this.f25456a);
        }
        return Unit.f24250a;
    }
}
