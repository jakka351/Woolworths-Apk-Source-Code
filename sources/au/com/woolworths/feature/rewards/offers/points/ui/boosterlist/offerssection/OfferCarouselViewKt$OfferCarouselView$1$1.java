package au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection;

import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotStateKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferCarouselViewKt$OfferCarouselView$1$1", f = "OfferCarouselView.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class OfferCarouselViewKt$OfferCarouselView$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PagerState q;
    public final /* synthetic */ Function0 r;
    public final /* synthetic */ Function1 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OfferCarouselViewKt$OfferCarouselView$1$1(PagerState pagerState, Function0 function0, Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.q = pagerState;
        this.r = function0;
        this.s = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OfferCarouselViewKt$OfferCarouselView$1$1(this.q, this.r, this.s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((OfferCarouselViewKt$OfferCarouselView$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            final PagerState pagerState = this.q;
            Flow flowM = SnapshotStateKt.m(new b(pagerState, 0));
            final Function0 function0 = this.r;
            final Function1 function1 = this.s;
            FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.rewards.offers.points.ui.boosterlist.offerssection.OfferCarouselViewKt$OfferCarouselView$1$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj2, Continuation continuation) {
                    boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                    if (zBooleanValue) {
                        function0.invoke();
                    } else {
                        if (zBooleanValue) {
                            throw new NoWhenBranchMatchedException();
                        }
                        PagerState pagerState2 = pagerState;
                        function1.invoke(Boolean.valueOf(pagerState2.j() == pagerState2.m() - 1));
                    }
                    return Unit.f24250a;
                }
            };
            this.p = 1;
            if (((AbstractFlow) flowM).collect(flowCollector, this) == coroutineSingletons) {
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
