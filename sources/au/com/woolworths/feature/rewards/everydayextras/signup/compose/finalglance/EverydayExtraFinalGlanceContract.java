package au.com.woolworths.feature.rewards.everydayextras.signup.compose.finalglance;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.EverydayExtraFinalGlanceContent;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.finalglance.OfferActivationState;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtraSubscribeAlertDialog;
import au.com.woolworths.feature.rewards.everydayextras.signup.data.onboarding.EverydayExtrasOnBoarding;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract;", "", "ViewState", "Actions", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EverydayExtraFinalGlanceContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions;", "", "Finish", "ShowError", "ShowAlertDialog", "ShowOnboarding", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$Finish;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$ShowAlertDialog;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$ShowError;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$ShowOnboarding;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$Finish;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Finish extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final Finish f6082a = new Finish();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Finish);
            }

            public final int hashCode() {
                return -1991807254;
            }

            public final String toString() {
                return "Finish";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$ShowAlertDialog;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowAlertDialog extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtraSubscribeAlertDialog f6083a;

            public ShowAlertDialog(EverydayExtraSubscribeAlertDialog everydayExtraSubscribeAlertDialog) {
                this.f6083a = everydayExtraSubscribeAlertDialog;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowAlertDialog) && Intrinsics.c(this.f6083a, ((ShowAlertDialog) obj).f6083a);
            }

            public final int hashCode() {
                return this.f6083a.hashCode();
            }

            public final String toString() {
                return "ShowAlertDialog(alertDialog=" + this.f6083a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$ShowError;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f6084a;
            public final int b;

            public ShowError(int i, int i2) {
                this.f6084a = i;
                this.b = i2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowError)) {
                    return false;
                }
                ShowError showError = (ShowError) obj;
                return this.f6084a == showError.f6084a && this.b == showError.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.f6084a) * 31);
            }

            public final String toString() {
                return b.j(this.f6084a, this.b, "ShowError(title=", ", message=", ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions$ShowOnboarding;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$Actions;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOnboarding extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6085a;
            public final EverydayExtrasOnBoarding b;

            public ShowOnboarding(String str, EverydayExtrasOnBoarding everydayExtrasOnBoarding) {
                this.f6085a = str;
                this.b = everydayExtrasOnBoarding;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof ShowOnboarding)) {
                    return false;
                }
                ShowOnboarding showOnboarding = (ShowOnboarding) obj;
                return Intrinsics.c(this.f6085a, showOnboarding.f6085a) && Intrinsics.c(this.b, showOnboarding.b);
            }

            public final int hashCode() {
                String str = this.f6085a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "ShowOnboarding(acquisitionOfferName=" + this.f6085a + ", onboardingItem=" + this.b + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState;", "", "Content", "Loading", "Error", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState$Loading;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final EverydayExtraFinalGlanceContent f6086a;
            public final OfferActivationState b;

            public Content(EverydayExtraFinalGlanceContent finalGlanceContent, OfferActivationState offerActivationState) {
                Intrinsics.h(finalGlanceContent, "finalGlanceContent");
                this.f6086a = finalGlanceContent;
                this.b = offerActivationState;
            }

            public static Content c(Content content, OfferActivationState offerActivationState) {
                EverydayExtraFinalGlanceContent finalGlanceContent = content.f6086a;
                Intrinsics.h(finalGlanceContent, "finalGlanceContent");
                return new Content(finalGlanceContent, offerActivationState);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return Intrinsics.c(this.f6086a, content.f6086a) && this.b == content.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6086a.f6149a.hashCode() * 31);
            }

            public final String toString() {
                return "Content(finalGlanceContent=" + this.f6086a + ", offerActivationState=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f6087a;

            public Error(FullPageMessage.Error error) {
                this.f6087a = error;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6087a, ((Error) obj).f6087a);
            }

            public final int hashCode() {
                return this.f6087a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f6087a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/everydayextras/signup/compose/finalglance/EverydayExtraFinalGlanceContract$ViewState;", "everyday-extras-sign-up_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6088a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -1085711308;
            }

            public final String toString() {
                return "Loading";
            }
        }

        default boolean a() {
            OfferActivationState offerActivationState = OfferActivationState.e;
            Content contentB = b();
            return offerActivationState != (contentB != null ? contentB.b : null);
        }

        default Content b() {
            if (this instanceof Content) {
                return (Content) this;
            }
            return null;
        }
    }
}
