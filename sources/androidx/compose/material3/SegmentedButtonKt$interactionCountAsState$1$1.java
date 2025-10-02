package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableIntState;
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

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1", f = "SegmentedButton.kt", l = {400}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class SegmentedButtonKt$interactionCountAsState$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ InteractionSource q;
    public final /* synthetic */ MutableIntState r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SegmentedButtonKt$interactionCountAsState$1$1(InteractionSource interactionSource, MutableIntState mutableIntState, Continuation continuation) {
        super(2, continuation);
        this.q = interactionSource;
        this.r = mutableIntState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SegmentedButtonKt$interactionCountAsState$1$1(this.q, this.r, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((SegmentedButtonKt$interactionCountAsState$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            Flow flowC = this.q.c();
            final MutableIntState mutableIntState = this.r;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.material3.SegmentedButtonKt$interactionCountAsState$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z = interaction instanceof PressInteraction.Press ? true : interaction instanceof FocusInteraction.Focus;
                    MutableIntState mutableIntState2 = mutableIntState;
                    if (z) {
                        mutableIntState2.i(mutableIntState2.d() + 1);
                    } else {
                        if (interaction instanceof PressInteraction.Release ? true : interaction instanceof FocusInteraction.Unfocus ? true : interaction instanceof PressInteraction.Cancel) {
                            mutableIntState2.i(mutableIntState2.d() - 1);
                        }
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
