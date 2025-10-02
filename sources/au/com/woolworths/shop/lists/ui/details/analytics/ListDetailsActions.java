package au.com.woolworths.shop.lists.ui.details.analytics;

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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "ExpandBottomSheetClick", "CollapseBottomSheetClick", "NetworkError", "ServerError", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$CollapseBottomSheetClick;", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$ExpandBottomSheetClick;", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$NetworkError;", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$ServerError;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ListDetailsActions implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$CollapseBottomSheetClick;", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CollapseBottomSheetClick extends ListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public CollapseBottomSheetClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "close list total";
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
            return (obj instanceof CollapseBottomSheetClick) && Intrinsics.c(this.d, ((CollapseBottomSheetClick) obj).d);
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
            return a.m("CollapseBottomSheetClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$ExpandBottomSheetClick;", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExpandBottomSheetClick extends ListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ExpandBottomSheetClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "open list total";
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
            return (obj instanceof ExpandBottomSheetClick) && Intrinsics.c(this.d, ((ExpandBottomSheetClick) obj).d);
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
            return a.m("ExpandBottomSheetClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$NetworkError;", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NetworkError extends ListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public NetworkError(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.v;
            this.f = "Network Error";
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
            return (obj instanceof NetworkError) && Intrinsics.c(this.d, ((NetworkError) obj).d);
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
            return a.m("NetworkError(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions$ServerError;", "Lau/com/woolworths/shop/lists/ui/details/analytics/ListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ServerError extends ListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ServerError(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.v;
            this.f = "Server Error";
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
            return (obj instanceof ServerError) && Intrinsics.c(this.d, ((ServerError) obj).d);
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
            return a.m("ServerError(analyticsParams=", this.d, ")");
        }
    }
}
