package au.com.woolworths.android.onesite.modules.main;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.notification.NotificationResult;
import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;
import au.com.woolworths.feature.shop.contentpage.ContentPageFragment;
import au.com.woolworths.feature.shop.homepage.data.DeliveryNow;
import au.com.woolworths.feature.shop.homepage.data.FulfilmentWindowContainer;
import au.com.woolworths.feature.shop.homepage.data.HomeFulfilmentWindowState;
import au.com.woolworths.feature.shop.homepage.data.ModeSelectorSubHeaderData;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageContract;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageFragment;
import au.com.woolworths.feature.shop.more.MoreFragment;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.lists.ListsFragment;
import au.com.woolworths.shop.product.navigation.analytics.ProductCategoryScreens;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment;
import au.com.woolworths.shop.specials.SpecialsHomeFragment;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract;", "", "MainPage", "ToolbarConfiguration", "ModeChipsConfiguration", "SearchConfiguration", "ViewState", "HeaderInfo", "FulfilmentWindowInfo", "ModeSelectorInfo", "SpeechBubbleInfo", "Actions", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MainContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0016\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0082\u0001\u0016\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-¨\u0006."}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "", "ShowLoginPrompt", "ShowCollectionModeSetup", "ShowStoreLocator", "ShowPickupLocator", "ShowManageDeliveryAddress", "ShowAddDeliveryAddress", "ShowFailedMigration", "ShowCollectionModeSelectorScreen", "NavigateToSearchScreen", "NavigateToInboxScreen", "NavigateToAskOliveScreen", "NavigateToBarcodeScanner", "NotifyAlert", "NotifyCampaign", "ShowSnackbarMessage", "RefreshCurrentFragment", "LaunchDeepLink", "LaunchFulfilmentWindowLogin", "ShowInstoreReminderPopup", "HideInstoreReminderPopup", "LaunchVoiceProductSearch", "ShowUpgradePrompt", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$HideInstoreReminderPopup;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$LaunchFulfilmentWindowLogin;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToAskOliveScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToBarcodeScanner;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToInboxScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToSearchScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NotifyAlert;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NotifyCampaign;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$RefreshCurrentFragment;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowAddDeliveryAddress;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowCollectionModeSelectorScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowCollectionModeSetup;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowFailedMigration;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowInstoreReminderPopup;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowLoginPrompt;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowManageDeliveryAddress;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowPickupLocator;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowStoreLocator;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowUpgradePrompt;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$HideInstoreReminderPopup;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class HideInstoreReminderPopup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final HideInstoreReminderPopup f4341a = new HideInstoreReminderPopup();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof HideInstoreReminderPopup);
            }

            public final int hashCode() {
                return -1337553965;
            }

            public final String toString() {
                return "HideInstoreReminderPopup";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f4342a;

            public LaunchDeepLink(String str) {
                this.f4342a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f4342a, ((LaunchDeepLink) obj).f4342a);
            }

            public final int hashCode() {
                return this.f4342a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(url=", this.f4342a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$LaunchFulfilmentWindowLogin;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchFulfilmentWindowLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f4343a;

            public LaunchFulfilmentWindowLogin(String str) {
                this.f4343a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchFulfilmentWindowLogin) && Intrinsics.c(this.f4343a, ((LaunchFulfilmentWindowLogin) obj).f4343a);
            }

            public final int hashCode() {
                return this.f4343a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchFulfilmentWindowLogin(urlAfterLogin=", this.f4343a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$LaunchVoiceProductSearch;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchVoiceProductSearch extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchVoiceProductSearch f4344a = new LaunchVoiceProductSearch();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchVoiceProductSearch);
            }

            public final int hashCode() {
                return 1969575435;
            }

            public final String toString() {
                return "LaunchVoiceProductSearch";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToAskOliveScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToAskOliveScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToAskOliveScreen f4345a = new NavigateToAskOliveScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToAskOliveScreen);
            }

            public final int hashCode() {
                return -1659248019;
            }

            public final String toString() {
                return "NavigateToAskOliveScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToBarcodeScanner;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToBarcodeScanner extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToBarcodeScanner f4346a = new NavigateToBarcodeScanner();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToBarcodeScanner);
            }

            public final int hashCode() {
                return 101474781;
            }

            public final String toString() {
                return "NavigateToBarcodeScanner";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToInboxScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToInboxScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToInboxScreen f4347a = new NavigateToInboxScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToInboxScreen);
            }

            public final int hashCode() {
                return 1556770419;
            }

            public final String toString() {
                return "NavigateToInboxScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NavigateToSearchScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToSearchScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToSearchScreen f4348a = new NavigateToSearchScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToSearchScreen);
            }

            public final int hashCode() {
                return -885222285;
            }

            public final String toString() {
                return "NavigateToSearchScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NotifyAlert;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NotifyAlert extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final NotificationResult.Notification f4349a;

            public NotifyAlert(NotificationResult.Notification notification) {
                Intrinsics.h(notification, "notification");
                this.f4349a = notification;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotifyAlert) && Intrinsics.c(this.f4349a, ((NotifyAlert) obj).f4349a);
            }

            public final int hashCode() {
                return this.f4349a.hashCode();
            }

            public final String toString() {
                return "NotifyAlert(notification=" + this.f4349a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$NotifyCampaign;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NotifyCampaign extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final NotificationResult.Notification f4350a;

            public NotifyCampaign(NotificationResult.Notification notification) {
                Intrinsics.h(notification, "notification");
                this.f4350a = notification;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NotifyCampaign) && Intrinsics.c(this.f4350a, ((NotifyCampaign) obj).f4350a);
            }

            public final int hashCode() {
                return this.f4350a.hashCode();
            }

            public final String toString() {
                return "NotifyCampaign(notification=" + this.f4350a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$RefreshCurrentFragment;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RefreshCurrentFragment extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final RefreshCurrentFragment f4351a = new RefreshCurrentFragment();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof RefreshCurrentFragment);
            }

            public final int hashCode() {
                return 1172804833;
            }

            public final String toString() {
                return "RefreshCurrentFragment";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowAddDeliveryAddress;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAddDeliveryAddress extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowAddDeliveryAddress f4352a = new ShowAddDeliveryAddress();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowAddDeliveryAddress);
            }

            public final int hashCode() {
                return 1358847663;
            }

            public final String toString() {
                return "ShowAddDeliveryAddress";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowCollectionModeSelectorScreen;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCollectionModeSelectorScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final CollectionMode f4353a;

            public ShowCollectionModeSelectorScreen(CollectionMode collectionMode) {
                this.f4353a = collectionMode;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowCollectionModeSelectorScreen) && Intrinsics.c(this.f4353a, ((ShowCollectionModeSelectorScreen) obj).f4353a);
            }

            public final int hashCode() {
                CollectionMode collectionMode = this.f4353a;
                if (collectionMode == null) {
                    return 0;
                }
                return collectionMode.hashCode();
            }

            public final String toString() {
                return "ShowCollectionModeSelectorScreen(selectedMode=" + this.f4353a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowCollectionModeSetup;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowCollectionModeSetup extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowCollectionModeSetup);
            }

            public final int hashCode() {
                return Boolean.hashCode(false);
            }

            public final String toString() {
                return "ShowCollectionModeSetup(showToolbar=false)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowFailedMigration;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowFailedMigration extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowFailedMigration);
            }

            public final int hashCode() {
                return -144668191;
            }

            public final String toString() {
                return "ShowFailedMigration";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowInstoreReminderPopup;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowInstoreReminderPopup extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowInstoreReminderPopup f4354a = new ShowInstoreReminderPopup();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowInstoreReminderPopup);
            }

            public final int hashCode() {
                return -458858994;
            }

            public final String toString() {
                return "ShowInstoreReminderPopup";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowLoginPrompt;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowLoginPrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowLoginPrompt f4355a = new ShowLoginPrompt();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowLoginPrompt);
            }

            public final int hashCode() {
                return 243204093;
            }

            public final String toString() {
                return "ShowLoginPrompt";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowManageDeliveryAddress;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowManageDeliveryAddress extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowManageDeliveryAddress);
            }

            public final int hashCode() {
                return 1396783883;
            }

            public final String toString() {
                return "ShowManageDeliveryAddress";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowPickupLocator;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowPickupLocator extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowPickupLocator f4356a = new ShowPickupLocator();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowPickupLocator);
            }

            public final int hashCode() {
                return -1159368630;
            }

            public final String toString() {
                return "ShowPickupLocator";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f4357a;

            public ShowSnackbarMessage(Text text) {
                this.f4357a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSnackbarMessage) && Intrinsics.c(this.f4357a, ((ShowSnackbarMessage) obj).f4357a);
            }

            public final int hashCode() {
                return this.f4357a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowSnackbarMessage(message=", this.f4357a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowStoreLocator;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowStoreLocator extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowStoreLocator f4358a = new ShowStoreLocator();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowStoreLocator);
            }

            public final int hashCode() {
                return 941025445;
            }

            public final String toString() {
                return "ShowStoreLocator";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions$ShowUpgradePrompt;", "Lau/com/woolworths/android/onesite/modules/main/MainContract$Actions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowUpgradePrompt extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final UpgradeConfig f4359a;

            public ShowUpgradePrompt(UpgradeConfig upgradeConfig) {
                Intrinsics.h(upgradeConfig, "upgradeConfig");
                this.f4359a = upgradeConfig;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowUpgradePrompt) && Intrinsics.c(this.f4359a, ((ShowUpgradePrompt) obj).f4359a);
            }

            public final int hashCode() {
                return this.f4359a.hashCode();
            }

            public final String toString() {
                return "ShowUpgradePrompt(upgradeConfig=" + this.f4359a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$FulfilmentWindowInfo;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowInfo {

        /* renamed from: a, reason: collision with root package name */
        public final HomeFulfilmentWindowState f4360a;
        public final FulfilmentWindowContainer b;
        public final ModeSelectorSubHeaderData c;

        public FulfilmentWindowInfo(HomeFulfilmentWindowState homeFulfilmentWindowState, FulfilmentWindowContainer fulfilmentWindowContainer, ModeSelectorSubHeaderData modeSelectorSubHeaderData) {
            this.f4360a = homeFulfilmentWindowState;
            this.b = fulfilmentWindowContainer;
            this.c = modeSelectorSubHeaderData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindowInfo)) {
                return false;
            }
            FulfilmentWindowInfo fulfilmentWindowInfo = (FulfilmentWindowInfo) obj;
            return Intrinsics.c(this.f4360a, fulfilmentWindowInfo.f4360a) && Intrinsics.c(this.b, fulfilmentWindowInfo.b) && Intrinsics.c(this.c, fulfilmentWindowInfo.c);
        }

        public final int hashCode() {
            HomeFulfilmentWindowState homeFulfilmentWindowState = this.f4360a;
            int iHashCode = (homeFulfilmentWindowState == null ? 0 : homeFulfilmentWindowState.hashCode()) * 31;
            FulfilmentWindowContainer fulfilmentWindowContainer = this.b;
            int iHashCode2 = (iHashCode + (fulfilmentWindowContainer == null ? 0 : fulfilmentWindowContainer.hashCode())) * 31;
            ModeSelectorSubHeaderData modeSelectorSubHeaderData = this.c;
            return iHashCode2 + (modeSelectorSubHeaderData != null ? modeSelectorSubHeaderData.hashCode() : 0);
        }

        public final String toString() {
            return "FulfilmentWindowInfo(windowInfo=" + this.f4360a + ", containerInfo=" + this.b + ", subHeaderInfo=" + this.c + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$MainPage;", "", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MainPage {
        public static final Companion d;
        public static final MainPage e;
        public static final MainPage f;
        public static final /* synthetic */ MainPage[] g;
        public static final /* synthetic */ EnumEntries h;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$MainPage$Companion;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @SourceDebugExtension
        public static final class Companion {
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/MainContract.MainPage.HOME", "Lau/com/woolworths/android/onesite/modules/main/MainContract$MainPage;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class HOME extends MainPage {
            public final Screens i;
            public final ModeChipsConfiguration j;
            public final SearchConfiguration k;
            public final boolean l;
            public final boolean m;

            public HOME() {
                super("HOME", 0);
                this.i = Screens.l;
                this.j = ModeChipsConfiguration.d;
                this.k = SearchConfiguration.d;
                this.l = true;
                this.m = true;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Screen a() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int b() {
                return R.id.action_home;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Fragment c(FeatureToggleManager featureToggleManager) {
                return new HomePageFragment();
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: d, reason: from getter */
            public final boolean getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: e, reason: from getter */
            public final ModeChipsConfiguration getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: f, reason: from getter */
            public final SearchConfiguration getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: l, reason: from getter */
            public final boolean getL() {
                return this.l;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int m() {
                return R.string.navigation_home_title;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final ToolbarConfiguration n(FeatureToggleManager featureToggleManager) {
                Intrinsics.h(featureToggleManager, "featureToggleManager");
                return ToolbarConfiguration.f;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/MainContract.MainPage.LISTS", "Lau/com/woolworths/android/onesite/modules/main/MainContract$MainPage;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LISTS extends MainPage {
            public final ListScreen.Lists i;
            public final ModeChipsConfiguration j;
            public final SearchConfiguration k;

            public LISTS() {
                super("LISTS", 1);
                this.i = new ListScreen.Lists(ListsAnalyticsAppSection.e);
                this.j = ModeChipsConfiguration.f;
                this.k = SearchConfiguration.e;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Screen a() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int b() {
                return R.id.action_lists;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Fragment c(FeatureToggleManager featureToggleManager) {
                ListsFragment.m.getClass();
                return new ListsFragment();
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: d */
            public final boolean getM() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: e, reason: from getter */
            public final ModeChipsConfiguration getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: f, reason: from getter */
            public final SearchConfiguration getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: l */
            public final boolean getL() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int m() {
                return R.string.navigation_lists_title;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final ToolbarConfiguration n(FeatureToggleManager featureToggleManager) {
                Intrinsics.h(featureToggleManager, "featureToggleManager");
                return ToolbarConfiguration.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/MainContract.MainPage.MORE", "Lau/com/woolworths/android/onesite/modules/main/MainContract$MainPage;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class MORE extends MainPage {
            public final Screens i;
            public final ModeChipsConfiguration j;
            public final SearchConfiguration k;

            public MORE() {
                super("MORE", 4);
                this.i = Screens.k;
                this.j = ModeChipsConfiguration.e;
                this.k = SearchConfiguration.e;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Screen a() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int b() {
                return R.id.action_more;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Fragment c(FeatureToggleManager featureToggleManager) {
                return new MoreFragment();
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: d */
            public final boolean getM() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: e, reason: from getter */
            public final ModeChipsConfiguration getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: f, reason: from getter */
            public final SearchConfiguration getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: l */
            public final boolean getL() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int m() {
                return R.string.navigation_more_title;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final ToolbarConfiguration n(FeatureToggleManager featureToggleManager) {
                Intrinsics.h(featureToggleManager, "featureToggleManager");
                return ToolbarConfiguration.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/MainContract.MainPage.PRODUCTS", "Lau/com/woolworths/android/onesite/modules/main/MainContract$MainPage;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PRODUCTS extends MainPage {
            public final Screens i;
            public final ModeChipsConfiguration j;
            public final SearchConfiguration k;

            public PRODUCTS() {
                super("PRODUCTS", 2);
                this.i = Screens.u;
                this.j = ModeChipsConfiguration.f;
                this.k = SearchConfiguration.e;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Screen a() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int b() {
                return R.id.action_products;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Fragment c(FeatureToggleManager featureToggleManager) {
                return new ProductCategoryFragment();
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: d */
            public final boolean getM() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: e, reason: from getter */
            public final ModeChipsConfiguration getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: f, reason: from getter */
            public final SearchConfiguration getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: l */
            public final boolean getL() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int m() {
                return R.string.navigation_products_title;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final ToolbarConfiguration n(FeatureToggleManager featureToggleManager) {
                Intrinsics.h(featureToggleManager, "featureToggleManager");
                return ToolbarConfiguration.d;
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/main/MainContract.MainPage.SPECIALS", "Lau/com/woolworths/android/onesite/modules/main/MainContract$MainPage;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SPECIALS extends MainPage {
            public final ProductCategoryScreens i;
            public final ModeChipsConfiguration j;
            public final SearchConfiguration k;

            public SPECIALS() {
                super("SPECIALS", 3);
                this.i = ProductCategoryScreens.e;
                this.j = ModeChipsConfiguration.f;
                this.k = SearchConfiguration.e;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Screen a() {
                return this.i;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int b() {
                return R.id.action_specials;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final Fragment c(FeatureToggleManager featureToggleManager) {
                return featureToggleManager.c(BaseShopAppFeature.Z) ? ContentPageFragment.Companion.a(new ContentPageFragment.Extras(new Activities.ContentPage.ContentPageExtras(Activities.ContentPage.ContentPageType.v, "", null)), false) : new SpecialsHomeFragment();
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: d */
            public final boolean getM() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: e, reason: from getter */
            public final ModeChipsConfiguration getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: f, reason: from getter */
            public final SearchConfiguration getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            /* renamed from: l */
            public final boolean getL() {
                return false;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final int m() {
                return R.string.navigation_specials_title;
            }

            @Override // au.com.woolworths.android.onesite.modules.main.MainContract.MainPage
            public final ToolbarConfiguration n(FeatureToggleManager featureToggleManager) {
                Intrinsics.h(featureToggleManager, "featureToggleManager");
                return ToolbarConfiguration.d;
            }
        }

        static {
            HOME home = new HOME();
            e = home;
            LISTS lists = new LISTS();
            PRODUCTS products = new PRODUCTS();
            SPECIALS specials = new SPECIALS();
            f = specials;
            MainPage[] mainPageArr = {home, lists, products, specials, new MORE()};
            g = mainPageArr;
            h = EnumEntriesKt.a(mainPageArr);
            d = new Companion();
        }

        public static MainPage valueOf(String str) {
            return (MainPage) Enum.valueOf(MainPage.class, str);
        }

        public static MainPage[] values() {
            return (MainPage[]) g.clone();
        }

        public abstract Screen a();

        public abstract int b();

        public abstract Fragment c(FeatureToggleManager featureToggleManager);

        /* renamed from: d */
        public abstract boolean getM();

        /* renamed from: e */
        public abstract ModeChipsConfiguration getJ();

        /* renamed from: f */
        public abstract SearchConfiguration getK();

        /* renamed from: l */
        public abstract boolean getL();

        public abstract int m();

        public abstract ToolbarConfiguration n(FeatureToggleManager featureToggleManager);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$ModeChipsConfiguration;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ModeChipsConfiguration {
        public static final ModeChipsConfiguration d;
        public static final ModeChipsConfiguration e;
        public static final ModeChipsConfiguration f;
        public static final /* synthetic */ ModeChipsConfiguration[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            ModeChipsConfiguration modeChipsConfiguration = new ModeChipsConfiguration("ALL", 0);
            d = modeChipsConfiguration;
            ModeChipsConfiguration modeChipsConfiguration2 = new ModeChipsConfiguration("NONE", 1);
            e = modeChipsConfiguration2;
            ModeChipsConfiguration modeChipsConfiguration3 = new ModeChipsConfiguration("SINGLE", 2);
            f = modeChipsConfiguration3;
            ModeChipsConfiguration[] modeChipsConfigurationArr = {modeChipsConfiguration, modeChipsConfiguration2, modeChipsConfiguration3};
            g = modeChipsConfigurationArr;
            h = EnumEntriesKt.a(modeChipsConfigurationArr);
        }

        public static ModeChipsConfiguration valueOf(String str) {
            return (ModeChipsConfiguration) Enum.valueOf(ModeChipsConfiguration.class, str);
        }

        public static ModeChipsConfiguration[] values() {
            return (ModeChipsConfiguration[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$ModeSelectorInfo;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ModeSelectorInfo {

        /* renamed from: a, reason: collision with root package name */
        public final CollectionModeLabel f4362a;
        public final PlainText b;
        public final ModeChipsConfiguration c;

        public ModeSelectorInfo(CollectionModeLabel collectionModeLabel, PlainText plainText, ModeChipsConfiguration modeChipsConfiguration) {
            Intrinsics.h(collectionModeLabel, "collectionModeLabel");
            Intrinsics.h(modeChipsConfiguration, "modeChipsConfiguration");
            this.f4362a = collectionModeLabel;
            this.b = plainText;
            this.c = modeChipsConfiguration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ModeSelectorInfo)) {
                return false;
            }
            ModeSelectorInfo modeSelectorInfo = (ModeSelectorInfo) obj;
            return Intrinsics.c(this.f4362a, modeSelectorInfo.f4362a) && this.b.equals(modeSelectorInfo.b) && this.c == modeSelectorInfo.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f4362a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "ModeSelectorInfo(collectionModeLabel=" + this.f4362a + ", collectionModeLocation=" + this.b + ", modeChipsConfiguration=" + this.c + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$SearchConfiguration;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SearchConfiguration {
        public static final SearchConfiguration d;
        public static final SearchConfiguration e;
        public static final /* synthetic */ SearchConfiguration[] f;
        public static final /* synthetic */ EnumEntries g;

        static {
            SearchConfiguration searchConfiguration = new SearchConfiguration("EXPOSED", 0);
            d = searchConfiguration;
            SearchConfiguration searchConfiguration2 = new SearchConfiguration("MENU", 1);
            e = searchConfiguration2;
            SearchConfiguration[] searchConfigurationArr = {searchConfiguration, searchConfiguration2};
            f = searchConfigurationArr;
            g = EnumEntriesKt.a(searchConfigurationArr);
        }

        public static SearchConfiguration valueOf(String str) {
            return (SearchConfiguration) Enum.valueOf(SearchConfiguration.class, str);
        }

        public static SearchConfiguration[] values() {
            return (SearchConfiguration[]) f.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$SpeechBubbleInfo;", "", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SpeechBubbleInfo {
        public static final SpeechBubbleInfo c = new SpeechBubbleInfo(false, false);

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4363a;
        public final boolean b;

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$SpeechBubbleInfo$Companion;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
        }

        public SpeechBubbleInfo(boolean z, boolean z2) {
            this.f4363a = z;
            this.b = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SpeechBubbleInfo)) {
                return false;
            }
            SpeechBubbleInfo speechBubbleInfo = (SpeechBubbleInfo) obj;
            return this.f4363a == speechBubbleInfo.f4363a && this.b == speechBubbleInfo.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (Boolean.hashCode(this.f4363a) * 31);
        }

        public final String toString() {
            return "SpeechBubbleInfo(show=" + this.f4363a + ", hasUnreadMessages=" + this.b + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$ToolbarConfiguration;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ToolbarConfiguration {
        public static final ToolbarConfiguration d;
        public static final ToolbarConfiguration e;
        public static final ToolbarConfiguration f;
        public static final /* synthetic */ ToolbarConfiguration[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            ToolbarConfiguration toolbarConfiguration = new ToolbarConfiguration("TITLE", 0);
            d = toolbarConfiguration;
            ToolbarConfiguration toolbarConfiguration2 = new ToolbarConfiguration("LOGO", 1);
            e = toolbarConfiguration2;
            ToolbarConfiguration toolbarConfiguration3 = new ToolbarConfiguration("NONE", 2);
            f = toolbarConfiguration3;
            ToolbarConfiguration[] toolbarConfigurationArr = {toolbarConfiguration, toolbarConfiguration2, toolbarConfiguration3};
            g = toolbarConfigurationArr;
            h = EnumEntriesKt.a(toolbarConfigurationArr);
        }

        public static ToolbarConfiguration valueOf(String str) {
            return (ToolbarConfiguration) Enum.valueOf(ToolbarConfiguration.class, str);
        }

        public static ToolbarConfiguration[] values() {
            return (ToolbarConfiguration[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$ViewState;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f4364a;
        public final CoachMark b;
        public final boolean c;
        public final Screen d;
        public final HeaderInfo e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final UpgradeConfig i;

        public ViewState(boolean z, CoachMark coachMark, boolean z2, Screen visibleScreen, HeaderInfo headerInfo, boolean z3, boolean z4, boolean z5, UpgradeConfig upgradeConfig) {
            Intrinsics.h(visibleScreen, "visibleScreen");
            this.f4364a = z;
            this.b = coachMark;
            this.c = z2;
            this.d = visibleScreen;
            this.e = headerInfo;
            this.f = z3;
            this.g = z4;
            this.h = z5;
            this.i = upgradeConfig;
        }

        public static ViewState a(ViewState viewState, CoachMark coachMark, boolean z, UpgradeConfig upgradeConfig, int i) {
            boolean z2 = viewState.f4364a;
            if ((i & 2) != 0) {
                coachMark = viewState.b;
            }
            CoachMark coachMark2 = coachMark;
            boolean z3 = viewState.c;
            Screen visibleScreen = viewState.d;
            HeaderInfo headerInfo = viewState.e;
            if ((i & 32) != 0) {
                z = viewState.f;
            }
            boolean z4 = z;
            boolean z5 = viewState.g;
            boolean z6 = viewState.h;
            if ((i & 256) != 0) {
                upgradeConfig = viewState.i;
            }
            Intrinsics.h(visibleScreen, "visibleScreen");
            return new ViewState(z2, coachMark2, z3, visibleScreen, headerInfo, z4, z5, z6, upgradeConfig);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f4364a == viewState.f4364a && Intrinsics.c(this.b, viewState.b) && this.c == viewState.c && Intrinsics.c(this.d, viewState.d) && this.e.equals(viewState.e) && this.f == viewState.f && this.g == viewState.g && this.h == viewState.h && Intrinsics.c(this.i, viewState.i);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f4364a) * 31;
            CoachMark coachMark = this.b;
            int iE = androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((this.e.hashCode() + ((this.d.hashCode() + androidx.camera.core.impl.b.e((iHashCode + (coachMark == null ? 0 : coachMark.hashCode())) * 31, 31, this.c)) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
            UpgradeConfig upgradeConfig = this.i;
            return iE + (upgradeConfig != null ? upgradeConfig.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=");
            sb.append(this.f4364a);
            sb.append(", hintCoachMark=");
            sb.append(this.b);
            sb.append(", newBadgeVisible=");
            sb.append(this.c);
            sb.append(", visibleScreen=");
            sb.append(this.d);
            sb.append(", headerInfo=");
            sb.append(this.e);
            sb.append(", hasMoreCoachmarks=");
            sb.append(this.f);
            sb.append(", displayVoiceProductSearchIcon=");
            au.com.woolworths.android.onesite.a.D(sb, this.g, ", displayBarcodeSearchIcon=", this.h, ", upgradeConfig=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/main/MainContract$HeaderInfo;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Text f4361a;
        public final int b;
        public final ModeSelectorInfo c;
        public final SearchConfiguration d;
        public final SpeechBubbleInfo e;
        public final boolean f;
        public final FulfilmentWindowInfo g;
        public final HomePageContract.DeliveryNowViewState h;
        public final DeliveryNow i;

        public HeaderInfo(Text text, int i, ModeSelectorInfo modeSelectorInfo, SearchConfiguration searchConfiguration, SpeechBubbleInfo speechBubbleInfo, boolean z, FulfilmentWindowInfo fulfilmentWindowInfo, HomePageContract.DeliveryNowViewState deliveryNowViewState, DeliveryNow deliveryNow) {
            Intrinsics.h(searchConfiguration, "searchConfiguration");
            this.f4361a = text;
            this.b = i;
            this.c = modeSelectorInfo;
            this.d = searchConfiguration;
            this.e = speechBubbleInfo;
            this.f = z;
            this.g = fulfilmentWindowInfo;
            this.h = deliveryNowViewState;
            this.i = deliveryNow;
        }

        public static HeaderInfo a(HeaderInfo headerInfo, ModeSelectorInfo modeSelectorInfo, SpeechBubbleInfo speechBubbleInfo, FulfilmentWindowInfo fulfilmentWindowInfo, HomePageContract.DeliveryNowViewState deliveryNowViewState, DeliveryNow deliveryNow, int i) {
            Text toolbarTitle = headerInfo.f4361a;
            int i2 = headerInfo.b;
            if ((i & 4) != 0) {
                modeSelectorInfo = headerInfo.c;
            }
            ModeSelectorInfo modeSelectorInfo2 = modeSelectorInfo;
            SearchConfiguration searchConfiguration = headerInfo.d;
            if ((i & 16) != 0) {
                speechBubbleInfo = headerInfo.e;
            }
            SpeechBubbleInfo speechBubbleInfo2 = speechBubbleInfo;
            boolean z = headerInfo.f;
            if ((i & 64) != 0) {
                fulfilmentWindowInfo = headerInfo.g;
            }
            FulfilmentWindowInfo fulfilmentWindowInfo2 = fulfilmentWindowInfo;
            if ((i & 128) != 0) {
                deliveryNowViewState = headerInfo.h;
            }
            HomePageContract.DeliveryNowViewState deliveryNowViewState2 = deliveryNowViewState;
            if ((i & 256) != 0) {
                deliveryNow = headerInfo.i;
            }
            Intrinsics.h(toolbarTitle, "toolbarTitle");
            Intrinsics.h(modeSelectorInfo2, "modeSelectorInfo");
            Intrinsics.h(searchConfiguration, "searchConfiguration");
            Intrinsics.h(speechBubbleInfo2, "speechBubbleInfo");
            return new HeaderInfo(toolbarTitle, i2, modeSelectorInfo2, searchConfiguration, speechBubbleInfo2, z, fulfilmentWindowInfo2, deliveryNowViewState2, deliveryNow);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderInfo)) {
                return false;
            }
            HeaderInfo headerInfo = (HeaderInfo) obj;
            return Intrinsics.c(this.f4361a, headerInfo.f4361a) && this.b == headerInfo.b && Intrinsics.c(this.c, headerInfo.c) && this.d == headerInfo.d && Intrinsics.c(this.e, headerInfo.e) && this.f == headerInfo.f && Intrinsics.c(this.g, headerInfo.g) && this.h == headerInfo.h && Intrinsics.c(this.i, headerInfo.i);
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + androidx.camera.core.impl.b.a(this.b, this.f4361a.hashCode() * 31, 31)) * 31)) * 31)) * 31, 31, this.f);
            FulfilmentWindowInfo fulfilmentWindowInfo = this.g;
            int iHashCode = (iE + (fulfilmentWindowInfo == null ? 0 : fulfilmentWindowInfo.hashCode())) * 31;
            HomePageContract.DeliveryNowViewState deliveryNowViewState = this.h;
            int iHashCode2 = (iHashCode + (deliveryNowViewState == null ? 0 : deliveryNowViewState.hashCode())) * 31;
            DeliveryNow deliveryNow = this.i;
            return iHashCode2 + (deliveryNow != null ? deliveryNow.hashCode() : 0);
        }

        public final String toString() {
            return "HeaderInfo(toolbarTitle=" + this.f4361a + ", toolbarLogoResId=" + this.b + ", modeSelectorInfo=" + this.c + ", searchConfiguration=" + this.d + ", speechBubbleInfo=" + this.e + ", expandHeader=" + this.f + ", fulfilmentWindowInfo=" + this.g + ", deliveryNowViewState=" + this.h + ", deliveryNow=" + this.i + ")";
        }

        public /* synthetic */ HeaderInfo(Text text, int i, ModeSelectorInfo modeSelectorInfo, SearchConfiguration searchConfiguration, SpeechBubbleInfo speechBubbleInfo, FulfilmentWindowInfo fulfilmentWindowInfo, HomePageContract.DeliveryNowViewState deliveryNowViewState, DeliveryNow deliveryNow) {
            this(text, i, modeSelectorInfo, searchConfiguration, speechBubbleInfo, searchConfiguration == SearchConfiguration.d, fulfilmentWindowInfo, deliveryNowViewState, deliveryNow);
        }
    }
}
