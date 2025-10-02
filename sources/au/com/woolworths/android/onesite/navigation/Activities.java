package au.com.woolworths.android.onesite.navigation;

import YU.a;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.data.WarningBanner;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.shop.lists.data.remote.SuggestedListsQuery;
import com.google.gson.annotations.SerializedName;
import com.woolworths.R;
import com.woolworths.shop.recipes.RecipeListQuery;
import com.woolworths.shop.recipes.SavedRecipesQuery;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0003\b¥\u0001\bÆ\u0002\u0018\u00002\u00020\u0001:Ê\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001\u0088\u0001\u0089\u0001\u008a\u0001\u008b\u0001\u008c\u0001\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001\u0092\u0001\u0093\u0001\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001¤\u0001¥\u0001¨\u0006¦\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities;", "", "LaunchScanAndGo", "ShopAppSplash", "AppConfigAction", "DebugLogin", "Authentication", "RewardsAuthenticationNew", "Splash", "RewardsAccountSettings", "RewardsHomepageLegacy", "RewardsLiteModeHome", "RewardsLiteModeOnboarding", "ScanPaymentQrCode", "RewardsGiftingAddCard", "RewardsGiftingPayment", "RewardsWalletOcr", "RewardsGiftingStore", "RewardsGiftingStorePurchaseGiftCard", "RewardsShopProductDetails", "RewardsShopResendGiftCard", "RewardsShopOrderDetails", "RewardsShopOrderEnquiry", "RewardsProductCategories", "RewardsOrdersActivity", "RewardsCheckoutActivity", "RewardsGiftingStoreProductDetails", "RewardsVouchersBottomSheet", "RewardsWalletOnePageCVP", "RewardsWalletLiteOnePageCvp", "RewardsWalletAddSchemeCardFlowCoordinator", "RewardsWalletViewSchemeCard", "RewardsWalletGiftCardsTabbed", "RewardsWalletPaymentSettings", "RewardsWalletAddPaymentMethod", "RewardsWalletGiftCardDetails", "RewardsCampaigns", "RewardsWalletGiftCardHowToRedeem", "RewardsWalletGiftCardTransactions", "RewardsWalletAddGiftCard", "RewardsWalletUpdateSchemeCard", "RewardsWalletAddSchemeCard", "RewardsOfferDetailsOld", "RewardsOfferDetails", "RewardsPreferenceDetails", "RewardsPreferenceDetailsBottomSheet", "MainActivity", "ModeSelectorActivity", "Welcome", "CountrySelector", "DevOptions2", "OnboardingSdui", "Onboarding", "ShippingCalculator", "CollectionModeSetup", "ProductSubCategory", "ProductListV2", "ComposeProductList", "ComposeProductListLegacy", "ProductList", "StoreDetailsLegacy", "StoreDetails", "LegacyProductDetails", "Promotion", "RewardsPartner", "RewardsPartnerSearch", "Cart", "InstoreCart", "RecipeDetails", SavedRecipesQuery.OPERATION_NAME, RecipeListQuery.OPERATION_NAME, "RecipeSearch", "FeedbackForm", "Feedback2Form", "FreshMagHome", "RewardsCardOverlay", "DynamicPageActivity", "Search", "SignUp", "LogIn", "WebLinkActivity", "WebViewActivity", "BrandedShopActivity", "CatalogueHome", "CataloguePromotionDetails", "ImageGallery", "RewardsPromoApp", "BarcodeScannerLegacy", "BarcodeScanner", "MyOrders", "OrderDetails", "OrderDetailsYourGroceries", "CreateUpdateShoppingList", "ShoppingListDetails", "ViewSimilarProductsActivity", "SngListsActivity", "ShopListGuestOnboardingActivity", "SngCartActivity", "SngParkingVoucherActivity", "SngSearchActivity", "SngScannerActivityOld", "SngScannerActivity", "SngSettingsScreen", "ShopRewardsActivity", "RewardsActivityLegacy", "RewardsSetupMoreActivity", "RewardsSetupPrimingActivity", "StoreLocatorLegacy", "StoreLocator", "MagicLinkActivity", "RewardsCallbackUrlActivity", "DeliveryUnlimitedSignUpLanding", "MarketplaceActivity", "ScanAndGoEntryActivity", "SngRewardsSetupActivity", "InstoreWifiActivity", "RewardsInstoreWifiActivity", "CheckoutActivity", "TimeSelectorActivity", "ProductsReviewActivity", "BuyAgainActivity", "BundlesActivity", "DeliveryAddressSearchActivity", "ManageFullDeliveryAddressesActivity", "PickUpLocatorActivity", "AskOliveActivity", "HaveYouForgotten", "VocFreeText", "ShopReceiptListActivity", "EditOrderErrorActivity", "Inbox", "PreferencesDetails", "RewardsBottomSheet", "FinalGlanceBottomSheet", "FulfilmentWindowSelectionActivity", "ShopHealthyLifeFoodTrackerActivity", "CopyToClipboardActionActivity", "CampaignVideoActivity", "NotificationOptInActivity", "OnlineEReceiptDetails", "ActivityDetails", "PersonalisedOffers", "SharedEReceiptDetails", "ContentPage", "ProductAvailabilityActivity", "OriientInstoreMapActivity", "RewardsWowReferralActivity", "DeleteAccountActivity", "AccountDetailsActivity", "SecurityPreferencesSecureDollarsActivity", "FullPageVideoPlayerActivity", "RewardsInsightsHomeActivity", "EverydayExtraNativeSignUpActivity", "SubmitReviewActivity", "RatingsAndReviewsActivity", "ProductDetailsActivity", "RewardsSearchActivity", "RewardsProductListActivity", "ProductFinderActivity", "DeliveryUnlimitedPaymentActivity", "CmoReviewActivity", "ShopAppLauncher", "RewardsAppLauncher", "OrderConfirmation", "PastShopsActivity", "ShopAppDeepLinkHandler", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Activities {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$AccountDetailsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AccountDetailsActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final AccountDetailsActivity f4445a = new AccountDetailsActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.account.ui.details.AccountDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ActivityDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActivityDetails implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ActivityDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String id) {
                Intrinsics.h(id, "id");
                this.d = id;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(id=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.activity.details.ActivityDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$AskOliveActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AskOliveActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final AskOliveActivity f4447a = new AskOliveActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$AskOliveActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str, String str2, String str3) {
                this.d = str;
                this.e = str2;
                this.f = str3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.e;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f;
                return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
            }

            public final String toString() {
                return a.o(a.v("Extras(title=", this.d, ", url=", this.e, ", firstExecutedQuery="), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        public static Intent b(int i, String str, String str2, String str3) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = null;
            }
            Intent intentA = ActivityNavigatorKt.a(f4447a, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", new Extras(str, str2, str3));
            return intentA;
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.ask.olive.ui.AskOliveActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Authentication;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "ExtrasStepUp", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Authentication implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Authentication f4448a = new Authentication();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Authentication$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public /* synthetic */ Extras(int i) {
                this(false, (i & 2) == 0);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && this.e == extras.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (Boolean.hashCode(this.d) * 31);
            }

            public final String toString() {
                return "Extras(isForceLogout=" + this.d + ", isSignUp=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
            }

            public Extras(boolean z, boolean z2) {
                this.d = z;
                this.e = z2;
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Authentication$ExtrasStepUp;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasStepUp implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasStepUp> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasStepUp> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasStepUp createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasStepUp(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasStepUp[] newArray(int i) {
                    return new ExtrasStepUp[i];
                }
            }

            public ExtrasStepUp(String stepUpUrl) {
                Intrinsics.h(stepUpUrl, "stepUpUrl");
                this.d = stepUpUrl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasStepUp) && Intrinsics.c(this.d, ((ExtrasStepUp) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasStepUp(stepUpUrl=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$BarcodeScanner;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BarcodeScanner implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final BarcodeScanner f4449a = new BarcodeScanner();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$BarcodeScannerLegacy;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BarcodeScannerLegacy implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final BarcodeScannerLegacy f4450a = new BarcodeScannerLegacy();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.barcode.scanner.BarcodeScannerLegacyActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$BrandedShopActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BrandedShopActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final BrandedShopActivity f4451a = new BrandedShopActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$BrandedShopActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("Extras(contentId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.brandedshop.BrandedShopActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$BundlesActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BundlesActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final BundlesActivity f4452a = new BundlesActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$BundlesActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt() != 0, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(boolean z, String str) {
                this.d = z;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.d) * 31;
                String str = this.e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.m("Extras(initialLoad=", this.d, ", argument=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.bundles.BundlesActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$BuyAgainActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BuyAgainActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final BuyAgainActivity f4453a = new BuyAgainActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.buyagain.ui.BuyAgainActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CampaignVideoActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CampaignVideoActivity implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.campaign.video.CampaignVideoActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Cart;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cart implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Cart f4454a = new Cart();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.cart.ui.CartActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CatalogueHome;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class CatalogueHome implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CatalogueHome f4455a = new CatalogueHome();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CatalogueHome$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("Extras(deepLink=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CataloguePromotionDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extra", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CataloguePromotionDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CataloguePromotionDetails f4456a = new CataloguePromotionDetails();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CataloguePromotionDetails$Extra;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extra implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extra> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final String g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extra> {
                @Override // android.os.Parcelable.Creator
                public final Extra createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extra(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extra[] newArray(int i) {
                    return new Extra[i];
                }
            }

            public Extra(String str, String str2, String str3, String str4) {
                this.d = str;
                this.e = str2;
                this.f = str3;
                this.g = str4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extra)) {
                    return false;
                }
                Extra extra = (Extra) obj;
                return Intrinsics.c(this.d, extra.d) && Intrinsics.c(this.e, extra.e) && Intrinsics.c(this.f, extra.f) && Intrinsics.c(this.g, extra.g);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.e;
                int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.f;
                int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.g;
                return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
            }

            public final String toString() {
                return androidx.constraintlayout.core.state.a.l(a.v("Extra(productId=", this.d, ", offerId=", this.e, ", requestSource="), this.f, ", containerTitle=", this.g, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.catalogue.listing.promotion.details.PromotionDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CheckoutActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CheckoutActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CheckoutActivity f4457a = new CheckoutActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CmoReviewActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Result", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CmoReviewActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CmoReviewActivity f4458a = new CmoReviewActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CmoReviewActivity$Result;", "Landroid/os/Parcelable;", "Destination", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Result implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Result> CREATOR = new Creator();
            public final Destination d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Result> {
                @Override // android.os.Parcelable.Creator
                public final Result createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Result(Destination.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Result[] newArray(int i) {
                    return new Result[i];
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CmoReviewActivity$Result$Destination;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Destination {
                public static final Destination d;
                public static final Destination e;
                public static final /* synthetic */ Destination[] f;
                public static final /* synthetic */ EnumEntries g;

                static {
                    Destination destination = new Destination("ORDER_DETAIL", 0);
                    d = destination;
                    Destination destination2 = new Destination("SCREEN_BEFORE_ORDER_DETAIL", 1);
                    e = destination2;
                    Destination[] destinationArr = {destination, destination2};
                    f = destinationArr;
                    g = EnumEntriesKt.a(destinationArr);
                }

                public static Destination valueOf(String str) {
                    return (Destination) Enum.valueOf(Destination.class, str);
                }

                public static Destination[] values() {
                    return (Destination[]) f.clone();
                }
            }

            public Result(Destination destination, String str) {
                Intrinsics.h(destination, "destination");
                this.d = destination;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return this.d == result.d && Intrinsics.c(this.e, result.e);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "Result(destination=" + this.d + ", message=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.editorder.review.CmoReviewActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CollectionModeSetup;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "CollectionModeSetupData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CollectionModeSetup implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CollectionModeSetup f4459a = new CollectionModeSetup();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CollectionModeSetup$CollectionModeSetupData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CollectionModeSetupData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CollectionModeSetupData> CREATOR = new Creator();
            public final boolean d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CollectionModeSetupData> {
                @Override // android.os.Parcelable.Creator
                public final CollectionModeSetupData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new CollectionModeSetupData(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final CollectionModeSetupData[] newArray(int i) {
                    return new CollectionModeSetupData[i];
                }
            }

            public CollectionModeSetupData(boolean z) {
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CollectionModeSetupData) && this.d == ((CollectionModeSetupData) obj).d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("CollectionModeSetupData(showToolbar=", ")", this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ComposeProductList;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComposeProductList implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.product.list.ComposeProductListActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ComposeProductListLegacy;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ComposeProductListLegacy implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ComposeProductListLegacy f4460a = new ComposeProductListLegacy();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.product.list.legacy.ComposeProductListActivity";
        }

        public final Intent b(ProductList.Extras extras) {
            Intent intentPutExtra = ActivityNavigatorKt.a(this, ApplicationType.e).setFlags(335544320).putExtra("EXTRA_PRODUCT_LIST_INFO", extras);
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final Intent c(ProductList.ProductListType productListType) {
            Intrinsics.h(productListType, "productListType");
            return b(new ProductList.Extras(new ProductList.ExtrasPageData("", null), new ProductList.ExtrasBySearch("", (List) null, (String) null, productListType, 14), (ProductList.ExtrasConfig) null, 12));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ContentPage;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ContentPageType", "ContentPageExtras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentPage implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentPage f4461a = new ContentPage();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ContentPage$ContentPageExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ContentPageExtras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ContentPageExtras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final ContentPageType f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ContentPageExtras> {
                @Override // android.os.Parcelable.Creator
                public final ContentPageExtras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ContentPageExtras(ContentPageType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ContentPageExtras[] newArray(int i) {
                    return new ContentPageExtras[i];
                }
            }

            public ContentPageExtras(ContentPageType pageType, String pageId, String str) {
                Intrinsics.h(pageId, "pageId");
                Intrinsics.h(pageType, "pageType");
                this.d = pageId;
                this.e = str;
                this.f = pageType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ContentPageExtras)) {
                    return false;
                }
                ContentPageExtras contentPageExtras = (ContentPageExtras) obj;
                return Intrinsics.c(this.d, contentPageExtras.d) && Intrinsics.c(this.e, contentPageExtras.e) && this.f == contentPageExtras.f;
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sbV = a.v("ContentPageExtras(pageId=", this.d, ", pageTitle=", this.e, ", pageType=");
                sbV.append(this.f);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                this.f.writeToParcel(dest, i);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Parcelize
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ContentPage$ContentPageType;", "Landroid/os/Parcelable;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ContentPageType implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ContentPageType> CREATOR;
            public static final ContentPageType e;
            public static final ContentPageType f;
            public static final ContentPageType g;
            public static final ContentPageType h;
            public static final ContentPageType i;
            public static final ContentPageType j;
            public static final ContentPageType k;
            public static final ContentPageType l;
            public static final ContentPageType m;
            public static final ContentPageType n;
            public static final ContentPageType o;
            public static final ContentPageType p;
            public static final ContentPageType q;
            public static final ContentPageType r;
            public static final ContentPageType s;
            public static final ContentPageType t;
            public static final ContentPageType u;
            public static final ContentPageType v;
            public static final /* synthetic */ ContentPageType[] w;
            public static final /* synthetic */ EnumEntries x;
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ContentPageType> {
                @Override // android.os.Parcelable.Creator
                public final ContentPageType createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return ContentPageType.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ContentPageType[] newArray(int i) {
                    return new ContentPageType[i];
                }
            }

            static {
                ContentPageType contentPageType = new ContentPageType("HAVE_YOU_FORGOTTEN", 0, "haveYouForgotten");
                e = contentPageType;
                ContentPageType contentPageType2 = new ContentPageType("GUIDES", 1, "guides");
                f = contentPageType2;
                ContentPageType contentPageType3 = new ContentPageType("ARTICLES", 2, "articles");
                g = contentPageType3;
                ContentPageType contentPageType4 = new ContentPageType("IDEAS", 3, "ideas");
                h = contentPageType4;
                ContentPageType contentPageType5 = new ContentPageType("VIDEOS", 4, "videos");
                i = contentPageType5;
                ContentPageType contentPageType6 = new ContentPageType("FEATURED_BRAND", 5, "products_screen");
                j = contentPageType6;
                ContentPageType contentPageType7 = new ContentPageType("HOME", 6, "home_screen");
                k = contentPageType7;
                ContentPageType contentPageType8 = new ContentPageType("SERVICES", 7, "services");
                l = contentPageType8;
                ContentPageType contentPageType9 = new ContentPageType("HELP", 8, "help");
                m = contentPageType9;
                ContentPageType contentPageType10 = new ContentPageType("ABOUT", 9, "about");
                n = contentPageType10;
                ContentPageType contentPageType11 = new ContentPageType("EVERYDAY", 10, "everyday");
                o = contentPageType11;
                ContentPageType contentPageType12 = new ContentPageType("EVENTS", 11, "events");
                p = contentPageType12;
                ContentPageType contentPageType13 = new ContentPageType("RECIPES_HOME", 12, "recipes-and-ideas-app");
                q = contentPageType13;
                ContentPageType contentPageType14 = new ContentPageType("CONTENT_PLAYBOOK", 13, "content-playbook");
                r = contentPageType14;
                ContentPageType contentPageType15 = new ContentPageType("SAVED_RECIPES", 14, "recipes");
                s = contentPageType15;
                ContentPageType contentPageType16 = new ContentPageType("MORE_MENU", 15, "more_menu");
                t = contentPageType16;
                ContentPageType contentPageType17 = new ContentPageType("BRANDED_SHOP", 16, "brands");
                u = contentPageType17;
                ContentPageType contentPageType18 = new ContentPageType("SPECIALS_HOME", 17, "specials-home");
                v = contentPageType18;
                ContentPageType[] contentPageTypeArr = {contentPageType, contentPageType2, contentPageType3, contentPageType4, contentPageType5, contentPageType6, contentPageType7, contentPageType8, contentPageType9, contentPageType10, contentPageType11, contentPageType12, contentPageType13, contentPageType14, contentPageType15, contentPageType16, contentPageType17, contentPageType18};
                w = contentPageTypeArr;
                x = EnumEntriesKt.a(contentPageTypeArr);
                CREATOR = new Creator();
            }

            public ContentPageType(String str, int i2, String str2) {
                this.d = str2;
            }

            public static ContentPageType valueOf(String str) {
                return (ContentPageType) Enum.valueOf(ContentPageType.class, str);
            }

            public static ContentPageType[] values() {
                return (ContentPageType[]) w.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i2) {
                Intrinsics.h(dest, "dest");
                dest.writeString(name());
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.contentpage.ContentPageActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CopyToClipboardActionActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CopyToClipboardActionActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CopyToClipboardActionActivity f4462a = new CopyToClipboardActionActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CopyToClipboardActionActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str, String str2) {
                this.d = str;
                this.e = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.e;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return a.j("Extras(text=", this.d, ", message=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.copy.to.clipboard.CopyToClipboardActionActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CountrySelector;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "Source", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CountrySelector implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CountrySelector f4463a = new CountrySelector();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CountrySelector$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String source) {
                Intrinsics.h(source, "source");
                this.d = source;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(source=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CountrySelector$Source;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Source {
            public static final Source d;
            public static final Source e;
            public static final /* synthetic */ Source[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                Source source = new Source("Splash", 0);
                d = source;
                Source source2 = new Source("More", 1);
                e = source2;
                Source[] sourceArr = {source, source2};
                f = sourceArr;
                g = EnumEntriesKt.a(sourceArr);
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) f.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.countryselector.CountrySelectorActivity";
        }

        public final Intent b(Source source) {
            Intent intentPutExtra = ActivityNavigatorKt.a(this, ApplicationType.e).putExtra("EXTRA_SOURCE", new Extras(source.name()));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DebugLogin;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DebugLogin implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.account.authentication.RewardsBypassAuthenticationActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DeleteAccountActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeleteAccountActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final DeleteAccountActivity f4465a = new DeleteAccountActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.account.ui.delete.DeleteAccountActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DeliveryAddressSearchActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryAddressSearchActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryAddressSearchActivity f4466a = new DeliveryAddressSearchActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DeliveryAddressSearchActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;
            public final boolean e;
            public final boolean f;
            public final boolean g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(boolean z, boolean z2, boolean z3, boolean z4) {
                this.d = z;
                this.e = z2;
                this.f = z3;
                this.g = z4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && this.e == extras.e && this.f == extras.f && this.g == extras.g;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.g) + b.e(b.e(Boolean.hashCode(this.d) * 31, 31, this.e), 31, this.f);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.q(b.v("Extras(isAddressUsedForBilling=", ", isAddingNewAddress=", ", isAlternateAddress=", this.d, this.e), this.f, ", isInitialAddressPromptForNz=", this.g, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.g ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity";
        }

        public final Intent b(Extras extras) {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", extras);
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DeliveryUnlimitedPaymentActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedPaymentActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedPaymentActivity f4467a = new DeliveryUnlimitedPaymentActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DeliveryUnlimitedPaymentActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String planId) {
                Intrinsics.h(planId, "planId");
                this.d = planId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(planId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DeliveryUnlimitedSignUpLanding;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryUnlimitedSignUpLanding implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryUnlimitedSignUpLanding f4468a = new DeliveryUnlimitedSignUpLanding();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.deliveryunlimited.signup.landing.DeliveryUnlimitedSignUpLandingActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DevOptions2;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DevOptions2 implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final DevOptions2 f4469a = new DevOptions2();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.devoptions.DebugDevOptions2Activity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$DynamicPageActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DynamicPageActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final DynamicPageActivity f4470a = new DynamicPageActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.dynamic.page.ui.DynamicPageActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$EditOrderErrorActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EditOrderErrorActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final EditOrderErrorActivity f4471a = new EditOrderErrorActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$EditOrderErrorActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final Screens g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString(), parcel.readString(), Screens.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String title, String message, String buttonTitle, Screens analyticsScreen) {
                Intrinsics.h(title, "title");
                Intrinsics.h(message, "message");
                Intrinsics.h(buttonTitle, "buttonTitle");
                Intrinsics.h(analyticsScreen, "analyticsScreen");
                this.d = title;
                this.e = message;
                this.f = buttonTitle;
                this.g = analyticsScreen;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f) && this.g == extras.g;
            }

            public final int hashCode() {
                return this.g.hashCode() + b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f);
            }

            public final String toString() {
                StringBuilder sbV = a.v("Extras(title=", this.d, ", message=", this.e, ", buttonTitle=");
                sbV.append(this.f);
                sbV.append(", analyticsScreen=");
                sbV.append(this.g);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g.name());
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$EverydayExtraNativeSignUpActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "InitialScreen", "InitialInfo", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EverydayExtraNativeSignUpActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final EverydayExtraNativeSignUpActivity f4472a = new EverydayExtraNativeSignUpActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$EverydayExtraNativeSignUpActivity$InitialInfo;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class InitialInfo implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<InitialInfo> CREATOR = new Creator();
            public final String d;
            public final MagicLinkActivity.PreferredLaunchMode e;
            public final boolean f;
            public final InitialScreen g;
            public final String h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<InitialInfo> {
                @Override // android.os.Parcelable.Creator
                public final InitialInfo createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new InitialInfo(parcel.readString(), MagicLinkActivity.PreferredLaunchMode.valueOf(parcel.readString()), parcel.readInt() != 0, InitialScreen.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final InitialInfo[] newArray(int i) {
                    return new InitialInfo[i];
                }
            }

            public InitialInfo(String str, MagicLinkActivity.PreferredLaunchMode preferredLaunchMode, boolean z, InitialScreen initialScreen, String str2) {
                Intrinsics.h(preferredLaunchMode, "preferredLaunchMode");
                Intrinsics.h(initialScreen, "initialScreen");
                this.d = str;
                this.e = preferredLaunchMode;
                this.f = z;
                this.g = initialScreen;
                this.h = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof InitialInfo)) {
                    return false;
                }
                InitialInfo initialInfo = (InitialInfo) obj;
                return Intrinsics.c(this.d, initialInfo.d) && this.e == initialInfo.e && this.f == initialInfo.f && this.g == initialInfo.g && Intrinsics.c(this.h, initialInfo.h);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (this.g.hashCode() + b.e((this.e.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.f)) * 31;
                String str2 = this.h;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("InitialInfo(magicLinkPage=");
                sb.append(this.d);
                sb.append(", preferredLaunchMode=");
                sb.append(this.e);
                sb.append(", isEdxSignUp=");
                sb.append(this.f);
                sb.append(", initialScreen=");
                sb.append(this.g);
                sb.append(", acquisitionOfferName=");
                return a.o(sb, this.h, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e.name());
                dest.writeInt(this.f ? 1 : 0);
                dest.writeString(this.g.name());
                dest.writeString(this.h);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$EverydayExtraNativeSignUpActivity$InitialScreen;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class InitialScreen {
            public static final InitialScreen d;
            public static final InitialScreen e;
            public static final /* synthetic */ InitialScreen[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                InitialScreen initialScreen = new InitialScreen("LANDING", 0);
                d = initialScreen;
                InitialScreen initialScreen2 = new InitialScreen("CHOOSE_PLAN", 1);
                InitialScreen initialScreen3 = new InitialScreen("ONBOARDING", 2);
                e = initialScreen3;
                InitialScreen[] initialScreenArr = {initialScreen, initialScreen2, initialScreen3};
                f = initialScreenArr;
                g = EnumEntriesKt.a(initialScreenArr);
            }

            public static InitialScreen valueOf(String str) {
                return (InitialScreen) Enum.valueOf(InitialScreen.class, str);
            }

            public static InitialScreen[] values() {
                return (InitialScreen[]) f.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.everydayextras.signup.EverydayExtrasSignUpActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Feedback2Form;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasEncoded", "ExtrasPlain", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feedback2Form implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Feedback2Form f4473a = new Feedback2Form();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Feedback2Form$ExtrasEncoded;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasEncoded implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasEncoded> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasEncoded> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasEncoded createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasEncoded(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasEncoded[] newArray(int i) {
                    return new ExtrasEncoded[i];
                }
            }

            public ExtrasEncoded(String paramsEncoded) {
                Intrinsics.h(paramsEncoded, "paramsEncoded");
                this.d = paramsEncoded;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasEncoded) && Intrinsics.c(this.d, ((ExtrasEncoded) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasEncoded(paramsEncoded=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Feedback2Form$ExtrasPlain;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasPlain implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasPlain> CREATOR = new Creator();
            public final String d;
            public final Object e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasPlain> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasPlain createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.readString());
                    }
                    return new ExtrasPlain(string, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasPlain[] newArray(int i) {
                    return new ExtrasPlain[i];
                }
            }

            public ExtrasPlain(String formId, Map map) {
                Intrinsics.h(formId, "formId");
                this.d = formId;
                this.e = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasPlain)) {
                    return false;
                }
                ExtrasPlain extrasPlain = (ExtrasPlain) obj;
                return Intrinsics.c(this.d, extrasPlain.d) && this.e.equals(extrasPlain.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "ExtrasPlain(formId=" + this.d + ", paramsPlain=" + this.e + ")";
            }

            /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                ?? r4 = this.e;
                dest.writeInt(r4.size());
                for (Map.Entry entry : r4.entrySet()) {
                    dest.writeString((String) entry.getKey());
                    dest.writeString((String) entry.getValue());
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.feedback.ui.Feedback2FormActivity";
        }

        public final Intent b(String str, Map map) {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("FEEDBACK2_FORM_EXTRA_PLAIN", new ExtrasPlain(str, map));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FeedbackForm;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FeedbackForm implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final FeedbackForm f4474a = new FeedbackForm();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FeedbackForm$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;
            public final String i;
            public final String j;
            public final String k;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String formId, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
                Intrinsics.h(formId, "formId");
                this.d = formId;
                this.e = str;
                this.f = str2;
                this.g = str3;
                this.h = str4;
                this.i = str5;
                this.j = str6;
                this.k = str7;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f) && Intrinsics.c(this.g, extras.g) && Intrinsics.c(this.h, extras.h) && Intrinsics.c(this.i, extras.i) && Intrinsics.c(this.j, extras.j) && Intrinsics.c(this.k, extras.k);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.g;
                int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.h;
                int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.i;
                int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.j;
                int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.k;
                return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbV = a.v("Extras(formId=", this.d, ", interactionId=", this.e, ", brand=");
                androidx.constraintlayout.core.state.a.B(sbV, this.f, ", customerName=", this.g, ", sessionId=");
                androidx.constraintlayout.core.state.a.B(sbV, this.h, ", agentPlatform=", this.i, ", firstIntent=");
                return androidx.constraintlayout.core.state.a.l(sbV, this.j, ", lastIntent=", this.k, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
                dest.writeString(this.h);
                dest.writeString(this.i);
                dest.writeString(this.j);
                dest.writeString(this.k);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.feedback.ui.FeedbackFormActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FinalGlanceBottomSheet;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FinalGlanceBottomSheet implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FinalGlanceBottomSheet$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("Extras(acquisitionOfferName=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance.FinalGlanceBottomSheetActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FreshMagHome;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FreshMagHome implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final FreshMagHome f4475a = new FreshMagHome();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FulfilmentWindowSelectionActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowSelectionActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowSelectionActivity f4476a = new FulfilmentWindowSelectionActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FullPageVideoPlayerActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "Result", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FullPageVideoPlayerActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final FullPageVideoPlayerActivity f4477a = new FullPageVideoPlayerActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FullPageVideoPlayerActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;
            public final long i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(long j, String videoUrl, String videoTitle, String videoThumbnail, String videoDuration, String str) {
                Intrinsics.h(videoUrl, "videoUrl");
                Intrinsics.h(videoTitle, "videoTitle");
                Intrinsics.h(videoThumbnail, "videoThumbnail");
                Intrinsics.h(videoDuration, "videoDuration");
                this.d = videoUrl;
                this.e = videoTitle;
                this.f = videoThumbnail;
                this.g = videoDuration;
                this.h = str;
                this.i = j;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f) && Intrinsics.c(this.g, extras.g) && Intrinsics.c(this.h, extras.h) && this.i == extras.i;
            }

            public final int hashCode() {
                int iC = b.c(b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
                String str = this.h;
                return Long.hashCode(this.i) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                StringBuilder sbV = a.v("Extras(videoUrl=", this.d, ", videoTitle=", this.e, ", videoThumbnail=");
                androidx.constraintlayout.core.state.a.B(sbV, this.f, ", videoDuration=", this.g, ", videoId=");
                sbV.append(this.h);
                sbV.append(", videoProgress=");
                sbV.append(this.i);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
                dest.writeString(this.h);
                dest.writeLong(this.i);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$FullPageVideoPlayerActivity$Result;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Result implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Result> CREATOR = new Creator();
            public final String d;
            public final long e;
            public final String f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Result> {
                @Override // android.os.Parcelable.Creator
                public final Result createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Result(parcel.readString(), parcel.readLong(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Result[] newArray(int i) {
                    return new Result[i];
                }
            }

            public Result(String videoId, long j, String str) {
                Intrinsics.h(videoId, "videoId");
                this.d = videoId;
                this.e = j;
                this.f = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return Intrinsics.c(this.d, result.d) && this.e == result.e && Intrinsics.c(this.f, result.f);
            }

            public final int hashCode() {
                int iB = b.b(this.d.hashCode() * 31, 31, this.e);
                String str = this.f;
                return iB + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Result(videoId=");
                sb.append(this.d);
                sb.append(", videoProgress=");
                sb.append(this.e);
                return a.p(sb, ", message=", this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeLong(this.e);
                dest.writeString(this.f);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.video.FullPageVideoPlayerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$HaveYouForgotten;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HaveYouForgotten implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final HaveYouForgotten f4478a = new HaveYouForgotten();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.haveyouforgotten.HaveYouForgottenActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ImageGallery;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageGallery implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ImageGallery f4479a = new ImageGallery();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ImageGallery$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final List e;
            public final int f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readInt(), parcel.createStringArrayList());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String articleId, int i, List imageUrls) {
                Intrinsics.h(articleId, "articleId");
                Intrinsics.h(imageUrls, "imageUrls");
                this.d = articleId;
                this.e = imageUrls;
                this.f = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && this.f == extras.f;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f) + b.d(this.d.hashCode() * 31, 31, this.e);
            }

            public final String toString() {
                return a.m(au.com.woolworths.android.onesite.a.s("Extras(articleId=", this.d, ", imageUrls=", ", selectedPageIndex=", this.e), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeStringList(this.e);
                dest.writeInt(this.f);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.imagegallery.ProductImageGalleryActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Inbox;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Inbox implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Inbox f4480a = new Inbox();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.inbox.InboxActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$InstoreCart;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InstoreCart implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final InstoreCart f4481a = new InstoreCart();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.instore.cart.InstoreCartActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$InstoreWifiActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InstoreWifiActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final InstoreWifiActivity f4482a = new InstoreWifiActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LaunchScanAndGo;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LaunchScanAndGo implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final LaunchScanAndGo f4483a = new LaunchScanAndGo();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.splash.SngInitializerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasById", "ExtrasByData", "Extras", "ExtraProductDetailsSource", "ExtraProductDetailsData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LegacyProductDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final LegacyProductDetails f4484a = new LegacyProductDetails();

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$ExtraProductDetailsData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraProductDetailsData extends Parcelable {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$ExtraProductDetailsSource;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraProductDetailsSource extends Parcelable {
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final ExtraProductDetailsSource d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras((ExtraProductDetailsSource) parcel.readParcelable(Extras.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(ExtraProductDetailsSource productDetailsSource) {
                Intrinsics.h(productDetailsSource, "productDetailsSource");
                this.d = productDetailsSource;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "Extras(productDetailsSource=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$ExtrasByData;", "Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$ExtraProductDetailsSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByData implements ExtraProductDetailsSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByData> CREATOR = new Creator();
            public final ExtraProductDetailsData d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByData> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByData((ExtraProductDetailsData) parcel.readParcelable(ExtrasByData.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByData[] newArray(int i) {
                    return new ExtrasByData[i];
                }
            }

            public ExtrasByData(ExtraProductDetailsData productDetailsData) {
                Intrinsics.h(productDetailsData, "productDetailsData");
                this.d = productDetailsData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasByData) && Intrinsics.c(this.d, ((ExtrasByData) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "ExtrasByData(productDetailsData=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$ExtrasById;", "Lau/com/woolworths/android/onesite/navigation/Activities$LegacyProductDetails$ExtraProductDetailsSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasById implements ExtraProductDetailsSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasById> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasById> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasById createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasById(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasById[] newArray(int i) {
                    return new ExtrasById[i];
                }
            }

            public ExtrasById(String productId) {
                Intrinsics.h(productId, "productId");
                this.d = productId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasById) && Intrinsics.c(this.d, ((ExtrasById) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasById(productId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.product.details.LegacyProductDetailsActivity";
        }

        public final Intent b(String productId) {
            Intrinsics.h(productId, "productId");
            Intent intentPutExtra = ActivityNavigatorKt.a(this, ApplicationType.e).putExtra("EXTRA_PRODUCT_DETAILS_DATA", new Extras(new ExtrasById(productId)));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final void c(Activity activity, String productId) {
            Intrinsics.h(activity, "activity");
            Intrinsics.h(productId, "productId");
            activity.startActivity(b(productId));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LogIn;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes.dex */
    public static final class LogIn implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final LogIn f4485a = new LogIn();

        public static void c(Activity activity) {
            Intrinsics.h(activity, "activity");
            activity.startActivityForResult(ActivityNavigatorKt.a(f4485a, ApplicationType.e), com.salesforce.marketingcloud.analytics.b.s);
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.login.LoginActivity";
        }

        public final Intent b(Extras extras) {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("login_extras", extras);
            return intentA;
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LogIn$Extras;", "Landroid/os/Parcelable;", "LoginActivityExtras", "ParentActivityExtras", "Lau/com/woolworths/android/onesite/navigation/Activities$LogIn$Extras$LoginActivityExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$LogIn$Extras$ParentActivityExtras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Extras implements Parcelable {

            @Parcelize
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LogIn$Extras$LoginActivityExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$LogIn$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class LoginActivityExtras extends Extras {

                @NotNull
                public static final Parcelable.Creator<LoginActivityExtras> CREATOR = new Creator();
                public final String d;
                public final String e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* loaded from: classes3.dex */
                public static final class Creator implements Parcelable.Creator<LoginActivityExtras> {
                    @Override // android.os.Parcelable.Creator
                    public final LoginActivityExtras createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new LoginActivityExtras(parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final LoginActivityExtras[] newArray(int i) {
                        return new LoginActivityExtras[i];
                    }
                }

                public LoginActivityExtras(String str, String str2) {
                    this.d = str;
                    this.e = str2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof LoginActivityExtras)) {
                        return false;
                    }
                    LoginActivityExtras loginActivityExtras = (LoginActivityExtras) obj;
                    return Intrinsics.c(this.d, loginActivityExtras.d) && Intrinsics.c(this.e, loginActivityExtras.e);
                }

                public final int hashCode() {
                    String str = this.d;
                    int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.e;
                    return iHashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    return a.j("LoginActivityExtras(targetUrl=", this.d, ", emailToPrefill=", this.e, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.d);
                    dest.writeString(this.e);
                }

                public /* synthetic */ LoginActivityExtras(String str, String str2, int i) {
                    this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
                }
            }

            @Parcelize
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$LogIn$Extras$ParentActivityExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$LogIn$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class ParentActivityExtras extends Extras {

                @NotNull
                public static final Parcelable.Creator<ParentActivityExtras> CREATOR = new Creator();
                public final String d;
                public final boolean e;
                public final boolean f;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                /* loaded from: classes3.dex */
                public static final class Creator implements Parcelable.Creator<ParentActivityExtras> {
                    @Override // android.os.Parcelable.Creator
                    public final ParentActivityExtras createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new ParentActivityExtras(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ParentActivityExtras[] newArray(int i) {
                        return new ParentActivityExtras[i];
                    }
                }

                public ParentActivityExtras(String str, boolean z, boolean z2) {
                    this.d = str;
                    this.e = z;
                    this.f = z2;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ParentActivityExtras)) {
                        return false;
                    }
                    ParentActivityExtras parentActivityExtras = (ParentActivityExtras) obj;
                    return Intrinsics.c(this.d, parentActivityExtras.d) && this.e == parentActivityExtras.e && this.f == parentActivityExtras.f;
                }

                public final int hashCode() {
                    String str = this.d;
                    return Boolean.hashCode(this.f) + b.e((str == null ? 0 : str.hashCode()) * 31, 31, this.e);
                }

                public final String toString() {
                    return a.k(")", androidx.constraintlayout.core.state.a.q("ParentActivityExtras(targetUrl=", this.d, ", launchedFromSignup=", ", isSignUp=", this.e), this.f);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.d);
                    dest.writeInt(this.e ? 1 : 0);
                    dest.writeInt(this.f ? 1 : 0);
                }

                public /* synthetic */ ParentActivityExtras(String str, int i) {
                    this((i & 1) != 0 ? null : str, (i & 2) == 0, (i & 4) == 0);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$MagicLinkActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "PreferredLaunchMode", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MagicLinkActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final MagicLinkActivity f4486a = new MagicLinkActivity();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$MagicLinkActivity$PreferredLaunchMode;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PreferredLaunchMode {
            public static final PreferredLaunchMode d;
            public static final PreferredLaunchMode e;
            public static final /* synthetic */ PreferredLaunchMode[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                PreferredLaunchMode preferredLaunchMode = new PreferredLaunchMode("WEB_VIEW", 0);
                d = preferredLaunchMode;
                PreferredLaunchMode preferredLaunchMode2 = new PreferredLaunchMode("CHROME_TAB", 1);
                e = preferredLaunchMode2;
                PreferredLaunchMode[] preferredLaunchModeArr = {preferredLaunchMode, preferredLaunchMode2};
                f = preferredLaunchModeArr;
                g = EnumEntriesKt.a(preferredLaunchModeArr);
            }

            public static PreferredLaunchMode valueOf(String str) {
                return (PreferredLaunchMode) Enum.valueOf(PreferredLaunchMode.class, str);
            }

            public static PreferredLaunchMode[] values() {
                return (PreferredLaunchMode[]) f.clone();
            }
        }

        public static Intent b(String str, String str2, PreferredLaunchMode preferredLaunchMode) {
            Intent intentPutExtra = ActivityNavigatorKt.a(f4486a, ApplicationType.d).putExtra("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.isMagicLink", true).putExtra("page", str).putExtra("title", str2).putExtra("magic_link_preferred_launch_mode", preferredLaunchMode);
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.account.sso.RewardsMagicLinkActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$MainActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraTargetTabWithMessage", "Tab", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class MainActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final MainActivity f4487a = new MainActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$MainActivity$ExtraTargetTabWithMessage;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraTargetTabWithMessage implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraTargetTabWithMessage> CREATOR = new Creator();
            public final Tab d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraTargetTabWithMessage> {
                @Override // android.os.Parcelable.Creator
                public final ExtraTargetTabWithMessage createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraTargetTabWithMessage(Tab.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraTargetTabWithMessage[] newArray(int i) {
                    return new ExtraTargetTabWithMessage[i];
                }
            }

            public /* synthetic */ ExtraTargetTabWithMessage() {
                this(Tab.d, null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraTargetTabWithMessage)) {
                    return false;
                }
                ExtraTargetTabWithMessage extraTargetTabWithMessage = (ExtraTargetTabWithMessage) obj;
                return this.d == extraTargetTabWithMessage.d && Intrinsics.c(this.e, extraTargetTabWithMessage.e);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "ExtraTargetTabWithMessage(tab=" + this.d + ", message=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
                dest.writeString(this.e);
            }

            public ExtraTargetTabWithMessage(Tab tab, String str) {
                Intrinsics.h(tab, "tab");
                this.d = tab;
                this.e = str;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$MainActivity$Tab;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Tab {
            public static final Tab d;
            public static final Tab e;
            public static final Tab f;
            public static final Tab g;
            public static final Tab h;
            public static final /* synthetic */ Tab[] i;
            public static final /* synthetic */ EnumEntries j;

            static {
                Tab tab = new Tab("HOME", 0);
                d = tab;
                Tab tab2 = new Tab("LISTS", 1);
                e = tab2;
                Tab tab3 = new Tab("PRODUCTS", 2);
                f = tab3;
                Tab tab4 = new Tab("SPECIALS", 3);
                g = tab4;
                Tab tab5 = new Tab("MORE", 4);
                h = tab5;
                Tab[] tabArr = {tab, tab2, tab3, tab4, tab5};
                i = tabArr;
                j = EnumEntriesKt.a(tabArr);
            }

            public static Tab valueOf(String str) {
                return (Tab) Enum.valueOf(Tab.class, str);
            }

            public static Tab[] values() {
                return (Tab[]) i.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.main.MainActivity";
        }

        public final Intent b() {
            Intent intentAddFlags = ActivityNavigatorKt.a(this, ApplicationType.e).addFlags(872448000);
            Intrinsics.g(intentAddFlags, "addFlags(...)");
            return intentAddFlags;
        }

        public final Intent c(Tab tab, String str) {
            Intent intentPutExtra = b().putExtra("EXTRA_TARGET_TAB_AND_MESSAGE", new ExtraTargetTabWithMessage(tab, str));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        public final Intent d(Activity activity, Tab tab) {
            Intrinsics.h(activity, "activity");
            Intent intentC = c(tab, null);
            activity.startActivity(intentC);
            return intentC;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ManageFullDeliveryAddressesActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ManageFullDeliveryAddressesActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ManageFullDeliveryAddressesActivity f4488a = new ManageFullDeliveryAddressesActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ManageFullDeliveryAddressesActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;
            public final boolean e;
            public final int f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(int i, boolean z, boolean z2) {
                this.d = z;
                this.e = z2;
                this.f = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && this.e == extras.e && this.f == extras.f;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f) + b.e(Boolean.hashCode(this.d) * 31, 31, this.e);
            }

            public final String toString() {
                return a.m(b.v("Extras(isAddressUsedForBilling=", ", isAlternateAddress=", ", messageRes=", this.d, this.e), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeInt(this.f);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.deliveryaddress.managefulldeliveryaddresses.ManageFullDeliveryAddressesActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$MarketplaceActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketplaceActivity f4489a = new MarketplaceActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ModeSelectorActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraCollectionModeSelector", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModeSelectorActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ModeSelectorActivity f4490a = new ModeSelectorActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ModeSelectorActivity$ExtraCollectionModeSelector;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraCollectionModeSelector implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraCollectionModeSelector> CREATOR = new Creator();
            public final boolean d;
            public final boolean e;
            public final CollectionMode f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraCollectionModeSelector> {
                @Override // android.os.Parcelable.Creator
                public final ExtraCollectionModeSelector createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraCollectionModeSelector(parcel.readInt() != 0, parcel.readInt() != 0, (CollectionMode) parcel.readParcelable(ExtraCollectionModeSelector.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraCollectionModeSelector[] newArray(int i) {
                    return new ExtraCollectionModeSelector[i];
                }
            }

            public ExtraCollectionModeSelector(boolean z, boolean z2, CollectionMode collectionMode) {
                this.d = z;
                this.e = z2;
                this.f = collectionMode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraCollectionModeSelector)) {
                    return false;
                }
                ExtraCollectionModeSelector extraCollectionModeSelector = (ExtraCollectionModeSelector) obj;
                return this.d == extraCollectionModeSelector.d && this.e == extraCollectionModeSelector.e && Intrinsics.c(this.f, extraCollectionModeSelector.f);
            }

            public final int hashCode() {
                int iE = b.e(Boolean.hashCode(this.d) * 31, 31, this.e);
                CollectionMode collectionMode = this.f;
                return iE + (collectionMode == null ? 0 : collectionMode.hashCode());
            }

            public final String toString() {
                StringBuilder sbV = b.v("ExtraCollectionModeSelector(shouldNavigateUserToHomeScreen=", ", shouldNavigateToSelectLocationScreen=", ", selectedCollectionMode=", this.d, this.e);
                sbV.append(this.f);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
                dest.writeParcelable(this.f, i);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.modeselector.ModeSelectorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$MyOrders;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MyOrders implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final MyOrders f4491a = new MyOrders();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.myorders.orders.OrdersActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$NotificationOptInActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NotificationOptInActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final NotificationOptInActivity f4492a = new NotificationOptInActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.notification.optin.NotificationOptInActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Onboarding;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Onboarding implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Onboarding f4493a = new Onboarding();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.onboarding.OnboardingActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OnboardingSdui;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class OnboardingSdui implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final OnboardingSdui f4494a = new OnboardingSdui();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.onboarding.sdui.OnboardingSduiActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OnlineEReceiptDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnlineEReceiptDetails implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OnlineEReceiptDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String id) {
                Intrinsics.h(id, "id");
                this.d = id;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(id=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.online.ereceipt.details.OnlineEReceiptDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OrderConfirmation;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderConfirmation implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderConfirmation f4495a = new OrderConfirmation();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OrderDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderDetails f4496a = new OrderDetails();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OrderDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final int d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(int i, boolean z) {
                this.d = i;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && this.e == extras.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
            }

            public final String toString() {
                return "Extras(orderId=" + this.d + ", pastOrder=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.myorders.details.OrderDetailsActivity";
        }

        public final Intent b(String orderId, boolean z) {
            Intrinsics.h(orderId, "orderId");
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", new Extras(Integer.parseInt(orderId), z));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OrderDetailsYourGroceries;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderDetailsYourGroceries implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderDetailsYourGroceries f4497a = new OrderDetailsYourGroceries();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OrderDetailsYourGroceries$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String orderId) {
                Intrinsics.h(orderId, "orderId");
                this.d = orderId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(orderId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity";
        }

        public final Intent b(String orderId) {
            Intrinsics.h(orderId, "orderId");
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", new Extras(orderId));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "InstoreMapExtras", "OriientInstoreMapExtras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OriientInstoreMapActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final OriientInstoreMapActivity f4498a = new OriientInstoreMapActivity();

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$InstoreMapExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface InstoreMapExtras extends Parcelable {
            /* renamed from: k2 */
            String getE();
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$OriientInstoreMapExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$InstoreMapExtras;", "MapProductCardsExtras", "MapProductIdsExtras", "Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$OriientInstoreMapExtras$MapProductCardsExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$OriientInstoreMapExtras$MapProductIdsExtras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class OriientInstoreMapExtras implements InstoreMapExtras {

            @Parcelize
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$OriientInstoreMapExtras$MapProductCardsExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$OriientInstoreMapExtras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MapProductCardsExtras extends OriientInstoreMapExtras {

                @NotNull
                public static final Parcelable.Creator<MapProductCardsExtras> CREATOR = new Creator();
                public final List d;
                public final String e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<MapProductCardsExtras> {
                    @Override // android.os.Parcelable.Creator
                    public final MapProductCardsExtras createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        int i = parcel.readInt();
                        ArrayList arrayList = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = au.com.woolworths.android.onesite.a.a(MapProductCardsExtras.class, parcel, arrayList, iA, 1);
                        }
                        return new MapProductCardsExtras(arrayList, parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final MapProductCardsExtras[] newArray(int i) {
                        return new MapProductCardsExtras[i];
                    }
                }

                public MapProductCardsExtras(List list, String str) {
                    this.d = list;
                    this.e = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.OriientInstoreMapActivity.InstoreMapExtras
                /* renamed from: k2, reason: from getter */
                public final String getE() {
                    return this.e;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    Iterator itU = au.com.woolworths.android.onesite.a.u(this.d, dest);
                    while (itU.hasNext()) {
                        dest.writeParcelable((Parcelable) itU.next(), i);
                    }
                    dest.writeString(this.e);
                }
            }

            @Parcelize
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$OriientInstoreMapExtras$MapProductIdsExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$OriientInstoreMapActivity$OriientInstoreMapExtras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class MapProductIdsExtras extends OriientInstoreMapExtras {

                @NotNull
                public static final Parcelable.Creator<MapProductIdsExtras> CREATOR = new Creator();
                public final List d;
                public final String e;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<MapProductIdsExtras> {
                    @Override // android.os.Parcelable.Creator
                    public final MapProductIdsExtras createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new MapProductIdsExtras(parcel.readString(), parcel.createStringArrayList());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final MapProductIdsExtras[] newArray(int i) {
                        return new MapProductIdsExtras[i];
                    }
                }

                public MapProductIdsExtras(String str, ArrayList productIds) {
                    Intrinsics.h(productIds, "productIds");
                    this.d = productIds;
                    this.e = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.OriientInstoreMapActivity.InstoreMapExtras
                /* renamed from: k2, reason: from getter */
                public final String getE() {
                    return this.e;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeStringList(this.d);
                    dest.writeString(this.e);
                }
            }
        }

        public static Intent b(List list) {
            Intent intentA = ActivityNavigatorKt.a(f4498a, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", new OriientInstoreMapExtras.MapProductCardsExtras(list, null));
            return intentA;
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$PastShopsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PastShopsActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final PastShopsActivity f4499a = new PastShopsActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.lists.ui.pastshops.PastShopsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$PersonalisedOffers;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PersonalisedOffers implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$PersonalisedOffers$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String status, boolean z) {
                Intrinsics.h(status, "status");
                this.d = status;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && this.e == extras.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.j("Extras(status=", this.d, ", boostOnLoad=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.personalised.offers.PersonalisedOffersActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$PickUpLocatorActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PickUpLocatorActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final PickUpLocatorActivity f4500a = new PickUpLocatorActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$PreferencesDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PreferencesDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final PreferencesDetails f4501a = new PreferencesDetails();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$PreferencesDetails$ExtrasData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasData> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasData> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasData(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasData[] newArray(int i) {
                    return new ExtrasData[i];
                }
            }

            public ExtrasData(String key) {
                Intrinsics.h(key, "key");
                this.d = key;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasData) && Intrinsics.c(this.d, ((ExtrasData) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasData(key=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity";
        }

        public final Intent b() {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", new ExtrasData("pushNotifications"));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductAvailabilityActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ProductAvailabilityExtras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductAvailabilityActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductAvailabilityActivity f4502a = new ProductAvailabilityActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductAvailabilityActivity$ProductAvailabilityExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ProductAvailabilityExtras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ProductAvailabilityExtras> CREATOR = new Creator();
            public final Parcelable d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ProductAvailabilityExtras> {
                @Override // android.os.Parcelable.Creator
                public final ProductAvailabilityExtras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ProductAvailabilityExtras(parcel.readParcelable(ProductAvailabilityExtras.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ProductAvailabilityExtras[] newArray(int i) {
                    return new ProductAvailabilityExtras[i];
                }
            }

            public ProductAvailabilityExtras(Parcelable productCard) {
                Intrinsics.h(productCard, "productCard");
                this.d = productCard;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ProductAvailabilityExtras) && Intrinsics.c(this.d, ((ProductAvailabilityExtras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "ProductAvailabilityExtras(productCard=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.product.availability.ProductAvailabilityActivity";
        }

        public final Intent b(Parcelable productCard) {
            Intrinsics.h(productCard, "productCard");
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", new ProductAvailabilityExtras(productCard));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductDetailsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsActivity f4503a = new ProductDetailsActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductDetailsActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String productId) {
                Intrinsics.h(productId, "productId");
                this.d = productId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(productId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.product.details.ProductDetailsActivity";
        }

        public final Intent b(String productId) {
            Intrinsics.h(productId, "productId");
            Intent intentPutExtra = ActivityNavigatorKt.a(f4503a, ApplicationType.e).putExtra("articleId", new Extras(productId));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductFinderActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductFinderActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductFinderActivity f4504a = new ProductFinderActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductListV2;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductListV2 implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductListV2 f4506a = new ProductListV2();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.product.list.v2.ProductListActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductSubCategory;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "ProductCategoryType", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductSubCategory implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductSubCategory f4507a = new ProductSubCategory();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductSubCategory$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final ProductCategoryType f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString(), ProductCategoryType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String title, String categoryId, ProductCategoryType categoryType) {
                Intrinsics.h(title, "title");
                Intrinsics.h(categoryId, "categoryId");
                Intrinsics.h(categoryType, "categoryType");
                this.d = title;
                this.e = categoryId;
                this.f = categoryType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && this.f == extras.f;
            }

            public final int hashCode() {
                return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
            }

            public final String toString() {
                StringBuilder sbV = a.v("Extras(title=", this.d, ", categoryId=", this.e, ", categoryType=");
                sbV.append(this.f);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f.name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductSubCategory$ProductCategoryType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ProductCategoryType {
            public static final ProductCategoryType d;
            public static final ProductCategoryType e;
            public static final /* synthetic */ ProductCategoryType[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                ProductCategoryType productCategoryType = new ProductCategoryType("PRODUCTS", 0);
                d = productCategoryType;
                ProductCategoryType productCategoryType2 = new ProductCategoryType("SPECIALS", 1);
                ProductCategoryType productCategoryType3 = new ProductCategoryType("MARKETPLACE", 2);
                e = productCategoryType3;
                ProductCategoryType[] productCategoryTypeArr = {productCategoryType, productCategoryType2, productCategoryType3};
                f = productCategoryTypeArr;
                g = EnumEntriesKt.a(productCategoryTypeArr);
            }

            public static ProductCategoryType valueOf(String str) {
                return (ProductCategoryType) Enum.valueOf(ProductCategoryType.class, str);
            }

            public static ProductCategoryType[] values() {
                return (ProductCategoryType[]) f.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductsReviewActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "Source", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsReviewActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsReviewActivity f4508a = new ProductsReviewActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductsReviewActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final Source d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(Source.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(Source source) {
                Intrinsics.h(source, "source");
                this.d = source;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && this.d == ((Extras) obj).d;
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "Extras(source=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductsReviewActivity$Source;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Source {
            public static final Source e;
            public static final Source f;
            public static final /* synthetic */ Source[] g;
            public static final /* synthetic */ EnumEntries h;
            public final String d;

            static {
                Source source = new Source("CART", 0, "Cart Review Products");
                e = source;
                Source source2 = new Source("CHECKOUT", 1, "Checkout Review Products");
                f = source2;
                Source[] sourceArr = {source, source2};
                g = sourceArr;
                h = EnumEntriesKt.a(sourceArr);
            }

            public Source(String str, int i, String str2) {
                this.d = str2;
            }

            public static Source valueOf(String str) {
                return (Source) Enum.valueOf(Source.class, str);
            }

            public static Source[] values() {
                return (Source[]) g.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.cart.ui.productreview.ProductsReviewActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Promotion;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Promotion implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Promotion f4509a = new Promotion();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Promotion$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String title, String content) {
                Intrinsics.h(title, "title");
                Intrinsics.h(content, "content");
                this.d = title;
                this.e = content;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return a.j("Extras(title=", this.d, ", content=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.promotion.banner.ui.PromotionActivity";
        }

        public final Intent b(String title, String content) {
            Intrinsics.h(title, "title");
            Intrinsics.h(content, "content");
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("extra_promo", new Extras(title, content));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RatingsAndReviewsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingsAndReviewsActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RatingsAndReviewsActivity f4510a = new RatingsAndReviewsActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.ratings.and.reviews.reviewsdetails.RatingsAndReviewsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Result", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeDetails f4511a = new RecipeDetails();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeDetails$Result;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Result implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Result> CREATOR = new Creator();
            public final boolean d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Result> {
                @Override // android.os.Parcelable.Creator
                public final Result createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Result(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Result[] newArray(int i) {
                    return new Result[i];
                }
            }

            public Result(boolean z) {
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Result) && this.d == ((Result) obj).d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("Result(wasRecipeSavedOrUnsaved=", ")", this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        public static Intent b(String recipeId) {
            Intrinsics.h(recipeId, "recipeId");
            Intent intentA = ActivityNavigatorKt.a(f4511a, ApplicationType.e);
            intentA.putExtra("EXTRA_RECIPE_ID", recipeId);
            return intentA;
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.recipes.details.RecipeDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasPageData", "RecipeListExtras", "ExtrasBySourceAndTags", "ExtrasBySearchTerm", "ExtraRecipeListSource", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeList implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeList f4512a = new RecipeList();

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList$ExtraRecipeListSource;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraRecipeListSource extends Parcelable {
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList$ExtrasBySearchTerm;", "Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList$ExtraRecipeListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasBySearchTerm implements ExtraRecipeListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasBySearchTerm> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasBySearchTerm> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasBySearchTerm createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasBySearchTerm(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasBySearchTerm[] newArray(int i) {
                    return new ExtrasBySearchTerm[i];
                }
            }

            public ExtrasBySearchTerm(String searchTerm) {
                Intrinsics.h(searchTerm, "searchTerm");
                this.d = searchTerm;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasBySearchTerm) && Intrinsics.c(this.d, ((ExtrasBySearchTerm) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasBySearchTerm(searchTerm=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList$ExtrasBySourceAndTags;", "Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList$ExtraRecipeListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasBySourceAndTags implements ExtraRecipeListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasBySourceAndTags> CREATOR = new Creator();
            public final List d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasBySourceAndTags> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasBySourceAndTags createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasBySourceAndTags(parcel.createStringArrayList(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasBySourceAndTags[] newArray(int i) {
                    return new ExtrasBySourceAndTags[i];
                }
            }

            public ExtrasBySourceAndTags(List list, String str) {
                this.d = list;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasBySourceAndTags)) {
                    return false;
                }
                ExtrasBySourceAndTags extrasBySourceAndTags = (ExtrasBySourceAndTags) obj;
                return Intrinsics.c(this.d, extrasBySourceAndTags.d) && Intrinsics.c(this.e, extrasBySourceAndTags.e);
            }

            public final int hashCode() {
                List list = this.d;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.e;
                return iHashCode + (str != null ? str.hashCode() : 0);
            }

            public final String toString() {
                return "ExtrasBySourceAndTags(tags=" + this.d + ", source=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeStringList(this.d);
                dest.writeString(this.e);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList$ExtrasPageData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasPageData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasPageData> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasPageData> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasPageData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasPageData(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasPageData[] newArray(int i) {
                    return new ExtrasPageData[i];
                }
            }

            public ExtrasPageData(String title) {
                Intrinsics.h(title, "title");
                this.d = title;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasPageData) && Intrinsics.c(this.d, ((ExtrasPageData) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasPageData(title=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeList$RecipeListExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RecipeListExtras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<RecipeListExtras> CREATOR = new Creator();
            public final ExtrasPageData d;
            public final ExtraRecipeListSource e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<RecipeListExtras> {
                @Override // android.os.Parcelable.Creator
                public final RecipeListExtras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new RecipeListExtras(ExtrasPageData.CREATOR.createFromParcel(parcel), (ExtraRecipeListSource) parcel.readParcelable(RecipeListExtras.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final RecipeListExtras[] newArray(int i) {
                    return new RecipeListExtras[i];
                }
            }

            public RecipeListExtras(ExtrasPageData pageData, ExtraRecipeListSource recipeListSource) {
                Intrinsics.h(pageData, "pageData");
                Intrinsics.h(recipeListSource, "recipeListSource");
                this.d = pageData;
                this.e = recipeListSource;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RecipeListExtras)) {
                    return false;
                }
                RecipeListExtras recipeListExtras = (RecipeListExtras) obj;
                return Intrinsics.c(this.d, recipeListExtras.d) && Intrinsics.c(this.e, recipeListExtras.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.d.hashCode() * 31);
            }

            public final String toString() {
                return "RecipeListExtras(pageData=" + this.d + ", recipeListSource=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                this.d.writeToParcel(dest, i);
                dest.writeParcelable(this.e, i);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.recipes.recipes.list.RecipeListActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsAccountSettings;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAccountSettings implements AddressableActivity {

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[Region.values().length];
                try {
                    Region.Companion companion = Region.h;
                    iArr[1] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Region.Companion companion2 = Region.h;
                    iArr[0] = 2;
                } catch (NoSuchFieldError unused2) {
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsActivityLegacy;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsActivityLegacy implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsActivityLegacy f4514a = new RewardsActivityLegacy();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.rewards.RewardsActivityLegacy";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsAppLauncher;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAppLauncher implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.Launcher";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsAuthenticationNew;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsAuthenticationNew implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsAuthenticationNew$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;
            public final Boolean e;
            public final Boolean f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.h(parcel, "parcel");
                    boolean z = parcel.readInt() != 0;
                    Boolean boolValueOf2 = null;
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() != 0) {
                        boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Extras(z, boolValueOf, boolValueOf2);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(boolean z, Boolean bool, Boolean bool2) {
                this.d = z;
                this.e = bool;
                this.f = bool2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.d) * 31;
                Boolean bool = this.e;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Boolean bool2 = this.f;
                return iHashCode2 + (bool2 != null ? bool2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Extras(isForceLogout=");
                sb.append(this.d);
                sb.append(", isSignUp=");
                sb.append(this.e);
                sb.append(", isLiteModeSignup=");
                return au.com.woolworths.android.onesite.a.o(sb, this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                Boolean bool = this.e;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Boolean bool2 = this.f;
                if (bool2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool2.booleanValue() ? 1 : 0);
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivityNew";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsBottomSheet;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsBottomSheet implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsBottomSheet f4515a = new RewardsBottomSheet();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsBottomSheet$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str, String str2) {
                this.d = str;
                this.e = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.e;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return a.j("Extras(bottomSheetContent=", this.d, ", bottomSheetId=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.bottomsheet.compose.RewardsBottomSheetActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsCallbackUrlActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "CallbackType", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsCallbackUrlActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsCallbackUrlActivity f4516a = new RewardsCallbackUrlActivity();

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsCallbackUrlActivity$CallbackType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CallbackType {
            public static final CallbackType d;
            public static final /* synthetic */ CallbackType[] e;
            public static final /* synthetic */ EnumEntries f;

            static {
                CallbackType callbackType = new CallbackType("CLOSE_ACCOUNT", 0);
                d = callbackType;
                CallbackType[] callbackTypeArr = {callbackType};
                e = callbackTypeArr;
                f = EnumEntriesKt.a(callbackTypeArr);
            }

            public static CallbackType valueOf(String str) {
                return (CallbackType) Enum.valueOf(CallbackType.class, str);
            }

            public static CallbackType[] values() {
                return (CallbackType[]) e.clone();
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsCallbackUrlActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final CallbackType f;
            public final String g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString(), CallbackType.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String title, String url, CallbackType callbackType, String callbackUrl) {
                Intrinsics.h(title, "title");
                Intrinsics.h(url, "url");
                Intrinsics.h(callbackType, "callbackType");
                Intrinsics.h(callbackUrl, "callbackUrl");
                this.d = title;
                this.e = url;
                this.f = callbackType;
                this.g = callbackUrl;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && this.f == extras.f && Intrinsics.c(this.g, extras.g);
            }

            public final int hashCode() {
                return this.g.hashCode() + ((this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e)) * 31);
            }

            public final String toString() {
                StringBuilder sbV = a.v("Extras(title=", this.d, ", url=", this.e, ", callbackType=");
                sbV.append(this.f);
                sbV.append(", callbackUrl=");
                sbV.append(this.g);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f.name());
                dest.writeString(this.g);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.account.callback.RewardsCallbackUrlActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsCampaigns;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraCampaignDetails", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsCampaigns implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsCampaigns$ExtraCampaignDetails;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraCampaignDetails implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraCampaignDetails> CREATOR = new Creator();
            public final String d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraCampaignDetails> {
                @Override // android.os.Parcelable.Creator
                public final ExtraCampaignDetails createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraCampaignDetails(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraCampaignDetails[] newArray(int i) {
                    return new ExtraCampaignDetails[i];
                }
            }

            public ExtraCampaignDetails(String campaignId, boolean z) {
                Intrinsics.h(campaignId, "campaignId");
                this.d = campaignId;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraCampaignDetails)) {
                    return false;
                }
                ExtraCampaignDetails extraCampaignDetails = (ExtraCampaignDetails) obj;
                return Intrinsics.c(this.d, extraCampaignDetails.d) && this.e == extraCampaignDetails.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.j("ExtraCampaignDetails(campaignId=", this.d, ", addHashCrn=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.campaigns.CampaignsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsCardOverlay;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsCardOverlay implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsCardOverlay f4517a = new RewardsCardOverlay();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.card.overlay.RewardsCardOverlayActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsCheckoutActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsCheckoutActivity implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.checkout.RewardsCheckoutActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingAddCard;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsGiftingAddCard implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.payments.giftingpayment.GiftingPaymentAddCardActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingPayment;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasGiftingPurchaseOrderData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsGiftingPayment implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingPayment$ExtrasGiftingPurchaseOrderData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasGiftingPurchaseOrderData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasGiftingPurchaseOrderData> CREATOR = new Creator();
            public final String A;
            public final String B;
            public final String d;
            public final double e;
            public final double f;
            public final String g;
            public final double h;
            public final String i;
            public final String j;
            public final String k;
            public final String l;
            public final String m;
            public final double n;
            public final double o;
            public final double p;
            public final int q;
            public final boolean r;
            public final String s;
            public final String t;
            public final String u;
            public final String v;
            public final String w;
            public final String x;
            public final String y;
            public final String z;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasGiftingPurchaseOrderData> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasGiftingPurchaseOrderData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasGiftingPurchaseOrderData(parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readInt(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasGiftingPurchaseOrderData[] newArray(int i) {
                    return new ExtrasGiftingPurchaseOrderData[i];
                }
            }

            public ExtrasGiftingPurchaseOrderData(String quoteId, double d, double d2, String str, double d3, String str2, String designId, String str3, String productId, String productName, double d4, double d5, double d6, int i, boolean z, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
                Intrinsics.h(quoteId, "quoteId");
                Intrinsics.h(designId, "designId");
                Intrinsics.h(productId, "productId");
                Intrinsics.h(productName, "productName");
                this.d = quoteId;
                this.e = d;
                this.f = d2;
                this.g = str;
                this.h = d3;
                this.i = str2;
                this.j = designId;
                this.k = str3;
                this.l = productId;
                this.m = productName;
                this.n = d4;
                this.o = d5;
                this.p = d6;
                this.q = i;
                this.r = z;
                this.s = str4;
                this.t = str5;
                this.u = str6;
                this.v = str7;
                this.w = str8;
                this.x = str9;
                this.y = str10;
                this.z = str11;
                this.A = str12;
                this.B = str13;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasGiftingPurchaseOrderData)) {
                    return false;
                }
                ExtrasGiftingPurchaseOrderData extrasGiftingPurchaseOrderData = (ExtrasGiftingPurchaseOrderData) obj;
                return Intrinsics.c(this.d, extrasGiftingPurchaseOrderData.d) && Double.compare(this.e, extrasGiftingPurchaseOrderData.e) == 0 && Double.compare(this.f, extrasGiftingPurchaseOrderData.f) == 0 && Intrinsics.c(this.g, extrasGiftingPurchaseOrderData.g) && Double.compare(this.h, extrasGiftingPurchaseOrderData.h) == 0 && Intrinsics.c(this.i, extrasGiftingPurchaseOrderData.i) && Intrinsics.c(this.j, extrasGiftingPurchaseOrderData.j) && Intrinsics.c(this.k, extrasGiftingPurchaseOrderData.k) && Intrinsics.c(this.l, extrasGiftingPurchaseOrderData.l) && Intrinsics.c(this.m, extrasGiftingPurchaseOrderData.m) && Double.compare(this.n, extrasGiftingPurchaseOrderData.n) == 0 && Double.compare(this.o, extrasGiftingPurchaseOrderData.o) == 0 && Double.compare(this.p, extrasGiftingPurchaseOrderData.p) == 0 && this.q == extrasGiftingPurchaseOrderData.q && this.r == extrasGiftingPurchaseOrderData.r && Intrinsics.c(this.s, extrasGiftingPurchaseOrderData.s) && Intrinsics.c(this.t, extrasGiftingPurchaseOrderData.t) && Intrinsics.c(this.u, extrasGiftingPurchaseOrderData.u) && Intrinsics.c(this.v, extrasGiftingPurchaseOrderData.v) && Intrinsics.c(this.w, extrasGiftingPurchaseOrderData.w) && Intrinsics.c(this.x, extrasGiftingPurchaseOrderData.x) && Intrinsics.c(this.y, extrasGiftingPurchaseOrderData.y) && Intrinsics.c(this.z, extrasGiftingPurchaseOrderData.z) && Intrinsics.c(this.A, extrasGiftingPurchaseOrderData.A) && Intrinsics.c(this.B, extrasGiftingPurchaseOrderData.B);
            }

            public final int hashCode() {
                int iA = android.support.v4.media.session.a.a(this.f, android.support.v4.media.session.a.a(this.e, this.d.hashCode() * 31, 31), 31);
                String str = this.g;
                int iA2 = android.support.v4.media.session.a.a(this.h, (iA + (str == null ? 0 : str.hashCode())) * 31, 31);
                String str2 = this.i;
                int iC = b.c((iA2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
                String str3 = this.k;
                int iE = b.e(b.a(this.q, android.support.v4.media.session.a.a(this.p, android.support.v4.media.session.a.a(this.o, android.support.v4.media.session.a.a(this.n, b.c(b.c((iC + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.l), 31, this.m), 31), 31), 31), 31), 31, this.r);
                String str4 = this.s;
                int iHashCode = (iE + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.t;
                int iHashCode2 = (iHashCode + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.u;
                int iHashCode3 = (iHashCode2 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.v;
                int iHashCode4 = (iHashCode3 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.w;
                int iHashCode5 = (iHashCode4 + (str8 == null ? 0 : str8.hashCode())) * 31;
                String str9 = this.x;
                int iHashCode6 = (iHashCode5 + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.y;
                int iHashCode7 = (iHashCode6 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.z;
                int iHashCode8 = (iHashCode7 + (str11 == null ? 0 : str11.hashCode())) * 31;
                String str12 = this.A;
                int iHashCode9 = (iHashCode8 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.B;
                return iHashCode9 + (str13 != null ? str13.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.e, "ExtrasGiftingPurchaseOrderData(quoteId=", this.d, ", subTotalAmount=");
                au.com.woolworths.android.onesite.a.z(sbR, ", totalOrderAmount=", this.f, ", discountType=");
                sbR.append(this.g);
                sbR.append(", discountAmount=");
                sbR.append(this.h);
                androidx.constraintlayout.core.state.a.B(sbR, ", discountBannerText=", this.i, ", designId=", this.j);
                androidx.constraintlayout.core.state.a.B(sbR, ", designName=", this.k, ", productId=", this.l);
                androidx.compose.ui.input.pointer.a.w(sbR, ", productName=", this.m, ", amount=");
                sbR.append(this.n);
                au.com.woolworths.android.onesite.a.z(sbR, ", salePrice=", this.o, ", totalSalePrice=");
                sbR.append(this.p);
                sbR.append(", quantity=");
                sbR.append(this.q);
                sbR.append(", isGifting=");
                sbR.append(this.r);
                sbR.append(", message=");
                sbR.append(this.s);
                androidx.constraintlayout.core.state.a.B(sbR, ", recipientName=", this.t, ", recipientMobile=", this.u);
                androidx.constraintlayout.core.state.a.B(sbR, ", firstName=", this.v, ", lastName=", this.w);
                androidx.constraintlayout.core.state.a.B(sbR, ", emailAddress=", this.x, ", promotionLabel=", this.y);
                androidx.constraintlayout.core.state.a.B(sbR, ", termsAndConditionsContent=", this.z, ", termsAndConditionsVersion=", this.A);
                return a.p(sbR, ", merchant=", this.B, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeDouble(this.e);
                dest.writeDouble(this.f);
                dest.writeString(this.g);
                dest.writeDouble(this.h);
                dest.writeString(this.i);
                dest.writeString(this.j);
                dest.writeString(this.k);
                dest.writeString(this.l);
                dest.writeString(this.m);
                dest.writeDouble(this.n);
                dest.writeDouble(this.o);
                dest.writeDouble(this.p);
                dest.writeInt(this.q);
                dest.writeInt(this.r ? 1 : 0);
                dest.writeString(this.s);
                dest.writeString(this.t);
                dest.writeString(this.u);
                dest.writeString(this.v);
                dest.writeString(this.w);
                dest.writeString(this.x);
                dest.writeString(this.y);
                dest.writeString(this.z);
                dest.writeString(this.A);
                dest.writeString(this.B);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.payments.giftingpayment.GiftingPaymentActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingStore;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsGiftingStore implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingStore$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String giftCardId) {
                Intrinsics.h(giftCardId, "giftCardId");
                this.d = giftCardId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(giftCardId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.giftingstore.RewardsGiftingStoreActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingStoreProductDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasProductDetails", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsGiftingStoreProductDetails implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingStoreProductDetails$ExtrasProductDetails;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasProductDetails implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasProductDetails> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final String g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasProductDetails> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasProductDetails createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasProductDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasProductDetails[] newArray(int i) {
                    return new ExtrasProductDetails[i];
                }
            }

            public ExtrasProductDetails(String productId, String name, String str, String str2) {
                Intrinsics.h(productId, "productId");
                Intrinsics.h(name, "name");
                this.d = productId;
                this.e = name;
                this.f = str;
                this.g = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasProductDetails)) {
                    return false;
                }
                ExtrasProductDetails extrasProductDetails = (ExtrasProductDetails) obj;
                return Intrinsics.c(this.d, extrasProductDetails.d) && Intrinsics.c(this.e, extrasProductDetails.e) && Intrinsics.c(this.f, extrasProductDetails.f) && Intrinsics.c(this.g, extrasProductDetails.g);
            }

            public final int hashCode() {
                int iC = b.c(this.d.hashCode() * 31, 31, this.e);
                String str = this.f;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.g;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return androidx.constraintlayout.core.state.a.l(a.v("ExtrasProductDetails(productId=", this.d, ", name=", this.e, ", imageUrl="), this.f, ", promotionLabel=", this.g, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.giftingstore.productdetails.ProductDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingStorePurchaseGiftCard;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasProductDetails", "ExtraGiftCardDesign", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsGiftingStorePurchaseGiftCard implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingStorePurchaseGiftCard$ExtraGiftCardDesign;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraGiftCardDesign implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraGiftCardDesign> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraGiftCardDesign> {
                @Override // android.os.Parcelable.Creator
                public final ExtraGiftCardDesign createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraGiftCardDesign(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraGiftCardDesign[] newArray(int i) {
                    return new ExtraGiftCardDesign[i];
                }
            }

            public ExtraGiftCardDesign(String designId, String imageUrl, String designName) {
                Intrinsics.h(designId, "designId");
                Intrinsics.h(imageUrl, "imageUrl");
                Intrinsics.h(designName, "designName");
                this.d = designId;
                this.e = imageUrl;
                this.f = designName;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraGiftCardDesign)) {
                    return false;
                }
                ExtraGiftCardDesign extraGiftCardDesign = (ExtraGiftCardDesign) obj;
                return Intrinsics.c(this.d, extraGiftCardDesign.d) && Intrinsics.c(this.e, extraGiftCardDesign.e) && Intrinsics.c(this.f, extraGiftCardDesign.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
            }

            public final String toString() {
                return a.o(a.v("ExtraGiftCardDesign(designId=", this.d, ", imageUrl=", this.e, ", designName="), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsGiftingStorePurchaseGiftCard$ExtrasProductDetails;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasProductDetails implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasProductDetails> CREATOR = new Creator();
            public final String A;
            public final List B;
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final Boolean h;
            public final Double i;
            public final Double j;
            public final ArrayList k;
            public final LinkedHashMap l;
            public final String m;
            public final String n;
            public final String o;
            public final String p;
            public final String q;
            public final String r;
            public final ArrayList s;
            public final boolean t;
            public final String u;
            public final String v;
            public final String w;
            public final WarningBanner x;
            public final String y;
            public final String z;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasProductDetails> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasProductDetails createFromParcel(Parcel parcel) {
                    WarningBanner warningBanner;
                    String str;
                    String str2;
                    ArrayList arrayList;
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                    Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                    Double dValueOf2 = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
                    int i = parcel.readInt();
                    Double d = dValueOf;
                    Double d2 = dValueOf2;
                    ArrayList arrayList2 = new ArrayList(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        arrayList2.add(Double.valueOf(parcel.readDouble()));
                    }
                    int i3 = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                    for (int i4 = 0; i4 != i3; i4++) {
                        linkedHashMap.put(Double.valueOf(parcel.readDouble()), parcel.readString());
                    }
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    String string8 = parcel.readString();
                    String string9 = parcel.readString();
                    String string10 = parcel.readString();
                    int i5 = parcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i5);
                    Boolean bool = boolValueOf;
                    for (int i6 = 0; i6 != i5; i6++) {
                        arrayList3.add(parcel.readSerializable());
                    }
                    boolean z = parcel.readInt() != 0;
                    String string11 = parcel.readString();
                    String string12 = parcel.readString();
                    String string13 = parcel.readString();
                    WarningBanner warningBannerCreateFromParcel = parcel.readInt() == 0 ? null : WarningBanner.CREATOR.createFromParcel(parcel);
                    String string14 = parcel.readString();
                    String string15 = parcel.readString();
                    String string16 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        str = string5;
                        str2 = string;
                        arrayList = null;
                        warningBanner = warningBannerCreateFromParcel;
                    } else {
                        warningBanner = warningBannerCreateFromParcel;
                        int i7 = parcel.readInt();
                        str = string5;
                        ArrayList arrayList4 = new ArrayList(i7);
                        str2 = string;
                        int iE = 0;
                        while (iE != i7) {
                            iE = androidx.compose.ui.input.pointer.a.e(ExtraGiftCardDesign.CREATOR, parcel, arrayList4, iE, 1);
                            i7 = i7;
                            string2 = string2;
                        }
                        arrayList = arrayList4;
                    }
                    return new ExtrasProductDetails(str2, string2, string3, string4, bool, d, d2, arrayList2, linkedHashMap, str, string6, string7, string8, string9, string10, arrayList3, z, string11, string12, string13, warningBanner, string14, string15, string16, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasProductDetails[] newArray(int i) {
                    return new ExtrasProductDetails[i];
                }
            }

            public ExtrasProductDetails(String str, String productId, String name, String str2, Boolean bool, Double d, Double d2, ArrayList arrayList, LinkedHashMap linkedHashMap, String str3, String str4, String str5, String str6, String str7, String str8, ArrayList arrayList2, boolean z, String str9, String str10, String str11, WarningBanner warningBanner, String str12, String str13, String str14, ArrayList arrayList3) {
                Intrinsics.h(productId, "productId");
                Intrinsics.h(name, "name");
                this.d = str;
                this.e = productId;
                this.f = name;
                this.g = str2;
                this.h = bool;
                this.i = d;
                this.j = d2;
                this.k = arrayList;
                this.l = linkedHashMap;
                this.m = str3;
                this.n = str4;
                this.o = str5;
                this.p = str6;
                this.q = str7;
                this.r = str8;
                this.s = arrayList2;
                this.t = z;
                this.u = str9;
                this.v = str10;
                this.w = str11;
                this.x = warningBanner;
                this.y = str12;
                this.z = str13;
                this.A = str14;
                this.B = arrayList3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasProductDetails)) {
                    return false;
                }
                ExtrasProductDetails extrasProductDetails = (ExtrasProductDetails) obj;
                return Intrinsics.c(this.d, extrasProductDetails.d) && Intrinsics.c(this.e, extrasProductDetails.e) && Intrinsics.c(this.f, extrasProductDetails.f) && Intrinsics.c(this.g, extrasProductDetails.g) && Intrinsics.c(this.h, extrasProductDetails.h) && Intrinsics.c(this.i, extrasProductDetails.i) && Intrinsics.c(this.j, extrasProductDetails.j) && this.k.equals(extrasProductDetails.k) && this.l.equals(extrasProductDetails.l) && Intrinsics.c(this.m, extrasProductDetails.m) && Intrinsics.c(this.n, extrasProductDetails.n) && Intrinsics.c(this.o, extrasProductDetails.o) && Intrinsics.c(this.p, extrasProductDetails.p) && Intrinsics.c(this.q, extrasProductDetails.q) && Intrinsics.c(this.r, extrasProductDetails.r) && this.s.equals(extrasProductDetails.s) && this.t == extrasProductDetails.t && Intrinsics.c(this.u, extrasProductDetails.u) && Intrinsics.c(this.v, extrasProductDetails.v) && Intrinsics.c(this.w, extrasProductDetails.w) && Intrinsics.c(this.x, extrasProductDetails.x) && Intrinsics.c(this.y, extrasProductDetails.y) && Intrinsics.c(this.z, extrasProductDetails.z) && Intrinsics.c(this.A, extrasProductDetails.A) && Intrinsics.c(this.B, extrasProductDetails.B);
            }

            public final int hashCode() {
                String str = this.d;
                int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e), 31, this.f);
                String str2 = this.g;
                int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
                Boolean bool = this.h;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                Double d = this.i;
                int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
                Double d2 = this.j;
                int iHashCode4 = (this.l.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31, 31, this.k)) * 31;
                String str3 = this.m;
                int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.n;
                int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.o;
                int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.p;
                int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
                String str7 = this.q;
                int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
                String str8 = this.r;
                int iE = b.e(androidx.compose.ui.input.pointer.a.b((iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.s), 31, this.t);
                String str9 = this.u;
                int iHashCode10 = (iE + (str9 == null ? 0 : str9.hashCode())) * 31;
                String str10 = this.v;
                int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
                String str11 = this.w;
                int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
                WarningBanner warningBanner = this.x;
                int iHashCode13 = (iHashCode12 + (warningBanner == null ? 0 : warningBanner.hashCode())) * 31;
                String str12 = this.y;
                int iHashCode14 = (iHashCode13 + (str12 == null ? 0 : str12.hashCode())) * 31;
                String str13 = this.z;
                int iHashCode15 = (iHashCode14 + (str13 == null ? 0 : str13.hashCode())) * 31;
                String str14 = this.A;
                int iHashCode16 = (iHashCode15 + (str14 == null ? 0 : str14.hashCode())) * 31;
                List list = this.B;
                return iHashCode16 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbV = a.v("ExtrasProductDetails(designId=", this.d, ", productId=", this.e, ", name=");
                androidx.constraintlayout.core.state.a.B(sbV, this.f, ", imageUrl=", this.g, ", fixedPrices=");
                sbV.append(this.h);
                sbV.append(", minPrice=");
                sbV.append(this.i);
                sbV.append(", maxPrice=");
                sbV.append(this.j);
                sbV.append(", prices=");
                sbV.append(this.k);
                sbV.append(", fixedPriceToDesignId=");
                sbV.append(this.l);
                sbV.append(", discountType=");
                sbV.append(this.m);
                sbV.append(", discountBannerMessage=");
                androidx.constraintlayout.core.state.a.B(sbV, this.n, ", discountTagFirstLine=", this.o, ", discountTagSecondLine=");
                androidx.constraintlayout.core.state.a.B(sbV, this.p, ", discountTagBackgroundImageUrl=", this.q, ", giftCardTermsAndConditionsLabel=");
                sbV.append(this.r);
                sbV.append(", giftCardTermsAndConditionsLinks=");
                sbV.append(this.s);
                sbV.append(", isMaskedDataEmpty=");
                au.com.woolworths.android.onesite.a.y(", firstNameMasked=", this.u, ", lastNameMasked=", sbV, this.t);
                androidx.constraintlayout.core.state.a.B(sbV, this.v, ", emailMasked=", this.w, ", userInfoWarning=");
                sbV.append(this.x);
                sbV.append(", merchant=");
                sbV.append(this.y);
                sbV.append(", purchaseRecipientInfoTitle=");
                androidx.constraintlayout.core.state.a.B(sbV, this.z, ", purchaseRecipientInfoDescription=", this.A, ", designList=");
                return android.support.v4.media.session.a.t(sbV, this.B, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
                Boolean bool = this.h;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
                Double d = this.i;
                if (d == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeDouble(d.doubleValue());
                }
                Double d2 = this.j;
                if (d2 == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeDouble(d2.doubleValue());
                }
                ArrayList arrayList = this.k;
                dest.writeInt(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dest.writeDouble(((Number) it.next()).doubleValue());
                }
                LinkedHashMap linkedHashMap = this.l;
                dest.writeInt(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    dest.writeDouble(((Number) entry.getKey()).doubleValue());
                    dest.writeString((String) entry.getValue());
                }
                dest.writeString(this.m);
                dest.writeString(this.n);
                dest.writeString(this.o);
                dest.writeString(this.p);
                dest.writeString(this.q);
                dest.writeString(this.r);
                ArrayList arrayList2 = this.s;
                dest.writeInt(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    dest.writeSerializable((Serializable) it2.next());
                }
                dest.writeInt(this.t ? 1 : 0);
                dest.writeString(this.u);
                dest.writeString(this.v);
                dest.writeString(this.w);
                WarningBanner warningBanner = this.x;
                if (warningBanner == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    warningBanner.writeToParcel(dest, i);
                }
                dest.writeString(this.y);
                dest.writeString(this.z);
                dest.writeString(this.A);
                List list = this.B;
                if (list == null) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    ((ExtraGiftCardDesign) it3.next()).writeToParcel(dest, i);
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.giftingstore.purchase.PurchaseGiftCardActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsHomepageLegacy;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsHomepageLegacy implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsHomepageLegacy f4518a = new RewardsHomepageLegacy();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsHomepageLegacy$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(boolean z) {
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && this.d == ((Extras) obj).d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("Extras(fromSplash=", ")", this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.homepage.HomepageActivityLegacy";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsInsightsHomeActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsInsightsHomeActivity implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.value.insights.RewardsInsightsHomeActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsInstoreWifiActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsInstoreWifiActivity implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.instore.wifi.ui.InstoreWifiActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsLiteModeHome;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsLiteModeHome implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.litemode.RewardsLiteModeHomeActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsLiteModeOnboarding;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsLiteModeOnboarding implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.litemode.RewardsLiteModeOnboardingActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsOfferDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOfferDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOfferDetails f4519a = new RewardsOfferDetails();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsOfferDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final List f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = au.com.woolworths.android.onesite.a.a(Extras.class, parcel, arrayList2, iA, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new Extras(string, string2, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String offerId, String str, List list) {
                Intrinsics.h(offerId, "offerId");
                this.d = offerId;
                this.e = str;
                this.f = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                List list = this.f;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                return android.support.v4.media.session.a.t(a.v("Extras(offerId=", this.d, ", offerType=", this.e, ", additionalAnalyticsExtraContent="), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                List list = this.f;
                if (list == null) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable((Parcelable) it.next(), i);
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.offers.detail.OfferDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsOfferDetailsOld;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @Deprecated
    public static final class RewardsOfferDetailsOld implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsOfferDetailsOld f4520a = new RewardsOfferDetailsOld();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsOfferDetailsOld$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final List f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    ArrayList arrayList;
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        arrayList = null;
                    } else {
                        int i = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i);
                        int iA = 0;
                        while (iA != i) {
                            iA = au.com.woolworths.android.onesite.a.a(Extras.class, parcel, arrayList2, iA, 1);
                        }
                        arrayList = arrayList2;
                    }
                    return new Extras(string, string2, arrayList);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String offerId, String str, List list) {
                Intrinsics.h(offerId, "offerId");
                this.d = offerId;
                this.e = str;
                this.f = list;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                List list = this.f;
                return iHashCode2 + (list != null ? list.hashCode() : 0);
            }

            public final String toString() {
                return android.support.v4.media.session.a.t(a.v("Extras(offerId=", this.d, ", offerType=", this.e, ", additionalAnalyticsExtraContent="), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                List list = this.f;
                if (list == null) {
                    dest.writeInt(0);
                    return;
                }
                dest.writeInt(1);
                dest.writeInt(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    dest.writeParcelable((Parcelable) it.next(), i);
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.offers.detail.RewardsOfferDetailsActivityLegacy";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsOrdersActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsOrdersActivity implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.orders.OrdersActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsPartner;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsPartner implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.discover.partner.RewardsPartnerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsPartnerSearch;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsPartnerSearch implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsPartnerSearch$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String displayText, String postcode) {
                Intrinsics.h(displayText, "displayText");
                Intrinsics.h(postcode, "postcode");
                this.d = displayText;
                this.e = postcode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return a.j("Extras(displayText=", this.d, ", postcode=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.discover.partnersearch.RewardsPartnerSearchActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsPreferenceDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsPreferenceDetails implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsPreferenceDetailsBottomSheet;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsPreferenceDetailsBottomSheet implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsProductCategories;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsProductCategories implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsProductCategories$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("Extras(id=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.product.categories.ProductCategoriesActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsProductListActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsProductListActivity implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsProductListActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String facet, String id) {
                Intrinsics.h(facet, "facet");
                Intrinsics.h(id, "id");
                this.d = facet;
                this.e = id;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return a.j("Extras(facet=", this.d, ", id=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.shop.search.RewardsProductListActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsPromoApp;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsPromoApp implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsPromoApp f4521a = new RewardsPromoApp();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.rewards.promo.PromoAppActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsSearchActivity implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras;", "Landroid/os/Parcelable;", "Landing", "Suggestions", "Results", "Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras$Landing;", "Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras$Results;", "Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras$Suggestions;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Extras implements Parcelable {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras$Landing;", "Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Landing extends Extras {
                public static final Landing d = new Landing();

                @NotNull
                public static final Parcelable.Creator<Landing> CREATOR = new Creator();

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Landing> {
                    @Override // android.os.Parcelable.Creator
                    public final Landing createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        parcel.readInt();
                        return Landing.d;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Landing[] newArray(int i) {
                        return new Landing[i];
                    }
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    return this == obj || (obj instanceof Landing);
                }

                public final int hashCode() {
                    return -875498509;
                }

                public final String toString() {
                    return "Landing";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeInt(1);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras$Results;", "Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Results extends Extras {

                @NotNull
                public static final Parcelable.Creator<Results> CREATOR = new Creator();
                public final String d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Results> {
                    @Override // android.os.Parcelable.Creator
                    public final Results createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new Results(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Results[] newArray(int i) {
                        return new Results[i];
                    }
                }

                public Results(String str) {
                    this.d = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Results) && Intrinsics.c(this.d, ((Results) obj).d);
                }

                public final int hashCode() {
                    String str = this.d;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return a.h("Results(searchTerm=", this.d, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.d);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras$Suggestions;", "Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSearchActivity$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Suggestions extends Extras {

                @NotNull
                public static final Parcelable.Creator<Suggestions> CREATOR = new Creator();
                public final String d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Suggestions> {
                    @Override // android.os.Parcelable.Creator
                    public final Suggestions createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new Suggestions(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Suggestions[] newArray(int i) {
                        return new Suggestions[i];
                    }
                }

                public Suggestions(String str) {
                    this.d = str;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Suggestions) && Intrinsics.c(this.d, ((Suggestions) obj).d);
                }

                public final int hashCode() {
                    String str = this.d;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return a.h("Suggestions(searchTerm=", this.d, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.d);
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.shop.search.RewardsSearchActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSetupMoreActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraSetupEntryPoint", "RewardsSetupEntryPoint", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsSetupMoreActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsSetupMoreActivity f4522a = new RewardsSetupMoreActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSetupMoreActivity$ExtraSetupEntryPoint;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraSetupEntryPoint implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraSetupEntryPoint> CREATOR = new Creator();
            public final RewardsSetupEntryPoint d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraSetupEntryPoint> {
                @Override // android.os.Parcelable.Creator
                public final ExtraSetupEntryPoint createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraSetupEntryPoint(RewardsSetupEntryPoint.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraSetupEntryPoint[] newArray(int i) {
                    return new ExtraSetupEntryPoint[i];
                }
            }

            public ExtraSetupEntryPoint(RewardsSetupEntryPoint entryPoint) {
                Intrinsics.h(entryPoint, "entryPoint");
                this.d = entryPoint;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtraSetupEntryPoint) && this.d == ((ExtraSetupEntryPoint) obj).d;
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "ExtraSetupEntryPoint(entryPoint=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSetupMoreActivity$RewardsSetupEntryPoint;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class RewardsSetupEntryPoint {
            public static final RewardsSetupEntryPoint d;
            public static final RewardsSetupEntryPoint e;
            public static final RewardsSetupEntryPoint f;
            public static final RewardsSetupEntryPoint g;
            public static final /* synthetic */ RewardsSetupEntryPoint[] h;
            public static final /* synthetic */ EnumEntries i;

            static {
                RewardsSetupEntryPoint rewardsSetupEntryPoint = new RewardsSetupEntryPoint("WOOLWORTHS_REWARDS", 0);
                d = rewardsSetupEntryPoint;
                RewardsSetupEntryPoint rewardsSetupEntryPoint2 = new RewardsSetupEntryPoint("SCAN_AND_GO", 1);
                e = rewardsSetupEntryPoint2;
                RewardsSetupEntryPoint rewardsSetupEntryPoint3 = new RewardsSetupEntryPoint("BOOSTED_OFFERS", 2);
                f = rewardsSetupEntryPoint3;
                RewardsSetupEntryPoint rewardsSetupEntryPoint4 = new RewardsSetupEntryPoint("E_RECEIPTS", 3);
                g = rewardsSetupEntryPoint4;
                RewardsSetupEntryPoint[] rewardsSetupEntryPointArr = {rewardsSetupEntryPoint, rewardsSetupEntryPoint2, rewardsSetupEntryPoint3, rewardsSetupEntryPoint4};
                h = rewardsSetupEntryPointArr;
                i = EnumEntriesKt.a(rewardsSetupEntryPointArr);
            }

            public static RewardsSetupEntryPoint valueOf(String str) {
                return (RewardsSetupEntryPoint) Enum.valueOf(RewardsSetupEntryPoint.class, str);
            }

            public static RewardsSetupEntryPoint[] values() {
                return (RewardsSetupEntryPoint[]) h.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.rewards.RewardsSetupMoreActivity";
        }

        public final Intent b(RewardsSetupEntryPoint rewardsSetupEntryPoint, boolean z) {
            Intent intentA = z ? ActivityNavigatorKt.a(RewardsSetupPrimingActivity.f4523a, ApplicationType.e) : ActivityNavigatorKt.a(this, ApplicationType.e);
            if (rewardsSetupEntryPoint != null) {
                intentA.putExtra("EXTRA_SOURCE", new ExtraSetupEntryPoint(rewardsSetupEntryPoint));
            }
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsSetupPrimingActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsSetupPrimingActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RewardsSetupPrimingActivity f4523a = new RewardsSetupPrimingActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopOrderDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsShopOrderDetails implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopOrderDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String orderNumber) {
                Intrinsics.h(orderNumber, "orderNumber");
                this.d = orderNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(orderNumber=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.order.details.OrderDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopOrderEnquiry;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsShopOrderEnquiry implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopOrderEnquiry$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String orderNumber) {
                Intrinsics.h(orderNumber, "orderNumber");
                this.d = orderNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(orderNumber=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.order.enquiry.OrderEnquiryActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopProductDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsShopProductDetails implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopProductDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String productId) {
                Intrinsics.h(productId, "productId");
                this.d = productId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(productId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.product.details.RewardsProductDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopResendGiftCard;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsShopResendGiftCard implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsShopResendGiftCard$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String orderNumber) {
                Intrinsics.h(orderNumber, "orderNumber");
                this.d = orderNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(orderNumber=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.resendgiftcard.ResendGiftCardActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsVouchersBottomSheet;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsVouchersBottomSheet implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.rewards.voucher.RewardsVouchersBottomSheetActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletAddGiftCard;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasAddCardResult", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletAddGiftCard implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletAddGiftCard$ExtrasAddCardResult;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasAddCardResult implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasAddCardResult> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasAddCardResult> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasAddCardResult createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasAddCardResult(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasAddCardResult[] newArray(int i) {
                    return new ExtrasAddCardResult[i];
                }
            }

            public ExtrasAddCardResult(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasAddCardResult) && Intrinsics.c(this.d, ((ExtrasAddCardResult) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasAddCardResult(message=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.addgiftcard.RewardsWalletAddGiftCardActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletAddPaymentMethod;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletAddPaymentMethod implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.addpaymentmethod.AddPaymentMethodActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletAddSchemeCard;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletAddSchemeCard implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.addschemecard.RewardsWalletAddSchemeCardActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletAddSchemeCardFlowCoordinator;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasAddSchemeCardResult", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletAddSchemeCardFlowCoordinator implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletAddSchemeCardFlowCoordinator$ExtrasAddSchemeCardResult;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasAddSchemeCardResult implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasAddSchemeCardResult> CREATOR = new Creator();
            public final Boolean d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasAddSchemeCardResult> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasAddSchemeCardResult createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.h(parcel, "parcel");
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new ExtrasAddSchemeCardResult(boolValueOf, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasAddSchemeCardResult[] newArray(int i) {
                    return new ExtrasAddSchemeCardResult[i];
                }
            }

            public ExtrasAddSchemeCardResult(Boolean bool, boolean z) {
                this.d = bool;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasAddSchemeCardResult)) {
                    return false;
                }
                ExtrasAddSchemeCardResult extrasAddSchemeCardResult = (ExtrasAddSchemeCardResult) obj;
                return Intrinsics.c(this.d, extrasAddSchemeCardResult.d) && this.e == extrasAddSchemeCardResult.e;
            }

            public final int hashCode() {
                Boolean bool = this.d;
                return Boolean.hashCode(this.e) + ((bool == null ? 0 : bool.hashCode()) * 31);
            }

            public final String toString() {
                return "ExtrasAddSchemeCardResult(successfullyOnboarded=" + this.d + ", showSuccessToast=" + this.e + ")";
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                int iBooleanValue;
                Intrinsics.h(dest, "dest");
                Boolean bool = this.d;
                if (bool == null) {
                    iBooleanValue = 0;
                } else {
                    dest.writeInt(1);
                    iBooleanValue = bool.booleanValue();
                }
                dest.writeInt(iBooleanValue);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.addschemecardcoordinator.RewardsWalletAddSchemeCardFlowCoordinatorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraGiftCardDetails", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletGiftCardDetails implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardDetails$ExtraGiftCardDetails;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraGiftCardDetails implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraGiftCardDetails> CREATOR = new Creator();
            public final String d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraGiftCardDetails> {
                @Override // android.os.Parcelable.Creator
                public final ExtraGiftCardDetails createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraGiftCardDetails(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraGiftCardDetails[] newArray(int i) {
                    return new ExtraGiftCardDetails[i];
                }
            }

            public ExtraGiftCardDetails(String giftCardId, boolean z) {
                Intrinsics.h(giftCardId, "giftCardId");
                this.d = giftCardId;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraGiftCardDetails)) {
                    return false;
                }
                ExtraGiftCardDetails extraGiftCardDetails = (ExtraGiftCardDetails) obj;
                return Intrinsics.c(this.d, extraGiftCardDetails.d) && this.e == extraGiftCardDetails.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.j("ExtraGiftCardDetails(giftCardId=", this.d, ", showBarcodeAction=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.giftcarddetails.RewardsWalletGiftCardDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardHowToRedeem;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletGiftCardHowToRedeem implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.giftcardhowtoredeem.RewardsWalletGiftCardHowToRedeemActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardTransactions;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraGiftCardTransactions", "ExtraGiftCardDecryptedData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletGiftCardTransactions implements AddressableActivity {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardTransactions$ExtraGiftCardDecryptedData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraGiftCardDecryptedData extends Parcelable {
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardTransactions$ExtraGiftCardTransactions;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraGiftCardTransactions implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraGiftCardTransactions> CREATOR = new Creator();
            public final String d;
            public final ExtraGiftCardDecryptedData e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraGiftCardTransactions> {
                @Override // android.os.Parcelable.Creator
                public final ExtraGiftCardTransactions createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraGiftCardTransactions(parcel.readString(), (ExtraGiftCardDecryptedData) parcel.readParcelable(ExtraGiftCardTransactions.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraGiftCardTransactions[] newArray(int i) {
                    return new ExtraGiftCardTransactions[i];
                }
            }

            public ExtraGiftCardTransactions(String giftCardId, ExtraGiftCardDecryptedData extraGiftCardDecryptedData) {
                Intrinsics.h(giftCardId, "giftCardId");
                this.d = giftCardId;
                this.e = extraGiftCardDecryptedData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraGiftCardTransactions)) {
                    return false;
                }
                ExtraGiftCardTransactions extraGiftCardTransactions = (ExtraGiftCardTransactions) obj;
                return Intrinsics.c(this.d, extraGiftCardTransactions.d) && Intrinsics.c(this.e, extraGiftCardTransactions.e);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                ExtraGiftCardDecryptedData extraGiftCardDecryptedData = this.e;
                return iHashCode + (extraGiftCardDecryptedData == null ? 0 : extraGiftCardDecryptedData.hashCode());
            }

            public final String toString() {
                return "ExtraGiftCardTransactions(giftCardId=" + this.d + ", giftCardDecryptedData=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeParcelable(this.e, i);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.giftcardtransactions.RewardsWalletGiftCardTransactionsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardsTabbed;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasRewardsWalletGiftCards", "OrderStatus", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletGiftCardsTabbed implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardsTabbed$ExtrasRewardsWalletGiftCards;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasRewardsWalletGiftCards implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasRewardsWalletGiftCards> CREATOR = new Creator();
            public final String d;
            public final OrderStatus e;
            public final String f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasRewardsWalletGiftCards> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasRewardsWalletGiftCards createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasRewardsWalletGiftCards(parcel.readString(), parcel.readInt() == 0 ? null : OrderStatus.CREATOR.createFromParcel(parcel), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasRewardsWalletGiftCards[] newArray(int i) {
                    return new ExtrasRewardsWalletGiftCards[i];
                }
            }

            public ExtrasRewardsWalletGiftCards(String str, OrderStatus orderStatus, String str2) {
                this.d = str;
                this.e = orderStatus;
                this.f = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasRewardsWalletGiftCards)) {
                    return false;
                }
                ExtrasRewardsWalletGiftCards extrasRewardsWalletGiftCards = (ExtrasRewardsWalletGiftCards) obj;
                return Intrinsics.c(this.d, extrasRewardsWalletGiftCards.d) && this.e == extrasRewardsWalletGiftCards.e && Intrinsics.c(this.f, extrasRewardsWalletGiftCards.f);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                OrderStatus orderStatus = this.e;
                int iHashCode2 = (iHashCode + (orderStatus == null ? 0 : orderStatus.hashCode())) * 31;
                String str2 = this.f;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ExtrasRewardsWalletGiftCards(uriContainingToken=");
                sb.append(this.d);
                sb.append(", orderStatus=");
                sb.append(this.e);
                sb.append(", message=");
                return a.o(sb, this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                OrderStatus orderStatus = this.e;
                if (orderStatus == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    orderStatus.writeToParcel(dest, i);
                }
                dest.writeString(this.f);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Parcelize
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardsTabbed$OrderStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "PROCESSING", "COMPLETED", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class OrderStatus implements Parcelable {

            @SerializedName("completed")
            public static final OrderStatus COMPLETED;

            @NotNull
            public static final Parcelable.Creator<OrderStatus> CREATOR;

            @SerializedName("processing")
            public static final OrderStatus PROCESSING;
            public static final /* synthetic */ OrderStatus[] d;
            public static final /* synthetic */ EnumEntries e;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletGiftCardsTabbed$OrderStatus$Companion;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
            }

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OrderStatus> {
                @Override // android.os.Parcelable.Creator
                public final OrderStatus createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return OrderStatus.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final OrderStatus[] newArray(int i) {
                    return new OrderStatus[i];
                }
            }

            static {
                OrderStatus orderStatus = new OrderStatus("PROCESSING", 0);
                PROCESSING = orderStatus;
                OrderStatus orderStatus2 = new OrderStatus("COMPLETED", 1);
                COMPLETED = orderStatus2;
                OrderStatus[] orderStatusArr = {orderStatus, orderStatus2, new OrderStatus("UNKNOWN", 2)};
                d = orderStatusArr;
                e = EnumEntriesKt.a(orderStatusArr);
                CREATOR = new Creator();
            }

            private OrderStatus(String str, int i) {
            }

            public static OrderStatus valueOf(String str) {
                return (OrderStatus) Enum.valueOf(OrderStatus.class, str);
            }

            public static OrderStatus[] values() {
                return (OrderStatus[]) d.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(name());
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.giftcards.tabs.RewardsWalletGiftCardsTabbedActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletLiteOnePageCvp;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletLiteOnePageCvp implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletLiteOnePageCvp$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(boolean z) {
                this.d = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && this.d == ((Extras) obj).d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("Extras(showGiftCardAddedMessage=", ")", this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.customervalueprop.lite.WalletLiteCvpActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletOcr;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Origin", "ExtrasRewardsWalletOcrConfig", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletOcr implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletOcr$ExtrasRewardsWalletOcrConfig;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasRewardsWalletOcrConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasRewardsWalletOcrConfig> CREATOR = new Creator();
            public final Origin d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasRewardsWalletOcrConfig> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasRewardsWalletOcrConfig createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasRewardsWalletOcrConfig(Origin.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasRewardsWalletOcrConfig[] newArray(int i) {
                    return new ExtrasRewardsWalletOcrConfig[i];
                }
            }

            public ExtrasRewardsWalletOcrConfig(Origin origin) {
                Intrinsics.h(origin, "origin");
                this.d = origin;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasRewardsWalletOcrConfig) && this.d == ((ExtrasRewardsWalletOcrConfig) obj).d;
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "ExtrasRewardsWalletOcrConfig(origin=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletOcr$Origin;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Origin {
            public static final Origin d;
            public static final /* synthetic */ Origin[] e;
            public static final /* synthetic */ EnumEntries f;

            static {
                Origin origin = new Origin("WALLET", 0);
                Origin origin2 = new Origin("GIFTING", 1);
                Origin origin3 = new Origin("EDX_SIGN_UP", 2);
                d = origin3;
                Origin[] originArr = {origin, origin2, origin3};
                e = originArr;
                f = EnumEntriesKt.a(originArr);
            }

            public static Origin valueOf(String str) {
                return (Origin) Enum.valueOf(Origin.class, str);
            }

            public static Origin[] values() {
                return (Origin[]) e.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.base.wallet.ocr.RewardsWalletOcrActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletOnePageCVP;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletOnePageCVP implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.customervalueprop.onepage.RewardsWalletOnePageCVPActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletPaymentSettings;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletPaymentSettings implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.paymentsettings.RewardsWalletPaymentSettingsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletUpdateSchemeCard;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraRewardsWalletUpdateSchemeCardParams", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletUpdateSchemeCard implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletUpdateSchemeCard$ExtraRewardsWalletUpdateSchemeCardParams;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraRewardsWalletUpdateSchemeCardParams implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraRewardsWalletUpdateSchemeCardParams> CREATOR = new Creator();
            public final RewardsWalletViewSchemeCard.ExtraSchemeCardData d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraRewardsWalletUpdateSchemeCardParams> {
                @Override // android.os.Parcelable.Creator
                public final ExtraRewardsWalletUpdateSchemeCardParams createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraRewardsWalletUpdateSchemeCardParams((RewardsWalletViewSchemeCard.ExtraSchemeCardData) parcel.readParcelable(ExtraRewardsWalletUpdateSchemeCardParams.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraRewardsWalletUpdateSchemeCardParams[] newArray(int i) {
                    return new ExtraRewardsWalletUpdateSchemeCardParams[i];
                }
            }

            public ExtraRewardsWalletUpdateSchemeCardParams(RewardsWalletViewSchemeCard.ExtraSchemeCardData extraSchemeCardData) {
                this.d = extraSchemeCardData;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtraRewardsWalletUpdateSchemeCardParams) && Intrinsics.c(this.d, ((ExtraRewardsWalletUpdateSchemeCardParams) obj).d);
            }

            public final int hashCode() {
                RewardsWalletViewSchemeCard.ExtraSchemeCardData extraSchemeCardData = this.d;
                if (extraSchemeCardData == null) {
                    return 0;
                }
                return extraSchemeCardData.hashCode();
            }

            public final String toString() {
                return "ExtraRewardsWalletUpdateSchemeCardParams(schemeCardData=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.updateschemecard.RewardsWalletUpdateSchemeCardActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletViewSchemeCard;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtraRewardsWalletViewSchemeCardParams", "ExtraRewardsWalletViewSchemeCardResult", "ExtraByInstrumentId", "ExtraSchemeCardData", "ExtraMessageModel", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWalletViewSchemeCard implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletViewSchemeCard$ExtraByInstrumentId;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraByInstrumentId implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraByInstrumentId> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraByInstrumentId> {
                @Override // android.os.Parcelable.Creator
                public final ExtraByInstrumentId createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraByInstrumentId(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraByInstrumentId[] newArray(int i) {
                    return new ExtraByInstrumentId[i];
                }
            }

            public ExtraByInstrumentId(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtraByInstrumentId) && Intrinsics.c(this.d, ((ExtraByInstrumentId) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("ExtraByInstrumentId(instrumentId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletViewSchemeCard$ExtraMessageModel;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraMessageModel extends Parcelable {
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletViewSchemeCard$ExtraRewardsWalletViewSchemeCardParams;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraRewardsWalletViewSchemeCardParams implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraRewardsWalletViewSchemeCardParams> CREATOR = new Creator();
            public final ExtraSchemeCardData d;
            public final ExtraMessageModel e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraRewardsWalletViewSchemeCardParams> {
                @Override // android.os.Parcelable.Creator
                public final ExtraRewardsWalletViewSchemeCardParams createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraRewardsWalletViewSchemeCardParams((ExtraSchemeCardData) parcel.readParcelable(ExtraRewardsWalletViewSchemeCardParams.class.getClassLoader()), (ExtraMessageModel) parcel.readParcelable(ExtraRewardsWalletViewSchemeCardParams.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraRewardsWalletViewSchemeCardParams[] newArray(int i) {
                    return new ExtraRewardsWalletViewSchemeCardParams[i];
                }
            }

            public ExtraRewardsWalletViewSchemeCardParams(ExtraSchemeCardData extraSchemeCardData, ExtraMessageModel extraMessageModel) {
                this.d = extraSchemeCardData;
                this.e = extraMessageModel;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraRewardsWalletViewSchemeCardParams)) {
                    return false;
                }
                ExtraRewardsWalletViewSchemeCardParams extraRewardsWalletViewSchemeCardParams = (ExtraRewardsWalletViewSchemeCardParams) obj;
                return Intrinsics.c(this.d, extraRewardsWalletViewSchemeCardParams.d) && Intrinsics.c(this.e, extraRewardsWalletViewSchemeCardParams.e);
            }

            public final int hashCode() {
                ExtraSchemeCardData extraSchemeCardData = this.d;
                int iHashCode = (extraSchemeCardData == null ? 0 : extraSchemeCardData.hashCode()) * 31;
                ExtraMessageModel extraMessageModel = this.e;
                return iHashCode + (extraMessageModel != null ? extraMessageModel.hashCode() : 0);
            }

            public final String toString() {
                return "ExtraRewardsWalletViewSchemeCardParams(schemeCardData=" + this.d + ", messageModel=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletViewSchemeCard$ExtraRewardsWalletViewSchemeCardResult;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraRewardsWalletViewSchemeCardResult implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraRewardsWalletViewSchemeCardResult> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraRewardsWalletViewSchemeCardResult> {
                @Override // android.os.Parcelable.Creator
                public final ExtraRewardsWalletViewSchemeCardResult createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtraRewardsWalletViewSchemeCardResult(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraRewardsWalletViewSchemeCardResult[] newArray(int i) {
                    return new ExtraRewardsWalletViewSchemeCardResult[i];
                }
            }

            public ExtraRewardsWalletViewSchemeCardResult(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtraRewardsWalletViewSchemeCardResult) && Intrinsics.c(this.d, ((ExtraRewardsWalletViewSchemeCardResult) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("ExtraRewardsWalletViewSchemeCardResult(message=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWalletViewSchemeCard$ExtraSchemeCardData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraSchemeCardData extends Parcelable {
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wallet.viewschemecard.RewardsWalletViewSchemeCardActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWowReferralActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RewardsWowReferralActivity implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RewardsWowReferralActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final Boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Extras(string, boolValueOf);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str, Boolean bool) {
                this.d = str;
                this.e = bool;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                Boolean bool = this.e;
                return iHashCode + (bool != null ? bool.hashCode() : 0);
            }

            public final String toString() {
                return "Extras(program=" + this.d + ", showConfetti=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                Boolean bool = this.e;
                if (bool == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(bool.booleanValue() ? 1 : 0);
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.wow.referral.RewardsWowReferralActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SavedRecipes;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SavedRecipes implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SavedRecipes f4524a = new SavedRecipes();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.recipes.recipes.homepage.savedrecipes.SavedRecipesActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ScanAndGoEntryActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanAndGoEntryActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ScanAndGoEntryActivity f4525a = new ScanAndGoEntryActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.entry.SngEntryActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ScanPaymentQrCode;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ScanPaymentQrCode implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.qrscanner.RewardsQrScannerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Search implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Search f4526a = new Search();

        @Parcelize
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras;", "Landroid/os/Parcelable;", "BuyAgain", "Generic", "ProductAlternative", "ProductFinder", "VoiceProductFinder", "VoiceWithMapsProductFinder", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$BuyAgain;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$Generic;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$ProductAlternative;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$ProductFinder;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$VoiceProductFinder;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$VoiceWithMapsProductFinder;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Extras implements Parcelable {
            public final String d;
            public final boolean e;
            public final boolean f;
            public final boolean g;
            public final boolean h;
            public final boolean i;

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$BuyAgain;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class BuyAgain extends Extras {

                @NotNull
                public static final Parcelable.Creator<BuyAgain> CREATOR = new Creator();
                public final String j;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<BuyAgain> {
                    @Override // android.os.Parcelable.Creator
                    public final BuyAgain createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new BuyAgain(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final BuyAgain[] newArray(int i) {
                        return new BuyAgain[i];
                    }
                }

                public BuyAgain(String str) {
                    super(true, 48, str, false, true);
                    this.j = str;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.Search.Extras
                /* renamed from: a, reason: from getter */
                public final String getD() {
                    return this.j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof BuyAgain) && Intrinsics.c(this.j, ((BuyAgain) obj).j);
                }

                public final int hashCode() {
                    String str = this.j;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return a.h("BuyAgain(searchTerm=", this.j, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.j);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$Generic;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class Generic extends Extras {

                @NotNull
                public static final Parcelable.Creator<Generic> CREATOR = new Creator();
                public final String j;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Generic> {
                    @Override // android.os.Parcelable.Creator
                    public final Generic createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new Generic(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Generic[] newArray(int i) {
                        return new Generic[i];
                    }
                }

                public Generic(String str) {
                    super(true, 16, str, true, true);
                    this.j = str;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.Search.Extras
                /* renamed from: a, reason: from getter */
                public final String getD() {
                    return this.j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Generic) && Intrinsics.c(this.j, ((Generic) obj).j);
                }

                public final int hashCode() {
                    String str = this.j;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return a.h("Generic(searchTerm=", this.j, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.j);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$ProductAlternative;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class ProductAlternative extends Extras {

                @NotNull
                public static final Parcelable.Creator<ProductAlternative> CREATOR = new Creator();
                public final Parcelable j;
                public final String k;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ProductAlternative> {
                    @Override // android.os.Parcelable.Creator
                    public final ProductAlternative createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new ProductAlternative(parcel.readParcelable(ProductAlternative.class.getClassLoader()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ProductAlternative[] newArray(int i) {
                        return new ProductAlternative[i];
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ProductAlternative(Parcelable productToReplace, String str) {
                    super(false, 48, str, false, false);
                    Intrinsics.h(productToReplace, "productToReplace");
                    this.j = productToReplace;
                    this.k = str;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.Search.Extras
                /* renamed from: a, reason: from getter */
                public final String getD() {
                    return this.k;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ProductAlternative)) {
                        return false;
                    }
                    ProductAlternative productAlternative = (ProductAlternative) obj;
                    return Intrinsics.c(this.j, productAlternative.j) && Intrinsics.c(this.k, productAlternative.k);
                }

                public final int hashCode() {
                    int iHashCode = this.j.hashCode() * 31;
                    String str = this.k;
                    return iHashCode + (str == null ? 0 : str.hashCode());
                }

                public final String toString() {
                    return "ProductAlternative(productToReplace=" + this.j + ", searchTerm=" + this.k + ")";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeParcelable(this.j, i);
                    dest.writeString(this.k);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$ProductFinder;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class ProductFinder extends Extras {

                @NotNull
                public static final Parcelable.Creator<ProductFinder> CREATOR = new Creator();
                public final String j;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<ProductFinder> {
                    @Override // android.os.Parcelable.Creator
                    public final ProductFinder createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new ProductFinder(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final ProductFinder[] newArray(int i) {
                        return new ProductFinder[i];
                    }
                }

                public ProductFinder(String str) {
                    super(false, 32, str, true, true);
                    this.j = str;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.Search.Extras
                /* renamed from: a, reason: from getter */
                public final String getD() {
                    return this.j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof ProductFinder) && Intrinsics.c(this.j, ((ProductFinder) obj).j);
                }

                public final int hashCode() {
                    String str = this.j;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return a.h("ProductFinder(searchTerm=", this.j, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.j);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$VoiceProductFinder;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class VoiceProductFinder extends Extras {

                @NotNull
                public static final Parcelable.Creator<VoiceProductFinder> CREATOR = new Creator();
                public final String j;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<VoiceProductFinder> {
                    @Override // android.os.Parcelable.Creator
                    public final VoiceProductFinder createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new VoiceProductFinder(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final VoiceProductFinder[] newArray(int i) {
                        return new VoiceProductFinder[i];
                    }
                }

                public VoiceProductFinder(String str) {
                    super(true, 32, str, true, true);
                    this.j = str;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.Search.Extras
                /* renamed from: a, reason: from getter */
                public final String getD() {
                    return this.j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof VoiceProductFinder) && Intrinsics.c(this.j, ((VoiceProductFinder) obj).j);
                }

                public final int hashCode() {
                    String str = this.j;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return a.h("VoiceProductFinder(searchTerm=", this.j, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.j);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras$VoiceWithMapsProductFinder;", "Lau/com/woolworths/android/onesite/navigation/Activities$Search$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class VoiceWithMapsProductFinder extends Extras {

                @NotNull
                public static final Parcelable.Creator<VoiceWithMapsProductFinder> CREATOR = new Creator();
                public final String j;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<VoiceWithMapsProductFinder> {
                    @Override // android.os.Parcelable.Creator
                    public final VoiceWithMapsProductFinder createFromParcel(Parcel parcel) {
                        Intrinsics.h(parcel, "parcel");
                        return new VoiceWithMapsProductFinder(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    public final VoiceWithMapsProductFinder[] newArray(int i) {
                        return new VoiceWithMapsProductFinder[i];
                    }
                }

                public VoiceWithMapsProductFinder(String str) {
                    super(true, 32, str, true, true);
                    this.j = str;
                }

                @Override // au.com.woolworths.android.onesite.navigation.Activities.Search.Extras
                /* renamed from: a, reason: from getter */
                public final String getD() {
                    return this.j;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof VoiceWithMapsProductFinder) && Intrinsics.c(this.j, ((VoiceWithMapsProductFinder) obj).j);
                }

                public final int hashCode() {
                    String str = this.j;
                    if (str == null) {
                        return 0;
                    }
                    return str.hashCode();
                }

                public final String toString() {
                    return a.h("VoiceWithMapsProductFinder(searchTerm=", this.j, ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    dest.writeString(this.j);
                }
            }

            public Extras(boolean z, int i, String str, boolean z2, boolean z3) {
                boolean z4 = (i & 16) == 0;
                boolean z5 = (i & 32) == 0;
                this.d = str;
                this.e = z;
                this.f = z2;
                this.g = z3;
                this.h = z4;
                this.i = z5;
            }

            /* renamed from: a, reason: from getter */
            public String getD() {
                return this.d;
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity";
        }

        public final Intent b(Extras extras) {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("extraData", extras);
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SecurityPreferencesSecureDollarsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecurityPreferencesSecureDollarsActivity implements AddressableActivity {

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SecurityPreferencesSecureDollarsActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String token, String action) {
                Intrinsics.h(token, "token");
                Intrinsics.h(action, "action");
                this.d = token;
                this.e = action;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return a.j("Extras(token=", this.d, ", action=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.redemptionsettings.securitypreferences.SecurityPreferencesSecureDollarsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SharedEReceiptDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ReceiptDetailsExtras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SharedEReceiptDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SharedEReceiptDetails f4527a = new SharedEReceiptDetails();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SharedEReceiptDetails$ReceiptDetailsExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ReceiptDetailsExtras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ReceiptDetailsExtras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ReceiptDetailsExtras> {
                @Override // android.os.Parcelable.Creator
                public final ReceiptDetailsExtras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ReceiptDetailsExtras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ReceiptDetailsExtras[] newArray(int i) {
                    return new ReceiptDetailsExtras[i];
                }
            }

            public ReceiptDetailsExtras(String receiptId) {
                Intrinsics.h(receiptId, "receiptId");
                this.d = receiptId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReceiptDetailsExtras) && Intrinsics.c(this.d, ((ReceiptDetailsExtras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ReceiptDetailsExtras(receiptId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.receipt.details.EReceiptDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShippingCalculator;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShippingCalculator implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShippingCalculator f4528a = new ShippingCalculator();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.shippingcalculator.ShippingCalculatorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopAppDeepLinkHandler;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopAppDeepLinkHandler implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShopAppDeepLinkHandler f4529a = new ShopAppDeepLinkHandler();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.foundation.shop.deeplink.resolver.ui.ShopAppDeepLinkHandlerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopAppLauncher;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopAppLauncher implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.Launcher";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopAppSplash;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopAppSplash implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShopAppSplash f4530a = new ShopAppSplash();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.splash.SplashScreenActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopHealthyLifeFoodTrackerActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "FoodTrackerExtras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopHealthyLifeFoodTrackerActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShopHealthyLifeFoodTrackerActivity f4531a = new ShopHealthyLifeFoodTrackerActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopHealthyLifeFoodTrackerActivity$FoodTrackerExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class FoodTrackerExtras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<FoodTrackerExtras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<FoodTrackerExtras> {
                @Override // android.os.Parcelable.Creator
                public final FoodTrackerExtras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new FoodTrackerExtras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final FoodTrackerExtras[] newArray(int i) {
                    return new FoodTrackerExtras[i];
                }
            }

            public FoodTrackerExtras(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FoodTrackerExtras) && Intrinsics.c(this.d, ((FoodTrackerExtras) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("FoodTrackerExtras(referralCode=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopListGuestOnboardingActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "ListFeature", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopListGuestOnboardingActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShopListGuestOnboardingActivity f4532a = new ShopListGuestOnboardingActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopListGuestOnboardingActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final ListFeature d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(ListFeature.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(ListFeature listFeature) {
                Intrinsics.h(listFeature, "listFeature");
                this.d = listFeature;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && this.d == ((Extras) obj).d;
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return "Extras(listFeature=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopListGuestOnboardingActivity$ListFeature;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ListFeature {
            public static final ListFeature d;
            public static final ListFeature e;
            public static final /* synthetic */ ListFeature[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                ListFeature listFeature = new ListFeature("WATCH_LIST", 0);
                d = listFeature;
                ListFeature listFeature2 = new ListFeature("SNAP_A_LIST", 1);
                e = listFeature2;
                ListFeature[] listFeatureArr = {listFeature, listFeature2};
                f = listFeatureArr;
                g = EnumEntriesKt.a(listFeatureArr);
            }

            public static ListFeature valueOf(String str) {
                return (ListFeature) Enum.valueOf(ListFeature.class, str);
            }

            public static ListFeature[] values() {
                return (ListFeature[]) f.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.lists.ui.guest.onboarding.ShopListGuestOnboardingActivity";
        }

        public final Intent b(ListFeature listFeature) {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.addFlags(603979776);
            intentA.putExtra("EXTRA_SCREEN_TYPE", new Extras(listFeature));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopReceiptListActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopReceiptListActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShopReceiptListActivity f4533a = new ShopReceiptListActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.receipts.ShopReceiptListActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopRewardsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShopRewardsActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShopRewardsActivity f4534a = new ShopRewardsActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShopRewardsActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str) {
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                String str = this.d;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return a.h("Extras(sectionId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.rewards.ShopRewardsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShoppingListDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ShoppingListDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ShoppingListDetails f4535a = new ShoppingListDetails();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ShoppingListDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String listId, boolean z) {
                Intrinsics.h(listId, "listId");
                this.d = listId;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && this.e == extras.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.j("Extras(listId=", this.d, ", isNewSnapAList=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsActivity";
        }

        public final Intent b(String listId, boolean z) {
            Intrinsics.h(listId, "listId");
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("EXTRAS", new Extras(listId, z));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SignUp;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class SignUp implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SignUp f4536a = new SignUp();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SignUp$Extras;", "Landroid/os/Parcelable;", "SignUpActivityExtras", "Lau/com/woolworths/android/onesite/navigation/Activities$SignUp$Extras$SignUpActivityExtras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static abstract class Extras implements Parcelable {

            @Parcelize
            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SignUp$Extras$SignUpActivityExtras;", "Lau/com/woolworths/android/onesite/navigation/Activities$SignUp$Extras;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final /* data */ class SignUpActivityExtras extends Extras {

                @NotNull
                public static final Parcelable.Creator<SignUpActivityExtras> CREATOR = new Creator();
                public final Boolean d;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<SignUpActivityExtras> {
                    @Override // android.os.Parcelable.Creator
                    public final SignUpActivityExtras createFromParcel(Parcel parcel) {
                        Boolean boolValueOf;
                        Intrinsics.h(parcel, "parcel");
                        if (parcel.readInt() == 0) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new SignUpActivityExtras(boolValueOf);
                    }

                    @Override // android.os.Parcelable.Creator
                    public final SignUpActivityExtras[] newArray(int i) {
                        return new SignUpActivityExtras[i];
                    }
                }

                public SignUpActivityExtras(Boolean bool) {
                    this.d = bool;
                }

                /* renamed from: a, reason: from getter */
                public final Boolean getD() {
                    return this.d;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
                    return 0;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof SignUpActivityExtras) && Intrinsics.c(this.d, ((SignUpActivityExtras) obj).d);
                }

                public final int hashCode() {
                    Boolean bool = this.d;
                    if (bool == null) {
                        return 0;
                    }
                    return bool.hashCode();
                }

                public final String toString() {
                    return androidx.compose.ui.input.pointer.a.k(this.d, "SignUpActivityExtras(launchedFromLogin=", ")");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel dest, int i) {
                    Intrinsics.h(dest, "dest");
                    Boolean bool = this.d;
                    if (bool == null) {
                        dest.writeInt(0);
                    } else {
                        dest.writeInt(1);
                        dest.writeInt(bool.booleanValue() ? 1 : 0);
                    }
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.signup.SignUpActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngCartActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngCartActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngCartActivity f4537a = new SngCartActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.cart.ShoppingCartActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngListsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngListsActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngListsActivity f4538a = new SngListsActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.lists.ui.lists.sng.SngListsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngParkingVoucherActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngParkingVoucherActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngParkingVoucherActivity f4539a = new SngParkingVoucherActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngParkingVoucherActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String voucherCode) {
                Intrinsics.h(voucherCode, "voucherCode");
                this.d = voucherCode;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("Extras(voucherCode=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.parking.ParkingVoucherActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngRewardsSetupActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngRewardsSetupActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngRewardsSetupActivity f4540a = new SngRewardsSetupActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.reward.SngRewardsSetupActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngScannerActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngScannerActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngScannerActivity f4541a = new SngScannerActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.scanner.ScannerActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngScannerActivityOld;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngScannerActivityOld implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngScannerActivityOld f4542a = new SngScannerActivityOld();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.scanner.ScannerActivityOld";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngSearchActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngSearchActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngSearchActivity f4543a = new SngSearchActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.productsearch.SearchActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SngSettingsScreen;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SngSettingsScreen implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SngSettingsScreen f4544a = new SngSettingsScreen();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "com.woolworths.scanlibrary.ui.menu.setting.UserSettingsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Splash;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Splash implements AddressableActivity {
        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.welcome.splash.SplashActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasByStoreNumber", "ExtrasByData", "Extras", "ExtraLocationDetailsSource", "ExtraLocationDetailsData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreDetails implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreDetails f4545a = new StoreDetails();

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtraLocationDetailsData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraLocationDetailsData extends Parcelable {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtraLocationDetailsSource;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraLocationDetailsSource extends Parcelable {
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final ExtraLocationDetailsSource d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras((ExtraLocationDetailsSource) parcel.readParcelable(Extras.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(ExtraLocationDetailsSource locationDetailsSource, boolean z) {
                Intrinsics.h(locationDetailsSource, "locationDetailsSource");
                this.d = locationDetailsSource;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && this.e == extras.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "Extras(locationDetailsSource=" + this.d + ", viewStoreInfoOnly=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtrasByData;", "Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtraLocationDetailsSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByData implements ExtraLocationDetailsSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByData> CREATOR = new Creator();
            public final ExtraLocationDetailsData d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByData> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByData((ExtraLocationDetailsData) parcel.readParcelable(ExtrasByData.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByData[] newArray(int i) {
                    return new ExtrasByData[i];
                }
            }

            public ExtrasByData(ExtraLocationDetailsData locationDetailsData, boolean z) {
                Intrinsics.h(locationDetailsData, "locationDetailsData");
                this.d = locationDetailsData;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByData)) {
                    return false;
                }
                ExtrasByData extrasByData = (ExtrasByData) obj;
                return Intrinsics.c(this.d, extrasByData.d) && this.e == extrasByData.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "ExtrasByData(locationDetailsData=" + this.d + ", supportsTransition=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtrasByStoreNumber;", "Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtraLocationDetailsSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByStoreNumber implements ExtraLocationDetailsSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByStoreNumber> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByStoreNumber> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByStoreNumber createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByStoreNumber(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByStoreNumber[] newArray(int i) {
                    return new ExtrasByStoreNumber[i];
                }
            }

            public ExtrasByStoreNumber(String storeNumber) {
                Intrinsics.h(storeNumber, "storeNumber");
                this.d = storeNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasByStoreNumber) && Intrinsics.c(this.d, ((ExtrasByStoreNumber) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasByStoreNumber(storeNumber=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.storelocator.details.StoreDetailsActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetailsLegacy;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasByStoreNumber", "ExtrasByData", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreDetailsLegacy implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreDetailsLegacy f4546a = new StoreDetailsLegacy();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetailsLegacy$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final StoreDetails.ExtraLocationDetailsSource d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras((StoreDetails.ExtraLocationDetailsSource) parcel.readParcelable(Extras.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(StoreDetails.ExtraLocationDetailsSource locationDetailsSource, boolean z) {
                Intrinsics.h(locationDetailsSource, "locationDetailsSource");
                this.d = locationDetailsSource;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && this.e == extras.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "Extras(locationDetailsSource=" + this.d + ", viewStoreInfoOnly=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetailsLegacy$ExtrasByData;", "Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtraLocationDetailsSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByData implements StoreDetails.ExtraLocationDetailsSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByData> CREATOR = new Creator();
            public final StoreDetails.ExtraLocationDetailsData d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByData> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByData((StoreDetails.ExtraLocationDetailsData) parcel.readParcelable(ExtrasByData.class.getClassLoader()), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByData[] newArray(int i) {
                    return new ExtrasByData[i];
                }
            }

            public ExtrasByData(StoreDetails.ExtraLocationDetailsData locationDetailsData, boolean z) {
                Intrinsics.h(locationDetailsData, "locationDetailsData");
                this.d = locationDetailsData;
                this.e = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByData)) {
                    return false;
                }
                ExtrasByData extrasByData = (ExtrasByData) obj;
                return Intrinsics.c(this.d, extrasByData.d) && this.e == extrasByData.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
            }

            public final String toString() {
                return "ExtrasByData(locationDetailsData=" + this.d + ", supportsTransition=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeParcelable(this.d, i);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetailsLegacy$ExtrasByStoreNumber;", "Lau/com/woolworths/android/onesite/navigation/Activities$StoreDetails$ExtraLocationDetailsSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByStoreNumber implements StoreDetails.ExtraLocationDetailsSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByStoreNumber> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByStoreNumber> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByStoreNumber createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByStoreNumber(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByStoreNumber[] newArray(int i) {
                    return new ExtrasByStoreNumber[i];
                }
            }

            public ExtrasByStoreNumber(String storeNumber) {
                Intrinsics.h(storeNumber, "storeNumber");
                this.d = storeNumber;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasByStoreNumber) && Intrinsics.c(this.d, ((ExtrasByStoreNumber) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return a.h("ExtrasByStoreNumber(storeNumber=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        public static Intent c(String storeNumber) {
            Intrinsics.h(storeNumber, "storeNumber");
            Intent intentPutExtra = ActivityNavigatorKt.a(f4546a, ApplicationType.e).putExtra("EXTRA_STORE_DETAILS_DATA", new Extras(new ExtrasByStoreNumber(storeNumber), false));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.storelocator.legacy.pickup.details.StoreDetailsActivity";
        }

        public final Intent b(StoreDetails.ExtraLocationDetailsData locationDetailsData, boolean z, boolean z2) {
            Intrinsics.h(locationDetailsData, "locationDetailsData");
            Intent intentPutExtra = ActivityNavigatorKt.a(this, ApplicationType.e).putExtra("EXTRA_STORE_DETAILS_DATA", new Extras(new ExtrasByData(locationDetailsData, z), z2));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreLocator;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "StoreLocatorEntryPoint", "ExtraStoreLocatorData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreLocator implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreLocator f4547a = new StoreLocator();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreLocator$ExtraStoreLocatorData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraStoreLocatorData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraStoreLocatorData> CREATOR = new Creator();
            public final int d;
            public final int e;
            public final boolean f;
            public final boolean g;
            public final boolean h;
            public final StoreLocatorEntryPoint i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraStoreLocatorData> {
                @Override // android.os.Parcelable.Creator
                public final ExtraStoreLocatorData createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z2;
                    Intrinsics.h(parcel, "parcel");
                    int i = parcel.readInt();
                    int i2 = parcel.readInt();
                    boolean z3 = false;
                    boolean z4 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                        z4 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z2 = z;
                    }
                    return new ExtraStoreLocatorData(i, i2, z3, z4, z2, StoreLocatorEntryPoint.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraStoreLocatorData[] newArray(int i) {
                    return new ExtraStoreLocatorData[i];
                }
            }

            public ExtraStoreLocatorData(int i, int i2, boolean z, boolean z2, boolean z3, StoreLocatorEntryPoint entryPoint) {
                Intrinsics.h(entryPoint, "entryPoint");
                this.d = i;
                this.e = i2;
                this.f = z;
                this.g = z2;
                this.h = z3;
                this.i = entryPoint;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraStoreLocatorData)) {
                    return false;
                }
                ExtraStoreLocatorData extraStoreLocatorData = (ExtraStoreLocatorData) obj;
                return this.d == extraStoreLocatorData.d && this.e == extraStoreLocatorData.e && this.f == extraStoreLocatorData.f && this.g == extraStoreLocatorData.g && this.h == extraStoreLocatorData.h && this.i == extraStoreLocatorData.i;
            }

            public final int hashCode() {
                return this.i.hashCode() + b.e(b.e(b.e(b.a(this.e, Integer.hashCode(this.d) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
            }

            public final String toString() {
                StringBuilder sbQ = a.q(this.d, this.e, "ExtraStoreLocatorData(titleRes=", ", paramRequestMode=", ", showWindowKeyInfo=");
                au.com.woolworths.android.onesite.a.D(sbQ, this.f, ", isListMode=", this.g, ", viewStoreInfoOnly=");
                sbQ.append(this.h);
                sbQ.append(", entryPoint=");
                sbQ.append(this.i);
                sbQ.append(")");
                return sbQ.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d);
                dest.writeInt(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.g ? 1 : 0);
                dest.writeInt(this.h ? 1 : 0);
                dest.writeString(this.i.name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreLocator$StoreLocatorEntryPoint;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class StoreLocatorEntryPoint {
            public static final StoreLocatorEntryPoint d;
            public static final StoreLocatorEntryPoint e;
            public static final /* synthetic */ StoreLocatorEntryPoint[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                StoreLocatorEntryPoint storeLocatorEntryPoint = new StoreLocatorEntryPoint("ONBOARDING", 0);
                d = storeLocatorEntryPoint;
                StoreLocatorEntryPoint storeLocatorEntryPoint2 = new StoreLocatorEntryPoint("SHOPPING_MODE", 1);
                e = storeLocatorEntryPoint2;
                StoreLocatorEntryPoint[] storeLocatorEntryPointArr = {storeLocatorEntryPoint, storeLocatorEntryPoint2};
                f = storeLocatorEntryPointArr;
                g = EnumEntriesKt.a(storeLocatorEntryPointArr);
            }

            public static StoreLocatorEntryPoint valueOf(String str) {
                return (StoreLocatorEntryPoint) Enum.valueOf(StoreLocatorEntryPoint.class, str);
            }

            public static StoreLocatorEntryPoint[] values() {
                return (StoreLocatorEntryPoint[]) f.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreLocatorLegacy;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "StoreLocatorEntryPoint", "ExtraStoreLocatorData", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreLocatorLegacy implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreLocatorLegacy f4548a = new StoreLocatorLegacy();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreLocatorLegacy$ExtraStoreLocatorData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtraStoreLocatorData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtraStoreLocatorData> CREATOR = new Creator();
            public final int d;
            public final int e;
            public final boolean f;
            public final boolean g;
            public final boolean h;
            public final StoreLocatorEntryPoint i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtraStoreLocatorData> {
                @Override // android.os.Parcelable.Creator
                public final ExtraStoreLocatorData createFromParcel(Parcel parcel) {
                    boolean z;
                    boolean z2;
                    Intrinsics.h(parcel, "parcel");
                    int i = parcel.readInt();
                    int i2 = parcel.readInt();
                    boolean z3 = false;
                    boolean z4 = true;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z3 = true;
                    } else {
                        z = false;
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = true;
                        z4 = z;
                    }
                    if (parcel.readInt() == 0) {
                        z2 = z;
                    }
                    return new ExtraStoreLocatorData(i, i2, z3, z4, z2, StoreLocatorEntryPoint.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtraStoreLocatorData[] newArray(int i) {
                    return new ExtraStoreLocatorData[i];
                }
            }

            public ExtraStoreLocatorData(int i, int i2, boolean z, boolean z2, boolean z3, StoreLocatorEntryPoint entryPoint) {
                Intrinsics.h(entryPoint, "entryPoint");
                this.d = i;
                this.e = i2;
                this.f = z;
                this.g = z2;
                this.h = z3;
                this.i = entryPoint;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtraStoreLocatorData)) {
                    return false;
                }
                ExtraStoreLocatorData extraStoreLocatorData = (ExtraStoreLocatorData) obj;
                return this.d == extraStoreLocatorData.d && this.e == extraStoreLocatorData.e && this.f == extraStoreLocatorData.f && this.g == extraStoreLocatorData.g && this.h == extraStoreLocatorData.h && this.i == extraStoreLocatorData.i;
            }

            public final int hashCode() {
                return this.i.hashCode() + b.e(b.e(b.e(b.a(this.e, Integer.hashCode(this.d) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
            }

            public final String toString() {
                StringBuilder sbQ = a.q(this.d, this.e, "ExtraStoreLocatorData(titleRes=", ", paramRequestMode=", ", showWindowKeyInfo=");
                au.com.woolworths.android.onesite.a.D(sbQ, this.f, ", isListMode=", this.g, ", viewStoreInfoOnly=");
                sbQ.append(this.h);
                sbQ.append(", entryPoint=");
                sbQ.append(this.i);
                sbQ.append(")");
                return sbQ.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d);
                dest.writeInt(this.e);
                dest.writeInt(this.f ? 1 : 0);
                dest.writeInt(this.g ? 1 : 0);
                dest.writeInt(this.h ? 1 : 0);
                dest.writeString(this.i.name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$StoreLocatorLegacy$StoreLocatorEntryPoint;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class StoreLocatorEntryPoint {
            public static final StoreLocatorEntryPoint d;
            public static final StoreLocatorEntryPoint e;
            public static final /* synthetic */ StoreLocatorEntryPoint[] f;
            public static final /* synthetic */ EnumEntries g;

            static {
                StoreLocatorEntryPoint storeLocatorEntryPoint = new StoreLocatorEntryPoint("ONBOARDING", 0);
                d = storeLocatorEntryPoint;
                StoreLocatorEntryPoint storeLocatorEntryPoint2 = new StoreLocatorEntryPoint("SHOPPING_MODE", 1);
                e = storeLocatorEntryPoint2;
                StoreLocatorEntryPoint[] storeLocatorEntryPointArr = {storeLocatorEntryPoint, storeLocatorEntryPoint2};
                f = storeLocatorEntryPointArr;
                g = EnumEntriesKt.a(storeLocatorEntryPointArr);
            }

            public static StoreLocatorEntryPoint valueOf(String str) {
                return (StoreLocatorEntryPoint) Enum.valueOf(StoreLocatorEntryPoint.class, str);
            }

            public static StoreLocatorEntryPoint[] values() {
                return (StoreLocatorEntryPoint[]) f.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$SubmitReviewActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SubmitReviewActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final SubmitReviewActivity f4549a = new SubmitReviewActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.ratings.and.reviews.submitreviews.SubmitReviewActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$TimeSelectorActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TimeSelectorActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final TimeSelectorActivity f4550a = new TimeSelectorActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$TimeSelectorActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final Integer d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(Integer num) {
                this.d = num;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                Integer num = this.d;
                if (num == null) {
                    return 0;
                }
                return num.hashCode();
            }

            public final String toString() {
                return "Extras(preSelectedDateIndex=" + this.d + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                Integer num = this.d;
                if (num == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeInt(num.intValue());
                }
            }
        }

        public static Intent b() {
            Intent intentA = ActivityNavigatorKt.a(f4550a, ApplicationType.e);
            intentA.putExtra("EXTRA_DATA", new Extras(null));
            return intentA;
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.checkout.ui.timeselector.TimeSelectorActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ViewSimilarProductsActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "Result", "Status", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ViewSimilarProductsActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ViewSimilarProductsActivity f4551a = new ViewSimilarProductsActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ViewSimilarProductsActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String listId, String productId, String alternativeProductsModeString) {
                Intrinsics.h(listId, "listId");
                Intrinsics.h(productId, "productId");
                Intrinsics.h(alternativeProductsModeString, "alternativeProductsModeString");
                this.d = listId;
                this.e = productId;
                this.f = alternativeProductsModeString;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
            }

            public final int hashCode() {
                return this.f.hashCode() + b.c(this.d.hashCode() * 31, 31, this.e);
            }

            public final String toString() {
                return a.o(a.v("Extras(listId=", this.d, ", productId=", this.e, ", alternativeProductsModeString="), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ViewSimilarProductsActivity$Result;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Result implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Result> CREATOR = new Creator();
            public final Status d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Result> {
                @Override // android.os.Parcelable.Creator
                public final Result createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Result(Status.valueOf(parcel.readString()), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Result[] newArray(int i) {
                    return new Result[i];
                }
            }

            public Result(Status status, String str) {
                Intrinsics.h(status, "status");
                this.d = status;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Result)) {
                    return false;
                }
                Result result = (Result) obj;
                return this.d == result.d && Intrinsics.c(this.e, result.e);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return "Result(status=" + this.d + ", listName=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
                dest.writeString(this.e);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ViewSimilarProductsActivity$Status;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Status {
            public static final Status d;
            public static final Status e;
            public static final Status f;
            public static final Status g;
            public static final /* synthetic */ Status[] h;
            public static final /* synthetic */ EnumEntries i;

            static {
                Status status = new Status("SUBSTITUTE_SAVED_TO_LIST", 0);
                d = status;
                Status status2 = new Status("ITEM_ADDED_TO_CART", 1);
                e = status2;
                Status status3 = new Status("ITEM_UPDATED_IN_CART", 2);
                f = status3;
                Status status4 = new Status("ITEM_REMOVED_FROM_CART", 3);
                g = status4;
                Status[] statusArr = {status, status2, status3, status4};
                h = statusArr;
                i = EnumEntriesKt.a(statusArr);
            }

            public static Status valueOf(String str) {
                return (Status) Enum.valueOf(Status.class, str);
            }

            public static Status[] values() {
                return (Status[]) h.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.lists.ui.substitutions.ViewSimilarProductsActivity";
        }

        public final Intent b(String str, String productId, String alternativeProductsModeString) {
            Intrinsics.h(productId, "productId");
            Intrinsics.h(alternativeProductsModeString, "alternativeProductsModeString");
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.putExtra("EXTRAS", new Extras(str, productId, alternativeProductsModeString));
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$VocFreeText;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VocFreeText implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final VocFreeText f4552a = new VocFreeText();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$VocFreeText$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final long e;
            public final String f;
            public final String g;
            public final int h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    return new Extras(parcel.readInt(), parcel.readLong(), string, parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(int i, long j, String surveyId, String responseId, String questionId) {
                Intrinsics.h(surveyId, "surveyId");
                Intrinsics.h(responseId, "responseId");
                Intrinsics.h(questionId, "questionId");
                this.d = surveyId;
                this.e = j;
                this.f = responseId;
                this.g = questionId;
                this.h = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && this.e == extras.e && Intrinsics.c(this.f, extras.f) && Intrinsics.c(this.g, extras.g) && this.h == extras.h;
            }

            public final int hashCode() {
                return Integer.hashCode(this.h) + b.c(b.c(b.b(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Extras(surveyId=");
                sb.append(this.d);
                sb.append(", orderId=");
                sb.append(this.e);
                androidx.constraintlayout.core.state.a.B(sb, ", responseId=", this.f, ", questionId=", this.g);
                return androidx.constraintlayout.core.state.a.k(sb, ", score=", this.h, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeLong(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
                dest.writeInt(this.h);
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.voc.freetext.VocFreeTextActivity";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$WebLinkActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebLinkActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final WebLinkActivity f4553a = new WebLinkActivity();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.weblink.WebLinkActivity";
        }

        public final Intent b(String webLinkId) {
            Intrinsics.h(webLinkId, "webLinkId");
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.addFlags(603979776);
            intentA.putExtra("webLinkId", webLinkId);
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$WebViewActivity;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class WebViewActivity implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final WebViewActivity f4554a = new WebViewActivity();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$WebViewActivity$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final Screens g;
            public final boolean h;
            public final boolean i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    boolean z;
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    Screens screensValueOf = parcel.readInt() == 0 ? null : Screens.valueOf(parcel.readString());
                    boolean z2 = false;
                    if (parcel.readInt() != 0) {
                        z = false;
                        z2 = true;
                    } else {
                        z = false;
                    }
                    return new Extras(string, string2, string3, screensValueOf, z2, parcel.readInt() == 0 ? z : true);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public /* synthetic */ Extras(int i, String str, String str2, String str3) {
                this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : Screens.l, false, false);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f) && this.g == extras.g && this.h == extras.h && this.i == extras.i;
            }

            public final int hashCode() {
                int iC = b.c(this.d.hashCode() * 31, 31, this.e);
                String str = this.f;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                Screens screens = this.g;
                return Boolean.hashCode(this.i) + b.e((iHashCode + (screens != null ? screens.hashCode() : 0)) * 31, 31, this.h);
            }

            public final String toString() {
                StringBuilder sbV = a.v("Extras(url=", this.d, ", screenTitle=", this.e, ", analyticsScreenName=");
                sbV.append(this.f);
                sbV.append(", analyticsScreen=");
                sbV.append(this.g);
                sbV.append(", sendAuthHeaders=");
                return au.com.woolworths.android.onesite.a.q(sbV, this.h, ", lightTheme=", this.i, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                Screens screens = this.g;
                if (screens == null) {
                    dest.writeInt(0);
                } else {
                    dest.writeInt(1);
                    dest.writeString(screens.name());
                }
                dest.writeInt(this.h ? 1 : 0);
                dest.writeInt(this.i ? 1 : 0);
            }

            public Extras(String url, String screenTitle, String str, Screens screens, boolean z, boolean z2) {
                Intrinsics.h(url, "url");
                Intrinsics.h(screenTitle, "screenTitle");
                this.d = url;
                this.e = screenTitle;
                this.f = str;
                this.g = screens;
                this.h = z;
                this.i = z2;
                if (str == null && screens == null) {
                    throw new IllegalArgumentException("Both analyticsScreenName and analyticsScreen cannot be null");
                }
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.android.onesite.modules.customviews.WebViewActivity";
        }

        public final Intent b(Extras extras) {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            intentA.addFlags(603979776);
            intentA.putExtra("extra", extras);
            return intentA;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Welcome;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Welcome implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final Welcome f4555a = new Welcome();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$Welcome$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final boolean d;
            public final boolean e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(boolean z, boolean z2) {
                this.d = z;
                this.e = z2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && this.e == extras.e;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.e) + (Boolean.hashCode(this.d) * 31);
            }

            public final String toString() {
                return "Extras(showSelectCountryDialogOnStart=" + this.d + ", ignoreBranchDeferredLiteMode=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                dest.writeInt(this.e ? 1 : 0);
            }
        }

        public static Intent b(boolean z) {
            Intent intentPutExtra = ActivityNavigatorKt.a(f4555a, ApplicationType.d).putExtra("EXTRA_WELCOME", new Extras(z, false));
            Intrinsics.g(intentPutExtra, "putExtra(...)");
            return intentPutExtra;
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.rewards.welcome.WelcomeActivity";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ExtrasPageData", "ExtrasByRecipe", "ExtrasByCategory", "ExtrasBySpecialsCategory", "ExtrasBySearch", "ExtrasByCatalogueSearch", "ExtrasByPastShop", "ExtrasBySuggestedLists", "ExtrasByProductIds", "ExtrasByFacet", "ExtrasByBoostedOffers", "ExtrasByHaveYouForgotten", "ExtrasByPriceFamily", "ExtrasBySearchAlternative", "ExtrasByProductGroup", "ExtraProductListSource", "ExtrasConfig", "Extras", "ProductListQueryType", "ProductListType", "ToolbarType", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductList implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductList f4505a = new ProductList();

        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "Landroid/os/Parcelable;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByBoostedOffers;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByCategory;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByFacet;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByHaveYouForgotten;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByPastShop;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByPriceFamily;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByProductGroup;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByProductIds;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByRecipe;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySearch;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySearchAlternative;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySpecialsCategory;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySuggestedLists;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public interface ExtraProductListSource extends Parcelable {
            /* renamed from: i0 */
            ProductListType getE();
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByCatalogueSearch;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySearch;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByCatalogueSearch extends ExtrasBySearch {

            @NotNull
            public static final Parcelable.Creator<ExtrasByCatalogueSearch> CREATOR = new Creator();
            public final String i;
            public final ProductListType j;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByCatalogueSearch> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByCatalogueSearch createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByCatalogueSearch(parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByCatalogueSearch[] newArray(int i) {
                    return new ExtrasByCatalogueSearch[i];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExtrasByCatalogueSearch(String searchTerm, ProductListType productListType) {
                super(searchTerm, (List) null, (String) null, productListType, 12);
                Intrinsics.h(searchTerm, "searchTerm");
                Intrinsics.h(productListType, "productListType");
                ProductListQueryType[] productListQueryTypeArr = ProductListQueryType.d;
                this.i = searchTerm;
                this.j = productListType;
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtrasBySearch
            /* renamed from: a, reason: from getter */
            public final String getD() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtrasBySearch, android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByCatalogueSearch)) {
                    return false;
                }
                ExtrasByCatalogueSearch extrasByCatalogueSearch = (ExtrasByCatalogueSearch) obj;
                return Intrinsics.c(this.i, extrasByCatalogueSearch.i) && this.j == extrasByCatalogueSearch.j;
            }

            public final int hashCode() {
                return this.j.hashCode() + (this.i.hashCode() * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtrasBySearch, au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.j;
            }

            public final String toString() {
                return "ExtrasByCatalogueSearch(searchTerm=" + this.i + ", productListType=" + this.j + ")";
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtrasBySearch, android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.i);
                dest.writeString(this.j.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByCategory;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByCategory implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByCategory> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final ProductListType f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByCategory> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByCategory createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByCategory(parcel.readString(), parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByCategory[] newArray(int i) {
                    return new ExtrasByCategory[i];
                }
            }

            public ExtrasByCategory(String categoryId, String str, ProductListType productListType) {
                Intrinsics.h(categoryId, "categoryId");
                Intrinsics.h(productListType, "productListType");
                this.d = categoryId;
                this.e = str;
                this.f = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByCategory)) {
                    return false;
                }
                ExtrasByCategory extrasByCategory = (ExtrasByCategory) obj;
                return Intrinsics.c(this.d, extrasByCategory.d) && Intrinsics.c(this.e, extrasByCategory.e) && this.f == extrasByCategory.f;
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.f;
            }

            public final String toString() {
                StringBuilder sbV = a.v("ExtrasByCategory(categoryId=", this.d, ", source=", this.e, ", productListType=");
                sbV.append(this.f);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByHaveYouForgotten;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExtrasByHaveYouForgotten implements ExtraProductListSource {
            public static final ExtrasByHaveYouForgotten d = new ExtrasByHaveYouForgotten();
            public static final ProductListType e = ProductListType.r;

            @NotNull
            public static final Parcelable.Creator<ExtrasByHaveYouForgotten> CREATOR = new Creator();

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByHaveYouForgotten> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByHaveYouForgotten createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    parcel.readInt();
                    return ExtrasByHaveYouForgotten.d;
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByHaveYouForgotten[] newArray(int i) {
                    return new ExtrasByHaveYouForgotten[i];
                }
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0 */
            public final ProductListType getE() {
                return e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByPastShop;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByPastShop implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByPastShop> CREATOR = new Creator();
            public final String d;
            public final ProductListType e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByPastShop> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByPastShop createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByPastShop(parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByPastShop[] newArray(int i) {
                    return new ExtrasByPastShop[i];
                }
            }

            public ExtrasByPastShop(String str, ProductListType productListType) {
                Intrinsics.h(productListType, "productListType");
                this.d = str;
                this.e = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByPastShop)) {
                    return false;
                }
                ExtrasByPastShop extrasByPastShop = (ExtrasByPastShop) obj;
                return Intrinsics.c(this.d, extrasByPastShop.d) && this.e == extrasByPastShop.e;
            }

            public final int hashCode() {
                String str = this.d;
                return this.e.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.e;
            }

            public final String toString() {
                return "ExtrasByPastShop(pastShopId=" + this.d + ", productListType=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByProductGroup;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class ExtrasByProductGroup implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByProductGroup> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final ProductListType g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByProductGroup> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByProductGroup createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByProductGroup(parcel.readString(), parcel.readString(), parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByProductGroup[] newArray(int i) {
                    return new ExtrasByProductGroup[i];
                }
            }

            public ExtrasByProductGroup(String argument, String type, String str, ProductListType productListType) {
                Intrinsics.h(argument, "argument");
                Intrinsics.h(type, "type");
                Intrinsics.h(productListType, "productListType");
                this.d = argument;
                this.e = type;
                this.f = str;
                this.g = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.g;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByProductIds;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class ExtrasByProductIds implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByProductIds> CREATOR = new Creator();
            public final List d;
            public final ProductListType e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByProductIds> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByProductIds createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByProductIds(parcel.createStringArrayList(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByProductIds[] newArray(int i) {
                    return new ExtrasByProductIds[i];
                }
            }

            public ExtrasByProductIds(ArrayList arrayList, ProductListType productListType) {
                Intrinsics.h(productListType, "productListType");
                this.d = arrayList;
                this.e = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.e;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeStringList(this.d);
                dest.writeString(this.e.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByRecipe;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByRecipe implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByRecipe> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final List g;
            public final Integer h;
            public final ProductListType i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByRecipe> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByRecipe createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByRecipe(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByRecipe[] newArray(int i) {
                    return new ExtrasByRecipe[i];
                }
            }

            public ExtrasByRecipe(String recipeId, String recipeName, String str, List tags, Integer num, ProductListType productListType) {
                Intrinsics.h(recipeId, "recipeId");
                Intrinsics.h(recipeName, "recipeName");
                Intrinsics.h(tags, "tags");
                Intrinsics.h(productListType, "productListType");
                this.d = recipeId;
                this.e = recipeName;
                this.f = str;
                this.g = tags;
                this.h = num;
                this.i = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByRecipe)) {
                    return false;
                }
                ExtrasByRecipe extrasByRecipe = (ExtrasByRecipe) obj;
                return Intrinsics.c(this.d, extrasByRecipe.d) && Intrinsics.c(this.e, extrasByRecipe.e) && Intrinsics.c(this.f, extrasByRecipe.f) && Intrinsics.c(this.g, extrasByRecipe.g) && Intrinsics.c(this.h, extrasByRecipe.h) && this.i == extrasByRecipe.i;
            }

            public final int hashCode() {
                int iC = b.c(this.d.hashCode() * 31, 31, this.e);
                String str = this.f;
                int iD = b.d((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
                Integer num = this.h;
                return this.i.hashCode() + ((iD + (num != null ? num.hashCode() : 0)) * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.i;
            }

            public final String toString() {
                StringBuilder sbV = a.v("ExtrasByRecipe(recipeId=", this.d, ", recipeName=", this.e, ", sourceName=");
                au.com.woolworths.android.onesite.a.B(sbV, this.f, ", tags=", this.g, ", servesQuantity=");
                sbV.append(this.h);
                sbV.append(", productListType=");
                sbV.append(this.i);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                int iIntValue;
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeStringList(this.g);
                Integer num = this.h;
                if (num == null) {
                    iIntValue = 0;
                } else {
                    dest.writeInt(1);
                    iIntValue = num.intValue();
                }
                dest.writeInt(iIntValue);
                dest.writeString(this.i.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySearchAlternative;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class ExtrasBySearchAlternative implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasBySearchAlternative> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final Parcelable f;
            public final ProductListType g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasBySearchAlternative> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasBySearchAlternative createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasBySearchAlternative(parcel.readString(), parcel.readString(), parcel.readParcelable(ExtrasBySearchAlternative.class.getClassLoader()), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasBySearchAlternative[] newArray(int i) {
                    return new ExtrasBySearchAlternative[i];
                }
            }

            public ExtrasBySearchAlternative(String searchTerm, String type, Parcelable productToReplace, ProductListType productListType) {
                Intrinsics.h(searchTerm, "searchTerm");
                Intrinsics.h(type, "type");
                Intrinsics.h(productToReplace, "productToReplace");
                Intrinsics.h(productListType, "productListType");
                this.d = searchTerm;
                this.e = type;
                this.f = productToReplace;
                this.g = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.g;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeParcelable(this.f, i);
                dest.writeString(this.g.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySpecialsCategory;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasBySpecialsCategory implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasBySpecialsCategory> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final ProductListType f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasBySpecialsCategory> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasBySpecialsCategory createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasBySpecialsCategory(parcel.readString(), parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasBySpecialsCategory[] newArray(int i) {
                    return new ExtrasBySpecialsCategory[i];
                }
            }

            public ExtrasBySpecialsCategory(String categoryId, String str, ProductListType productListType) {
                Intrinsics.h(categoryId, "categoryId");
                Intrinsics.h(productListType, "productListType");
                this.d = categoryId;
                this.e = str;
                this.f = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasBySpecialsCategory)) {
                    return false;
                }
                ExtrasBySpecialsCategory extrasBySpecialsCategory = (ExtrasBySpecialsCategory) obj;
                return Intrinsics.c(this.d, extrasBySpecialsCategory.d) && Intrinsics.c(this.e, extrasBySpecialsCategory.e) && this.f == extrasBySpecialsCategory.f;
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.f;
            }

            public final String toString() {
                StringBuilder sbV = a.v("ExtrasBySpecialsCategory(categoryId=", this.d, ", source=", this.e, ", productListType=");
                sbV.append(this.f);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySuggestedLists;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasBySuggestedLists implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasBySuggestedLists> CREATOR = new Creator();
            public final int d;
            public final ProductListType e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasBySuggestedLists> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasBySuggestedLists createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasBySuggestedLists(parcel.readInt(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasBySuggestedLists[] newArray(int i) {
                    return new ExtrasBySuggestedLists[i];
                }
            }

            public ExtrasBySuggestedLists(int i, ProductListType productListType) {
                Intrinsics.h(productListType, "productListType");
                this.d = i;
                this.e = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasBySuggestedLists)) {
                    return false;
                }
                ExtrasBySuggestedLists extrasBySuggestedLists = (ExtrasBySuggestedLists) obj;
                return this.d == extrasBySuggestedLists.d && this.e == extrasBySuggestedLists.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.e;
            }

            public final String toString() {
                return "ExtrasBySuggestedLists(suggestedListId=" + this.d + ", productListType=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d);
                dest.writeString(this.e.name());
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasConfig;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasConfig implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasConfig> CREATOR = new Creator();
            public final Object d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasConfig> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasConfig createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), parcel.createStringArrayList());
                    }
                    return new ExtrasConfig(linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasConfig[] newArray(int i) {
                    return new ExtrasConfig[i];
                }
            }

            public ExtrasConfig(Map map) {
                this.d = map;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ExtrasConfig) && this.d.equals(((ExtrasConfig) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return b.n(this.d, "ExtrasConfig(initialFilterOptions=", ")");
            }

            /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Map] */
            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                ?? r4 = this.d;
                dest.writeInt(r4.size());
                for (Map.Entry entry : r4.entrySet()) {
                    dest.writeString((String) entry.getKey());
                    dest.writeStringList((List) entry.getValue());
                }
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasPageData;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasPageData implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ExtrasPageData> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasPageData> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasPageData createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasPageData(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasPageData[] newArray(int i) {
                    return new ExtrasPageData[i];
                }
            }

            public ExtrasPageData(String pageTitle, String str) {
                Intrinsics.h(pageTitle, "pageTitle");
                this.d = pageTitle;
                this.e = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasPageData)) {
                    return false;
                }
                ExtrasPageData extrasPageData = (ExtrasPageData) obj;
                return Intrinsics.c(this.d, extrasPageData.d) && Intrinsics.c(this.e, extrasPageData.e);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return a.j("ExtrasPageData(pageTitle=", this.d, ", stickyHeaderTitle=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ProductListQueryType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ProductListQueryType {
            public static final /* synthetic */ ProductListQueryType[] d;
            public static final /* synthetic */ EnumEntries e;

            static {
                ProductListQueryType[] productListQueryTypeArr = {new ProductListQueryType("SEARCH", 0)};
                d = productListQueryTypeArr;
                e = EnumEntriesKt.a(productListQueryTypeArr);
            }

            public static ProductListQueryType valueOf(String str) {
                return (ProductListQueryType) Enum.valueOf(ProductListQueryType.class, str);
            }

            public static ProductListQueryType[] values() {
                return (ProductListQueryType[]) d.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ProductListType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ProductListType {
            public static final ProductListType A;
            public static final ProductListType B;
            public static final ProductListType C;
            public static final ProductListType D;
            public static final ProductListType E;
            public static final ProductListType F;
            public static final ProductListType G;
            public static final ProductListType H;
            public static final ProductListType I;
            public static final ProductListType J;
            public static final /* synthetic */ ProductListType[] K;
            public static final /* synthetic */ EnumEntries L;
            public static final ProductListType o;
            public static final ProductListType p;
            public static final ProductListType q;
            public static final ProductListType r;
            public static final ProductListType s;
            public static final ProductListType t;
            public static final ProductListType u;
            public static final ProductListType v;
            public static final ProductListType w;
            public static final ProductListType x;
            public static final ProductListType y;
            public static final ProductListType z;
            public final String d;
            public final boolean e;
            public final boolean f;
            public final ToolbarType g;
            public final boolean h;
            public final boolean i;
            public final boolean j;
            public final boolean k;
            public final boolean l;
            public final int m;
            public final int n;

            static {
                ProductListType productListType = new ProductListType("BOOSTED_OFFERS", 0, "boostedOffers", null, false, 4094);
                o = productListType;
                ToolbarType toolbarType = ToolbarType.d;
                ProductListType productListType2 = new ProductListType("BUY_AGAIN", 1, "buyAgain", toolbarType, false, 4084);
                p = productListType2;
                ProductListType productListType3 = new ProductListType("CATALOGUE_SEARCH", 2, "searchResults", toolbarType, false, 4084);
                q = productListType3;
                ToolbarType toolbarType2 = ToolbarType.e;
                ProductListType productListType4 = new ProductListType("HAVE_YOU_FORGOTTEN", 3, "haveYouForgotten", toolbarType2, false, 4086);
                r = productListType4;
                ProductListType productListType5 = new ProductListType("PAST_SHOPS", 4, "pastShops", null, false, 4094);
                s = productListType5;
                ProductListType productListType6 = new ProductListType("PRODUCT_ALTERNATIVE", 5, "productAlternative", toolbarType, false, 4052);
                t = productListType6;
                ProductListType productListType7 = new ProductListType("PRODUCT_CATEGORY", 6, "productCategory", null, false, 4092);
                u = productListType7;
                ProductListType productListType8 = new ProductListType("PRODUCT_FACET", 7, "productFacet", null, false, 4092);
                v = productListType8;
                ProductListType productListType9 = new ProductListType("PRODUCT_FINDER", 8, "productFinder", toolbarType2, false, 3252);
                w = productListType9;
                ProductListType productListType10 = new ProductListType("PRODUCT_GROUP", 9, "productGroup", null, true, 3932);
                x = productListType10;
                ProductListType productListType11 = new ProductListType("PRODUCT_IDS", 10, "productIds", null, false, 4094);
                y = productListType11;
                ProductListType productListType12 = new ProductListType("PRODUCT_SPECIALS_CATEGORY", 11, "specialsGroup.productCategory", null, false, 4092);
                z = productListType12;
                ProductListType productListType13 = new ProductListType("PRODUCT_VARIETIES", 12, "productVarieties", null, false, 4094);
                A = productListType13;
                ProductListType productListType14 = new ProductListType("PROMO_TILE", 13, "productGroup", null, false, 4092);
                B = productListType14;
                ProductListType productListType15 = new ProductListType("RECIPE_PRODUCTS", 14, "recipeProducts", null, false, 1002);
                C = productListType15;
                ProductListType productListType16 = new ProductListType("SEARCH_RESULTS", 15, "searchResults", toolbarType, false, 3956);
                D = productListType16;
                ProductListType productListType17 = new ProductListType("SPECIALS", 16, "specialsGroup", null, false, 4092);
                E = productListType17;
                ProductListType productListType18 = new ProductListType("SUGGESTED_LISTS", 17, SuggestedListsQuery.OPERATION_NAME, null, false, 4094);
                F = productListType18;
                ProductListType productListType19 = new ProductListType("VIEW_SIMILAR_PRODUCTS", 18, "viewSimilarCategory", toolbarType, false, 4084);
                G = productListType19;
                ProductListType productListType20 = new ProductListType("VOICE_PRODUCT_FINDER", 19, "voiceProductFinder", toolbarType2, false, 3252);
                H = productListType20;
                ProductListType productListType21 = new ProductListType("VOICE_PRODUCT_SEARCH", 20, "voiceProductSearch", toolbarType, true, 3668);
                I = productListType21;
                ProductListType productListType22 = new ProductListType("VOICE_WITH_MAPS_PRODUCT_FINDER", 21, "voiceWithMapsProductFinder", toolbarType2, false, 3252);
                J = productListType22;
                ProductListType[] productListTypeArr = {productListType, productListType2, productListType3, productListType4, productListType5, productListType6, productListType7, productListType8, productListType9, productListType10, productListType11, productListType12, productListType13, productListType14, productListType15, productListType16, productListType17, productListType18, productListType19, productListType20, productListType21, productListType22};
                K = productListTypeArr;
                L = EnumEntriesKt.a(productListTypeArr);
            }

            public ProductListType(String str, int i, String str2, ToolbarType toolbarType, boolean z2, int i2) {
                boolean z3 = (i2 & 2) == 0;
                boolean z4 = (i2 & 4) != 0;
                toolbarType = (i2 & 8) != 0 ? ToolbarType.f : toolbarType;
                boolean z5 = (i2 & 16) != 0;
                z2 = (i2 & 32) != 0 ? true : z2;
                boolean z6 = (i2 & 64) == 0;
                boolean z7 = (i2 & 128) == 0;
                boolean z8 = (i2 & 256) == 0;
                int i3 = (i2 & 1024) != 0 ? R.style.TextAppearance_Body_Medium : R.style.TextAppearance_Body;
                int i4 = (i2 & 2048) != 0 ? android.R.attr.textColorPrimary : android.R.attr.textColorSecondary;
                this.d = str2;
                this.e = z3;
                this.f = z4;
                this.g = toolbarType;
                this.h = z5;
                this.i = z2;
                this.j = z6;
                this.k = z7;
                this.l = z8;
                this.m = i3;
                this.n = i4;
            }

            public static ProductListType valueOf(String str) {
                return (ProductListType) Enum.valueOf(ProductListType.class, str);
            }

            public static ProductListType[] values() {
                return (ProductListType[]) K.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ToolbarType;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ToolbarType {
            public static final ToolbarType d;
            public static final ToolbarType e;
            public static final ToolbarType f;
            public static final /* synthetic */ ToolbarType[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                ToolbarType toolbarType = new ToolbarType("EDITABLE", 0);
                d = toolbarType;
                ToolbarType toolbarType2 = new ToolbarType("NONE", 1);
                e = toolbarType2;
                ToolbarType toolbarType3 = new ToolbarType("STANDARD", 2);
                f = toolbarType3;
                ToolbarType[] toolbarTypeArr = {toolbarType, toolbarType2, toolbarType3};
                g = toolbarTypeArr;
                h = EnumEntriesKt.a(toolbarTypeArr);
            }

            public static ToolbarType valueOf(String str) {
                return (ToolbarType) Enum.valueOf(ToolbarType.class, str);
            }

            public static ToolbarType[] values() {
                return (ToolbarType[]) g.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity";
        }

        public final Intent b(Extras extras, boolean z) {
            Intent intentA = ActivityNavigatorKt.a(this, ApplicationType.e);
            if (z) {
                intentA.setFlags(335544320);
            }
            intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", extras);
            return intentA;
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByBoostedOffers;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByBoostedOffers implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByBoostedOffers> CREATOR = new Creator();
            public final String d;
            public final ProductListType e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByBoostedOffers> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByBoostedOffers createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByBoostedOffers(parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByBoostedOffers[] newArray(int i) {
                    return new ExtrasByBoostedOffers[i];
                }
            }

            public ExtrasByBoostedOffers(String crnHash, ProductListType productListType) {
                Intrinsics.h(crnHash, "crnHash");
                Intrinsics.h(productListType, "productListType");
                this.d = crnHash;
                this.e = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByBoostedOffers)) {
                    return false;
                }
                ExtrasByBoostedOffers extrasByBoostedOffers = (ExtrasByBoostedOffers) obj;
                return Intrinsics.c(this.d, extrasByBoostedOffers.d) && this.e == extrasByBoostedOffers.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.e;
            }

            public final String toString() {
                return "ExtrasByBoostedOffers(crnHash=" + this.d + ", productListType=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e.name());
            }

            public /* synthetic */ ExtrasByBoostedOffers(String str) {
                this(str, ProductListType.o);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByPriceFamily;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByPriceFamily implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByPriceFamily> CREATOR = new Creator();
            public final String d;
            public final ProductListType e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByPriceFamily> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByPriceFamily createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByPriceFamily(parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByPriceFamily[] newArray(int i) {
                    return new ExtrasByPriceFamily[i];
                }
            }

            public ExtrasByPriceFamily(String priceFamilyId, ProductListType productListType) {
                Intrinsics.h(priceFamilyId, "priceFamilyId");
                Intrinsics.h(productListType, "productListType");
                this.d = priceFamilyId;
                this.e = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByPriceFamily)) {
                    return false;
                }
                ExtrasByPriceFamily extrasByPriceFamily = (ExtrasByPriceFamily) obj;
                return Intrinsics.c(this.d, extrasByPriceFamily.d) && this.e == extrasByPriceFamily.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + (this.d.hashCode() * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.e;
            }

            public final String toString() {
                return "ExtrasByPriceFamily(priceFamilyId=" + this.d + ", productListType=" + this.e + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e.name());
            }

            public /* synthetic */ ExtrasByPriceFamily(String str) {
                this(str, ProductListType.A);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final ExtrasPageData d;
            public final ExtraProductListSource e;
            public final ExtrasConfig f;
            public final boolean g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(ExtrasPageData.CREATOR.createFromParcel(parcel), (ExtraProductListSource) parcel.readParcelable(Extras.class.getClassLoader()), ExtrasConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(ExtrasPageData pageData, ExtraProductListSource productListSource, ExtrasConfig config, boolean z) {
                Intrinsics.h(pageData, "pageData");
                Intrinsics.h(productListSource, "productListSource");
                Intrinsics.h(config, "config");
                this.d = pageData;
                this.e = productListSource;
                this.f = config;
                this.g = z;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f) && this.g == extras.g;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.g) + android.support.v4.media.session.a.e((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f.d);
            }

            public final String toString() {
                return "Extras(pageData=" + this.d + ", productListSource=" + this.e + ", config=" + this.f + ", initialLoad=" + this.g + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                this.d.writeToParcel(dest, i);
                dest.writeParcelable(this.e, i);
                this.f.writeToParcel(dest, i);
                dest.writeInt(this.g ? 1 : 0);
            }

            public /* synthetic */ Extras(ExtrasPageData extrasPageData, ExtraProductListSource extraProductListSource, ExtrasConfig extrasConfig, int i) {
                this(extrasPageData, extraProductListSource, (i & 4) != 0 ? new ExtrasConfig(EmptyMap.d) : extrasConfig, (i & 8) == 0);
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasBySearch;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class ExtrasBySearch implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasBySearch> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final List f;
            public final String g;
            public final ProductListType h;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasBySearch> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasBySearch createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasBySearch(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasBySearch[] newArray(int i) {
                    return new ExtrasBySearch[i];
                }
            }

            public ExtrasBySearch(String searchTerm, String type, List selectedChips, String str, ProductListType productListType) {
                Intrinsics.h(searchTerm, "searchTerm");
                Intrinsics.h(type, "type");
                Intrinsics.h(selectedChips, "selectedChips");
                Intrinsics.h(productListType, "productListType");
                this.d = searchTerm;
                this.e = type;
                this.f = selectedChips;
                this.g = str;
                this.h = productListType;
            }

            /* renamed from: a, reason: from getter */
            public String getD() {
                return this.d;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public ProductListType getE() {
                return this.h;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeStringList(this.f);
                dest.writeString(this.g);
                dest.writeString(this.h.name());
            }

            /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
            public ExtrasBySearch(String str, List list, String str2, ProductListType productListType, int i) {
                this(str, "search", (i & 4) != 0 ? EmptyList.d : list, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? ProductListType.D : productListType);
                if ((i & 2) != 0) {
                    ProductListQueryType[] productListQueryTypeArr = ProductListQueryType.d;
                }
            }
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtrasByFacet;", "Lau/com/woolworths/android/onesite/navigation/Activities$ProductList$ExtraProductListSource;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ExtrasByFacet implements ExtraProductListSource {

            @NotNull
            public static final Parcelable.Creator<ExtrasByFacet> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;
            public final ProductListType i;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ExtrasByFacet> {
                @Override // android.os.Parcelable.Creator
                public final ExtrasByFacet createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new ExtrasByFacet(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), ProductListType.valueOf(parcel.readString()));
                }

                @Override // android.os.Parcelable.Creator
                public final ExtrasByFacet[] newArray(int i) {
                    return new ExtrasByFacet[i];
                }
            }

            public ExtrasByFacet(String str, String name, String channel, String facet, String str2, ProductListType productListType) {
                Intrinsics.h(name, "name");
                Intrinsics.h(channel, "channel");
                Intrinsics.h(facet, "facet");
                Intrinsics.h(productListType, "productListType");
                this.d = str;
                this.e = name;
                this.f = channel;
                this.g = facet;
                this.h = str2;
                this.i = productListType;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ExtrasByFacet)) {
                    return false;
                }
                ExtrasByFacet extrasByFacet = (ExtrasByFacet) obj;
                return Intrinsics.c(this.d, extrasByFacet.d) && Intrinsics.c(this.e, extrasByFacet.e) && Intrinsics.c(this.f, extrasByFacet.f) && Intrinsics.c(this.g, extrasByFacet.g) && Intrinsics.c(this.h, extrasByFacet.h) && this.i == extrasByFacet.i;
            }

            public final int hashCode() {
                String str = this.d;
                int iC = b.c(b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e), 31, this.f), 31, this.g);
                String str2 = this.h;
                return this.i.hashCode() + ((iC + (str2 != null ? str2.hashCode() : 0)) * 31);
            }

            @Override // au.com.woolworths.android.onesite.navigation.Activities.ProductList.ExtraProductListSource
            /* renamed from: i0, reason: from getter */
            public final ProductListType getE() {
                return this.i;
            }

            public final String toString() {
                StringBuilder sbV = a.v("ExtrasByFacet(id=", this.d, ", name=", this.e, ", channel=");
                androidx.constraintlayout.core.state.a.B(sbV, this.f, ", facet=", this.g, ", source=");
                sbV.append(this.h);
                sbV.append(", productListType=");
                sbV.append(this.i);
                sbV.append(")");
                return sbV.toString();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
                dest.writeString(this.h);
                dest.writeString(this.i.name());
            }

            public /* synthetic */ ExtrasByFacet(String str, String str2, String str3, String str4, String str5) {
                this(str, str2, str3, str4, str5, ProductListType.v);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeSearch;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RecipeSearch implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final RecipeSearch f4513a = new RecipeSearch();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shop.recipes.search.RecipeSearchActivity";
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$RecipeSearch$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;
            public final String e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String str, String str2) {
                this.d = str;
                this.e = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return Intrinsics.c(this.d, extras.d) && Intrinsics.c(this.e, extras.e);
            }

            public final int hashCode() {
                String str = this.d;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.e;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return a.j("Extras(prefilledSearchTerm=", this.d, ", searchBarPlaceholderText=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
            }

            public /* synthetic */ Extras(String str, String str2, int i) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CreateUpdateShoppingList;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "Extras", "Mode", "CreateUpdateResult", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CreateUpdateShoppingList implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final CreateUpdateShoppingList f4464a = new CreateUpdateShoppingList();

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CreateUpdateShoppingList$CreateUpdateResult;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CreateUpdateResult implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<CreateUpdateResult> CREATOR = new Creator();
            public final boolean d;
            public final String e;
            public final String f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<CreateUpdateResult> {
                @Override // android.os.Parcelable.Creator
                public final CreateUpdateResult createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new CreateUpdateResult(parcel.readInt() != 0, parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final CreateUpdateResult[] newArray(int i) {
                    return new CreateUpdateResult[i];
                }
            }

            public CreateUpdateResult(boolean z, String str, String str2) {
                this.d = z;
                this.e = str;
                this.f = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof CreateUpdateResult)) {
                    return false;
                }
                CreateUpdateResult createUpdateResult = (CreateUpdateResult) obj;
                return this.d == createUpdateResult.d && Intrinsics.c(this.e, createUpdateResult.e) && Intrinsics.c(this.f, createUpdateResult.f);
            }

            public final int hashCode() {
                int iHashCode = Boolean.hashCode(this.d) * 31;
                String str = this.e;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return a.o(au.com.woolworths.android.onesite.a.t("CreateUpdateResult(success=", ", listId=", this.e, ", listTitle=", this.d), this.f, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeInt(this.d ? 1 : 0);
                dest.writeString(this.e);
                dest.writeString(this.f);
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CreateUpdateShoppingList$Mode;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Mode {
            public static final Mode d;
            public static final Mode e;
            public static final Mode f;
            public static final /* synthetic */ Mode[] g;
            public static final /* synthetic */ EnumEntries h;

            static {
                Mode mode = new Mode("CREATE", 0);
                d = mode;
                Mode mode2 = new Mode("DUPLICATE", 1);
                e = mode2;
                Mode mode3 = new Mode("UPDATE", 2);
                f = mode3;
                Mode[] modeArr = {mode, mode2, mode3};
                g = modeArr;
                h = EnumEntriesKt.a(modeArr);
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) g.clone();
            }
        }

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.shop.addtolist.edit.CreateUpdateShoppingListActivity";
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$CreateUpdateShoppingList$Extras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final Mode d;
            public final String e;
            public final Map f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    Mode modeValueOf = Mode.valueOf(parcel.readString());
                    String string = parcel.readString();
                    int i = parcel.readInt();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                    for (int i2 = 0; i2 != i; i2++) {
                        linkedHashMap.put(parcel.readString(), Double.valueOf(parcel.readDouble()));
                    }
                    return new Extras(modeValueOf, string, linkedHashMap);
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(Mode mode, String str, Map initialProductItems) {
                Intrinsics.h(mode, "mode");
                Intrinsics.h(initialProductItems, "initialProductItems");
                this.d = mode;
                this.e = str;
                this.f = initialProductItems;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extras)) {
                    return false;
                }
                Extras extras = (Extras) obj;
                return this.d == extras.d && Intrinsics.c(this.e, extras.e) && Intrinsics.c(this.f, extras.f);
            }

            public final int hashCode() {
                int iHashCode = this.d.hashCode() * 31;
                String str = this.e;
                return this.f.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "Extras(mode=" + this.d + ", listId=" + this.e + ", initialProductItems=" + this.f + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d.name());
                dest.writeString(this.e);
                Map map = this.f;
                dest.writeInt(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    dest.writeString((String) entry.getKey());
                    dest.writeDouble(((Number) entry.getValue()).doubleValue());
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
            public /* synthetic */ Extras(Mode mode, String str, LinkedHashMap linkedHashMap, int i) {
                this(mode, (i & 2) != 0 ? null : str, (i & 4) != 0 ? EmptyMap.d : linkedHashMap);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$AppConfigAction;", "Lau/com/woolworths/android/onesite/navigation/AddressableActivity;", "ConfigExtras", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AppConfigAction implements AddressableActivity {

        /* renamed from: a, reason: collision with root package name */
        public static final AppConfigAction f4446a = new AppConfigAction();

        @Override // au.com.woolworths.android.onesite.navigation.AddressableActivity
        public final String a() {
            return "au.com.woolworths.feature.shared.force.upgrade.ConfigActionActivity";
        }

        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/navigation/Activities$AppConfigAction$ConfigExtras;", "Landroid/os/Parcelable;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ConfigExtras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<ConfigExtras> CREATOR = new Creator();
            public final String d;
            public final String e;
            public final String f;
            public final String g;
            public final String h;
            public final String i;
            public final String j;
            public final Boolean k;
            public final String l;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<ConfigExtras> {
                @Override // android.os.Parcelable.Creator
                public final ConfigExtras createFromParcel(Parcel parcel) {
                    Boolean boolValueOf;
                    Intrinsics.h(parcel, "parcel");
                    String string = parcel.readString();
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    String string4 = parcel.readString();
                    String string5 = parcel.readString();
                    String string6 = parcel.readString();
                    String string7 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new ConfigExtras(string, string2, string3, string4, string5, string6, string7, boolValueOf, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ConfigExtras[] newArray(int i) {
                    return new ConfigExtras[i];
                }
            }

            public ConfigExtras(String screenType, String upgradeType, String promptType, String title, String message, String primaryAction, String str, Boolean bool, String str2) {
                Intrinsics.h(screenType, "screenType");
                Intrinsics.h(upgradeType, "upgradeType");
                Intrinsics.h(promptType, "promptType");
                Intrinsics.h(title, "title");
                Intrinsics.h(message, "message");
                Intrinsics.h(primaryAction, "primaryAction");
                this.d = screenType;
                this.e = upgradeType;
                this.f = promptType;
                this.g = title;
                this.h = message;
                this.i = primaryAction;
                this.j = str;
                this.k = bool;
                this.l = str2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ConfigExtras)) {
                    return false;
                }
                ConfigExtras configExtras = (ConfigExtras) obj;
                return Intrinsics.c(this.d, configExtras.d) && Intrinsics.c(this.e, configExtras.e) && Intrinsics.c(this.f, configExtras.f) && Intrinsics.c(this.g, configExtras.g) && Intrinsics.c(this.h, configExtras.h) && Intrinsics.c(this.i, configExtras.i) && Intrinsics.c(this.j, configExtras.j) && Intrinsics.c(this.k, configExtras.k) && Intrinsics.c(this.l, configExtras.l);
            }

            public final int hashCode() {
                int iC = b.c(b.c(b.c(b.c(b.c(this.d.hashCode() * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
                String str = this.j;
                int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
                Boolean bool = this.k;
                int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
                String str2 = this.l;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sbV = a.v("ConfigExtras(screenType=", this.d, ", upgradeType=", this.e, ", promptType=");
                androidx.constraintlayout.core.state.a.B(sbV, this.f, ", title=", this.g, ", message=");
                androidx.constraintlayout.core.state.a.B(sbV, this.h, ", primaryAction=", this.i, ", secondaryAction=");
                au.com.woolworths.android.onesite.a.A(sbV, this.j, ", showRewardsCardAction=", this.k, ", responseAppVersion=");
                return a.o(sbV, this.l, ")");
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                int iBooleanValue;
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
                dest.writeString(this.e);
                dest.writeString(this.f);
                dest.writeString(this.g);
                dest.writeString(this.h);
                dest.writeString(this.i);
                dest.writeString(this.j);
                Boolean bool = this.k;
                if (bool == null) {
                    iBooleanValue = 0;
                } else {
                    dest.writeInt(1);
                    iBooleanValue = bool.booleanValue();
                }
                dest.writeInt(iBooleanValue);
                dest.writeString(this.l);
            }

            public /* synthetic */ ConfigExtras(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
                this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : str7, Boolean.FALSE, (i & 256) != 0 ? null : str8);
            }
        }
    }
}
