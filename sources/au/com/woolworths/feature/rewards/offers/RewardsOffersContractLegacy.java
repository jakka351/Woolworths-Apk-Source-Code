package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferFilterData;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessage;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy;", "", "Actions", "ViewState", "OfferFeedInlineBannerListener", "RewardsCtaCardListener", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsOffersContractLegacy {

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "", "CloseScreen", "ShowOfferDetailsScreen", "ShowOfferActivationError", "ShowOfferListRefreshFailedError", "ShowConfettiAnimation", "ShowOfferActivationMessage", "PerformHapticFeedbackForActivationSuccess", "PerformHapticFeedbackForActivationFailure", "OpenUrl", "DismissBanner", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$DismissBanner;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowConfettiAnimation;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferActivationMessage;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferDetailsScreen;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferListRefreshFailedError;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseScreen f6243a = new CloseScreen();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$DismissBanner;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class DismissBanner extends Actions {
            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof DismissBanner);
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "DismissBanner(bannerId=null)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6244a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f6244a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f6244a, ((OpenUrl) obj).f6244a);
            }

            public final int hashCode() {
                return this.f6244a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f6244a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PerformHapticFeedbackForActivationFailure extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationFailure f6245a = new PerformHapticFeedbackForActivationFailure();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class PerformHapticFeedbackForActivationSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationSuccess f6246a = new PerformHapticFeedbackForActivationSuccess();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowConfettiAnimation;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowConfettiAnimation extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowConfettiAnimation f6247a = new ShowConfettiAnimation();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f6248a;

            public ShowOfferActivationError(Text text) {
                this.f6248a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationError) && Intrinsics.c(this.f6248a, ((ShowOfferActivationError) obj).f6248a);
            }

            public final int hashCode() {
                return this.f6248a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowOfferActivationError(message=", this.f6248a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferActivationMessage;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OfferActivationMessage f6249a;

            public ShowOfferActivationMessage(OfferActivationMessage message) {
                Intrinsics.h(message, "message");
                this.f6249a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationMessage) && Intrinsics.c(this.f6249a, ((ShowOfferActivationMessage) obj).f6249a);
            }

            public final int hashCode() {
                return this.f6249a.hashCode();
            }

            public final String toString() {
                return "ShowOfferActivationMessage(message=" + this.f6249a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferDetailsScreen;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferDetailsScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6250a;

            public ShowOfferDetailsScreen(String offerId) {
                Intrinsics.h(offerId, "offerId");
                this.f6250a = offerId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferDetailsScreen) && Intrinsics.c(this.f6250a, ((ShowOfferDetailsScreen) obj).f6250a);
            }

            public final int hashCode() {
                return this.f6250a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowOfferDetailsScreen(offerId=", this.f6250a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions$ShowOfferListRefreshFailedError;", "Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferListRefreshFailedError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f6251a;

            public ShowOfferListRefreshFailedError(int i) {
                this.f6251a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferListRefreshFailedError) && this.f6251a == ((ShowOfferListRefreshFailedError) obj).f6251a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f6251a);
            }

            public final String toString() {
                return YU.a.e(this.f6251a, "ShowOfferListRefreshFailedError(message=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$OfferFeedInlineBannerListener;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferFeedInlineBannerListener {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof OfferFeedInlineBannerListener);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "OfferFeedInlineBannerListener(onDismiss=null, onImpression=null, onClick=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$RewardsCtaCardListener;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsCtaCardListener {
        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RewardsCtaCardListener);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "RewardsCtaCardListener(onClick=null)";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOffersContractLegacy$ViewState;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6252a;
        public final RewardsOfferListFullPageErrorState b;
        public final List c;
        public final RewardsOffersMessage d;
        public final Set e;
        public final RewardsOfferFilterData f;

        public /* synthetic */ ViewState(RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState, ArrayList arrayList, RewardsOffersMessage rewardsOffersMessage, Set set, RewardsOfferFilterData rewardsOfferFilterData, int i) {
            this((i & 1) == 0, (i & 2) != 0 ? null : rewardsOfferListFullPageErrorState, (i & 4) != 0 ? null : arrayList, (i & 8) != 0 ? null : rewardsOffersMessage, (i & 16) != 0 ? null : set, (i & 32) != 0 ? null : rewardsOfferFilterData);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v2, types: [java.util.List] */
        public static ViewState a(ViewState viewState, boolean z, ArrayList arrayList, RewardsOfferFilterData rewardsOfferFilterData, int i) {
            if ((i & 1) != 0) {
                z = viewState.f6252a;
            }
            boolean z2 = z;
            RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = (i & 2) != 0 ? viewState.b : null;
            ArrayList arrayList2 = arrayList;
            if ((i & 4) != 0) {
                arrayList2 = viewState.c;
            }
            ArrayList arrayList3 = arrayList2;
            RewardsOffersMessage rewardsOffersMessage = viewState.d;
            Set set = viewState.e;
            if ((i & 32) != 0) {
                rewardsOfferFilterData = viewState.f;
            }
            return new ViewState(z2, rewardsOfferListFullPageErrorState, arrayList3, rewardsOffersMessage, set, rewardsOfferFilterData);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6252a == viewState.f6252a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6252a) * 31;
            RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = this.b;
            int iHashCode2 = (iHashCode + (rewardsOfferListFullPageErrorState == null ? 0 : rewardsOfferListFullPageErrorState.hashCode())) * 31;
            List list = this.c;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            RewardsOffersMessage rewardsOffersMessage = this.d;
            int iHashCode4 = (iHashCode3 + (rewardsOffersMessage == null ? 0 : rewardsOffersMessage.hashCode())) * 31;
            Set set = this.e;
            int iHashCode5 = (iHashCode4 + (set == null ? 0 : set.hashCode())) * 31;
            RewardsOfferFilterData rewardsOfferFilterData = this.f;
            return iHashCode5 + (rewardsOfferFilterData != null ? rewardsOfferFilterData.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f6252a + ", errorState=" + this.b + ", sections=" + this.c + ", offersMessage=" + this.d + ", filters=" + this.e + ", selectedFilter=" + this.f + ")";
        }

        public ViewState(boolean z, RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState, List list, RewardsOffersMessage rewardsOffersMessage, Set set, RewardsOfferFilterData rewardsOfferFilterData) {
            this.f6252a = z;
            this.b = rewardsOfferListFullPageErrorState;
            this.c = list;
            this.d = rewardsOffersMessage;
            this.e = set;
            this.f = rewardsOfferFilterData;
        }
    }
}
