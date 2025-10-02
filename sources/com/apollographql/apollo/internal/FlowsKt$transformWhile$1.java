package com.apollographql.apollo.internal;

import com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1", f = "flows.kt", l = {61}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class FlowsKt$transformWhile$1 extends SuspendLambda implements Function2<FlowCollector<Object>, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ WebSocketNetworkTransport$execute$$inlined$filter$1 r;
    public final /* synthetic */ Function3 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowsKt$transformWhile$1(WebSocketNetworkTransport$execute$$inlined$filter$1 webSocketNetworkTransport$execute$$inlined$filter$1, Function3 function3, Continuation continuation) {
        super(2, continuation);
        this.r = webSocketNetworkTransport$execute$$inlined$filter$1;
        this.s = function3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowsKt$transformWhile$1 flowsKt$transformWhile$1 = new FlowsKt$transformWhile$1(this.r, this.s, continuation);
        flowsKt$transformWhile$1.q = obj;
        return flowsKt$transformWhile$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowsKt$transformWhile$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.p
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r5.q
            com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r0
            kotlin.ResultKt.b(r6)     // Catch: com.apollographql.apollo.internal.AbortFlowException -> L11
            goto L46
        L11:
            r6 = move-exception
            goto L3d
        L13:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1b:
            kotlin.ResultKt.b(r6)
            java.lang.Object r6 = r5.q
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            com.apollographql.apollo.network.ws.WebSocketNetworkTransport$execute$$inlined$filter$1 r1 = r5.r
            com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r3 = new com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
            kotlin.jvm.functions.Function3 r4 = r5.s
            r3.<init>(r4, r6)
            com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2 r6 = new com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$2     // Catch: com.apollographql.apollo.internal.AbortFlowException -> L3b
            r6.<init>()     // Catch: com.apollographql.apollo.internal.AbortFlowException -> L3b
            r5.q = r3     // Catch: com.apollographql.apollo.internal.AbortFlowException -> L3b
            r5.p = r2     // Catch: com.apollographql.apollo.internal.AbortFlowException -> L3b
            java.lang.Object r6 = r1.collect(r6, r5)     // Catch: com.apollographql.apollo.internal.AbortFlowException -> L3b
            if (r6 != r0) goto L46
            return r0
        L3b:
            r6 = move-exception
            r0 = r3
        L3d:
            java.lang.String r1 = "owner"
            kotlin.jvm.internal.Intrinsics.h(r0, r1)
            kotlinx.coroutines.flow.FlowCollector r1 = r6.d
            if (r1 != r0) goto L49
        L46:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L49:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.internal.FlowsKt$transformWhile$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
