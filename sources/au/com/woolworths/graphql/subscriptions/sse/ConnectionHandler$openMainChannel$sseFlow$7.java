package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SsePayloadWrapper;", "kotlin.jvm.PlatformType"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$sseFlow$7", f = "ConnectionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$sseFlow$7 extends SuspendLambda implements Function2<ChannelFactory.MainChannel.SsePayloadWrapper, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ConnectionHandler q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$openMainChannel$sseFlow$7(ConnectionHandler connectionHandler, Continuation continuation) {
        super(2, continuation);
        this.q = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectionHandler$openMainChannel$sseFlow$7 connectionHandler$openMainChannel$sseFlow$7 = new ConnectionHandler$openMainChannel$sseFlow$7(this.q, continuation);
        connectionHandler$openMainChannel$sseFlow$7.p = obj;
        return connectionHandler$openMainChannel$sseFlow$7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ConnectionHandler$openMainChannel$sseFlow$7 connectionHandler$openMainChannel$sseFlow$7 = (ConnectionHandler$openMainChannel$sseFlow$7) create((ChannelFactory.MainChannel.SsePayloadWrapper) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        connectionHandler$openMainChannel$sseFlow$7.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ChannelFactory.MainChannel.SsePayloadWrapper ssePayloadWrapper = (ChannelFactory.MainChannel.SsePayloadWrapper) this.p;
        if (Intrinsics.c(ssePayloadWrapper.getType(), "complete")) {
            ConnectionHandler.SubscriptionsTracker subscriptionsTracker = this.q.h;
            String id = ssePayloadWrapper.getSubscriptionId();
            subscriptionsTracker.getClass();
            Intrinsics.h(id, "id");
            ConcurrentHashMap concurrentHashMap = subscriptionsTracker.f9034a;
            concurrentHashMap.remove(UUID.fromString(id));
            concurrentHashMap.size();
        }
        return Unit.f24250a;
    }
}
