package au.com.woolworths.shop.checkout.ui.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "DirectToBootNowImpression", "DirectToBootNowClick", "DeliveryNowImpression", "DeliveryNowClick", "DeliveryNowLearnMoreClick", "DateSelection", "DayPeriodSelection", "FullScreenError", "GreenWindowImpression", "WindowSlotSelection", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DateSelection;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DayPeriodSelection;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DeliveryNowClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DeliveryNowImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DeliveryNowLearnMoreClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DirectToBootNowClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DirectToBootNowImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$FullScreenError;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$GreenWindowImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$WindowSlotSelection;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class FulfilmentWindowsActions implements Action {
    public final CheckoutScreens d = CheckoutScreens.e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DateSelection;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DateSelection extends FulfilmentWindowsActions {
        public static final DateSelection e = new DateSelection();
        public static final Category f = Category.m;
        public static final String g = "Checkout Collection Date";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DayPeriodSelection;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DayPeriodSelection extends FulfilmentWindowsActions {
        public final String e;
        public final Category f = Category.m;
        public final String g;

        public DayPeriodSelection(String str) {
            this.e = str;
            this.g = "Checkout Collection Time ".concat(str);
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
            return (obj instanceof DayPeriodSelection) && Intrinsics.c(this.e, ((DayPeriodSelection) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("DayPeriodSelection(periodName=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DeliveryNowClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowClick extends FulfilmentWindowsActions {
        public static final DeliveryNowClick e = new DeliveryNowClick();
        public static final Category f = Category.m;
        public static final String g = "Delivery Now Window";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DeliveryNowImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowImpression extends FulfilmentWindowsActions {
        public static final DeliveryNowImpression e = new DeliveryNowImpression();
        public static final Category f = Category.B;
        public static final String g = "Delivery Now Window";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DeliveryNowLearnMoreClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowLearnMoreClick extends FulfilmentWindowsActions {
        public static final DeliveryNowLearnMoreClick e = new DeliveryNowLearnMoreClick();
        public static final Category f = Category.D;
        public static final String g = "Learn More about Delivery Now";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DirectToBootNowClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DirectToBootNowClick extends FulfilmentWindowsActions {
        public static final DirectToBootNowClick e = new DirectToBootNowClick();
        public static final Category f = Category.m;
        public static final String g = "Direct to Boot Now Window";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$DirectToBootNowImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DirectToBootNowImpression extends FulfilmentWindowsActions {
        public static final DirectToBootNowImpression e = new DirectToBootNowImpression();
        public static final Category f = Category.B;
        public static final String g = "Direct to Boot Now Window";

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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$FullScreenError;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FullScreenError extends FulfilmentWindowsActions {
        public final String e;
        public final Category f;
        public final String g;

        public FullScreenError(String errorLabel) {
            Intrinsics.h(errorLabel, "errorLabel");
            this.e = errorLabel;
            this.f = Category.v;
            this.g = errorLabel;
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
            return (obj instanceof FullScreenError) && Intrinsics.c(this.e, ((FullScreenError) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("FullScreenError(errorLabel=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$GreenWindowImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GreenWindowImpression extends FulfilmentWindowsActions {
        public static final Category e;
        public static final String f;

        static {
            new GreenWindowImpression();
            e = Category.h;
            f = "Green Window Banner";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getG() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions$WindowSlotSelection;", "Lau/com/woolworths/shop/checkout/ui/analytics/FulfilmentWindowsActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WindowSlotSelection extends FulfilmentWindowsActions {
        public final boolean e;
        public final Category f = Category.m;
        public final String g;

        public WindowSlotSelection(boolean z) {
            this.e = z;
            this.g = z ? "Checkout Collection Window Partner Driver" : "Checkout Collection Window";
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
            return (obj instanceof WindowSlotSelection) && this.e == ((WindowSlotSelection) obj).e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("WindowSlotSelection(hasPartnerDriver=", ")", this.e);
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
