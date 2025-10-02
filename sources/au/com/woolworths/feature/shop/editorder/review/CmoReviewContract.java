package au.com.woolworths.feature.shop.editorder.review;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.editorder.review.data.ChangeMyOrderSummary;
import au.com.woolworths.foundation.shop.editorder.data.EditOrderConfirmation;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract;", "", "ViewState", "UiAction", "UserEvent", "NavigationType", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface CmoReviewContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "", "OrderDetailScreen", "ScreenBeforeOrderDetail", "CheckoutScreen", "CartScreen", "ProductScreen", "BuyAgainScreen", "SpecialsScreen", "PastShopsScreen", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$BuyAgainScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$CartScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$CheckoutScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$OrderDetailScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$PastShopsScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$ProductScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$ScreenBeforeOrderDetail;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$SpecialsScreen;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class NavigationType {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$BuyAgainScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class BuyAgainScreen extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public static final BuyAgainScreen f7077a = new BuyAgainScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof BuyAgainScreen);
            }

            public final int hashCode() {
                return -1691047314;
            }

            public final String toString() {
                return "BuyAgainScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$CartScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CartScreen extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public static final CartScreen f7078a = new CartScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CartScreen);
            }

            public final int hashCode() {
                return -1519526764;
            }

            public final String toString() {
                return "CartScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$CheckoutScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CheckoutScreen extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public static final CheckoutScreen f7079a = new CheckoutScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CheckoutScreen);
            }

            public final int hashCode() {
                return -1782495686;
            }

            public final String toString() {
                return "CheckoutScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$OrderDetailScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OrderDetailScreen extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7080a;

            public OrderDetailScreen(Text text) {
                this.f7080a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OrderDetailScreen) && Intrinsics.c(this.f7080a, ((OrderDetailScreen) obj).f7080a);
            }

            public final int hashCode() {
                return this.f7080a.hashCode();
            }

            public final String toString() {
                return a.h("OrderDetailScreen(message=", this.f7080a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$PastShopsScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PastShopsScreen extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public static final PastShopsScreen f7081a = new PastShopsScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PastShopsScreen);
            }

            public final int hashCode() {
                return -678692945;
            }

            public final String toString() {
                return "PastShopsScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$ProductScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ProductScreen extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public static final ProductScreen f7082a = new ProductScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ProductScreen);
            }

            public final int hashCode() {
                return -1007078317;
            }

            public final String toString() {
                return "ProductScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$ScreenBeforeOrderDetail;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ScreenBeforeOrderDetail extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public static final ScreenBeforeOrderDetail f7083a = new ScreenBeforeOrderDetail();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ScreenBeforeOrderDetail);
            }

            public final int hashCode() {
                return -1936261812;
            }

            public final String toString() {
                return "ScreenBeforeOrderDetail";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType$SpecialsScreen;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$NavigationType;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SpecialsScreen extends NavigationType {

            /* renamed from: a, reason: collision with root package name */
            public static final SpecialsScreen f7084a = new SpecialsScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof SpecialsScreen);
            }

            public final int hashCode() {
                return 1200902350;
            }

            public final String toString() {
                return "SpecialsScreen";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction;", "", "ShowSnackbarMessage", "NavigateTo", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction$NavigateTo;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction$ShowSnackbarMessage;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UiAction {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction$NavigateTo;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateTo implements UiAction {

            /* renamed from: a, reason: collision with root package name */
            public final NavigationType f7085a;

            public NavigateTo(NavigationType navigationType) {
                this.f7085a = navigationType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateTo) && Intrinsics.c(this.f7085a, ((NavigateTo) obj).f7085a);
            }

            public final int hashCode() {
                return this.f7085a.hashCode();
            }

            public final String toString() {
                return "NavigateTo(navigationType=" + this.f7085a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UiAction;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage implements UiAction {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7086a;

            public ShowSnackbarMessage(Text text) {
                this.f7086a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && Intrinsics.c(this.f7086a, ((ShowSnackbarMessage) obj).f7086a);
            }

            public final int hashCode() {
                return this.f7086a.hashCode();
            }

            public final String toString() {
                return a.h("ShowSnackbarMessage(message=", this.f7086a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "", "NavigateBack", "Retry", "CancelCmo", "DismissDialog", "ConfirmDialog", "NavigateToCheckout", "NavigateToCart", "ActionTileClick", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$ActionTileClick;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$CancelCmo;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$ConfirmDialog;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$DismissDialog;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$NavigateBack;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$NavigateToCart;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$NavigateToCheckout;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$Retry;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface UserEvent {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$ActionTileClick;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ActionTileClick implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public final String f7087a;

            public ActionTileClick(String str) {
                this.f7087a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ActionTileClick) && Intrinsics.c(this.f7087a, ((ActionTileClick) obj).f7087a);
            }

            public final int hashCode() {
                return this.f7087a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ActionTileClick(id=", this.f7087a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$CancelCmo;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CancelCmo implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final CancelCmo f7088a = new CancelCmo();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CancelCmo);
            }

            public final int hashCode() {
                return 404518644;
            }

            public final String toString() {
                return "CancelCmo";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$ConfirmDialog;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfirmDialog implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final ConfirmDialog f7089a = new ConfirmDialog();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ConfirmDialog);
            }

            public final int hashCode() {
                return -1493943759;
            }

            public final String toString() {
                return "ConfirmDialog";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$DismissDialog;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DismissDialog implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissDialog f7090a = new DismissDialog();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DismissDialog);
            }

            public final int hashCode() {
                return -1559394693;
            }

            public final String toString() {
                return "DismissDialog";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$NavigateBack;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateBack implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateBack f7091a = new NavigateBack();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateBack);
            }

            public final int hashCode() {
                return 636911311;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$NavigateToCart;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToCart implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToCart f7092a = new NavigateToCart();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToCart);
            }

            public final int hashCode() {
                return -1581258717;
            }

            public final String toString() {
                return "NavigateToCart";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$NavigateToCheckout;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToCheckout implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToCheckout f7093a = new NavigateToCheckout();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToCheckout);
            }

            public final int hashCode() {
                return -858226487;
            }

            public final String toString() {
                return "NavigateToCheckout";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent$Retry;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$UserEvent;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Retry implements UserEvent {

            /* renamed from: a, reason: collision with root package name */
            public static final Retry f7094a = new Retry();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Retry);
            }

            public final int hashCode() {
                return 1571665329;
            }

            public final String toString() {
                return "Retry";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState;", "", "Loading", "Error", "Content", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState$Loading;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState$Content;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final ChangeMyOrderSummary f7095a;
            public final EditOrderConfirmation b;
            public final boolean c;

            public /* synthetic */ Content(ChangeMyOrderSummary changeMyOrderSummary, EditOrderConfirmation editOrderConfirmation, int i) {
                this(changeMyOrderSummary, (i & 2) != 0 ? null : editOrderConfirmation, false);
            }

            public static Content a(Content content, EditOrderConfirmation editOrderConfirmation, boolean z, int i) {
                ChangeMyOrderSummary data = content.f7095a;
                if ((i & 2) != 0) {
                    editOrderConfirmation = content.b;
                }
                if ((i & 4) != 0) {
                    z = content.c;
                }
                content.getClass();
                Intrinsics.h(data, "data");
                return new Content(data, editOrderConfirmation, z);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f7095a, content.f7095a) && Intrinsics.c(this.b, content.b) && this.c == content.c;
            }

            public final int hashCode() {
                int iHashCode = this.f7095a.hashCode() * 31;
                EditOrderConfirmation editOrderConfirmation = this.b;
                return Boolean.hashCode(this.c) + ((iHashCode + (editOrderConfirmation == null ? 0 : editOrderConfirmation.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Content(data=");
                sb.append(this.f7095a);
                sb.append(", confirmDialog=");
                sb.append(this.b);
                sb.append(", showOverlayLoading=");
                return YU.a.k(")", sb, this.c);
            }

            public Content(ChangeMyOrderSummary data, EditOrderConfirmation editOrderConfirmation, boolean z) {
                Intrinsics.h(data, "data");
                this.f7095a = data;
                this.b = editOrderConfirmation;
                this.c = z;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f7096a;

            public Error(FullPageMessage.Error error) {
                this.f7096a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f7096a, ((Error) obj).f7096a);
            }

            public final int hashCode() {
                return this.f7096a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f7096a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState$Loading;", "Lau/com/woolworths/feature/shop/editorder/review/CmoReviewContract$ViewState;", "edit-order_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f7097a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 400974946;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }
}
