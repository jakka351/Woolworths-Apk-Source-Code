package au.com.woolworths.shop.lists.ui.lists.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import au.com.woolworths.shop.lists.ui.ListScreen;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "AddListClick", "BoostedOffersClick", "BottomSheetImpression", "DuplicateListClick", "MyListsTabSelect", "PastShopsClick", "ShoppingListClick", "SuggestedListsTabSelect", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$AddListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$BoostedOffersClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$BottomSheetImpression;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$DuplicateListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$MyListsTabSelect;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$PastShopsClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$ShoppingListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$SuggestedListsTabSelect;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ListsActions implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$AddListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddListClick extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e = Category.m;
        public final String f = "Add List";
        public final ListScreen.Lists g;

        public AddListClick(ListsAnalyticsAppSection listsAnalyticsAppSection) {
            this.d = listsAnalyticsAppSection;
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof AddListClick) && this.d == ((AddListClick) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "AddListClick(appSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$BoostedOffersClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostedOffersClick extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e = Category.m;
        public final String f = "My Boosted Offers";
        public final ListScreen.Lists g;

        public BoostedOffersClick(ListsAnalyticsAppSection listsAnalyticsAppSection) {
            this.d = listsAnalyticsAppSection;
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof BoostedOffersClick) && this.d == ((BoostedOffersClick) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "BoostedOffersClick(appSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$BottomSheetImpression;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BottomSheetImpression extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e = Category.k;
        public final String f = "List Options";
        public final ListScreen.Lists g;

        public BottomSheetImpression(ListsAnalyticsAppSection listsAnalyticsAppSection) {
            this.d = listsAnalyticsAppSection;
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof BottomSheetImpression) && this.d == ((BottomSheetImpression) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "BottomSheetImpression(appSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$DuplicateListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DuplicateListClick extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e = Category.m;
        public final String f = "Duplicate list";
        public final ListScreen.Lists g;

        public DuplicateListClick(ListsAnalyticsAppSection listsAnalyticsAppSection) {
            this.d = listsAnalyticsAppSection;
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof DuplicateListClick) && this.d == ((DuplicateListClick) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "DuplicateListClick(appSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$MyListsTabSelect;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MyListsTabSelect extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e;
        public final String f;
        public final ListScreen.Lists g;

        public MyListsTabSelect() {
            ListsAnalyticsAppSection listsAnalyticsAppSection = ListsAnalyticsAppSection.e;
            this.d = listsAnalyticsAppSection;
            this.e = Category.m;
            this.f = "my lists";
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof MyListsTabSelect) && this.d == ((MyListsTabSelect) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "MyListsTabSelect(appSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$PastShopsClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PastShopsClick extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e = Category.m;
        public final String f = "View Past Shops";
        public final ListScreen.Lists g;

        public PastShopsClick(ListsAnalyticsAppSection listsAnalyticsAppSection) {
            this.d = listsAnalyticsAppSection;
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof PastShopsClick) && this.d == ((PastShopsClick) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "PastShopsClick(appSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$ShoppingListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingListClick extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e = Category.m;
        public final String f = "View List";
        public final ListScreen.Lists g;

        public ShoppingListClick(ListsAnalyticsAppSection listsAnalyticsAppSection) {
            this.d = listsAnalyticsAppSection;
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof ShoppingListClick) && this.d == ((ShoppingListClick) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "ShoppingListClick(appSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions$SuggestedListsTabSelect;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/ListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SuggestedListsTabSelect extends ListsActions {
        public final ListsAnalyticsAppSection d;
        public final Category e;
        public final String f;
        public final ListScreen.Lists g;

        public SuggestedListsTabSelect() {
            ListsAnalyticsAppSection listsAnalyticsAppSection = ListsAnalyticsAppSection.e;
            this.d = listsAnalyticsAppSection;
            this.e = Category.m;
            this.f = "suggested";
            this.g = new ListScreen.Lists(listsAnalyticsAppSection);
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
            return (obj instanceof SuggestedListsTabSelect) && this.d == ((SuggestedListsTabSelect) obj).d;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "SuggestedListsTabSelect(appSection=" + this.d + ")";
        }
    }
}
