package au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetContract;", "", "ViewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SortByBottomSheetContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/sortbottomsheet/SortByBottomSheetContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final SortBy f12446a;

        public ViewState(SortBy sortBy) {
            this.f12446a = sortBy;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f12446a == ((ViewState) obj).f12446a;
        }

        public final int hashCode() {
            return this.f12446a.hashCode();
        }

        public final String toString() {
            return "ViewState(currentSortBy=" + this.f12446a + ")";
        }
    }
}
