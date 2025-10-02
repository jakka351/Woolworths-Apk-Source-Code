package me.oriient.internal.services.eventManager;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.serializerJson.Jsonable;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.auth.D;
import me.oriient.internal.services.auth.U;
import me.oriient.internal.services.auth.V;
import me.oriient.internal.services.eventManager.model.EventError;
import me.oriient.internal.services.eventManager.model.PublishMessage;

/* loaded from: classes7.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25469a;
    public final /* synthetic */ w b;
    public final /* synthetic */ Function3 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Jsonable e;
    public final /* synthetic */ Jsonable f;
    public final /* synthetic */ Function2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(w wVar, Function3 function3, String str, Jsonable jsonable, Jsonable jsonable2, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.b = wVar;
        this.c = function3;
        this.d = str;
        this.e = jsonable;
        this.f = jsonable2;
        this.g = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25469a;
        if (i == 0) {
            ResultKt.b(obj);
            if (this.b.o.size() > this.b.b.getDataQueueLimit()) {
                w.a(this.b).e("EventManager", "sendEvent: data queue limit reached");
                this.b.o.remove();
            }
            U u = (U) this.b.q.getD();
            this.f25469a = 1;
            obj = ((D) u).a(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        boolean z = outcome instanceof Outcome.Success;
        Unit unit = Unit.f24250a;
        if (!z) {
            if (!(outcome instanceof Outcome.Failure)) {
                throw new NoWhenBranchMatchedException();
            }
            w.a(this.b).d("EventManager", "no authentication");
            this.c.invoke(this.d, "", new EventError.AuthError());
            return unit;
        }
        PublishMessage publishMessage = new PublishMessage(this.b.f25473a, ((V) ((Outcome.Success) outcome).getValue()).f25021a.f25022a, this.d, this.e, this.f);
        w.a(this.b).d("EventManager", "Send publish event with topic " + publishMessage.getRequestId());
        this.b.o.add(new me.oriient.internal.services.eventManager.model.c(publishMessage, this.g, this.c));
        w.b(this.b);
        return unit;
    }
}
