package au.com.woolworths.product.addtocart;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductCardKt;
import au.com.woolworths.product.models.ProductQuantityHelper;
import au.com.woolworths.product.models.ProductTrolleyData;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetActionType;
import au.com.woolworths.product.productbottomsheet.ProductBottomSheetErrorCause;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract;", "", "Actions", "ViewState", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddToCartContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$Actions;", "", "ShowBoostFailureSnackbar", "FinishWithSuccess", "FinishWithError", "FinishWithCancellation", "ShowSignInPrompt", "ShowAddDeliveryAddressBottomSheet", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$FinishWithCancellation;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$FinishWithError;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$FinishWithSuccess;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$ShowAddDeliveryAddressBottomSheet;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$ShowBoostFailureSnackbar;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$ShowSignInPrompt;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$FinishWithCancellation;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FinishWithCancellation extends Actions {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$FinishWithError;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishWithError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductBottomSheetErrorCause f9243a;

            public FinishWithError(ProductBottomSheetErrorCause productBottomSheetErrorCause) {
                this.f9243a = productBottomSheetErrorCause;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishWithError) && this.f9243a == ((FinishWithError) obj).f9243a;
            }

            public final int hashCode() {
                return this.f9243a.hashCode();
            }

            public final String toString() {
                return "FinishWithError(errorCause=" + this.f9243a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$FinishWithSuccess;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishWithSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductBottomSheetActionType f9244a;

            public FinishWithSuccess(ProductBottomSheetActionType actionType) {
                Intrinsics.h(actionType, "actionType");
                this.f9244a = actionType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FinishWithSuccess) && this.f9244a == ((FinishWithSuccess) obj).f9244a;
            }

            public final int hashCode() {
                return this.f9244a.hashCode();
            }

            public final String toString() {
                return "FinishWithSuccess(actionType=" + this.f9244a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$ShowAddDeliveryAddressBottomSheet;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAddDeliveryAddressBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowAddDeliveryAddressBottomSheet f9245a = new ShowAddDeliveryAddressBottomSheet();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowAddDeliveryAddressBottomSheet);
            }

            public final int hashCode() {
                return -331616599;
            }

            public final String toString() {
                return "ShowAddDeliveryAddressBottomSheet";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$ShowBoostFailureSnackbar;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowBoostFailureSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductBottomSheetActionType f9246a;

            public ShowBoostFailureSnackbar(ProductBottomSheetActionType actionType) {
                Intrinsics.h(actionType, "actionType");
                this.f9246a = actionType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowBoostFailureSnackbar) && this.f9246a == ((ShowBoostFailureSnackbar) obj).f9246a;
            }

            public final int hashCode() {
                return this.f9246a.hashCode() + (Boolean.hashCode(true) * 31);
            }

            public final String toString() {
                return "ShowBoostFailureSnackbar(showRetryButton=true, actionType=" + this.f9246a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$Actions$ShowSignInPrompt;", "Lau/com/woolworths/product/addtocart/AddToCartContract$Actions;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSignInPrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSignInPrompt f9247a = new ShowSignInPrompt();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSignInPrompt);
            }

            public final int hashCode() {
                return -1271055214;
            }

            public final String toString() {
                return "ShowSignInPrompt";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/addtocart/AddToCartContract$ViewState;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCard f9248a;
        public final ProductCard b;
        public final TrackingMetadata c;
        public final boolean d;
        public final int e;
        public final int f;
        public final boolean g;
        public final String h;
        public final int i;
        public final boolean j;
        public final StatefulButtonState k;

        public ViewState(ProductCard productData, ProductCard productCard, TrackingMetadata trackingMetadata, boolean z, int i, int i2, boolean z2) {
            int i3;
            String quantityLabel;
            Intrinsics.h(productData, "productData");
            this.f9248a = productData;
            this.b = productCard;
            this.c = trackingMetadata;
            this.d = z;
            this.e = i;
            this.f = i2;
            this.g = z2;
            ProductTrolleyData productTrolleyDataCurrentTrolley = ProductCardKt.currentTrolley(productData, i2);
            if (productTrolleyDataCurrentTrolley != null) {
                i3 = i;
                quantityLabel = ProductQuantityHelper.INSTANCE.getQuantityLabel(i3, productTrolleyDataCurrentTrolley.getMinimum(), productTrolleyDataCurrentTrolley.getIncrement(), productTrolleyDataCurrentTrolley.getUnitLabel());
            } else {
                i3 = i;
                quantityLabel = null;
            }
            this.h = quantityLabel;
            this.i = productCard == null ? R.string.product_bottom_sheet_add_to_cart : R.string.product_bottom_sheet_replace_in_cart;
            this.j = !ProductCardExtKt.r(productData);
            Integer numP = ProductCardExtKt.p(productData);
            this.k = (numP != null && i3 == numP.intValue()) ? StatefulButtonState.f : StatefulButtonState.d;
        }

        public static ViewState a(ViewState viewState, ProductCard productCard, int i, int i2, int i3) {
            if ((i3 & 1) != 0) {
                productCard = viewState.f9248a;
            }
            ProductCard productData = productCard;
            ProductCard productCard2 = viewState.b;
            TrackingMetadata trackingMetadata = viewState.c;
            boolean z = viewState.d;
            if ((i3 & 32) != 0) {
                i = viewState.e;
            }
            int i4 = i;
            if ((i3 & 64) != 0) {
                i2 = viewState.f;
            }
            int i5 = i2;
            boolean z2 = (i3 & 128) != 0 ? viewState.g : true;
            Intrinsics.h(productData, "productData");
            return new ViewState(productData, productCard2, trackingMetadata, z, i4, i5, z2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f9248a, viewState.f9248a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && this.e == viewState.e && this.f == viewState.f && this.g == viewState.g;
        }

        public final int hashCode() {
            int iHashCode = this.f9248a.hashCode() * 31;
            ProductCard productCard = this.b;
            int iHashCode2 = (iHashCode + (productCard == null ? 0 : productCard.hashCode())) * 961;
            TrackingMetadata trackingMetadata = this.c;
            return Boolean.hashCode(this.g) + b.a(this.f, b.a(this.e, b.e((iHashCode2 + (trackingMetadata != null ? trackingMetadata.d.hashCode() : 0)) * 31, 31, this.d), 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(productData=");
            sb.append(this.f9248a);
            sb.append(", productToReplace=");
            sb.append(this.b);
            sb.append(", marketplaceTrackingValue=null, trackingMetaData=");
            sb.append(this.c);
            sb.append(", saveEducationBottomSheetPrefs=");
            sb.append(this.d);
            sb.append(", selectedQuantityIndex=");
            a.w(this.e, this.f, ", selectedTrolleyIndex=", ", isLoading=", sb);
            return a.k(")", sb, this.g);
        }
    }
}
