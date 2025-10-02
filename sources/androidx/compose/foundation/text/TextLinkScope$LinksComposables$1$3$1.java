package androidx.compose.foundation.text;

import androidx.collection.MutableObjectList;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.SnapshotMutableIntStateImpl;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.text.TextLinkScope$LinksComposables$1$3$1", f = "TextLinkScope.kt", l = {247}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TextLinkScope$LinksComposables$1$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LinkStateInteractionSourceObserver q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextLinkScope$LinksComposables$1$3$1(LinkStateInteractionSourceObserver linkStateInteractionSourceObserver, Continuation continuation) {
        super(2, continuation);
        this.q = linkStateInteractionSourceObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextLinkScope$LinksComposables$1$3$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((TextLinkScope$LinksComposables$1$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        ResultKt.b(obj);
        this.p = 1;
        final LinkStateInteractionSourceObserver linkStateInteractionSourceObserver = this.q;
        linkStateInteractionSourceObserver.getClass();
        final MutableObjectList mutableObjectList = new MutableObjectList();
        Object objCollect = linkStateInteractionSourceObserver.f1122a.c().collect(new FlowCollector() { // from class: androidx.compose.foundation.text.LinkStateInteractionSourceObserver$collectInteractionsForLinks$2
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj2, Continuation continuation) {
                Interaction interaction = (Interaction) obj2;
                boolean z = interaction instanceof HoverInteraction.Enter ? true : interaction instanceof FocusInteraction.Focus ? true : interaction instanceof PressInteraction.Press;
                MutableObjectList mutableObjectList2 = mutableObjectList;
                if (z) {
                    mutableObjectList2.g(interaction);
                } else if (interaction instanceof HoverInteraction.Exit) {
                    mutableObjectList2.k(((HoverInteraction.Exit) interaction).f922a);
                } else if (interaction instanceof FocusInteraction.Unfocus) {
                    mutableObjectList2.k(((FocusInteraction.Unfocus) interaction).f921a);
                } else if (interaction instanceof PressInteraction.Release) {
                    mutableObjectList2.k(((PressInteraction.Release) interaction).f926a);
                } else if (interaction instanceof PressInteraction.Cancel) {
                    mutableObjectList2.k(((PressInteraction.Cancel) interaction).f924a);
                }
                Object[] objArr = mutableObjectList2.f694a;
                int i2 = mutableObjectList2.b;
                int i3 = 0;
                int i4 = 0;
                while (true) {
                    LinkStateInteractionSourceObserver linkStateInteractionSourceObserver2 = linkStateInteractionSourceObserver;
                    if (i3 >= i2) {
                        ((SnapshotMutableIntStateImpl) linkStateInteractionSourceObserver2.b).i(i4);
                        return Unit.f24250a;
                    }
                    Interaction interaction2 = (Interaction) objArr[i3];
                    if (interaction2 instanceof HoverInteraction.Enter) {
                        linkStateInteractionSourceObserver2.getClass();
                        i4 |= 2;
                    } else if (interaction2 instanceof FocusInteraction.Focus) {
                        linkStateInteractionSourceObserver2.getClass();
                        i4 |= 1;
                    } else if (interaction2 instanceof PressInteraction.Press) {
                        linkStateInteractionSourceObserver2.getClass();
                        i4 |= 4;
                    }
                    i3++;
                }
            }
        }, this);
        if (objCollect != coroutineSingletons) {
            objCollect = unit;
        }
        return objCollect == coroutineSingletons ? coroutineSingletons : unit;
    }
}
