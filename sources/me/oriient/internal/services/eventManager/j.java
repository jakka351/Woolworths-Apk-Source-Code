package me.oriient.internal.services.eventManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import me.oriient.internal.services.eventManager.model.EventError;

/* loaded from: classes7.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25458a;
    public final /* synthetic */ w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(w wVar, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new j(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25458a;
        if (i == 0) {
            ResultKt.b(obj);
            long timeoutMillis = this.b.b.getTimeoutMillis();
            this.f25458a = 1;
            if (DelayKt.b(timeoutMillis, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.b.a((EventError) new EventError.Timeout(null, 1, null));
        return Unit.f24250a;
    }
}
