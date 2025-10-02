package au.com.woolworths.product.productmessagebottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "BottomSheetLaunch", "DismissButtonClick", "BottomSheetDismiss", "Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions$BottomSheetDismiss;", "Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions$BottomSheetLaunch;", "Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions$DismissButtonClick;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ProductMessageBottomSheetActions implements Action {
    public final Screen d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions$BottomSheetDismiss;", "Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheetDismiss extends ProductMessageBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public BottomSheetDismiss(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.j;
            this.g = "Close bottomsheet";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BottomSheetDismiss) && Intrinsics.c(this.e, ((BottomSheetDismiss) obj).e);
        }

        @Override // au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("BottomSheetDismiss(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions$BottomSheetLaunch;", "Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheetLaunch extends ProductMessageBottomSheetActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public BottomSheetLaunch(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.k;
            this.g = "See in store";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BottomSheetLaunch) && Intrinsics.c(this.e, ((BottomSheetLaunch) obj).e);
        }

        @Override // au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("BottomSheetLaunch(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions$DismissButtonClick;", "Lau/com/woolworths/product/productmessagebottomsheet/ProductMessageBottomSheetActions;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DismissButtonClick extends ProductMessageBottomSheetActions {
        public final Screen e;
        public final String f;
        public final Category g;

        public DismissButtonClick(Screen screen, String str) {
            super(screen);
            this.e = screen;
            this.f = str;
            this.g = Category.j;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DismissButtonClick)) {
                return false;
            }
            DismissButtonClick dismissButtonClick = (DismissButtonClick) obj;
            return Intrinsics.c(this.e, dismissButtonClick.e) && Intrinsics.c(this.f, dismissButtonClick.f);
        }

        @Override // au.com.woolworths.product.productmessagebottomsheet.ProductMessageBottomSheetActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.f.hashCode() + (this.e.hashCode() * 31);
        }

        public final String toString() {
            return "DismissButtonClick(screen=" + this.e + ", label=" + this.f + ")";
        }
    }

    public ProductMessageBottomSheetActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
