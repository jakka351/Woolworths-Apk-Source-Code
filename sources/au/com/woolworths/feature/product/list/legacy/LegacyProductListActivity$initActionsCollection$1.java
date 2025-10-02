package au.com.woolworths.feature.product.list.legacy;

import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.compose.AlternativeProductsFragment;
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
@DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$initActionsCollection$1", f = "LegacyProductListActivity.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class LegacyProductListActivity$initActionsCollection$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int p;
    public final /* synthetic */ LegacyProductListActivity q;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$initActionsCollection$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductListContract.ProductListActivityActions, Continuation<? super Unit>, Object>, SuspendFunction {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
            ProductListContract.ProductListActivityActions productListActivityActions = (ProductListContract.ProductListActivityActions) obj;
            LegacyProductListActivity legacyProductListActivity = (LegacyProductListActivity) this.d;
            int i = LegacyProductListActivity.D;
            if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchProductListOptions) {
                FragmentManager supportFragmentManager = legacyProductListActivity.getSupportFragmentManager();
                Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
                Activities.ProductList.Extras extras = ((ProductListContract.ProductListActivityActions.LaunchProductListOptions) productListActivityActions).f5320a;
                ProductListOptionsFragment productListOptionsFragment = new ProductListOptionsFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("EXTRA_PRODUCT_FILTER", extras);
                productListOptionsFragment.setArguments(bundle);
                fragmentTransactionE.j(com.woolworths.R.id.fragment_container, productListOptionsFragment, null);
                fragmentTransactionE.c("MAIN_OPTIONS");
                fragmentTransactionE.d();
            } else if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchAlternativeProducts) {
                FragmentManager supportFragmentManager2 = legacyProductListActivity.getSupportFragmentManager();
                Intrinsics.g(supportFragmentManager2, "getSupportFragmentManager(...)");
                FragmentTransaction fragmentTransactionE2 = supportFragmentManager2.e();
                AlternativeProductsFragment.Extras extras2 = new AlternativeProductsFragment.Extras(((ProductListContract.ProductListActivityActions.LaunchAlternativeProducts) productListActivityActions).f5316a);
                AlternativeProductsFragment alternativeProductsFragment = new AlternativeProductsFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("AlternativeProductsFragmentExtras", extras2);
                alternativeProductsFragment.setArguments(bundle2);
                fragmentTransactionE2.k(com.woolworths.R.anim.alternative_product_enter_animation, android.R.anim.fade_out, android.R.anim.fade_in, com.woolworths.R.anim.alternative_product_exit_animation);
                fragmentTransactionE2.j(com.woolworths.R.id.fragment_container, alternativeProductsFragment, null);
                fragmentTransactionE2.c("MAIN_OPTIONS");
                fragmentTransactionE2.d();
            } else {
                legacyProductListActivity.getClass();
                if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchProductDetails) {
                    ProductCard productCard = ((ProductListContract.ProductListActivityActions.LaunchProductDetails) productListActivityActions).f5319a;
                    ShopAppNavigator shopAppNavigator = legacyProductListActivity.y;
                    if (shopAppNavigator == null) {
                        Intrinsics.p("navigator");
                        throw null;
                    }
                    shopAppNavigator.d(productCard.getProductId());
                } else if (productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchInstoreMap) {
                    ProductCard productCard2 = ((ProductListContract.ProductListActivityActions.LaunchInstoreMap) productListActivityActions).f5317a;
                    ShopAppNavigator shopAppNavigator2 = legacyProductListActivity.y;
                    if (shopAppNavigator2 == null) {
                        Intrinsics.p("navigator");
                        throw null;
                    }
                    shopAppNavigator2.c(productCard2);
                } else if (!(productListActivityActions instanceof ProductListContract.ProductListActivityActions.ShowFindInfoBottomSheet)) {
                    if (!(productListActivityActions instanceof ProductListContract.ProductListActivityActions.LaunchProductAvailability)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    legacyProductListActivity.startActivity(Activities.ProductAvailabilityActivity.f4502a.b(((ProductListContract.ProductListActivityActions.LaunchProductAvailability) productListActivityActions).f5318a));
                }
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LegacyProductListActivity$initActionsCollection$1(LegacyProductListActivity legacyProductListActivity, Continuation continuation) {
        super(2, continuation);
        this.q = legacyProductListActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LegacyProductListActivity$initActionsCollection$1(this.q, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LegacyProductListActivity$initActionsCollection$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = LegacyProductListActivity.D;
            LegacyProductListActivity legacyProductListActivity = this.q;
            FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, legacyProductListActivity, LegacyProductListActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/product/list/legacy/ProductListContract$ProductListActivityActions;)V", 4), FlowExtKt.a(((ProductListViewModel) legacyProductListActivity.A.getD()).y, legacyProductListActivity.getD(), Lifecycle.State.h));
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
