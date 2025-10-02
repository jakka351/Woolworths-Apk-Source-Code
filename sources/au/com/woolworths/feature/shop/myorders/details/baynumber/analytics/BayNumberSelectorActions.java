package au.com.woolworths.feature.shop.myorders.details.baynumber.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "BottomSheetLaunch", "Confirm", "NoBayNumber", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions$BottomSheetLaunch;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions$Confirm;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions$NoBayNumber;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class BayNumberSelectorActions implements Action {
    public final Screen d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions$BottomSheetLaunch;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheetLaunch extends BayNumberSelectorActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public BottomSheetLaunch(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.k;
            this.g = "Bay selector";
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

        @Override // au.com.woolworths.feature.shop.myorders.details.baynumber.analytics.BayNumberSelectorActions, au.com.woolworths.android.onesite.analytics.Action
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions$Confirm;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Confirm extends BayNumberSelectorActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public Confirm(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.m;
            this.g = "Bay selected - Bay selector";
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
            return (obj instanceof Confirm) && Intrinsics.c(this.e, ((Confirm) obj).e);
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.baynumber.analytics.BayNumberSelectorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("Confirm(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions$NoBayNumber;", "Lau/com/woolworths/feature/shop/myorders/details/baynumber/analytics/BayNumberSelectorActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NoBayNumber extends BayNumberSelectorActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public NoBayNumber(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.m;
            this.g = "I don't know bay number - Bay selector";
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
            return (obj instanceof NoBayNumber) && Intrinsics.c(this.e, ((NoBayNumber) obj).e);
        }

        @Override // au.com.woolworths.feature.shop.myorders.details.baynumber.analytics.BayNumberSelectorActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("NoBayNumber(screen=", this.e, ")");
        }
    }

    public BayNumberSelectorActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
