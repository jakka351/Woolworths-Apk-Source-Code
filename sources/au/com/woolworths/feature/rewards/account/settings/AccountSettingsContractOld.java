package au.com.woolworths.feature.rewards.account.settings;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.rewards.account.data.AccountHomeFooter;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld;", "", "Actions", "ViewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AccountSettingsContractOld {

    @StabilityInferred
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "", "ShowPointsBalanceTooltip", "OpenInAppBrowser", "OpenUrl", "OpenMagicLink", "OpenMagicLinkInChromeTab", "OpenAndroidReviewLink", "OpenCallbackUrl", "ShowChangeCountryConfirmation", "ShowLogoutConfirmation", "ShowLogoutConnectionError", "CompleteLogout", "ShowDeveloperOptions", "ShowGenericError", "LaunchAppUpdate", "LaunchOsUpdate", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$CompleteLogout;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$LaunchAppUpdate;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$LaunchOsUpdate;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenAndroidReviewLink;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenCallbackUrl;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenInAppBrowser;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenMagicLink;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenMagicLinkInChromeTab;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowChangeCountryConfirmation;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowDeveloperOptions;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowGenericError;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowLogoutConfirmation;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowLogoutConnectionError;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowPointsBalanceTooltip;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$CompleteLogout;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CompleteLogout extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f5754a;

            public CompleteLogout(boolean z) {
                this.f5754a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CompleteLogout) && this.f5754a == ((CompleteLogout) obj).f5754a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f5754a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("CompleteLogout(showCountrySelectorAfterLogout=", ")", this.f5754a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$LaunchAppUpdate;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchAppUpdate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchAppUpdate f5755a = new LaunchAppUpdate();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchAppUpdate);
            }

            public final int hashCode() {
                return 1694874456;
            }

            public final String toString() {
                return "LaunchAppUpdate";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$LaunchOsUpdate;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOsUpdate extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchOsUpdate f5756a = new LaunchOsUpdate();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchOsUpdate);
            }

            public final int hashCode() {
                return -787159809;
            }

            public final String toString() {
                return "LaunchOsUpdate";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenAndroidReviewLink;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAndroidReviewLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5757a;

            public OpenAndroidReviewLink(String url) {
                Intrinsics.h(url, "url");
                this.f5757a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAndroidReviewLink) && Intrinsics.c(this.f5757a, ((OpenAndroidReviewLink) obj).f5757a);
            }

            public final int hashCode() {
                return this.f5757a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenAndroidReviewLink(url=", this.f5757a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenCallbackUrl;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenCallbackUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.RewardsCallbackUrlActivity.Extras f5758a;

            public OpenCallbackUrl(Activities.RewardsCallbackUrlActivity.Extras extras) {
                this.f5758a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenCallbackUrl) && Intrinsics.c(this.f5758a, ((OpenCallbackUrl) obj).f5758a);
            }

            public final int hashCode() {
                return this.f5758a.hashCode();
            }

            public final String toString() {
                return "OpenCallbackUrl(extras=" + this.f5758a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenInAppBrowser;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenInAppBrowser extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5759a;

            public OpenInAppBrowser(String url) {
                Intrinsics.h(url, "url");
                this.f5759a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenInAppBrowser) && Intrinsics.c(this.f5759a, ((OpenInAppBrowser) obj).f5759a);
            }

            public final int hashCode() {
                return this.f5759a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenInAppBrowser(url=", this.f5759a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenMagicLink;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenMagicLink extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5760a;
            public final String b;

            public OpenMagicLink(String page, String title) {
                Intrinsics.h(page, "page");
                Intrinsics.h(title, "title");
                this.f5760a = page;
                this.b = title;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenMagicLink)) {
                    return false;
                }
                OpenMagicLink openMagicLink = (OpenMagicLink) obj;
                return Intrinsics.c(this.f5760a, openMagicLink.f5760a) && Intrinsics.c(this.b, openMagicLink.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5760a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenMagicLink(page=", this.f5760a, ", title=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenMagicLinkInChromeTab;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenMagicLinkInChromeTab extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5761a;
            public final String b;

            public OpenMagicLinkInChromeTab(String page, String title) {
                Intrinsics.h(page, "page");
                Intrinsics.h(title, "title");
                this.f5761a = page;
                this.b = title;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenMagicLinkInChromeTab)) {
                    return false;
                }
                OpenMagicLinkInChromeTab openMagicLinkInChromeTab = (OpenMagicLinkInChromeTab) obj;
                return Intrinsics.c(this.f5761a, openMagicLinkInChromeTab.f5761a) && Intrinsics.c(this.b, openMagicLinkInChromeTab.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5761a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenMagicLinkInChromeTab(page=", this.f5761a, ", title=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f5762a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f5762a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f5762a, ((OpenUrl) obj).f5762a);
            }

            public final int hashCode() {
                return this.f5762a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f5762a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowChangeCountryConfirmation;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowChangeCountryConfirmation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowChangeCountryConfirmation f5763a = new ShowChangeCountryConfirmation();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowDeveloperOptions;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowDeveloperOptions extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowDeveloperOptions f5764a = new ShowDeveloperOptions();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowGenericError;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowGenericError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowGenericError f5765a = new ShowGenericError();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowLogoutConfirmation;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowLogoutConfirmation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowLogoutConfirmation f5766a = new ShowLogoutConfirmation();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowLogoutConnectionError;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowLogoutConnectionError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowLogoutConnectionError f5767a = new ShowLogoutConnectionError();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions$ShowPointsBalanceTooltip;", "Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$Actions;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowPointsBalanceTooltip extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowPointsBalanceTooltip);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "ShowPointsBalanceTooltip(text=null)";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/AccountSettingsContractOld$ViewState;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsPointsBalance f5768a;
        public final List b;
        public final List c;
        public final AccountSettingsAppVersionData d;
        public final AccountHomeFooter e;
        public final boolean f;
        public final boolean g;

        public ViewState(RewardsPointsBalance rewardsPointsBalance, List items, List defaultItems, AccountSettingsAppVersionData accountSettingsAppVersionData, AccountHomeFooter accountHomeFooter, boolean z, boolean z2) {
            Intrinsics.h(items, "items");
            Intrinsics.h(defaultItems, "defaultItems");
            this.f5768a = rewardsPointsBalance;
            this.b = items;
            this.c = defaultItems;
            this.d = accountSettingsAppVersionData;
            this.e = accountHomeFooter;
            this.f = z;
            this.g = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f5768a, viewState.f5768a) && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f && this.g == viewState.g;
        }

        public final int hashCode() {
            RewardsPointsBalance rewardsPointsBalance = this.f5768a;
            int iHashCode = (this.d.hashCode() + androidx.camera.core.impl.b.d(androidx.camera.core.impl.b.d((rewardsPointsBalance == null ? 0 : rewardsPointsBalance.hashCode()) * 31, 31, this.b), 31, this.c)) * 31;
            AccountHomeFooter accountHomeFooter = this.e;
            return Boolean.hashCode(this.g) + androidx.camera.core.impl.b.e((iHashCode + (accountHomeFooter != null ? accountHomeFooter.hashCode() : 0)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(rewardsPointsBalance=");
            sb.append(this.f5768a);
            sb.append(", items=");
            sb.append(this.b);
            sb.append(", defaultItems=");
            sb.append(this.c);
            sb.append(", appVersionItem=");
            sb.append(this.d);
            sb.append(", footer=");
            sb.append(this.e);
            sb.append(", isRefreshing=");
            sb.append(this.f);
            sb.append(", isRefreshEnabled=");
            return YU.a.k(")", sb, this.g);
        }
    }
}
