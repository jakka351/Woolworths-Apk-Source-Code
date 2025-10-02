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
public final class l extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25410a;
    public final /* synthetic */ Function1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.b = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        l lVar = new l(this.b, continuation);
        lVar.f25410a = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        l lVar = new l(this.b, (Continuation) obj2);
        lVar.f25410a = (HttpResponse) obj;
        return lVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return OutcomeKt.toOutcomeSuccess(this.b.invoke((HttpResponse) this.f25410a));
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
