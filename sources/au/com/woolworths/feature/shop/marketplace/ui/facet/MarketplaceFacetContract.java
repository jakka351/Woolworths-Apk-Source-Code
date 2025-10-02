package au.com.woolworths.feature.shop.marketplace.ui.facet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceBrands;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSectionItem;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceSellers;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.feature.shop.marketplace.ui.marketplacesection.SearchBarViewState;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract;", "", "Action", "ViewState", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MarketplaceFacetContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$Action;", "", "LaunchProductList", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$Action$LaunchProductList;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$Action$LaunchProductList;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductList extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7488a;
            public final String b;
            public final String c;

            public LaunchProductList(String name, String channel, String facet) {
                Intrinsics.h(name, "name");
                Intrinsics.h(channel, "channel");
                Intrinsics.h(facet, "facet");
                this.f7488a = name;
                this.b = channel;
                this.c = facet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductList)) {
                    return false;
                }
                LaunchProductList launchProductList = (LaunchProductList) obj;
                return Intrinsics.c(this.f7488a, launchProductList.f7488a) && Intrinsics.c(this.b, launchProductList.b) && Intrinsics.c(this.c, launchProductList.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f7488a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchProductList(id=null, name=", this.f7488a, ", channel=", this.b, ", facet="), this.c, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState;", "", "Initial", "SellersViewState", "BrandsViewState", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState$BrandsViewState;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState$Initial;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState$SellersViewState;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7489a;
        public final InfoHeader b;
        public final MarketplaceSectionItem c;
        public final int d;
        public final SearchBarViewState e;
        public final MarketplaceErrorState f;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState$BrandsViewState;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BrandsViewState extends ViewState {
            public final boolean g;
            public final InfoHeader h;
            public final MarketplaceBrands i;
            public final SearchBarViewState j;
            public final MarketplaceErrorState k;

            public BrandsViewState(boolean z, InfoHeader infoHeader, MarketplaceBrands marketplaceBrands, SearchBarViewState searchBarViewState, MarketplaceErrorState marketplaceErrorState) {
                super(z, infoHeader, marketplaceBrands, R.string.brands_search_hint, searchBarViewState, marketplaceErrorState);
                this.g = z;
                this.h = infoHeader;
                this.i = marketplaceBrands;
                this.j = searchBarViewState;
                this.k = marketplaceErrorState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof BrandsViewState)) {
                    return false;
                }
                BrandsViewState brandsViewState = (BrandsViewState) obj;
                return this.g == brandsViewState.g && Intrinsics.c(this.h, brandsViewState.h) && Intrinsics.c(this.i, brandsViewState.i) && Intrinsics.c(this.j, brandsViewState.j) && this.k == brandsViewState.k;
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.g) * 31;
                InfoHeader infoHeader = this.h;
                int iHashCode2 = (iHashCode + (infoHeader == null ? 0 : infoHeader.hashCode())) * 31;
                MarketplaceBrands marketplaceBrands = this.i;
                int iHashCode3 = (this.j.hashCode() + ((iHashCode2 + (marketplaceBrands == null ? 0 : marketplaceBrands.hashCode())) * 31)) * 31;
                MarketplaceErrorState marketplaceErrorState = this.k;
                return iHashCode3 + (marketplaceErrorState != null ? marketplaceErrorState.hashCode() : 0);
            }

            public final String toString() {
                return "BrandsViewState(isLoading=" + this.g + ", header=" + this.h + ", brands=" + this.i + ", searchBar=" + this.j + ", error=" + this.k + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState$Initial;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Initial extends ViewState {
            public static final Initial g = new Initial(false, null, null, 0, SearchBarViewState.Hidden.d, null);
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState$SellersViewState;", "Lau/com/woolworths/feature/shop/marketplace/ui/facet/MarketplaceFacetContract$ViewState;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SellersViewState extends ViewState {
            public final boolean g;
            public final MarketplaceSellers h;
            public final SearchBarViewState i;
            public final MarketplaceErrorState j;

            public SellersViewState(boolean z, MarketplaceSellers marketplaceSellers, SearchBarViewState searchBarViewState, MarketplaceErrorState marketplaceErrorState) {
                super(z, null, marketplaceSellers, R.string.sellers_search_hint, searchBarViewState, marketplaceErrorState);
                this.g = z;
                this.h = marketplaceSellers;
                this.i = searchBarViewState;
                this.j = marketplaceErrorState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof SellersViewState)) {
                    return false;
                }
                SellersViewState sellersViewState = (SellersViewState) obj;
                return this.g == sellersViewState.g && Intrinsics.c(this.h, sellersViewState.h) && Intrinsics.c(this.i, sellersViewState.i) && this.j == sellersViewState.j;
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.g) * 31;
                MarketplaceSellers marketplaceSellers = this.h;
                int iHashCode2 = (this.i.hashCode() + ((iHashCode + (marketplaceSellers == null ? 0 : marketplaceSellers.hashCode())) * 31)) * 31;
                MarketplaceErrorState marketplaceErrorState = this.j;
                return iHashCode2 + (marketplaceErrorState != null ? marketplaceErrorState.hashCode() : 0);
            }

            public final String toString() {
                return "SellersViewState(isLoading=" + this.g + ", sellers=" + this.h + ", searchBar=" + this.i + ", error=" + this.j + ")";
            }
        }

        public ViewState(boolean z, InfoHeader infoHeader, MarketplaceSectionItem marketplaceSectionItem, int i, SearchBarViewState searchBarViewState, MarketplaceErrorState marketplaceErrorState) {
            this.f7489a = z;
            this.b = infoHeader;
            this.c = marketplaceSectionItem;
            this.d = i;
            this.e = searchBarViewState;
            this.f = marketplaceErrorState;
        }
    }
}
