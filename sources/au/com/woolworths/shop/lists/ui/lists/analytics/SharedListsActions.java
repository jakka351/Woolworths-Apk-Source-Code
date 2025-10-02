package au.com.woolworths.shop.lists.ui.lists.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.shop.lists.ui.ListScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "DeleteListImpression", "DeleteListClick", "DeleteListCancelClick", "Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions$DeleteListCancelClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions$DeleteListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions$DeleteListImpression;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SharedListsActions implements Action {
    public final ListScreen d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions$DeleteListCancelClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteListCancelClick extends SharedListsActions {
        public final ListScreen e;
        public final Category f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteListCancelClick(ListScreen screen) {
            super(screen);
            Intrinsics.h(screen, "screen");
            this.e = screen;
            this.f = Category.m;
            this.g = "Cancel Delete";
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

        @Override // au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions
        /* renamed from: c, reason: from getter */
        public final ListScreen getD() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteListCancelClick) && Intrinsics.c(this.e, ((DeleteListCancelClick) obj).e);
        }

        @Override // au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "DeleteListCancelClick(screen=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions$DeleteListClick;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteListClick extends SharedListsActions {
        public final ListScreen e;
        public final Category f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteListClick(ListScreen screen) {
            super(screen);
            Intrinsics.h(screen, "screen");
            this.e = screen;
            this.f = Category.m;
            this.g = "Delete";
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

        @Override // au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions
        /* renamed from: c, reason: from getter */
        public final ListScreen getD() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteListClick) && Intrinsics.c(this.e, ((DeleteListClick) obj).e);
        }

        @Override // au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "DeleteListClick(screen=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions$DeleteListImpression;", "Lau/com/woolworths/shop/lists/ui/lists/analytics/SharedListsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteListImpression extends SharedListsActions {
        public final ListScreen e;
        public final Category f;
        public final String g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteListImpression(ListScreen screen) {
            super(screen);
            Intrinsics.h(screen, "screen");
            this.e = screen;
            this.f = Category.u;
            this.g = "Delete list";
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

        @Override // au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions
        /* renamed from: c, reason: from getter */
        public final ListScreen getD() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeleteListImpression) && Intrinsics.c(this.e, ((DeleteListImpression) obj).e);
        }

        @Override // au.com.woolworths.shop.lists.ui.lists.analytics.SharedListsActions, au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.e;
        }

        public final int hashCode() {
            return this.e.hashCode();
        }

        public final String toString() {
            return "DeleteListImpression(screen=" + this.e + ")";
        }
    }

    public SharedListsActions(ListScreen listScreen) {
        this.d = listScreen;
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: c, reason: from getter */
    public ListScreen getD() {
        return this.d;
    }
}
