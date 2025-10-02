package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract;", "", "ViewState", "Actions", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface SortByViewContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "", "ShowSortByAisleWarning", "ShowSortBySelectionDialog", "ShowSnapAListBottomSheet", "LaunchSnapAListGuestOnboardingScreen", "ShowDialog", "LaunchMagicMatchOnboardingScreen", "ShowMaxItemsDialog", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$LaunchMagicMatchOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$LaunchSnapAListGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowMaxItemsDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowSnapAListBottomSheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowSortByAisleWarning;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowSortBySelectionDialog;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$LaunchMagicMatchOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchMagicMatchOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchMagicMatchOnboardingScreen f12436a = new LaunchMagicMatchOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchMagicMatchOnboardingScreen);
            }

            public final int hashCode() {
                return 319503591;
            }

            public final String toString() {
                return "LaunchMagicMatchOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$LaunchSnapAListGuestOnboardingScreen;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnapAListGuestOnboardingScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSnapAListGuestOnboardingScreen f12437a = new LaunchSnapAListGuestOnboardingScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSnapAListGuestOnboardingScreen);
            }

            public final int hashCode() {
                return -766709070;
            }

            public final String toString() {
                return "LaunchSnapAListGuestOnboardingScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12438a;
            public final ResText b;

            public ShowDialog(ResText resText, ResText resText2) {
                this.f12438a = resText;
                this.b = resText2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowDialog)) {
                    return false;
                }
                ShowDialog showDialog = (ShowDialog) obj;
                return this.f12438a.equals(showDialog.f12438a) && this.b.equals(showDialog.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f12438a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowDialog(title=" + this.f12438a + ", body=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowMaxItemsDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowMaxItemsDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final PluralResText f12439a;
            public final ResText b;
            public final ResText c;
            public final ResText d;

            public ShowMaxItemsDialog(PluralResText pluralResText, ResText resText, ResText resText2, ResText resText3) {
                this.f12439a = pluralResText;
                this.b = resText;
                this.c = resText2;
                this.d = resText3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowMaxItemsDialog)) {
                    return false;
                }
                ShowMaxItemsDialog showMaxItemsDialog = (ShowMaxItemsDialog) obj;
                return this.f12439a.equals(showMaxItemsDialog.f12439a) && this.b.equals(showMaxItemsDialog.b) && this.c.equals(showMaxItemsDialog.c) && this.d.equals(showMaxItemsDialog.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f12439a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "ShowMaxItemsDialog(title=" + this.f12439a + ", body=" + this.b + ", dismissButtonText=" + this.c + ", confirmButtonText=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowSnapAListBottomSheet;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnapAListBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSnapAListBottomSheet f12440a = new ShowSnapAListBottomSheet();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnapAListBottomSheet);
            }

            public final int hashCode() {
                return -743774319;
            }

            public final String toString() {
                return "ShowSnapAListBottomSheet";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowSortByAisleWarning;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSortByAisleWarning extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f12441a;
            public final ResText b;
            public final ResText c;
            public final ResText d;

            public ShowSortByAisleWarning(ResText resText, ResText resText2, ResText resText3, ResText resText4) {
                this.f12441a = resText;
                this.b = resText2;
                this.c = resText3;
                this.d = resText4;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowSortByAisleWarning)) {
                    return false;
                }
                ShowSortByAisleWarning showSortByAisleWarning = (ShowSortByAisleWarning) obj;
                return this.f12441a.equals(showSortByAisleWarning.f12441a) && this.b.equals(showSortByAisleWarning.b) && this.c.equals(showSortByAisleWarning.c) && this.d.equals(showSortByAisleWarning.d);
            }

            public final int hashCode() {
                return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f12441a.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "ShowSortByAisleWarning(title=" + this.f12441a + ", body=" + this.b + ", dismissButtonText=" + this.c + ", confirmButtonText=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions$ShowSortBySelectionDialog;", "Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$Actions;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSortBySelectionDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowSortBySelectionDialog f12442a = new ShowSortBySelectionDialog();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSortBySelectionDialog);
            }

            public final int hashCode() {
                return -2095068915;
            }

            public final String toString() {
                return "ShowSortBySelectionDialog";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/ui/shoppinglist/sort/SortByViewContract$ViewState;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f12443a;
        public final int b;
        public final int c;
        public final SortBy d;

        public /* synthetic */ ViewState(SortBy sortBy, int i) {
            this((i & 1) != 0 ? null : "", (i & 2) != 0 ? 0 : 10, 0, sortBy);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f12443a, viewState.f12443a) && this.b == viewState.b && this.c == viewState.c && this.d == viewState.d;
        }

        public final int hashCode() {
            String str = this.f12443a;
            return this.d.hashCode() + androidx.camera.core.impl.b.a(this.c, androidx.camera.core.impl.b.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sbU = androidx.camera.core.impl.b.u("ViewState(listId=", this.b, this.f12443a, ", productCount=", ", textItemsCount=");
            sbU.append(this.c);
            sbU.append(", sortBy=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }

        public ViewState(String str, int i, int i2, SortBy sortBy) {
            this.f12443a = str;
            this.b = i;
            this.c = i2;
            this.d = sortBy;
        }
    }
}
