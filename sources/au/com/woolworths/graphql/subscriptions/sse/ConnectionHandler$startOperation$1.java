package au.com.woolworths.graphql.subscriptions.sse;

import com.apollographql.apollo.api.ApolloRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$startOperation$1", f = "ConnectionHandler.kt", l = {120, 122}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$startOperation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ConnectionHandler q;
    public final /* synthetic */ ApolloRequest r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$startOperation$1(ConnectionHandler connectionHandler, ApolloRequest apolloRequest, Continuation continuation) {
        super(2, continuation);
        this.q = connectionHandler;
        this.r = apolloRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConnectionHandler$startOperation$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ConnectionHandler$startOperation$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r7.f(r0, r10, r9) == r2) goto L27;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.apollographql.apollo.api.ApolloRequest r0 = r9.r
            java.util.UUID r1 = r0.e
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r9.p
            r4 = 2
            r5 = 1
            java.lang.String r6 = "toString(...)"
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler r7 = r9.q
            if (r3 == 0) goto L29
            if (r3 == r5) goto L25
            if (r3 != r4) goto L1d
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            goto L91
        L19:
            r10 = move-exception
            goto L59
        L1b:
            r10 = move-exception
            goto L79
        L1d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L25:
            kotlin.ResultKt.b(r10)     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            goto L36
        L29:
            kotlin.ResultKt.b(r10)
            r9.p = r5     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            r10 = 0
            java.lang.Object r10 = r7.c(r10, r9)     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            if (r10 != r2) goto L36
            goto L58
        L36:
            au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage$Response$ConnectionData r10 = (au.com.woolworths.graphql.subscriptions.sse.data.SseTransportMessage.Response.ConnectionData) r10     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger r3 = r7.c     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            if (r3 == 0) goto L50
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            kotlin.jvm.internal.Intrinsics.g(r5, r6)     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            au.com.woolworths.android.onesite.logging.dynatrace.DynatraceAction r3 = r3.b     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            if (r3 == 0) goto L50
            java.lang.String r8 = "New subscription created - "
            java.lang.String r5 = r8.concat(r5)     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            r3.c(r5)     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
        L50:
            r9.p = r4     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            java.lang.Object r10 = r7.f(r0, r10, r9)     // Catch: java.lang.Throwable -> L19 com.apollographql.apollo.exception.ApolloException -> L1b
            if (r10 != r2) goto L91
        L58:
            return r2
        L59:
            com.apollographql.apollo.exception.DefaultApolloException r0 = new com.apollographql.apollo.exception.DefaultApolloException
            java.lang.String r2 = "Connection handler caught a Throwable"
            r0.<init>(r2, r10)
            au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger r10 = r7.c
            if (r10 == 0) goto L67
            r10.a(r0)
        L67:
            kotlinx.coroutines.flow.SharedFlowImpl r10 = r7.p
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Error r2 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Error
            java.lang.String r1 = r1.toString()
            kotlin.jvm.internal.Intrinsics.g(r1, r6)
            r2.<init>(r1, r0)
            r10.f(r2)
            goto L91
        L79:
            au.com.woolworths.android.onesite.logging.dynatrace.ApolloSseTransportDynatraceLogger r0 = r7.c
            if (r0 == 0) goto L80
            r0.a(r10)
        L80:
            kotlinx.coroutines.flow.SharedFlowImpl r0 = r7.p
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Error r2 = new au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$MainChannelEvent$Error
            java.lang.String r1 = r1.toString()
            kotlin.jvm.internal.Intrinsics.g(r1, r6)
            r2.<init>(r1, r10)
            r0.f(r2)
        L91:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$startOperation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
