package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger;
import au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction;
import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import com.apollographql.apollo.api.ApolloResponse;
import com.apollographql.apollo.api.Operation;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n"}, d2 = {"<anonymous>", "", "D", "Lcom/apollographql/apollo/api/Operation$Data;", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/api/ApolloResponse;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$4", f = "SseNetworkTransport.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SseNetworkTransport$execute$4 extends SuspendLambda implements Function3<FlowCollector<? super ApolloResponse<Operation.Data>>, Throwable, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ SseNetworkTransport q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SseNetworkTransport$execute$4(SseNetworkTransport sseNetworkTransport, String str, Continuation continuation) {
        super(3, continuation);
        this.q = sseNetworkTransport;
        this.r = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new SseNetworkTransport$execute$4(this.q, this.r, (Continuation) obj3).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objB;
        DynatraceAction dynatraceAction;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        String str = this.r;
        SseNetworkTransport sseNetworkTransport = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            ConnectionHandler connectionHandler = sseNetworkTransport.f9035a;
            this.p = 1;
            ConnectionHandler.SubscriptionsTracker subscriptionsTracker = connectionHandler.h;
            subscriptionsTracker.getClass();
            ConcurrentHashMap concurrentHashMap = subscriptionsTracker.f9034a;
            concurrentHashMap.remove(UUID.fromString(str));
            int size = concurrentHashMap.size();
            ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger = connectionHandler.c;
            if (apolloSseTransportDynatraceLogger != null && (dynatraceAction = apolloSseTransportDynatraceLogger.b) != null) {
                dynatraceAction.c("Subscription destroyed - ".concat(str));
            }
            if (size != 0 || (objB = connectionHandler.b(false, this)) != coroutineSingletons) {
                objB = unit;
            }
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        LinkedHashMap linkedHashMap = sseNetworkTransport.b.c;
        DynatraceAction dynatraceAction2 = (DynatraceAction) linkedHashMap.get(str);
        if (dynatraceAction2 != null) {
            dynatraceAction2.a();
        }
        linkedHashMap.remove(str);
        return unit;
    }
}
