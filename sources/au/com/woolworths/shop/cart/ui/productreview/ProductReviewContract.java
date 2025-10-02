package au.com.woolworths.shop.cart.ui.productreview;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract;", "", "ViewState", "Actions", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductReviewContract {

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "", "ShowFulfilmentWindow", "ShowSnackBarDeleteProductSuccess", "ShowSnackBarDeleteProductFail", "ShowSnackBarUpdateProductFail", "ShowSnackBarDeliveryWindowSelected", "ShowSnackBarPickUpWindowSelected", "OpenQuantitySelector", "OpenProductReviewAlternative", "NavigateToSearch", "ShowSnackBarReplaceProductSuccess", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$NavigateToSearch;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$OpenProductReviewAlternative;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$OpenQuantitySelector;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowFulfilmentWindow;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarDeleteProductFail;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarDeleteProductSuccess;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarDeliveryWindowSelected;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarPickUpWindowSelected;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarReplaceProductSuccess;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarUpdateProductFail;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$NavigateToSearch;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10513a;

            static {
                int i = ProductCard.$stable;
            }

            public NavigateToSearch(ProductCard productCard) {
                this.f10513a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToSearch) && Intrinsics.c(this.f10513a, ((NavigateToSearch) obj).f10513a);
            }

            public final int hashCode() {
                return this.f10513a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("NavigateToSearch(productToReplace=", this.f10513a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$OpenProductReviewAlternative;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenProductReviewAlternative extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10514a;

            public OpenProductReviewAlternative(String str) {
                this.f10514a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenProductReviewAlternative) && Intrinsics.c(this.f10514a, ((OpenProductReviewAlternative) obj).f10514a);
            }

            public final int hashCode() {
                return this.f10514a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenProductReviewAlternative(productId=", this.f10514a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$OpenQuantitySelector;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenQuantitySelector extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10515a;

            static {
                int i = ProductCard.$stable;
            }

            public OpenQuantitySelector(ProductCard productCard) {
                this.f10515a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenQuantitySelector) && Intrinsics.c(this.f10515a, ((OpenQuantitySelector) obj).f10515a);
            }

            public final int hashCode() {
                return this.f10515a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("OpenQuantitySelector(productCard=", this.f10515a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowFulfilmentWindow;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFulfilmentWindow extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowFulfilmentWindow f10516a = new ShowFulfilmentWindow();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowFulfilmentWindow);
            }

            public final int hashCode() {
                return -1199503589;
            }

            public final String toString() {
                return "ShowFulfilmentWindow";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarDeleteProductFail;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarDeleteProductFail extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarDeleteProductFail f10517a = new ShowSnackBarDeleteProductFail();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarDeleteProductFail);
            }

            public final int hashCode() {
                return 2102145788;
            }

            public final String toString() {
                return "ShowSnackBarDeleteProductFail";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarDeleteProductSuccess;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarDeleteProductSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarDeleteProductSuccess f10518a = new ShowSnackBarDeleteProductSuccess();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarDeleteProductSuccess);
            }

            public final int hashCode() {
                return -673452187;
            }

            public final String toString() {
                return "ShowSnackBarDeleteProductSuccess";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarDeliveryWindowSelected;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarDeliveryWindowSelected extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarDeliveryWindowSelected f10519a = new ShowSnackBarDeliveryWindowSelected();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarDeliveryWindowSelected);
            }

            public final int hashCode() {
                return 385944325;
            }

            public final String toString() {
                return "ShowSnackBarDeliveryWindowSelected";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarPickUpWindowSelected;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarPickUpWindowSelected extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarPickUpWindowSelected f10520a = new ShowSnackBarPickUpWindowSelected();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarPickUpWindowSelected);
            }

            public final int hashCode() {
                return 1409763629;
            }

            public final String toString() {
                return "ShowSnackBarPickUpWindowSelected";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarReplaceProductSuccess;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarReplaceProductSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarReplaceProductSuccess f10521a = new ShowSnackBarReplaceProductSuccess();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarReplaceProductSuccess);
            }

            public final int hashCode() {
                return 406112226;
            }

            public final String toString() {
                return "ShowSnackBarReplaceProductSuccess";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions$ShowSnackBarUpdateProductFail;", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBarUpdateProductFail extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnackBarUpdateProductFail f10522a = new ShowSnackBarUpdateProductFail();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackBarUpdateProductFail);
            }

            public final int hashCode() {
                return 864420126;
            }

            public final String toString() {
                return "ShowSnackBarUpdateProductFail";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$ViewState;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10523a;
        public final PageResult b;

        public ViewState(boolean z, PageResult productReviewResult) {
            Intrinsics.h(productReviewResult, "productReviewResult");
            this.f10523a = z;
            this.b = productReviewResult;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v2, types: [au.com.woolworths.shop.cart.domain.model.PageResult] */
        public static ViewState a(ViewState viewState, PageResult.Success success, int i) {
            boolean z = (i & 1) != 0 ? viewState.f10523a : true;
            PageResult.Success productReviewResult = success;
            if ((i & 2) != 0) {
                productReviewResult = viewState.b;
            }
            viewState.getClass();
            Intrinsics.h(productReviewResult, "productReviewResult");
            return new ViewState(z, productReviewResult);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10523a == viewState.f10523a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f10523a) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f10523a + ", productReviewResult=" + this.b + ")";
        }
    }
}
