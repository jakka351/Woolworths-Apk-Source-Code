package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import au.com.woolworths.graphql.subscriptions.sse.channel.DefaultMainChannel;
import au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$sseFlow$1", f = "ConnectionHandler.kt", l = {366}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$sseFlow$1 extends SuspendLambda implements Function2<FlowCollector<? super ChannelFactory.MainChannel>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ConnectionHandler r;
    public final /* synthetic */ SseTransportMessage.Response.ConnectionData s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$openMainChannel$sseFlow$1(ConnectionHandler connectionHandler, SseTransportMessage.Response.ConnectionData connectionData, Continuation continuation) {
        super(2, continuation);
        this.r = connectionHandler;
        this.s = connectionData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectionHandler$openMainChannel$sseFlow$1 connectionHandler$openMainChannel$sseFlow$1 = new ConnectionHandler$openMainChannel$sseFlow$1(this.r, this.s, continuation);
        connectionHandler$openMainChannel$sseFlow$1.q = obj;
        return connectionHandler$openMainChannel$sseFlow$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionHandler$openMainChannel$sseFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            FlowCollector flowCollector = (FlowCollector) this.q;
            ChannelFactory channelFactory = this.r.f9030a;
            String url = this.s.getConnectionUrl();
            channelFactory.getClass();
            Intrinsics.h(url, "url");
            DefaultMainChannel defaultMainChannel = new DefaultMainChannel(url, channelFactory.c);
            this.p = 1;
            if (flowCollector.emit(defaultMainChannel, this) == coroutineSingletons) {
                return coroutineSingletons;
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
