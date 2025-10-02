package au.com.woolworths.feature.shop.storelocator.legacy.pickup.details;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.storelocator.StoreLocatorResult;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract;", "", "ViewState", "PageState", "Action", "ViewAction", "ViewModelAction", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface StoreDetailsContract {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$Action;", "", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$PageState;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageState {
        public static final PageState d;
        public static final PageState e;
        public static final PageState f;
        public static final /* synthetic */ PageState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            PageState pageState = new PageState("LOADING", 0);
            d = pageState;
            PageState pageState2 = new PageState("SHOW_ALL_DETAILS", 1);
            e = pageState2;
            PageState pageState3 = new PageState("ERROR", 2);
            f = pageState3;
            PageState[] pageStateArr = {pageState, pageState2, pageState3};
            g = pageStateArr;
            h = EnumEntriesKt.a(pageStateArr);
        }

        public static PageState valueOf(String str) {
            return (PageState) Enum.valueOf(PageState.class, str);
        }

        public static PageState[] values() {
            return (PageState[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$Action;", "CallContactNumber", "ShowLocationInMap", "FinishSetUpPickUpLocator", "ShopInStoreSelected", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$CallContactNumber;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$FinishSetUpPickUpLocator;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$ShopInStoreSelected;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$ShowLocationInMap;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewAction extends Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$CallContactNumber;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CallContactNumber implements ViewAction {

            /* renamed from: a, reason: collision with root package name */
            public final String f8193a;

            public CallContactNumber(String str) {
                this.f8193a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CallContactNumber) && Intrinsics.c(this.f8193a, ((CallContactNumber) obj).f8193a);
            }

            public final int hashCode() {
                return this.f8193a.hashCode();
            }

            public final String toString() {
                return YU.a.h("CallContactNumber(contactNumber=", this.f8193a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$FinishSetUpPickUpLocator;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FinishSetUpPickUpLocator implements ViewAction {

            /* renamed from: a, reason: collision with root package name */
            public static final FinishSetUpPickUpLocator f8194a = new FinishSetUpPickUpLocator();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof FinishSetUpPickUpLocator);
            }

            public final int hashCode() {
                return 500092135;
            }

            public final String toString() {
                return "FinishSetUpPickUpLocator";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$ShopInStoreSelected;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShopInStoreSelected implements ViewAction {

            /* renamed from: a, reason: collision with root package name */
            public final StoreLocatorResult.Store f8195a;

            public ShopInStoreSelected(StoreLocatorResult.Store legacyStoreModel) {
                Intrinsics.h(legacyStoreModel, "legacyStoreModel");
                this.f8195a = legacyStoreModel;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShopInStoreSelected) && Intrinsics.c(this.f8195a, ((ShopInStoreSelected) obj).f8195a);
            }

            public final int hashCode() {
                return this.f8195a.hashCode();
            }

            public final String toString() {
                return "ShopInStoreSelected(legacyStoreModel=" + this.f8195a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction$ShowLocationInMap;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowLocationInMap implements ViewAction {

            /* renamed from: a, reason: collision with root package name */
            public final String f8196a;

            public ShowLocationInMap(String str) {
                this.f8196a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowLocationInMap) && Intrinsics.c(this.f8196a, ((ShowLocationInMap) obj).f8196a);
            }

            public final int hashCode() {
                return this.f8196a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowLocationInMap(address=", this.f8196a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$Action;", "RetryOnError", "PickUpAddressSelected", "MessageShown", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction$MessageShown;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction$PickUpAddressSelected;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction$RetryOnError;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewModelAction extends Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction$MessageShown;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class MessageShown implements ViewModelAction {

            /* renamed from: a, reason: collision with root package name */
            public static final MessageShown f8197a = new MessageShown();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof MessageShown);
            }

            public final int hashCode() {
                return 499372474;
            }

            public final String toString() {
                return "MessageShown";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction$PickUpAddressSelected;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PickUpAddressSelected implements ViewModelAction {

            /* renamed from: a, reason: collision with root package name */
            public final String f8198a;
            public final String b;

            public PickUpAddressSelected(String str, String str2) {
                this.f8198a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PickUpAddressSelected)) {
                    return false;
                }
                PickUpAddressSelected pickUpAddressSelected = (PickUpAddressSelected) obj;
                return Intrinsics.c(this.f8198a, pickUpAddressSelected.f8198a) && Intrinsics.c(this.b, pickUpAddressSelected.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f8198a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("PickUpAddressSelected(addressId=", this.f8198a, ", shoppingModeId=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction$RetryOnError;", "Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewModelAction;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RetryOnError implements ViewModelAction {

            /* renamed from: a, reason: collision with root package name */
            public static final RetryOnError f8199a = new RetryOnError();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RetryOnError);
            }

            public final int hashCode() {
                return 2053283857;
            }

            public final String toString() {
                return "RetryOnError";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/details/StoreDetailsContract$ViewState;", "", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final PageState f8200a;
        public final Store b;
        public final String c;
        public final String d;
        public final Integer e;
        public final String f;
        public final boolean g;
        public final Function1 h;
        public final ViewAction i;
        public final Function1 j;

        public ViewState(PageState pageState, Store store, String str, String str2, Integer num, String str3, boolean z, Function1 function1, ViewAction viewAction, Function1 function12) {
            Intrinsics.h(pageState, "pageState");
            this.f8200a = pageState;
            this.b = store;
            this.c = str;
            this.d = str2;
            this.e = num;
            this.f = str3;
            this.g = z;
            this.h = function1;
            this.i = viewAction;
            this.j = function12;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v10, types: [kotlin.jvm.functions.Function1] */
        public static ViewState a(ViewState viewState, PageState pageState, Store store, String str, String str2, Integer num, String str3, Function1 function1, ViewAction viewAction, au.com.woolworths.feature.shop.instore.navigation.map.utils.a aVar, int i) {
            if ((i & 1) != 0) {
                pageState = viewState.f8200a;
            }
            PageState pageState2 = pageState;
            if ((i & 2) != 0) {
                store = viewState.b;
            }
            Store store2 = store;
            if ((i & 4) != 0) {
                str = viewState.c;
            }
            String str4 = str;
            if ((i & 8) != 0) {
                str2 = viewState.d;
            }
            String str5 = str2;
            Integer num2 = (i & 16) != 0 ? viewState.e : num;
            String str6 = (i & 32) != 0 ? viewState.f : str3;
            boolean z = viewState.g;
            Function1 trigger = (i & 128) != 0 ? viewState.h : function1;
            ViewAction viewAction2 = (i & 256) != 0 ? viewState.i : viewAction;
            au.com.woolworths.feature.shop.instore.navigation.map.utils.a complete = (i & 512) != 0 ? viewState.j : aVar;
            viewState.getClass();
            Intrinsics.h(pageState2, "pageState");
            Intrinsics.h(trigger, "trigger");
            Intrinsics.h(complete, "complete");
            return new ViewState(pageState2, store2, str4, str5, num2, str6, z, trigger, viewAction2, complete);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f8200a == viewState.f8200a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && Intrinsics.c(this.h, viewState.h) && Intrinsics.c(this.i, viewState.i) && Intrinsics.c(this.j, viewState.j);
        }

        public final int hashCode() {
            int iHashCode = this.f8200a.hashCode() * 31;
            Store store = this.b;
            int iHashCode2 = (iHashCode + (store == null ? 0 : store.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.e;
            int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode6 = (this.h.hashCode() + androidx.camera.core.impl.b.e((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.g)) * 31;
            ViewAction viewAction = this.i;
            return this.j.hashCode() + ((iHashCode6 + (viewAction != null ? viewAction.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(pageState=");
            sb.append(this.f8200a);
            sb.append(", store=");
            sb.append(this.b);
            sb.append(", selectedPickUpAddressId=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", loadingPickUpAddressId=", this.d, ", messageResId=");
            sb.append(this.e);
            sb.append(", selectedInstoreId=");
            sb.append(this.f);
            sb.append(", viewStoreInfoOnly=");
            sb.append(this.g);
            sb.append(", trigger=");
            sb.append(this.h);
            sb.append(", action=");
            sb.append(this.i);
            sb.append(", complete=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }

        public /* synthetic */ ViewState(PageState pageState, Store store, boolean z, int i) {
            this((i & 1) != 0 ? PageState.e : pageState, (i & 2) != 0 ? null : store, (i & 4) == 0 ? "1" : null, null, null, null, (i & 64) != 0 ? false : z, new au.com.woolworths.feature.shop.recipes.recipes.list.b(7), null, new au.com.woolworths.feature.shop.recipes.recipes.list.b(8));
        }
    }
}
