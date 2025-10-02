package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.realtime.services.tag.EventTaggingDatabaseImpl;

/* loaded from: classes8.dex */
public final class E1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f25931a;
    public final /* synthetic */ EventTaggingDatabaseImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E1(EventTaggingDatabaseImpl eventTaggingDatabaseImpl, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f25931a = function1;
        this.b = eventTaggingDatabaseImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new E1(this.b, this.f25931a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Function1 function1 = this.f25931a;
        return new E1(this.b, function1, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return (Outcome) this.f25931a.invoke(this.b.f26189a.getDBTagQueries());
        } catch (Exception e) {
            Logger logger = this.b.b;
            if (logger != null) {
                logger.e("EventTaggingDatabase", "execute: db operation failed", e);
            }
            String message = e.getMessage();
            if (message == null) {
                message = "db operation failed";
            }
            return new Outcome.Failure(new Exception(message));
        }
    }
}
