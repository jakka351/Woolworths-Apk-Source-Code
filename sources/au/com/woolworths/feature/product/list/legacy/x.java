package au.com.woolworths.feature.product.list.legacy;

import androidx.lifecycle.MediatorLiveData;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.errorstates.ProductListErrorState;
import au.com.woolworths.pagingutils.NetworkState;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.BoostAllBannerState;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class x implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ ProductListViewModel e;
    public final /* synthetic */ MediatorLiveData f;

    public /* synthetic */ x(ProductListViewModel productListViewModel, MediatorLiveData mediatorLiveData, int i) {
        this.d = i;
        this.e = productListViewModel;
        this.f = mediatorLiveData;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Integer num = (Integer) obj;
                ProductListViewModel productListViewModel = this.e;
                NetworkState networkState = (NetworkState) productListViewModel.C.e();
                MediatorLiveData mediatorLiveData = this.f;
                if (networkState != null) {
                    ProductListErrorState productListErrorStateU6 = productListViewModel.U6(networkState);
                    Intrinsics.e(num);
                    ProductListViewModel.V6(productListViewModel, mediatorLiveData, num.intValue(), productListErrorStateU6, 0, false, null, null, null, null, null, null, null, null, null, null, null, 2097146);
                } else {
                    Intrinsics.e(num);
                    ProductListViewModel.V6(productListViewModel, mediatorLiveData, num.intValue(), null, 0, false, null, null, null, null, null, null, null, null, null, null, null, 2097150);
                }
                return Unit.f24250a;
            case 1:
                ProductListViewModel productListViewModel2 = this.e;
                BoostAllBannerState boostAllBannerStateU6 = productListViewModel2.u6(null);
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) productListViewModel2.F.e();
                if (!Intrinsics.c(boostAllBannerStateU6, viewState != null ? viewState.i : null)) {
                    ProductListViewModel.V6(productListViewModel2, this.f, 0, null, 0, false, null, boostAllBannerStateU6, null, null, null, null, null, null, null, null, null, 2096895);
                }
                return Unit.f24250a;
            case 2:
                NetworkState networkState2 = (NetworkState) obj;
                Intrinsics.e(networkState2);
                ProductListViewModel productListViewModel3 = this.e;
                ProductListViewModel.V6(productListViewModel3, this.f, 0, productListViewModel3.U6(networkState2), 0, false, null, null, null, null, null, null, null, null, null, null, null, 2097147);
                break;
            default:
                List list = (List) obj;
                Intrinsics.e(list);
                ProductListViewModel.V6(this.e, this.f, 0, null, 0, false, null, null, null, null, null, null, list, null, null, null, null, 2031615);
                break;
        }
        return Unit.f24250a;
    }
}
