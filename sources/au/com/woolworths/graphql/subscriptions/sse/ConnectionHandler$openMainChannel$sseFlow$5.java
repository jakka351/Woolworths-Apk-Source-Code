package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.channel.ChannelFactory;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel$SseEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$sseFlow$5", f = "ConnectionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$sseFlow$5 extends SuspendLambda implements Function2<ChannelFactory.MainChannel.SseEvent, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;

    public ConnectionHandler$openMainChannel$sseFlow$5() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectionHandler$openMainChannel$sseFlow$5 connectionHandler$openMainChannel$sseFlow$5 = new ConnectionHandler$openMainChannel$sseFlow$5(2, continuation);
        connectionHandler$openMainChannel$sseFlow$5.p = obj;
        return connectionHandler$openMainChannel$sseFlow$5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws IOException {
        ConnectionHandler$openMainChannel$sseFlow$5 connectionHandler$openMainChannel$sseFlow$5 = (ConnectionHandler$openMainChannel$sseFlow$5) create((ChannelFactory.MainChannel.SseEvent) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        connectionHandler$openMainChannel$sseFlow$5.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws IOException {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ChannelFactory.MainChannel.SseEvent sseEvent = (ChannelFactory.MainChannel.SseEvent) this.p;
        if (sseEvent instanceof ChannelFactory.MainChannel.SseEvent.SseError) {
            throw new IOException("Error on the main channel", ((ChannelFactory.MainChannel.SseEvent.SseError) sseEvent).f9037a);
        }
        return Unit.f24250a;
    }
}
