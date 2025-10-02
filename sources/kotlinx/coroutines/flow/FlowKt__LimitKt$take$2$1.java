package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    public final /* synthetic */ Ref.IntRef d;
    public final /* synthetic */ FlowCollector e;
    public final /* synthetic */ Object f;

    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, FlowCollector flowCollector, Object obj) {
        this.d = intRef;
        this.e = flowCollector;
        this.f = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1) r0
            int r1 = r0.r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.r = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.r
            kotlin.Unit r3 = kotlin.Unit.f24250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            kotlin.ResultKt.b(r8)
            return r3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.b(r8)
            return r3
        L38:
            kotlin.ResultKt.b(r8)
            kotlin.jvm.internal.Ref$IntRef r8 = r6.d
            int r2 = r8.d
            int r2 = r2 + r5
            r8.d = r2
            kotlinx.coroutines.flow.FlowCollector r8 = r6.e
            if (r2 >= r5) goto L50
            r0.r = r5
            java.lang.Object r7 = r8.emit(r7, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            return r3
        L50:
            r0.r = r4
            java.lang.Object r2 = r6.f
            kotlinx.coroutines.flow.FlowKt__LimitKt.a(r8, r7, r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
