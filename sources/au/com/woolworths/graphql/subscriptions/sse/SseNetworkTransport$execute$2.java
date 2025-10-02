package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.SseNetworkTransport$execute$2", f = "SseNetworkTransport.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SseNetworkTransport$execute$2 extends SuspendLambda implements Function2<ConnectionHandler.MainChannelEvent, Continuation<? super Boolean>, Object> {
    public /* synthetic */ Object p;

    public SseNetworkTransport$execute$2() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SseNetworkTransport$execute$2 sseNetworkTransport$execute$2 = new SseNetworkTransport$execute$2(2, continuation);
        sseNetworkTransport$execute$2.p = obj;
        return sseNetworkTransport$execute$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SseNetworkTransport$execute$2) create((ConnectionHandler.MainChannelEvent) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return Boolean.valueOf(!(((ConnectionHandler.MainChannelEvent) this.p) instanceof ConnectionHandler.MainChannelEvent.Complete));
    }
}
