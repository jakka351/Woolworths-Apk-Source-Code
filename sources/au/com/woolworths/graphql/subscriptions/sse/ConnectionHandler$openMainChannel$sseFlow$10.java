package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger;
import au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction;
import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import com.apollographql.apollo.exception.DefaultApolloException;
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
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$sseFlow$10", f = "ConnectionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$sseFlow$10 extends SuspendLambda implements Function3<FlowCollector<? super ConnectionHandler.MainChannelEvent>, Throwable, Continuation<? super Unit>, Object> {
    public /* synthetic */ Throwable p;
    public final /* synthetic */ ConnectionHandler q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$openMainChannel$sseFlow$10(ConnectionHandler connectionHandler, Continuation continuation) {
        super(3, continuation);
        this.q = connectionHandler;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConnectionHandler$openMainChannel$sseFlow$10 connectionHandler$openMainChannel$sseFlow$10 = new ConnectionHandler$openMainChannel$sseFlow$10(this.q, (Continuation) obj3);
        connectionHandler$openMainChannel$sseFlow$10.p = (Throwable) obj2;
        Unit unit = Unit.f24250a;
        connectionHandler$openMainChannel$sseFlow$10.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DynatraceAction dynatraceAction;
        ConnectionHandler connectionHandler = this.q;
        ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger = connectionHandler.c;
        ConnectionHandler.SubscriptionsTracker subscriptionsTracker = connectionHandler.h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        Throwable th = this.p;
        if (th != null && subscriptionsTracker.f9034a.size() > 0) {
            DefaultApolloException defaultApolloException = new DefaultApolloException(YU.a.e(subscriptionsTracker.f9034a.size(), "Main channel closed while ", " subscriptions are active"), th);
            if (apolloSseTransportDynatraceLogger != null && (dynatraceAction = apolloSseTransportDynatraceLogger.b) != null) {
                String message = defaultApolloException.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                dynatraceAction.b("Main channel error: ".concat(message), defaultApolloException);
            }
        }
        if (apolloSseTransportDynatraceLogger != null) {
            DynatraceAction dynatraceAction2 = apolloSseTransportDynatraceLogger.b;
            if (dynatraceAction2 != null) {
                dynatraceAction2.a();
            }
            apolloSseTransportDynatraceLogger.b = null;
        }
        return Unit.f24250a;
    }
}
