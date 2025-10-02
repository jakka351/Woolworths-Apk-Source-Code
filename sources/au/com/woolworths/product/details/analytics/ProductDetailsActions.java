package au.com.woolworths.product.details.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u0019\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234¨\u00065"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "AisleInfoImpression", "CollapseContent", "CppCarouselImpression", "DataLoadedImpression", "DeeplinkVisit", "EmbeddedProductAddToCart", "EmbeddedProductAddToList", "EmbeddedProductClick", "EmbeddedProductUpdateCart", "ExpandContent", "HealthOptionsSwipeLeft", "HealthOptionsSwipeRight", "OpenAddToList", "OpenEverydayMarketplaceHowItWorks", "OpenHealthOptionsCard", "OpenHealthOptionsMoreInfo", "OpenImageGallery", "OpenProductAvailability", "RestrictedItemLoginPrompt", "RestrictedItemLoginPromptCancel", "RestrictedItemLoginPromptLogin", "RestrictedItemLoginPromptOk", "ShareProductClick", "SwipeImageCarousel", "VisitOurWebsiteLink", "Companion", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$AisleInfoImpression;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$CollapseContent;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$CppCarouselImpression;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$DataLoadedImpression;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$DeeplinkVisit;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductAddToCart;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductAddToList;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductClick;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductUpdateCart;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$ExpandContent;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$HealthOptionsSwipeLeft;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$HealthOptionsSwipeRight;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenAddToList;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenEverydayMarketplaceHowItWorks;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenHealthOptionsCard;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenHealthOptionsMoreInfo;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenImageGallery;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenProductAvailability;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPrompt;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPromptCancel;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPromptLogin;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPromptOk;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$ShareProductClick;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$SwipeImageCarousel;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions$VisitOurWebsiteLink;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductDetailsActions implements Action {
    public final Screens d = Screens.t;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$AisleInfoImpression;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AisleInfoImpression extends ProductDetailsActions {
        public static final AisleInfoImpression e = new AisleInfoImpression();
        public static final Category f = Category.B;
        public static final String g = "Aisle Location";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$CollapseContent;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CollapseContent extends ProductDetailsActions {
        public static final CollapseContent e = new CollapseContent();
        public static final Category f = Category.m;
        public static final String g = "See Less - Collapse";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\f"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$Companion;", "", "", "HEALTH_STAR_RATE_ENABLED", "Ljava/lang/String;", "HEALTH_STAR_RATE_DISABLED", "", "ZERO_HEALTHY_SWAPS_COUNT", "I", "HEALTHY_SWAPS_SOURCE", "VISIT_HEALTHIER_OPTIONS_LINK", "PDP_SCREEN_TYPE", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$CppCarouselImpression;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CppCarouselImpression extends ProductDetailsActions {
        public final String e;
        public final Category f;

        public CppCarouselImpression(String label) {
            Intrinsics.h(label, "label");
            this.e = label;
            this.f = Category.B;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CppCarouselImpression) && Intrinsics.c(this.e, ((CppCarouselImpression) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("CppCarouselImpression(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$DataLoadedImpression;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataLoadedImpression extends ProductDetailsActions {
        public static final Category e;
        public static final String f;

        static {
            new DataLoadedImpression();
            e = Category.B;
            f = "Product Details Screen Loaded";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$DeeplinkVisit;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeeplinkVisit extends ProductDetailsActions {
        public static final DeeplinkVisit e = new DeeplinkVisit();
        public static final Category f = Category.t;
        public static final String g = "Deeplink Product Details";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductAddToCart;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmbeddedProductAddToCart extends ProductDetailsActions {
        public static final EmbeddedProductAddToCart e = new EmbeddedProductAddToCart();
        public static final Category f = Category.m;
        public static final String g = "Add To Cart";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductAddToList;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmbeddedProductAddToList extends ProductDetailsActions {
        public static final EmbeddedProductAddToList e = new EmbeddedProductAddToList();
        public static final Category f = Category.m;
        public static final String g = "Add To List";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductClick;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmbeddedProductClick extends ProductDetailsActions {
        public static final EmbeddedProductClick e = new EmbeddedProductClick();
        public static final Category f = Category.m;
        public static final String g = "Product";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$EmbeddedProductUpdateCart;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EmbeddedProductUpdateCart extends ProductDetailsActions {
        public static final Category e;
        public static final String f;

        static {
            new EmbeddedProductUpdateCart();
            e = Category.m;
            f = "Update Cart";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$ExpandContent;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExpandContent extends ProductDetailsActions {
        public static final ExpandContent e = new ExpandContent();
        public static final Category f = Category.m;
        public static final String g = "See More - Expand";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$HealthOptionsSwipeLeft;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HealthOptionsSwipeLeft extends ProductDetailsActions {
        public static final HealthOptionsSwipeLeft e = new HealthOptionsSwipeLeft();
        public static final Category f = Category.n;
        public static final String g = "Health Options Swipe Left";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$HealthOptionsSwipeRight;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HealthOptionsSwipeRight extends ProductDetailsActions {
        public static final HealthOptionsSwipeRight e = new HealthOptionsSwipeRight();
        public static final Category f = Category.n;
        public static final String g = "Health Options Swipe Right";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenAddToList;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenAddToList extends ProductDetailsActions {
        public static final OpenAddToList e = new OpenAddToList();
        public static final Category f = Category.m;
        public static final String g = "Open Add To List";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenEverydayMarketplaceHowItWorks;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenEverydayMarketplaceHowItWorks extends ProductDetailsActions {
        public static final OpenEverydayMarketplaceHowItWorks e = new OpenEverydayMarketplaceHowItWorks();
        public static final Category f = Category.m;
        public static final String g = "Everyday Marketplace - How it works";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenHealthOptionsCard;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenHealthOptionsCard extends ProductDetailsActions {
        public static final OpenHealthOptionsCard e = new OpenHealthOptionsCard();
        public static final Category f = Category.S;
        public static final String g = "Health Options Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenHealthOptionsMoreInfo;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenHealthOptionsMoreInfo extends ProductDetailsActions {
        public static final OpenHealthOptionsMoreInfo e = new OpenHealthOptionsMoreInfo();
        public static final Category f = Category.m;
        public static final String g = "More Info";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenImageGallery;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenImageGallery extends ProductDetailsActions {
        public static final OpenImageGallery e = new OpenImageGallery();
        public static final Category f = Category.m;
        public static final String g = "Open Image Gallery";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$OpenProductAvailability;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenProductAvailability extends ProductDetailsActions {
        public final String e;
        public final Category f = Category.m;

        public OpenProductAvailability(String str) {
            this.e = str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
            return this.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenProductAvailability) && Intrinsics.c(this.e, ((OpenProductAvailability) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("OpenProductAvailability(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPrompt;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPrompt extends ProductDetailsActions {
        public static final RestrictedItemLoginPrompt e = new RestrictedItemLoginPrompt();
        public static final Category f = Category.B;
        public static final String g = "Restricted Item - Login Prompt";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPromptCancel;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPromptCancel extends ProductDetailsActions {
        public static final RestrictedItemLoginPromptCancel e = new RestrictedItemLoginPromptCancel();
        public static final Category f = Category.m;
        public static final String g = "Restricted Item - Cancel";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPromptLogin;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPromptLogin extends ProductDetailsActions {
        public static final RestrictedItemLoginPromptLogin e = new RestrictedItemLoginPromptLogin();
        public static final Category f = Category.m;
        public static final String g = "Restricted Item - Login";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$RestrictedItemLoginPromptOk;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RestrictedItemLoginPromptOk extends ProductDetailsActions {
        public static final RestrictedItemLoginPromptOk e = new RestrictedItemLoginPromptOk();
        public static final Category f = Category.m;
        public static final String g = "Restricted Item - OK";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$ShareProductClick;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShareProductClick extends ProductDetailsActions {
        public static final ShareProductClick e = new ShareProductClick();
        public static final Category f = Category.e0;
        public static final String g = "Share Product";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$SwipeImageCarousel;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SwipeImageCarousel extends ProductDetailsActions {
        public static final SwipeImageCarousel e = new SwipeImageCarousel();
        public static final Category f = Category.l;
        public static final String g = "Swipe Image Carousel";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/analytics/ProductDetailsActions$VisitOurWebsiteLink;", "Lau/com/woolworths/product/details/analytics/ProductDetailsActions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VisitOurWebsiteLink extends ProductDetailsActions {
        public static final VisitOurWebsiteLink e = new VisitOurWebsiteLink();
        public static final Category f = Category.D;
        public static final String g = "Visit Our Website";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
