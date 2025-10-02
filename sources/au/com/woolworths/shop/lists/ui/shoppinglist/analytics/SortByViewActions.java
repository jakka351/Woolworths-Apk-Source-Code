package au.com.woolworths.shop.lists.ui.shoppinglist.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.ListScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ChangeShoppingModeDialogImpression", "ListDialogChangeModeClick", "SortingDirectionClicked", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions$SortingDirectionClicked;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SortByViewActions implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions$ChangeShoppingModeDialogImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChangeShoppingModeDialogImpression extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ChangeShoppingModeDialogImpression(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.u;
            this.f = "Change Shopping Mode";
            this.g = new ListScreen.ListDetails(analyticsParams);
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
            return (obj instanceof ChangeShoppingModeDialogImpression) && Intrinsics.c(this.d, ((ChangeShoppingModeDialogImpression) obj).d);
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
            return a.m("ChangeShoppingModeDialogImpression(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions$ListDialogChangeModeClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListDialogChangeModeClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ListDialogChangeModeClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Change Shopping Mode";
            this.g = new ListScreen.ListDetails(analyticsParams);
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
            return (obj instanceof ListDialogChangeModeClick) && Intrinsics.c(this.d, ((ListDialogChangeModeClick) obj).d);
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
            return a.m("ListDialogChangeModeClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions$SortingDirectionClicked;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortingDirectionClicked extends SortByViewActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public SortingDirectionClicked(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Sort Reversed";
            this.g = new ListScreen.ListDetails(analyticsParams);
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
            return (obj instanceof SortingDirectionClicked) && Intrinsics.c(this.d, ((SortingDirectionClicked) obj).d);
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
            return a.m("SortingDirectionClicked(analyticsParams=", this.d, ")");
        }
    }
}
