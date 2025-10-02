package au.com.woolworths.feature.rewards.account.settings.v2;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.rewards.account.data.AccountSettingsAppVersionData;
import au.com.woolworths.feature.rewards.account.settings.v2.model.RewardsAccountMenu;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract;", "", "Action", "ViewState", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface AccountSettingsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "", "OpenInAppBrowser", "OpenUrl", "OpenMagicLink", "OpenMagicLinkInChromeTab", "OpenAndroidReviewLink", "OpenCallbackUrl", "GoToWelcomeScreen", "ShowDeleteAccountScreen", "ShowDeveloperOptions", "ShowErrorMessage", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$GoToWelcomeScreen;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenAndroidReviewLink;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenCallbackUrl;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenInAppBrowser;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenMagicLink;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenMagicLinkInChromeTab;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$ShowDeleteAccountScreen;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$ShowDeveloperOptions;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$ShowErrorMessage;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$GoToWelcomeScreen;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GoToWelcomeScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f5775a;

            public GoToWelcomeScreen(boolean z) {
                this.f5775a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof GoToWelcomeScreen) && this.f5775a == ((GoToWelcomeScreen) obj).f5775a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f5775a);
            }

            public final String toString() {
                return androidx.compose.ui.input.pointer.a.n("GoToWelcomeScreen(showCountrySelectorAfterLogout=", ")", this.f5775a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenAndroidReviewLink;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenAndroidReviewLink extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5776a;

            public OpenAndroidReviewLink(String url) {
                Intrinsics.h(url, "url");
                this.f5776a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenAndroidReviewLink) && Intrinsics.c(this.f5776a, ((OpenAndroidReviewLink) obj).f5776a);
            }

            public final int hashCode() {
                return this.f5776a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenAndroidReviewLink(url=", this.f5776a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenCallbackUrl;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenCallbackUrl extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final Activities.RewardsCallbackUrlActivity.Extras f5777a;

            public OpenCallbackUrl(Activities.RewardsCallbackUrlActivity.Extras extras) {
                this.f5777a = extras;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenCallbackUrl) && Intrinsics.c(this.f5777a, ((OpenCallbackUrl) obj).f5777a);
            }

            public final int hashCode() {
                return this.f5777a.hashCode();
            }

            public final String toString() {
                return "OpenCallbackUrl(extras=" + this.f5777a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenInAppBrowser;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenInAppBrowser extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5778a;

            public OpenInAppBrowser(String url) {
                Intrinsics.h(url, "url");
                this.f5778a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenInAppBrowser) && Intrinsics.c(this.f5778a, ((OpenInAppBrowser) obj).f5778a);
            }

            public final int hashCode() {
                return this.f5778a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenInAppBrowser(url=", this.f5778a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenMagicLink;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenMagicLink extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5779a;
            public final String b;

            public OpenMagicLink(String page, String title) {
                Intrinsics.h(page, "page");
                Intrinsics.h(title, "title");
                this.f5779a = page;
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
                return Intrinsics.c(this.f5779a, openMagicLink.f5779a) && Intrinsics.c(this.b, openMagicLink.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5779a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenMagicLink(page=", this.f5779a, ", title=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenMagicLinkInChromeTab;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenMagicLinkInChromeTab extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5780a;
            public final String b;

            public OpenMagicLinkInChromeTab(String page, String title) {
                Intrinsics.h(page, "page");
                Intrinsics.h(title, "title");
                this.f5780a = page;
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
                return Intrinsics.c(this.f5780a, openMagicLinkInChromeTab.f5780a) && Intrinsics.c(this.b, openMagicLinkInChromeTab.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f5780a.hashCode() * 31);
            }

            public final String toString() {
                return YU.a.j("OpenMagicLinkInChromeTab(page=", this.f5780a, ", title=", this.b, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5781a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f5781a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f5781a, ((OpenUrl) obj).f5781a);
            }

            public final int hashCode() {
                return this.f5781a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f5781a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$ShowDeleteAccountScreen;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowDeleteAccountScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowDeleteAccountScreen f5782a = new ShowDeleteAccountScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowDeleteAccountScreen);
            }

            public final int hashCode() {
                return -62974468;
            }

            public final String toString() {
                return "ShowDeleteAccountScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$ShowDeveloperOptions;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowDeveloperOptions extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowDeveloperOptions f5783a = new ShowDeveloperOptions();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowDeveloperOptions);
            }

            public final int hashCode() {
                return -493545146;
            }

            public final String toString() {
                return "ShowDeveloperOptions";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action$ShowErrorMessage;", "Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$Action;", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowErrorMessage extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final ResText f5784a;

            public ShowErrorMessage(ResText resText) {
                this.f5784a = resText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowErrorMessage) && this.f5784a.equals(((ShowErrorMessage) obj).f5784a);
            }

            public final int hashCode() {
                return this.f5784a.hashCode();
            }

            public final String toString() {
                return "ShowErrorMessage(message=" + this.f5784a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/account/settings/v2/AccountSettingsContract$ViewState;", "", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f5785a;
        public final boolean b;
        public final RewardsAccountMenu c;
        public final AccountSettingsAppVersionData d;
        public final FullPageMessage.Error e;
        public final boolean f;
        public final boolean g;
        public final boolean h;

        public ViewState(boolean z, boolean z2, RewardsAccountMenu rewardsAccountMenu, AccountSettingsAppVersionData accountSettingsAppVersionData, FullPageMessage.Error error, boolean z3, boolean z4, boolean z5) {
            this.f5785a = z;
            this.b = z2;
            this.c = rewardsAccountMenu;
            this.d = accountSettingsAppVersionData;
            this.e = error;
            this.f = z3;
            this.g = z4;
            this.h = z5;
        }

        public static ViewState a(ViewState viewState, boolean z, boolean z2, RewardsAccountMenu rewardsAccountMenu, FullPageMessage.Error error, boolean z3, boolean z4, boolean z5, int i) {
            if ((i & 1) != 0) {
                z = viewState.f5785a;
            }
            boolean z6 = z;
            if ((i & 2) != 0) {
                z2 = viewState.b;
            }
            boolean z7 = z2;
            if ((i & 4) != 0) {
                rewardsAccountMenu = viewState.c;
            }
            RewardsAccountMenu accountMenu = rewardsAccountMenu;
            AccountSettingsAppVersionData accountSettingsAppVersionData = viewState.d;
            if ((i & 16) != 0) {
                error = viewState.e;
            }
            FullPageMessage.Error error2 = error;
            if ((i & 32) != 0) {
                z3 = viewState.f;
            }
            boolean z8 = z3;
            if ((i & 64) != 0) {
                z4 = viewState.g;
            }
            boolean z9 = z4;
            boolean z10 = (i & 128) != 0 ? viewState.h : z5;
            viewState.getClass();
            Intrinsics.h(accountMenu, "accountMenu");
            return new ViewState(z6, z7, accountMenu, accountSettingsAppVersionData, error2, z8, z9, z10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f5785a == viewState.f5785a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && this.f == viewState.f && this.g == viewState.g && this.h == viewState.h;
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + b.e(Boolean.hashCode(this.f5785a) * 31, 31, this.b)) * 31)) * 31;
            FullPageMessage.Error error = this.e;
            return Boolean.hashCode(this.h) + b.e(b.e((iHashCode + (error == null ? 0 : error.hashCode())) * 31, 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbV = b.v("ViewState(isPlaceholderLoadingShown=", ", isRefreshing=", ", accountMenu=", this.f5785a, this.b);
            sbV.append(this.c);
            sbV.append(", appVersion=");
            sbV.append(this.d);
            sbV.append(", error=");
            sbV.append(this.e);
            sbV.append(", isChangeCountryConfirmationDialogShown=");
            sbV.append(this.f);
            sbV.append(", isLogoutConfirmationDialogShown=");
            return au.com.woolworths.android.onesite.a.q(sbV, this.g, ", isLoggingOut=", this.h, ")");
        }
    }
}
