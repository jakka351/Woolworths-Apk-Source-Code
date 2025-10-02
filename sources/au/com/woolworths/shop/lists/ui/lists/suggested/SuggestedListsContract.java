package au.com.woolworths.shop.lists.ui.lists.suggested;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.errors.SuggestedListsFullPageError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsContract;", "", "Actions", "ViewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SuggestedListsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsContract$Actions;", "", "LaunchSuggestedList", "Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsContract$Actions$LaunchSuggestedList;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsContract$Actions$LaunchSuggestedList;", "Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSuggestedList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final SuggestedListItem f12349a;

            public LaunchSuggestedList(SuggestedListItem item) {
                Intrinsics.h(item, "item");
                this.f12349a = item;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSuggestedList) && Intrinsics.c(this.f12349a, ((LaunchSuggestedList) obj).f12349a);
            }

            public final int hashCode() {
                return this.f12349a.hashCode();
            }

            public final String toString() {
                return "LaunchSuggestedList(item=" + this.f12349a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/suggested/SuggestedListsContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12350a;
        public final SuggestedListsFullPageError b;

        public ViewState(boolean z, SuggestedListsFullPageError suggestedListsFullPageError) {
            this.f12350a = z;
            this.b = suggestedListsFullPageError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12350a == viewState.f12350a && this.b == viewState.b;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f12350a) * 31;
            SuggestedListsFullPageError suggestedListsFullPageError = this.b;
            return iHashCode + (suggestedListsFullPageError == null ? 0 : suggestedListsFullPageError.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f12350a + ", errorState=" + this.b + ")";
        }
    }
}
