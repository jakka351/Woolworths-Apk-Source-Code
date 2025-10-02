package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1 implements Flow<List<Object>> {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 120}, m = "collect")
    /* renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends ContinuationImpl {
        public /* synthetic */ Object p;
        public int q;
        public FlowCollector s;
        public Ref.ObjectRef t;

        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.p = obj;
            this.q |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.q = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.p
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r2 = r0.q
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L50
            r6 = 2
            if (r2 == r3) goto L33
            if (r2 != r6) goto L2b
            kotlin.ResultKt.b(r7)
            goto L4d
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            kotlin.jvm.internal.Ref$ObjectRef r2 = r0.t
            kotlinx.coroutines.flow.FlowCollector r3 = r0.s
            kotlin.ResultKt.b(r7)
            java.lang.Object r7 = r2.d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            if (r7 == 0) goto L4d
            r0.s = r4
            r0.t = r4
            r0.q = r6
            java.lang.Object r6 = r3.emit(r7, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        L50:
            kotlin.jvm.internal.Ref$ObjectRef r7 = androidx.camera.core.impl.b.x(r7)
            r0.s = r6
            r0.t = r7
            r0.q = r3
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
