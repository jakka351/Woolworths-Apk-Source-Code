package au.com.woolworths.feature.product.list;

import android.os.Bundle;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.cartbadge.CartBadgeActions;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.ProductListFragment;
import au.com.woolworths.feature.product.list.analytics.ProductListActions;
import au.com.woolworths.feature.product.list.analytics.ProductListScreens;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class m implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;

    public /* synthetic */ m(ProductListFragment productListFragment, int i) {
        this.d = i;
        this.e = productListFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                float f = ProductListFragment.u;
                Bundle arguments = productListFragment.getArguments();
                ProductListFragment.Extras extras = arguments != null ? (ProductListFragment.Extras) arguments.getParcelable("EXTRA_PRODUCT_LIST_INFO") : null;
                ProductListFragment.Extras extras2 = extras != null ? extras : null;
                if (extras2 != null) {
                    return extras2;
                }
                throw new IllegalStateException("Product List: Fragment should be launched with extra Product List Data!");
            case 1:
                float f2 = ProductListFragment.u;
                return Boolean.valueOf(productListFragment.h3().d.e.getE().g == Activities.ProductList.ToolbarType.d);
            case 2:
                productListFragment.requireActivity().onBackPressed();
                return unit;
            case 3:
                float f3 = ProductListFragment.u;
                productListFragment.m3().B6("");
                return unit;
            case 4:
                float f4 = ProductListFragment.u;
                ProductListViewModel productListViewModelM3 = productListFragment.m3();
                productListViewModelM3.h.j(ProductListActions.SearchIconClick.e, productListViewModelM3.r6());
                productListViewModelM3.y.f(new ProductListContract.Actions.LaunchProductSearch(productListViewModelM3.t6(), productListViewModelM3.v6()));
                return unit;
            case 5:
                float f5 = ProductListFragment.u;
                productListFragment.m3().y.f(ProductListContract.Actions.LaunchVoiceProductSearch.f5233a);
                return unit;
            default:
                float f6 = ProductListFragment.u;
                ProductListViewModel productListViewModelM32 = productListFragment.m3();
                CartBadgeActions cartBadgeActions = CartBadgeActions.e;
                ProductListScreens productListScreens = ProductListScreens.e;
                cartBadgeActions.getClass();
                cartBadgeActions.d = productListScreens;
                productListViewModelM32.h.c(cartBadgeActions);
                productListViewModelM32.y.f(ProductListContract.Actions.LaunchCartScreen.f5222a);
                return unit;
        }
    }
}
