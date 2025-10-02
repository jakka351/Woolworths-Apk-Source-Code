package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.marketplace.data.models.Marketplace;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalised;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceViewModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment$onCreateView$2$1", f = "MarketplacePersonalisedFragment.kt", l = {94}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplacePersonalisedFragment$onCreateView$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplacePersonalisedFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment$onCreateView$2$1$1", f = "MarketplacePersonalisedFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment$onCreateView$2$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<MarketplaceContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ MarketplacePersonalisedFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarketplacePersonalisedFragment marketplacePersonalisedFragment, Continuation continuation) {
            super(2, continuation);
            this.q = marketplacePersonalisedFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.q, continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((MarketplaceContract.ViewState) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            MarketplaceContract.ViewState viewState = (MarketplaceContract.ViewState) this.p;
            MarketplacePersonalisedViewModel marketplacePersonalisedViewModelI1 = this.q.I1();
            Marketplace marketplace = viewState.f7493a;
            MarketplacePersonalised marketplacePersonalisedQ6 = marketplace != null ? MarketplacePersonalisedViewModel.q6(marketplace) : null;
            if (marketplacePersonalisedQ6 == null) {
                marketplacePersonalisedViewModelI1.p6();
            } else {
                marketplacePersonalisedViewModelI1.s6(marketplacePersonalisedViewModelI1.j, marketplace.f7468a, marketplacePersonalisedQ6);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplacePersonalisedFragment$onCreateView$2$1(MarketplacePersonalisedFragment marketplacePersonalisedFragment, Continuation continuation) {
        super(2, continuation);
        this.q = marketplacePersonalisedFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplacePersonalisedFragment$onCreateView$2$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplacePersonalisedFragment$onCreateView$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MarketplacePersonalisedFragment marketplacePersonalisedFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(marketplacePersonalisedFragment, null), FlowExtKt.a(((MarketplaceViewModel) marketplacePersonalisedFragment.l.getD()).h, marketplacePersonalisedFragment.getViewLifecycleOwner().getD(), Lifecycle.State.f));
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
