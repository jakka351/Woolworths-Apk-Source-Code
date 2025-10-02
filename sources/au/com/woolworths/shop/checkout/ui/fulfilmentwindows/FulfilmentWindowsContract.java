package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.base.shopapp.data.models.InfoSection;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.FooterData;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentSlotSelectionOptionsInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsOption;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract;", "", "Actions", "ViewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FulfilmentWindowsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "", "LaunchDeepLink", "LaunchFulfilmentFeesBottomSheet", "LaunchFulfilmentSelectionOptionsUi", "SelectionComplete", "LaunchSnackBar", "LaunchExtraInfoDialog", "LaunchExtraInfoBottomSheet", "DismissWindow", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$DismissWindow;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchExtraInfoBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchExtraInfoDialog;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchFulfilmentFeesBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchFulfilmentSelectionOptionsUi;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchSnackBar;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$SelectionComplete;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$DismissWindow;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DismissWindow extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissWindow f10779a = new DismissWindow();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10780a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f10780a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f10780a, ((LaunchDeepLink) obj).f10780a);
            }

            public final int hashCode() {
                return this.f10780a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f10780a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchExtraInfoBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchExtraInfoBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final FulfilmentExtraInfo f10781a;

            public LaunchExtraInfoBottomSheet(FulfilmentExtraInfo extraInfo) {
                Intrinsics.h(extraInfo, "extraInfo");
                this.f10781a = extraInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchExtraInfoBottomSheet) && Intrinsics.c(this.f10781a, ((LaunchExtraInfoBottomSheet) obj).f10781a);
            }

            public final int hashCode() {
                return this.f10781a.hashCode();
            }

            public final String toString() {
                return "LaunchExtraInfoBottomSheet(extraInfo=" + this.f10781a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchExtraInfoDialog;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchExtraInfoDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final InfoSection f10782a;

            public LaunchExtraInfoDialog(InfoSection infoSection) {
                this.f10782a = infoSection;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchExtraInfoDialog) && Intrinsics.c(this.f10782a, ((LaunchExtraInfoDialog) obj).f10782a);
            }

            public final int hashCode() {
                return this.f10782a.hashCode();
            }

            public final String toString() {
                return "LaunchExtraInfoDialog(info=" + this.f10782a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchFulfilmentFeesBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFulfilmentFeesBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final FulfilmentExtraInfo f10783a;

            public LaunchFulfilmentFeesBottomSheet(FulfilmentExtraInfo extraInfo) {
                Intrinsics.h(extraInfo, "extraInfo");
                this.f10783a = extraInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchFulfilmentFeesBottomSheet) && Intrinsics.c(this.f10783a, ((LaunchFulfilmentFeesBottomSheet) obj).f10783a);
            }

            public final int hashCode() {
                return this.f10783a.hashCode();
            }

            public final String toString() {
                return "LaunchFulfilmentFeesBottomSheet(extraInfo=" + this.f10783a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchFulfilmentSelectionOptionsUi;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFulfilmentSelectionOptionsUi extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10784a;
            public final FulfilmentWindowsSlot b;
            public final FulfilmentSlotSelectionOptionsInfo c;

            public LaunchFulfilmentSelectionOptionsUi(String str, FulfilmentWindowsSlot slot, FulfilmentSlotSelectionOptionsInfo selectionOptionsInfo) {
                Intrinsics.h(slot, "slot");
                Intrinsics.h(selectionOptionsInfo, "selectionOptionsInfo");
                this.f10784a = str;
                this.b = slot;
                this.c = selectionOptionsInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchFulfilmentSelectionOptionsUi)) {
                    return false;
                }
                LaunchFulfilmentSelectionOptionsUi launchFulfilmentSelectionOptionsUi = (LaunchFulfilmentSelectionOptionsUi) obj;
                return Intrinsics.c(this.f10784a, launchFulfilmentSelectionOptionsUi.f10784a) && Intrinsics.c(this.b, launchFulfilmentSelectionOptionsUi.b) && Intrinsics.c(this.c, launchFulfilmentSelectionOptionsUi.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.f10784a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "LaunchFulfilmentSelectionOptionsUi(buttonTitle=" + this.f10784a + ", slot=" + this.b + ", selectionOptionsInfo=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$LaunchSnackBar;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnackBar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f10785a;

            public LaunchSnackBar(Text text) {
                this.f10785a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSnackBar) && Intrinsics.c(this.f10785a, ((LaunchSnackBar) obj).f10785a);
            }

            public final int hashCode() {
                return this.f10785a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("LaunchSnackBar(message=", this.f10785a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions$SelectionComplete;", "Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class SelectionComplete extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Checkout f10786a;

            public SelectionComplete(Checkout checkout) {
                Intrinsics.h(checkout, "checkout");
                this.f10786a = checkout;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SelectionComplete) && Intrinsics.c(this.f10786a, ((SelectionComplete) obj).f10786a);
            }

            public final int hashCode() {
                return this.f10786a.hashCode();
            }

            public final String toString() {
                return "SelectionComplete(checkout=" + this.f10786a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsContract$ViewState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10787a;
        public final boolean b;
        public final FulfilmentWindows c;
        public final FulfilmentWindowsOption d;
        public final String e;
        public final FooterData f;
        public final boolean g;
        public final boolean h;
        public final FulfilmentWindowErrorState i;

        public ViewState(boolean z, boolean z2, FulfilmentWindows fulfilmentWindows, FulfilmentWindowsOption fulfilmentWindowsOption, String str, FooterData footerData, boolean z3, boolean z4, FulfilmentWindowErrorState fulfilmentWindowErrorState) {
            this.f10787a = z;
            this.b = z2;
            this.c = fulfilmentWindows;
            this.d = fulfilmentWindowsOption;
            this.e = str;
            this.f = footerData;
            this.g = z3;
            this.h = z4;
            this.i = fulfilmentWindowErrorState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10787a == viewState.f10787a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && this.h == viewState.h && this.i == viewState.i;
        }

        public final int hashCode() {
            int iE = b.e(Boolean.hashCode(this.f10787a) * 31, 31, this.b);
            FulfilmentWindows fulfilmentWindows = this.c;
            int iHashCode = (iE + (fulfilmentWindows == null ? 0 : fulfilmentWindows.hashCode())) * 31;
            FulfilmentWindowsOption fulfilmentWindowsOption = this.d;
            int iHashCode2 = (iHashCode + (fulfilmentWindowsOption == null ? 0 : fulfilmentWindowsOption.hashCode())) * 31;
            String str = this.e;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            FooterData footerData = this.f;
            int iE2 = b.e(b.e((iHashCode3 + (footerData == null ? 0 : footerData.hashCode())) * 31, 31, this.g), 31, this.h);
            FulfilmentWindowErrorState fulfilmentWindowErrorState = this.i;
            return iE2 + (fulfilmentWindowErrorState != null ? fulfilmentWindowErrorState.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = b.v("ViewState(isLoading=", ", isFeesBottomSheetEnabled=", ", fulfilmentWindows=", this.f10787a, this.b);
            sbV.append(this.c);
            sbV.append(", fulfilmentWindowsOption=");
            sbV.append(this.d);
            sbV.append(", selectedGroup=");
            sbV.append(this.e);
            sbV.append(", footerData=");
            sbV.append(this.f);
            sbV.append(", shouldDisplaySelectionOptionsPage=");
            au.com.woolworths.android.onesite.a.D(sbV, this.g, ", shouldScrollToSelectedWindowsOptionGroup=", this.h, ", errorState=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }
}
