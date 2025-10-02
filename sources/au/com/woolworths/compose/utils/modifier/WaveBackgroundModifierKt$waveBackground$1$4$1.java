package au.com.woolworths.compose.utils.modifier;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$waveBackground$1$4$1", f = "WaveBackgroundModifier.kt", l = {255}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class WaveBackgroundModifierKt$waveBackground$1$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableFloatState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WaveBackgroundModifierKt$waveBackground$1$4$1(MutableFloatState mutableFloatState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = mutableState;
        this.r = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WaveBackgroundModifierKt$waveBackground$1$4$1(this.r, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((WaveBackgroundModifierKt$waveBackground$1$4$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x002e -> B:14:0x0031). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
            int r1 = r5.p
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            kotlin.ResultKt.b(r6)
            goto L31
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            kotlin.ResultKt.b(r6)
        L18:
            androidx.compose.runtime.MutableState r6 = r5.q
            java.lang.Object r6 = r6.getD()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L42
            r5.p = r2
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.b(r3, r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            androidx.compose.runtime.MutableFloatState r6 = r5.r
            float r1 = r6.a()
            r3 = 981668463(0x3a83126f, float:0.001)
            float r1 = r1 + r3
            r3 = 1135869952(0x43b40000, float:360.0)
            float r1 = r1 % r3
            r6.p(r1)
            goto L18
        L42:
            kotlin.Unit r6 = kotlin.Unit.f24250a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.compose.utils.modifier.WaveBackgroundModifierKt$waveBackground$1$4$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
