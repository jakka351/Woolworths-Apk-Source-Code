package au.com.woolworths.shop.checkout.ui.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\f\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ActionableCardClick", "ActionableCardImpression", "DeliveryNow", "DeliveryUnlimited", "DirectToBootNow", "GoogleAdBannerClick", "GoogleAdBannerImpression", "NavigateHome", "NetworkError", "ServerError", "HelpRequested", "HelpAlert", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$ActionableCardClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$ActionableCardImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$DeliveryNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$DeliveryUnlimited;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$DirectToBootNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$GoogleAdBannerClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$GoogleAdBannerImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$HelpAlert;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$HelpRequested;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$NavigateHome;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$NetworkError;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$ServerError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OrderConfirmationActions implements Action {
    public final Screens d = Screens.p;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$ActionableCardClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardClick extends OrderConfirmationActions {
        public static final ActionableCardClick e = new ActionableCardClick();
        public static final Category f = Category.g;
        public static final String g = "Actionable Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$ActionableCardImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardImpression extends OrderConfirmationActions {
        public static final ActionableCardImpression e = new ActionableCardImpression();
        public static final Category f = Category.h;
        public static final String g = "Actionable Card";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$DeliveryNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNow extends OrderConfirmationActions {
        public static final DeliveryNow e = new DeliveryNow();
        public static final Category f = Category.h;
        public static final String g = "Delivery Now order";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$DeliveryUnlimited;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimited extends OrderConfirmationActions {
        public static final DeliveryUnlimited e = new DeliveryUnlimited();
        public static final Category f = Category.h;
        public static final String g = "DU Delivery fee savings";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$DirectToBootNow;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DirectToBootNow extends OrderConfirmationActions {
        public static final DirectToBootNow e = new DirectToBootNow();
        public static final Category f = Category.h;
        public static final String g = "Direct to Boot Now order";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DirectToBootNow);
        }

        public final int hashCode() {
            return 1072186257;
        }

        public final String toString() {
            return "DirectToBootNow";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$GoogleAdBannerClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerClick extends OrderConfirmationActions {
        public static final GoogleAdBannerClick e = new GoogleAdBannerClick();
        public static final Category f = Category.y;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$GoogleAdBannerImpression;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerImpression extends OrderConfirmationActions {
        public static final GoogleAdBannerImpression e = new GoogleAdBannerImpression();
        public static final Category f = Category.z;
        public static final String g = "Promotion";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$HelpAlert;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpAlert extends OrderConfirmationActions {
        public static final HelpAlert e = new HelpAlert();
        public static final Category f = Category.u;
        public static final String g = "Help";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$HelpRequested;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HelpRequested extends OrderConfirmationActions {
        public static final HelpRequested e = new HelpRequested();
        public static final Category f = Category.m;
        public static final String g = "Help";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$NavigateHome;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NavigateHome extends OrderConfirmationActions {
        public static final NavigateHome e = new NavigateHome();
        public static final Category f = Category.m;
        public static final String g = "Home";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$NetworkError;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends OrderConfirmationActions {
        public static final NetworkError e = new NetworkError();
        public static final Category f = Category.v;
        public static final String g = "Network error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions$ServerError;", "Lau/com/woolworths/shop/checkout/ui/analytics/OrderConfirmationActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends OrderConfirmationActions {
        public static final ServerError e = new ServerError();
        public static final Category f = Category.v;
        public static final String g = "Server error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getY() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getX() {
            return f;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
