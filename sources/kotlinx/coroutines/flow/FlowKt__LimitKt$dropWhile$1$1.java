package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    public final /* synthetic */ Ref.BooleanRef d;
    public final /* synthetic */ FlowCollector e;
    public final /* synthetic */ SuspendLambda f;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref.BooleanRef booleanRef, FlowCollector flowCollector, Function2 function2) {
        this.d = booleanRef;
        this.e = flowCollector;
        this.f = (SuspendLambda) function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1) r0
            int r1 = r0.t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.r
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.t
            r3 = 3
            r4 = 2
            kotlin.Unit r5 = kotlin.Unit.f24250a
            r6 = 1
            if (r2 == 0) goto L45
            if (r2 == r6) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.ResultKt.b(r9)
            return r5
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.Object r8 = r0.q
            java.lang.Object r2 = r0.p
            kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1 r2 = (kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1) r2
            kotlin.ResultKt.b(r9)
            goto L69
        L41:
            kotlin.ResultKt.b(r9)
            return r5
        L45:
            kotlin.ResultKt.b(r9)
            kotlin.jvm.internal.Ref$BooleanRef r9 = r7.d
            boolean r9 = r9.d
            if (r9 == 0) goto L59
            r0.t = r6
            kotlinx.coroutines.flow.FlowCollector r9 = r7.e
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L85
            goto L84
        L59:
            r0.p = r7
            r0.q = r8
            r0.t = r4
            kotlin.coroutines.jvm.internal.SuspendLambda r9 = r7.f
            java.lang.Object r9 = r9.invoke(r8, r0)
            if (r9 != r1) goto L68
            goto L84
        L68:
            r2 = r7
        L69:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L85
            kotlin.jvm.internal.Ref$BooleanRef r9 = r2.d
            r9.d = r6
            kotlinx.coroutines.flow.FlowCollector r9 = r2.e
            r2 = 0
            r0.p = r2
            r0.q = r2
            r0.t = r3
            java.lang.Object r8 = r9.emit(r8, r0)
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
