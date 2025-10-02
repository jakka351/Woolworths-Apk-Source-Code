package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceContentBinding;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedContract;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment$onCreateView$2$2", f = "MarketplacePersonalisedFragment.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplacePersonalisedFragment$onCreateView$2$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplacePersonalisedFragment q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment$onCreateView$2$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<MarketplacePersonalisedContract.ViewState, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            MarketplacePersonalisedContract.ViewState viewState = (MarketplacePersonalisedContract.ViewState) obj;
            MarketplacePersonalisedFragment marketplacePersonalisedFragment = (MarketplacePersonalisedFragment) this.d;
            FragmentMarketplaceContentBinding fragmentMarketplaceContentBinding = marketplacePersonalisedFragment.n;
            Intrinsics.e(fragmentMarketplaceContentBinding);
            fragmentMarketplaceContentBinding.M(Boolean.valueOf(viewState.f7507a));
            ((MarketplacePersonalisedEpoxyController) marketplacePersonalisedFragment.o.getD()).setData(viewState.b, viewState.c, viewState.d);
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplacePersonalisedFragment$onCreateView$2$2(MarketplacePersonalisedFragment marketplacePersonalisedFragment, Continuation continuation) {
        super(2, continuation);
        this.q = marketplacePersonalisedFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplacePersonalisedFragment$onCreateView$2$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplacePersonalisedFragment$onCreateView$2$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MarketplacePersonalisedFragment marketplacePersonalisedFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, marketplacePersonalisedFragment, MarketplacePersonalisedFragment.class, "updateView", "updateView(Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$ViewState;)V", 4), FlowExtKt.a(marketplacePersonalisedFragment.I1().l, marketplacePersonalisedFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
            this.p = 1;
            if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
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
