package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment;
import au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedContract;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment$observeActions$1", f = "MarketplacePersonalisedFragment.kt", l = {130}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class MarketplacePersonalisedFragment$observeActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ MarketplacePersonalisedFragment q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.marketplace.ui.personalised.MarketplacePersonalisedFragment$observeActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<MarketplacePersonalisedContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
            MarketplacePersonalisedContract.Action action = (MarketplacePersonalisedContract.Action) obj;
            MarketplacePersonalisedFragment marketplacePersonalisedFragment = (MarketplacePersonalisedFragment) this.d;
            marketplacePersonalisedFragment.getClass();
            if (action instanceof MarketplacePersonalisedContract.Action.LaunchInfoSection) {
                MarketplacePersonalisedContract.Action.LaunchInfoSection launchInfoSection = (MarketplacePersonalisedContract.Action.LaunchInfoSection) action;
                InfoSectionFragment.Companion.a(launchInfoSection.f7503a, launchInfoSection.b).show(marketplacePersonalisedFragment.getChildFragmentManager(), "InfoSectionFragment");
            } else if (action instanceof MarketplacePersonalisedContract.Action.LaunchPromotionScreen) {
                PromotionMarkdownContent promotionMarkdownContent = ((MarketplacePersonalisedContract.Action.LaunchPromotionScreen) action).f7505a;
                marketplacePersonalisedFragment.startActivity(Activities.Promotion.f4509a.b(promotionMarkdownContent.getPromotionMarkdownTitle(), promotionMarkdownContent.getPromotionMarkdownText()));
            } else if (action instanceof MarketplacePersonalisedContract.Action.OpenUrl) {
                FragmentActivity fragmentActivityRequireActivity = marketplacePersonalisedFragment.requireActivity();
                Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                ContextExtKt.j(fragmentActivityRequireActivity, ((MarketplacePersonalisedContract.Action.OpenUrl) action).f7506a, null, null, null, 62);
            } else if (action instanceof MarketplacePersonalisedContract.Action.LaunchProductDetails) {
                ProductCard productCard = ((MarketplacePersonalisedContract.Action.LaunchProductDetails) action).f7504a;
                ShopAppNavigator shopAppNavigator = marketplacePersonalisedFragment.j;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(productCard.getProductId());
            } else {
                if (!(action instanceof MarketplacePersonalisedContract.Action.LaunchAddOrUpdateProduct)) {
                    throw new NoWhenBranchMatchedException();
                }
                AddToCartBottomSheetFragment.Companion.a(marketplacePersonalisedFragment.getParentFragmentManager(), new AddToCartBottomSheetFragment.Extras(((MarketplacePersonalisedContract.Action.LaunchAddOrUpdateProduct) action).f7502a, false, Screens.m));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketplacePersonalisedFragment$observeActions$1(MarketplacePersonalisedFragment marketplacePersonalisedFragment, Continuation continuation) {
        super(2, continuation);
        this.q = marketplacePersonalisedFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MarketplacePersonalisedFragment$observeActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MarketplacePersonalisedFragment$observeActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            MarketplacePersonalisedFragment marketplacePersonalisedFragment = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, marketplacePersonalisedFragment, MarketplacePersonalisedFragment.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action;)V", 4), FlowExtKt.a(marketplacePersonalisedFragment.I1().k, marketplacePersonalisedFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
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
