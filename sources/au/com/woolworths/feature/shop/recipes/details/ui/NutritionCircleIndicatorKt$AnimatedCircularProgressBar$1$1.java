package au.com.woolworths.feature.shop.recipes.details.ui;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.recipes.details.ui.NutritionCircleIndicatorKt$AnimatedCircularProgressBar$1$1", f = "NutritionCircleIndicator.kt", l = {81, 82}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class NutritionCircleIndicatorKt$AnimatedCircularProgressBar$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ Animatable q;
    public final /* synthetic */ float r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NutritionCircleIndicatorKt$AnimatedCircularProgressBar$1$1(Animatable animatable, float f, Continuation continuation) {
        super(2, continuation);
        this.q = animatable;
        this.r = f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NutritionCircleIndicatorKt$AnimatedCircularProgressBar$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((NutritionCircleIndicatorKt$AnimatedCircularProgressBar$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0047, code lost:
    
        if (androidx.compose.animation.core.Animatable.d(r11.q, r5, r6, null, null, r11, 12) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r11.p
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L1c
            if (r1 == r2) goto L18
            if (r1 != r3) goto L10
            kotlin.ResultKt.b(r12)
            goto L4a
        L10:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L18:
            kotlin.ResultKt.b(r12)
            goto L2a
        L1c:
            kotlin.ResultKt.b(r12)
            r11.p = r2
            r1 = 1200(0x4b0, double:5.93E-321)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.b(r1, r11)
            if (r12 != r0) goto L2a
            goto L49
        L2a:
            java.lang.Float r5 = new java.lang.Float
            float r12 = r11.r
            r5.<init>(r12)
            r12 = 0
            androidx.compose.animation.core.CubicBezierEasing r1 = androidx.compose.animation.core.EasingKt.f756a
            r2 = 600(0x258, float:8.41E-43)
            androidx.compose.animation.core.TweenSpec r6 = androidx.compose.animation.core.AnimationSpecKt.e(r2, r12, r1, r3)
            r11.p = r3
            androidx.compose.animation.core.Animatable r4 = r11.q
            r7 = 0
            r8 = 0
            r10 = 12
            r9 = r11
            java.lang.Object r12 = androidx.compose.animation.core.Animatable.d(r4, r5, r6, r7, r8, r9, r10)
            if (r12 != r0) goto L4a
        L49:
            return r0
        L4a:
            kotlin.Unit r12 = kotlin.Unit.f24250a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.recipes.details.ui.NutritionCircleIndicatorKt$AnimatedCircularProgressBar$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
