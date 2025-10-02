package au.com.woolworths.shop.checkout.ui.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "DataLoaded", "PromotionSubmitted", "PromotionSuccess", "PromotionFail", "SubstitutionToggle", "SubstitutionInfoClick", "CustomButtonClick", "Continue", "ExitCheckout", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$Continue;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$CustomButtonClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$DataLoaded;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$ExitCheckout;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$PromotionFail;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$PromotionSubmitted;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$PromotionSuccess;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$SubstitutionInfoClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$SubstitutionToggle;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutProductsActions implements Action {
    public final Screens d = Screens.i;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$Continue;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Continue extends CheckoutProductsActions {
        public static final Continue e = new Continue();
        public static final Category f = Category.m;
        public static final String g = "Continue";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$CustomButtonClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomButtonClick extends CheckoutProductsActions {
        public final String e;
        public final Category f = Category.m;

        public CustomButtonClick(String str) {
            this.e = str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
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
            return (obj instanceof CustomButtonClick) && Intrinsics.c(this.e, ((CustomButtonClick) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("CustomButtonClick(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$DataLoaded;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataLoaded extends CheckoutProductsActions {
        public static final DataLoaded e = new DataLoaded();
        public static final Category f = Category.B;
        public static final String g = "Checkout Products Step Data Loaded";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$ExitCheckout;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExitCheckout extends CheckoutProductsActions {
        public static final ExitCheckout e = new ExitCheckout();
        public static final Category f = Category.m;
        public static final String g = "Exit checkout clicked";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$PromotionFail;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionFail extends CheckoutProductsActions {
        public static final PromotionFail e = new PromotionFail();
        public static final Category f = Category.l0;
        public static final String g = "Promotion Unsuccessful";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$PromotionSubmitted;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionSubmitted extends CheckoutProductsActions {
        public static final PromotionSubmitted e = new PromotionSubmitted();
        public static final Category f = Category.m;
        public static final String g = "Promotion Submitted";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$PromotionSuccess;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionSuccess extends CheckoutProductsActions {
        public static final PromotionSuccess e = new PromotionSuccess();
        public static final Category f = Category.l0;
        public static final String g = "Promotion Success";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$SubstitutionInfoClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubstitutionInfoClick extends CheckoutProductsActions {
        public static final SubstitutionInfoClick e = new SubstitutionInfoClick();
        public static final Category f = Category.m;
        public static final String g = "Substitution Info Button";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions$SubstitutionToggle;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutProductsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubstitutionToggle extends CheckoutProductsActions {
        public final boolean e;
        public final Category f = Category.m;
        public final String g;

        public SubstitutionToggle(boolean z) {
            this.e = z;
            this.g = z ? "Substitution On" : "Substitution Off";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getG() {
            return this.g;
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
            return (obj instanceof SubstitutionToggle) && this.e == ((SubstitutionToggle) obj).e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("SubstitutionToggle(value=", ")", this.e);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
