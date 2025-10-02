package au.com.woolworths.feature.product.list.legacy;

import android.content.Context;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBanner;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListLegacyBindingImpl;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.model.edr.RtlOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.model.edr.RtlOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object next;
        switch (this.d) {
            case 0:
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.e;
                Context context = (Context) obj;
                Intrinsics.h(context, "context");
                int i = viewState.f5323a;
                return i == 0 ? context.getString(com.woolworths.R.string.product_list_no_products_heading) : context.getResources().getQuantityString(com.woolworths.R.plurals.product_list_toggle_heading, i, Integer.valueOf(i));
            case 1:
                ProductListController productListController = (ProductListController) this.e;
                Intrinsics.h((InsetBanner) obj, "it");
                ProductListViewModel unused = productListController.productListViewModel;
                break;
            case 2:
                ProductListViewModel productListViewModel = (ProductListViewModel) this.e;
                List list = (List) obj;
                List listZ6 = productListViewModel.z6();
                if (listZ6 != null) {
                    productListViewModel.e.D(ProductAnalyticsExtKt.i(listZ6, list));
                }
                Iterator it = ((Iterable) CollectionsKt.O(productListViewModel.B.a())).iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        if (next instanceof EdrOfferBannerData) {
                        }
                    } else {
                        next = null;
                    }
                }
                EdrOfferBannerData edrOfferBannerData = (EdrOfferBannerData) next;
                if (edrOfferBannerData != null) {
                    String str = edrOfferBannerData.f8779a;
                    List<BasicRewardsOfferStatusData> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (BasicRewardsOfferStatusData basicRewardsOfferStatusData : list2) {
                            if (Intrinsics.c(basicRewardsOfferStatusData.getD(), str) || Intrinsics.c(basicRewardsOfferStatusData.getD(), edrOfferBannerData.b)) {
                                ProductListViewModel.V6(productListViewModel, productListViewModel.F, 0, null, 0, false, null, null, null, null, null, null, null, null, null, null, new EdrOfferBoostState.Success(str, RtlOfferBoostState.d, RtlOfferStatus.d, null), 1048575);
                            }
                        }
                    }
                }
                return Unit.f24250a;
            default:
                FragmentProductListLegacyBindingImpl.ButtonClickHandlerImpl buttonClickHandlerImpl = (FragmentProductListLegacyBindingImpl.ButtonClickHandlerImpl) this.e;
                Button it2 = (Button) obj;
                Intrinsics.h(it2, "it");
                buttonClickHandlerImpl.d.O2(it2);
                break;
        }
        return Unit.f24250a;
    }
}
