package au.com.woolworths.shop.product.details;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import androidx.appcompat.app.AlertDialog;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.analytics.supers.local.ProductDetailsAnalytics;
import au.com.woolworths.android.onesite.deeplink.ShopAppDeepLink;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.product.list.q;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.InStoreAvailabilityInfo;
import au.com.woolworths.product.models.InfoSheet;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetFragment;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.product.details.ProductDetailsContract;
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
@DebugMetadata(c = "au.com.woolworths.shop.product.details.ProductDetailsActivity$collectActions$1", f = "ProductDetailsActivity.kt", l = {194}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ProductDetailsActivity$collectActions$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ProductDetailsActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.product.details.ProductDetailsActivity$collectActions$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductDetailsContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
            InfoSheet infoSheet;
            String title;
            InStoreAvailabilityInfo inStoreAvailabilityInfo;
            InfoSheet infoSheet2;
            String message;
            ProductDetailsContract.Action action = (ProductDetailsContract.Action) obj;
            ProductDetailsActivity productDetailsActivity = (ProductDetailsActivity) this.d;
            int i = ProductDetailsActivity.C;
            productDetailsActivity.getClass();
            if (action instanceof ProductDetailsContract.Action.LaunchLink) {
                productDetailsActivity.startActivity(ShopAppDeepLink.b(((ProductDetailsContract.Action.LaunchLink) action).f12555a, ProductDetailsAnalytics.Details.d));
            } else if (action instanceof ProductDetailsContract.Action.LaunchAddToCartBottomSheet) {
                AddToCartBottomSheetFragment.Companion.b(productDetailsActivity.getSupportFragmentManager(), ((ProductDetailsContract.Action.LaunchAddToCartBottomSheet) action).f12552a, productDetailsActivity.O4().s6());
            } else if (action instanceof ProductDetailsContract.Action.LaunchListsBottomSheet) {
                ProductCard productCard = ((ProductDetailsContract.Action.LaunchListsBottomSheet) action).f12556a;
                AddToListBottomSheetFragment.Companion.a(productDetailsActivity.getSupportFragmentManager(), null, productDetailsActivity.O4().s6(), CollectionsKt.Q(new AddToListProductParameters(productCard, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(productCard), true, null, null, 914);
            } else if (action instanceof ProductDetailsContract.Action.LaunchProductDetails) {
                ProductCard productCard2 = ((ProductDetailsContract.Action.LaunchProductDetails) action).f12558a;
                ShopAppNavigator shopAppNavigator = productDetailsActivity.z;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.d(productCard2.getProductId());
            } else if (action instanceof ProductDetailsContract.Action.LaunchSeeInStoreBottomSheet) {
                ProductCard productCard3 = ((ProductDetailsContract.Action.LaunchSeeInStoreBottomSheet) action).f12559a;
                InStoreAvailabilityInfo inStoreAvailabilityInfo2 = productCard3.getInStoreAvailabilityInfo();
                if (inStoreAvailabilityInfo2 != null && (infoSheet = inStoreAvailabilityInfo2.getInfoSheet()) != null && (title = infoSheet.getTitle()) != null && (inStoreAvailabilityInfo = productCard3.getInStoreAvailabilityInfo()) != null && (infoSheet2 = inStoreAvailabilityInfo.getInfoSheet()) != null && (message = infoSheet2.getMessage()) != null) {
                    ProductMessageBottomSheetFragment.Companion.a(productDetailsActivity.getSupportFragmentManager(), productCard3, title, message, productDetailsActivity.O4().s6(), null);
                }
            } else if (action instanceof ProductDetailsContract.Action.ShowCartScreen) {
                productDetailsActivity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
            } else if (action instanceof ProductDetailsContract.Action.LaunchShareProductIntent) {
                String strA = YU.a.A("https://www.woolworths.com.au/shop/productdetails/", ((ProductDetailsContract.Action.LaunchShareProductIntent) action).f12560a);
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", strA);
                intent.setType("text/plain");
                productDetailsActivity.startActivity(Intent.createChooser(intent, null));
            } else if (action instanceof ProductDetailsContract.Action.LaunchInStoreMap) {
                ProductCard productCard4 = ((ProductDetailsContract.Action.LaunchInStoreMap) action).f12554a;
                ShopAppNavigator shopAppNavigator2 = productDetailsActivity.z;
                if (shopAppNavigator2 == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator2.c(productCard4);
            } else if (action instanceof ProductDetailsContract.Action.DisplayRestrictedItemPrompt) {
                boolean z = ((ProductDetailsContract.Action.DisplayRestrictedItemPrompt) action).f12551a;
                AlertDialog.Builder title2 = new AlertDialog.Builder(productDetailsActivity).setTitle(com.woolworths.R.string.product_age_restricted_item_prompt_title);
                int i2 = 9;
                (z ? title2.setMessage(com.woolworths.R.string.product_age_restricted_item_prompt_message_underage).setPositiveButton(com.woolworths.R.string.ok, new q(i2)) : title2.setMessage(com.woolworths.R.string.product_age_restricted_item_prompt_message).setPositiveButton(com.woolworths.R.string.login_action, new au.com.woolworths.base.wallet.digipay.framesview.a(productDetailsActivity, i2)).setNegativeButton(com.woolworths.R.string.cancel, new q(i2))).create().show();
            } else if (action instanceof ProductDetailsContract.Action.CopyEverydayMarketCouponCode) {
                String str = ((ProductDetailsContract.Action.CopyEverydayMarketCouponCode) action).f12550a;
                Object systemService = productDetailsActivity.getSystemService((Class<Object>) ClipboardManager.class);
                Intrinsics.f(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText(productDetailsActivity.getString(com.woolworths.R.string.copy_coupon_code_to_clipboard_label), str));
                productDetailsActivity.getWindow().getDecorView().getRootView().announceForAccessibility(productDetailsActivity.getString(com.woolworths.R.string.everyday_market_coupon_coupon_accessibility_copy_success));
            } else if (action instanceof ProductDetailsContract.Action.LaunchViewList) {
                productDetailsActivity.startActivity(Activities.ShoppingListDetails.f4535a.b(((ProductDetailsContract.Action.LaunchViewList) action).f12561a, false));
            } else if (action instanceof ProductDetailsContract.Action.LaunchWatchlistGuestOnboardingScreen) {
                productDetailsActivity.startActivity(Activities.ShopListGuestOnboardingActivity.f4532a.b(Activities.ShopListGuestOnboardingActivity.ListFeature.d));
            } else if (action instanceof ProductDetailsContract.Action.LaunchCheckStockScreen) {
                productDetailsActivity.startActivity(Activities.ProductAvailabilityActivity.f4502a.b(((ProductDetailsContract.Action.LaunchCheckStockScreen) action).f12553a));
            } else if (action instanceof ProductDetailsContract.Action.LaunchProductAlternativesScreen) {
                String str2 = (String) productDetailsActivity.A.getD();
                AlternativeProductsMode.Companion companion = AlternativeProductsMode.e;
                productDetailsActivity.startActivity(Activities.ViewSimilarProductsActivity.f4551a.b("", str2, "UNIVERSAL"));
            } else {
                if (!(action instanceof ProductDetailsContract.Action.OpenOliveChat)) {
                    throw new NoWhenBranchMatchedException();
                }
                productDetailsActivity.startActivity(Activities.AskOliveActivity.b(5, null, ((ProductDetailsContract.Action.OpenOliveChat) action).f12563a, null));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProductDetailsActivity$collectActions$1(ProductDetailsActivity productDetailsActivity, Continuation continuation) {
        super(2, continuation);
        this.q = productDetailsActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ProductDetailsActivity$collectActions$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProductDetailsActivity$collectActions$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = ProductDetailsActivity.C;
            ProductDetailsActivity productDetailsActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, productDetailsActivity, ProductDetailsActivity.class, "handleAction", "handleAction(Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;)V", 4), FlowExtKt.a(productDetailsActivity.O4().t, productDetailsActivity.getD(), Lifecycle.State.g));
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
