package au.com.woolworths.feature.product.list;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.analytics.supers.products.ProductFinderAnalytics;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.compose.AlternativeProductsFragment;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.ProductCard;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.ComposeProductListActivity$initActionsCollection$2", f = "ComposeProductListActivity.kt", l = {363}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ComposeProductListActivity$initActionsCollection$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ ComposeProductListActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.ComposeProductListActivity$initActionsCollection$2$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductListContract.ProductListActivityActions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
            ProductListContract.ProductListActivityActions productListActivityActions = (ProductListContract.ProductListActivityActions) obj;
            ComposeProductListActivity composeProductListActivity = (ComposeProductListActivity) this.d;
            int i = ComposeProductListActivity.H;
            composeProductListActivity.getClass();
            if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchProductListOptions) {
                FragmentManager supportFragmentManager = composeProductListActivity.getSupportFragmentManager();
                Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
                Activities.ProductList.Extras extras = ((ProductListContract.ProductListActivityActions.LaunchProductListOptions) productListActivityActions).f5246a;
                ProductListOptionsFragment productListOptionsFragment = new ProductListOptionsFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_PRODUCT_FILTER", extras);
                productListOptionsFragment.setArguments(bundle);
                fragmentTransactionE.j(com.woolworths.R.id.fragment_container, productListOptionsFragment, null);
                fragmentTransactionE.c("MAIN_OPTIONS");
                fragmentTransactionE.d();
            } else if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchAlternativeProducts) {
                FragmentManager supportFragmentManager2 = composeProductListActivity.getSupportFragmentManager();
                Intrinsics.g(supportFragmentManager2, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionE2 = supportFragmentManager2.e();
                AlternativeProductsFragment.Extras extras2 = new AlternativeProductsFragment.Extras(((ProductListContract.ProductListActivityActions.LaunchAlternativeProducts) productListActivityActions).f5242a);
                AlternativeProductsFragment alternativeProductsFragment = new AlternativeProductsFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("AlternativeProductsFragmentExtras", extras2);
                alternativeProductsFragment.setArguments(bundle2);
                fragmentTransactionE2.k(com.woolworths.R.anim.alternative_product_enter_animation, android.R.anim.fade_out, android.R.anim.fade_in, com.woolworths.R.anim.alternative_product_exit_animation);
                fragmentTransactionE2.j(com.woolworths.R.id.fragment_container, alternativeProductsFragment, null);
                fragmentTransactionE2.c("MAIN_OPTIONS");
                fragmentTransactionE2.d();
            } else if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchProductDetails) {
                ProductCard productCard = ((ProductListContract.ProductListActivityActions.LaunchProductDetails) productListActivityActions).f5245a;
                ShopAppNavigator shopAppNavigator = composeProductListActivity.y;
                if (shopAppNavigator == null) {
                    Intrinsics.p("navigator");
                    throw null;
                }
                shopAppNavigator.d(productCard.getProductId());
            } else if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchInstoreMap) {
                ProductCard productCard2 = ((ProductListContract.ProductListActivityActions.LaunchInstoreMap) productListActivityActions).f5243a;
                ShopAppNavigator shopAppNavigator2 = composeProductListActivity.y;
                if (shopAppNavigator2 == null) {
                    Intrinsics.p("navigator");
                    throw null;
                }
                shopAppNavigator2.c(productCard2);
            } else {
                if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.ShowFindInfoBottomSheet) {
                    composeProductListActivity.S4();
                    Intrinsics.h(null, "productCardData");
                    ProductFinderAnalytics.ProductFinder.Action action = ProductFinderAnalytics.ProductFinder.Action.d;
                    ProductAnalyticsExtKt.h(null, null, null, 7);
                    throw null;
                }
                if (!(productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchProductAvailability)) {
                    throw new NoWhenBranchMatchedException();
                }
                composeProductListActivity.startActivity(Activities.ProductAvailabilityActivity.f4502a.b(((ProductListContract.ProductListActivityActions.LaunchProductAvailability) productListActivityActions).f5244a));
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposeProductListActivity$initActionsCollection$2(ComposeProductListActivity composeProductListActivity, Continuation continuation) {
        super(2, continuation);
        this.q = composeProductListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ComposeProductListActivity$initActionsCollection$2(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ComposeProductListActivity$initActionsCollection$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            ComposeProductListActivity composeProductListActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, composeProductListActivity, ComposeProductListActivity.class, "handleProductListActions", "handleProductListActions(Lau/com/woolworths/feature/product/list/ProductListContract$ProductListActivityActions;)V", 4), FlowExtKt.a(composeProductListActivity.S4().B, composeProductListActivity.getD(), Lifecycle.State.h));
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
