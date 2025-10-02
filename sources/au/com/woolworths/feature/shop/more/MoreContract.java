package au.com.woolworths.feature.shop.more;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.more.data.MoreData;
import au.com.woolworths.feature.shop.more.data.MoreTileType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract;", "", "ViewState", "Actions", "RewardsCardListener", "MoreTileList", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MoreContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u001c\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0082\u0001\u001c\u001e\u001f !\"#$%&'()*+,-./0123456789¨\u0006:"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "", "LaunchLogin", "LaunchSignUp", "LaunchStoreLocator", "LaunchShowBarcode", "LaunchRewards", "LaunchMyOrders", "LaunchEReceipts", "ShowLogoutConfirmation", "LaunchHomepage", "LaunchChangeCountry", "LaunchDevelopersOption", "UnlinkRewardsConfirmation", "LaunchSngWithNewOnboarding", "LaunchDeliveryUnlimitedSignUp", "LaunchInstoreWifi", "LaunchNotifications", "LaunchChatToUs", "LaunchDeepLink", "LaunchWebView", "LaunchBrowser", "LinkRewards", "RewardsUnlinkMessage", "OpenLink", "ShowSnackbarMessage", "LaunchDeleteAccount", "LaunchMyAccount", "LaunchAppUpdate", "LaunchOsUpdate", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchAppUpdate;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchBrowser;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchChangeCountry;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchChatToUs;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDeleteAccount;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDeliveryUnlimitedSignUp;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDevelopersOption;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchEReceipts;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchHomepage;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchInstoreWifi;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchMyAccount;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchMyOrders;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchNotifications;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchOsUpdate;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchRewards;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchShowBarcode;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchSignUp;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchSngWithNewOnboarding;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchStoreLocator;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchWebView;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LinkRewards;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$OpenLink;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$RewardsUnlinkMessage;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$ShowLogoutConfirmation;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions$UnlinkRewardsConfirmation;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchAppUpdate;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAppUpdate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchAppUpdate f7554a = new LaunchAppUpdate();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchAppUpdate);
            }

            public final int hashCode() {
                return -312264763;
            }

            public final String toString() {
                return "LaunchAppUpdate";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchBrowser;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchBrowser extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7555a;
            public final String b;

            public LaunchBrowser(String url, String str) {
                Intrinsics.h(url, "url");
                this.f7555a = url;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchBrowser)) {
                    return false;
                }
                LaunchBrowser launchBrowser = (LaunchBrowser) obj;
                return Intrinsics.c(this.f7555a, launchBrowser.f7555a) && Intrinsics.c(this.b, launchBrowser.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f7555a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("LaunchBrowser(url=", this.f7555a, ", screenName=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchChangeCountry;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchChangeCountry extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchChangeCountry f7556a = new LaunchChangeCountry();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchChatToUs;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchChatToUs extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7557a;
            public final String b;

            public LaunchChatToUs(String title, String str) {
                Intrinsics.h(title, "title");
                this.f7557a = title;
                this.b = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchChatToUs)) {
                    return false;
                }
                LaunchChatToUs launchChatToUs = (LaunchChatToUs) obj;
                return Intrinsics.c(this.f7557a, launchChatToUs.f7557a) && Intrinsics.c(this.b, launchChatToUs.b);
            }

            public final int hashCode() {
                int iHashCode = this.f7557a.hashCode() * 31;
                String str = this.b;
                return iHashCode + (str == null ? 0 : str.hashCode());
            }

            public final String toString() {
                return YU.a.j("LaunchChatToUs(title=", this.f7557a, ", url=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7558a;

            public LaunchDeepLink(String str) {
                this.f7558a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f7558a, ((LaunchDeepLink) obj).f7558a);
            }

            public final int hashCode() {
                return this.f7558a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(url=", this.f7558a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDeleteAccount;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeleteAccount extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchDeleteAccount f7559a = new LaunchDeleteAccount();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchDeleteAccount);
            }

            public final int hashCode() {
                return -51104259;
            }

            public final String toString() {
                return "LaunchDeleteAccount";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDeliveryUnlimitedSignUp;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchDeliveryUnlimitedSignUp extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchDeliveryUnlimitedSignUp f7560a = new LaunchDeliveryUnlimitedSignUp();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchDevelopersOption;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchDevelopersOption extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchDevelopersOption f7561a = new LaunchDevelopersOption();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchEReceipts;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchEReceipts extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchEReceipts f7562a = new LaunchEReceipts();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchHomepage;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchHomepage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchHomepage f7563a = new LaunchHomepage();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchInstoreWifi;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchInstoreWifi extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchInstoreWifi f7564a = new LaunchInstoreWifi();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchLogin;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchLogin extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f7565a = new LaunchLogin();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchMyAccount;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchMyAccount extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchMyAccount f7566a = new LaunchMyAccount();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchMyAccount);
            }

            public final int hashCode() {
                return -395308964;
            }

            public final String toString() {
                return "LaunchMyAccount";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchMyOrders;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchMyOrders extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchMyOrders f7567a = new LaunchMyOrders();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchNotifications;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchNotifications extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchNotifications f7568a = new LaunchNotifications();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchOsUpdate;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOsUpdate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchOsUpdate f7569a = new LaunchOsUpdate();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchOsUpdate);
            }

            public final int hashCode() {
                return 672114418;
            }

            public final String toString() {
                return "LaunchOsUpdate";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchRewards;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchRewards extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchRewards f7570a = new LaunchRewards();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchShowBarcode;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchShowBarcode extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchShowBarcode f7571a = new LaunchShowBarcode();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchSignUp;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSignUp extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSignUp f7572a = new LaunchSignUp();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchSngWithNewOnboarding;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchSngWithNewOnboarding extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSngWithNewOnboarding f7573a = new LaunchSngWithNewOnboarding();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchStoreLocator;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchStoreLocator extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchStoreLocator f7574a = new LaunchStoreLocator();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LaunchWebView;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchWebView extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7575a;
            public final int b;
            public final String c;

            public LaunchWebView(String url, int i, String str) {
                Intrinsics.h(url, "url");
                this.f7575a = url;
                this.b = i;
                this.c = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchWebView)) {
                    return false;
                }
                LaunchWebView launchWebView = (LaunchWebView) obj;
                return Intrinsics.c(this.f7575a, launchWebView.f7575a) && this.b == launchWebView.b && this.c.equals(launchWebView.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + androidx.camera.core.impl.b.a(this.b, this.f7575a.hashCode() * 31, 31);
            }

            public final String toString() {
                return YU.a.o(androidx.camera.core.impl.b.u("LaunchWebView(url=", this.b, this.f7575a, ", screenName=", ", analyticsScreenName="), this.c, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$LinkRewards;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LinkRewards extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint f7576a;

            public LinkRewards(Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint) {
                this.f7576a = rewardsSetupEntryPoint;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LinkRewards) && this.f7576a == ((LinkRewards) obj).f7576a;
            }

            public final int hashCode() {
                return this.f7576a.hashCode();
            }

            public final String toString() {
                return "LinkRewards(source=" + this.f7576a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$OpenLink;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f7577a;
            public final ArrayList b;

            public OpenLink(String link, ArrayList arrayList) {
                Intrinsics.h(link, "link");
                this.f7577a = link;
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenLink)) {
                    return false;
                }
                OpenLink openLink = (OpenLink) obj;
                return Intrinsics.c(this.f7577a, openLink.f7577a) && Intrinsics.c(this.b, openLink.b);
            }

            public final int hashCode() {
                int iHashCode = this.f7577a.hashCode() * 31;
                ArrayList arrayList = this.b;
                return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
            }

            public final String toString() {
                return au.com.woolworths.dynamic.page.ui.content.d.q("OpenLink(link=", this.f7577a, ", magicLinkExtraCookies=", ")", this.b);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$RewardsUnlinkMessage;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class RewardsUnlinkMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f7578a;

            public RewardsUnlinkMessage(int i) {
                this.f7578a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof RewardsUnlinkMessage) && this.f7578a == ((RewardsUnlinkMessage) obj).f7578a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f7578a);
            }

            public final String toString() {
                return YU.a.e(this.f7578a, "RewardsUnlinkMessage(message=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$ShowLogoutConfirmation;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowLogoutConfirmation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowLogoutConfirmation f7579a = new ShowLogoutConfirmation();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$ShowSnackbarMessage;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSnackbarMessage extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowSnackbarMessage);
            }

            public final int hashCode() {
                return Integer.hashCode(com.woolworths.R.string.more_deliviery_unlimited_unavailable);
            }

            public final String toString() {
                return "ShowSnackbarMessage(message=2132018258)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$Actions$UnlinkRewardsConfirmation;", "Lau/com/woolworths/feature/shop/more/MoreContract$Actions;", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class UnlinkRewardsConfirmation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final UnlinkRewardsConfirmation f7580a = new UnlinkRewardsConfirmation();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$MoreTileList;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MoreTileList {
        public static final /* synthetic */ MoreTileList[] g;
        public static final /* synthetic */ EnumEntries h;
        public final ResText d;
        public final MoreTileType e;
        public final Integer f;

        static {
            MoreTileList moreTileList = new MoreTileList("ORDERS", 0, new ResText(com.woolworths.R.string.orders_page_title), MoreTileType.i, null);
            ResText resText = new ResText(com.woolworths.R.string.more_faqs);
            MoreTileType moreTileType = MoreTileType.l;
            Integer numValueOf = Integer.valueOf(com.woolworths.R.drawable.ic_top_right_arrow);
            MoreTileList[] moreTileListArr = {moreTileList, new MoreTileList("FAQ", 1, resText, moreTileType, numValueOf), new MoreTileList("REWARDS", 2, new ResText(com.woolworths.R.string.more_rewards), MoreTileType.f, null), new MoreTileList("FIND_STORES", 3, new ResText(com.woolworths.R.string.more_stores), MoreTileType.e, null), new MoreTileList("LIQUOR_PURCHASE_NOTICES", 4, new ResText(com.woolworths.R.string.more_liquor_purchase_notices), MoreTileType.j, null), new MoreTileList("PRODUCT_RECALL", 5, new ResText(com.woolworths.R.string.more_product_recalls), MoreTileType.k, numValueOf), new MoreTileList("FOOD_SAFETY", 6, new ResText(com.woolworths.R.string.more_food_safety), MoreTileType.m, numValueOf), new MoreTileList("TERMS_OF_USE", 7, new ResText(com.woolworths.R.string.terms_of_use_title), MoreTileType.n, numValueOf), new MoreTileList("PRIVACY_POLICY", 8, new ResText(com.woolworths.R.string.more_privacy_policy), MoreTileType.o, numValueOf), new MoreTileList("FEEDBACK", 9, new ResText(com.woolworths.R.string.more_feedback), MoreTileType.p, numValueOf)};
            g = moreTileListArr;
            h = EnumEntriesKt.a(moreTileListArr);
        }

        public MoreTileList(String str, int i, ResText resText, MoreTileType moreTileType, Integer num) {
            this.d = resText;
            this.e = moreTileType;
            this.f = num;
        }

        public static MoreTileList valueOf(String str) {
            return (MoreTileList) Enum.valueOf(MoreTileList.class, str);
        }

        public static MoreTileList[] values() {
            return (MoreTileList[]) g.clone();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$RewardsCardListener;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface RewardsCardListener {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/more/MoreContract$ViewState;", "", "more_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7581a;
        public final MoreData b;

        public ViewState(boolean z, MoreData moreData) {
            this.f7581a = z;
            this.b = moreData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f7581a == viewState.f7581a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f7581a) * 31);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f7581a + ", data=" + this.b + ")";
        }
    }
}
