package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "singleOrNull")
/* loaded from: classes7.dex */
final class FlowKt__ReduceKt$singleOrNull$1<T> extends ContinuationImpl {
    public Ref.ObjectRef p;
    public FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 q;
    public /* synthetic */ Object r;
    public int s;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6, types: [kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            r6.r = r7
            int r0 = r6.s
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r6.s = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            r1 = 0
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.flow.internal.NullSurrogateKt.f24716a
            r3 = 1
            if (r0 == 0) goto L26
            if (r0 != r3) goto L1e
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r0 = r6.q
            kotlin.jvm.internal.Ref$ObjectRef r3 = r6.p
            kotlin.ResultKt.b(r7)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L1c
            goto L47
        L1c:
            r7 = move-exception
            goto L3c
        L1e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L26:
            kotlin.jvm.internal.Ref$ObjectRef r7 = androidx.camera.core.impl.b.x(r7)
            r7.d = r2
            kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1 r0 = new kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
            r0.<init>()
            r6.p = r7     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            r6.q = r0     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            r6.s = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L38
            throw r1
        L38:
            r3 = move-exception
            r5 = r3
            r3 = r7
            r7 = r5
        L3c:
            java.lang.Object r4 = r7.d
            if (r4 != r0) goto L4e
            kotlin.coroutines.CoroutineContext r7 = r6.getE()
            kotlinx.coroutines.JobKt.e(r7)
        L47:
            java.lang.Object r7 = r3.d
            if (r7 != r2) goto L4c
            goto L4d
        L4c:
            r1 = r7
        L4d:
            return r1
        L4e:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
