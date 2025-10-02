package au.com.woolworths.feature.rewards.redemptionsettings;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.f;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingsItem;
import au.com.woolworths.feature.rewards.redemptionsettings.analytics.RewardsRedemptionSettingsActionData;
import au.com.woolworths.feature.rewards.redemptionsettings.data.RewardsRedemptionActionsList;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract;", "", "ViewState", "Actions", "AnalyticsImpressionType", "SoftErrorType", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsRedemptionSettingsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;", "", "LaunchRedemptionSettings", "OpenUrl", "NavigateToWebSettings", "LaunchStepUpAuthentication", "ShowChangeConfirmationMessages", "ShowSoftErrorMessage", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$LaunchRedemptionSettings;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$LaunchStepUpAuthentication;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$NavigateToWebSettings;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$ShowChangeConfirmationMessages;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$ShowSoftErrorMessage;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$LaunchRedemptionSettings;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchRedemptionSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final RewardsRedemptionSettingsItem f6426a;
            public final String b;

            public LaunchRedemptionSettings(RewardsRedemptionSettingsItem selectedItem, String redemptionSettingsUrl) {
                Intrinsics.h(selectedItem, "selectedItem");
                Intrinsics.h(redemptionSettingsUrl, "redemptionSettingsUrl");
                this.f6426a = selectedItem;
                this.b = redemptionSettingsUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchRedemptionSettings)) {
                    return false;
                }
                LaunchRedemptionSettings launchRedemptionSettings = (LaunchRedemptionSettings) obj;
                return Intrinsics.c(this.f6426a, launchRedemptionSettings.f6426a) && Intrinsics.c(this.b, launchRedemptionSettings.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6426a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchRedemptionSettings(selectedItem=" + this.f6426a + ", redemptionSettingsUrl=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$LaunchStepUpAuthentication;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchStepUpAuthentication extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6427a;
            public final f b;

            public LaunchStepUpAuthentication(String twoFactorUrl, f fVar) {
                Intrinsics.h(twoFactorUrl, "twoFactorUrl");
                this.f6427a = twoFactorUrl;
                this.b = fVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LaunchStepUpAuthentication)) {
                    return false;
                }
                LaunchStepUpAuthentication launchStepUpAuthentication = (LaunchStepUpAuthentication) obj;
                return Intrinsics.c(this.f6427a, launchStepUpAuthentication.f6427a) && this.b.equals(launchStepUpAuthentication.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6427a.hashCode() * 31);
            }

            public final String toString() {
                return "LaunchStepUpAuthentication(twoFactorUrl=" + this.f6427a + ", onResult=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$NavigateToWebSettings;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToWebSettings extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6428a;

            public NavigateToWebSettings(String redemptionSettingsUrl) {
                Intrinsics.h(redemptionSettingsUrl, "redemptionSettingsUrl");
                this.f6428a = redemptionSettingsUrl;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToWebSettings) && Intrinsics.c(this.f6428a, ((NavigateToWebSettings) obj).f6428a);
            }

            public final int hashCode() {
                return this.f6428a.hashCode();
            }

            public final String toString() {
                return YU.a.h("NavigateToWebSettings(redemptionSettingsUrl=", this.f6428a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6429a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f6429a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f6429a, ((OpenUrl) obj).f6429a);
            }

            public final int hashCode() {
                return this.f6429a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f6429a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$ShowChangeConfirmationMessages;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowChangeConfirmationMessages extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final List f6430a;
            public final au.com.woolworths.feature.rewards.card.overlay.ui.b b;

            public ShowChangeConfirmationMessages(List messages, au.com.woolworths.feature.rewards.card.overlay.ui.b bVar) {
                Intrinsics.h(messages, "messages");
                this.f6430a = messages;
                this.b = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowChangeConfirmationMessages)) {
                    return false;
                }
                ShowChangeConfirmationMessages showChangeConfirmationMessages = (ShowChangeConfirmationMessages) obj;
                return Intrinsics.c(this.f6430a, showChangeConfirmationMessages.f6430a) && this.b.equals(showChangeConfirmationMessages.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6430a.hashCode() * 31);
            }

            public final String toString() {
                return "ShowChangeConfirmationMessages(messages=" + this.f6430a + ", onConfirm=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions$ShowSoftErrorMessage;", "Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowSoftErrorMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final SoftErrorType f6431a;

            public ShowSoftErrorMessage(SoftErrorType softErrorType) {
                this.f6431a = softErrorType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowSoftErrorMessage) && this.f6431a == ((ShowSoftErrorMessage) obj).f6431a;
            }

            public final int hashCode() {
                return this.f6431a.hashCode();
            }

            public final String toString() {
                return "ShowSoftErrorMessage(type=" + this.f6431a + ")";
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$AnalyticsImpressionType;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class AnalyticsImpressionType {
        public static final AnalyticsImpressionType e;
        public static final AnalyticsImpressionType f;
        public static final /* synthetic */ AnalyticsImpressionType[] g;
        public static final /* synthetic */ EnumEntries h;
        public final RewardsRedemptionSettingsActionData d;

        static {
            AnalyticsImpressionType analyticsImpressionType = new AnalyticsImpressionType("BOTTOM_SHEET_IMPRESSION", 0, RewardsRedemptionSettingsActionData.e);
            e = analyticsImpressionType;
            AnalyticsImpressionType analyticsImpressionType2 = new AnalyticsImpressionType("REWARDS_SETTING_IMPRESSION", 1, RewardsRedemptionSettingsActionData.f);
            f = analyticsImpressionType2;
            AnalyticsImpressionType[] analyticsImpressionTypeArr = {analyticsImpressionType, analyticsImpressionType2};
            g = analyticsImpressionTypeArr;
            h = EnumEntriesKt.a(analyticsImpressionTypeArr);
        }

        public AnalyticsImpressionType(String str, int i, RewardsRedemptionSettingsActionData rewardsRedemptionSettingsActionData) {
            this.d = rewardsRedemptionSettingsActionData;
        }

        public static AnalyticsImpressionType valueOf(String str) {
            return (AnalyticsImpressionType) Enum.valueOf(AnalyticsImpressionType.class, str);
        }

        public static AnalyticsImpressionType[] values() {
            return (AnalyticsImpressionType[]) g.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$SoftErrorType;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SoftErrorType {
        public static final SoftErrorType d;
        public static final SoftErrorType e;
        public static final SoftErrorType f;
        public static final /* synthetic */ SoftErrorType[] g;
        public static final /* synthetic */ EnumEntries h;

        static {
            SoftErrorType softErrorType = new SoftErrorType("STEPUP_ERROR", 0);
            d = softErrorType;
            SoftErrorType softErrorType2 = new SoftErrorType("SERVER_ERROR", 1);
            e = softErrorType2;
            SoftErrorType softErrorType3 = new SoftErrorType("NETWORK_ERROR", 2);
            f = softErrorType3;
            SoftErrorType[] softErrorTypeArr = {softErrorType, softErrorType2, softErrorType3};
            g = softErrorTypeArr;
            h = EnumEntriesKt.a(softErrorTypeArr);
        }

        public static SoftErrorType valueOf(String str) {
            return (SoftErrorType) Enum.valueOf(SoftErrorType.class, str);
        }

        public static SoftErrorType[] values() {
            return (SoftErrorType[]) g.clone();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$ViewState;", "", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6432a;
        public final List b;
        public final RewardsRedemptionActionsList c;
        public final RewardsRedemptionSettingsErrorState d;
        public final RewardsRedemptionSettingsItem e;

        public /* synthetic */ ViewState(boolean z) {
            this(z, null, null, null, null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6432a == viewState.f6432a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && this.d == viewState.d && Intrinsics.c(this.e, viewState.e);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6432a) * 31;
            List list = this.b;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            RewardsRedemptionActionsList rewardsRedemptionActionsList = this.c;
            int iHashCode3 = (iHashCode2 + (rewardsRedemptionActionsList == null ? 0 : rewardsRedemptionActionsList.hashCode())) * 31;
            RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState = this.d;
            int iHashCode4 = (iHashCode3 + (rewardsRedemptionSettingsErrorState == null ? 0 : rewardsRedemptionSettingsErrorState.hashCode())) * 31;
            RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem = this.e;
            return iHashCode4 + (rewardsRedemptionSettingsItem != null ? rewardsRedemptionSettingsItem.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f6432a + ", redemptionSettingsList=" + this.b + ", redemptionActions=" + this.c + ", errorState=" + this.d + ", changeToRedemptionSettingsItem=" + this.e + ")";
        }

        public ViewState(boolean z, List list, RewardsRedemptionActionsList rewardsRedemptionActionsList, RewardsRedemptionSettingsErrorState rewardsRedemptionSettingsErrorState, RewardsRedemptionSettingsItem rewardsRedemptionSettingsItem) {
            this.f6432a = z;
            this.b = list;
            this.c = rewardsRedemptionActionsList;
            this.d = rewardsRedemptionSettingsErrorState;
            this.e = rewardsRedemptionSettingsItem;
        }
    }
}
