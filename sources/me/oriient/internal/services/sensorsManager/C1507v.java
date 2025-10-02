package me.oriient.internal.services.sensorsManager;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.SharedFlow;

/* renamed from: me.oriient.internal.services.sensorsManager.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1507v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25607a;
    public final /* synthetic */ C1508w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1507v(C1508w c1508w, Continuation continuation) {
        super(2, continuation);
        this.b = c1508w;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1507v(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1507v(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25607a;
        if (i == 0) {
            ResultKt.b(obj);
            SharedFlow<Error> errors = this.b.f25608a.getErrors();
            C1506u c1506u = new C1506u(this.b);
            this.f25607a = 1;
            if (errors.collect(c1506u, this) == coroutineSingletons) {
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
