package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.marketplace.ItemMarketplaceErrorBindingModel_;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceBrand;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceBrands;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSectionItem;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSeller;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSellers;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import com.airbnb.epoxy.Typed3EpoxyController;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0014J\f\u0010\u000e\u001a\u00020\n*\u00020\u000fH\u0002J\f\u0010\u000e\u001a\u00020\n*\u00020\u0010H\u0002J\f\u0010\u000e\u001a\u00020\n*\u00020\u0004H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetEpoxyController;", "Lcom/airbnb/epoxy/Typed3EpoxyController;", "Lau/com/woolworths/feature/shop/marketplace/data/models/InfoHeader;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceSectionItem;", "Lau/com/woolworths/feature/shop/marketplace/ui/marketplace/MarketplaceErrorState;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetViewModel;", "<init>", "(Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetViewModel;)V", "buildModels", "", "infoHeader", "data", "errorState", "buildUi", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceBrands;", "Lau/com/woolworths/feature/shop/marketplace/data/models/MarketplaceSellers;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceFacetEpoxyController extends Typed3EpoxyController<InfoHeader, MarketplaceSectionItem, MarketplaceErrorState> {
    public static final int $stable = 8;

    @NotNull
    private final MarketplaceFacetViewModel listener;

    public MarketplaceFacetEpoxyController(@NotNull MarketplaceFacetViewModel listener) {
        Intrinsics.h(listener, "listener");
        this.listener = listener;
    }

    private final void buildUi(MarketplaceBrands marketplaceBrands) {
        for (MarketplaceBrand marketplaceBrand : marketplaceBrands.e) {
            FacetItemViewModel_ facetItemViewModel_ = new FacetItemViewModel_();
            facetItemViewModel_.C("brand_" + marketplaceBrand.hashCode());
            String str = marketplaceBrand.b;
            facetItemViewModel_.t();
            facetItemViewModel_.n = str;
            androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(11, this, marketplaceBrand, marketplaceBrands);
            facetItemViewModel_.t();
            facetItemViewModel_.p = cVar;
            add(facetItemViewModel_);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildUi$lambda$2$lambda$1$lambda$0(MarketplaceFacetEpoxyController marketplaceFacetEpoxyController, MarketplaceBrand marketplaceBrand, MarketplaceBrands marketplaceBrands) {
        marketplaceFacetEpoxyController.listener.F2(marketplaceBrand, marketplaceBrands.c, marketplaceBrands.d);
        return Unit.f24250a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buildUi$lambda$5$lambda$4$lambda$3(MarketplaceFacetEpoxyController marketplaceFacetEpoxyController, MarketplaceSeller marketplaceSeller, MarketplaceSellers marketplaceSellers) {
        marketplaceFacetEpoxyController.listener.F2(marketplaceSeller, marketplaceSellers.c, marketplaceSellers.d);
        return Unit.f24250a;
    }

    @Override // com.airbnb.epoxy.Typed3EpoxyController
    public void buildModels(@Nullable InfoHeader infoHeader, @Nullable MarketplaceSectionItem data, @Nullable MarketplaceErrorState errorState) {
        if (errorState != null) {
            buildUi(errorState);
        } else if (data instanceof MarketplaceBrands) {
            buildUi((MarketplaceBrands) data);
        } else if (data instanceof MarketplaceSellers) {
            buildUi((MarketplaceSellers) data);
        }
    }

    private final void buildUi(MarketplaceSellers marketplaceSellers) {
        for (MarketplaceSeller marketplaceSeller : marketplaceSellers.e) {
            FacetItemViewModel_ facetItemViewModel_ = new FacetItemViewModel_();
            facetItemViewModel_.C("seller_" + marketplaceSeller.hashCode());
            String str = marketplaceSeller.f7474a;
            facetItemViewModel_.t();
            facetItemViewModel_.n = str;
            String str2 = marketplaceSeller.b;
            facetItemViewModel_.t();
            facetItemViewModel_.o = str2;
            androidx.work.impl.utils.c cVar = new androidx.work.impl.utils.c(12, this, marketplaceSeller, marketplaceSellers);
            facetItemViewModel_.t();
            facetItemViewModel_.p = cVar;
            add(facetItemViewModel_);
        }
    }

    private final void buildUi(MarketplaceErrorState marketplaceErrorState) {
        ItemMarketplaceErrorBindingModel_ itemMarketplaceErrorBindingModel_ = new ItemMarketplaceErrorBindingModel_();
        itemMarketplaceErrorBindingModel_.M();
        itemMarketplaceErrorBindingModel_.t();
        itemMarketplaceErrorBindingModel_.n = marketplaceErrorState;
        MarketplaceFacetViewModel marketplaceFacetViewModel = this.listener;
        itemMarketplaceErrorBindingModel_.t();
        itemMarketplaceErrorBindingModel_.o = marketplaceFacetViewModel;
        add(itemMarketplaceErrorBindingModel_);
    }
}
