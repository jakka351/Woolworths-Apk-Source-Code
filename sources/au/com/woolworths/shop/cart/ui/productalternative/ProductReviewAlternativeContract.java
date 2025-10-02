package au.com.woolworths.shop.cart.ui.productalternative;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract;", "", "ViewState", "Actions", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ProductReviewAlternativeContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions;", "", "DisplayAddToCartBottomSheet", "NavigateBack", "NavigateToSearch", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions$DisplayAddToCartBottomSheet;", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions$NavigateBack;", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions$NavigateToSearch;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions$DisplayAddToCartBottomSheet;", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayAddToCartBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10503a;
            public final ProductCard b;

            static {
                int i = ProductCard.$stable;
            }

            public DisplayAddToCartBottomSheet(ProductCard productCard, ProductCard productToReplaceWith) {
                Intrinsics.h(productToReplaceWith, "productToReplaceWith");
                this.f10503a = productCard;
                this.b = productToReplaceWith;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplayAddToCartBottomSheet)) {
                    return false;
                }
                DisplayAddToCartBottomSheet displayAddToCartBottomSheet = (DisplayAddToCartBottomSheet) obj;
                return Intrinsics.c(this.f10503a, displayAddToCartBottomSheet.f10503a) && Intrinsics.c(this.b, displayAddToCartBottomSheet.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f10503a.hashCode() * 31);
            }

            public final String toString() {
                return "DisplayAddToCartBottomSheet(productToReplace=" + this.f10503a + ", productToReplaceWith=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions$NavigateBack;", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateBack extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateBack f10504a = new NavigateBack();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateBack);
            }

            public final int hashCode() {
                return 2104560646;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions$NavigateToSearch;", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f10505a;

            static {
                int i = ProductCard.$stable;
            }

            public NavigateToSearch(ProductCard productCard) {
                this.f10505a = productCard;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToSearch) && Intrinsics.c(this.f10505a, ((NavigateToSearch) obj).f10505a);
            }

            public final int hashCode() {
                return this.f10505a.hashCode();
            }

            public final String toString() {
                return d.n("NavigateToSearch(productToReplace=", this.f10505a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$ViewState;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10506a;
        public final boolean b;
        public final PageResult c;
        public final boolean d;

        public ViewState(boolean z, boolean z2, PageResult productAlternativeReviewResult, boolean z3) {
            Intrinsics.h(productAlternativeReviewResult, "productAlternativeReviewResult");
            this.f10506a = z;
            this.b = z2;
            this.c = productAlternativeReviewResult;
            this.d = z3;
        }

        public static ViewState a(ViewState viewState, boolean z, boolean z2, PageResult productAlternativeReviewResult, int i) {
            if ((i & 1) != 0) {
                z = viewState.f10506a;
            }
            if ((i & 2) != 0) {
                z2 = viewState.b;
            }
            if ((i & 4) != 0) {
                productAlternativeReviewResult = viewState.c;
            }
            boolean z3 = (i & 8) != 0 ? viewState.d : true;
            viewState.getClass();
            Intrinsics.h(productAlternativeReviewResult, "productAlternativeReviewResult");
            return new ViewState(z, z2, productAlternativeReviewResult, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10506a == viewState.f10506a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + androidx.camera.core.impl.b.e(Boolean.hashCode(this.f10506a) * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(isLoading=", ", showBottomSheet=", ", productAlternativeReviewResult=", this.f10506a, this.b);
            sbV.append(this.c);
            sbV.append(", productReplaced=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
