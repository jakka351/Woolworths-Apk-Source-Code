package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract;", "", "Actions", "ViewState", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface AddToListBottomSheetContract {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "", "QuantityCarouselAccessibilityClicked", "AddToListSuccess", "UpdateListItemSuccess", "RemoveListItemSuccess", "LaunchCreateShoppingListActivity", "ShowSnackbar", "DisplayOverlayView", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$AddToListSuccess;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$DisplayOverlayView;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$LaunchCreateShoppingListActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$QuantityCarouselAccessibilityClicked;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$RemoveListItemSuccess;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$UpdateListItemSuccess;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$AddToListSuccess;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AddToListSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ListChangeEvent.AddToListSuccessEvent f10106a;

            public AddToListSuccess(ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent) {
                this.f10106a = addToListSuccessEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddToListSuccess) && this.f10106a.equals(((AddToListSuccess) obj).f10106a);
            }

            public final int hashCode() {
                return this.f10106a.hashCode();
            }

            public final String toString() {
                return "AddToListSuccess(listChangeEvent=" + this.f10106a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$DisplayOverlayView;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DisplayOverlayView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DisplayOverlayView f10107a = new DisplayOverlayView();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$LaunchCreateShoppingListActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchCreateShoppingListActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCreateShoppingListActivity f10108a = new LaunchCreateShoppingListActivity();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$QuantityCarouselAccessibilityClicked;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class QuantityCarouselAccessibilityClicked extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final QuantityCarouselAccessibilityClicked f10109a = new QuantityCarouselAccessibilityClicked();
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$RemoveListItemSuccess;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RemoveListItemSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ListChangeEvent.RemoveFromListSuccessEvent f10110a;

            public RemoveListItemSuccess(ListChangeEvent.RemoveFromListSuccessEvent removeFromListSuccessEvent) {
                this.f10110a = removeFromListSuccessEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RemoveListItemSuccess) && this.f10110a.equals(((RemoveListItemSuccess) obj).f10110a);
            }

            public final int hashCode() {
                return this.f10110a.d.hashCode();
            }

            public final String toString() {
                return "RemoveListItemSuccess(listChangeEvent=" + this.f10110a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f10111a;

            public ShowSnackbar(Text text) {
                this.f10111a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbar) && Intrinsics.c(this.f10111a, ((ShowSnackbar) obj).f10111a);
            }

            public final int hashCode() {
                return this.f10111a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowSnackbar(text=", this.f10111a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions$UpdateListItemSuccess;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$Actions;", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class UpdateListItemSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductListItem f10112a;

            public UpdateListItemSuccess(ProductListItem updatedListItem) {
                Intrinsics.h(updatedListItem, "updatedListItem");
                this.f10112a = updatedListItem;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof UpdateListItemSuccess) && Intrinsics.c(this.f10112a, ((UpdateListItemSuccess) obj).f10112a);
            }

            public final int hashCode() {
                return this.f10112a.hashCode();
            }

            public final String toString() {
                return "UpdateListItemSuccess(updatedListItem=" + this.f10112a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetContract$ViewState;", "", "shop-add-to-list_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final Text f10113a;
        public final List b;
        public final int c;
        public final int d;
        public final String e;
        public final boolean f;
        public final String g;
        public final AddToListMode h;

        public ViewState(Text text, List shoppingLists, int i, int i2, String str, boolean z, String str2, AddToListMode addToListMode) {
            Intrinsics.h(shoppingLists, "shoppingLists");
            Intrinsics.h(addToListMode, "addToListMode");
            this.f10113a = text;
            this.b = shoppingLists;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = z;
            this.g = str2;
            this.h = addToListMode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f10113a, viewState.f10113a) && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && this.d == viewState.d && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f && Intrinsics.c(this.g, viewState.g) && this.h == viewState.h;
        }

        public final int hashCode() {
            Text text = this.f10113a;
            int iA = androidx.camera.core.impl.b.a(this.d, androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.d((text == null ? 0 : text.hashCode()) * 31, 31, this.b), 31), 31);
            String str = this.e;
            int iE = androidx.camera.core.impl.b.e((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
            String str2 = this.g;
            return this.h.hashCode() + ((iE + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(title=");
            sb.append(this.f10113a);
            sb.append(", shoppingLists=");
            sb.append(this.b);
            sb.append(", selectedQuantityIndex=");
            YU.a.w(this.c, this.d, ", initialQuantityIndex=", ", copyFromListId=", sb);
            d.A(this.e, ", displayQuantitySelector=", ", shoppingListIdBeingSaved=", sb, this.f);
            sb.append(this.g);
            sb.append(", addToListMode=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }
}
