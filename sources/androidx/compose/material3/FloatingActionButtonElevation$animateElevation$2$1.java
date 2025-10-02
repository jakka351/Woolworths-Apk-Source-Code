package androidx.compose.material3;

import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {548}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FloatingActionButtonElevation$animateElevation$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InteractionSource r;
    public final /* synthetic */ FloatingActionButtonElevationAnimatable s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevation$animateElevation$2$1(InteractionSource interactionSource, FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Continuation continuation) {
        super(2, continuation);
        this.r = interactionSource;
        this.s = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FloatingActionButtonElevation$animateElevation$2$1 floatingActionButtonElevation$animateElevation$2$1 = new FloatingActionButtonElevation$animateElevation$2$1(this.r, this.s, continuation);
        floatingActionButtonElevation$animateElevation$2$1.q = obj;
        return floatingActionButtonElevation$animateElevation$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FloatingActionButtonElevation$animateElevation$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final CoroutineScope coroutineScope = (CoroutineScope) this.q;
            final ArrayList arrayList = new ArrayList();
            Flow flowC = this.r.c();
            final FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1.1

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1", f = "FloatingActionButton.kt", l = {573}, m = "invokeSuspend")
                /* renamed from: androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1$1$1, reason: invalid class name and collision with other inner class name */
                final class C00551 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    public int p;
                    public final /* synthetic */ FloatingActionButtonElevationAnimatable q;
                    public final /* synthetic */ Interaction r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00551(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, Interaction interaction, Continuation continuation) {
                        super(2, continuation);
                        this.q = floatingActionButtonElevationAnimatable;
                        this.r = interaction;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation create(Object obj, Continuation continuation) {
                        return new C00551(this.q, this.r, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ((C00551) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                        int i = this.p;
                        if (i == 0) {
                            ResultKt.b(obj);
                            this.p = 1;
                            if (this.q.a(this.r, this) == coroutineSingletons) {
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

                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    Interaction interaction = (Interaction) obj2;
                    boolean z = interaction instanceof HoverInteraction.Enter;
                    ArrayList arrayList2 = arrayList;
                    if (z) {
                        arrayList2.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList2.remove(((HoverInteraction.Exit) interaction).f922a);
                    } else if (interaction instanceof FocusInteraction.Focus) {
                        arrayList2.add(interaction);
                    } else if (interaction instanceof FocusInteraction.Unfocus) {
                        arrayList2.remove(((FocusInteraction.Unfocus) interaction).f921a);
                    } else if (interaction instanceof PressInteraction.Press) {
                        arrayList2.add(interaction);
                    } else if (interaction instanceof PressInteraction.Release) {
                        arrayList2.remove(((PressInteraction.Release) interaction).f926a);
                    } else if (interaction instanceof PressInteraction.Cancel) {
                        arrayList2.remove(((PressInteraction.Cancel) interaction).f924a);
                    }
                    BuildersKt.c(coroutineScope, null, null, new C00551(floatingActionButtonElevationAnimatable, (Interaction) CollectionsKt.P(arrayList2), null), 3);
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
