package ovh.plrapps.mapcompose.ui.state;

import androidx.compose.animation.core.TweenSpec;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;

@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothRotateTo$2", f = "ZoomPanRotateState.kt", l = {164, 165}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomPanRotateState$smoothRotateTo$2 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public float p;
    public Ref.FloatRef q;
    public int r;
    public final /* synthetic */ ZoomPanRotateState s;
    public final /* synthetic */ float t;
    public final /* synthetic */ TweenSpec u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateState$smoothRotateTo$2(ZoomPanRotateState zoomPanRotateState, float f, TweenSpec tweenSpec, Continuation continuation) {
        super(1, continuation);
        this.s = zoomPanRotateState;
        this.t = f;
        this.u = tweenSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ZoomPanRotateState$smoothRotateTo$2(this.s, this.t, this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((ZoomPanRotateState$smoothRotateTo$2) create((Continuation) obj)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0084, code lost:
    
        if (androidx.compose.animation.core.Animatable.d(r5, r6, r12.u, null, r9, r12, 4) == r0) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.r
            r2 = 2
            r3 = 1
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r4 = r12.s
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            kotlin.ResultKt.b(r13)
            goto L87
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            float r1 = r12.p
            kotlin.jvm.internal.Ref$FloatRef r3 = r12.q
            kotlin.ResultKt.b(r13)
            goto L68
        L23:
            kotlin.ResultKt.b(r13)
            androidx.compose.runtime.MutableFloatState r13 = r4.m
            androidx.compose.runtime.SnapshotMutableFloatStateImpl r13 = (androidx.compose.runtime.SnapshotMutableFloatStateImpl) r13
            float r1 = r13.a()
            kotlin.jvm.internal.Ref$FloatRef r13 = new kotlin.jvm.internal.Ref$FloatRef
            r13.<init>()
            float r5 = r12.t
            r6 = 360(0x168, float:5.04E-43)
            float r7 = (float) r6
            float r5 = r5 % r7
            r13.d = r5
            float r5 = r5 - r1
            float r5 = java.lang.Math.abs(r5)
            r7 = 1127481344(0x43340000, float:180.0)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L52
            float r5 = r13.d
            int r7 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r7 <= 0) goto L4e
            r6 = -360(0xfffffffffffffe98, float:NaN)
        L4e:
            float r6 = (float) r6
            float r5 = r5 + r6
            r13.d = r5
        L52:
            androidx.compose.animation.core.Animatable r5 = r4.B
            java.lang.Float r6 = new java.lang.Float
            r7 = 0
            r6.<init>(r7)
            r12.q = r13
            r12.p = r1
            r12.r = r3
            java.lang.Object r3 = r5.h(r6, r12)
            if (r3 != r0) goto L67
            goto L86
        L67:
            r3 = r13
        L68:
            androidx.compose.animation.core.Animatable r5 = r4.B
            java.lang.Float r6 = new java.lang.Float
            r13 = 1065353216(0x3f800000, float:1.0)
            r6.<init>(r13)
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothRotateTo$2$1 r9 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothRotateTo$2$1
            r9.<init>()
            r13 = 0
            r12.q = r13
            r12.r = r2
            androidx.compose.animation.core.TweenSpec r7 = r12.u
            r8 = 0
            r11 = 4
            r10 = r12
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.d(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L87
        L86:
            return r0
        L87:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$smoothRotateTo$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
