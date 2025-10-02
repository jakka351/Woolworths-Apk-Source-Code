package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$1", f = "ConnectionHandler.kt", l = {436}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$1 extends SuspendLambda implements Function3<FlowCollector<? super ConnectionHandler.MainChannelEvent>, Throwable, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Throwable r;
    public final /* synthetic */ Function3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$openMainChannel$1(Function3 function3, Continuation continuation) {
        super(3, continuation);
        this.s = function3;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConnectionHandler$openMainChannel$1 connectionHandler$openMainChannel$1 = new ConnectionHandler$openMainChannel$1(this.s, (Continuation) obj3);
        connectionHandler$openMainChannel$1.q = (FlowCollector) obj;
        connectionHandler$openMainChannel$1.r = (Throwable) obj2;
        return connectionHandler$openMainChannel$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = this.q;
            Throwable th = this.r;
            if (th == null) {
                this.q = null;
                this.p = 1;
                if (((ConnectionHandler$openMainChannel$reconnectFunc$1) this.s).invoke(flowCollector, th, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
