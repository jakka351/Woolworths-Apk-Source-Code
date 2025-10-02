package androidx.compose.foundation;

import androidx.compose.foundation.DefaultDebugIndication;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
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
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1", f = "Indication.kt", l = {228}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ DefaultDebugIndication.DefaultDebugIndicationInstance q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance, Continuation continuation) {
        super(2, continuation);
        this.q = defaultDebugIndicationInstance;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final Ref.IntRef intRef = new Ref.IntRef();
            final Ref.IntRef intRef2 = new Ref.IntRef();
            final Ref.IntRef intRef3 = new Ref.IntRef();
            final DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance = this.q;
            Flow flowC = defaultDebugIndicationInstance.r.c();
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.DefaultDebugIndication$DefaultDebugIndicationInstance$onAttach$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z = interaction instanceof PressInteraction.Press;
                    Ref.IntRef intRef4 = intRef3;
                    Ref.IntRef intRef5 = intRef2;
                    Ref.IntRef intRef6 = intRef;
                    boolean z2 = true;
                    if (z) {
                        intRef6.d++;
                    } else if ((interaction instanceof PressInteraction.Release) || (interaction instanceof PressInteraction.Cancel)) {
                        intRef6.d--;
                    } else if (interaction instanceof HoverInteraction.Enter) {
                        intRef5.d++;
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        intRef5.d--;
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        intRef4.d++;
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        intRef4.d--;
                    }
                    boolean z3 = false;
                    boolean z4 = intRef6.d > 0;
                    boolean z5 = intRef5.d > 0;
                    boolean z6 = intRef4.d > 0;
                    DefaultDebugIndication.DefaultDebugIndicationInstance defaultDebugIndicationInstance2 = defaultDebugIndicationInstance;
                    if (defaultDebugIndicationInstance2.s != z4) {
                        defaultDebugIndicationInstance2.s = z4;
                        z3 = true;
                    }
                    if (defaultDebugIndicationInstance2.t != z5) {
                        defaultDebugIndicationInstance2.t = z5;
                        z3 = true;
                    }
                    if (defaultDebugIndicationInstance2.u != z6) {
                        defaultDebugIndicationInstance2.u = z6;
                    } else {
                        z2 = z3;
                    }
                    if (z2) {
                        DrawModifierNodeKt.a(defaultDebugIndicationInstance2);
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
