package au.com.woolworths.feature.product.list.legacy;

import au.com.woolworths.analytics.model.AnalyticsData;
import au.com.woolworths.analytics.model.AnalyticsDataKt;
import au.com.woolworths.foundation.shop.nhp.model.personalisedproducts.PersonalisedProductsBannerData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PersonalisedProductsBannerEpoxyModel$wrappedModel$1$2$1 extends FunctionReferenceImpl implements Function1<PersonalisedProductsBannerData, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PersonalisedProductsBannerData p0 = (PersonalisedProductsBannerData) obj;
        Intrinsics.h(p0, "p0");
        ProductListViewModel productListViewModel = (ProductListViewModel) this.receiver;
        productListViewModel.getClass();
        AnalyticsData analyticsData = p0.h;
        if (analyticsData != null) {
            productListViewModel.g.g(AnalyticsDataKt.a(AnalyticsDataKt.c(analyticsData, p0.g, false)));
        }
        return Unit.f24250a;
    }
}
