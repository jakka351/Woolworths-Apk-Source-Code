package com.apollographql.apollo.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"com/apollographql/apollo/internal/FlowsKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "apollo-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 implements FlowCollector<Object> {
    public final /* synthetic */ Function3 d;
    public final /* synthetic */ FlowCollector e;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "flows.kt", l = {35}, m = "emit")
    /* renamed from: com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object p;
        public int q;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.p = obj;
            this.q |= Integer.MIN_VALUE;
            return FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(Function3 function3, FlowCollector flowCollector) {
        this.d = function3;
        this.e = flowCollector;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 r0 = (com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.AnonymousClass1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1 r0 = new com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.b(r6)
            r0.q = r3
            kotlin.jvm.functions.Function3 r6 = r4.d
            kotlinx.coroutines.flow.FlowCollector r2 = r4.e
            java.lang.Object r6 = r6.invoke(r2, r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 == 0) goto L4a
            kotlin.Unit r5 = kotlin.Unit.f24250a
            return r5
        L4a:
            com.apollographql.apollo.internal.AbortFlowException r5 = new com.apollographql.apollo.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apollographql.apollo.internal.FlowsKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
