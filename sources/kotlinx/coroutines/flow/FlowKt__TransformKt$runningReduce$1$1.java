package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import me.oriient.ipssdk.common.ofs.f0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector {
    public final /* synthetic */ Ref.ObjectRef d;
    public final /* synthetic */ f0 e;
    public final /* synthetic */ FlowCollector f;

    public FlowKt__TransformKt$runningReduce$1$1(Ref.ObjectRef objectRef, f0 f0Var, FlowCollector flowCollector) {
        this.d = objectRef;
        this.e = f0Var;
        this.f = flowCollector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r8.emit(r9, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.b(r9)
            goto L75
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            kotlin.jvm.internal.Ref$ObjectRef r8 = r0.q
            java.lang.Object r2 = r0.p
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) r2
            kotlin.ResultKt.b(r9)
            goto L5c
        L3c:
            kotlin.ResultKt.b(r9)
            kotlin.jvm.internal.Ref$ObjectRef r9 = r7.d
            java.lang.Object r2 = r9.d
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f24716a
            if (r2 != r5) goto L49
            r2 = r7
            goto L5f
        L49:
            r0.p = r7
            r0.q = r9
            r0.t = r4
            me.oriient.ipssdk.common.ofs.f0 r4 = r7.e
            java.lang.Object r8 = r4.invoke(r2, r8, r0)
            if (r8 != r1) goto L58
            goto L74
        L58:
            r2 = r9
            r9 = r8
            r8 = r2
            r2 = r7
        L5c:
            r6 = r9
            r9 = r8
            r8 = r6
        L5f:
            r9.d = r8
            kotlinx.coroutines.flow.FlowCollector r8 = r2.f
            kotlin.jvm.internal.Ref$ObjectRef r9 = r2.d
            java.lang.Object r9 = r9.d
            r2 = 0
            r0.p = r2
            r0.q = r2
            r0.t = r3
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r8 = kotlin.Unit.f24250a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
