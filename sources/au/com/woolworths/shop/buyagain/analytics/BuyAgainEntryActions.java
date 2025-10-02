package au.com.woolworths.shop.buyagain.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/buyagain/analytics/BuyAgainEntryActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "EntryPointImpression", "EntryPointClick", "Lau/com/woolworths/shop/buyagain/analytics/BuyAgainEntryActions$EntryPointClick;", "Lau/com/woolworths/shop/buyagain/analytics/BuyAgainEntryActions$EntryPointImpression;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class BuyAgainEntryActions implements Action {
    public final Screen d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/analytics/BuyAgainEntryActions$EntryPointClick;", "Lau/com/woolworths/shop/buyagain/analytics/BuyAgainEntryActions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EntryPointClick extends BuyAgainEntryActions {
        public final Screen e;
        public final Category f;
        public final String g;

        public EntryPointClick(Screen screen) {
            super(screen);
            this.e = screen;
            this.f = Category.m;
            this.g = "Buy Again - main callout";
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
            return (obj instanceof EntryPointClick) && Intrinsics.c(this.e, ((EntryPointClick) obj).e);
        }

        @Override // au.com.woolworths.shop.buyagain.analytics.BuyAgainEntryActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return d.m("EntryPointClick(screen=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/buyagain/analytics/BuyAgainEntryActions$EntryPointImpression;", "Lau/com/woolworths/shop/buyagain/analytics/BuyAgainEntryActions;", "shop-buy-again_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EntryPointImpression extends BuyAgainEntryActions {
        public final Category e;
        public final String f;

        public EntryPointImpression() {
            super(SearchScreens.d);
            this.e = Category.B;
            this.f = "Buy Again - main callout";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EntryPointImpression)) {
                return false;
            }
            Object obj2 = SearchScreens.d;
            return obj2.equals(obj2);
        }

        @Override // au.com.woolworths.shop.buyagain.analytics.BuyAgainEntryActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return SearchScreens.d;
        }

        public final int hashCode() {
            return SearchScreens.d.hashCode();
        }

        public final String toString() {
            return "EntryPointImpression(screen=" + SearchScreens.d + ")";
        }
    }

    public BuyAgainEntryActions(Screen screen) {
        this.d = screen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public Screen getD() {
        return this.d;
    }
}
