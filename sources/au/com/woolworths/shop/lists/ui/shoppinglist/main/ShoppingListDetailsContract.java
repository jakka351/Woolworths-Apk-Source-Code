package au.com.woolworths.shop.lists.ui.shoppinglist.main;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.graphql.type.AlternativeProductsMode;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ProductItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListDetailsUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.ShoppingListItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.models.TextItemUiModel;
import au.com.woolworths.shop.lists.ui.shoppinglist.utils.TrolleyResultWithMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract;", "", "IShoppingListDetailsViewModel", "Actions", "ViewState", "ListState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ShoppingListDetailsContract {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$IShoppingListDetailsViewModel;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface IShoppingListDetailsViewModel {
        void A5();

        void B(ProductItemUiModel productItemUiModel);

        void C(View view, ProductItemUiModel productItemUiModel);

        void C5(TextItemUiModel textItemUiModel, boolean z);

        void D(String str, boolean z);

        CoroutineScope D1();

        void F(ProductItemUiModel productItemUiModel);

        StateFlow G();

        void G1();

        void H();

        boolean H5();

        ShoppingListProductItemState I0();

        void I2(ShoppingListItemUiModel shoppingListItemUiModel);

        void J();

        void J4(ProductCard productCard);

        void K();

        void L();

        void L2(ProductItemUiModel productItemUiModel, boolean z);

        void M(ProductCard productCard);

        void O1(ProductItemUiModel productItemUiModel);

        void P0();

        void P5();

        void R1(boolean z);

        ListScreen S0();

        void T5(boolean z);

        void V2();

        void V5();

        void W();

        void W0(ShoppingListItemUiModel shoppingListItemUiModel);

        void X();

        void Y2();

        void Z1();

        void b();

        void b0(String str, boolean z);

        void b1(TextItemUiModel textItemUiModel, String str);

        void b6(ShoppingListItemUiModel shoppingListItemUiModel);

        void c0();

        void c5();

        Flow d0();

        void e(ProductCard productCard);

        void e0(ShoppingListItemUiModel shoppingListItemUiModel);

        void i(String str, boolean z);

        void k(TextItemUiModel textItemUiModel, boolean z);

        void l(String str);

        void l3();

        void n(TextItemUiModel textItemUiModel);

        void n5(ProductItemUiModel productItemUiModel);

        void o();

        void o4(List list);

        void p5();

        void q2();

        void s1();

        void s3(ShoppingListItemUiModel shoppingListItemUiModel);

        void t0();

        void t1();

        void t3();

        void u(String str);

        ListDetailsAnalyticsParams u0();

        void v(ProductItemUiModel productItemUiModel);

        void v5();

        void w0(ShoppingList shoppingList);

        void w2();

        void w4(ProductItemUiModel productItemUiModel);

        void y();

        void y4(ShoppingListItemUiModel shoppingListItemUiModel);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$ListState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ListState {

        /* renamed from: a, reason: collision with root package name */
        public final List f12427a;
        public final List b;
        public final List c;
        public final List d;

        public ListState(List list, List list2, List list3, List list4) {
            this.f12427a = list;
            this.b = list2;
            this.c = list3;
            this.d = list4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ListState)) {
                return false;
            }
            ListState listState = (ListState) obj;
            return Intrinsics.c(this.f12427a, listState.f12427a) && Intrinsics.c(this.b, listState.b) && Intrinsics.c(this.c, listState.c) && Intrinsics.c(this.d, listState.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d(this.f12427a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "ListState(uncheckedTextItems=" + this.f12427a + ", uncheckedProductItems=" + this.b + ", checkedTextItems=" + this.c + ", checkedProductItems=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final ShoppingListDetailsUiModel f12428a;
        public final TextItemUiModel b;
        public final ListState c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final List g;
        public final BoostAllBannerState h;
        public final ResText i;
        public final boolean j;
        public final List k;

        public ViewState(ShoppingListDetailsUiModel shoppingListDetailsUiModel, TextItemUiModel textItemUiModel, ListState listState, boolean z, boolean z2, boolean z3, List productsWithUpdatedOfferInfo, BoostAllBannerState boostAllBannerState, ResText scanButtonText, boolean z4, List updatedItemIds) {
            Intrinsics.h(productsWithUpdatedOfferInfo, "productsWithUpdatedOfferInfo");
            Intrinsics.h(boostAllBannerState, "boostAllBannerState");
            Intrinsics.h(scanButtonText, "scanButtonText");
            Intrinsics.h(updatedItemIds, "updatedItemIds");
            this.f12428a = shoppingListDetailsUiModel;
            this.b = textItemUiModel;
            this.c = listState;
            this.d = z;
            this.e = z2;
            this.f = z3;
            this.g = productsWithUpdatedOfferInfo;
            this.h = boostAllBannerState;
            this.i = scanButtonText;
            this.j = z4;
            this.k = updatedItemIds;
        }

        public final boolean a() {
            ShoppingListDetailsUiModel shoppingListDetailsUiModel;
            return this.b == null && (shoppingListDetailsUiModel = this.f12428a) != null && shoppingListDetailsUiModel.b() == 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f12428a, viewState.f12428a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && this.e == viewState.e && this.f == viewState.f && Intrinsics.c(this.g, viewState.g) && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i) && this.j == viewState.j && Intrinsics.c(this.k, viewState.k);
        }

        public final int hashCode() {
            ShoppingListDetailsUiModel shoppingListDetailsUiModel = this.f12428a;
            int iHashCode = (shoppingListDetailsUiModel == null ? 0 : shoppingListDetailsUiModel.hashCode()) * 31;
            TextItemUiModel textItemUiModel = this.b;
            int iHashCode2 = (iHashCode + (textItemUiModel == null ? 0 : textItemUiModel.hashCode())) * 31;
            ListState listState = this.c;
            return this.k.hashCode() + androidx.camera.core.impl.b.e((this.i.hashCode() + ((this.h.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((iHashCode2 + (listState != null ? listState.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31)) * 31, 31, this.j);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(shoppingListUiModel=");
            sb.append(this.f12428a);
            sb.append(", editedTextItemUiModel=");
            sb.append(this.b);
            sb.append(", listState=");
            sb.append(this.c);
            sb.append(", showCheckedItems=");
            sb.append(this.d);
            sb.append(", isRefreshing=");
            au.com.woolworths.android.onesite.a.D(sb, this.e, ", canCopyToList=", this.f, ", productsWithUpdatedOfferInfo=");
            sb.append(this.g);
            sb.append(", boostAllBannerState=");
            sb.append(this.h);
            sb.append(", scanButtonText=");
            sb.append(this.i);
            sb.append(", showTobaccoWarningBanner=");
            sb.append(this.j);
            sb.append(", updatedItemIds=");
            return android.support.v4.media.session.a.t(sb, this.k, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b+\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:+\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,\u0082\u0001+-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVW¨\u0006X"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "", "CloseScreen", "LaunchProductDetailActivity", "ShowQuantityDialog", "ShowProductItemOptionsMenu", "CopyToList", "ViewSimilarItems", "TextItemFocusChanged", "DisplayProductCoachMark", "DisplaySortByCoachMark", "ShowUncheckCheckedItemsDialog", "ShowDeleteCheckedItemsDialog", "ShowAddToCartWarning", "DismissSoftKeyboard", "ShowSngCheckOffDialog", "ScrollToTop", "ListChangeRequest", "DisplayScanner", "LaunchDuplicateShoppingListActivity", "LaunchSearchActivity", "LaunchSngSearchActivity", "LaunchListOptionsMenu", "LaunchEditList", "LaunchDeleteListConfirmation", "LaunchRemoveAllConfirmation", "LaunchSngCart", "LaunchSngSettings", "ListRefreshDone", "ShowSnackbar", "ShowItemDeletedSnackbar", "ShowCheckProductItemsSnackbar", "ShowBoostAllSuccessSnackbar", "ShowAddToCartResultSnackbar", "ShowMaxListCountReachedErrorDialog", "OnListItemSoftDeleted", "LaunchAvailabilityMessageBottomSheet", "LaunchProductSearch", "AddToListSuccess", "LaunchInStoreMapActivity", "LaunchDeepLink", "ShowSnapAListBottomSheet", "LaunchSnapAListGuestOnboardingScreen", "LaunchWatchlistGuestOnboardingScreen", "LaunchMagicMatchScreen", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$AddToListSuccess;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$CloseScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$CopyToList;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DismissSoftKeyboard;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DisplayProductCoachMark;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DisplayScanner;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DisplaySortByCoachMark;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchAvailabilityMessageBottomSheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchDeleteListConfirmation;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchDuplicateShoppingListActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchEditList;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchInStoreMapActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchListOptionsMenu;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchMagicMatchScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchProductDetailActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchProductSearch;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchRemoveAllConfirmation;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSearchActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSnapAListGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSngCart;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSngSearchActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSngSettings;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ListChangeRequest;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ListRefreshDone;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$OnListItemSoftDeleted;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ScrollToTop;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowAddToCartResultSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowAddToCartWarning;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowBoostAllSuccessSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowCheckProductItemsSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowDeleteCheckedItemsDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowItemDeletedSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowMaxListCountReachedErrorDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowProductItemOptionsMenu;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowQuantityDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowSnapAListBottomSheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowSngCheckOffDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowUncheckCheckedItemsDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$TextItemFocusChanged;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ViewSimilarItems;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$AddToListSuccess;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class AddToListSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ListChangeEvent.AddToListSuccessEvent f12385a;

            public AddToListSuccess(ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent) {
                this.f12385a = addToListSuccessEvent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddToListSuccess) && this.f12385a.equals(((AddToListSuccess) obj).f12385a);
            }

            public final int hashCode() {
                return this.f12385a.hashCode();
            }

            public final String toString() {
                return "AddToListSuccess(listChangeEvent=" + this.f12385a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$CloseScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f12386a;
            public final boolean b;

            public CloseScreen(ResWithArgText resWithArgText, boolean z) {
                this.f12386a = resWithArgText;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CloseScreen)) {
                    return false;
                }
                CloseScreen closeScreen = (CloseScreen) obj;
                return Intrinsics.c(this.f12386a, closeScreen.f12386a) && this.b == closeScreen.b;
            }

            public final int hashCode() {
                Text text = this.f12386a;
                return Boolean.hashCode(this.b) + ((text == null ? 0 : text.hashCode()) * 31);
            }

            public final String toString() {
                return "CloseScreen(text=" + this.f12386a + ", listNotFound=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$CopyToList;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CopyToList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f12387a;
            public final ProductItemUiModel b;

            public CopyToList(ProductItemUiModel uiModel, String str) {
                Intrinsics.h(uiModel, "uiModel");
                this.f12387a = str;
                this.b = uiModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CopyToList)) {
                    return false;
                }
                CopyToList copyToList = (CopyToList) obj;
                return Intrinsics.c(this.f12387a, copyToList.f12387a) && Intrinsics.c(this.b, copyToList.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12387a.hashCode() * 31);
            }

            public final String toString() {
                return "CopyToList(listId=" + this.f12387a + ", uiModel=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DismissSoftKeyboard;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DismissSoftKeyboard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissSoftKeyboard f12388a = new DismissSoftKeyboard();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DismissSoftKeyboard);
            }

            public final int hashCode() {
                return -19511481;
            }

            public final String toString() {
                return "DismissSoftKeyboard";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DisplayProductCoachMark;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayProductCoachMark extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12389a;
            public final ResText b;
            public final ResText c;

            public DisplayProductCoachMark(ResText resText, ResText resText2, ResText resText3) {
                this.f12389a = resText;
                this.b = resText2;
                this.c = resText3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplayProductCoachMark)) {
                    return false;
                }
                DisplayProductCoachMark displayProductCoachMark = (DisplayProductCoachMark) obj;
                return this.f12389a.equals(displayProductCoachMark.f12389a) && this.b.equals(displayProductCoachMark.b) && this.c.equals(displayProductCoachMark.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.f12389a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "DisplayProductCoachMark(title=" + this.f12389a + ", body=" + this.b + ", cta=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DisplayScanner;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplayScanner extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DisplayScanner f12390a = new DisplayScanner();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DisplayScanner);
            }

            public final int hashCode() {
                return 972162544;
            }

            public final String toString() {
                return "DisplayScanner";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$DisplaySortByCoachMark;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DisplaySortByCoachMark extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12391a;
            public final ResText b;
            public final ResText c;

            public DisplaySortByCoachMark(ResText resText, ResText resText2, ResText resText3) {
                this.f12391a = resText;
                this.b = resText2;
                this.c = resText3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof DisplaySortByCoachMark)) {
                    return false;
                }
                DisplaySortByCoachMark displaySortByCoachMark = (DisplaySortByCoachMark) obj;
                return this.f12391a.equals(displaySortByCoachMark.f12391a) && this.b.equals(displaySortByCoachMark.b) && this.c.equals(displaySortByCoachMark.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.f12391a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "DisplaySortByCoachMark(title=" + this.f12391a + ", body=" + this.b + ", cta=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchAvailabilityMessageBottomSheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAvailabilityMessageBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12392a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchAvailabilityMessageBottomSheet(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f12392a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchAvailabilityMessageBottomSheet) && Intrinsics.c(this.f12392a, ((LaunchAvailabilityMessageBottomSheet) obj).f12392a);
            }

            public final int hashCode() {
                return this.f12392a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchAvailabilityMessageBottomSheet(product=", this.f12392a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchDeepLink);
            }

            public final int hashCode() {
                return -318443785;
            }

            public final String toString() {
                return "LaunchDeepLink(deepLink=com.woolworths.shop://specials)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchDeleteListConfirmation;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeleteListConfirmation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingList f12393a;

            public LaunchDeleteListConfirmation(ShoppingList shoppingList) {
                Intrinsics.h(shoppingList, "shoppingList");
                this.f12393a = shoppingList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeleteListConfirmation) && Intrinsics.c(this.f12393a, ((LaunchDeleteListConfirmation) obj).f12393a);
            }

            public final int hashCode() {
                return this.f12393a.hashCode();
            }

            public final String toString() {
                return "LaunchDeleteListConfirmation(shoppingList=" + this.f12393a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchDuplicateShoppingListActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDuplicateShoppingListActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingList f12394a;

            public LaunchDuplicateShoppingListActivity(ShoppingList list) {
                Intrinsics.h(list, "list");
                this.f12394a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDuplicateShoppingListActivity) && Intrinsics.c(this.f12394a, ((LaunchDuplicateShoppingListActivity) obj).f12394a);
            }

            public final int hashCode() {
                return this.f12394a.hashCode();
            }

            public final String toString() {
                return "LaunchDuplicateShoppingListActivity(list=" + this.f12394a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchEditList;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchEditList extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f12395a;

            public LaunchEditList(String listId) {
                Intrinsics.h(listId, "listId");
                this.f12395a = listId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchEditList) && Intrinsics.c(this.f12395a, ((LaunchEditList) obj).f12395a);
            }

            public final int hashCode() {
                return this.f12395a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchEditList(listId=", this.f12395a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchInStoreMapActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchInStoreMapActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12396a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchInStoreMapActivity(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f12396a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchInStoreMapActivity) && Intrinsics.c(this.f12396a, ((LaunchInStoreMapActivity) obj).f12396a);
            }

            public final int hashCode() {
                return this.f12396a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchInStoreMapActivity(product=", this.f12396a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchListOptionsMenu;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchListOptionsMenu extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingList f12397a;

            public LaunchListOptionsMenu(ShoppingList shoppingList) {
                Intrinsics.h(shoppingList, "shoppingList");
                this.f12397a = shoppingList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchListOptionsMenu) && Intrinsics.c(this.f12397a, ((LaunchListOptionsMenu) obj).f12397a);
            }

            public final int hashCode() {
                return this.f12397a.hashCode();
            }

            public final String toString() {
                return "LaunchListOptionsMenu(shoppingList=" + this.f12397a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchMagicMatchScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchMagicMatchScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f12398a;

            public LaunchMagicMatchScreen(String str) {
                this.f12398a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchMagicMatchScreen) && Intrinsics.c(this.f12398a, ((LaunchMagicMatchScreen) obj).f12398a);
            }

            public final int hashCode() {
                return this.f12398a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchMagicMatchScreen(listId=", this.f12398a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchProductDetailActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductDetailActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductCard f12399a;

            static {
                int i = ProductCard.$stable;
            }

            public LaunchProductDetailActivity(ProductCard product) {
                Intrinsics.h(product, "product");
                this.f12399a = product;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchProductDetailActivity) && Intrinsics.c(this.f12399a, ((LaunchProductDetailActivity) obj).f12399a);
            }

            public final int hashCode() {
                return this.f12399a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.n("LaunchProductDetailActivity(product=", this.f12399a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchProductSearch;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchProductSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f12400a;
            public final String b;

            public LaunchProductSearch(String searchTerm, String str) {
                Intrinsics.h(searchTerm, "searchTerm");
                this.f12400a = searchTerm;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchProductSearch)) {
                    return false;
                }
                LaunchProductSearch launchProductSearch = (LaunchProductSearch) obj;
                return Intrinsics.c(this.f12400a, launchProductSearch.f12400a) && Intrinsics.c(this.b, launchProductSearch.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12400a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("LaunchProductSearch(searchTerm=", this.f12400a, ", originatingListId=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchRemoveAllConfirmation;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRemoveAllConfirmation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingList f12401a;

            public LaunchRemoveAllConfirmation(ShoppingList shoppingList) {
                Intrinsics.h(shoppingList, "shoppingList");
                this.f12401a = shoppingList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRemoveAllConfirmation) && Intrinsics.c(this.f12401a, ((LaunchRemoveAllConfirmation) obj).f12401a);
            }

            public final int hashCode() {
                return this.f12401a.hashCode();
            }

            public final String toString() {
                return "LaunchRemoveAllConfirmation(shoppingList=" + this.f12401a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSearchActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSearchActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSearchActivity f12402a = new LaunchSearchActivity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSearchActivity);
            }

            public final int hashCode() {
                return 33193854;
            }

            public final String toString() {
                return "LaunchSearchActivity";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSnapAListGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnapAListGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSnapAListGuestOnboardingScreen f12403a = new LaunchSnapAListGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSnapAListGuestOnboardingScreen);
            }

            public final int hashCode() {
                return 36753681;
            }

            public final String toString() {
                return "LaunchSnapAListGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSngCart;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSngCart extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSngCart f12404a = new LaunchSngCart();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSngCart);
            }

            public final int hashCode() {
                return 1437256165;
            }

            public final String toString() {
                return "LaunchSngCart";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSngSearchActivity;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSngSearchActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSngSearchActivity f12405a = new LaunchSngSearchActivity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSngSearchActivity);
            }

            public final int hashCode() {
                return 180679004;
            }

            public final String toString() {
                return "LaunchSngSearchActivity";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchSngSettings;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSngSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSngSettings f12406a = new LaunchSngSettings();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSngSettings);
            }

            public final int hashCode() {
                return -486530968;
            }

            public final String toString() {
                return "LaunchSngSettings";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f12407a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return -1335893735;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ListChangeRequest;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ListChangeRequest extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ListChangeRequest f12408a = new ListChangeRequest();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ListChangeRequest);
            }

            public final int hashCode() {
                return 573376813;
            }

            public final String toString() {
                return "ListChangeRequest";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ListRefreshDone;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ListRefreshDone extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingListDetailsUiModel f12409a;

            public ListRefreshDone(ShoppingListDetailsUiModel listDetailsUiModel) {
                Intrinsics.h(listDetailsUiModel, "listDetailsUiModel");
                this.f12409a = listDetailsUiModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ListRefreshDone) && Intrinsics.c(this.f12409a, ((ListRefreshDone) obj).f12409a);
            }

            public final int hashCode() {
                return this.f12409a.hashCode();
            }

            public final String toString() {
                return "ListRefreshDone(listDetailsUiModel=" + this.f12409a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$OnListItemSoftDeleted;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnListItemSoftDeleted extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingListItemUiModel f12410a;

            public OnListItemSoftDeleted(ShoppingListItemUiModel listItemUiModel) {
                Intrinsics.h(listItemUiModel, "listItemUiModel");
                this.f12410a = listItemUiModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnListItemSoftDeleted) && Intrinsics.c(this.f12410a, ((OnListItemSoftDeleted) obj).f12410a);
            }

            public final int hashCode() {
                return this.f12410a.hashCode();
            }

            public final String toString() {
                return "OnListItemSoftDeleted(listItemUiModel=" + this.f12410a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ScrollToTop;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ScrollToTop extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ScrollToTop f12411a = new ScrollToTop();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ScrollToTop);
            }

            public final int hashCode() {
                return 1211936633;
            }

            public final String toString() {
                return "ScrollToTop";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowAddToCartResultSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAddToCartResultSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f12412a;
            public final TrolleyResultWithMessage b;
            public final List c;
            public final ArrayList d;

            public ShowAddToCartResultSnackbar(Text text, TrolleyResultWithMessage trolleyResultWithMessage, List productItems, ArrayList arrayList) {
                Intrinsics.h(text, "text");
                Intrinsics.h(productItems, "productItems");
                this.f12412a = text;
                this.b = trolleyResultWithMessage;
                this.c = productItems;
                this.d = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowAddToCartResultSnackbar)) {
                    return false;
                }
                ShowAddToCartResultSnackbar showAddToCartResultSnackbar = (ShowAddToCartResultSnackbar) obj;
                return Intrinsics.c(this.f12412a, showAddToCartResultSnackbar.f12412a) && this.b.equals(showAddToCartResultSnackbar.b) && Intrinsics.c(this.c, showAddToCartResultSnackbar.c) && this.d.equals(showAddToCartResultSnackbar.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + androidx.camera.core.impl.b.d((this.b.hashCode() + (this.f12412a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                return "ShowAddToCartResultSnackbar(text=" + this.f12412a + ", result=" + this.b + ", productItems=" + this.c + ", boostedProductIds=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowAddToCartWarning;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAddToCartWarning extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowAddToCartWarning f12413a = new ShowAddToCartWarning();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowAddToCartWarning);
            }

            public final int hashCode() {
                return 214651121;
            }

            public final String toString() {
                return "ShowAddToCartWarning";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowBoostAllSuccessSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowBoostAllSuccessSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12414a;
            public final Object b;

            public ShowBoostAllSuccessSnackbar(ResText resText, List list) {
                this.f12414a = resText;
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowBoostAllSuccessSnackbar)) {
                    return false;
                }
                ShowBoostAllSuccessSnackbar showBoostAllSuccessSnackbar = (ShowBoostAllSuccessSnackbar) obj;
                return this.f12414a.equals(showBoostAllSuccessSnackbar.f12414a) && this.b.equals(showBoostAllSuccessSnackbar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12414a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowBoostAllSuccessSnackbar(text=" + this.f12414a + ", boostedProducts=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowCheckProductItemsSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCheckProductItemsSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PluralResText f12415a;
            public final Text b;
            public final Function0 c;
            public final int d;

            public ShowCheckProductItemsSnackbar(PluralResText pluralResText, ResText resText, Function0 function0, int i) {
                this.f12415a = pluralResText;
                this.b = resText;
                this.c = function0;
                this.d = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowCheckProductItemsSnackbar)) {
                    return false;
                }
                ShowCheckProductItemsSnackbar showCheckProductItemsSnackbar = (ShowCheckProductItemsSnackbar) obj;
                return this.f12415a.equals(showCheckProductItemsSnackbar.f12415a) && Intrinsics.c(this.b, showCheckProductItemsSnackbar.b) && this.c.equals(showCheckProductItemsSnackbar.c) && this.d == showCheckProductItemsSnackbar.d;
            }

            public final int hashCode() {
                int iHashCode = this.f12415a.hashCode() * 31;
                Text text = this.b;
                return Integer.hashCode(this.d) + ((this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                return "ShowCheckProductItemsSnackbar(text=" + this.f12415a + ", actionText=" + this.b + ", action=" + this.c + ", numProductsChecked=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowDeleteCheckedItemsDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowDeleteCheckedItemsDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowDeleteCheckedItemsDialog f12416a = new ShowDeleteCheckedItemsDialog();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowDeleteCheckedItemsDialog);
            }

            public final int hashCode() {
                return -852009923;
            }

            public final String toString() {
                return "ShowDeleteCheckedItemsDialog";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowItemDeletedSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowItemDeletedSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingListItemUiModel f12417a;

            public ShowItemDeletedSnackbar(ShoppingListItemUiModel deletedItemModel) {
                Intrinsics.h(deletedItemModel, "deletedItemModel");
                this.f12417a = deletedItemModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowItemDeletedSnackbar) && Intrinsics.c(this.f12417a, ((ShowItemDeletedSnackbar) obj).f12417a);
            }

            public final int hashCode() {
                return this.f12417a.hashCode();
            }

            public final String toString() {
                return "ShowItemDeletedSnackbar(deletedItemModel=" + this.f12417a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowMaxListCountReachedErrorDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMaxListCountReachedErrorDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12418a;
            public final ResWithArgText b;

            public ShowMaxListCountReachedErrorDialog(ResText resText, ResWithArgText resWithArgText) {
                this.f12418a = resText;
                this.b = resWithArgText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowMaxListCountReachedErrorDialog)) {
                    return false;
                }
                ShowMaxListCountReachedErrorDialog showMaxListCountReachedErrorDialog = (ShowMaxListCountReachedErrorDialog) obj;
                return this.f12418a.equals(showMaxListCountReachedErrorDialog.f12418a) && this.b.equals(showMaxListCountReachedErrorDialog.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12418a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowMaxListCountReachedErrorDialog(title=" + this.f12418a + ", message=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowProductItemOptionsMenu;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowProductItemOptionsMenu extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductItemUiModel f12419a;
            public final View b;

            public ShowProductItemOptionsMenu(View view, ProductItemUiModel uiModel) {
                Intrinsics.h(uiModel, "uiModel");
                this.f12419a = uiModel;
                this.b = view;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowProductItemOptionsMenu)) {
                    return false;
                }
                ShowProductItemOptionsMenu showProductItemOptionsMenu = (ShowProductItemOptionsMenu) obj;
                return Intrinsics.c(this.f12419a, showProductItemOptionsMenu.f12419a) && this.b.equals(showProductItemOptionsMenu.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12419a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowProductItemOptionsMenu(uiModel=" + this.f12419a + ", button=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowQuantityDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowQuantityDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProductItemUiModel f12420a;

            public ShowQuantityDialog(ProductItemUiModel uiModel) {
                Intrinsics.h(uiModel, "uiModel");
                this.f12420a = uiModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowQuantityDialog) && Intrinsics.c(this.f12420a, ((ShowQuantityDialog) obj).f12420a);
            }

            public final int hashCode() {
                return this.f12420a.hashCode();
            }

            public final String toString() {
                return "ShowQuantityDialog(uiModel=" + this.f12420a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowSnapAListBottomSheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnapAListBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnapAListBottomSheet f12422a = new ShowSnapAListBottomSheet();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnapAListBottomSheet);
            }

            public final int hashCode() {
                return -1868948368;
            }

            public final String toString() {
                return "ShowSnapAListBottomSheet";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowSngCheckOffDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSngCheckOffDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12423a;
            public final ResText b;

            public ShowSngCheckOffDialog(ResText resText, ResText resText2) {
                this.f12423a = resText;
                this.b = resText2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowSngCheckOffDialog)) {
                    return false;
                }
                ShowSngCheckOffDialog showSngCheckOffDialog = (ShowSngCheckOffDialog) obj;
                return this.f12423a.equals(showSngCheckOffDialog.f12423a) && this.b.equals(showSngCheckOffDialog.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12423a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowSngCheckOffDialog(title=" + this.f12423a + ", message=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowUncheckCheckedItemsDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowUncheckCheckedItemsDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowUncheckCheckedItemsDialog f12424a = new ShowUncheckCheckedItemsDialog();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowUncheckCheckedItemsDialog);
            }

            public final int hashCode() {
                return 1171796319;
            }

            public final String toString() {
                return "ShowUncheckCheckedItemsDialog";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$TextItemFocusChanged;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class TextItemFocusChanged extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final TextItemUiModel f12425a;
            public final boolean b;

            public TextItemFocusChanged(TextItemUiModel uiModel, boolean z) {
                Intrinsics.h(uiModel, "uiModel");
                this.f12425a = uiModel;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof TextItemFocusChanged)) {
                    return false;
                }
                TextItemFocusChanged textItemFocusChanged = (TextItemFocusChanged) obj;
                return Intrinsics.c(this.f12425a, textItemFocusChanged.f12425a) && this.b == textItemFocusChanged.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f12425a.hashCode() * 31);
            }

            public final String toString() {
                return "TextItemFocusChanged(uiModel=" + this.f12425a + ", hasFocus=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ViewSimilarItems;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ViewSimilarItems extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f12426a;
            public final ProductId b;
            public final AlternativeProductsMode c;

            static {
                ProductId.Companion companion = ProductId.INSTANCE;
            }

            public ViewSimilarItems(String str, ProductId productId, AlternativeProductsMode alternativeProductsMode) {
                Intrinsics.h(productId, "productId");
                this.f12426a = str;
                this.b = productId;
                this.c = alternativeProductsMode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ViewSimilarItems)) {
                    return false;
                }
                ViewSimilarItems viewSimilarItems = (ViewSimilarItems) obj;
                return Intrinsics.c(this.f12426a, viewSimilarItems.f12426a) && Intrinsics.c(this.b, viewSimilarItems.b) && this.c == viewSimilarItems.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.f12426a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "ViewSimilarItems(listId=" + this.f12426a + ", productId=" + this.b + ", alternativeProductsMode=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/main/ShoppingListDetailsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f12421a;
            public final Text b;
            public final Function0 c;

            public ShowSnackbar(Text text, ResText resText, Function0 function0) {
                this.f12421a = text;
                this.b = resText;
                this.c = function0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowSnackbar)) {
                    return false;
                }
                ShowSnackbar showSnackbar = (ShowSnackbar) obj;
                return Intrinsics.c(this.f12421a, showSnackbar.f12421a) && Intrinsics.c(this.b, showSnackbar.b) && Intrinsics.c(this.c, showSnackbar.c);
            }

            public final int hashCode() {
                int iHashCode = this.f12421a.hashCode() * 31;
                Text text = this.b;
                return this.c.hashCode() + ((iHashCode + (text == null ? 0 : text.hashCode())) * 31);
            }

            public final String toString() {
                return "ShowSnackbar(text=" + this.f12421a + ", actionText=" + this.b + ", action=" + this.c + ")";
            }

            public /* synthetic */ ShowSnackbar(Text text) {
                this(text, null, new au.com.woolworths.android.onesite.deeplink.h(20));
            }
        }
    }
}
