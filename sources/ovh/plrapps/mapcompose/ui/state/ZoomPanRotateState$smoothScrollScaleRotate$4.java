package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.animation.core.AnimationSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$4", f = "ZoomPanRotateState.kt", l = {254, 255, 256}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomPanRotateState$smoothScrollScaleRotate$4 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ZoomPanRotateState q;
    public final /* synthetic */ AnimationSpec r;
    public final /* synthetic */ double s;
    public final /* synthetic */ double t;
    public final /* synthetic */ double u;
    public final /* synthetic */ double v;
    public final /* synthetic */ double w;
    public final /* synthetic */ float x;
    public final /* synthetic */ Ref.FloatRef y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateState$smoothScrollScaleRotate$4(ZoomPanRotateState zoomPanRotateState, AnimationSpec animationSpec, double d, double d2, double d3, double d4, double d5, float f, Ref.FloatRef floatRef, Continuation continuation) {
        super(1, continuation);
        this.q = zoomPanRotateState;
        this.r = animationSpec;
        this.s = d;
        this.t = d2;
        this.u = d3;
        this.v = d4;
        this.w = d5;
        this.x = f;
        this.y = floatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ZoomPanRotateState$smoothScrollScaleRotate$4(this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ZoomPanRotateState$smoothScrollScaleRotate$4) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
    
        if (androidx.compose.animation.core.Animatable.d(r0, r2, r23.r, null, r4, r23, 4) != r7) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            r5 = r23
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r0 = r5.p
            r1 = 3
            r2 = 2
            r3 = 1
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r4 = r5.q
            if (r0 == 0) goto L28
            if (r0 == r3) goto L24
            if (r0 == r2) goto L20
            if (r0 != r1) goto L18
            kotlin.ResultKt.b(r24)
            goto L84
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            kotlin.ResultKt.b(r24)
            goto L47
        L24:
            kotlin.ResultKt.b(r24)
            goto L36
        L28:
            kotlin.ResultKt.b(r24)
            androidx.compose.animation.core.Animatable r0 = r4.A
            r5.p = r3
            java.lang.Object r0 = r0.i(r5)
            if (r0 != r7) goto L36
            goto L83
        L36:
            androidx.compose.animation.core.Animatable r0 = r4.B
            java.lang.Float r3 = new java.lang.Float
            r6 = 0
            r3.<init>(r6)
            r5.p = r2
            java.lang.Object r0 = r0.h(r3, r5)
            if (r0 != r7) goto L47
            goto L83
        L47:
            androidx.compose.animation.core.Animatable r0 = r4.B
            java.lang.Float r2 = new java.lang.Float
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r3)
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$4$1 r4 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$4$1
            float r3 = r5.x
            kotlin.jvm.internal.Ref$FloatRef r6 = r5.y
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r9 = r5.q
            double r10 = r5.s
            double r12 = r5.t
            double r14 = r5.u
            r24 = r2
            double r1 = r5.v
            r22 = r0
            r16 = r1
            double r0 = r5.w
            r18 = r0
            r20 = r3
            r8 = r4
            r21 = r6
            r8.<init>()
            r0 = 3
            r5.p = r0
            androidx.compose.animation.core.AnimationSpec r2 = r5.r
            r3 = 0
            r6 = 4
            r1 = r24
            r0 = r22
            java.lang.Object r0 = androidx.compose.animation.core.Animatable.d(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L84
        L83:
            return r7
        L84:
            kotlin.Unit r0 = kotlin.Unit.f24250a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothScrollScaleRotate$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
