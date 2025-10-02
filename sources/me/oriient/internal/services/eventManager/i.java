package me.oriient.internal.services.eventManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;

/* loaded from: classes7.dex */
public final class i extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25457a;
    public final /* synthetic */ long b;
    public final /* synthetic */ w c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(long j, w wVar, Continuation continuation) {
        super(2, continuation);
        this.b = j;
        this.c = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new i(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25457a;
        if (i == 0) {
            ResultKt.b(obj);
            long j = this.b;
            this.f25457a = 1;
            if (DelayKt.b(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        w.a(this.c).d("EventManager", "Retry connection after delay: " + this.b);
        w wVar = this.c;
        BuildersKt.c(wVar.j, null, null, new h(wVar, null), 3);
        return Unit.f24250a;
    }
}
