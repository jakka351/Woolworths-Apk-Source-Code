package au.com.woolworths.feature.shop.catalogue.browse;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.PagingData;
import au.com.woolworths.feature.shop.catalogue.browse.contents.model.CatalogueContents;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract;", "", "Action", "BrowseViewState", "ContentsViewState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CatalogueBrowseContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action;", "", "LaunchProductDetails", "LaunchCatalogueListing", "LaunchPromotionListing", "LaunchDeepLink", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchCatalogueListing;", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchPromotionListing;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchCatalogueListing;", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCatalogueListing extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6789a;

            public LaunchCatalogueListing(String str) {
                this.f6789a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCatalogueListing) && Intrinsics.c(this.f6789a, ((LaunchCatalogueListing) obj).f6789a);
            }

            public final int hashCode() {
                return this.f6789a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchCatalogueListing(categoryId=", this.f6789a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6790a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f6790a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f6790a, ((LaunchDeepLink) obj).f6790a);
            }

            public final int hashCode() {
                return this.f6790a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f6790a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6791a;

            public LaunchProductDetails(String productId) {
                Intrinsics.h(productId, "productId");
                this.f6791a = productId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f6791a, ((LaunchProductDetails) obj).f6791a);
            }

            public final int hashCode() {
                return this.f6791a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchProductDetails(productId=", this.f6791a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action$LaunchPromotionListing;", "Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPromotionListing extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6792a;

            public LaunchPromotionListing(String str) {
                this.f6792a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchPromotionListing) && Intrinsics.c(this.f6792a, ((LaunchPromotionListing) obj).f6792a);
            }

            public final int hashCode() {
                return this.f6792a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchPromotionListing(promotionId=", this.f6792a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$BrowseViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BrowseViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6793a;
        public final PagingData b;
        public final CatalogueBrowsePageErrorState c;

        public BrowseViewState(PagingData pagingData, CatalogueBrowsePageErrorState catalogueBrowsePageErrorState, int i) {
            boolean z = (i & 1) == 0;
            pagingData = (i & 2) != 0 ? null : pagingData;
            catalogueBrowsePageErrorState = (i & 4) != 0 ? null : catalogueBrowsePageErrorState;
            this.f6793a = z;
            this.b = pagingData;
            this.c = catalogueBrowsePageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BrowseViewState)) {
                return false;
            }
            BrowseViewState browseViewState = (BrowseViewState) obj;
            return this.f6793a == browseViewState.f6793a && Intrinsics.c(this.b, browseViewState.b) && this.c == browseViewState.c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6793a) * 31;
            PagingData pagingData = this.b;
            int iHashCode2 = (iHashCode + (pagingData == null ? 0 : pagingData.hashCode())) * 31;
            CatalogueBrowsePageErrorState catalogueBrowsePageErrorState = this.c;
            return iHashCode2 + (catalogueBrowsePageErrorState != null ? catalogueBrowsePageErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "BrowseViewState(isLoading=" + this.f6793a + ", data=" + this.b + ", errorState=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/browse/CatalogueBrowseContract$ContentsViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentsViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6794a;
        public final CatalogueContents b;
        public final CatalogueBrowsePageErrorState c;

        public ContentsViewState(CatalogueContents catalogueContents, CatalogueBrowsePageErrorState catalogueBrowsePageErrorState, int i) {
            boolean z = (i & 1) == 0;
            catalogueContents = (i & 2) != 0 ? null : catalogueContents;
            catalogueBrowsePageErrorState = (i & 4) != 0 ? null : catalogueBrowsePageErrorState;
            this.f6794a = z;
            this.b = catalogueContents;
            this.c = catalogueBrowsePageErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentsViewState)) {
                return false;
            }
            ContentsViewState contentsViewState = (ContentsViewState) obj;
            return this.f6794a == contentsViewState.f6794a && Intrinsics.c(this.b, contentsViewState.b) && this.c == contentsViewState.c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6794a) * 31;
            CatalogueContents catalogueContents = this.b;
            int iHashCode2 = (iHashCode + (catalogueContents == null ? 0 : catalogueContents.f6803a.hashCode())) * 31;
            CatalogueBrowsePageErrorState catalogueBrowsePageErrorState = this.c;
            return iHashCode2 + (catalogueBrowsePageErrorState != null ? catalogueBrowsePageErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ContentsViewState(isLoading=" + this.f6794a + ", data=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
