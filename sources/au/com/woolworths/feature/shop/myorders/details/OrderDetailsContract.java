package au.com.woolworths.feature.shop.myorders.details;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.shop.myorders.details.help.models.OrderHelpDataList;
import au.com.woolworths.feature.shop.myorders.details.models.BayNumberPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryMethodsTooltip;
import au.com.woolworths.feature.shop.myorders.details.models.LocationTrackingPrimingPageContent;
import au.com.woolworths.feature.shop.myorders.details.models.OnMyWayPreferences;
import au.com.woolworths.feature.shop.myorders.details.models.OrderCollectionParkingDetails;
import au.com.woolworths.feature.shop.myorders.details.models.OrderSummaryData;
import au.com.woolworths.feature.shop.myorders.details.models.StarCount;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsActivity;
import com.woolworths.R;
import java.util.Set;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract;", "", "ViewState", "DriverRatingState", "Actions", "ChannelActions", "LoadingState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OrderDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:#\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u0082\u0001#%&'()*+,-./0123456789:;<=>?@ABCDEFG¨\u0006H"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "", "ShowCancelWarningScreen", "ShowEditOrderWarningScreen", "ProductClicked", "HorizontalListActionClicked", "ShowErrorMessage", "ShowLoadingDialog", "HideLoadingDialog", "OpenInvoice", "ShowSuccessMessage", "ShowAttendantAppOffMessage", "LaunchEditDriverInstructionScreen", "ShowLeaveOrderUnattendedDialog", "ShowBayNumberSelector", "OpenNavigation", "OpenParkingGuide", "OpenProgressStepperInfoModal", "CopyOrderNumber", "ShowInvoiceErrorMessage", "ShowPickOrderCollectedState", "PickupEtaSelector", "PlayPerfectOrderFulfilmentAnimation", "RequestLocationPermissionsForTracking", "StartLocationTracking", "StopLocationTracking", "ShowRequestLocationPrimingForTracking", "OpenOrderDetailsHelpActivity", "GoToSettings", "ShowCoachMark", "OpenMyGroceriesActivity", "ShowProofOfDeliveryScreen", "OpenExternalLink", "ScrollToTop", "OpenApplicableDeliveryMethods", "GoToHomeActivity", "OpenChatToOlive", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$CopyOrderNumber;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$GoToHomeActivity;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$GoToSettings;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$HideLoadingDialog;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$HorizontalListActionClicked;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$LaunchEditDriverInstructionScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenApplicableDeliveryMethods;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenChatToOlive;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenExternalLink;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenInvoice;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenMyGroceriesActivity;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenNavigation;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenOrderDetailsHelpActivity;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenParkingGuide;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenProgressStepperInfoModal;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$PickupEtaSelector;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$PlayPerfectOrderFulfilmentAnimation;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ProductClicked;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$RequestLocationPermissionsForTracking;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ScrollToTop;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowAttendantAppOffMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowBayNumberSelector;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowCancelWarningScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowCoachMark;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowEditOrderWarningScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowErrorMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowInvoiceErrorMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowLeaveOrderUnattendedDialog;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowLoadingDialog;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowPickOrderCollectedState;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowProofOfDeliveryScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowRequestLocationPrimingForTracking;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowSuccessMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$StartLocationTracking;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$StopLocationTracking;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$CopyOrderNumber;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CopyOrderNumber extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7637a;

            public CopyOrderNumber(String str) {
                this.f7637a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CopyOrderNumber) && Intrinsics.c(this.f7637a, ((CopyOrderNumber) obj).f7637a);
            }

            public final int hashCode() {
                return this.f7637a.hashCode();
            }

            public final String toString() {
                return YU.a.h("CopyOrderNumber(orderNumber=", this.f7637a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$GoToHomeActivity;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoToHomeActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToHomeActivity f7638a = new GoToHomeActivity();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToHomeActivity);
            }

            public final int hashCode() {
                return -1966236876;
            }

            public final String toString() {
                return "GoToHomeActivity";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$GoToSettings;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class GoToSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final GoToSettings f7639a = new GoToSettings();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$HideLoadingDialog;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HideLoadingDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final HideLoadingDialog f7640a = new HideLoadingDialog();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof HideLoadingDialog);
            }

            public final int hashCode() {
                return 504005343;
            }

            public final String toString() {
                return "HideLoadingDialog";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$HorizontalListActionClicked;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HorizontalListActionClicked extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final HorizontalListDataInterface f7641a;

            public HorizontalListActionClicked(HorizontalListDataInterface data) {
                Intrinsics.h(data, "data");
                this.f7641a = data;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof HorizontalListActionClicked) && Intrinsics.c(this.f7641a, ((HorizontalListActionClicked) obj).f7641a);
            }

            public final int hashCode() {
                return this.f7641a.hashCode();
            }

            public final String toString() {
                return "HorizontalListActionClicked(data=" + this.f7641a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$LaunchEditDriverInstructionScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchEditDriverInstructionScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final EditDriverInstructionActivity.Extras f7642a;

            public LaunchEditDriverInstructionScreen(EditDriverInstructionActivity.Extras extras) {
                this.f7642a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchEditDriverInstructionScreen) && Intrinsics.c(this.f7642a, ((LaunchEditDriverInstructionScreen) obj).f7642a);
            }

            public final int hashCode() {
                return this.f7642a.hashCode();
            }

            public final String toString() {
                return "LaunchEditDriverInstructionScreen(extras=" + this.f7642a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenApplicableDeliveryMethods;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenApplicableDeliveryMethods extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final DeliveryMethodsTooltip f7643a;

            public OpenApplicableDeliveryMethods(DeliveryMethodsTooltip deliveryTooltip) {
                Intrinsics.h(deliveryTooltip, "deliveryTooltip");
                this.f7643a = deliveryTooltip;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenApplicableDeliveryMethods) && Intrinsics.c(this.f7643a, ((OpenApplicableDeliveryMethods) obj).f7643a);
            }

            public final int hashCode() {
                return this.f7643a.hashCode();
            }

            public final String toString() {
                return "OpenApplicableDeliveryMethods(deliveryTooltip=" + this.f7643a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenChatToOlive;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenChatToOlive extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7644a;

            public OpenChatToOlive(String url) {
                Intrinsics.h(url, "url");
                this.f7644a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenChatToOlive) && Intrinsics.c(this.f7644a, ((OpenChatToOlive) obj).f7644a);
            }

            public final int hashCode() {
                return this.f7644a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenChatToOlive(url=", this.f7644a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenExternalLink;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenExternalLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7645a;

            public OpenExternalLink(String str) {
                this.f7645a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenExternalLink) && Intrinsics.c(this.f7645a, ((OpenExternalLink) obj).f7645a);
            }

            public final int hashCode() {
                return this.f7645a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenExternalLink(linkUrl=", this.f7645a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenInvoice;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenInvoice extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Uri f7646a;

            public OpenInvoice(Uri uri) {
                this.f7646a = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenInvoice) && Intrinsics.c(this.f7646a, ((OpenInvoice) obj).f7646a);
            }

            public final int hashCode() {
                return this.f7646a.hashCode();
            }

            public final String toString() {
                return "OpenInvoice(uri=" + this.f7646a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenMyGroceriesActivity;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenMyGroceriesActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7647a;

            public OpenMyGroceriesActivity(String orderId) {
                Intrinsics.h(orderId, "orderId");
                this.f7647a = orderId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenMyGroceriesActivity) && Intrinsics.c(this.f7647a, ((OpenMyGroceriesActivity) obj).f7647a);
            }

            public final int hashCode() {
                return this.f7647a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenMyGroceriesActivity(orderId=", this.f7647a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenNavigation;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenNavigation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7648a;

            public OpenNavigation(String address) {
                Intrinsics.h(address, "address");
                this.f7648a = address;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenNavigation) && Intrinsics.c(this.f7648a, ((OpenNavigation) obj).f7648a);
            }

            public final int hashCode() {
                return this.f7648a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenNavigation(address=", this.f7648a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenOrderDetailsHelpActivity;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenOrderDetailsHelpActivity extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OrderHelpDataList f7649a;

            public OpenOrderDetailsHelpActivity(OrderHelpDataList helpList) {
                Intrinsics.h(helpList, "helpList");
                this.f7649a = helpList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenOrderDetailsHelpActivity) && Intrinsics.c(this.f7649a, ((OpenOrderDetailsHelpActivity) obj).f7649a);
            }

            public final int hashCode() {
                return this.f7649a.hashCode();
            }

            public final String toString() {
                return "OpenOrderDetailsHelpActivity(helpList=" + this.f7649a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenParkingGuide;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenParkingGuide extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OrderCollectionParkingDetails f7650a;

            public OpenParkingGuide(OrderCollectionParkingDetails parkingDetails) {
                Intrinsics.h(parkingDetails, "parkingDetails");
                this.f7650a = parkingDetails;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenParkingGuide) && Intrinsics.c(this.f7650a, ((OpenParkingGuide) obj).f7650a);
            }

            public final int hashCode() {
                return this.f7650a.hashCode();
            }

            public final String toString() {
                return "OpenParkingGuide(parkingDetails=" + this.f7650a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$OpenProgressStepperInfoModal;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenProgressStepperInfoModal extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final StepsToolTip f7651a;

            public OpenProgressStepperInfoModal(StepsToolTip toolTip) {
                Intrinsics.h(toolTip, "toolTip");
                this.f7651a = toolTip;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenProgressStepperInfoModal) && Intrinsics.c(this.f7651a, ((OpenProgressStepperInfoModal) obj).f7651a);
            }

            public final int hashCode() {
                return this.f7651a.hashCode();
            }

            public final String toString() {
                return "OpenProgressStepperInfoModal(toolTip=" + this.f7651a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$PickupEtaSelector;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PickupEtaSelector extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OnMyWayPreferences f7652a;

            public PickupEtaSelector(OnMyWayPreferences onMyWayPreferences) {
                Intrinsics.h(onMyWayPreferences, "onMyWayPreferences");
                this.f7652a = onMyWayPreferences;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof PickupEtaSelector) && Intrinsics.c(this.f7652a, ((PickupEtaSelector) obj).f7652a);
            }

            public final int hashCode() {
                return this.f7652a.hashCode();
            }

            public final String toString() {
                return "PickupEtaSelector(onMyWayPreferences=" + this.f7652a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$PlayPerfectOrderFulfilmentAnimation;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PlayPerfectOrderFulfilmentAnimation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PlayPerfectOrderFulfilmentAnimation f7653a = new PlayPerfectOrderFulfilmentAnimation();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ProductClicked;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ProductClicked extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7654a;

            public ProductClicked(String productId) {
                Intrinsics.h(productId, "productId");
                this.f7654a = productId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductClicked) && Intrinsics.c(this.f7654a, ((ProductClicked) obj).f7654a);
            }

            public final int hashCode() {
                return this.f7654a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ProductClicked(productId=", this.f7654a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$RequestLocationPermissionsForTracking;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RequestLocationPermissionsForTracking extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RequestLocationPermissionsForTracking f7655a = new RequestLocationPermissionsForTracking();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ScrollToTop;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ScrollToTop extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ScrollToTop f7656a = new ScrollToTop();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowAttendantAppOffMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAttendantAppOffMessage extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowAttendantAppOffMessage);
            }

            public final int hashCode() {
                Integer.hashCode(0);
                throw null;
            }

            public final String toString() {
                return "ShowAttendantAppOffMessage(messageResId=0, collectionMode=null)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowBayNumberSelector;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowBayNumberSelector extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BayNumberPreferences f7657a;

            public ShowBayNumberSelector(BayNumberPreferences bayNumberPreferences) {
                Intrinsics.h(bayNumberPreferences, "bayNumberPreferences");
                this.f7657a = bayNumberPreferences;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowBayNumberSelector) && Intrinsics.c(this.f7657a, ((ShowBayNumberSelector) obj).f7657a);
            }

            public final int hashCode() {
                return this.f7657a.hashCode();
            }

            public final String toString() {
                return "ShowBayNumberSelector(bayNumberPreferences=" + this.f7657a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowCancelWarningScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCancelWarningScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OrderSummaryData f7658a;

            public ShowCancelWarningScreen(OrderSummaryData orderSummaryData) {
                this.f7658a = orderSummaryData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowCancelWarningScreen) && Intrinsics.c(this.f7658a, ((ShowCancelWarningScreen) obj).f7658a);
            }

            public final int hashCode() {
                return this.f7658a.hashCode();
            }

            public final String toString() {
                return "ShowCancelWarningScreen(data=" + this.f7658a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowCoachMark;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCoachMark extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowCoachMark);
            }

            public final int hashCode() {
                return Integer.hashCode(R.string.order_details_coach_mark_help_cta) + androidx.camera.core.impl.b.a(R.string.order_details_coach_mark_help_body, Integer.hashCode(R.string.order_details_coach_mark_help_title) * 31, 31);
            }

            public final String toString() {
                return "ShowCoachMark(titleResId=2132018502, bodyResId=2132018500, ctaResId=2132018501)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowEditOrderWarningScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowEditOrderWarningScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final EditOrderConditionsActivity.Extras f7659a;

            public ShowEditOrderWarningScreen(EditOrderConditionsActivity.Extras extras) {
                this.f7659a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowEditOrderWarningScreen) && Intrinsics.c(this.f7659a, ((ShowEditOrderWarningScreen) obj).f7659a);
            }

            public final int hashCode() {
                return this.f7659a.hashCode();
            }

            public final String toString() {
                return "ShowEditOrderWarningScreen(data=" + this.f7659a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowErrorMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7660a;

            public ShowErrorMessage(Text text) {
                this.f7660a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowErrorMessage) && Intrinsics.c(this.f7660a, ((ShowErrorMessage) obj).f7660a);
            }

            public final int hashCode() {
                return this.f7660a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowErrorMessage(message=", this.f7660a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowInvoiceErrorMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowInvoiceErrorMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7661a;

            public ShowInvoiceErrorMessage(Text message) {
                Intrinsics.h(message, "message");
                this.f7661a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowInvoiceErrorMessage) && Intrinsics.c(this.f7661a, ((ShowInvoiceErrorMessage) obj).f7661a);
            }

            public final int hashCode() {
                return this.f7661a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowInvoiceErrorMessage(message=", this.f7661a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowLeaveOrderUnattendedDialog;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowLeaveOrderUnattendedDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7662a;
            public final String b;

            public ShowLeaveOrderUnattendedDialog(String str, String str2) {
                this.f7662a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowLeaveOrderUnattendedDialog)) {
                    return false;
                }
                ShowLeaveOrderUnattendedDialog showLeaveOrderUnattendedDialog = (ShowLeaveOrderUnattendedDialog) obj;
                return Intrinsics.c(this.f7662a, showLeaveOrderUnattendedDialog.f7662a) && Intrinsics.c(this.b, showLeaveOrderUnattendedDialog.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7662a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("ShowLeaveOrderUnattendedDialog(title=", this.f7662a, ", message=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowLoadingDialog;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowLoadingDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7663a;

            public ShowLoadingDialog(Text text) {
                this.f7663a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowLoadingDialog) && Intrinsics.c(this.f7663a, ((ShowLoadingDialog) obj).f7663a);
            }

            public final int hashCode() {
                return this.f7663a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowLoadingDialog(message=", this.f7663a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowPickOrderCollectedState;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowPickOrderCollectedState extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowPickOrderCollectedState f7664a = new ShowPickOrderCollectedState();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowProofOfDeliveryScreen;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowProofOfDeliveryScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7665a;
            public final String b;
            public final String c;

            public ShowProofOfDeliveryScreen(String str, String str2, String str3) {
                this.f7665a = str;
                this.b = str2;
                this.c = str3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowProofOfDeliveryScreen)) {
                    return false;
                }
                ShowProofOfDeliveryScreen showProofOfDeliveryScreen = (ShowProofOfDeliveryScreen) obj;
                return Intrinsics.c(this.f7665a, showProofOfDeliveryScreen.f7665a) && Intrinsics.c(this.b, showProofOfDeliveryScreen.b) && Intrinsics.c(this.c, showProofOfDeliveryScreen.c);
            }

            public final int hashCode() {
                int iHashCode = this.f7665a.hashCode() * 31;
                String str = this.b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.o(YU.a.v("ShowProofOfDeliveryScreen(title=", this.f7665a, ", imageUrl=", this.b, ", footnote="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowRequestLocationPrimingForTracking;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowRequestLocationPrimingForTracking extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final LocationTrackingPrimingPageContent f7666a;

            public ShowRequestLocationPrimingForTracking(LocationTrackingPrimingPageContent locationTrackingPrimingPageContent) {
                this.f7666a = locationTrackingPrimingPageContent;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowRequestLocationPrimingForTracking) && Intrinsics.c(this.f7666a, ((ShowRequestLocationPrimingForTracking) obj).f7666a);
            }

            public final int hashCode() {
                return this.f7666a.hashCode();
            }

            public final String toString() {
                return "ShowRequestLocationPrimingForTracking(locationTrackingPrimingPageContent=" + this.f7666a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$ShowSuccessMessage;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSuccessMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f7667a;

            public ShowSuccessMessage(Text text) {
                this.f7667a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSuccessMessage) && Intrinsics.c(this.f7667a, ((ShowSuccessMessage) obj).f7667a);
            }

            public final int hashCode() {
                return this.f7667a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowSuccessMessage(message=", this.f7667a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$StartLocationTracking;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class StartLocationTracking extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final StartLocationTracking f7668a = new StartLocationTracking();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions$StopLocationTracking;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$Actions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class StopLocationTracking extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof StopLocationTracking);
            }

            public final int hashCode() {
                return 1192671891;
            }

            public final String toString() {
                return "StopLocationTracking(eventDescription=i'm here interaction)";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions;", "", "OpenLogin", "OpenPastOrderDetails", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions$OpenLogin;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions$OpenPastOrderDetails;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class ChannelActions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions$OpenLogin;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OpenLogin extends ChannelActions {

            /* renamed from: a, reason: collision with root package name */
            public static final OpenLogin f7669a = new OpenLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions$OpenPastOrderDetails;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ChannelActions;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenPastOrderDetails extends ChannelActions {

            /* renamed from: a, reason: collision with root package name */
            public final int f7670a;

            public OpenPastOrderDetails(int i) {
                this.f7670a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenPastOrderDetails) && this.f7670a == ((OpenPastOrderDetails) obj).f7670a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f7670a);
            }

            public final String toString() {
                return YU.a.e(this.f7670a, "OpenPastOrderDetails(orderId=", ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState;", "", "StarRating", "FeedbackInput", "ThankYou", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$FeedbackInput;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$ThankYou;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface DriverRatingState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$FeedbackInput;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FeedbackInput implements DriverRatingState {
            public final Set d;
            public final String e;
            public final StarCount f;
            public final boolean g;

            public FeedbackInput(Set set, String str, StarCount starCount, boolean z) {
                this.d = set;
                this.e = str;
                this.f = starCount;
                this.g = z;
            }

            public static FeedbackInput a(FeedbackInput feedbackInput, Set set, String inputText, boolean z, int i) {
                if ((i & 1) != 0) {
                    set = feedbackInput.d;
                }
                if ((i & 2) != 0) {
                    inputText = feedbackInput.e;
                }
                StarCount starCount = feedbackInput.f;
                if ((i & 8) != 0) {
                    z = feedbackInput.g;
                }
                Intrinsics.h(inputText, "inputText");
                return new FeedbackInput(set, inputText, starCount, z);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof FeedbackInput)) {
                    return false;
                }
                FeedbackInput feedbackInput = (FeedbackInput) obj;
                return Intrinsics.c(this.d, feedbackInput.d) && Intrinsics.c(this.e, feedbackInput.e) && this.f == feedbackInput.f && this.g == feedbackInput.g;
            }

            public final int hashCode() {
                Set set = this.d;
                return Boolean.hashCode(this.g) + ((this.f.hashCode() + androidx.camera.core.impl.b.c((set == null ? 0 : set.hashCode()) * 31, 31, this.e)) * 31);
            }

            public final String toString() {
                return "FeedbackInput(selectedChipIds=" + this.d + ", inputText=" + this.e + ", starCount=" + this.f + ", isSubmitting=" + this.g + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState;", "InitialNoStar", "NoStarAlert", "SelectedStar", "Companion", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating$InitialNoStar;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating$NoStarAlert;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating$SelectedStar;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class StarRating implements DriverRatingState {
            public static final int d;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating$Companion;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating$InitialNoStar;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class InitialNoStar extends StarRating {
                public static final InitialNoStar e = new InitialNoStar();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof InitialNoStar);
                }

                public final int hashCode() {
                    return -740420980;
                }

                public final String toString() {
                    return "InitialNoStar";
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating$NoStarAlert;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class NoStarAlert extends StarRating {
                public static final NoStarAlert e = new NoStarAlert();

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof NoStarAlert);
                }

                public final int hashCode() {
                    return 1395744030;
                }

                public final String toString() {
                    return "NoStarAlert";
                }
            }

            @StabilityInferred
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating$SelectedStar;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$StarRating;", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class SelectedStar extends StarRating {
                public final StarCount e;

                public SelectedStar(StarCount starCount) {
                    Intrinsics.h(starCount, "starCount");
                    this.e = starCount;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SelectedStar) && this.e == ((SelectedStar) obj).e;
                }

                public final int hashCode() {
                    return this.e.hashCode();
                }

                public final String toString() {
                    return "SelectedStar(starCount=" + this.e + ")";
                }
            }

            static {
                StarCount.Companion companion = StarCount.e;
                d = 5;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState$ThankYou;", "Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$DriverRatingState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ThankYou implements DriverRatingState {
            public static final ThankYou d;
            public static final ThankYou e;
            public static final ThankYou f;
            public static final /* synthetic */ ThankYou[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                ThankYou thankYou = new ThankYou("NEGATIVE", 0);
                d = thankYou;
                ThankYou thankYou2 = new ThankYou("NEUTRAL", 1);
                e = thankYou2;
                ThankYou thankYou3 = new ThankYou("GOOD", 2);
                f = thankYou3;
                ThankYou[] thankYouArr = {thankYou, thankYou2, thankYou3};
                g = thankYouArr;
                h = EnumEntriesKt.a(thankYouArr);
            }

            public static ThankYou valueOf(String str) {
                return (ThankYou) Enum.valueOf(ThankYou.class, str);
            }

            public static ThankYou[] values() {
                return (ThankYou[]) g.clone();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$LoadingState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoadingState {
        public static final LoadingState d;
        public static final LoadingState e;
        public static final LoadingState f;
        public static final LoadingState g;
        public static final /* synthetic */ LoadingState[] h;
        public static final /* synthetic */ EnumEntries i;

        static {
            LoadingState loadingState = new LoadingState("INITIALIZING", 0);
            d = loadingState;
            LoadingState loadingState2 = new LoadingState("BLOCKING_LOADING", 1);
            e = loadingState2;
            LoadingState loadingState3 = new LoadingState("REFRESHING", 2);
            f = loadingState3;
            LoadingState loadingState4 = new LoadingState("LOADED", 3);
            g = loadingState4;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4};
            h = loadingStateArr;
            i = EnumEntriesKt.a(loadingStateArr);
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) h.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/OrderDetailsContract$ViewState;", "", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final LoadingState f7671a;
        public final OrderDetailsFullPageErrorState b;
        public final OrderSummaryData c;

        public ViewState(LoadingState loadingState, OrderDetailsFullPageErrorState orderDetailsFullPageErrorState, OrderSummaryData orderSummaryData) {
            this.f7671a = loadingState;
            this.b = orderDetailsFullPageErrorState;
            this.c = orderSummaryData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7671a == viewState.f7671a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = this.f7671a.hashCode() * 31;
            OrderDetailsFullPageErrorState orderDetailsFullPageErrorState = this.b;
            int iHashCode2 = (iHashCode + (orderDetailsFullPageErrorState == null ? 0 : orderDetailsFullPageErrorState.hashCode())) * 31;
            OrderSummaryData orderSummaryData = this.c;
            return iHashCode2 + (orderSummaryData != null ? orderSummaryData.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(loadingState=" + this.f7671a + ", errorState=" + this.b + ", orderDetails=" + this.c + ")";
        }

        public /* synthetic */ ViewState(LoadingState loadingState, OrderDetailsFullPageErrorState orderDetailsFullPageErrorState, OrderSummaryData orderSummaryData, int i) {
            this(loadingState, (i & 2) != 0 ? null : orderDetailsFullPageErrorState, (i & 4) != 0 ? null : orderSummaryData);
        }
    }
}
