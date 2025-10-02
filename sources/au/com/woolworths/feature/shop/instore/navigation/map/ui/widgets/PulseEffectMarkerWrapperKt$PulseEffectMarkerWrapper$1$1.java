package au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1", f = "PulseEffectMarkerWrapper.kt", l = {60, 61, 81, 82, 84}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public Object p;
    public int q;
    public /* synthetic */ Object r;
    public final /* synthetic */ Animatable s;
    public final /* synthetic */ Animatable t;
    public final /* synthetic */ long u;
    public final /* synthetic */ float v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1(Animatable animatable, Animatable animatable2, long j, float f, Continuation continuation) {
        super(2, continuation);
        this.s = animatable;
        this.t = animatable2;
        this.u = j;
        this.v = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1 pulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1 = new PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1(this.s, this.t, this.u, this.v, continuation);
        pulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1.r = obj;
        return pulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[PHI: r1
  0x0048: PHI (r1v5 kotlinx.coroutines.CoroutineScope) = (r1v9 kotlinx.coroutines.CoroutineScope), (r1v14 kotlinx.coroutines.CoroutineScope) binds: [B:24:0x0085, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[PHI: r1 r12
  0x00a9: PHI (r1v3 kotlinx.coroutines.Deferred) = (r1v8 kotlinx.coroutines.Deferred), (r1v16 kotlinx.coroutines.Deferred) binds: [B:27:0x00a6, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r12v1 kotlinx.coroutines.CoroutineScope) = (r12v2 kotlinx.coroutines.CoroutineScope), (r12v6 kotlinx.coroutines.CoroutineScope) binds: [B:27:0x00a6, B:13:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00c1 -> B:18:0x005a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r14.q
            long r2 = r14.u
            androidx.compose.animation.core.Animatable r4 = r14.t
            androidx.compose.animation.core.Animatable r5 = r14.s
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L52
            if (r1 == r10) goto L4a
            if (r1 == r9) goto L41
            if (r1 == r8) goto L35
            if (r1 == r7) goto L2c
            if (r1 != r6) goto L24
            java.lang.Object r1 = r14.r
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r15)
            goto L5a
        L24:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L2c:
            java.lang.Object r1 = r14.r
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r15)
            goto Lb7
        L35:
            java.lang.Object r1 = r14.p
            kotlinx.coroutines.Deferred r1 = (kotlinx.coroutines.Deferred) r1
            java.lang.Object r12 = r14.r
            kotlinx.coroutines.CoroutineScope r12 = (kotlinx.coroutines.CoroutineScope) r12
            kotlin.ResultKt.b(r15)
            goto La9
        L41:
            java.lang.Object r1 = r14.r
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r15)
        L48:
            r12 = r1
            goto L88
        L4a:
            java.lang.Object r1 = r14.r
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            kotlin.ResultKt.b(r15)
            goto L71
        L52:
            kotlin.ResultKt.b(r15)
            java.lang.Object r15 = r14.r
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            r1 = r15
        L5a:
            boolean r15 = kotlinx.coroutines.CoroutineScopeKt.d(r1)
            if (r15 == 0) goto Lc4
            java.lang.Float r15 = new java.lang.Float
            r12 = 0
            r15.<init>(r12)
            r14.r = r1
            r14.q = r10
            java.lang.Object r15 = r5.h(r15, r14)
            if (r15 != r0) goto L71
            goto Lc3
        L71:
            r15 = 1063675494(0x3f666666, float:0.9)
            long r12 = androidx.compose.ui.graphics.Color.b(r2, r15)
            androidx.compose.ui.graphics.Color r15 = new androidx.compose.ui.graphics.Color
            r15.<init>(r12)
            r14.r = r1
            r14.q = r9
            java.lang.Object r15 = r4.h(r15, r14)
            if (r15 != r0) goto L48
            goto Lc3
        L88:
            au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredRadius$1 r15 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredRadius$1
            float r1 = r14.v
            r15.<init>(r5, r1, r11)
            kotlinx.coroutines.Deferred r15 = kotlinx.coroutines.BuildersKt.a(r12, r11, r15, r8)
            au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredColor$1 r1 = new au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1$deferredColor$1
            r1.<init>(r4, r2, r11)
            kotlinx.coroutines.Deferred r1 = kotlinx.coroutines.BuildersKt.a(r12, r11, r1, r8)
            r14.r = r12
            r14.p = r1
            r14.q = r8
            java.lang.Object r15 = r15.await(r14)
            if (r15 != r0) goto La9
            goto Lc3
        La9:
            r14.r = r12
            r14.p = r11
            r14.q = r7
            java.lang.Object r15 = r1.await(r14)
            if (r15 != r0) goto Lb6
            goto Lc3
        Lb6:
            r1 = r12
        Lb7:
            r14.r = r1
            r14.q = r6
            r12 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r15 = kotlinx.coroutines.DelayKt.b(r12, r14)
            if (r15 != r0) goto L5a
        Lc3:
            return r0
        Lc4:
            kotlin.Unit r15 = kotlin.Unit.f24250a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.widgets.PulseEffectMarkerWrapperKt$PulseEffectMarkerWrapper$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
