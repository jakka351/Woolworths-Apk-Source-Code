package au.com.woolworths.feature.shop.catalogue.details.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.common.CatalogueAction;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/details/analytics/CatalogueDetailsActions;", "Lau/com/woolworths/feature/shop/catalogue/common/CatalogueAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueDetailsActions implements CatalogueAction {

    /* renamed from: a, reason: collision with root package name */
    public static final CatalogueScreen f6832a;
    public static final AnalyticsAction b;
    public static final AnalyticsAction c;
    public static final AnalyticsAction d;
    public static final AnalyticsAction e;
    public static final AnalyticsAction f;
    public static final AnalyticsAction g;
    public static final AnalyticsAction h;

    static {
        CatalogueDetailsActions catalogueDetailsActions = new CatalogueDetailsActions();
        CatalogueScreen catalogueScreen = CatalogueScreen.e;
        f6832a = catalogueScreen;
        b = catalogueDetailsActions.b();
        c = catalogueDetailsActions.a();
        d = new AnalyticsAction(catalogueDetailsActions.d(), Category.v, "No Results Found");
        e = catalogueDetailsActions.c("Catalogue Product");
        Category category = Category.n;
        f = new AnalyticsAction(catalogueScreen, category, "Swipe Left");
        g = new AnalyticsAction(catalogueScreen, category, "Swipe Right");
        h = catalogueDetailsActions.c("Try Again");
    }

    @Override // au.com.woolworths.feature.shop.catalogue.common.CatalogueAction
    public final CatalogueScreen d() {
        return f6832a;
    }
}
