package au.com.woolworths.feature.shared.instore.wifi.analytics;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.dynamic.page.ui.content.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "TermsAndConditionsLinkClick", "PrivacyPolicyLinkClick", "SendFeedbackLinkClick", "CollectionNoticeLinkClick", "ToggleSwitchWifiClickOn", "ToggleSwitchWifiClickOff", "SetupCompleteSnackbarImpression", "SetupCompleteErrorDeviceNotSupported", "SetupCompleteErrorImpression", "InstoreWifiLogoutErrorImpression", "NotificationPreferencesLinkClick", "LoginDialogImpression", "LoginDialogButtonClick", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$CollectionNoticeLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$InstoreWifiLogoutErrorImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$LoginDialogButtonClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$LoginDialogImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$NotificationPreferencesLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$PrivacyPolicyLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SendFeedbackLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SetupCompleteErrorDeviceNotSupported;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SetupCompleteErrorImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SetupCompleteSnackbarImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$TermsAndConditionsLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$ToggleSwitchWifiClickOff;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$ToggleSwitchWifiClickOn;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class InstoreWifiAction implements Action {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$CollectionNoticeLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CollectionNoticeLinkClick extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.D;
        public final String f = "collection notice";

        public CollectionNoticeLinkClick(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CollectionNoticeLinkClick) && this.d.equals(((CollectionNoticeLinkClick) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "CollectionNoticeLinkClick(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$InstoreWifiLogoutErrorImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InstoreWifiLogoutErrorImpression extends InstoreWifiAction {
        public static final InstoreWifiLogoutErrorImpression d = new InstoreWifiLogoutErrorImpression();
        public static final Screen e = Screens.k;
        public static final Category f = Category.v;
        public static final String g = "Something went wrong. Please try again.";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getH() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$LoginDialogButtonClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoginDialogButtonClick extends InstoreWifiAction {
        public static final LoginDialogButtonClick d = new LoginDialogButtonClick();
        public static final Screen e = WifiScreens.d;
        public static final Category f = Category.m;
        public static final String g = "instore wi-fi - login or sign up";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getH() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$LoginDialogImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LoginDialogImpression extends InstoreWifiAction {
        public static final LoginDialogImpression d = new LoginDialogImpression();
        public static final Screen e = WifiScreens.d;
        public static final Category f = Category.u;
        public static final String g = "instore wi-fi - login or sign up";

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a */
        public final String getH() {
            return g;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b */
        public final Category getE() {
            return f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return e;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$NotificationPreferencesLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NotificationPreferencesLinkClick extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.D;
        public final String f = "opt out at any time";

        public NotificationPreferencesLinkClick(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NotificationPreferencesLinkClick) && this.d.equals(((NotificationPreferencesLinkClick) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "NotificationPreferencesLinkClick(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$PrivacyPolicyLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrivacyPolicyLinkClick extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.D;
        public final String f = "privacy policy";

        public PrivacyPolicyLinkClick(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyPolicyLinkClick) && this.d.equals(((PrivacyPolicyLinkClick) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "PrivacyPolicyLinkClick(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SendFeedbackLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SendFeedbackLinkClick extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.D;
        public final String f = "send feedback";

        public SendFeedbackLinkClick(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SendFeedbackLinkClick) && this.d.equals(((SendFeedbackLinkClick) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "SendFeedbackLinkClick(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SetupCompleteErrorDeviceNotSupported;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetupCompleteErrorDeviceNotSupported extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.v;
        public final String f = "Your device does not support our store Wi-Fi network.";

        public SetupCompleteErrorDeviceNotSupported(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupCompleteErrorDeviceNotSupported) && this.d.equals(((SetupCompleteErrorDeviceNotSupported) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "SetupCompleteErrorDeviceNotSupported(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SetupCompleteErrorImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetupCompleteErrorImpression extends InstoreWifiAction {
        public final Screen d;
        public final Category e = Category.v;
        public final String f = "Something went wrong. Please try again.";

        public SetupCompleteErrorImpression(Screen screen) {
            this.d = screen;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupCompleteErrorImpression) && Intrinsics.c(this.d, ((SetupCompleteErrorImpression) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f, reason: from getter */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return d.m("SetupCompleteErrorImpression(screen=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$SetupCompleteSnackbarImpression;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SetupCompleteSnackbarImpression extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.g0;
        public final String f = "Wi-Fi set up complete.";

        public SetupCompleteSnackbarImpression(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SetupCompleteSnackbarImpression) && this.d.equals(((SetupCompleteSnackbarImpression) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "SetupCompleteSnackbarImpression(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$TermsAndConditionsLinkClick;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TermsAndConditionsLinkClick extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.D;
        public final String f = "terms and conditions";

        public TermsAndConditionsLinkClick(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TermsAndConditionsLinkClick) && this.d.equals(((TermsAndConditionsLinkClick) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "TermsAndConditionsLinkClick(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$ToggleSwitchWifiClickOff;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToggleSwitchWifiClickOff extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.m;
        public final String f = "Connect Instore Wi-fi - Off";

        public ToggleSwitchWifiClickOff(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSwitchWifiClickOff) && this.d.equals(((ToggleSwitchWifiClickOff) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "ToggleSwitchWifiClickOff(screen=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction$ToggleSwitchWifiClickOn;", "Lau/com/woolworths/feature/shared/instore/wifi/analytics/InstoreWifiAction;", "instore-wifi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ToggleSwitchWifiClickOn extends InstoreWifiAction {
        public final WifiScreens d;
        public final Category e = Category.m;
        public final String f = "Connect Instore Wi-fi - On";

        public ToggleSwitchWifiClickOn(WifiScreens wifiScreens) {
            this.d = wifiScreens;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getH() {
            return this.f;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getE() {
            return this.e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ToggleSwitchWifiClickOn) && this.d.equals(((ToggleSwitchWifiClickOn) obj).d);
        }

        @Override // au.com.woolworths.android.onesite.analytics.Action
        /* renamed from: f */
        public final Screen getF() {
            return this.d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "ToggleSwitchWifiClickOn(screen=" + this.d + ")";
        }
    }
}
