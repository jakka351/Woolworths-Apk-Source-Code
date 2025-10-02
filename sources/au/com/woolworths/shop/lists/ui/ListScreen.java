package au.com.woolworths.shop.lists.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/ListScreen;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "ListDetails", "Lists", "PastShopsList", "Lau/com/woolworths/shop/lists/ui/ListScreen$ListDetails;", "Lau/com/woolworths/shop/lists/ui/ListScreen$Lists;", "Lau/com/woolworths/shop/lists/ui/ListScreen$PastShopsList;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ListScreen implements Screen {
    public final String d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/ListScreen$ListDetails;", "Lau/com/woolworths/shop/lists/ui/ListScreen;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListDetails extends ListScreen {
        public final ListDetailsAnalyticsParams e;
        public final String f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ListDetails(ListDetailsAnalyticsParams analyticsParams) {
            super(analyticsParams.f12301a.d);
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.e = analyticsParams;
            this.f = analyticsParams.b ? "watchlist screen" : "List Details screen";
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String b() {
            ListDetailsAnalyticsParams listDetailsAnalyticsParams = this.e;
            Intrinsics.h(listDetailsAnalyticsParams, "<this>");
            return listDetailsAnalyticsParams.b ? "watchlist_impression" : "listdetails_screen";
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: d, reason: from getter */
        public final String getF() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ListDetails) && Intrinsics.c(this.e, ((ListDetails) obj).e);
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return a.m("ListDetails(analyticsParams=", this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/ListScreen$Lists;", "Lau/com/woolworths/shop/lists/ui/ListScreen;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Lists extends ListScreen {
        public final ListsAnalyticsAppSection e;

        public Lists(ListsAnalyticsAppSection listsAnalyticsAppSection) {
            super(listsAnalyticsAppSection.d);
            this.e = listsAnalyticsAppSection;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String b() {
            return "lists_screen";
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: d */
        public final String getF() {
            return "Lists screen";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Lists) && this.e == ((Lists) obj).e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "Lists(appSection=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/ListScreen$PastShopsList;", "Lau/com/woolworths/shop/lists/ui/ListScreen;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PastShopsList extends ListScreen {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PastShopsList() {
            super("Lists");
            ListsAnalyticsAppSection listsAnalyticsAppSection = ListsAnalyticsAppSection.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        public final String b() {
            return "pastshopslist_screen";
        }

        @Override // au.com.woolworths.android.onesite.analytics.Screen
        /* renamed from: d */
        public final String getF() {
            return "Past Shops List screen";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PastShopsList)) {
                return false;
            }
            ListsAnalyticsAppSection listsAnalyticsAppSection = ListsAnalyticsAppSection.e;
            return true;
        }

        public final int hashCode() {
            return ListsAnalyticsAppSection.e.hashCode();
        }

        public final String toString() {
            return "PastShopsList(appSection=" + ListsAnalyticsAppSection.e + ")";
        }
    }

    public ListScreen(String str) {
        this.d = str;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Screen
    /* renamed from: a, reason: from getter */
    public final String getD() {
        return this.d;
    }
}
