package com.apollographql.apollo.network.ws;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2", f = "GraphQLWsProtocol.kt", l = {103}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class GraphQLWsProtocol$run$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Map p;
    public int q;
    public final /* synthetic */ GraphQLWsProtocol r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphQLWsProtocol$run$2(GraphQLWsProtocol graphQLWsProtocol, Continuation continuation) {
        super(2, continuation);
        this.r = graphQLWsProtocol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GraphQLWsProtocol$run$2(this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((GraphQLWsProtocol$run$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        return CoroutineSingletons.d;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003d -> B:12:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.q
            r2 = 1
            com.apollographql.apollo.network.ws.GraphQLWsProtocol r3 = r6.r
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.util.Map r1 = r6.p
            java.util.Map r1 = (java.util.Map) r1
            kotlin.ResultKt.b(r7)
            goto L40
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.b(r7)
            kotlin.Pair r7 = new kotlin.Pair
            java.lang.String r1 = "type"
            java.lang.String r4 = "ping"
            r7.<init>(r1, r4)
            kotlin.Pair[] r7 = new kotlin.Pair[]{r7}
            java.util.LinkedHashMap r7 = kotlin.collections.MapsKt.l(r7)
            r1 = r7
        L30:
            long r4 = r3.e
            r7 = r1
            java.util.Map r7 = (java.util.Map) r7
            r6.p = r7
            r6.q = r2
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r7 != r0) goto L40
            return r0
        L40:
            com.apollographql.apollo.network.ws.WsFrameType r7 = r3.f
            r3.g(r1, r7)
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.network.ws.GraphQLWsProtocol$run$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
