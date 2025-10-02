package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$sseFlow$2", f = "ConnectionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$sseFlow$2 extends SuspendLambda implements Function2<FlowCollector<? super ChannelFactory.MainChannel>, Continuation<? super Unit>, Object> {
    public final /* synthetic */ ConnectionHandler p;
    public final /* synthetic */ boolean q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$openMainChannel$sseFlow$2(ConnectionHandler connectionHandler, boolean z, Continuation continuation) {
        super(2, continuation);
        this.p = connectionHandler;
        this.q = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionHandler$openMainChannel$sseFlow$2(this.p, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ConnectionHandler$openMainChannel$sseFlow$2 connectionHandler$openMainChannel$sseFlow$2 = (ConnectionHandler$openMainChannel$sseFlow$2) create((FlowCollector) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        connectionHandler$openMainChannel$sseFlow$2.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ApolloSseTransportDynatraceLogger apolloSseTransportDynatraceLogger = this.p.c;
        if (apolloSseTransportDynatraceLogger != null) {
            apolloSseTransportDynatraceLogger.b = apolloSseTransportDynatraceLogger.f4270a.a("Create main channel");
        }
        return Unit.f24250a;
    }
}
