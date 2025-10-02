package au.com.woolworths.feature.shop.marketplace.ui.categories;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.product.list.legacy.k;
import au.com.woolworths.feature.shop.marketplace.ItemMarketplaceErrorBindingModel_;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategories;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategory;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import com.airbnb.epoxy.Typed2EpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \r2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0014J\f\u0010\f\u001a\u00020\t*\u00020\u0002H\u0002J\f\u0010\f\u001a\u00020\t*\u00020\u0003H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesEpoxyController;", "Lcom/airbnb/epoxy/Typed2EpoxyController;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceCategories;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceErrorState;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesViewModel;", "<init>", "(Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesViewModel;)V", "buildModels", "", "categories", "errorState", "buildUi", "Companion", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceCategoriesEpoxyController extends Typed2EpoxyController<MarketplaceCategories, MarketplaceErrorState> {
    public static final int $stable = 8;
    public static final int SPAN = 2;

    @NotNull
    private final MarketplaceCategoriesViewModel listener;

    public MarketplaceCategoriesEpoxyController(@NotNull MarketplaceCategoriesViewModel listener) {
        Intrinsics.h(listener, "listener");
        this.listener = listener;
    }

    private final void buildUi(MarketplaceCategories marketplaceCategories) {
        for (MarketplaceCategory marketplaceCategory : marketplaceCategories.e) {
            CategoryTileViewModel_ categoryTileViewModel_ = new CategoryTileViewModel_();
            categoryTileViewModel_.n = null;
            categoryTileViewModel_.o = null;
            categoryTileViewModel_.p = null;
            categoryTileViewModel_.C("category_".concat(marketplaceCategory.f7472a));
            String str = marketplaceCategory.b;
            categoryTileViewModel_.t();
            categoryTileViewModel_.n = str;
            String str2 = marketplaceCategory.c;
            categoryTileViewModel_.t();
            categoryTileViewModel_.o = str2;
            categoryTileViewModel_.l = new k(15);
            a aVar = new a(this, marketplaceCategory, marketplaceCategories, 0);
            categoryTileViewModel_.t();
            categoryTileViewModel_.p = aVar;
            add(categoryTileViewModel_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildUi$lambda$3$lambda$2$lambda$0(int i, int i2, int i3) {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildUi$lambda$3$lambda$2$lambda$1(MarketplaceCategoriesEpoxyController marketplaceCategoriesEpoxyController, MarketplaceCategory marketplaceCategory, MarketplaceCategories marketplaceCategories) {
        marketplaceCategoriesEpoxyController.listener.K5(marketplaceCategory, marketplaceCategories.c, marketplaceCategories.d);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int buildUi$lambda$5$lambda$4(int i, int i2, int i3) {
        return 2;
    }

    @Override // com.airbnb.epoxy.Typed2EpoxyController
    public void buildModels(@Nullable MarketplaceCategories categories, @Nullable MarketplaceErrorState errorState) {
        if (errorState != null) {
            buildUi(errorState);
        } else if (categories != null) {
            buildUi(categories);
        }
    }

    private final void buildUi(MarketplaceErrorState marketplaceErrorState) {
        ItemMarketplaceErrorBindingModel_ itemMarketplaceErrorBindingModel_ = new ItemMarketplaceErrorBindingModel_();
        itemMarketplaceErrorBindingModel_.M();
        itemMarketplaceErrorBindingModel_.t();
        itemMarketplaceErrorBindingModel_.n = marketplaceErrorState;
        MarketplaceCategoriesViewModel marketplaceCategoriesViewModel = this.listener;
        itemMarketplaceErrorBindingModel_.t();
        itemMarketplaceErrorBindingModel_.o = marketplaceCategoriesViewModel;
        itemMarketplaceErrorBindingModel_.l = new k(16);
        add(itemMarketplaceErrorBindingModel_);
    }
}
