package au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract;", "", "Action", "ViewState", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraOnboardingContract {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action;", "", "GetStarted", "OpenUrl", "Cancel", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action$Cancel;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action$GetStarted;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action$OpenUrl;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action$Cancel;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Cancel implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final Cancel f6109a = new Cancel();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Cancel);
            }

            public final int hashCode() {
                return -1628139932;
            }

            public final String toString() {
                return "Cancel";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action$GetStarted;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class GetStarted implements Action {

            /* renamed from: a, reason: collision with root package name */
            public static final GetStarted f6110a = new GetStarted();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof GetStarted);
            }

            public final int hashCode() {
                return 936171317;
            }

            public final String toString() {
                return "GetStarted";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$Action;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl implements Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6111a;

            public OpenUrl(String str) {
                this.f6111a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f6111a, ((OpenUrl) obj).f6111a);
            }

            public final int hashCode() {
                return this.f6111a.hashCode();
            }

            public final String toString() {
                return a.h("OpenUrl(url=", this.f6111a, ")");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState;", "", "Content", "Loading", "Error", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState$Loading;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtrasOnBoarding f6112a;

            public Content(EverydayExtrasOnBoarding everydayExtrasOnBoarding) {
                this.f6112a = everydayExtrasOnBoarding;
            }

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingContract.ViewState
            public final int a() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Content) && Intrinsics.c(this.f6112a, ((Content) obj).f6112a);
            }

            public final int hashCode() {
                return this.f6112a.hashCode();
            }

            public final String toString() {
                return "Content(onboarding=" + this.f6112a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {
            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingContract.ViewState
            public final int a() {
                return 2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                FullPageMessage.Error.ServerError serverError = FullPageMessage.Error.ServerError.f8916a;
                return serverError.equals(serverError);
            }

            public final int hashCode() {
                return 692899497;
            }

            public final String toString() {
                return "Error(error=" + FullPageMessage.Error.ServerError.f8916a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/onboarding/EverydayExtraOnboardingContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6113a = new Loading();

            @Override // au.com.woolworths.feature.rewards.everydayextras.signup.compose.onboarding.EverydayExtraOnboardingContract.ViewState
            public final int a() {
                return 1;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return 89002540;
            }

            public final String toString() {
                return "Loading";
            }
        }

        int a();
    }
}
