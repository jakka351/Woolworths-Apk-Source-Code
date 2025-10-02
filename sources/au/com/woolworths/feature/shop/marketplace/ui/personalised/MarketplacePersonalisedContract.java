package au.com.woolworths.feature.shop.marketplace.ui.personalised;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionAnalytics;
import au.com.woolworths.feature.shop.marketplace.data.models.InfoHeader;
import au.com.woolworths.feature.shop.marketplace.data.models.MarketplacePersonalised;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceErrorState;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract;", "", "Action", "ViewState", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MarketplacePersonalisedContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action;", "", "LaunchInfoSection", "LaunchPromotionScreen", "OpenUrl", "LaunchProductDetails", "LaunchAddOrUpdateProduct", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchAddOrUpdateProduct;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchInfoSection;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchPromotionScreen;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$OpenUrl;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchAddOrUpdateProduct;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddOrUpdateProduct extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f7502a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAddOrUpdateProduct(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f7502a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAddOrUpdateProduct) && Intrinsics.c(this.f7502a, ((LaunchAddOrUpdateProduct) obj).f7502a);
            }

            public final int hashCode() {
                return this.f7502a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchAddOrUpdateProduct(product=", this.f7502a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchInfoSection;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInfoSection extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final InfoSection f7503a;
            public final InfoSectionAnalytics b;

            public LaunchInfoSection(InfoSection infoSection) {
                InfoSectionAnalytics analytics = MarketplaceActions.e;
                Intrinsics.h(infoSection, "infoSection");
                Intrinsics.h(analytics, "analytics");
                this.f7503a = infoSection;
                this.b = analytics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchInfoSection)) {
                    return false;
                }
                LaunchInfoSection launchInfoSection = (LaunchInfoSection) obj;
                return Intrinsics.c(this.f7503a, launchInfoSection.f7503a) && Intrinsics.c(this.b, launchInfoSection.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7503a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchInfoSection(infoSection=" + this.f7503a + ", analytics=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchProductDetails;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f7504a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f7504a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f7504a, ((LaunchProductDetails) obj).f7504a);
            }

            public final int hashCode() {
                return this.f7504a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetails(product=", this.f7504a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$LaunchPromotionScreen;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPromotionScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final PromotionMarkdownContent f7505a;

            public LaunchPromotionScreen(PromotionMarkdownContent content) {
                Intrinsics.h(content, "content");
                this.f7505a = content;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchPromotionScreen) && Intrinsics.c(this.f7505a, ((LaunchPromotionScreen) obj).f7505a);
            }

            public final int hashCode() {
                return this.f7505a.hashCode();
            }

            public final String toString() {
                return "LaunchPromotionScreen(content=" + this.f7505a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action$OpenUrl;", "Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$Action;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f7506a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f7506a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f7506a, ((OpenUrl) obj).f7506a);
            }

            public final int hashCode() {
                return this.f7506a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f7506a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$ViewState;", "", "Companion", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState e = new ViewState(false, null, null, null);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7507a;
        public final InfoHeader b;
        public final MarketplacePersonalised c;
        public final MarketplaceErrorState d;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/personalised/MarketplacePersonalisedContract$ViewState$Companion;", "", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(boolean z, InfoHeader infoHeader, MarketplacePersonalised marketplacePersonalised, MarketplaceErrorState marketplaceErrorState) {
            this.f7507a = z;
            this.b = infoHeader;
            this.c = marketplacePersonalised;
            this.d = marketplaceErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7507a == viewState.f7507a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f7507a) * 31;
            InfoHeader infoHeader = this.b;
            int iHashCode2 = (iHashCode + (infoHeader == null ? 0 : infoHeader.hashCode())) * 31;
            MarketplacePersonalised marketplacePersonalised = this.c;
            int iHashCode3 = (iHashCode2 + (marketplacePersonalised == null ? 0 : marketplacePersonalised.hashCode())) * 31;
            MarketplaceErrorState marketplaceErrorState = this.d;
            return iHashCode3 + (marketplaceErrorState != null ? marketplaceErrorState.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f7507a + ", infoHeader=" + this.b + ", content=" + this.c + ", errorState=" + this.d + ")";
        }
    }
}
