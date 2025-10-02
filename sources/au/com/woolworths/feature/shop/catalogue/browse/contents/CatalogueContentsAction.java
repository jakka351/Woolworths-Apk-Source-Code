package au.com.woolworths.feature.shop.catalogue.browse.contents;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.common.CatalogueAction;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/contents/CatalogueContentsAction;", "Lau/com/woolworths/feature/shop/catalogue/common/CatalogueAction;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CatalogueContentsAction implements CatalogueAction {

    /* renamed from: a, reason: collision with root package name */
    public static final CatalogueContentsAction f6800a;
    public static final CatalogueScreen b;
    public static final AnalyticsAction c;
    public static final AnalyticsAction d;
    public static final AnalyticsAction e;
    public static final AnalyticsAction f;
    public static final AnalyticsAction g;

    static {
        CatalogueContentsAction catalogueContentsAction = new CatalogueContentsAction();
        f6800a = catalogueContentsAction;
        CatalogueScreen catalogueScreen = CatalogueScreen.g;
        b = catalogueScreen;
        c = catalogueContentsAction.b();
        d = catalogueContentsAction.a();
        e = new AnalyticsAction(catalogueContentsAction.d(), Category.B, "Catalogue Landing loaded");
        f = new AnalyticsAction(catalogueScreen, Category.h, "Actionable Card");
        g = new AnalyticsAction(catalogueScreen, Category.g, "Actionable Card");
    }

    @Override // au.com.woolworths.feature.shop.catalogue.common.CatalogueAction
    public final CatalogueScreen d() {
        return b;
    }
}
