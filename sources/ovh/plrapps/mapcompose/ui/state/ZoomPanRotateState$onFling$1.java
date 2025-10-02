package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.animation.core.DecayAnimationSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFling$1", f = "ZoomPanRotateState.kt", l = {386, 389}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomPanRotateState$onFling$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ZoomPanRotateState q;
    public final /* synthetic */ float r;
    public final /* synthetic */ float s;
    public final /* synthetic */ DecayAnimationSpec t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateState$onFling$1(ZoomPanRotateState zoomPanRotateState, float f, float f2, DecayAnimationSpec decayAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.q = zoomPanRotateState;
        this.r = f;
        this.s = f2;
        this.t = decayAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoomPanRotateState$onFling$1(this.q, this.r, this.s, this.t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomPanRotateState$onFling$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r6.b(r14, r13.t, r0, r13) == r7) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r1 = r13.q
            androidx.compose.animation.core.Animatable r6 = r1.A
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r13.p
            r8 = 2
            r2 = 1
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r8) goto L14
            kotlin.ResultKt.b(r14)
            goto L66
        L14:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1c:
            kotlin.ResultKt.b(r14)
            goto L33
        L20:
            kotlin.ResultKt.b(r14)
            androidx.compose.ui.geometry.Offset r14 = new androidx.compose.ui.geometry.Offset
            r3 = 0
            r14.<init>(r3)
            r13.p = r2
            java.lang.Object r14 = r6.h(r14, r13)
            if (r14 != r7) goto L33
            goto L65
        L33:
            androidx.compose.runtime.MutableDoubleState r14 = r1.n
            androidx.compose.runtime.SnapshotMutableDoubleStateImpl r14 = (androidx.compose.runtime.SnapshotMutableDoubleStateImpl) r14
            double r2 = r14.f()
            androidx.compose.runtime.MutableDoubleState r14 = r1.o
            androidx.compose.runtime.SnapshotMutableDoubleStateImpl r14 = (androidx.compose.runtime.SnapshotMutableDoubleStateImpl) r14
            double r4 = r14.f()
            float r14 = r13.r
            float r0 = r13.s
            long r9 = androidx.compose.ui.geometry.OffsetKt.a(r14, r0)
            r11 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r9 = r9 ^ r11
            androidx.compose.ui.geometry.Offset r14 = new androidx.compose.ui.geometry.Offset
            r14.<init>(r9)
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFling$1$1 r0 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFling$1$1
            r0.<init>()
            r13.p = r8
            androidx.compose.animation.core.DecayAnimationSpec r1 = r13.t
            java.lang.Object r14 = r6.b(r14, r1, r0, r13)
            if (r14 != r7) goto L66
        L65:
            return r7
        L66:
            kotlin.Unit r14 = kotlin.Unit.f24250a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFling$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
