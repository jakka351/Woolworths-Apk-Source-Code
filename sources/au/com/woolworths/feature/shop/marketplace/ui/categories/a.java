package au.com.woolworths.feature.shop.marketplace.ui.categories;

import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategories;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategory;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ MarketplaceCategory e;
    public final /* synthetic */ MarketplaceCategories f;
    public final /* synthetic */ Object g;

    public /* synthetic */ a(Object obj, MarketplaceCategory marketplaceCategory, MarketplaceCategories marketplaceCategories, int i) {
        this.d = i;
        this.g = obj;
        this.e = marketplaceCategory;
        this.f = marketplaceCategories;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return MarketplaceCategoriesEpoxyController.buildUi$lambda$3$lambda$2$lambda$1((MarketplaceCategoriesEpoxyController) this.g, this.e, this.f);
            default:
                MarketplaceCategoriesListener marketplaceCategoriesListener = (MarketplaceCategoriesListener) this.g;
                MarketplaceCategories marketplaceCategories = this.f;
                marketplaceCategoriesListener.K5(this.e, marketplaceCategories.c, marketplaceCategories.d);
                return Unit.f24250a;
        }
    }
}
