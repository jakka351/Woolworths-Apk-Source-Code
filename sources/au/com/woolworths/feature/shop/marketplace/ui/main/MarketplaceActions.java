package au.com.woolworths.feature.shop.marketplace.ui.main;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.base.shopapp.data.models.InfoSectionAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "SearchIconClick", "ButtonClick", "NetworkError", "ServerError", "NoResultsError", "Companion", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$ButtonClick;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$NetworkError;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$NoResultsError;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$SearchIconClick;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$ServerError;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MarketplaceActions implements Action {
    public static final InfoSectionAnalytics e = new InfoSectionAnalytics(Screens.n, Category.m, "Visit our website");
    public final Screens d = Screens.m;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$ButtonClick;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonClick extends MarketplaceActions {
        public final String f;
        public final Category g = Category.m;

        public ButtonClick(String str) {
            this.f = str;
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
            return (obj instanceof ButtonClick) && Intrinsics.c(this.f, ((ButtonClick) obj).f);
        }

        public final int hashCode() {
            return this.f.hashCode();
        }

        public final String toString() {
            return a.h("ButtonClick(label=", this.f, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$Companion;", "", "", "SELLER_DESCRIPTION", "Ljava/lang/String;", "BRAND_DESCRIPTION", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$NetworkError;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NetworkError extends MarketplaceActions {
        public static final NetworkError f = new NetworkError();
        public static final Category g = Category.v;
        public static final String h = "Network Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return h;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return g;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$NoResultsError;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoResultsError extends MarketplaceActions {
        public static final NoResultsError f = new NoResultsError();
        public static final Category g = Category.v;
        public static final String h = "No Results Found";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return h;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return g;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$SearchIconClick;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchIconClick extends MarketplaceActions {
        public static final SearchIconClick f = new SearchIconClick();
        public static final Category g = Category.m;
        public static final String h = "Tap Search Icon";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return h;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return g;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions$ServerError;", "Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActions;", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ServerError extends MarketplaceActions {
        public static final ServerError f = new ServerError();
        public static final Category g = Category.v;
        public static final String h = "Server Error";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return h;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return g;
        }
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
