package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.common.CatalogueAction;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseAction;", "Lau/com/woolworths/feature/shop/catalogue/common/CatalogueAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueBrowseAction implements CatalogueAction {

    /* renamed from: a, reason: collision with root package name */
    public static final CatalogueBrowseAction f6784a;
    public static final CatalogueScreen b;
    public static final AnalyticsAction c;
    public static final AnalyticsAction d;
    public static final AnalyticsAction e;
    public static final AnalyticsAction f;

    static {
        CatalogueBrowseAction catalogueBrowseAction = new CatalogueBrowseAction();
        f6784a = catalogueBrowseAction;
        b = CatalogueScreen.d;
        c = catalogueBrowseAction.b();
        d = catalogueBrowseAction.a();
        e = new AnalyticsAction(catalogueBrowseAction.d(), Category.B, "Banner products loaded");
        f = catalogueBrowseAction.c("Shop full range");
    }

    @Override // au.com.woolworths.feature.shop.catalogue.common.CatalogueAction
    public final CatalogueScreen d() {
        return b;
    }
}
