package au.com.woolworths.shop.product.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.product.details.data.NutritionInfo;
import au.com.woolworths.shop.product.details.data.ProductDetailsPage;
import au.com.woolworths.shop.product.details.data.ProductDetailsRowLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract;", "", "ViewState", "Snackbar", "Action", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "", "LaunchLink", "LaunchProductDetails", "LaunchAddToCartBottomSheet", "LaunchListsBottomSheet", "LaunchSeeInStoreBottomSheet", "LaunchCheckStockScreen", "LaunchInStoreMap", "LaunchShareProductIntent", "DisplayRestrictedItemPrompt", "ShowCartScreen", "CopyEverydayMarketCouponCode", "LaunchViewList", "LaunchWatchlistGuestOnboardingScreen", "LaunchProductAlternativesScreen", "OpenOliveChat", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$CopyEverydayMarketCouponCode;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchAddToCartBottomSheet;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchCheckStockScreen;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchInStoreMap;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchLink;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchListsBottomSheet;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchProductAlternativesScreen;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchProductDetails;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchSeeInStoreBottomSheet;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchShareProductIntent;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchViewList;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$OpenOliveChat;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$ShowCartScreen;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$CopyEverydayMarketCouponCode;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CopyEverydayMarketCouponCode extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12550a;

            public CopyEverydayMarketCouponCode(String couponCode) {
                Intrinsics.h(couponCode, "couponCode");
                this.f12550a = couponCode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CopyEverydayMarketCouponCode) && Intrinsics.c(this.f12550a, ((CopyEverydayMarketCouponCode) obj).f12550a);
            }

            public final int hashCode() {
                return Integer.hashCode(com.woolworths.R.string.everyday_market_coupon_coupon_accessibility_copy_success) + androidx.camera.core.impl.b.a(com.woolworths.R.string.copy_coupon_code_to_clipboard_label, this.f12550a.hashCode() * 31, 31);
            }

            public final String toString() {
                return YU.a.h("CopyEverydayMarketCouponCode(couponCode=", this.f12550a, ", copyLabelRes=2132017675, accessibilitySuccessMessageRes=2132017850)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$DisplayRestrictedItemPrompt;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayRestrictedItemPrompt extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f12551a;

            public DisplayRestrictedItemPrompt(boolean z) {
                this.f12551a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof DisplayRestrictedItemPrompt) && this.f12551a == ((DisplayRestrictedItemPrompt) obj).f12551a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f12551a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("DisplayRestrictedItemPrompt(isLoggedIn=", ")", this.f12551a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchAddToCartBottomSheet;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddToCartBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12552a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAddToCartBottomSheet(ProductCard productCardTileData) {
                Intrinsics.h(productCardTileData, "productCardTileData");
                this.f12552a = productCardTileData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAddToCartBottomSheet) && Intrinsics.c(this.f12552a, ((LaunchAddToCartBottomSheet) obj).f12552a);
            }

            public final int hashCode() {
                return this.f12552a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchAddToCartBottomSheet(productCardTileData=", this.f12552a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchCheckStockScreen;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCheckStockScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12553a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchCheckStockScreen(ProductCard productCard) {
                this.f12553a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCheckStockScreen) && Intrinsics.c(this.f12553a, ((LaunchCheckStockScreen) obj).f12553a);
            }

            public final int hashCode() {
                return this.f12553a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchCheckStockScreen(productCardData=", this.f12553a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchInStoreMap;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInStoreMap extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12554a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchInStoreMap(ProductCard productCard) {
                this.f12554a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInStoreMap) && Intrinsics.c(this.f12554a, ((LaunchInStoreMap) obj).f12554a);
            }

            public final int hashCode() {
                return this.f12554a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchInStoreMap(productCardData=", this.f12554a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchLink;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLink extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12555a;

            public LaunchLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f12555a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchLink) && Intrinsics.c(this.f12555a, ((LaunchLink) obj).f12555a);
            }

            public final int hashCode() {
                return this.f12555a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchLink(deepLink=", this.f12555a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchListsBottomSheet;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchListsBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12556a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchListsBottomSheet(ProductCard productCardTileData) {
                Intrinsics.h(productCardTileData, "productCardTileData");
                this.f12556a = productCardTileData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchListsBottomSheet) && Intrinsics.c(this.f12556a, ((LaunchListsBottomSheet) obj).f12556a);
            }

            public final int hashCode() {
                return this.f12556a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchListsBottomSheet(productCardTileData=", this.f12556a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchProductAlternativesScreen;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductAlternativesScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchProductAlternativesScreen f12557a = new LaunchProductAlternativesScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchProductAlternativesScreen);
            }

            public final int hashCode() {
                return -359345015;
            }

            public final String toString() {
                return "LaunchProductAlternativesScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchProductDetails;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetails extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12558a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetails(ProductCard productCardData) {
                Intrinsics.h(productCardData, "productCardData");
                this.f12558a = productCardData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetails) && Intrinsics.c(this.f12558a, ((LaunchProductDetails) obj).f12558a);
            }

            public final int hashCode() {
                return this.f12558a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchProductDetails(productCardData=", this.f12558a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchSeeInStoreBottomSheet;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSeeInStoreBottomSheet extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12559a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchSeeInStoreBottomSheet(ProductCard productCardData) {
                Intrinsics.h(productCardData, "productCardData");
                this.f12559a = productCardData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSeeInStoreBottomSheet) && Intrinsics.c(this.f12559a, ((LaunchSeeInStoreBottomSheet) obj).f12559a);
            }

            public final int hashCode() {
                return this.f12559a.hashCode();
            }

            public final String toString() {
                return d.n("LaunchSeeInStoreBottomSheet(productCardData=", this.f12559a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchShareProductIntent;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchShareProductIntent extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12560a;

            public LaunchShareProductIntent(String productId) {
                Intrinsics.h(productId, "productId");
                this.f12560a = productId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchShareProductIntent) && Intrinsics.c(this.f12560a, ((LaunchShareProductIntent) obj).f12560a);
            }

            public final int hashCode() {
                return this.f12560a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchShareProductIntent(productId=", this.f12560a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchViewList;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchViewList extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12561a;

            public LaunchViewList(String str) {
                this.f12561a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchViewList) && this.f12561a.equals(((LaunchViewList) obj).f12561a);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + (this.f12561a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.h("LaunchViewList(listId=", this.f12561a, ", isWatchlist=true)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f12562a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return 119877290;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$OpenOliveChat;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOliveChat extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f12563a;

            public OpenOliveChat(String oliveUrl) {
                Intrinsics.h(oliveUrl, "oliveUrl");
                this.f12563a = oliveUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenOliveChat) && Intrinsics.c(this.f12563a, ((OpenOliveChat) obj).f12563a);
            }

            public final int hashCode() {
                return this.f12563a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenOliveChat(oliveUrl=", this.f12563a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action$ShowCartScreen;", "Lau/com/woolworths/shop/product/details/ProductDetailsContract$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCartScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowCartScreen f12564a = new ShowCartScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowCartScreen);
            }

            public final int hashCode() {
                return -1605726738;
            }

            public final String toString() {
                return "ShowCartScreen";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$Snackbar;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Snackbar {

        /* renamed from: a, reason: collision with root package name */
        public final ResText f12565a;
        public final Text b;
        public final Function0 c;
        public final Function1 d;

        public Snackbar(ResText resText, Text text, Function0 function0, Function1 function1) {
            this.f12565a = resText;
            this.b = text;
            this.c = function0;
            this.d = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Snackbar)) {
                return false;
            }
            Snackbar snackbar = (Snackbar) obj;
            return this.f12565a.equals(snackbar.f12565a) && Intrinsics.c(this.b, snackbar.b) && this.c.equals(snackbar.c) && this.d.equals(snackbar.d);
        }

        public final int hashCode() {
            int iHashCode = this.f12565a.hashCode() * 31;
            Text text = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            return "Snackbar(message=" + this.f12565a + ", actionLabel=" + this.b + ", actionCallback=" + this.c + ", onImpression=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/details/ProductDetailsContract$ViewState;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ProductDetailsPage f12566a;
        public final boolean b;
        public final ProductDetailsRowLink c;
        public final NutritionInfo d;
        public final InfoSection e;
        public final List f;
        public final Integer g;
        public final ProductDetailsPageErrorState h;
        public final boolean i;
        public final boolean j;
        public final List k;
        public final Snackbar l;

        public ViewState(ProductDetailsPage productDetailsPage, boolean z, ProductDetailsRowLink productDetailsRowLink, NutritionInfo nutritionInfo, InfoSection infoSection, List galleryImages, Integer num, ProductDetailsPageErrorState productDetailsPageErrorState, boolean z2, boolean z3, List watchlistedProductIds, Snackbar snackbar) {
            Intrinsics.h(galleryImages, "galleryImages");
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            this.f12566a = productDetailsPage;
            this.b = z;
            this.c = productDetailsRowLink;
            this.d = nutritionInfo;
            this.e = infoSection;
            this.f = galleryImages;
            this.g = num;
            this.h = productDetailsPageErrorState;
            this.i = z2;
            this.j = z3;
            this.k = watchlistedProductIds;
            this.l = snackbar;
        }

        public static ViewState a(ViewState viewState, Integer num, Snackbar snackbar, int i) {
            ProductDetailsPage productDetailsPage = viewState.f12566a;
            boolean z = viewState.b;
            ProductDetailsRowLink productDetailsRowLink = viewState.c;
            NutritionInfo nutritionInfo = viewState.d;
            InfoSection infoSection = viewState.e;
            List galleryImages = viewState.f;
            if ((i & 64) != 0) {
                num = viewState.g;
            }
            Integer num2 = num;
            ProductDetailsPageErrorState productDetailsPageErrorState = viewState.h;
            boolean z2 = viewState.i;
            boolean z3 = viewState.j;
            List watchlistedProductIds = viewState.k;
            Snackbar snackbar2 = (i & 2048) != 0 ? viewState.l : snackbar;
            viewState.getClass();
            Intrinsics.h(galleryImages, "galleryImages");
            Intrinsics.h(watchlistedProductIds, "watchlistedProductIds");
            return new ViewState(productDetailsPage, z, productDetailsRowLink, nutritionInfo, infoSection, galleryImages, num2, productDetailsPageErrorState, z2, z3, watchlistedProductIds, snackbar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f12566a, viewState.f12566a) && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && this.i == viewState.i && this.j == viewState.j && Intrinsics.c(this.k, viewState.k) && Intrinsics.c(this.l, viewState.l);
        }

        public final int hashCode() {
            ProductDetailsPage productDetailsPage = this.f12566a;
            int iE = androidx.camera.core.impl.b.e((productDetailsPage == null ? 0 : productDetailsPage.hashCode()) * 31, 31, this.b);
            ProductDetailsRowLink productDetailsRowLink = this.c;
            int iHashCode = (iE + (productDetailsRowLink == null ? 0 : productDetailsRowLink.hashCode())) * 31;
            NutritionInfo nutritionInfo = this.d;
            int iHashCode2 = (iHashCode + (nutritionInfo == null ? 0 : nutritionInfo.hashCode())) * 31;
            InfoSection infoSection = this.e;
            int iD = androidx.camera.core.impl.b.d((iHashCode2 + (infoSection == null ? 0 : infoSection.hashCode())) * 31, 31, this.f);
            Integer num = this.g;
            int iHashCode3 = (iD + (num == null ? 0 : num.hashCode())) * 31;
            ProductDetailsPageErrorState productDetailsPageErrorState = this.h;
            int iD2 = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((iHashCode3 + (productDetailsPageErrorState == null ? 0 : productDetailsPageErrorState.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
            Snackbar snackbar = this.l;
            return iD2 + (snackbar != null ? snackbar.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(feed=");
            sb.append(this.f12566a);
            sb.append(", isLoading=");
            sb.append(this.b);
            sb.append(", clickedParagraphLink=");
            sb.append(this.c);
            sb.append(", clickedNutritionalInfoLinkData=");
            sb.append(this.d);
            sb.append(", clickedAboutEverydayMarket=");
            sb.append(this.e);
            sb.append(", galleryImages=");
            sb.append(this.f);
            sb.append(", cartItemCount=");
            sb.append(this.g);
            sb.append(", errorState=");
            sb.append(this.h);
            sb.append(", locationInfoClickable=");
            au.com.woolworths.android.onesite.a.D(sb, this.i, ", useLocalButtons=", this.j, ", watchlistedProductIds=");
            sb.append(this.k);
            sb.append(", snackbar=");
            sb.append(this.l);
            sb.append(")");
            return sb.toString();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ ViewState(ProductDetailsPage productDetailsPage, boolean z, ProductDetailsRowLink productDetailsRowLink, NutritionInfo nutritionInfo, InfoSection infoSection, List list, Integer num, ProductDetailsPageErrorState productDetailsPageErrorState, boolean z2, boolean z3, List list2, Snackbar snackbar, int i) {
            productDetailsPage = (i & 1) != 0 ? null : productDetailsPage;
            boolean z4 = (i & 2) != 0 ? false : z;
            ProductDetailsRowLink productDetailsRowLink2 = (i & 4) != 0 ? null : productDetailsRowLink;
            NutritionInfo nutritionInfo2 = (i & 8) != 0 ? null : nutritionInfo;
            InfoSection infoSection2 = (i & 16) != 0 ? null : infoSection;
            int i2 = i & 32;
            List list3 = EmptyList.d;
            this(productDetailsPage, z4, productDetailsRowLink2, nutritionInfo2, infoSection2, i2 != 0 ? list3 : list, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : productDetailsPageErrorState, (i & 256) != 0 ? false : z2, (i & 512) == 0 ? z3 : false, (i & 1024) == 0 ? list2 : list3, (i & 2048) != 0 ? null : snackbar);
        }
    }
}
