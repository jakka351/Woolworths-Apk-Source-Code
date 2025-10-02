package au.com.woolworths.shop.checkout.ui.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/MarketplacePickupBottomSheetActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "OnAppear", "ButtonConfirm", "Lau/com/woolworths/shop/checkout/ui/analytics/MarketplacePickupBottomSheetActions$ButtonConfirm;", "Lau/com/woolworths/shop/checkout/ui/analytics/MarketplacePickupBottomSheetActions$OnAppear;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MarketplacePickupBottomSheetActions implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/MarketplacePickupBottomSheetActions$ButtonConfirm;", "Lau/com/woolworths/shop/checkout/ui/analytics/MarketplacePickupBottomSheetActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonConfirm extends MarketplacePickupBottomSheetActions {
        public final Screen d;
        public final Category e;
        public final String f;

        public ButtonConfirm(Screens screen) {
            Intrinsics.h(screen, "screen");
            this.d = screen;
            this.e = Category.j;
            this.f = "I understand";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getY() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getX() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonConfirm) && Intrinsics.c(this.d, ((ButtonConfirm) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return d.m("ButtonConfirm(screen=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/MarketplacePickupBottomSheetActions$OnAppear;", "Lau/com/woolworths/shop/checkout/ui/analytics/MarketplacePickupBottomSheetActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAppear extends MarketplacePickupBottomSheetActions {
        public final Screen d;
        public final Category e;
        public final String f;

        public OnAppear(Screens screen) {
            Intrinsics.h(screen, "screen");
            this.d = screen;
            this.e = Category.k;
            this.f = "Everyday Market Pickup Notification";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getY() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getX() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnAppear) && Intrinsics.c(this.d, ((OnAppear) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return d.m("OnAppear(screen=", this.d, ")");
        }
    }
}
