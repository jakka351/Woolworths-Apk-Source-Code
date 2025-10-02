package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$2", f = "ZoomPanRotateState.kt", l = {215, 216, 217}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomPanRotateState$smoothScrollScaleRotate$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ZoomPanRotateState q;
    public final /* synthetic */ AnimationSpec r;
    public final /* synthetic */ double s;
    public final /* synthetic */ double t;
    public final /* synthetic */ double u;
    public final /* synthetic */ double v;
    public final /* synthetic */ double w;
    public final /* synthetic */ double x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateState$smoothScrollScaleRotate$2(ZoomPanRotateState zoomPanRotateState, AnimationSpec animationSpec, double d, double d2, double d3, double d4, double d5, double d6, Continuation continuation) {
        super(1, continuation);
        this.q = zoomPanRotateState;
        this.r = animationSpec;
        this.s = d;
        this.t = d2;
        this.u = d3;
        this.v = d4;
        this.w = d5;
        this.x = d6;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ZoomPanRotateState$smoothScrollScaleRotate$2(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ZoomPanRotateState$smoothScrollScaleRotate$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0075, code lost:
    
        if (androidx.compose.animation.core.Animatable.d(r0, r2, r22.r, null, r4, r22, 4) != r7) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r5 = r22
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r5.p
            r1 = 3
            r2 = 2
            r3 = 1
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r9 = r5.q
            if (r0 == 0) goto L27
            if (r0 == r3) goto L23
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L17
            kotlin.ResultKt.b(r23)
            goto L78
        L17:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1f:
            kotlin.ResultKt.b(r23)
            goto L46
        L23:
            kotlin.ResultKt.b(r23)
            goto L35
        L27:
            kotlin.ResultKt.b(r23)
            androidx.compose.animation.core.Animatable r0 = r9.A
            r5.p = r3
            java.lang.Object r0 = r0.i(r5)
            if (r0 != r7) goto L35
            goto L77
        L35:
            androidx.compose.animation.core.Animatable r0 = r9.B
            java.lang.Float r3 = new java.lang.Float
            r4 = 0
            r3.<init>(r4)
            r5.p = r2
            java.lang.Object r0 = r0.h(r3, r5)
            if (r0 != r7) goto L46
            goto L77
        L46:
            androidx.compose.animation.core.Animatable r0 = r9.B
            java.lang.Float r2 = new java.lang.Float
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3)
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$2$1 r4 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$2$1
            double r10 = r5.w
            double r12 = r5.x
            r18 = r10
            double r10 = r5.s
            r20 = r12
            double r12 = r5.t
            double r14 = r5.u
            r23 = r2
            double r2 = r5.v
            r16 = r2
            r8 = r4
            r8.<init>()
            r5.p = r1
            androidx.compose.animation.core.AnimationSpec r2 = r5.r
            r3 = 0
            r6 = 4
            r1 = r23
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.d(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L78
        L77:
            return r7
        L78:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
