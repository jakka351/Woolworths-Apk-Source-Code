package au.com.woolworths.feature.product.list;

import android.os.Bundle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.shop.cart.ui.productreview.ReplaceProductResultRouter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class t implements Function2 {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ ProductListFragment e;

    public /* synthetic */ t(ProductListFragment productListFragment) {
        this.e = productListFragment;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                float f = ProductListFragment.u;
                productListFragment.m2((Composer) obj, RecomposeScopeImplKt.a(1));
                break;
            default:
                Bundle bundle = (Bundle) obj2;
                float f2 = ProductListFragment.u;
                Intrinsics.h((String) obj, "<unused var>");
                Intrinsics.h(bundle, "bundle");
                if (Intrinsics.c(bundle.getString("requestSuccessBundleKey"), "ADD")) {
                    ProductListViewModel productListViewModelM3 = productListFragment.m3();
                    ReplaceProductResultRouter replaceProductResultRouter = productListViewModelM3.o;
                    MutableStateFlow mutableStateFlow = replaceProductResultRouter.f10527a;
                    Boolean bool = Boolean.TRUE;
                    mutableStateFlow.setValue(bool);
                    replaceProductResultRouter.c.setValue(bool);
                    productListViewModelM3.y.f(ProductListContract.Actions.NavigateBack.f5235a);
                    break;
                }
                break;
        }
        return unit;
    }

    public /* synthetic */ t(ProductListFragment productListFragment, int i) {
        this.e = productListFragment;
    }
}
