package au.com.woolworths.feature.shop.onboarding.sdui;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.branch.BranchReferringParams;
import au.com.woolworths.feature.shop.onboarding.sdui.data.OnboardingContentPageData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract;", "", "NavigationAction", "ViewState", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OnboardingSduiContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction;", "", "LaunchLogin", "LaunchSignup", "ContinueAsGuest", "NavigateToBranchLink", "NavigateToCollectionMode", "NavigateToHomePage", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$ContinueAsGuest;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$LaunchLogin;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$LaunchSignup;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$NavigateToBranchLink;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$NavigateToCollectionMode;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$NavigateToHomePage;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static abstract class NavigationAction {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$ContinueAsGuest;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ContinueAsGuest extends NavigationAction {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ContinueAsGuest);
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            public final String toString() {
                return "ContinueAsGuest(handleDeeplink=true)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$LaunchLogin;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchLogin extends NavigationAction {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchLogin f7965a = new LaunchLogin();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchLogin);
            }

            public final int hashCode() {
                return 603930501;
            }

            public final String toString() {
                return "LaunchLogin";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$LaunchSignup;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchSignup extends NavigationAction {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchSignup f7966a = new LaunchSignup();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof LaunchSignup);
            }

            public final int hashCode() {
                return 1736844412;
            }

            public final String toString() {
                return "LaunchSignup";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$NavigateToBranchLink;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class NavigateToBranchLink extends NavigationAction {

            /* renamed from: a, reason: collision with root package name */
            public final BranchReferringParams f7967a;

            public NavigateToBranchLink(BranchReferringParams branchReferringParams) {
                this.f7967a = branchReferringParams;
            }

            /* renamed from: a, reason: from getter */
            public final BranchReferringParams getF7967a() {
                return this.f7967a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToBranchLink) && Intrinsics.c(this.f7967a, ((NavigateToBranchLink) obj).f7967a);
            }

            public final int hashCode() {
                BranchReferringParams branchReferringParams = this.f7967a;
                if (branchReferringParams == null) {
                    return 0;
                }
                return branchReferringParams.hashCode();
            }

            public final String toString() {
                return "NavigateToBranchLink(branchReferringParams=" + this.f7967a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$NavigateToCollectionMode;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class NavigateToCollectionMode extends NavigationAction {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToCollectionMode f7968a = new NavigateToCollectionMode();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction$NavigateToHomePage;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$NavigationAction;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class NavigateToHomePage extends NavigationAction {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToHomePage f7969a = new NavigateToHomePage();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState;", "", "OnboardingContent", "Loading", "Error", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState$Loading;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState$OnboardingContent;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState$Error;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final /* data */ class Error implements ViewState {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                FullPageMessage.Error.ConnectionError connectionError = FullPageMessage.Error.ConnectionError.f8915a;
                return connectionError.equals(connectionError);
            }

            public final int hashCode() {
                return -544647698;
            }

            public final String toString() {
                return "Error(error=" + FullPageMessage.Error.ConnectionError.f8915a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState$Loading;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f7970a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 1833017671;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState$OnboardingContent;", "Lau/com/woolworths/feature/shop/onboarding/sdui/OnboardingSduiContract$ViewState;", "onboarding-sdui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OnboardingContent implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final OnboardingContentPageData f7971a;

            public OnboardingContent(OnboardingContentPageData onboardingContentPageData) {
                this.f7971a = onboardingContentPageData;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OnboardingContent) && Intrinsics.c(this.f7971a, ((OnboardingContent) obj).f7971a);
            }

            public final int hashCode() {
                return this.f7971a.hashCode();
            }

            public final String toString() {
                return "OnboardingContent(data=" + this.f7971a + ")";
            }
        }
    }
}
