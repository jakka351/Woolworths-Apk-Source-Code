package au.com.woolworths.android.onesite.modules.splash;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.force.upgrade.data.UpgradeConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract;", "", "Action", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface SplashScreenContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\u000b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "", "LaunchHome", "LaunchOnboarding", "LaunchLegacyOnboarding", "LaunchCountrySelector", "ShowAppFlexibleUpdate", "ShowAppForcedUpdate", "ShowOsFlexibleUpdate", "ShowOsForcedUpdate", "ShowUpdateAvailableDialog", "ShowForceUpdateDialog", "ShowUnsupportedOsDialog", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchCountrySelector;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchHome;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchLegacyOnboarding;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchOnboarding;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowAppFlexibleUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowAppForcedUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowForceUpdateDialog;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowOsFlexibleUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowOsForcedUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowUnsupportedOsDialog;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowUpdateAvailableDialog;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchCountrySelector;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class LaunchCountrySelector extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchCountrySelector f4432a = new LaunchCountrySelector();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchCountrySelector);
            }

            public final int hashCode() {
                return 412897184;
            }

            public final String toString() {
                return "LaunchCountrySelector";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchHome;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchHome extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchHome f4433a = new LaunchHome();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchHome);
            }

            public final int hashCode() {
                return -406865996;
            }

            public final String toString() {
                return "LaunchHome";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchLegacyOnboarding;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class LaunchLegacyOnboarding extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLegacyOnboarding f4434a = new LaunchLegacyOnboarding();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchLegacyOnboarding);
            }

            public final int hashCode() {
                return 1868286489;
            }

            public final String toString() {
                return "LaunchLegacyOnboarding";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$LaunchOnboarding;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchOnboarding extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchOnboarding f4435a = new LaunchOnboarding();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchOnboarding);
            }

            public final int hashCode() {
                return 46581040;
            }

            public final String toString() {
                return "LaunchOnboarding";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowAppFlexibleUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowAppFlexibleUpdate extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final UpgradeConfig f4436a;

            public ShowAppFlexibleUpdate(UpgradeConfig upgradeConfig) {
                this.f4436a = upgradeConfig;
            }

            /* renamed from: a, reason: from getter */
            public final UpgradeConfig getF4436a() {
                return this.f4436a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAppFlexibleUpdate) && Intrinsics.c(this.f4436a, ((ShowAppFlexibleUpdate) obj).f4436a);
            }

            public final int hashCode() {
                return this.f4436a.hashCode();
            }

            public final String toString() {
                return "ShowAppFlexibleUpdate(upgradeConfig=" + this.f4436a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowAppForcedUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowAppForcedUpdate extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final UpgradeConfig f4437a;

            public ShowAppForcedUpdate(UpgradeConfig upgradeConfig) {
                this.f4437a = upgradeConfig;
            }

            /* renamed from: a, reason: from getter */
            public final UpgradeConfig getF4437a() {
                return this.f4437a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAppForcedUpdate) && Intrinsics.c(this.f4437a, ((ShowAppForcedUpdate) obj).f4437a);
            }

            public final int hashCode() {
                return this.f4437a.hashCode();
            }

            public final String toString() {
                return "ShowAppForcedUpdate(upgradeConfig=" + this.f4437a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowForceUpdateDialog;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowForceUpdateDialog extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f4438a;

            public ShowForceUpdateDialog(String str) {
                this.f4438a = str;
            }

            /* renamed from: a, reason: from getter */
            public final String getF4438a() {
                return this.f4438a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowForceUpdateDialog) && Intrinsics.c(this.f4438a, ((ShowForceUpdateDialog) obj).f4438a);
            }

            public final int hashCode() {
                String str = this.f4438a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowForceUpdateDialog(message=", this.f4438a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowOsFlexibleUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowOsFlexibleUpdate extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final UpgradeConfig f4439a;

            public ShowOsFlexibleUpdate(UpgradeConfig upgradeConfig) {
                this.f4439a = upgradeConfig;
            }

            /* renamed from: a, reason: from getter */
            public final UpgradeConfig getF4439a() {
                return this.f4439a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOsFlexibleUpdate) && Intrinsics.c(this.f4439a, ((ShowOsFlexibleUpdate) obj).f4439a);
            }

            public final int hashCode() {
                return this.f4439a.hashCode();
            }

            public final String toString() {
                return "ShowOsFlexibleUpdate(upgradeConfig=" + this.f4439a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowOsForcedUpdate;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowOsForcedUpdate extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final UpgradeConfig f4440a;

            public ShowOsForcedUpdate(UpgradeConfig upgradeConfig) {
                this.f4440a = upgradeConfig;
            }

            /* renamed from: a, reason: from getter */
            public final UpgradeConfig getF4440a() {
                return this.f4440a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOsForcedUpdate) && Intrinsics.c(this.f4440a, ((ShowOsForcedUpdate) obj).f4440a);
            }

            public final int hashCode() {
                return this.f4440a.hashCode();
            }

            public final String toString() {
                return "ShowOsForcedUpdate(upgradeConfig=" + this.f4440a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowUnsupportedOsDialog;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowUnsupportedOsDialog extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f4441a;

            public ShowUnsupportedOsDialog(String str) {
                this.f4441a = str;
            }

            /* renamed from: a, reason: from getter */
            public final String getF4441a() {
                return this.f4441a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowUnsupportedOsDialog) && Intrinsics.c(this.f4441a, ((ShowUnsupportedOsDialog) obj).f4441a);
            }

            public final int hashCode() {
                String str = this.f4441a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowUnsupportedOsDialog(message=", this.f4441a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action$ShowUpdateAvailableDialog;", "Lau/com/woolworths/android/onesite/modules/splash/SplashScreenContract$Action;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class ShowUpdateAvailableDialog extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f4442a;
            public final String b;

            public ShowUpdateAvailableDialog(String str, String str2) {
                this.f4442a = str;
                this.b = str2;
            }

            /* renamed from: a, reason: from getter */
            public final String getB() {
                return this.b;
            }

            /* renamed from: b, reason: from getter */
            public final String getF4442a() {
                return this.f4442a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowUpdateAvailableDialog)) {
                    return false;
                }
                ShowUpdateAvailableDialog showUpdateAvailableDialog = (ShowUpdateAvailableDialog) obj;
                return Intrinsics.c(this.f4442a, showUpdateAvailableDialog.f4442a) && Intrinsics.c(this.b, showUpdateAvailableDialog.b);
            }

            public final int hashCode() {
                String str = this.f4442a;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return iHashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                return YU.a.j("ShowUpdateAvailableDialog(message=", this.f4442a, ", appVersion=", this.b, ")");
            }
        }
    }
}
