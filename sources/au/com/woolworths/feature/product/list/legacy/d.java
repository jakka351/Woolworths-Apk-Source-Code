package au.com.woolworths.feature.product.list.legacy;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.shop.cart.ui.productreview.ReplaceProductResultRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d(ComposeProductListActivity composeProductListActivity, int i, int i2) {
        this.d = i2;
        this.e = composeProductListActivity;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int i2 = ComposeProductListActivity.H;
                ((ComposeProductListActivity) obj3).O4((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int i3 = ComposeProductListActivity.H;
                ((ComposeProductListActivity) obj3).P4((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                ProductListFragment productListFragment = (ProductListFragment) obj3;
                Bundle bundle = (Bundle) obj2;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(bundle, "bundle");
                if (Intrinsics.c(bundle.getString("requestSuccessBundleKey"), "ADD")) {
                    ProductListViewModel productListViewModelH2 = productListFragment.h2();
                    ReplaceProductResultRouter replaceProductResultRouter = productListViewModelH2.n;
                    MutableStateFlow mutableStateFlow = replaceProductResultRouter.f10527a;
                    Boolean bool = Boolean.TRUE;
                    mutableStateFlow.setValue(bool);
                    replaceProductResultRouter.c.setValue(bool);
                    productListViewModelH2.v.f(ProductListContract.Actions.NavigateBack.f5309a);
                    break;
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ d(ProductListFragment productListFragment) {
        this.d = 2;
        this.e = productListFragment;
    }
}
