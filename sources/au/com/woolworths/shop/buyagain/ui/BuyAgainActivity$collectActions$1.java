package au.com.woolworths.shop.buyagain.ui;

import androidx.fragment.app.FragmentManager;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.infoview.ProductInfoViewFactory;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.AddToListProductParameters;
import au.com.woolworths.shop.buyagain.analytics.ScreenExtKt;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainActivity$collectActions$1 extends AdaptedFunctionReference implements Function2<BuyAgainContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws NumberFormatException {
        BuyAgainContract.Actions actions = (BuyAgainContract.Actions) obj;
        BuyAgainActivity buyAgainActivity = (BuyAgainActivity) this.d;
        int i = BuyAgainActivity.D;
        buyAgainActivity.getClass();
        if (Intrinsics.c(actions, BuyAgainContract.Actions.GoToProducts.f10261a)) {
            Activities.MainActivity.f4487a.d(buyAgainActivity, Activities.MainActivity.Tab.f);
        } else if (actions instanceof BuyAgainContract.Actions.OpenAddToList) {
            BuyAgainContract.Actions.OpenAddToList openAddToList = (BuyAgainContract.Actions.OpenAddToList) actions;
            FragmentManager supportFragmentManager = buyAgainActivity.getSupportFragmentManager();
            Object obj3 = BuyAgainAnalytics.BuyAgain.d;
            AddToListBottomSheetFragment.Companion.a(supportFragmentManager, null, ScreenExtKt.a(), CollectionsKt.Q(new AddToListProductParameters(openAddToList.f10263a, (String) null, (Float) null, false, 30)), null, new ProductInfoViewFactory(openAddToList.f10263a), true, null, null, 914);
        } else if (Intrinsics.c(actions, BuyAgainContract.Actions.OpenCart.f10264a)) {
            buyAgainActivity.startActivity(ActivityNavigatorKt.a(Activities.Cart.f4454a, ApplicationType.e));
        } else if (Intrinsics.c(actions, BuyAgainContract.Actions.OpenLogin.f10266a)) {
            buyAgainActivity.C.a(ActivityNavigatorKt.a(Activities.LogIn.f4485a, ApplicationType.e), null);
        } else {
            if (actions instanceof BuyAgainContract.Actions.OpenAddToCart) {
                FragmentManager supportFragmentManager2 = buyAgainActivity.getSupportFragmentManager();
                ProductCard productCard = ((BuyAgainContract.Actions.OpenAddToCart) actions).f10262a;
                boolean z = productCard.getMarketplace() != null;
                Object obj4 = BuyAgainAnalytics.BuyAgain.d;
                AddToCartBottomSheetFragment.Companion.a(supportFragmentManager2, new AddToCartBottomSheetFragment.Extras(productCard, z, ScreenExtKt.a(), (TrackingMetadata) null, (ProductCard) null));
            } else if (Intrinsics.c(actions, BuyAgainContract.Actions.OpenSearch.f10268a)) {
                buyAgainActivity.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.BuyAgain(null)));
            } else if (actions instanceof BuyAgainContract.Actions.ViewWatchlist) {
                buyAgainActivity.startActivity(Activities.ShoppingListDetails.f4535a.b(((BuyAgainContract.Actions.ViewWatchlist) actions).f10269a, false));
            } else if (actions instanceof BuyAgainContract.Actions.OpenInStoreMap) {
                ProductCard productCard2 = ((BuyAgainContract.Actions.OpenInStoreMap) actions).f10265a;
                ShopAppNavigator shopAppNavigator = buyAgainActivity.z;
                if (shopAppNavigator == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator.c(productCard2);
            } else {
                if (!(actions instanceof BuyAgainContract.Actions.OpenProductDetails)) {
                    throw new NoWhenBranchMatchedException();
                }
                ProductCard productCard3 = ((BuyAgainContract.Actions.OpenProductDetails) actions).f10267a;
                ShopAppNavigator shopAppNavigator2 = buyAgainActivity.z;
                if (shopAppNavigator2 == null) {
                    Intrinsics.p("shopAppNavigator");
                    throw null;
                }
                shopAppNavigator2.d(productCard3.getProductId());
            }
        }
        return Unit.f24250a;
    }
}
