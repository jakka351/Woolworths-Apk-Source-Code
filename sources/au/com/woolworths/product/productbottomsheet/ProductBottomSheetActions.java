package au.com.woolworths.product.productbottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "AddToCartFailure", "BoostRetrySuccess", "BoostRetryFailure", "BoostRetryClick", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$AddToCartFailure;", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$BoostRetryClick;", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$BoostRetryFailure;", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$BoostRetrySuccess;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductBottomSheetActions implements Action {
    public final Screen d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$AddToCartFailure;", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToCartFailure extends ProductBottomSheetActions {
        public final AddToCartBottomSheetFragment.ProductBottomSheetHostScreen e;
        public final Category f;
        public final String g;

        public AddToCartFailure(AddToCartBottomSheetFragment.ProductBottomSheetHostScreen productBottomSheetHostScreen) {
            super(productBottomSheetHostScreen);
            this.e = productBottomSheetHostScreen;
            this.f = Category.m;
            this.g = "Add or Update To Cart Failed - Quantity Selector";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getK() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AddToCartFailure) && this.e.equals(((AddToCartFailure) obj).e);
        }

        @Override // au.com.woolworths.product.productbottomsheet.ProductBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "AddToCartFailure(screen=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$BoostRetryClick;", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostRetryClick extends ProductBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public BoostRetryClick(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.f0;
            this.g = "offer boost retry";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getK() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BoostRetryClick) && Intrinsics.c(this.e, ((BoostRetryClick) obj).e);
        }

        @Override // au.com.woolworths.product.productbottomsheet.ProductBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("BoostRetryClick(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$BoostRetryFailure;", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostRetryFailure extends ProductBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public BoostRetryFailure(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.g0;
            this.g = "unable to boost your rewards offer";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getK() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BoostRetryFailure) && Intrinsics.c(this.e, ((BoostRetryFailure) obj).e);
        }

        @Override // au.com.woolworths.product.productbottomsheet.ProductBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("BoostRetryFailure(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions$BoostRetrySuccess;", "Lau/com/woolworths/product/productbottomsheet/ProductBottomSheetActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostRetrySuccess extends ProductBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public BoostRetrySuccess(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.g0;
            this.g = "your rewards offer has been boosted";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getK() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BoostRetrySuccess) && Intrinsics.c(this.e, ((BoostRetrySuccess) obj).e);
        }

        @Override // au.com.woolworths.product.productbottomsheet.ProductBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("BoostRetrySuccess(screen=", this.e, ")");
        }
    }

    public ProductBottomSheetActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
