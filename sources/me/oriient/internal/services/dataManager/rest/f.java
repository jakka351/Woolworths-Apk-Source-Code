package me.oriient.internal.services.dataManager.rest;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.infra.utils.core.ParsingError;

/* loaded from: classes7.dex */
public final class f extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25405a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.b = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        f fVar = new f(this.b, continuation);
        fVar.f25405a = obj;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        f fVar = new f(this.b, (Continuation) obj2);
        fVar.f25405a = (HttpResponse) obj;
        return fVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return OutcomeKt.toOutcomeSuccess(this.b.invoke((HttpResponse) this.f25405a));
        } catch (OriientError e) {
            return OutcomeKt.toOutcomeFailure(e);
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Parsing error";
            }
            return OutcomeKt.toOutcomeFailure(new ParsingError(message));
        }
    }
}
