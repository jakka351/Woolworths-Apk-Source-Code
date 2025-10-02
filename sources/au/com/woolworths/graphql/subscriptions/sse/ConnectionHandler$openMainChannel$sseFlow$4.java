package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/flow/Flow;", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent;", "it", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$sseFlow$4", f = "ConnectionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$sseFlow$4 extends SuspendLambda implements Function2<ChannelFactory.MainChannel, Continuation<? super Flow<? extends ChannelFactory.MainChannel.SseEvent>>, Object> {
    public /* synthetic */ Object p;

    public ConnectionHandler$openMainChannel$sseFlow$4() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectionHandler$openMainChannel$sseFlow$4 connectionHandler$openMainChannel$sseFlow$4 = new ConnectionHandler$openMainChannel$sseFlow$4(2, continuation);
        connectionHandler$openMainChannel$sseFlow$4.p = obj;
        return connectionHandler$openMainChannel$sseFlow$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionHandler$openMainChannel$sseFlow$4) create((ChannelFactory.MainChannel) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return ((ChannelFactory.MainChannel) this.p).getData();
    }
}
