package au.com.woolworths.shop.checkout.ui.content;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.deeplink.h;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.bottomsheet.CheckoutRefundInfo;
import au.com.woolworths.shop.checkout.domain.model.Checkout;
import au.com.woolworths.shop.checkout.domain.model.CheckoutProduct;
import au.com.woolworths.shop.checkout.domain.model.LegacyNotifications;
import au.com.woolworths.shop.checkout.domain.model.RestrictionPromptData;
import au.com.woolworths.shop.checkout.domain.model.idverification.IdVerificationBottomSheet;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract;", "", "Actions", "ViewState", "BottomSheetViewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CheckoutContentContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001a\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u0082\u0001\u001a\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "", "LaunchDetailsScreen", "LaunchReviewScreen", "LaunchProductScreen", "LaunchSummaryScreen", "LaunchPaymentScreen", "LaunchZeroPayment", "LaunchIdVerificationBottomSheet", "LaunchRefundBottomSheet", "LaunchAddressPicker", "LaunchPickUpStoreLocator", "ExitAndLaunchProducts", "RewardsAuthentication", "AddBillingAddress", "DismissKeyboard", "ScrollToTop", "LaunchAlertDialog", "LaunchSnackBar", "LaunchBottomSheetContent", "LaunchSubstitutionScreen", "LaunchRewardsSetup", "LaunchShopperNoteScreen", "LeaveShopperNoteScreen", "LaunchLink", "ExitAndLaunchHome", "LaunchContactDetails", "LaunchRestrictionPrompt", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$AddBillingAddress;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$DismissKeyboard;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$ExitAndLaunchHome;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$ExitAndLaunchProducts;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchAddressPicker;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchAlertDialog;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchBottomSheetContent;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchContactDetails;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchDetailsScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchIdVerificationBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchLink;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchPaymentScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchPickUpStoreLocator;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchProductScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchRefundBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchRestrictionPrompt;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchReviewScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchRewardsSetup;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchShopperNoteScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchSnackBar;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchSubstitutionScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchSummaryScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchZeroPayment;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LeaveShopperNoteScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$RewardsAuthentication;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$ScrollToTop;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$AddBillingAddress;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class AddBillingAddress extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final AddBillingAddress f10729a = new AddBillingAddress();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$DismissKeyboard;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class DismissKeyboard extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final DismissKeyboard f10730a = new DismissKeyboard();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$ExitAndLaunchHome;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExitAndLaunchHome extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f10731a;

            public ExitAndLaunchHome(Text text) {
                this.f10731a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExitAndLaunchHome) && Intrinsics.c(this.f10731a, ((ExitAndLaunchHome) obj).f10731a);
            }

            public final int hashCode() {
                return this.f10731a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ExitAndLaunchHome(message=", this.f10731a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$ExitAndLaunchProducts;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExitAndLaunchProducts extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ExitAndLaunchProducts f10732a = new ExitAndLaunchProducts();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchAddressPicker;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAddressPicker extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f10733a;
            public final boolean b;

            public LaunchAddressPicker(boolean z, boolean z2) {
                this.f10733a = z;
                this.b = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchAddressPicker)) {
                    return false;
                }
                LaunchAddressPicker launchAddressPicker = (LaunchAddressPicker) obj;
                return this.f10733a == launchAddressPicker.f10733a && this.b == launchAddressPicker.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f10733a) * 31);
            }

            public final String toString() {
                return "LaunchAddressPicker(hasPrevious=" + this.f10733a + ", isAlternate=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchAlertDialog;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAlertDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f10734a;
            public final Text b;
            public final Text c;
            public final Function0 d;
            public final Text e;
            public final Function0 f;

            public LaunchAlertDialog(Text text, Text text2, Text text3, Function0 function0, Text text4, au.com.woolworths.shop.checkout.ui.summary.b bVar) {
                this.f10734a = text;
                this.b = text2;
                this.c = text3;
                this.d = function0;
                this.e = text4;
                this.f = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchAlertDialog)) {
                    return false;
                }
                LaunchAlertDialog launchAlertDialog = (LaunchAlertDialog) obj;
                return Intrinsics.c(this.f10734a, launchAlertDialog.f10734a) && Intrinsics.c(this.b, launchAlertDialog.b) && Intrinsics.c(this.c, launchAlertDialog.c) && Intrinsics.c(this.d, launchAlertDialog.d) && Intrinsics.c(this.e, launchAlertDialog.e) && Intrinsics.c(this.f, launchAlertDialog.f);
            }

            public final int hashCode() {
                Text text = this.f10734a;
                int iHashCode = (text == null ? 0 : text.hashCode()) * 31;
                Text text2 = this.b;
                int iHashCode2 = (this.c.hashCode() + ((iHashCode + (text2 == null ? 0 : text2.hashCode())) * 31)) * 31;
                Function0 function0 = this.d;
                int iHashCode3 = (iHashCode2 + (function0 == null ? 0 : function0.hashCode())) * 31;
                Text text3 = this.e;
                int iHashCode4 = (iHashCode3 + (text3 == null ? 0 : text3.hashCode())) * 31;
                Function0 function02 = this.f;
                return iHashCode4 + (function02 != null ? function02.hashCode() : 0);
            }

            public final String toString() {
                return "LaunchAlertDialog(title=" + this.f10734a + ", message=" + this.b + ", buttonTitle=" + this.c + ", callback=" + this.d + ", secondaryButtonTitle=" + this.e + ", secondaryCallback=" + this.f + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchBottomSheetContent;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchBottomSheetContent extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final BottomSheetContent.MarketplacePickUp f10735a;

            public LaunchBottomSheetContent(BottomSheetContent.MarketplacePickUp marketplacePickUp) {
                this.f10735a = marketplacePickUp;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchBottomSheetContent) && Intrinsics.c(this.f10735a, ((LaunchBottomSheetContent) obj).f10735a);
            }

            public final int hashCode() {
                return this.f10735a.hashCode();
            }

            public final String toString() {
                return "LaunchBottomSheetContent(bottomSheetContent=" + this.f10735a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchContactDetails;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchContactDetails extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10736a;
            public final String b;

            public LaunchContactDetails(String str, String str2) {
                this.f10736a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchContactDetails)) {
                    return false;
                }
                LaunchContactDetails launchContactDetails = (LaunchContactDetails) obj;
                return Intrinsics.c(this.f10736a, launchContactDetails.f10736a) && Intrinsics.c(this.b, launchContactDetails.b);
            }

            public final int hashCode() {
                int iHashCode = this.f10736a.hashCode() * 31;
                String str = this.b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return YU.a.j("LaunchContactDetails(placeholder=", this.f10736a, ", phoneNumber=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchDetailsScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchDetailsScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchDetailsScreen f10737a = new LaunchDetailsScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchIdVerificationBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchIdVerificationBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final IdVerificationBottomSheet f10738a;
            public final boolean b;

            public LaunchIdVerificationBottomSheet(IdVerificationBottomSheet idVerificationBottomSheet, boolean z) {
                Intrinsics.h(idVerificationBottomSheet, "idVerificationBottomSheet");
                this.f10738a = idVerificationBottomSheet;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchIdVerificationBottomSheet)) {
                    return false;
                }
                LaunchIdVerificationBottomSheet launchIdVerificationBottomSheet = (LaunchIdVerificationBottomSheet) obj;
                return Intrinsics.c(this.f10738a, launchIdVerificationBottomSheet.f10738a) && this.b == launchIdVerificationBottomSheet.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.f10738a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchIdVerificationBottomSheet(idVerificationBottomSheet=" + this.f10738a + ", isRetry=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchLink;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10739a;

            public LaunchLink(String url) {
                Intrinsics.h(url, "url");
                this.f10739a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchLink) && Intrinsics.c(this.f10739a, ((LaunchLink) obj).f10739a);
            }

            public final int hashCode() {
                return this.f10739a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchLink(url=", this.f10739a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchPaymentScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchPaymentScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f10740a;

            public LaunchPaymentScreen(boolean z) {
                this.f10740a = z;
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchPickUpStoreLocator;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchPickUpStoreLocator extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchPickUpStoreLocator f10741a = new LaunchPickUpStoreLocator();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchProductScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchProductScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchProductScreen f10742a = new LaunchProductScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchRefundBottomSheet;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRefundBottomSheet extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CheckoutRefundInfo f10743a;

            public LaunchRefundBottomSheet(CheckoutRefundInfo refundInfo) {
                Intrinsics.h(refundInfo, "refundInfo");
                this.f10743a = refundInfo;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchRefundBottomSheet) && Intrinsics.c(this.f10743a, ((LaunchRefundBottomSheet) obj).f10743a);
            }

            public final int hashCode() {
                return this.f10743a.hashCode();
            }

            public final String toString() {
                return "LaunchRefundBottomSheet(refundInfo=" + this.f10743a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchRestrictionPrompt;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRestrictionPrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final RestrictionPromptData f10744a;
            public final androidx.work.impl.utils.c b;
            public final h c;

            public LaunchRestrictionPrompt(RestrictionPromptData restrictionPrompt, androidx.work.impl.utils.c cVar, h hVar) {
                Intrinsics.h(restrictionPrompt, "restrictionPrompt");
                this.f10744a = restrictionPrompt;
                this.b = cVar;
                this.c = hVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchRestrictionPrompt)) {
                    return false;
                }
                LaunchRestrictionPrompt launchRestrictionPrompt = (LaunchRestrictionPrompt) obj;
                return Intrinsics.c(this.f10744a, launchRestrictionPrompt.f10744a) && this.b.equals(launchRestrictionPrompt.b) && this.c.equals(launchRestrictionPrompt.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + ((this.b.hashCode() + (this.f10744a.hashCode() * 31)) * 31);
            }

            public final String toString() {
                return "LaunchRestrictionPrompt(restrictionPrompt=" + this.f10744a + ", onConfirmClick=" + this.b + ", onDeclineClick=" + this.c + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchReviewScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchReviewScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchReviewScreen f10745a = new LaunchReviewScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchRewardsSetup;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRewardsSetup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchRewardsSetup f10746a = new LaunchRewardsSetup();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchRewardsSetup);
            }

            public final int hashCode() {
                return -613275848;
            }

            public final String toString() {
                return "LaunchRewardsSetup";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchShopperNoteScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchShopperNoteScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CheckoutProduct f10747a;

            public LaunchShopperNoteScreen(CheckoutProduct checkoutProduct) {
                this.f10747a = checkoutProduct;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchShopperNoteScreen) && Intrinsics.c(this.f10747a, ((LaunchShopperNoteScreen) obj).f10747a);
            }

            public final int hashCode() {
                return this.f10747a.hashCode();
            }

            public final String toString() {
                return "LaunchShopperNoteScreen(product=" + this.f10747a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchSnackBar;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSnackBar extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f10748a;

            public LaunchSnackBar(Text text) {
                this.f10748a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchSnackBar) && Intrinsics.c(this.f10748a, ((LaunchSnackBar) obj).f10748a);
            }

            public final int hashCode() {
                return this.f10748a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("LaunchSnackBar(message=", this.f10748a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchSubstitutionScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSubstitutionScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f10749a;
            public final double b;

            public LaunchSubstitutionScreen(String str, double d) {
                this.f10749a = str;
                this.b = d;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchSubstitutionScreen)) {
                    return false;
                }
                LaunchSubstitutionScreen launchSubstitutionScreen = (LaunchSubstitutionScreen) obj;
                return Intrinsics.c(this.f10749a, launchSubstitutionScreen.f10749a) && Double.compare(this.b, launchSubstitutionScreen.b) == 0;
            }

            public final int hashCode() {
                return Double.hashCode(this.b) + (this.f10749a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "LaunchSubstitutionScreen(productId=", this.f10749a, ", quantity=");
                sbR.append(")");
                return sbR.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchSummaryScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSummaryScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSummaryScreen f10750a = new LaunchSummaryScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LaunchZeroPayment;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchZeroPayment extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchZeroPayment f10751a = new LaunchZeroPayment();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$LeaveShopperNoteScreen;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LeaveShopperNoteScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LeaveShopperNoteScreen f10752a = new LeaveShopperNoteScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LeaveShopperNoteScreen);
            }

            public final int hashCode() {
                return -1969009926;
            }

            public final String toString() {
                return "LeaveShopperNoteScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$RewardsAuthentication;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RewardsAuthentication extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RewardsAuthentication f10753a = new RewardsAuthentication();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions$ScrollToTop;", "Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$Actions;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ScrollToTop extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ScrollToTop f10754a = new ScrollToTop();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$BottomSheetViewState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheetViewState {
        public static final BottomSheetViewState e;
        public static final BottomSheetViewState f;
        public static final /* synthetic */ BottomSheetViewState[] g;
        public static final /* synthetic */ EnumEntries h;
        public final int d;

        static {
            BottomSheetViewState bottomSheetViewState = new BottomSheetViewState("EXPANDED", 0, 3);
            e = bottomSheetViewState;
            BottomSheetViewState bottomSheetViewState2 = new BottomSheetViewState("COLLAPSED", 1, 4);
            f = bottomSheetViewState2;
            BottomSheetViewState[] bottomSheetViewStateArr = {bottomSheetViewState, bottomSheetViewState2};
            g = bottomSheetViewStateArr;
            h = EnumEntriesKt.a(bottomSheetViewStateArr);
        }

        public BottomSheetViewState(String str, int i, int i2) {
            this.d = i2;
        }

        public static BottomSheetViewState valueOf(String str) {
            return (BottomSheetViewState) Enum.valueOf(BottomSheetViewState.class, str);
        }

        public static BottomSheetViewState[] values() {
            return (BottomSheetViewState[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/content/CheckoutContentContract$ViewState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10755a;
        public final boolean b;
        public final CheckoutFullPageErrorState c;
        public final Checkout d;
        public final LegacyNotifications e;
        public final boolean f;
        public final ModalBottomSheetData g;
        public final boolean h;

        public /* synthetic */ ViewState(boolean z, CheckoutFullPageErrorState checkoutFullPageErrorState, Checkout checkout, boolean z2, boolean z3, int i) {
            this(false, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : checkoutFullPageErrorState, (i & 8) != 0 ? null : checkout, null, (i & 32) != 0 ? false : z2, null, (i & 128) != 0 ? false : z3);
        }

        public static ViewState a(ViewState viewState, boolean z, Checkout checkout, ModalBottomSheetData modalBottomSheetData, int i) {
            if ((i & 1) != 0) {
                z = viewState.f10755a;
            }
            boolean z2 = z;
            boolean z3 = viewState.b;
            CheckoutFullPageErrorState checkoutFullPageErrorState = viewState.c;
            if ((i & 8) != 0) {
                checkout = viewState.d;
            }
            Checkout checkout2 = checkout;
            LegacyNotifications legacyNotifications = (i & 16) != 0 ? viewState.e : null;
            boolean z4 = viewState.f;
            if ((i & 64) != 0) {
                modalBottomSheetData = viewState.g;
            }
            boolean z5 = viewState.h;
            viewState.getClass();
            return new ViewState(z2, z3, checkoutFullPageErrorState, checkout2, legacyNotifications, z4, modalBottomSheetData, z5);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f10755a == viewState.f10755a && this.b == viewState.b && this.c == viewState.c && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f && Intrinsics.c(this.g, viewState.g) && this.h == viewState.h;
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f10755a) * 31, 31, this.b);
            CheckoutFullPageErrorState checkoutFullPageErrorState = this.c;
            int iHashCode = (iE + (checkoutFullPageErrorState == null ? 0 : checkoutFullPageErrorState.hashCode())) * 31;
            Checkout checkout = this.d;
            int iHashCode2 = (iHashCode + (checkout == null ? 0 : checkout.hashCode())) * 31;
            LegacyNotifications legacyNotifications = this.e;
            int iE2 = androidx.camera.core.impl.b.e((iHashCode2 + (legacyNotifications == null ? 0 : legacyNotifications.hashCode())) * 31, 31, this.f);
            ModalBottomSheetData modalBottomSheetData = this.g;
            return Boolean.hashCode(this.h) + ((iE2 + (modalBottomSheetData != null ? modalBottomSheetData.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(isLoading=", ", isButtonEnabled=", ", fullPageErrorState=", this.f10755a, this.b);
            sbV.append(this.c);
            sbV.append(", checkout=");
            sbV.append(this.d);
            sbV.append(", legacyNotifications=");
            sbV.append(this.e);
            sbV.append(", shouldShowCmoBanner=");
            sbV.append(this.f);
            sbV.append(", modalBottomSheetData=");
            sbV.append(this.g);
            sbV.append(", isRestrictionPromptConfirmed=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }

        public ViewState(boolean z, boolean z2, CheckoutFullPageErrorState checkoutFullPageErrorState, Checkout checkout, LegacyNotifications legacyNotifications, boolean z3, ModalBottomSheetData modalBottomSheetData, boolean z4) {
            this.f10755a = z;
            this.b = z2;
            this.c = checkoutFullPageErrorState;
            this.d = checkout;
            this.e = legacyNotifications;
            this.f = z3;
            this.g = modalBottomSheetData;
            this.h = z4;
        }
    }
}
