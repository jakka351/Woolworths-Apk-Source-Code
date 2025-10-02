package au.com.woolworths.shop.checkout.ui.analytics;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSubstitutionActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "CheaperBannerClick", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSubstitutionActions$CheaperBannerClick;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CheckoutSubstitutionActions implements Action {
    public final CheckoutScreens d = CheckoutScreens.d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSubstitutionActions$CheaperBannerClick;", "Lau/com/woolworths/shop/checkout/ui/analytics/CheckoutSubstitutionActions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheaperBannerClick extends CheckoutSubstitutionActions {
        public final String e;
        public final Category f = Category.o;
        public final String g;

        public CheaperBannerClick(String str) {
            this.e = str;
            this.g = str;
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
            return (obj instanceof CheaperBannerClick) && Intrinsics.c(this.e, ((CheaperBannerClick) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.h("CheaperBannerClick(analyticsLabel=", this.e, ")");
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
