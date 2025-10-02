package au.com.woolworths.shop.checkout.ui.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "DataLoaded", "SelectMethodClick", "AddDeliveryLocationClick", "EditDeliveryLocationClick", "EditPickupLocationClick", "CustomButtonClick", "PreferenceUnwellSwitch", "PreferenceLeaveOrderSwitch", "PreferenceDriverInstructions", "PreferenceShopperInstructions", "CostSummaryToggle", "CheckoutAlert", "ExitCheckout", "DeliveryNowEligibility", "DeliveryNowReserveFail", "ProductsEmpty", "Continue", "CheckoutInlineErrorImpression", "IdVerificationImpression", "IdVerificationStart", "IdVerificationRetry", "IdVerificationNotNow", "InlineMessageImpression", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$AddDeliveryLocationClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CheckoutAlert;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CheckoutInlineErrorImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$Continue;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CostSummaryToggle;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CustomButtonClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$DataLoaded;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$DeliveryNowEligibility;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$DeliveryNowReserveFail;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$EditDeliveryLocationClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$EditPickupLocationClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$ExitCheckout;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationNotNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationRetry;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationStart;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$InlineMessageImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceDriverInstructions;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceLeaveOrderSwitch;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceShopperInstructions;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceUnwellSwitch;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$ProductsEmpty;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$SelectMethodClick;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutDetailsActions implements Action {
    public final Screens d = Screens.g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$AddDeliveryLocationClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddDeliveryLocationClick extends CheckoutDetailsActions {
        public static final AddDeliveryLocationClick e = new AddDeliveryLocationClick();
        public static final Category f = Category.m;
        public static final String g = "Add Delivery Address";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CheckoutAlert;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutAlert extends CheckoutDetailsActions {
        public static final CheckoutAlert e = new CheckoutAlert();
        public static final Category f = Category.v;
        public static final String g = "Checkout Alert";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CheckoutInlineErrorImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutInlineErrorImpression extends CheckoutDetailsActions {
        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return null;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckoutInlineErrorImpression);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "CheckoutInlineErrorImpression(data=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$Continue;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Continue extends CheckoutDetailsActions {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CostSummaryToggle;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CostSummaryToggle extends CheckoutDetailsActions {
        public final boolean e;
        public final Category f = Category.m;
        public final String g;

        public CostSummaryToggle(boolean z) {
            this.e = z;
            this.g = z ? "Open cost summary" : "Close cost summary";
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
            return (obj instanceof CostSummaryToggle) && this.e == ((CostSummaryToggle) obj).e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e);
        }

        public final String toString() {
            return a.n("CostSummaryToggle(expanded=", ")", this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$CustomButtonClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CustomButtonClick extends CheckoutDetailsActions {
        public final String e;
        public final Category f;

        public CustomButtonClick(String label) {
            Intrinsics.h(label, "label");
            this.e = label;
            this.f = Category.m;
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
            return YU.a.h("CustomButtonClick(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$DataLoaded;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataLoaded extends CheckoutDetailsActions {
        public static final DataLoaded e = new DataLoaded();
        public static final Category f = Category.B;
        public static final String g = "Checkout Details Step Data Loaded";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$DeliveryNowEligibility;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowEligibility extends CheckoutDetailsActions {
        public static final DeliveryNowEligibility e = new DeliveryNowEligibility();
        public static final Category f = Category.B;
        public static final String g = "Delivery Window Eligibility";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$DeliveryNowReserveFail;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowReserveFail extends CheckoutDetailsActions {
        public static final DeliveryNowReserveFail e = new DeliveryNowReserveFail();
        public static final Category f = Category.g0;
        public static final String g = "Delivery Now is currently unavailable. Select a different delivery window to continue.";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$EditDeliveryLocationClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditDeliveryLocationClick extends CheckoutDetailsActions {
        public static final EditDeliveryLocationClick e = new EditDeliveryLocationClick();
        public static final Category f = Category.m;
        public static final String g = "Edit Delivery Address";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$EditPickupLocationClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditPickupLocationClick extends CheckoutDetailsActions {
        public static final EditPickupLocationClick e = new EditPickupLocationClick();
        public static final Category f = Category.m;
        public static final String g = "Edit Pickup Location";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$ExitCheckout;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExitCheckout extends CheckoutDetailsActions {
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationImpression extends CheckoutDetailsActions {
        public static final IdVerificationImpression e = new IdVerificationImpression();
        public static final Category f = Category.k;
        public static final String g = "Checkout Id Verification";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationNotNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationNotNow extends CheckoutDetailsActions {
        public static final IdVerificationNotNow e = new IdVerificationNotNow();
        public static final Category f = Category.j;
        public static final String g = "Not now - Id Verification";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationRetry;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationRetry extends CheckoutDetailsActions {
        public static final IdVerificationRetry e = new IdVerificationRetry();
        public static final Category f = Category.j;
        public static final String g = "Retry - Id Verification";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$IdVerificationStart;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class IdVerificationStart extends CheckoutDetailsActions {
        public static final IdVerificationStart e = new IdVerificationStart();
        public static final Category f = Category.j;
        public static final String g = "Start - Id Verification";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$InlineMessageImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InlineMessageImpression extends CheckoutDetailsActions {
        public static final InlineMessageImpression e = new InlineMessageImpression();
        public static final Category f = Category.H;
        public static final String g = "Default Inline Message";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceDriverInstructions;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreferenceDriverInstructions extends CheckoutDetailsActions {
        public static final PreferenceDriverInstructions e = new PreferenceDriverInstructions();
        public static final Category f = Category.m;
        public static final String g = "Save Driver Instructions";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceLeaveOrderSwitch;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PreferenceLeaveOrderSwitch extends CheckoutDetailsActions {
        public final boolean e;
        public final Category f;
        public final String g;

        public PreferenceLeaveOrderSwitch(boolean z) {
            this.e = z;
            this.f = z ? Category.i0 : Category.h0;
            this.g = "Leave Order Unattended";
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
            return (obj instanceof PreferenceLeaveOrderSwitch) && this.e == ((PreferenceLeaveOrderSwitch) obj).e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e);
        }

        public final String toString() {
            return a.n("PreferenceLeaveOrderSwitch(value=", ")", this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceShopperInstructions;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreferenceShopperInstructions extends CheckoutDetailsActions {
        public static final PreferenceShopperInstructions e = new PreferenceShopperInstructions();
        public static final Category f = Category.m;
        public static final String g = "Save Shopper Instructions";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$PreferenceUnwellSwitch;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PreferenceUnwellSwitch extends CheckoutDetailsActions {
        public final boolean e;
        public final Category f;
        public final String g;

        public PreferenceUnwellSwitch(boolean z) {
            this.e = z;
            this.f = z ? Category.i0 : Category.h0;
            this.g = "Unwell or in self-isolation";
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
            return (obj instanceof PreferenceUnwellSwitch) && this.e == ((PreferenceUnwellSwitch) obj).e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e);
        }

        public final String toString() {
            return a.n("PreferenceUnwellSwitch(value=", ")", this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$ProductsEmpty;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsEmpty extends CheckoutDetailsActions {
        public static final ProductsEmpty e = new ProductsEmpty();
        public static final Category f = Category.v;
        public static final String g = "No products in checkout";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions$SelectMethodClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutDetailsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SelectMethodClick extends CheckoutDetailsActions {
        public static final SelectMethodClick e = new SelectMethodClick();
        public static final Category f = Category.m;
        public static final String g = "Select Method";

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

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
