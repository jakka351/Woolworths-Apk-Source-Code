package au.com.woolworths.feature.shop.marketplace.ui.marketplace;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.feature.shop.marketplace.databinding.FragmentMarketplaceBinding;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceContract;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment$observeData$1", f = "MarketplaceFragment.kt", l = {89}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplaceFragment$observeData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplaceFragment q;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "viewState", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceContract$ViewState;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment$observeData$1$1", f = "MarketplaceFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment$observeData$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<MarketplaceContract.ViewState, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;
        public final /* synthetic */ MarketplaceFragment q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MarketplaceFragment marketplaceFragment, Continuation continuation) {
            super(2, continuation);
            this.q = marketplaceFragment;
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
            MarketplaceFragment marketplaceFragment = this.q;
            FragmentMarketplaceBinding fragmentMarketplaceBinding = marketplaceFragment.k;
            Intrinsics.e(fragmentMarketplaceBinding);
            fragmentMarketplaceBinding.N(Boolean.valueOf(viewState.c));
            FragmentMarketplaceBinding fragmentMarketplaceBinding2 = marketplaceFragment.k;
            Intrinsics.e(fragmentMarketplaceBinding2);
            fragmentMarketplaceBinding2.M(viewState.d);
            MarketplacePagerAdapter marketplacePagerAdapter = (MarketplacePagerAdapter) marketplaceFragment.l.getD();
            List list = viewState.b;
            if (list == null) {
                list = EmptyList.d;
            }
            marketplacePagerAdapter.getClass();
            marketplacePagerAdapter.p = list;
            marketplacePagerAdapter.l();
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplaceFragment$observeData$1(MarketplaceFragment marketplaceFragment, Continuation continuation) {
        super(2, continuation);
        this.q = marketplaceFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplaceFragment$observeData$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplaceFragment$observeData$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MarketplaceFragment marketplaceFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(marketplaceFragment, null), FlowExtKt.a(marketplaceFragment.I1().h, marketplaceFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
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
