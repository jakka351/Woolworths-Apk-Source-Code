package au.com.woolworths.feature.product.list;

import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.compose.foundation.lazy.grid.GridItemSpan;
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope;
import androidx.compose.foundation.lazy.grid.LazyGridSpanKt;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerData;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.databinding.EpoxyItemProductListInsetBannerBinding;
import au.com.woolworths.feature.product.list.databinding.FragmentProductListBinding;
import au.com.woolworths.feature.product.list.errorstates.ProductListErrorState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class o implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListFragment e;

    public /* synthetic */ o(ProductListFragment productListFragment, int i) {
        this.d = i;
        this.e = productListFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.d;
        Unit unit = Unit.f24250a;
        ProductListFragment productListFragment = this.e;
        switch (i) {
            case 0:
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) obj;
                float f = ProductListFragment.u;
                ProductListErrorState productListErrorState = viewState.c;
                if ((productListErrorState instanceof ProductListErrorState.ProductListNoResultsState) || (productListErrorState instanceof ProductListErrorState.ProductListEmptyState)) {
                    List<InsetBannerData> list = viewState.f;
                    FragmentProductListBinding fragmentProductListBinding = productListFragment.i;
                    if (fragmentProductListBinding == null) {
                        Intrinsics.p("fragmentProductListBinding");
                        throw null;
                    }
                    LinearLayout linearLayout = fragmentProductListBinding.C;
                    linearLayout.removeAllViews();
                    for (InsetBannerData insetBannerData : list) {
                        LayoutInflater layoutInflaterFrom = LayoutInflater.from(linearLayout.getContext());
                        int i2 = EpoxyItemProductListInsetBannerBinding.C;
                        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                        EpoxyItemProductListInsetBannerBinding epoxyItemProductListInsetBannerBinding = (EpoxyItemProductListInsetBannerBinding) ViewDataBinding.q(layoutInflaterFrom, com.woolworths.R.layout.epoxy_item_product_list_inset_banner, linearLayout, true, null);
                        epoxyItemProductListInsetBannerBinding.L(insetBannerData);
                        epoxyItemProductListInsetBannerBinding.M(Integer.valueOf(com.woolworths.R.dimen.no_margin));
                        epoxyItemProductListInsetBannerBinding.l();
                    }
                }
                return unit;
            case 1:
                LazyGridItemSpanScope item = (LazyGridItemSpanScope) obj;
                float f2 = ProductListFragment.u;
                Intrinsics.h(item, "$this$item");
                return new GridItemSpan(LazyGridSpanKt.a(productListFragment.m3().L == ProductsDisplayMode.d ? item.a() : 1));
            default:
                InsetBanner it = (InsetBanner) obj;
                Intrinsics.h(it, "it");
                float f3 = ProductListFragment.u;
                productListFragment.m3();
                return unit;
        }
    }
}
