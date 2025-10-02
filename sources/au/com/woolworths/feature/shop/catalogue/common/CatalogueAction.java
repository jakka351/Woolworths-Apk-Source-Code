package au.com.woolworths.feature.shop.catalogue.common;

import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/common/CatalogueAction;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CatalogueAction {
    default AnalyticsAction a() {
        return new AnalyticsAction(d(), Category.v, "Server Error");
    }

    default AnalyticsAction b() {
        return new AnalyticsAction(d(), Category.v, "Network Error");
    }

    default AnalyticsAction c(String label) {
        Intrinsics.h(label, "label");
        return new AnalyticsAction(d(), Category.m, label);
    }

    CatalogueScreen d();
}
