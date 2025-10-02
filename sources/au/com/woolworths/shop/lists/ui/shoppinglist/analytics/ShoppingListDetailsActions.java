package au.com.woolworths.shop.lists.ui.shoppinglist.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.ListScreen;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:+\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,\u0082\u0001--./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXY¨\u0006Z"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "AddAllToCartClick", "AddFreeTextItemToListClick", "AddToCartClick", "AutoCheckOffDialog", "AutoCheckOffDialogContinueClick", "AutoCheckOffDialogSettingsClick", "BoostAllClick", "BoostAllSuccessSnackbar", "CartIconClick", "CheckFreetextItem", "CheckProductItem", "CheckProductItemSnackbar", "CopyToListClick", "DeleteFreetextItem", "DeleteListClick", "DeleteProductItem", "DuplicateListClick", "EditFreetextItem", "FreetextItemSearchClick", "FreetextProductSearchClick", "FreetextClearClick", "ListChangeClick", "ListItemDeletedSnackbarImpression", "ListOptionsBottomsheet", "ListSortingBottomsheet", "OverflowMenuClick", "ProductAddToCartFailureSnackbarImpression", "ProductAddToCartSuccessSnackbarImpression", "PullDownToRefreshList", "RemoveAllItemsCancelClick", "RemoveAllItemsClick", "RemoveAllItemsClickDialog", "RenameListClick", "SaveToWatchlistClick", "SaveToWatchlistSnackbarImpression", "SaveToWatchlistSnackbarViewAction", "ScanItemClick", "SearchIconClick", "SortingOptionClicked", "UpdateCartClick", "UpdateQuantityClick", "UncheckFreetextItem", "UncheckProductItem", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AddAllToCartClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AddFreeTextItemToListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AddToCartClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AutoCheckOffDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AutoCheckOffDialogContinueClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AutoCheckOffDialogSettingsClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$BoostAllClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$BoostAllSuccessSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CartIconClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CheckFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CheckProductItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CheckProductItemSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CopyToListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DeleteFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DeleteListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DeleteProductItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DuplicateListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$EditFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$FreetextClearClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$FreetextItemSearchClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$FreetextProductSearchClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListChangeClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListItemDeletedSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListOptionsBottomsheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListSortingBottomsheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$OverflowMenuClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ProductAddToCartFailureSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ProductAddToCartSuccessSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$PullDownToRefreshList;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RemoveAllItemsCancelClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RemoveAllItemsClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RemoveAllItemsClickDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RenameListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SaveToWatchlistClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SaveToWatchlistSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SaveToWatchlistSnackbarViewAction;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ScanItemClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SearchIconClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SortingOptionClicked;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UncheckFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UncheckProductItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UpdateCartClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UpdateQuantityClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions$ChangeShoppingModeDialogImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/SortByViewActions$ListDialogChangeModeClick;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ShoppingListDetailsActions implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AddAllToCartClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddAllToCartClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public AddAllToCartClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Add All To Cart";
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
            return (obj instanceof AddAllToCartClick) && Intrinsics.c(this.d, ((AddAllToCartClick) obj).d);
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
            return a.m("AddAllToCartClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AddFreeTextItemToListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddFreeTextItemToListClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public AddFreeTextItemToListClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.w;
            this.f = "add free text item to a list";
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
            return (obj instanceof AddFreeTextItemToListClick) && Intrinsics.c(this.d, ((AddFreeTextItemToListClick) obj).d);
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
            return a.m("AddFreeTextItemToListClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AddToCartClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddToCartClick extends ShoppingListDetailsActions {
        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return null;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AddToCartClick);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Screen getD() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "AddToCartClick(analyticsParams=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AutoCheckOffDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoCheckOffDialog extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public AutoCheckOffDialog(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.u;
            this.f = "auto check off list items";
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
            return (obj instanceof AutoCheckOffDialog) && Intrinsics.c(this.d, ((AutoCheckOffDialog) obj).d);
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
            return a.m("AutoCheckOffDialog(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AutoCheckOffDialogContinueClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoCheckOffDialogContinueClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public AutoCheckOffDialogContinueClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Continue";
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
            return (obj instanceof AutoCheckOffDialogContinueClick) && Intrinsics.c(this.d, ((AutoCheckOffDialogContinueClick) obj).d);
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
            return a.m("AutoCheckOffDialogContinueClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$AutoCheckOffDialogSettingsClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AutoCheckOffDialogSettingsClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public AutoCheckOffDialogSettingsClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "settings";
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
            return (obj instanceof AutoCheckOffDialogSettingsClick) && Intrinsics.c(this.d, ((AutoCheckOffDialogSettingsClick) obj).d);
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
            return a.m("AutoCheckOffDialogSettingsClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$BoostAllClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostAllClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final int e;
        public final Category f;
        public final ListScreen.ListDetails g;

        public BoostAllClick(ListDetailsAnalyticsParams analyticsParams, int i) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = i;
            this.f = Category.m;
            this.g = new ListScreen.ListDetails(analyticsParams);
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return this.e > 1 ? "Boost All" : "Activate Offer";
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
            if (!(obj instanceof BoostAllClick)) {
                return false;
            }
            BoostAllClick boostAllClick = (BoostAllClick) obj;
            return Intrinsics.c(this.d, boostAllClick.d) && this.e == boostAllClick.e;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "BoostAllClick(analyticsParams=" + this.d + ", numProductsToBoost=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$BoostAllSuccessSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostAllSuccessSnackbar extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public BoostAllSuccessSnackbar(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.g0;
            this.f = "your rewards offer has been boosted";
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
            return (obj instanceof BoostAllSuccessSnackbar) && Intrinsics.c(this.d, ((BoostAllSuccessSnackbar) obj).d);
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
            return a.m("BoostAllSuccessSnackbar(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CartIconClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartIconClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public CartIconClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Cart Open";
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
            return (obj instanceof CartIconClick) && Intrinsics.c(this.d, ((CartIconClick) obj).d);
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
            return a.m("CartIconClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CheckFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckFreetextItem extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public CheckFreetextItem(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.w;
            this.f = "Check Freetext Item from a list";
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
            return (obj instanceof CheckFreetextItem) && Intrinsics.c(this.d, ((CheckFreetextItem) obj).d);
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
            return a.m("CheckFreetextItem(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CheckProductItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckProductItem extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public CheckProductItem(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.S;
            this.f = "Check a Product from a list";
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
            return (obj instanceof CheckProductItem) && Intrinsics.c(this.d, ((CheckProductItem) obj).d);
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
            return a.m("CheckProductItem(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CheckProductItemSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckProductItemSnackbar extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public CheckProductItemSnackbar(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.g0;
            this.f = "product moved to checked items";
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
            return (obj instanceof CheckProductItemSnackbar) && Intrinsics.c(this.d, ((CheckProductItemSnackbar) obj).d);
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
            return a.m("CheckProductItemSnackbar(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$CopyToListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CopyToListClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public CopyToListClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Copy to list";
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
            return (obj instanceof CopyToListClick) && Intrinsics.c(this.d, ((CopyToListClick) obj).d);
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
            return a.m("CopyToListClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DeleteFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteFreetextItem extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public DeleteFreetextItem(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.x;
            this.f = "Delete Freetext Item from a list";
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
            return (obj instanceof DeleteFreetextItem) && Intrinsics.c(this.d, ((DeleteFreetextItem) obj).d);
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
            return a.m("DeleteFreetextItem(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DeleteListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteListClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public DeleteListClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Delete";
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
            return (obj instanceof DeleteListClick) && Intrinsics.c(this.d, ((DeleteListClick) obj).d);
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
            return a.m("DeleteListClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DeleteProductItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeleteProductItem extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public DeleteProductItem(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.T;
            this.f = "Delete a product from a list";
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
            return (obj instanceof DeleteProductItem) && Intrinsics.c(this.d, ((DeleteProductItem) obj).d);
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
            return a.m("DeleteProductItem(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$DuplicateListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DuplicateListClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public DuplicateListClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Duplicate list";
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
            return (obj instanceof DuplicateListClick) && Intrinsics.c(this.d, ((DuplicateListClick) obj).d);
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
            return a.m("DuplicateListClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$EditFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditFreetextItem extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public EditFreetextItem(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.w;
            this.f = "Edit Freetext Item in a list";
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
            return (obj instanceof EditFreetextItem) && Intrinsics.c(this.d, ((EditFreetextItem) obj).d);
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
            return a.m("EditFreetextItem(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$FreetextClearClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FreetextClearClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public FreetextClearClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.w;
            this.f = "Delete";
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
            return (obj instanceof FreetextClearClick) && Intrinsics.c(this.d, ((FreetextClearClick) obj).d);
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
            return a.m("FreetextClearClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$FreetextItemSearchClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FreetextItemSearchClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public FreetextItemSearchClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.w;
            this.f = "search a freetext item from a list";
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
            return (obj instanceof FreetextItemSearchClick) && Intrinsics.c(this.d, ((FreetextItemSearchClick) obj).d);
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
            return a.m("FreetextItemSearchClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$FreetextProductSearchClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FreetextProductSearchClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public FreetextProductSearchClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.w;
            this.f = "Search for products";
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
            return (obj instanceof FreetextProductSearchClick) && Intrinsics.c(this.d, ((FreetextProductSearchClick) obj).d);
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
            return a.m("FreetextProductSearchClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListChangeClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListChangeClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ListChangeClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "change list";
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
            return (obj instanceof ListChangeClick) && Intrinsics.c(this.d, ((ListChangeClick) obj).d);
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
            return a.m("ListChangeClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListItemDeletedSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListItemDeletedSnackbarImpression extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ListItemDeletedSnackbarImpression(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.g0;
            this.f = "item removed from list";
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
            return (obj instanceof ListItemDeletedSnackbarImpression) && Intrinsics.c(this.d, ((ListItemDeletedSnackbarImpression) obj).d);
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
            return a.m("ListItemDeletedSnackbarImpression(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListOptionsBottomsheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListOptionsBottomsheet extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ListOptionsBottomsheet(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.k;
            this.f = "List Options";
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
            return (obj instanceof ListOptionsBottomsheet) && Intrinsics.c(this.d, ((ListOptionsBottomsheet) obj).d);
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
            return a.m("ListOptionsBottomsheet(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ListSortingBottomsheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListSortingBottomsheet extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ListSortingBottomsheet(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.k;
            this.f = "List Sorting";
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
            return (obj instanceof ListSortingBottomsheet) && Intrinsics.c(this.d, ((ListSortingBottomsheet) obj).d);
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
            return a.m("ListSortingBottomsheet(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$OverflowMenuClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OverflowMenuClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public OverflowMenuClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Overflow Menu";
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
            return (obj instanceof OverflowMenuClick) && Intrinsics.c(this.d, ((OverflowMenuClick) obj).d);
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
            return a.m("OverflowMenuClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ProductAddToCartFailureSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductAddToCartFailureSnackbarImpression extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ProductAddToCartFailureSnackbarImpression(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.g0;
            this.f = "unable to add products to cart";
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
            return (obj instanceof ProductAddToCartFailureSnackbarImpression) && Intrinsics.c(this.d, ((ProductAddToCartFailureSnackbarImpression) obj).d);
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
            return a.m("ProductAddToCartFailureSnackbarImpression(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ProductAddToCartSuccessSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductAddToCartSuccessSnackbarImpression extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ProductAddToCartSuccessSnackbarImpression(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.g0;
            this.f = "product added to cart";
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
            return (obj instanceof ProductAddToCartSuccessSnackbarImpression) && Intrinsics.c(this.d, ((ProductAddToCartSuccessSnackbarImpression) obj).d);
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
            return a.m("ProductAddToCartSuccessSnackbarImpression(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$PullDownToRefreshList;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PullDownToRefreshList extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public PullDownToRefreshList(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.a0;
            this.f = "Pull to Refresh";
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
            return (obj instanceof PullDownToRefreshList) && Intrinsics.c(this.d, ((PullDownToRefreshList) obj).d);
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
            return a.m("PullDownToRefreshList(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RemoveAllItemsCancelClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveAllItemsCancelClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public RemoveAllItemsCancelClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Cancel Remove All Items";
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
            return (obj instanceof RemoveAllItemsCancelClick) && Intrinsics.c(this.d, ((RemoveAllItemsCancelClick) obj).d);
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
            return a.m("RemoveAllItemsCancelClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RemoveAllItemsClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveAllItemsClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public RemoveAllItemsClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Remove All Items";
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
            return (obj instanceof RemoveAllItemsClick) && Intrinsics.c(this.d, ((RemoveAllItemsClick) obj).d);
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
            return a.m("RemoveAllItemsClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RemoveAllItemsClickDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveAllItemsClickDialog extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public RemoveAllItemsClickDialog(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.u;
            this.f = "Remove All Items";
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
            return (obj instanceof RemoveAllItemsClickDialog) && Intrinsics.c(this.d, ((RemoveAllItemsClickDialog) obj).d);
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
            return a.m("RemoveAllItemsClickDialog(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$RenameListClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RenameListClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public RenameListClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Name & appearance";
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
            return (obj instanceof RenameListClick) && Intrinsics.c(this.d, ((RenameListClick) obj).d);
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
            return a.m("RenameListClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SaveToWatchlistClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToWatchlistClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public SaveToWatchlistClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m0;
            this.f = "save to watchlist";
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
            return (obj instanceof SaveToWatchlistClick) && Intrinsics.c(this.d, ((SaveToWatchlistClick) obj).d);
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
            return a.m("SaveToWatchlistClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SaveToWatchlistSnackbarImpression;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToWatchlistSnackbarImpression extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final String e;
        public final Category f;
        public final ListScreen.ListDetails g;

        public SaveToWatchlistSnackbarImpression(ListDetailsAnalyticsParams analyticsParams, String str) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = str;
            this.f = Category.n0;
            this.g = new ListScreen.ListDetails(analyticsParams);
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getF() {
            return this.e;
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
            if (!(obj instanceof SaveToWatchlistSnackbarImpression)) {
                return false;
            }
            SaveToWatchlistSnackbarImpression saveToWatchlistSnackbarImpression = (SaveToWatchlistSnackbarImpression) obj;
            return Intrinsics.c(this.d, saveToWatchlistSnackbarImpression.d) && Intrinsics.c(this.e, saveToWatchlistSnackbarImpression.e);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return this.g;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "SaveToWatchlistSnackbarImpression(analyticsParams=" + this.d + ", label=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SaveToWatchlistSnackbarViewAction;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SaveToWatchlistSnackbarViewAction extends ShoppingListDetailsActions {
        public static final SaveToWatchlistSnackbarViewAction d = new SaveToWatchlistSnackbarViewAction();
        public static final Category e = Category.m0;
        public static final ListScreen.ListDetails f = new ListScreen.ListDetails(new ListDetailsAnalyticsParams(ListsAnalyticsAppSection.e, false));

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return "view list";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return e;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SaveToWatchlistSnackbarViewAction);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getD() {
            return f;
        }

        public final int hashCode() {
            return -1835165118;
        }

        public final String toString() {
            return "SaveToWatchlistSnackbarViewAction";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$ScanItemClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ScanItemClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public ScanItemClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "scan an item";
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
            return (obj instanceof ScanItemClick) && Intrinsics.c(this.d, ((ScanItemClick) obj).d);
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
            return a.m("ScanItemClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SearchIconClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SearchIconClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public SearchIconClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Tap Search Icon";
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
            return (obj instanceof SearchIconClick) && Intrinsics.c(this.d, ((SearchIconClick) obj).d);
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
            return a.m("SearchIconClick(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$SortingOptionClicked;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortingOptionClicked extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public SortingOptionClicked(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.j;
            this.f = "Choose Sort Option - Done";
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
            return (obj instanceof SortingOptionClicked) && Intrinsics.c(this.d, ((SortingOptionClicked) obj).d);
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
            return a.m("SortingOptionClicked(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UncheckFreetextItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UncheckFreetextItem extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public UncheckFreetextItem(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.w;
            this.f = "Uncheck Freetext Item from a list";
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
            return (obj instanceof UncheckFreetextItem) && Intrinsics.c(this.d, ((UncheckFreetextItem) obj).d);
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
            return a.m("UncheckFreetextItem(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UncheckProductItem;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UncheckProductItem extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public UncheckProductItem(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.S;
            this.f = "Uncheck a Product from a list";
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
            return (obj instanceof UncheckProductItem) && Intrinsics.c(this.d, ((UncheckProductItem) obj).d);
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
            return a.m("UncheckProductItem(analyticsParams=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UpdateCartClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateCartClick extends ShoppingListDetailsActions {
        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getF() {
            return null;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof UpdateCartClick);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final /* bridge */ /* synthetic */ Screen getD() {
            return null;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "UpdateCartClick(analyticsParams=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions$UpdateQuantityClick;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/analytics/ShoppingListDetailsActions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateQuantityClick extends ShoppingListDetailsActions {
        public final ListDetailsAnalyticsParams d;
        public final Category e;
        public final String f;
        public final ListScreen.ListDetails g;

        public UpdateQuantityClick(ListDetailsAnalyticsParams analyticsParams) {
            Intrinsics.h(analyticsParams, "analyticsParams");
            this.d = analyticsParams;
            this.e = Category.m;
            this.f = "Update quantity";
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
            return (obj instanceof UpdateQuantityClick) && Intrinsics.c(this.d, ((UpdateQuantityClick) obj).d);
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
            return a.m("UpdateQuantityClick(analyticsParams=", this.d, ")");
        }
    }
}
