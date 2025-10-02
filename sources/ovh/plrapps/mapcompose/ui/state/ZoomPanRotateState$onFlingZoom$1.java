package ovh.plrapps.mapcompose.ui.state;

import com.google.android.gms.wallet.WalletConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFlingZoom$1", f = "ZoomPanRotateState.kt", l = {WalletConstants.ERROR_CODE_MERCHANT_ACCOUNT_ERROR, 407}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class ZoomPanRotateState$onFlingZoom$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ZoomPanRotateState q;
    public final /* synthetic */ float r;
    public final /* synthetic */ long s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomPanRotateState$onFlingZoom$1(ZoomPanRotateState zoomPanRotateState, float f, long j, Continuation continuation) {
        super(2, continuation);
        this.q = zoomPanRotateState;
        this.r = f;
        this.s = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ZoomPanRotateState$onFlingZoom$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ZoomPanRotateState$onFlingZoom$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        if (r1.b(r3, r5, r6, r9) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState r0 = r9.q
            androidx.compose.animation.core.Animatable r1 = r0.z
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r3 = r9.p
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L20
            if (r3 == r5) goto L1c
            if (r3 != r4) goto L14
            kotlin.ResultKt.b(r10)
            goto L50
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            kotlin.ResultKt.b(r10)
            goto L32
        L20:
            kotlin.ResultKt.b(r10)
            java.lang.Float r10 = new java.lang.Float
            r3 = 0
            r10.<init>(r3)
            r9.p = r5
            java.lang.Object r10 = r1.h(r10, r9)
            if (r10 != r2) goto L32
            goto L4f
        L32:
            kotlin.jvm.internal.Ref$FloatRef r10 = new kotlin.jvm.internal.Ref$FloatRef
            r10.<init>()
            java.lang.Float r3 = new java.lang.Float
            float r5 = r9.r
            r3.<init>(r5)
            androidx.compose.animation.core.DecayAnimationSpec r5 = r0.D
            ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFlingZoom$1$1 r6 = new ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFlingZoom$1$1
            long r7 = r9.s
            r6.<init>()
            r9.p = r4
            java.lang.Object r10 = r1.b(r3, r5, r6, r9)
            if (r10 != r2) goto L50
        L4f:
            return r2
        L50:
            kotlin.Unit r10 = kotlin.Unit.f24250a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ovh.plrapps.mapcompose.ui.state.ZoomPanRotateState$onFlingZoom$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
