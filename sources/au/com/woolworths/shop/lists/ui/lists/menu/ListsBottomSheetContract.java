package au.com.woolworths.shop.lists.ui.lists.menu;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetContract;", "", "ViewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ListsBottomSheetContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/menu/ListsBottomSheetContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final List f12327a;
        public final ShoppingListWithItems b;

        public ViewState(List list) {
            this.f12327a = list;
            this.b = null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f12327a, viewState.f12327a) && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            int iHashCode = this.f12327a.hashCode() * 31;
            ShoppingListWithItems shoppingListWithItems = this.b;
            return iHashCode + (shoppingListWithItems == null ? 0 : shoppingListWithItems.hashCode());
        }

        public final String toString() {
            return "ViewState(menuItems=" + this.f12327a + ", shoppingListWithItems=" + this.b + ")";
        }

        public ViewState(List list, ShoppingListWithItems shoppingListWithItems) {
            this.f12327a = list;
            this.b = shoppingListWithItems;
        }
    }
}
