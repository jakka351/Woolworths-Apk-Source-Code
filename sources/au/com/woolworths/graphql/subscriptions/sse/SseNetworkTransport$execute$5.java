package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger;
import au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "it", "Lcom/apollographql/apollo/api/ApolloResponse;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$5", f = "SseNetworkTransport.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SseNetworkTransport$execute$5 extends SuspendLambda implements Function2<ApolloResponse<Operation.Data>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ SseNetworkTransport p;
    public final /* synthetic */ String q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SseNetworkTransport$execute$5(SseNetworkTransport sseNetworkTransport, String str, Continuation continuation) {
        super(2, continuation);
        this.p = sseNetworkTransport;
        this.q = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SseNetworkTransport$execute$5(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SseNetworkTransport$execute$5 sseNetworkTransport$execute$5 = (SseNetworkTransport$execute$5) create((ApolloResponse) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        sseNetworkTransport$execute$5.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger = this.p.b;
        DynatraceAction dynatraceAction = (DynatraceAction) apolloSseTransportDynatraceLogger.c.get(this.q);
        if (dynatraceAction != null) {
            dynatraceAction.c("Subscription message received");
        }
        return Unit.f24250a;
    }
}
