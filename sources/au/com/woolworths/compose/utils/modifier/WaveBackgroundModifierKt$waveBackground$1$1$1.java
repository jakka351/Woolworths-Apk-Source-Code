package au.com.woolworths.compose.utils.modifier;

import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$waveBackground$1$1$1", f = "WaveBackgroundModifier.kt", l = {225, 227, 232}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WaveBackgroundModifierKt$waveBackground$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ Animatable r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveBackgroundModifierKt$waveBackground$1$1$1(MutableState mutableState, Animatable animatable, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.q = mutableState;
        this.r = animatable;
        this.s = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WaveBackgroundModifierKt$waveBackground$1$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WaveBackgroundModifierKt$waveBackground$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
    
        if (r6.h(r13, r12) == r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0076 -> B:13:0x0029). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r12.p
            r2 = 3
            r3 = 1
            r4 = 2
            if (r1 == 0) goto L26
            if (r1 == r3) goto L22
            if (r1 == r4) goto L1d
            if (r1 != r2) goto L15
            kotlin.ResultKt.b(r13)
            r10 = r12
            goto L94
        L15:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1d:
            kotlin.ResultKt.b(r13)
            r10 = r12
            goto L29
        L22:
            kotlin.ResultKt.b(r13)
            goto L57
        L26:
            kotlin.ResultKt.b(r13)
        L29:
            androidx.compose.runtime.MutableState r13 = r12.q
            java.lang.Object r1 = r13.getD()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r5 = 0
            androidx.compose.animation.core.Animatable r6 = r12.r
            if (r1 == 0) goto L79
            androidx.compose.runtime.MutableState r1 = r12.s
            java.lang.Object r1 = r1.getD()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L79
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r5)
            r12.p = r3
            java.lang.Object r13 = r6.h(r13, r12)
            if (r13 != r0) goto L57
            r10 = r12
            goto L93
        L57:
            java.lang.Float r6 = new java.lang.Float
            r13 = 1086918619(0x40c90fdb, float:6.2831855)
            r6.<init>(r13)
            r7 = 4000(0xfa0, double:1.9763E-320)
            int r13 = (int) r7
            r1 = 0
            androidx.compose.animation.core.b r5 = androidx.compose.animation.core.EasingKt.d
            androidx.compose.animation.core.TweenSpec r7 = androidx.compose.animation.core.AnimationSpecKt.e(r13, r1, r5, r4)
            r12.p = r4
            androidx.compose.animation.core.Animatable r5 = r12.r
            r8 = 0
            r9 = 0
            r11 = 12
            r10 = r12
            java.lang.Object r13 = androidx.compose.animation.core.Animatable.d(r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L29
            goto L93
        L79:
            r10 = r12
            java.lang.Object r13 = r13.getD()
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L94
            java.lang.Float r13 = new java.lang.Float
            r13.<init>(r5)
            r10.p = r2
            java.lang.Object r13 = r6.h(r13, r12)
            if (r13 != r0) goto L94
        L93:
            return r0
        L94:
            kotlin.Unit r13 = kotlin.Unit.f24250a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$waveBackground$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
