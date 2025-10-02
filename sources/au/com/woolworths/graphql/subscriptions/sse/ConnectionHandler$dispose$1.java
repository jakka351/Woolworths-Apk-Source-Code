package au.com.woolworths.graphql.subscriptions.sse;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$dispose$1", f = "ConnectionHandler.kt", l = {240}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$dispose$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ConnectionHandler r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$dispose$1(ConnectionHandler connectionHandler, Continuation continuation) {
        super(2, continuation);
        this.r = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectionHandler$dispose$1 connectionHandler$dispose$1 = new ConnectionHandler$dispose$1(this.r, continuation);
        connectionHandler$dispose$1.q = obj;
        return connectionHandler$dispose$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionHandler$dispose$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.q;
            Job jobC = BuildersKt.c(coroutineScope2, null, null, new ConnectionHandler$dispose$1$job$1(this.r, null), 3);
            this.q = coroutineScope2;
            this.p = 1;
            if (((JobSupport) jobC).join(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            coroutineScope = coroutineScope2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.q;
            ResultKt.b(obj);
        }
        CoroutineScopeKt.b(coroutineScope, null);
        return Unit.f24250a;
    }
}
