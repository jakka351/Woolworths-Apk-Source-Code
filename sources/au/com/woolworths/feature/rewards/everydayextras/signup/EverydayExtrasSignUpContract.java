package au.com.woolworths.feature.rewards.everydayextras.signup;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract;", "", "Action", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EverydayExtrasSignUpContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "", "NavigateToLanding", "NavigateToChoosePlan", "NavigateToChoosePlanAsInitialScreen", "NavigateToSummary", "NavigateToOnBoarding", "PerformSignUpBackAction", "PerformSignUpCloseAction", "OpenUrl", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToChoosePlan;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToChoosePlanAsInitialScreen;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToLanding;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToOnBoarding;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToSummary;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$PerformSignUpBackAction;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$PerformSignUpCloseAction;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToChoosePlan;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToChoosePlan extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToChoosePlan f5927a = new NavigateToChoosePlan();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToChoosePlan);
            }

            public final int hashCode() {
                return 1978282367;
            }

            public final String toString() {
                return "NavigateToChoosePlan";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToChoosePlanAsInitialScreen;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToChoosePlanAsInitialScreen extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToChoosePlanAsInitialScreen f5928a = new NavigateToChoosePlanAsInitialScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToChoosePlanAsInitialScreen);
            }

            public final int hashCode() {
                return -124256705;
            }

            public final String toString() {
                return "NavigateToChoosePlanAsInitialScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToLanding;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToLanding extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateToLanding f5929a = new NavigateToLanding();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateToLanding);
            }

            public final int hashCode() {
                return -497494312;
            }

            public final String toString() {
                return "NavigateToLanding";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToOnBoarding;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToOnBoarding extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtrasOnBoarding f5930a;

            public NavigateToOnBoarding(EverydayExtrasOnBoarding everydayExtrasOnBoarding) {
                this.f5930a = everydayExtrasOnBoarding;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToOnBoarding) && Intrinsics.c(this.f5930a, ((NavigateToOnBoarding) obj).f5930a);
            }

            public final int hashCode() {
                return this.f5930a.hashCode();
            }

            public final String toString() {
                return "NavigateToOnBoarding(onBoardingItem=" + this.f5930a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$NavigateToSummary;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateToSummary extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5931a;

            public NavigateToSummary(String str) {
                this.f5931a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NavigateToSummary) && Intrinsics.c(this.f5931a, ((NavigateToSummary) obj).f5931a);
            }

            public final int hashCode() {
                return this.f5931a.hashCode();
            }

            public final String toString() {
                return a.h("NavigateToSummary(planIdentifier=", this.f5931a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f5932a;

            public OpenUrl(String str) {
                this.f5932a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f5932a, ((OpenUrl) obj).f5932a);
            }

            public final int hashCode() {
                return this.f5932a.hashCode();
            }

            public final String toString() {
                return a.h("OpenUrl(url=", this.f5932a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$PerformSignUpBackAction;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformSignUpBackAction extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformSignUpBackAction f5933a = new PerformSignUpBackAction();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformSignUpBackAction);
            }

            public final int hashCode() {
                return -1879484605;
            }

            public final String toString() {
                return "PerformSignUpBackAction";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action$PerformSignUpCloseAction;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/EverydayExtrasSignUpContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformSignUpCloseAction extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformSignUpCloseAction f5934a = new PerformSignUpCloseAction();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformSignUpCloseAction);
            }

            public final int hashCode() {
                return -353524280;
            }

            public final String toString() {
                return "PerformSignUpCloseAction";
            }
        }
    }
}
