package au.com.woolworths.compose.utils.effect;

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
@DebugMetadata(c = "au.com.woolworths.compose.utils.effect.ChangedEffectKt$ChangedEffect$1$1", f = "ChangedEffect.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ChangedEffectKt$ChangedEffect$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ Function2 r;
    public final /* synthetic */ MutableState s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangedEffectKt$ChangedEffect$1$1(Function2 function2, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.r = function2;
        this.s = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ChangedEffectKt$ChangedEffect$1$1 changedEffectKt$ChangedEffect$1$1 = new ChangedEffectKt$ChangedEffect$1$1(this.r, this.s, continuation);
        changedEffectKt$ChangedEffect$1$1.q = obj;
        return changedEffectKt$ChangedEffect$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ChangedEffectKt$ChangedEffect$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.q;
            MutableState mutableState = this.s;
            if (((Boolean) mutableState.getD()).booleanValue()) {
                mutableState.setValue(Boolean.FALSE);
            } else {
                this.p = 1;
                if (this.r.invoke(coroutineScope, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
