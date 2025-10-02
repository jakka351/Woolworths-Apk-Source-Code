package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ Function3 e;
    public final /* synthetic */ FlowCollector f;

    public FlowKt__TransformKt$runningFold$1$1(Ref.ObjectRef objectRef, Function3 function3, FlowCollector flowCollector) {
        this.d = objectRef;
        this.e = function3;
        this.f = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0069, code lost:
    
        if (r6.emit(r7, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r7)
            goto L6c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.q
            java.lang.Object r2 = r0.p
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r2
            kotlin.ResultKt.b(r7)
            goto L56
        L3c:
            kotlin.ResultKt.b(r7)
            kotlin.jvm.internal.Ref$ObjectRef r7 = r5.d
            java.lang.Object r2 = r7.d
            r0.p = r5
            r0.q = r7
            r0.t = r4
            kotlin.jvm.functions.Function3 r4 = r5.e
            java.lang.Object r6 = r4.invoke(r2, r6, r0)
            if (r6 != r1) goto L52
            goto L6b
        L52:
            r2 = r7
            r7 = r6
            r6 = r2
            r2 = r5
        L56:
            r6.d = r7
            kotlinx.coroutines.flow.FlowCollector r6 = r2.f
            kotlin.jvm.internal.Ref$ObjectRef r7 = r2.d
            java.lang.Object r7 = r7.d
            r2 = 0
            r0.p = r2
            r0.q = r2
            r0.t = r3
            java.lang.Object r6 = r6.emit(r7, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
