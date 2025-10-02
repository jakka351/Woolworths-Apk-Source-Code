package au.com.woolworths.feature.shop.catalogue.listing.promotion.details;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsContract;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
@DebugMetadata(c = "au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity$collectActions$1", f = "PromotionDetailsActivity.kt", l = {92}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PromotionDetailsActivity$collectActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ PromotionDetailsActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity$collectActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<PromotionDetailsContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
            PromotionDetailsContract.Action action = (PromotionDetailsContract.Action) obj;
            PromotionDetailsActivity promotionDetailsActivity = (PromotionDetailsActivity) this.d;
            int i = PromotionDetailsActivity.A;
            promotionDetailsActivity.getClass();
            if (action instanceof PromotionDetailsContract.Action.LaunchProductDetails) {
                ProductCard productCard = ((PromotionDetailsContract.Action.LaunchProductDetails) action).f6891a;
                ShopAppNavigator shopAppNavigator = promotionDetailsActivity.y;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(productCard.getProductId());
            } else if (action instanceof PromotionDetailsContract.Action.LaunchProductBottomSheet) {
                AddToCartBottomSheetFragment.Companion.b(promotionDetailsActivity.getSupportFragmentManager(), ((PromotionDetailsContract.Action.LaunchProductBottomSheet) action).f6890a, new PromotionDetailsActivity$launchCartBottomSheet$1());
            } else if (action instanceof PromotionDetailsContract.Action.LaunchListsBottomSheet) {
                ProductCard productCard2 = ((PromotionDetailsContract.Action.LaunchListsBottomSheet) action).f6889a;
                AddToListBottomSheetFragment.Companion.a(promotionDetailsActivity.getSupportFragmentManager(), null, new PromotionDetailsActivity$launchAddToListBottomSheet$1(), CollectionsKt.Q(new AddToListProductParameters(productCard2, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(productCard2), true, null, null, 914);
            } else if (action instanceof PromotionDetailsContract.Action.LaunchViewShoppingList) {
                promotionDetailsActivity.startActivity(Activities.ShoppingListDetails.f4535a.b(((PromotionDetailsContract.Action.LaunchViewShoppingList) action).f6892a, false));
            } else {
                if (!(action instanceof PromotionDetailsContract.Action.LaunchWatchlistGuestOnboardingScreen)) {
                    throw new NoWhenBranchMatchedException();
                }
                promotionDetailsActivity.startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PromotionDetailsActivity$collectActions$1(PromotionDetailsActivity promotionDetailsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = promotionDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PromotionDetailsActivity$collectActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PromotionDetailsActivity$collectActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = PromotionDetailsActivity.A;
            PromotionDetailsActivity promotionDetailsActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, promotionDetailsActivity, PromotionDetailsActivity.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/PromotionDetailsContract$Action;)V", 4), FlowExtKt.a(((PromotionDetailsViewModel) promotionDetailsActivity.x.getD()).k, promotionDetailsActivity.getD(), Lifecycle.State.g));
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
