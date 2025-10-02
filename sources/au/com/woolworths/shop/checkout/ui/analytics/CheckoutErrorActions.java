package au.com.woolworths.shop.checkout.ui.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ServerError", "NetworkError", "MinimumSpend", "LiquorLicence", "WindowNotSet", "WindowInvalid", "OrderLimit", "DailyOrderLimit", "WindowSlotsEmpty", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$DailyOrderLimit;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$LiquorLicence;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$MinimumSpend;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$NetworkError;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$OrderLimit;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$ServerError;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$WindowInvalid;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$WindowNotSet;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$WindowSlotsEmpty;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutErrorActions implements Action {
    public final Enum d;
    public final Category e = Category.v;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$DailyOrderLimit;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DailyOrderLimit extends CheckoutErrorActions {
        public final Screens f;
        public final String g;

        public DailyOrderLimit(Screens screens) {
            super(screens);
            this.f = screens;
            this.g = "You have reached your daily order limit";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DailyOrderLimit) && Intrinsics.c(this.f, ((DailyOrderLimit) obj).f);
        }

        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return "DailyOrderLimit(screen=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$LiquorLicence;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LiquorLicence extends CheckoutErrorActions {
        public final Screens f;
        public final String g;

        public LiquorLicence(Screens screens) {
            super(screens);
            this.f = screens;
            this.g = "Liquor licensing error";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LiquorLicence) && Intrinsics.c(this.f, ((LiquorLicence) obj).f);
        }

        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return "LiquorLicence(screen=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$MinimumSpend;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MinimumSpend extends CheckoutErrorActions {
        public final Screens f;
        public final String g;

        public MinimumSpend(Screens screens) {
            super(screens);
            this.f = screens;
            this.g = "Minimum spend error";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MinimumSpend) && Intrinsics.c(this.f, ((MinimumSpend) obj).f);
        }

        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return "MinimumSpend(screen=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$NetworkError;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkError extends CheckoutErrorActions {
        public final Enum f;
        public final String g;

        /* JADX WARN: Multi-variable type inference failed */
        public NetworkError(Screen screen) {
            super(screen);
            this.f = (Enum) screen;
            this.g = "Network error";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NetworkError) && Intrinsics.c(this.f, ((NetworkError) obj).f);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return "NetworkError(screen=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$OrderLimit;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderLimit extends CheckoutErrorActions {
        public final Screens f;
        public final String g;

        public OrderLimit(Screens screens) {
            super(screens);
            this.f = screens;
            this.g = "Too many products for delivery now";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OrderLimit) && Intrinsics.c(this.f, ((OrderLimit) obj).f);
        }

        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return "OrderLimit(screen=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$ServerError;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerError extends CheckoutErrorActions {
        public final Enum f;
        public final String g;
        public final String h;

        /* JADX WARN: Multi-variable type inference failed */
        public ServerError(Screen screen, String str) {
            super(screen);
            this.f = (Enum) screen;
            this.g = str;
            this.h = str == null ? "Server error" : str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ServerError)) {
                return false;
            }
            ServerError serverError = (ServerError) obj;
            return Intrinsics.c(this.f, serverError.f) && Intrinsics.c(this.g, serverError.g);
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            int iHashCode = this.f.hashCode() * 31;
            String str = this.g;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ServerError(screen=" + this.f + ", message=" + this.g + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$WindowInvalid;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WindowInvalid extends CheckoutErrorActions {
        public final Screens f;
        public final String g;

        public WindowInvalid(Screens screens) {
            super(screens);
            this.f = screens;
            this.g = "Delivery Now unavailable";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WindowInvalid) && Intrinsics.c(this.f, ((WindowInvalid) obj).f);
        }

        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return "WindowInvalid(screen=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$WindowNotSet;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WindowNotSet extends CheckoutErrorActions {
        public final Screens f;
        public final String g;

        public WindowNotSet(Screens screens) {
            super(screens);
            this.f = screens;
            this.g = "Window has not been set for checkout";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.g;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WindowNotSet) && Intrinsics.c(this.f, ((WindowNotSet) obj).f);
        }

        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return "WindowNotSet(screen=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions$WindowSlotsEmpty;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutErrorActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class WindowSlotsEmpty extends CheckoutErrorActions {
        public final Screen f;
        public final String g;
        public final String h;

        /* JADX WARN: Illegal instructions before constructor call */
        public WindowSlotsEmpty(String str) {
            Screens screens = Screens.g;
            super(screens);
            this.f = screens;
            this.g = str;
            this.h = str;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getL() {
            return this.h;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WindowSlotsEmpty)) {
                return false;
            }
            WindowSlotsEmpty windowSlotsEmpty = (WindowSlotsEmpty) obj;
            return Intrinsics.c(this.f, windowSlotsEmpty.f) && Intrinsics.c(this.g, windowSlotsEmpty.g);
        }

        @Override // au.com.woolworths.shop.checkout.ui.analytics.CheckoutErrorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.f;
        }

        public final int hashCode() {
            return this.g.hashCode() + (this.f.hashCode() * 31);
        }

        public final String toString() {
            return "WindowSlotsEmpty(screen=" + this.f + ", message=" + this.g + ")";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CheckoutErrorActions(Screen screen) {
        this.d = (Enum) screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getK() {
        return this.e;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public Screen getD() {
        return this.d;
    }
}
