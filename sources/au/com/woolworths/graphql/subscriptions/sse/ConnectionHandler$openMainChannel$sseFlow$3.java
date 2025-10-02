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

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/graphql/subscriptions/sse/channel/ChannelFactory$MainChannel;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$sseFlow$3", f = "ConnectionHandler.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$sseFlow$3 extends SuspendLambda implements Function2<ChannelFactory.MainChannel, Continuation<? super Unit>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ ConnectionHandler q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$openMainChannel$sseFlow$3(ConnectionHandler connectionHandler, Continuation continuation) {
        super(2, continuation);
        this.q = connectionHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ConnectionHandler$openMainChannel$sseFlow$3 connectionHandler$openMainChannel$sseFlow$3 = new ConnectionHandler$openMainChannel$sseFlow$3(this.q, continuation);
        connectionHandler$openMainChannel$sseFlow$3.p = obj;
        return connectionHandler$openMainChannel$sseFlow$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ConnectionHandler$openMainChannel$sseFlow$3 connectionHandler$openMainChannel$sseFlow$3 = (ConnectionHandler$openMainChannel$sseFlow$3) create((ChannelFactory.MainChannel) obj, (Continuation) obj2);
        Unit unit = Unit.f24250a;
        connectionHandler$openMainChannel$sseFlow$3.invokeSuspend(unit);
        return unit;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.q.k = (ChannelFactory.MainChannel) this.p;
        return Unit.f24250a;
    }
}
