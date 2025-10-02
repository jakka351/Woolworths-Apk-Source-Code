package au.com.woolworths.feature.product.list;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.feature.product.list.ProductListContract;
import au.com.woolworths.feature.product.list.ProductListViewModel;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import au.com.woolworths.sdui.model.action.ActionData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductListFragment$PersonalisedProductsBannerUi$1$1 extends FunctionReferenceImpl implements Function1<PersonalisedProductsBannerData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PersonalisedProductsBannerData p0 = (PersonalisedProductsBannerData) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        ActionData actionData = p0.f;
        if (actionData != null) {
            if (ProductListViewModel.WhenMappings.b[actionData.getType().ordinal()] == 1) {
                productListViewModel.y.f(new ProductListContract.Actions.LaunchDeeplink(actionData.getAction(), null));
                AnalyticsData analytics = actionData.getAnalytics();
                if (analytics != null) {
                    productListViewModel.h.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analytics, p0.g, false)));
                }
            }
        }
        return Unit.f24250a;
    }
}
