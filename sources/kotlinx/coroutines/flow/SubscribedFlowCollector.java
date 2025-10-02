package kotlinx.coroutines.flow;

import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/flow/SubscribedFlowCollector;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {
    public final FlowCollector d;
    public final SuspendLambda e;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(Function2 function2, FlowCollector flowCollector) {
        this.d = flowCollector;
        this.e = (SuspendLambda) function2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = (kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1 r0 = new kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            kotlinx.coroutines.flow.internal.SafeCollector r2 = r0.q
            kotlinx.coroutines.flow.SubscribedFlowCollector r5 = r0.p
            kotlin.ResultKt.b(r8)     // Catch: java.lang.Throwable -> L3c
            goto L5c
        L3c:
            r8 = move-exception
            goto L76
        L3e:
            kotlin.ResultKt.b(r8)
            kotlinx.coroutines.flow.internal.SafeCollector r2 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlinx.coroutines.flow.FlowCollector r8 = r7.d
            kotlin.coroutines.CoroutineContext r6 = r0.getH()
            r2.<init>(r8, r6)
            kotlin.coroutines.jvm.internal.SuspendLambda r8 = r7.e     // Catch: java.lang.Throwable -> L3c
            r0.p = r7     // Catch: java.lang.Throwable -> L3c
            r0.q = r2     // Catch: java.lang.Throwable -> L3c
            r0.t = r5     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r8 = r8.invoke(r2, r0)     // Catch: java.lang.Throwable -> L3c
            if (r8 != r1) goto L5b
            goto L74
        L5b:
            r5 = r7
        L5c:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector r8 = r5.d
            boolean r2 = r8 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector
            if (r2 == 0) goto L75
            kotlinx.coroutines.flow.SubscribedFlowCollector r8 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r8
            r2 = 0
            r0.p = r2
            r0.q = r2
            r0.t = r4
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            return r3
        L76:
            r2.releaseIntercepted()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SubscribedFlowCollector.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        return this.d.emit(obj, continuation);
    }
}
