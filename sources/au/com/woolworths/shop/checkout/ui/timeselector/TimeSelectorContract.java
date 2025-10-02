package au.com.woolworths.shop.checkout.ui.timeselector;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsFooter;
import au.com.woolworths.shop.checkout.domain.model.timeselector.FulfilmentBottomSheet;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract;", "", "Actions", "ViewState", "TimeSelectorErrorState", "LoadingState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TimeSelectorContract {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$Actions;", "", "Finish", "ShowSnackBar", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$Actions$Finish;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$Actions$ShowSnackBar;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$Actions$Finish;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Finish implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Finish f10833a = new Finish();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public final int hashCode() {
                return 1660936527;
            }

            public final String toString() {
                return "Finish";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$Actions$ShowSnackBar;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackBar implements Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f10834a;

            public ShowSnackBar(Text text) {
                this.f10834a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackBar) && Intrinsics.c(this.f10834a, ((ShowSnackBar) obj).f10834a);
            }

            public final int hashCode() {
                return this.f10834a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowSnackBar(message=", this.f10834a, ")");
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$LoadingState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadingState {
        public static final LoadingState d;
        public static final LoadingState e;
        public static final LoadingState f;
        public static final /* synthetic */ LoadingState[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            LoadingState loadingState = new LoadingState("CIRCULAR", 0);
            d = loadingState;
            LoadingState loadingState2 = new LoadingState("WAPPLE", 1);
            e = loadingState2;
            LoadingState loadingState3 = new LoadingState("NONE", 2);
            f = loadingState3;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3};
            g = loadingStateArr;
            h = EnumEntriesKt.a(loadingStateArr);
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState;", "", "TimeSelectorFullEmpty", "TimeSelectorServerError", "TimeSelectorNetworkError", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState$TimeSelectorFullEmpty;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState$TimeSelectorNetworkError;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState$TimeSelectorServerError;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface TimeSelectorErrorState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState$TimeSelectorFullEmpty;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TimeSelectorFullEmpty implements TimeSelectorErrorState {

            /* renamed from: a, reason: collision with root package name */
            public static final TimeSelectorFullEmpty f10835a = new TimeSelectorFullEmpty();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState$TimeSelectorNetworkError;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TimeSelectorNetworkError implements TimeSelectorErrorState {

            /* renamed from: a, reason: collision with root package name */
            public static final TimeSelectorNetworkError f10836a = new TimeSelectorNetworkError();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState$TimeSelectorServerError;", "Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$TimeSelectorErrorState;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class TimeSelectorServerError implements TimeSelectorErrorState {

            /* renamed from: a, reason: collision with root package name */
            public static final TimeSelectorServerError f10837a = new TimeSelectorServerError();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$ViewState;", "", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {
        public static final ViewState h = new ViewState(EmptyList.d, null, null, null, LoadingState.d, null, null);

        /* renamed from: a, reason: collision with root package name */
        public final List f10838a;
        public final FooterData b;
        public final FulfilmentWindowsFooter c;
        public final TimeSelectorErrorState d;
        public final LoadingState e;
        public final FulfilmentWindows f;
        public final FulfilmentBottomSheet g;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/timeselector/TimeSelectorContract$ViewState$Companion;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public ViewState(List list, FooterData footerData, FulfilmentWindowsFooter fulfilmentWindowsFooter, TimeSelectorErrorState timeSelectorErrorState, LoadingState loadingState, FulfilmentWindows fulfilmentWindows, FulfilmentBottomSheet fulfilmentBottomSheet) {
            this.f10838a = list;
            this.b = footerData;
            this.c = fulfilmentWindowsFooter;
            this.d = timeSelectorErrorState;
            this.e = loadingState;
            this.f = fulfilmentWindows;
            this.g = fulfilmentBottomSheet;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v6, types: [java.util.List] */
        public static ViewState a(ViewState viewState, ArrayList arrayList, FooterData footerData, TimeSelectorErrorState timeSelectorErrorState, LoadingState loadingState, FulfilmentBottomSheet fulfilmentBottomSheet, int i) {
            ArrayList arrayList2 = arrayList;
            if ((i & 1) != 0) {
                arrayList2 = viewState.f10838a;
            }
            ArrayList arrayList3 = arrayList2;
            if ((i & 2) != 0) {
                footerData = viewState.b;
            }
            FooterData footerData2 = footerData;
            FulfilmentWindowsFooter fulfilmentWindowsFooter = viewState.c;
            if ((i & 8) != 0) {
                timeSelectorErrorState = viewState.d;
            }
            TimeSelectorErrorState timeSelectorErrorState2 = timeSelectorErrorState;
            if ((i & 16) != 0) {
                loadingState = viewState.e;
            }
            LoadingState loadingState2 = loadingState;
            FulfilmentWindows fulfilmentWindows = viewState.f;
            if ((i & 64) != 0) {
                fulfilmentBottomSheet = viewState.g;
            }
            viewState.getClass();
            return new ViewState(arrayList3, footerData2, fulfilmentWindowsFooter, timeSelectorErrorState2, loadingState2, fulfilmentWindows, fulfilmentBottomSheet);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f10838a, viewState.f10838a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && this.e == viewState.e && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g);
        }

        public final int hashCode() {
            int iHashCode = this.f10838a.hashCode() * 31;
            FooterData footerData = this.b;
            int iHashCode2 = (iHashCode + (footerData == null ? 0 : footerData.hashCode())) * 31;
            FulfilmentWindowsFooter fulfilmentWindowsFooter = this.c;
            int iHashCode3 = (iHashCode2 + (fulfilmentWindowsFooter == null ? 0 : fulfilmentWindowsFooter.f10612a.hashCode())) * 31;
            TimeSelectorErrorState timeSelectorErrorState = this.d;
            int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (timeSelectorErrorState == null ? 0 : timeSelectorErrorState.hashCode())) * 31)) * 31;
            FulfilmentWindows fulfilmentWindows = this.f;
            int iHashCode5 = (iHashCode4 + (fulfilmentWindows == null ? 0 : fulfilmentWindows.hashCode())) * 31;
            FulfilmentBottomSheet fulfilmentBottomSheet = this.g;
            return iHashCode5 + (fulfilmentBottomSheet != null ? fulfilmentBottomSheet.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(items=" + this.f10838a + ", footerData=" + this.b + ", fulfilmentWindowsFooter=" + this.c + ", errorState=" + this.d + ", loadingState=" + this.e + ", fulfilmentWindows=" + this.f + ", tooltipToShow=" + this.g + ")";
        }
    }
}
