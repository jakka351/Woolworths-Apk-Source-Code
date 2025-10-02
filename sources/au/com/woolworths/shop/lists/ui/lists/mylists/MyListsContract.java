package au.com.woolworths.shop.lists.ui.lists.mylists;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.ui.snapalist.main.ProcessorActivity;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract;", "", "Actions", "ViewState", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface MyListsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "", "LaunchShoppingListDetails", "LaunchPastShops", "LaunchBuyAgain", "LaunchCreateShoppingListActivity", "LaunchBoostedOffers", "LaunchWatchlistGuestOnboardingScreen", "LaunchDuplicateShoppingListActivity", "ShowListMenuDialog", "ShowMaxListCountReachedErrorDialog", "ShowSnackbar", "ShowSnapAListBottomSheet", "LaunchSnapAListGuestOnboardingScreen", "LaunchSnapAListProcessor", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchBoostedOffers;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchBuyAgain;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchCreateShoppingListActivity;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchDuplicateShoppingListActivity;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchPastShops;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchShoppingListDetails;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchSnapAListGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchSnapAListProcessor;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowListMenuDialog;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowMaxListCountReachedErrorDialog;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowSnapAListBottomSheet;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchBoostedOffers;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchBoostedOffers extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchBoostedOffers f12330a = new LaunchBoostedOffers();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchBoostedOffers);
            }

            public final int hashCode() {
                return 1707459374;
            }

            public final String toString() {
                return "LaunchBoostedOffers";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchBuyAgain;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchBuyAgain extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchBuyAgain f12331a = new LaunchBuyAgain();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchBuyAgain);
            }

            public final int hashCode() {
                return -1720461339;
            }

            public final String toString() {
                return "LaunchBuyAgain";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchCreateShoppingListActivity;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchCreateShoppingListActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCreateShoppingListActivity f12332a = new LaunchCreateShoppingListActivity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCreateShoppingListActivity);
            }

            public final int hashCode() {
                return -1460634340;
            }

            public final String toString() {
                return "LaunchCreateShoppingListActivity";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchDuplicateShoppingListActivity;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDuplicateShoppingListActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingList f12333a;

            public LaunchDuplicateShoppingListActivity(ShoppingList shoppingList) {
                Intrinsics.h(shoppingList, "shoppingList");
                this.f12333a = shoppingList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDuplicateShoppingListActivity) && Intrinsics.c(this.f12333a, ((LaunchDuplicateShoppingListActivity) obj).f12333a);
            }

            public final int hashCode() {
                return this.f12333a.hashCode();
            }

            public final String toString() {
                return "LaunchDuplicateShoppingListActivity(shoppingList=" + this.f12333a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchPastShops;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchPastShops extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchPastShops f12334a = new LaunchPastShops();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchPastShops);
            }

            public final int hashCode() {
                return -1413945024;
            }

            public final String toString() {
                return "LaunchPastShops";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchShoppingListDetails;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchShoppingListDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f12335a;
            public final boolean b;
            public final boolean c;
            public final Boolean d;

            public LaunchShoppingListDetails(int i, String listId, Boolean bool) {
                boolean z = (i & 2) == 0;
                boolean z2 = (i & 4) == 0;
                bool = (i & 8) != 0 ? Boolean.FALSE : bool;
                Intrinsics.h(listId, "listId");
                this.f12335a = listId;
                this.b = z;
                this.c = z2;
                this.d = bool;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchShoppingListDetails)) {
                    return false;
                }
                LaunchShoppingListDetails launchShoppingListDetails = (LaunchShoppingListDetails) obj;
                return Intrinsics.c(this.f12335a, launchShoppingListDetails.f12335a) && this.b == launchShoppingListDetails.b && this.c == launchShoppingListDetails.c && Intrinsics.c(this.d, launchShoppingListDetails.d);
            }

            public final int hashCode() {
                int iE = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(this.f12335a.hashCode() * 31, 31, this.b), 31, this.c);
                Boolean bool = this.d;
                return iE + (bool == null ? 0 : bool.hashCode());
            }

            public final String toString() {
                StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("LaunchShoppingListDetails(listId=", this.f12335a, ", isWatchlist=", ", isNewSnapAList=", this.b);
                sbQ.append(this.c);
                sbQ.append(", finishScreen=");
                sbQ.append(this.d);
                sbQ.append(")");
                return sbQ.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchSnapAListGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnapAListGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSnapAListGuestOnboardingScreen f12336a = new LaunchSnapAListGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSnapAListGuestOnboardingScreen);
            }

            public final int hashCode() {
                return 1155912085;
            }

            public final String toString() {
                return "LaunchSnapAListGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchSnapAListProcessor;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnapAListProcessor extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ProcessorActivity.Companion.SourceType f12337a;

            public LaunchSnapAListProcessor(ProcessorActivity.Companion.SourceType sourceType) {
                this.f12337a = sourceType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSnapAListProcessor) && this.f12337a == ((LaunchSnapAListProcessor) obj).f12337a;
            }

            public final int hashCode() {
                return this.f12337a.hashCode();
            }

            public final String toString() {
                return "LaunchSnapAListProcessor(source=" + this.f12337a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$LaunchWatchlistGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWatchlistGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchWatchlistGuestOnboardingScreen f12338a = new LaunchWatchlistGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchWatchlistGuestOnboardingScreen);
            }

            public final int hashCode() {
                return -216735331;
            }

            public final String toString() {
                return "LaunchWatchlistGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowListMenuDialog;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowListMenuDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ShoppingList f12339a;

            public ShowListMenuDialog(ShoppingList shoppingList) {
                this.f12339a = shoppingList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowListMenuDialog) && Intrinsics.c(this.f12339a, ((ShowListMenuDialog) obj).f12339a);
            }

            public final int hashCode() {
                return this.f12339a.hashCode();
            }

            public final String toString() {
                return "ShowListMenuDialog(shoppingList=" + this.f12339a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowMaxListCountReachedErrorDialog;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMaxListCountReachedErrorDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12340a;
            public final ResWithArgText b;

            public ShowMaxListCountReachedErrorDialog(ResText resText, ResWithArgText resWithArgText) {
                this.f12340a = resText;
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
                return this.f12340a.equals(showMaxListCountReachedErrorDialog.f12340a) && this.b.equals(showMaxListCountReachedErrorDialog.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12340a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowMaxListCountReachedErrorDialog(title=" + this.f12340a + ", message=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowSnackbar;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12341a;

            public ShowSnackbar(ResText resText) {
                this.f12341a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbar) && this.f12341a.equals(((ShowSnackbar) obj).f12341a);
            }

            public final int hashCode() {
                return this.f12341a.hashCode();
            }

            public final String toString() {
                return "ShowSnackbar(text=" + this.f12341a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions$ShowSnapAListBottomSheet;", "Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnapAListBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnapAListBottomSheet f12342a = new ShowSnapAListBottomSheet();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnapAListBottomSheet);
            }

            public final int hashCode() {
                return 1451803380;
            }

            public final String toString() {
                return "ShowSnapAListBottomSheet";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/mylists/MyListsContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12343a;
        public final List b;
        public final ShoppingListWithItems c;
        public final boolean d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;

        public ViewState(boolean z, List allShoppingLists, ShoppingListWithItems shoppingListWithItems, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
            Intrinsics.h(allShoppingLists, "allShoppingLists");
            this.f12343a = z;
            this.b = allShoppingLists;
            this.c = shoppingListWithItems;
            this.d = z2;
            this.e = z3;
            this.f = z4;
            this.g = z5;
            this.h = z6;
            this.i = z7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12343a == viewState.f12343a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && this.e == viewState.e && this.f == viewState.f && this.g == viewState.g && this.h == viewState.h && this.i == viewState.i;
        }

        public final int hashCode() {
            int iD = androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.e(Boolean.hashCode(false) * 31, 31, this.f12343a), 31, this.b);
            ShoppingListWithItems shoppingListWithItems = this.c;
            return Boolean.hashCode(this.i) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((iD + (shoppingListWithItems != null ? shoppingListWithItems.hashCode() : 0)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=false, isRefreshing=");
            sb.append(this.f12343a);
            sb.append(", allShoppingLists=");
            sb.append(this.b);
            sb.append(", watchlist=");
            sb.append(this.c);
            sb.append(", hasPastShops=");
            sb.append(this.d);
            sb.append(", showBuyAgain=");
            au.com.woolworths.android.onesite.a.D(sb, this.e, ", showBoostedOffer=", this.f, ", showPastShopsSection=");
            au.com.woolworths.android.onesite.a.D(sb, this.g, ", displayMenuItem=", this.h, ", shouldDisplayListsBanner=");
            return YU.a.k(")", sb, this.i);
        }
    }
}
