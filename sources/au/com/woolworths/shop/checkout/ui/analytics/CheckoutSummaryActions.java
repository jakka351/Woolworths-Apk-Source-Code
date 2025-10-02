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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "DataLoaded", "AddBillingAddress", "RewardsUseNow", "RewardsNotNow", "RewardsRedeemOld", "ExitCheckout", "Continue", "AddRewardsCard", "LinkClick", "HelpRequested", "HelpAlert", "PromotionSubmitted", "PromotionSuccess", "PromotionFail", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$AddBillingAddress;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$AddRewardsCard;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$Continue;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$DataLoaded;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$ExitCheckout;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$HelpAlert;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$HelpRequested;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$LinkClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$PromotionFail;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$PromotionSubmitted;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$PromotionSuccess;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$RewardsNotNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$RewardsRedeemOld;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$RewardsUseNow;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutSummaryActions implements Action {
    public final Screens d = Screens.j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$AddBillingAddress;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddBillingAddress extends CheckoutSummaryActions {
        public static final AddBillingAddress e = new AddBillingAddress();
        public static final Category f = Category.m;
        public static final String g = "Billing Address - Add";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$AddRewardsCard;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AddRewardsCard extends CheckoutSummaryActions {
        public static final AddRewardsCard e = new AddRewardsCard();
        public static final Category f = Category.m;
        public static final String g = "Add Rewards Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$Continue;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Continue extends CheckoutSummaryActions {
        public static final Continue e = new Continue();
        public static final Category f = Category.m;
        public static final String g = "Continue";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$DataLoaded;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DataLoaded extends CheckoutSummaryActions {
        public static final DataLoaded e = new DataLoaded();
        public static final Category f = Category.B;
        public static final String g = "Checkout Summary Step Data Loaded";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$ExitCheckout;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExitCheckout extends CheckoutSummaryActions {
        public static final ExitCheckout e = new ExitCheckout();
        public static final Category f = Category.m;
        public static final String g = "Exit checkout clicked";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$HelpAlert;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpAlert extends CheckoutSummaryActions {
        public static final HelpAlert e = new HelpAlert();
        public static final Category f = Category.u;
        public static final String g = "Help";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$HelpRequested;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpRequested extends CheckoutSummaryActions {
        public static final HelpRequested e = new HelpRequested();
        public static final Category f = Category.m;
        public static final String g = "Help";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$LinkClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkClick extends CheckoutSummaryActions {
        public final String e;
        public final Category f = Category.D;

        public LinkClick(String str) {
            this.e = str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getE() {
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
            return (obj instanceof LinkClick) && Intrinsics.c(this.e, ((LinkClick) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("LinkClick(label=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$PromotionFail;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionFail extends CheckoutSummaryActions {
        public static final PromotionFail e = new PromotionFail();
        public static final Category f = Category.l0;
        public static final String g = "Promotion Unsuccessful";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$PromotionSubmitted;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionSubmitted extends CheckoutSummaryActions {
        public static final PromotionSubmitted e = new PromotionSubmitted();
        public static final Category f = Category.m;
        public static final String g = "Promotion Submitted";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$PromotionSuccess;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionSuccess extends CheckoutSummaryActions {
        public static final PromotionSuccess e = new PromotionSuccess();
        public static final Category f = Category.l0;
        public static final String g = "Promotion Success";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$RewardsNotNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsNotNow extends CheckoutSummaryActions {
        public static final RewardsNotNow e = new RewardsNotNow();
        public static final Category f = Category.m;
        public static final String g = "Redeem Rewards: Not now";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$RewardsRedeemOld;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsRedeemOld extends CheckoutSummaryActions {
        public static final RewardsRedeemOld e = new RewardsRedeemOld();
        public static final Category f = Category.m;
        public static final String g = "Redeem Rewards: Redeem";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getF() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions$RewardsUseNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSummaryActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsUseNow extends CheckoutSummaryActions {
        public static final RewardsUseNow e = new RewardsUseNow();
        public static final Category f = Category.m;
        public static final String g = "Redeem Rewards: Use now";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getE() {
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
