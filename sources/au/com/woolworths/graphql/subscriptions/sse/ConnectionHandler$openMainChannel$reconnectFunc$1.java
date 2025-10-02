package au.com.woolworths.graphql.subscriptions.sse;

import au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lau/com/woolworths/graphql/subscriptions/sse/ConnectionHandler$MainChannelEvent;", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$reconnectFunc$1", f = "ConnectionHandler.kt", l = {418, 421}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ConnectionHandler$openMainChannel$reconnectFunc$1 extends SuspendLambda implements Function3<FlowCollector<? super ConnectionHandler.MainChannelEvent>, Throwable, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ FlowCollector q;
    public final /* synthetic */ ConnectionHandler r;
    public final /* synthetic */ FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConnectionHandler$openMainChannel$reconnectFunc$1(ConnectionHandler connectionHandler, FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1, Continuation continuation) {
        super(3, continuation);
        this.r = connectionHandler;
        this.s = flowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ConnectionHandler$openMainChannel$reconnectFunc$1 connectionHandler$openMainChannel$reconnectFunc$1 = new ConnectionHandler$openMainChannel$reconnectFunc$1(this.r, this.s, (Continuation) obj3);
        connectionHandler$openMainChannel$reconnectFunc$1.q = (FlowCollector) obj;
        return connectionHandler$openMainChannel$reconnectFunc$1.invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.u(r1, r7, r6) != r0) goto L28;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x004f -> B:28:0x0056). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0054 -> B:28:0x0056). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r6.p
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            kotlinx.coroutines.flow.FlowCollector r1 = r6.q
            kotlin.ResultKt.b(r7)     // Catch: java.lang.Throwable -> L12
            goto L56
        L12:
            r7 = move-exception
            goto L52
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            kotlinx.coroutines.flow.FlowCollector r1 = r6.q
            kotlin.ResultKt.b(r7)
            goto L45
        L22:
            kotlin.ResultKt.b(r7)
            kotlinx.coroutines.flow.FlowCollector r7 = r6.q
        L27:
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler r1 = r6.r
            au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$SubscriptionsTracker r4 = r1.h
            java.util.concurrent.ConcurrentHashMap r4 = r4.f9034a
            int r4 = r4.size()
            if (r4 <= 0) goto L59
            boolean r4 = r1.o
            if (r4 == 0) goto L59
            long r4 = r1.e
            r6.q = r7
            r6.p = r3
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.b(r4, r6)
            if (r1 != r0) goto L44
            goto L51
        L44:
            r1 = r7
        L45:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1 r7 = r6.s     // Catch: java.lang.Throwable -> L12
            r6.q = r1     // Catch: java.lang.Throwable -> L12
            r6.p = r2     // Catch: java.lang.Throwable -> L12
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.u(r1, r7, r6)     // Catch: java.lang.Throwable -> L12
            if (r7 != r0) goto L56
        L51:
            return r0
        L52:
            boolean r4 = r7 instanceof java.lang.RuntimeException
            if (r4 != 0) goto L58
        L56:
            r7 = r1
            goto L27
        L58:
            throw r7
        L59:
            kotlin.Unit r7 = kotlin.Unit.f24250a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.graphql.subscriptions.sse.ConnectionHandler$openMainChannel$reconnectFunc$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
