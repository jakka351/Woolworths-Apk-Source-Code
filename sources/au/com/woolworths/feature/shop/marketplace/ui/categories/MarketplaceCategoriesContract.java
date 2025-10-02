package au.com.woolworths.feature.shop.marketplace.ui.categories;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplaceCategories;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract;", "", "Action", "ViewState", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MarketplaceCategoriesContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action;", "", "LaunchProductList", "LaunchProductSubCategory", "Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action$LaunchProductList;", "Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action$LaunchProductSubCategory;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action$LaunchProductList;", "Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductList extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7481a;
            public final String b;
            public final String c;
            public final String d;
            public final String e;

            public LaunchProductList(String str, String str2, String channel, String facet, String str3) {
                Intrinsics.h(channel, "channel");
                Intrinsics.h(facet, "facet");
                this.f7481a = str;
                this.b = str2;
                this.c = channel;
                this.d = facet;
                this.e = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductList)) {
                    return false;
                }
                LaunchProductList launchProductList = (LaunchProductList) obj;
                return Intrinsics.c(this.f7481a, launchProductList.f7481a) && Intrinsics.c(this.b, launchProductList.b) && Intrinsics.c(this.c, launchProductList.c) && Intrinsics.c(this.d, launchProductList.d) && Intrinsics.c(this.e, launchProductList.e);
            }

            public final int hashCode() {
                String str = this.f7481a;
                int iC = androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c(androidx.camera.core.impl.b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
                String str2 = this.e;
                return iC + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbV = YU.a.v("LaunchProductList(id=", this.f7481a, ", name=", this.b, ", channel=");
                androidx.constraintlayout.core.state.a.B(sbV, this.c, ", facet=", this.d, ", source=");
                return YU.a.o(sbV, this.e, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action$LaunchProductSubCategory;", "Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductSubCategory extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7482a;
            public final String b;
            public final Activities.ProductSubCategory.ProductCategoryType c = Activities.ProductSubCategory.ProductCategoryType.e;

            public LaunchProductSubCategory(String str, String str2) {
                this.f7482a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductSubCategory)) {
                    return false;
                }
                LaunchProductSubCategory launchProductSubCategory = (LaunchProductSubCategory) obj;
                return Intrinsics.c(this.f7482a, launchProductSubCategory.f7482a) && Intrinsics.c(this.b, launchProductSubCategory.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7482a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("LaunchProductSubCategory(id=", this.f7482a, ", title=", this.b, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$ViewState;", "", "Companion", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState d = new ViewState(false, null, null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7483a;
        public final MarketplaceCategories b;
        public final MarketplaceErrorState c;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/categories/MarketplaceCategoriesContract$ViewState$Companion;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, MarketplaceCategories marketplaceCategories, MarketplaceErrorState marketplaceErrorState) {
            this.f7483a = z;
            this.b = marketplaceCategories;
            this.c = marketplaceErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7483a == viewState.f7483a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f7483a) * 31;
            MarketplaceCategories marketplaceCategories = this.b;
            int iHashCode2 = (iHashCode + (marketplaceCategories == null ? 0 : marketplaceCategories.hashCode())) * 31;
            MarketplaceErrorState marketplaceErrorState = this.c;
            return iHashCode2 + (marketplaceErrorState != null ? marketplaceErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f7483a + ", content=" + this.b + ", errorState=" + this.c + ")";
        }
    }
}
