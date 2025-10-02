package me.oriient.internal.services.sensorsManager;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;

/* renamed from: me.oriient.internal.services.sensorsManager.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1501o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25586a;
    public final /* synthetic */ C1502p b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1501o(C1502p c1502p, Continuation continuation) {
        super(2, continuation);
        this.b = c1502p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1501o(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1501o(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25586a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<Error> errors = this.b.b.getErrors();
            C1500n c1500n = new C1500n(this.b);
            this.f25586a = 1;
            if (errors.collect(c1500n, this) == coroutineSingletons) {
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
