package me.oriient.internal.services.auth.rest;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.rest.HttpResponse;
import me.oriient.internal.infra.utils.core.OriientError;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.internal.infra.utils.core.ParsingError;

/* loaded from: classes7.dex */
public final class d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25045a;
    public final /* synthetic */ Lambda b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.b = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        d dVar = new d(this.b, continuation);
        dVar.f25045a = obj;
        return dVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        d dVar = new d(this.b, (Continuation) obj2);
        dVar.f25045a = (HttpResponse.StringResponse) obj;
        return dVar.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return OutcomeKt.toOutcomeSuccess(this.b.invoke((HttpResponse.StringResponse) this.f25045a));
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
