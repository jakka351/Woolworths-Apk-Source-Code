package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlowKt__LogicKt$all$$inlined$collectWhile$1 implements FlowCollector<Object> {
    public final /* synthetic */ Ref.BooleanRef d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1", f = "Logic.kt", l = {132}, m = "emit")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public FlowKt__LogicKt$all$$inlined$collectWhile$1 p;
        public /* synthetic */ Object q;
        public int r;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.q = obj;
            this.r |= Integer.MIN_VALUE;
            FlowKt__LogicKt$all$$inlined$collectWhile$1.this.emit(null, this);
            return Unit.f24250a;
        }
    }

    public FlowKt__LogicKt$all$$inlined$collectWhile$1(Ref.BooleanRef booleanRef) {
        this.d = booleanRef;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(java.lang.Object r4, kotlin.coroutines.Continuation r5) {
        /*
            r3 = this;
            boolean r4 = r5 instanceof kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1.AnonymousClass1
            if (r4 == 0) goto L13
            r4 = r5
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1 r4 = (kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1.AnonymousClass1) r4
            int r0 = r4.r
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.r = r0
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1 r4 = new kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1$1
            r4.<init>(r5)
        L18:
            java.lang.Object r5 = r4.q
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r4.r
            r1 = 1
            if (r0 == 0) goto L47
            if (r0 != r1) goto L3f
            kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1 r4 = r4.p
            kotlin.ResultKt.b(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L34
            kotlin.jvm.internal.Ref$BooleanRef r0 = r4.d
            r0.d = r1
        L34:
            if (r5 == 0) goto L39
            kotlin.Unit r4 = kotlin.Unit.f24250a
            return r4
        L39:
            kotlinx.coroutines.flow.internal.AbortFlowException r5 = new kotlinx.coroutines.flow.internal.AbortFlowException
            r5.<init>(r4)
            throw r5
        L3f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L47:
            kotlin.ResultKt.b(r5)
            r4.p = r3
            r4.r = r1
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LogicKt$all$$inlined$collectWhile$1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
