package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.node.DrawModifierNodeKt;
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
@DebugMetadata(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", l = {364}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class RippleNode$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RippleNode r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleNode$onAttach$1(RippleNode rippleNode, Continuation continuation) {
        super(2, continuation);
        this.r = rippleNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RippleNode$onAttach$1 rippleNode$onAttach$1 = new RippleNode$onAttach$1(this.r, continuation);
        rippleNode$onAttach$1.q = obj;
        return rippleNode$onAttach$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RippleNode$onAttach$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.q;
            final RippleNode rippleNode = this.r;
            Flow flowC = rippleNode.r.c();
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.material.ripple.RippleNode$onAttach$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z = interaction instanceof PressInteraction;
                    RippleNode rippleNode2 = rippleNode;
                    if (!z) {
                        StateLayer stateLayer = rippleNode2.w;
                        if (stateLayer == null) {
                            stateLayer = new StateLayer(rippleNode2.s, rippleNode2.v);
                            DrawModifierNodeKt.a(rippleNode2);
                            rippleNode2.w = stateLayer;
                        }
                        stateLayer.b(interaction, coroutineScope);
                    } else if (rippleNode2.z) {
                        rippleNode2.u2((PressInteraction) interaction);
                    } else {
                        rippleNode2.A.g(interaction);
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
