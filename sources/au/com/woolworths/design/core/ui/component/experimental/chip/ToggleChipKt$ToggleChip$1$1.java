package au.com.woolworths.design.core.ui.component.experimental.chip;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.design.core.ui.component.experimental.chip.ToggleChipKt$ToggleChip$1$1", f = "ToggleChip.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ToggleChipKt$ToggleChip$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MutableState q;
    public final /* synthetic */ MutableFloatState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToggleChipKt$ToggleChip$1$1(MutableFloatState mutableFloatState, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.q = mutableState;
        this.r = mutableFloatState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ToggleChipKt$ToggleChip$1$1(this.r, this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ToggleChipKt$ToggleChip$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        MutableState mutableState = this.q;
        if (i == 0) {
            ResultKt.b(obj);
            if (!((Boolean) mutableState.getD()).booleanValue()) {
                KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
                keyframesSpecConfig.f765a = 200;
                keyframesSpecConfig.a(100, Float.valueOf(0.5f));
                KeyframesSpec keyframesSpec = new KeyframesSpec(keyframesSpecConfig);
                e eVar = new e(this.r, 0);
                this.p = 1;
                if (SuspendAnimationKt.c(1.0f, 1.0f, keyframesSpec, eVar, this, 4) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        mutableState.setValue(Boolean.FALSE);
        return Unit.f24250a;
    }
}
