package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferScreenData;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy;", "", "ViewState", "Actions", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsOfferDetailsContractLegacy {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "", "ShowOfferActivationError", "ShowOfferActivationMessage", "CloseScreen", "CloseScreenAndShowError", "PerformHapticFeedbackForActivationSuccess", "PerformHapticFeedbackForActivationFailure", "OpenUrl", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$CloseScreenAndShowError;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$ShowOfferActivationMessage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseScreen f6321a = new CloseScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseScreen);
            }

            public final int hashCode() {
                return -309276171;
            }

            public final String toString() {
                return "CloseScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$CloseScreenAndShowError;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreenAndShowError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f6322a;

            public CloseScreenAndShowError(Text text) {
                this.f6322a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CloseScreenAndShowError) && Intrinsics.c(this.f6322a, ((CloseScreenAndShowError) obj).f6322a);
            }

            public final int hashCode() {
                return this.f6322a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("CloseScreenAndShowError(message=", this.f6322a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6323a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f6323a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f6323a, ((OpenUrl) obj).f6323a);
            }

            public final int hashCode() {
                return this.f6323a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f6323a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticFeedbackForActivationFailure extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationFailure f6324a = new PerformHapticFeedbackForActivationFailure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticFeedbackForActivationFailure);
            }

            public final int hashCode() {
                return -428610535;
            }

            public final String toString() {
                return "PerformHapticFeedbackForActivationFailure";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticFeedbackForActivationSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationSuccess f6325a = new PerformHapticFeedbackForActivationSuccess();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticFeedbackForActivationSuccess);
            }

            public final int hashCode() {
                return -1209206126;
            }

            public final String toString() {
                return "PerformHapticFeedbackForActivationSuccess";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f6326a;

            public ShowOfferActivationError(Text text) {
                this.f6326a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationError) && Intrinsics.c(this.f6326a, ((ShowOfferActivationError) obj).f6326a);
            }

            public final int hashCode() {
                return this.f6326a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowOfferActivationError(message=", this.f6326a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions$ShowOfferActivationMessage;", "Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OfferActivationMessage f6327a;

            public ShowOfferActivationMessage(OfferActivationMessage message) {
                Intrinsics.h(message, "message");
                this.f6327a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationMessage) && Intrinsics.c(this.f6327a, ((ShowOfferActivationMessage) obj).f6327a);
            }

            public final int hashCode() {
                return this.f6327a.hashCode();
            }

            public final String toString() {
                return "ShowOfferActivationMessage(message=" + this.f6327a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/RewardsOfferDetailsContractLegacy$ViewState;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6328a;
        public final boolean b;
        public final RewardsOfferScreenData c;
        public final RewardsOfferDetailsFullPageErrorStateLegacy d;
        public final boolean e;
        public final RewardsOfferData f;

        public /* synthetic */ ViewState(RewardsOfferScreenData rewardsOfferScreenData, RewardsOfferDetailsFullPageErrorStateLegacy rewardsOfferDetailsFullPageErrorStateLegacy, int i) {
            this(false, false, (i & 4) != 0 ? null : rewardsOfferScreenData, (i & 8) != 0 ? null : rewardsOfferDetailsFullPageErrorStateLegacy, false);
        }

        public static ViewState a(ViewState viewState, boolean z, boolean z2, RewardsOfferScreenData rewardsOfferScreenData, RewardsOfferDetailsFullPageErrorStateLegacy rewardsOfferDetailsFullPageErrorStateLegacy, boolean z3, int i) {
            if ((i & 1) != 0) {
                z = viewState.f6328a;
            }
            boolean z4 = z;
            if ((i & 2) != 0) {
                z2 = viewState.b;
            }
            boolean z5 = z2;
            if ((i & 4) != 0) {
                rewardsOfferScreenData = viewState.c;
            }
            RewardsOfferScreenData rewardsOfferScreenData2 = rewardsOfferScreenData;
            if ((i & 8) != 0) {
                rewardsOfferDetailsFullPageErrorStateLegacy = viewState.d;
            }
            RewardsOfferDetailsFullPageErrorStateLegacy rewardsOfferDetailsFullPageErrorStateLegacy2 = rewardsOfferDetailsFullPageErrorStateLegacy;
            if ((i & 16) != 0) {
                z3 = viewState.e;
            }
            viewState.getClass();
            return new ViewState(z4, z5, rewardsOfferScreenData2, rewardsOfferDetailsFullPageErrorStateLegacy2, z3);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6328a == viewState.f6328a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && this.e == viewState.e;
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f6328a) * 31, 31, this.b);
            RewardsOfferScreenData rewardsOfferScreenData = this.c;
            int iHashCode = (iE + (rewardsOfferScreenData == null ? 0 : rewardsOfferScreenData.hashCode())) * 31;
            RewardsOfferDetailsFullPageErrorStateLegacy rewardsOfferDetailsFullPageErrorStateLegacy = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode + (rewardsOfferDetailsFullPageErrorStateLegacy != null ? rewardsOfferDetailsFullPageErrorStateLegacy.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = androidx.camera.core.impl.b.v("ViewState(isLoading=", ", isActivating=", ", offerScreenData=", this.f6328a, this.b);
            sbV.append(this.c);
            sbV.append(", errorState=");
            sbV.append(this.d);
            sbV.append(", showKonfettiView=");
            return YU.a.k(")", sbV, this.e);
        }

        public ViewState(boolean z, boolean z2, RewardsOfferScreenData rewardsOfferScreenData, RewardsOfferDetailsFullPageErrorStateLegacy rewardsOfferDetailsFullPageErrorStateLegacy, boolean z3) {
            this.f6328a = z;
            this.b = z2;
            this.c = rewardsOfferScreenData;
            this.d = rewardsOfferDetailsFullPageErrorStateLegacy;
            this.e = z3;
            this.f = rewardsOfferScreenData instanceof RewardsOfferData ? (RewardsOfferData) rewardsOfferScreenData : null;
        }
    }
}
