package au.com.woolworths.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.base.shopapp.data.models.InfoSectionAnalytics;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.product.details.models.HealthierHorizontalListData;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import au.com.woolworths.sdui.shop.actionablecard.ActionableCard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract;", "", "Actions", "ViewState", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0082\u0001\u0013\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "", "WebLinkClick", "AddButtonClick", "LaunchImageGallery", "LaunchAddToList", "DisplayRestrictedItemPrompt", "RequestFocusForNutritionTable", "LaunchMarketplaceInfoScreen", "LaunchProductDetails", "LaunchShareProductIntent", "LaunchRatingsAndReviews", "LaunchWriteReviewIntent", "LaunchHealthierBottomSheet", "LaunchEducationBottomSheet", "LaunchAvailabilityMessageBottomSheet", "LaunchPromotionScreen", "LaunchActionableCard", "CopyEverydayMarketCouponCode", "LaunchMarketplaceSellerItemsList", "LaunchInStoreMap", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$AddButtonClick;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$CopyEverydayMarketCouponCode;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchActionableCard;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchAddToList;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchAvailabilityMessageBottomSheet;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchEducationBottomSheet;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchHealthierBottomSheet;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchImageGallery;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchInStoreMap;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchMarketplaceInfoScreen;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchMarketplaceSellerItemsList;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchPromotionScreen;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchRatingsAndReviews;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchShareProductIntent;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchWriteReviewIntent;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$RequestFocusForNutritionTable;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions$WebLinkClick;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$AddButtonClick;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AddButtonClick extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f9291a;
            public final boolean b;

            static {
                int i = ProductCard.$stable;
            }

            public AddButtonClick(ProductCard productCard, boolean z) {
                Intrinsics.h(productCard, "productCard");
                this.f9291a = productCard;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof AddButtonClick)) {
                    return false;
                }
                AddButtonClick addButtonClick = (AddButtonClick) obj;
                return Intrinsics.c(this.f9291a, addButtonClick.f9291a) && this.b == addButtonClick.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f9291a.hashCode() * 31);
            }

            public final String toString() {
                return "AddButtonClick(productCard=" + this.f9291a + ", saveEducationBottomSheetPrefs=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$CopyEverydayMarketCouponCode;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CopyEverydayMarketCouponCode extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f9292a;

            public CopyEverydayMarketCouponCode(String couponCode) {
                Intrinsics.h(couponCode, "couponCode");
                this.f9292a = couponCode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CopyEverydayMarketCouponCode) && Intrinsics.c(this.f9292a, ((CopyEverydayMarketCouponCode) obj).f9292a);
            }

            public final int hashCode() {
                return Integer.hashCode(com.woolworths.R.string.everyday_market_coupon_coupon_accessibility_copy_success) + androidx.camera.core.impl.b.a(com.woolworths.R.string.copy_coupon_code_success_message, androidx.camera.core.impl.b.a(com.woolworths.R.string.copy_coupon_code_to_clipboard_label, this.f9292a.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                return YU.a.h("CopyEverydayMarketCouponCode(couponCode=", this.f9292a, ", copyLabelRes=2132017675, successMessageRes=2132017674, accessibilitySuccessMessageRes=2132017850)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayRestrictedItemPrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f9293a;

            public DisplayRestrictedItemPrompt(boolean z) {
                this.f9293a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayRestrictedItemPrompt) && this.f9293a == ((DisplayRestrictedItemPrompt) obj).f9293a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f9293a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("DisplayRestrictedItemPrompt(isLoggedIn=", ")", this.f9293a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchActionableCard;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchActionableCard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ActionableCard f9294a;

            public LaunchActionableCard(ActionableCard actionableCard) {
                Intrinsics.h(actionableCard, "actionableCard");
                this.f9294a = actionableCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchActionableCard) && Intrinsics.c(this.f9294a, ((LaunchActionableCard) obj).f9294a);
            }

            public final int hashCode() {
                return this.f9294a.hashCode();
            }

            public final String toString() {
                return "LaunchActionableCard(actionableCard=" + this.f9294a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchAddToList;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f9295a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAddToList(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f9295a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAddToList) && Intrinsics.c(this.f9295a, ((LaunchAddToList) obj).f9295a);
            }

            public final int hashCode() {
                return this.f9295a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchAddToList(productCard=", this.f9295a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchAvailabilityMessageBottomSheet;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAvailabilityMessageBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f9296a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAvailabilityMessageBottomSheet(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f9296a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAvailabilityMessageBottomSheet) && Intrinsics.c(this.f9296a, ((LaunchAvailabilityMessageBottomSheet) obj).f9296a);
            }

            public final int hashCode() {
                return this.f9296a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchAvailabilityMessageBottomSheet(productCard=", this.f9296a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchEducationBottomSheet;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchEducationBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BottomSheetContent.Marketplace f9297a;
            public final InfoSection b;

            public LaunchEducationBottomSheet(BottomSheetContent.Marketplace marketplace, InfoSection infoSection) {
                this.f9297a = marketplace;
                this.b = infoSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchEducationBottomSheet)) {
                    return false;
                }
                LaunchEducationBottomSheet launchEducationBottomSheet = (LaunchEducationBottomSheet) obj;
                return Intrinsics.c(this.f9297a, launchEducationBottomSheet.f9297a) && Intrinsics.c(this.b, launchEducationBottomSheet.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f9297a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchEducationBottomSheet(bottomSheet=" + this.f9297a + ", infoSection=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchHealthierBottomSheet;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchHealthierBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final HealthierHorizontalListData f9298a;

            public LaunchHealthierBottomSheet(HealthierHorizontalListData data) {
                Intrinsics.h(data, "data");
                this.f9298a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchHealthierBottomSheet) && Intrinsics.c(this.f9298a, ((LaunchHealthierBottomSheet) obj).f9298a);
            }

            public final int hashCode() {
                return this.f9298a.hashCode();
            }

            public final String toString() {
                return "LaunchHealthierBottomSheet(data=" + this.f9298a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchImageGallery;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchImageGallery extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.ImageGallery.Extras f9299a;

            public LaunchImageGallery(Activities.ImageGallery.Extras extras) {
                this.f9299a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchImageGallery) && Intrinsics.c(this.f9299a, ((LaunchImageGallery) obj).f9299a);
            }

            public final int hashCode() {
                return this.f9299a.hashCode();
            }

            public final String toString() {
                return "LaunchImageGallery(extras=" + this.f9299a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchInStoreMap;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInStoreMap extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f9300a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchInStoreMap(ProductCard productCard) {
                Intrinsics.h(productCard, "productCard");
                this.f9300a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInStoreMap) && Intrinsics.c(this.f9300a, ((LaunchInStoreMap) obj).f9300a);
            }

            public final int hashCode() {
                return this.f9300a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchInStoreMap(productCard=", this.f9300a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchMarketplaceInfoScreen;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchMarketplaceInfoScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final InfoSection f9301a;
            public final InfoSectionAnalytics b;

            public LaunchMarketplaceInfoScreen(InfoSection infoSection, InfoSectionAnalytics analytics) {
                Intrinsics.h(infoSection, "infoSection");
                Intrinsics.h(analytics, "analytics");
                this.f9301a = infoSection;
                this.b = analytics;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchMarketplaceInfoScreen)) {
                    return false;
                }
                LaunchMarketplaceInfoScreen launchMarketplaceInfoScreen = (LaunchMarketplaceInfoScreen) obj;
                return Intrinsics.c(this.f9301a, launchMarketplaceInfoScreen.f9301a) && Intrinsics.c(this.b, launchMarketplaceInfoScreen.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f9301a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchMarketplaceInfoScreen(infoSection=" + this.f9301a + ", analytics=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchMarketplaceSellerItemsList;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchMarketplaceSellerItemsList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f9302a;
            public final String b;
            public final String c;

            public LaunchMarketplaceSellerItemsList(String sellerName, String channel, String facet) {
                Intrinsics.h(sellerName, "sellerName");
                Intrinsics.h(channel, "channel");
                Intrinsics.h(facet, "facet");
                this.f9302a = sellerName;
                this.b = channel;
                this.c = facet;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchMarketplaceSellerItemsList)) {
                    return false;
                }
                LaunchMarketplaceSellerItemsList launchMarketplaceSellerItemsList = (LaunchMarketplaceSellerItemsList) obj;
                return Intrinsics.c(this.f9302a, launchMarketplaceSellerItemsList.f9302a) && Intrinsics.c(this.b, launchMarketplaceSellerItemsList.b) && Intrinsics.c(this.c, launchMarketplaceSellerItemsList.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + androidx.camera.core.impl.b.c(this.f9302a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("LaunchMarketplaceSellerItemsList(sellerName=", this.f9302a, ", channel=", this.b, ", facet="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchProductDetails;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f9303a;

            public LaunchProductDetails(String productId) {
                Intrinsics.h(productId, "productId");
                this.f9303a = productId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f9303a, ((LaunchProductDetails) obj).f9303a);
            }

            public final int hashCode() {
                return this.f9303a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchProductDetails(productId=", this.f9303a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchPromotionScreen;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPromotionScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PromotionMarkdownContent f9304a;

            public LaunchPromotionScreen(PromotionMarkdownContent promotionMarkdownContent) {
                Intrinsics.h(promotionMarkdownContent, "promotionMarkdownContent");
                this.f9304a = promotionMarkdownContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchPromotionScreen) && Intrinsics.c(this.f9304a, ((LaunchPromotionScreen) obj).f9304a);
            }

            public final int hashCode() {
                return this.f9304a.hashCode();
            }

            public final String toString() {
                return "LaunchPromotionScreen(promotionMarkdownContent=" + this.f9304a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchRatingsAndReviews;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRatingsAndReviews extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f9305a;

            public LaunchRatingsAndReviews(String link) {
                Intrinsics.h(link, "link");
                this.f9305a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRatingsAndReviews) && Intrinsics.c(this.f9305a, ((LaunchRatingsAndReviews) obj).f9305a);
            }

            public final int hashCode() {
                return this.f9305a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchRatingsAndReviews(link=", this.f9305a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchShareProductIntent;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchShareProductIntent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f9306a;

            public LaunchShareProductIntent(String productId) {
                Intrinsics.h(productId, "productId");
                this.f9306a = productId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchShareProductIntent) && Intrinsics.c(this.f9306a, ((LaunchShareProductIntent) obj).f9306a);
            }

            public final int hashCode() {
                return this.f9306a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchShareProductIntent(productId=", this.f9306a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$LaunchWriteReviewIntent;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWriteReviewIntent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f9307a;

            public LaunchWriteReviewIntent(String link) {
                Intrinsics.h(link, "link");
                this.f9307a = link;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchWriteReviewIntent) && Intrinsics.c(this.f9307a, ((LaunchWriteReviewIntent) obj).f9307a);
            }

            public final int hashCode() {
                return this.f9307a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchWriteReviewIntent(link=", this.f9307a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$RequestFocusForNutritionTable;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RequestFocusForNutritionTable extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RequestFocusForNutritionTable f9308a = new RequestFocusForNutritionTable();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$Actions$WebLinkClick;", "Lau/com/woolworths/product/details/ProductDetailsContract$Actions;", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class WebLinkClick extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f9309a;

            public WebLinkClick(String url) {
                Intrinsics.h(url, "url");
                this.f9309a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof WebLinkClick) && Intrinsics.c(this.f9309a, ((WebLinkClick) obj).f9309a);
            }

            public final int hashCode() {
                return this.f9309a.hashCode();
            }

            public final String toString() {
                return YU.a.h("WebLinkClick(url=", this.f9309a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/details/ProductDetailsContract$ViewState;", "", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final List f9310a;
        public final List b;
        public final boolean c;
        public final ProductDetailsErrorState d;

        public ViewState(List feed, List imageList, boolean z, ProductDetailsErrorState productDetailsErrorState) {
            Intrinsics.h(feed, "feed");
            Intrinsics.h(imageList, "imageList");
            this.f9310a = feed;
            this.b = imageList;
            this.c = z;
            this.d = productDetailsErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f9310a, viewState.f9310a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d;
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.d(this.f9310a.hashCode() * 31, 31, this.b), 31, this.c);
            ProductDetailsErrorState productDetailsErrorState = this.d;
            return iE + (productDetailsErrorState == null ? 0 : productDetailsErrorState.hashCode());
        }

        public final String toString() {
            return "ViewState(feed=" + this.f9310a + ", imageList=" + this.b + ", isLoading=" + this.c + ", errorState=" + this.d + ")";
        }
    }
}
