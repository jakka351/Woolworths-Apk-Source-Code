package au.com.woolworths.shop.cart.ui.cart;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.foundation.shop.cart.data.model.Cart;
import au.com.woolworths.foundation.shop.cart.data.model.CartAlert;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.promotion.banner.data.PromotionMarkdownContent;
import com.woolworths.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract;", "", "Actions", "ViewState", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CartContract {

    @Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u001e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f\u0082\u0001\u001e !\"#$%&'()*+,-./0123456789:;<=ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006>À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "", "Finish", "Checkout", "GoToProducts", "HaveYouForgotten", "Login", "OpenProductDetails", "OpenQuantitySelector", "OpenRewardsSetup", "ShowConfirmDeleteAll", "ShowFailMessage", "ShowPromotionInfoTooltip", "ShowUndoDelete", "ShowUndoDeleteAll", "ShowDeleteAllSuccess", "ShowUndoDeleteCartSection", "ShowPromotionScreen", "OpenUrl", "ShowCartSectionOptionsDialog", "DismissCartSectionOptionsDialog", "LaunchCreateShoppingListActivity", "ShowMoreMenu", "ShowSnackbar", "ShowProductReview", "ShowFulfilmentWindow", "ShowFulfilmentWindowNoResult", "ShowSnackBarDeliveryWindowSelected", "ShowSnackBarPickUpWindowSelected", "AddDeliveryAddress", "ShowCartAlert", "CopyEverydayMarketCouponCode", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$AddDeliveryAddress;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$Checkout;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$CopyEverydayMarketCouponCode;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$DismissCartSectionOptionsDialog;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$Finish;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$GoToProducts;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$HaveYouForgotten;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$LaunchCreateShoppingListActivity;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$Login;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenProductDetails;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenQuantitySelector;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenRewardsSetup;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenUrl;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowCartAlert;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowCartSectionOptionsDialog;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowConfirmDeleteAll;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowDeleteAllSuccess;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowFailMessage;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowFulfilmentWindow;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowFulfilmentWindowNoResult;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowMoreMenu;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowProductReview;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowPromotionInfoTooltip;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowPromotionScreen;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowSnackBarDeliveryWindowSelected;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowSnackBarPickUpWindowSelected;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowUndoDelete;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowUndoDeleteAll;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowUndoDeleteCartSection;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$AddDeliveryAddress;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AddDeliveryAddress implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final AddDeliveryAddress f10460a = new AddDeliveryAddress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof AddDeliveryAddress);
            }

            public final int hashCode() {
                return 495384629;
            }

            public final String toString() {
                return "AddDeliveryAddress";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$Checkout;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Checkout implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Checkout f10461a = new Checkout();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$CopyEverydayMarketCouponCode;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CopyEverydayMarketCouponCode implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10462a;

            public CopyEverydayMarketCouponCode(String couponCode) {
                Intrinsics.h(couponCode, "couponCode");
                this.f10462a = couponCode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CopyEverydayMarketCouponCode) && Intrinsics.c(this.f10462a, ((CopyEverydayMarketCouponCode) obj).f10462a);
            }

            public final int hashCode() {
                return Integer.hashCode(R.string.everyday_market_coupon_coupon_accessibility_copy_success) + androidx.camera.core.impl.b.a(R.string.copy_coupon_code_success_message, androidx.camera.core.impl.b.a(R.string.copy_coupon_code_to_clipboard_label, this.f10462a.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                return YU.a.h("CopyEverydayMarketCouponCode(couponCode=", this.f10462a, ", copyLabelRes=2132017675, successMessageRes=2132017674, accessibilitySuccessMessageRes=2132017850)");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$DismissCartSectionOptionsDialog;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DismissCartSectionOptionsDialog implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissCartSectionOptionsDialog f10463a = new DismissCartSectionOptionsDialog();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$Finish;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Finish implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Finish f10464a = new Finish();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$GoToProducts;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GoToProducts implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToProducts f10465a = new GoToProducts();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$HaveYouForgotten;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class HaveYouForgotten implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final HaveYouForgotten f10466a = new HaveYouForgotten();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$LaunchCreateShoppingListActivity;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCreateShoppingListActivity implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final LinkedHashMap f10467a;

            public LaunchCreateShoppingListActivity(LinkedHashMap linkedHashMap) {
                this.f10467a = linkedHashMap;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchCreateShoppingListActivity) && this.f10467a.equals(((LaunchCreateShoppingListActivity) obj).f10467a);
            }

            public final int hashCode() {
                return this.f10467a.hashCode();
            }

            public final String toString() {
                return "LaunchCreateShoppingListActivity(cartProductItems=" + this.f10467a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$Login;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Login implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Login f10468a = new Login();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenProductDetails;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenProductDetails implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10469a;

            public OpenProductDetails(String productId) {
                Intrinsics.h(productId, "productId");
                this.f10469a = productId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenProductDetails) && Intrinsics.c(this.f10469a, ((OpenProductDetails) obj).f10469a);
            }

            public final int hashCode() {
                return this.f10469a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenProductDetails(productId=", this.f10469a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenQuantitySelector;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenQuantitySelector implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10470a;

            static {
                int i = ProductCard.$stable;
            }

            public OpenQuantitySelector(ProductCard productCard) {
                this.f10470a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenQuantitySelector) && Intrinsics.c(this.f10470a, ((OpenQuantitySelector) obj).f10470a);
            }

            public final int hashCode() {
                return this.f10470a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("OpenQuantitySelector(product=", this.f10470a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenRewardsSetup;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenRewardsSetup implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenRewardsSetup f10471a = new OpenRewardsSetup();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$OpenUrl;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10472a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f10472a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f10472a, ((OpenUrl) obj).f10472a);
            }

            public final int hashCode() {
                return this.f10472a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f10472a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowCartAlert;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCartAlert implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CartAlert f10473a;

            public ShowCartAlert(CartAlert cartAlert) {
                Intrinsics.h(cartAlert, "cartAlert");
                this.f10473a = cartAlert;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowCartAlert) && Intrinsics.c(this.f10473a, ((ShowCartAlert) obj).f10473a);
            }

            public final int hashCode() {
                return this.f10473a.hashCode();
            }

            public final String toString() {
                return "ShowCartAlert(cartAlert=" + this.f10473a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowCartSectionOptionsDialog;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCartSectionOptionsDialog implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10474a;
            public final boolean b;

            public ShowCartSectionOptionsDialog(String str, boolean z) {
                this.f10474a = str;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowCartSectionOptionsDialog)) {
                    return false;
                }
                ShowCartSectionOptionsDialog showCartSectionOptionsDialog = (ShowCartSectionOptionsDialog) obj;
                return Intrinsics.c(this.f10474a, showCartSectionOptionsDialog.f10474a) && this.b == showCartSectionOptionsDialog.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f10474a.hashCode() * 31);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.j("ShowCartSectionOptionsDialog(sectionTitle=", this.f10474a, ", isMarketplace=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowConfirmDeleteAll;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowConfirmDeleteAll implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowConfirmDeleteAll f10475a = new ShowConfirmDeleteAll();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowDeleteAllSuccess;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowDeleteAllSuccess implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowDeleteAllSuccess f10476a = new ShowDeleteAllSuccess();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowFailMessage;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFailMessage implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f10477a;

            public ShowFailMessage(int i) {
                this.f10477a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowFailMessage) && this.f10477a == ((ShowFailMessage) obj).f10477a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f10477a);
            }

            public final String toString() {
                return YU.a.e(this.f10477a, "ShowFailMessage(stringRes=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowFulfilmentWindow;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFulfilmentWindow implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowFulfilmentWindow f10478a = new ShowFulfilmentWindow();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowFulfilmentWindow);
            }

            public final int hashCode() {
                return -1473160531;
            }

            public final String toString() {
                return "ShowFulfilmentWindow";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowFulfilmentWindowNoResult;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFulfilmentWindowNoResult implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowFulfilmentWindowNoResult f10479a = new ShowFulfilmentWindowNoResult();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowFulfilmentWindowNoResult);
            }

            public final int hashCode() {
                return 1352167179;
            }

            public final String toString() {
                return "ShowFulfilmentWindowNoResult";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowMoreMenu;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowMoreMenu implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowMoreMenu f10480a = new ShowMoreMenu();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowProductReview;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowProductReview implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowProductReview f10481a = new ShowProductReview();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowProductReview);
            }

            public final int hashCode() {
                return 1473976500;
            }

            public final String toString() {
                return "ShowProductReview";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowPromotionInfoTooltip;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowPromotionInfoTooltip implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CartPromotionInfo f10482a;

            public ShowPromotionInfoTooltip(CartPromotionInfo promotionInfo) {
                Intrinsics.h(promotionInfo, "promotionInfo");
                this.f10482a = promotionInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowPromotionInfoTooltip) && Intrinsics.c(this.f10482a, ((ShowPromotionInfoTooltip) obj).f10482a);
            }

            public final int hashCode() {
                return this.f10482a.hashCode();
            }

            public final String toString() {
                return "ShowPromotionInfoTooltip(promotionInfo=" + this.f10482a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowPromotionScreen;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowPromotionScreen implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PromotionMarkdownContent f10483a;

            public ShowPromotionScreen(PromotionMarkdownContent content) {
                Intrinsics.h(content, "content");
                this.f10483a = content;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowPromotionScreen) && Intrinsics.c(this.f10483a, ((ShowPromotionScreen) obj).f10483a);
            }

            public final int hashCode() {
                return this.f10483a.hashCode();
            }

            public final String toString() {
                return "ShowPromotionScreen(content=" + this.f10483a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowSnackBarDeliveryWindowSelected;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarDeliveryWindowSelected implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarDeliveryWindowSelected f10484a = new ShowSnackBarDeliveryWindowSelected();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarDeliveryWindowSelected);
            }

            public final int hashCode() {
                return 893826839;
            }

            public final String toString() {
                return "ShowSnackBarDeliveryWindowSelected";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowSnackBarPickUpWindowSelected;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarPickUpWindowSelected implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarPickUpWindowSelected f10485a = new ShowSnackBarPickUpWindowSelected();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarPickUpWindowSelected);
            }

            public final int hashCode() {
                return -1114844737;
            }

            public final String toString() {
                return "ShowSnackBarPickUpWindowSelected";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResWithArgText f10486a;

            public ShowSnackbar(ResWithArgText resWithArgText) {
                this.f10486a = resWithArgText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbar) && this.f10486a.equals(((ShowSnackbar) obj).f10486a);
            }

            public final int hashCode() {
                return this.f10486a.hashCode();
            }

            public final String toString() {
                return "ShowSnackbar(text=" + this.f10486a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowUndoDelete;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowUndoDelete implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowUndoDelete f10487a = new ShowUndoDelete();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowUndoDeleteAll;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowUndoDeleteAll implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowUndoDeleteAll f10488a = new ShowUndoDeleteAll();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions$ShowUndoDeleteCartSection;", "Lau/com/woolworths/shop/cart/ui/cart/CartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowUndoDeleteCartSection implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10489a;

            public ShowUndoDeleteCartSection(String sectionTitle) {
                Intrinsics.h(sectionTitle, "sectionTitle");
                this.f10489a = sectionTitle;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowUndoDeleteCartSection) && Intrinsics.c(this.f10489a, ((ShowUndoDeleteCartSection) obj).f10489a);
            }

            public final int hashCode() {
                return this.f10489a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowUndoDeleteCartSection(sectionTitle=", this.f10489a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/cart/CartContract$ViewState;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10490a;
        public final boolean b;
        public final Cart c;
        public final CartFullErrorMessage d;
        public final Map e;

        public ViewState(boolean z, boolean z2, Cart cart, CartFullErrorMessage cartFullErrorMessage, Map map) {
            this.f10490a = z;
            this.b = z2;
            this.c = cart;
            this.d = cartFullErrorMessage;
            this.e = map;
        }

        public static ViewState a(ViewState viewState, boolean z, boolean z2, Cart cart, CartFullErrorMessage cartFullErrorMessage, Map map, int i) {
            if ((i & 1) != 0) {
                z = viewState.f10490a;
            }
            boolean z3 = z;
            if ((i & 2) != 0) {
                z2 = viewState.b;
            }
            boolean z4 = z2;
            if ((i & 4) != 0) {
                cart = viewState.c;
            }
            Cart cart2 = cart;
            if ((i & 8) != 0) {
                cartFullErrorMessage = viewState.d;
            }
            CartFullErrorMessage cartFullErrorMessage2 = cartFullErrorMessage;
            if ((i & 16) != 0) {
                map = viewState.e;
            }
            Map pendingQuantity = map;
            viewState.getClass();
            Intrinsics.h(pendingQuantity, "pendingQuantity");
            return new ViewState(z3, z4, cart2, cartFullErrorMessage2, pendingQuantity);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10490a == viewState.f10490a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e);
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f10490a) * 31, 31, this.b);
            Cart cart = this.c;
            int iHashCode = (iE + (cart == null ? 0 : cart.hashCode())) * 31;
            CartFullErrorMessage cartFullErrorMessage = this.d;
            return this.e.hashCode() + ((iHashCode + (cartFullErrorMessage != null ? cartFullErrorMessage.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(isLoading=", ", isLoadingPullRefresh=", ", cart=", this.f10490a, this.b);
            sbV.append(this.c);
            sbV.append(", fullPageError=");
            sbV.append(this.d);
            sbV.append(", pendingQuantity=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
