package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.feature.product.list.legacy.ProductListContract;
import au.com.woolworths.feature.product.list.legacy.ProductListViewModel;
import au.com.woolworths.foundation.shop.nhp.model.edr.EdrOfferBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class EdrOfferBannerEpoxyModel$wrappedModel$1$1$1 extends FunctionReferenceImpl implements Function1<EdrOfferBannerData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        EdrOfferBannerData p0 = (EdrOfferBannerData) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        AnalyticsData analyticsData = p0.k;
        ActionData actionData = p0.i;
        if (actionData != null) {
            if (ProductListViewModel.WhenMappings.b[actionData.getType().ordinal()] == 2) {
                productListViewModel.v.f(new ProductListContract.Actions.LaunchDeeplink(actionData.getAction(), analyticsData != null ? analyticsData.getExtraContent() : null));
                AnalyticsData analytics = actionData.getAnalytics();
                if (analytics != null) {
                    productListViewModel.g.g(AnalyticsDataKt.a(AnalyticsDataKt.c(AnalyticsDataKt.c(analytics, p0.j, false), analyticsData, false)));
                }
            }
        }
        return Unit.f24250a;
    }
}
