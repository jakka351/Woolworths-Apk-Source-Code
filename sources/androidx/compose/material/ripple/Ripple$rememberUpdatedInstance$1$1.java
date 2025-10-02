package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1", f = "Ripple.kt", l = {207}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class Ripple$rememberUpdatedInstance$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InteractionSource r;
    public final /* synthetic */ RippleIndicationInstance s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ripple$rememberUpdatedInstance$1$1(InteractionSource interactionSource, RippleIndicationInstance rippleIndicationInstance, Continuation continuation) {
        super(2, continuation);
        this.r = interactionSource;
        this.s = rippleIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Ripple$rememberUpdatedInstance$1$1 ripple$rememberUpdatedInstance$1$1 = new Ripple$rememberUpdatedInstance$1$1(this.r, this.s, continuation);
        ripple$rememberUpdatedInstance$1$1.q = obj;
        return ripple$rememberUpdatedInstance$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ripple$rememberUpdatedInstance$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.q;
            Flow flowC = this.r.c();
            final RippleIndicationInstance rippleIndicationInstance = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.material.ripple.Ripple$rememberUpdatedInstance$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z = interaction instanceof PressInteraction.Press;
                    CoroutineScope coroutineScope2 = coroutineScope;
                    RippleIndicationInstance rippleIndicationInstance2 = rippleIndicationInstance;
                    if (z) {
                        rippleIndicationInstance2.b((PressInteraction.Press) interaction, coroutineScope2);
                    } else if (interaction instanceof PressInteraction.Release) {
                        rippleIndicationInstance2.d(((PressInteraction.Release) interaction).f926a);
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        rippleIndicationInstance2.d(((PressInteraction.Cancel) interaction).f924a);
                    } else {
                        rippleIndicationInstance2.e.b(interaction, coroutineScope2);
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (flowC.collect(flowCollector, this) == coroutineSingletons) {
                return coroutineSingletons;
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
