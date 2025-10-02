package au.com.woolworths.feature.product.list;

import android.content.Context;
import au.com.woolworths.base.shopapp.modules.button.Button;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.databinding.FragmentProductListBindingImpl;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.model.edr.RtlOfferBoostState;
import au.com.woolworths.foundation.shop.nhp.model.edr.RtlOfferStatus;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                ProductListContract.ViewState viewState = (ProductListContract.ViewState) this.e;
                Context context = (Context) obj;
                Intrinsics.h(context, "context");
                int i = viewState.f5249a;
                if (i == 0) {
                    break;
                } else {
                    break;
                }
            case 1:
                ProductListViewModel productListViewModel = (ProductListViewModel) this.e;
                SharedFlow sharedFlow = productListViewModel.I;
                List list = (List) obj;
                ProductListInteractor productListInteractor = productListViewModel.e;
                List listA = productListInteractor.o;
                if (listA == null) {
                    listA = sharedFlow.a();
                }
                if (listA != null) {
                    productListInteractor.o = ProductAnalyticsExtKt.i(listA, list);
                }
                List listA2 = sharedFlow.a();
                Intrinsics.f(listA2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                Object objO = CollectionsKt.O(listA2);
                EdrOfferBannerData edrOfferBannerData = objO instanceof EdrOfferBannerData ? (EdrOfferBannerData) objO : null;
                if (edrOfferBannerData != null) {
                    String str = edrOfferBannerData.f8779a;
                    List<BasicRewardsOfferStatusData> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (BasicRewardsOfferStatusData basicRewardsOfferStatusData : list2) {
                            if (Intrinsics.c(basicRewardsOfferStatusData.getD(), str) || Intrinsics.c(basicRewardsOfferStatusData.getD(), edrOfferBannerData.b)) {
                                ProductListViewModel.H6(productListViewModel, productListViewModel.C, 0, null, null, null, null, null, null, null, null, null, null, null, null, new EdrOfferBoostState.Success(str, RtlOfferBoostState.d, RtlOfferStatus.d, null), null, null, 62914559);
                            }
                        }
                    }
                }
                break;
            default:
                FragmentProductListBindingImpl.ButtonClickHandlerImpl buttonClickHandlerImpl = (FragmentProductListBindingImpl.ButtonClickHandlerImpl) this.e;
                Button it = (Button) obj;
                Intrinsics.h(it, "it");
                buttonClickHandlerImpl.d.O2(it);
                break;
        }
        return Unit.f24250a;
    }
}
