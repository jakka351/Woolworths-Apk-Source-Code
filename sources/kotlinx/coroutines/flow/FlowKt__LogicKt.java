package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
@SourceDebugExtension
/* loaded from: classes7.dex */
final /* synthetic */ class FlowKt__LogicKt {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r5) {
        /*
            boolean r0 = r5 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$any$1
            if (r0 == 0) goto L13
            r0 = r5
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$1 r0 = (kotlinx.coroutines.flow.FlowKt__LogicKt$any$1) r0
            int r1 = r0.s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$1 r0 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r0.s
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1 r1 = r0.q
            kotlin.jvm.internal.Ref$BooleanRef r2 = r0.p
            kotlin.ResultKt.b(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L2b
            goto L59
        L2b:
            r5 = move-exception
            goto L4e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L35:
            kotlin.ResultKt.b(r5)
            kotlin.jvm.internal.Ref$BooleanRef r5 = new kotlin.jvm.internal.Ref$BooleanRef
            r5.<init>()
            kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1 r1 = new kotlinx.coroutines.flow.FlowKt__LogicKt$any$$inlined$collectWhile$1
            r1.<init>(r5)
            r0.p = r5     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.q = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r0.s = r2     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L4a
            r5 = 0
            throw r5
        L4a:
            r2 = move-exception
            r4 = r2
            r2 = r5
            r5 = r4
        L4e:
            java.lang.Object r3 = r5.d
            if (r3 != r1) goto L60
            kotlin.coroutines.CoroutineContext r5 = r0.getD()
            kotlinx.coroutines.JobKt.e(r5)
        L59:
            boolean r5 = r2.d
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L60:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
