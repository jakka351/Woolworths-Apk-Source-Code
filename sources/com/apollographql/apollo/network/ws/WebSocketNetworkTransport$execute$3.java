package com.apollographql.apollo.network.ws;

import com.apollographql.apollo.api.ApolloRequest;
import com.apollographql.apollo.network.ws.internal.Event;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/apollographql/apollo/network/ws/internal/Event;", "it"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3", f = "WebSocketNetworkTransport.kt", l = {284, 297}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WebSocketNetworkTransport$execute$3 extends SuspendLambda implements Function3<FlowCollector<? super Event>, Event, Continuation<? super Boolean>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public /* synthetic */ Event r;
    public final /* synthetic */ ApolloRequest s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketNetworkTransport$execute$3(ApolloRequest apolloRequest, Continuation continuation) {
        super(3, continuation);
        this.s = apolloRequest;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        WebSocketNetworkTransport$execute$3 webSocketNetworkTransport$execute$3 = new WebSocketNetworkTransport$execute$3(this.s, (Continuation) obj3);
        webSocketNetworkTransport$execute$3.q = (FlowCollector) obj;
        webSocketNetworkTransport$execute$3.r = (Event) obj2;
        return webSocketNetworkTransport$execute$3.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003b, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
    
        if (r8.emit(r1, r7) == r0) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r7.p
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L1d
            if (r1 == r4) goto L19
            if (r1 != r2) goto L11
            kotlin.ResultKt.b(r8)
            goto L69
        L11:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L19:
            kotlin.ResultKt.b(r8)
            goto L76
        L1d:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.flow.FlowCollector r8 = r7.q
            com.apollographql.apollo.network.ws.internal.Event r1 = r7.r
            boolean r5 = r1 instanceof com.apollographql.apollo.network.ws.internal.OperationComplete
            if (r5 == 0) goto L29
            goto L76
        L29:
            boolean r5 = r1 instanceof com.apollographql.apollo.network.ws.internal.ConnectionReEstablished
            if (r5 == 0) goto L2e
            goto L76
        L2e:
            boolean r5 = r1 instanceof com.apollographql.apollo.network.ws.internal.NetworkError
            r6 = 0
            if (r5 == 0) goto L3e
            r7.q = r6
            r7.p = r4
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L76
            goto L75
        L3e:
            boolean r3 = r1 instanceof com.apollographql.apollo.network.ws.internal.GeneralError
            if (r3 == 0) goto L6b
            com.apollographql.apollo.api.ApolloRequest r8 = r7.s
            com.apollographql.apollo.api.Operation r8 = r8.d
            java.lang.String r8 = r8.name()
            com.apollographql.apollo.network.ws.internal.GeneralError r1 = (com.apollographql.apollo.network.ws.internal.GeneralError) r1
            java.util.Map r0 = r1.f13642a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Received general error while executing operation "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = ": "
            r1.append(r8)
            r1.append(r0)
            java.lang.String r8 = r1.toString()
            java.io.PrintStream r0 = java.lang.System.out
            r0.println(r8)
        L69:
            r3 = r4
            goto L76
        L6b:
            r7.q = r6
            r7.p = r2
            java.lang.Object r8 = r8.emit(r1, r7)
            if (r8 != r0) goto L69
        L75:
            return r0
        L76:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
