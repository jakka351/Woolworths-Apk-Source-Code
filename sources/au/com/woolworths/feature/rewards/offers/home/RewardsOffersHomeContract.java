package au.com.woolworths.feature.rewards.offers.home;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.common.Region;
import au.com.woolworths.feature.rewards.offers.RewardsOfferBaseContract;
import au.com.woolworths.feature.rewards.offers.SectionViewItemExtKt;
import au.com.woolworths.feature.rewards.offers.data.RewardsErrorDialog;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersHeader;
import au.com.woolworths.feature.rewards.offers.data.RewardsOffersMessage;
import au.com.woolworths.feature.rewards.offers.list.RewardsOfferListFullPageErrorState;
import au.com.woolworths.foundation.rewards.offers.model.OfferActivationMessage;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract;", "", "Actions", "ViewState", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsOffersHomeContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract$Actions;", "CloseScreen", "ShowOfferDetailsScreen", "ShowOfferActivationError", "ShowOfferListRefreshFailedError", "ShowOfferActivationMessage", "PerformHapticFeedbackForActivationSuccess", "PerformHapticFeedbackForActivationFailure", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferActivationMessage;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferDetailsScreen;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferListRefreshFailedError;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions extends RewardsOfferBaseContract.Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$CloseScreen;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class CloseScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final CloseScreen f6342a = new CloseScreen();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof CloseScreen);
            }

            public final int hashCode() {
                return 1488852586;
            }

            public final String toString() {
                return "CloseScreen";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$PerformHapticFeedbackForActivationFailure;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticFeedbackForActivationFailure extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationFailure f6343a = new PerformHapticFeedbackForActivationFailure();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticFeedbackForActivationFailure);
            }

            public final int hashCode() {
                return -1468680754;
            }

            public final String toString() {
                return "PerformHapticFeedbackForActivationFailure";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$PerformHapticFeedbackForActivationSuccess;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class PerformHapticFeedbackForActivationSuccess extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final PerformHapticFeedbackForActivationSuccess f6344a = new PerformHapticFeedbackForActivationSuccess();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof PerformHapticFeedbackForActivationSuccess);
            }

            public final int hashCode() {
                return 2045690951;
            }

            public final String toString() {
                return "PerformHapticFeedbackForActivationSuccess";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferActivationError;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Text f6345a;

            public ShowOfferActivationError(Text text) {
                this.f6345a = text;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationError) && Intrinsics.c(this.f6345a, ((ShowOfferActivationError) obj).f6345a);
            }

            public final int hashCode() {
                return this.f6345a.hashCode();
            }

            public final String toString() {
                return au.com.woolworths.android.onesite.a.h("ShowOfferActivationError(message=", this.f6345a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferActivationMessage;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferActivationMessage extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final OfferActivationMessage f6346a;

            public ShowOfferActivationMessage(OfferActivationMessage message) {
                Intrinsics.h(message, "message");
                this.f6346a = message;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferActivationMessage) && Intrinsics.c(this.f6346a, ((ShowOfferActivationMessage) obj).f6346a);
            }

            public final int hashCode() {
                return this.f6346a.hashCode();
            }

            public final String toString() {
                return "ShowOfferActivationMessage(message=" + this.f6346a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferDetailsScreen;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferDetailsScreen extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6347a;

            public ShowOfferDetailsScreen(String offerId) {
                Intrinsics.h(offerId, "offerId");
                this.f6347a = offerId;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferDetailsScreen) && Intrinsics.c(this.f6347a, ((ShowOfferDetailsScreen) obj).f6347a);
            }

            public final int hashCode() {
                return this.f6347a.hashCode();
            }

            public final String toString() {
                return YU.a.h("ShowOfferDetailsScreen(offerId=", this.f6347a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions$ShowOfferListRefreshFailedError;", "Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowOfferListRefreshFailedError extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final int f6348a;

            public ShowOfferListRefreshFailedError(int i) {
                this.f6348a = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowOfferListRefreshFailedError) && this.f6348a == ((ShowOfferListRefreshFailedError) obj).f6348a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f6348a);
            }

            public final String toString() {
                return YU.a.e(this.f6348a, "ShowOfferListRefreshFailedError(message=", ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/home/RewardsOffersHomeContract$ViewState;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6349a;
        public final RewardsOfferListFullPageErrorState b;
        public final RewardsErrorDialog c;
        public final List d;
        public final RewardsOffersMessage e;
        public final RewardsOffersHeader f;
        public final boolean g;
        public final Region h;
        public final List i;
        public final boolean j;
        public final boolean k;
        public final Object l;

        public ViewState(boolean z, RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState, RewardsErrorDialog rewardsErrorDialog, List list, RewardsOffersMessage rewardsOffersMessage, RewardsOffersHeader rewardsOffersHeader, boolean z2, Region region, List dismissedBannerIds, boolean z3, boolean z4) {
            Intrinsics.h(dismissedBannerIds, "dismissedBannerIds");
            this.f6349a = z;
            this.b = rewardsOfferListFullPageErrorState;
            this.c = rewardsErrorDialog;
            this.d = list;
            this.e = rewardsOffersMessage;
            this.f = rewardsOffersHeader;
            this.g = z2;
            this.h = region;
            this.i = dismissedBannerIds;
            this.j = z3;
            this.k = z4;
            this.l = list != null ? SectionViewItemExtKt.d(SectionViewItemExtKt.b(list)) : null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v19, types: [java.util.List] */
        public static ViewState a(ViewState viewState, boolean z, RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState, RewardsErrorDialog rewardsErrorDialog, ArrayList arrayList, RewardsOffersMessage rewardsOffersMessage, RewardsOffersHeader rewardsOffersHeader, boolean z2, Region region, List list, boolean z3, boolean z4, int i) {
            if ((i & 1) != 0) {
                z = viewState.f6349a;
            }
            boolean z5 = z;
            viewState.getClass();
            if ((i & 4) != 0) {
                rewardsOfferListFullPageErrorState = viewState.b;
            }
            RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState2 = rewardsOfferListFullPageErrorState;
            if ((i & 8) != 0) {
                rewardsErrorDialog = viewState.c;
            }
            RewardsErrorDialog rewardsErrorDialog2 = rewardsErrorDialog;
            ArrayList arrayList2 = (i & 16) != 0 ? viewState.d : arrayList;
            RewardsOffersMessage rewardsOffersMessage2 = (i & 32) != 0 ? viewState.e : rewardsOffersMessage;
            RewardsOffersHeader rewardsOffersHeader2 = (i & 64) != 0 ? viewState.f : rewardsOffersHeader;
            boolean z6 = (i & 128) != 0 ? viewState.g : z2;
            Region region2 = (i & 256) != 0 ? viewState.h : region;
            List dismissedBannerIds = (i & 512) != 0 ? viewState.i : list;
            boolean z7 = (i & 1024) != 0 ? viewState.j : z3;
            boolean z8 = (i & 2048) != 0 ? viewState.k : z4;
            viewState.getClass();
            Intrinsics.h(dismissedBannerIds, "dismissedBannerIds");
            return new ViewState(z5, rewardsOfferListFullPageErrorState2, rewardsErrorDialog2, arrayList2, rewardsOffersMessage2, rewardsOffersHeader2, z6, region2, dismissedBannerIds, z7, z8);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6349a == viewState.f6349a && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && this.g == viewState.g && this.h == viewState.h && Intrinsics.c(this.i, viewState.i) && this.j == viewState.j && this.k == viewState.k;
        }

        public final int hashCode() {
            int iE = androidx.camera.core.impl.b.e(Boolean.hashCode(this.f6349a) * 31, 31, false);
            RewardsOfferListFullPageErrorState rewardsOfferListFullPageErrorState = this.b;
            int iHashCode = (iE + (rewardsOfferListFullPageErrorState == null ? 0 : rewardsOfferListFullPageErrorState.hashCode())) * 31;
            RewardsErrorDialog rewardsErrorDialog = this.c;
            int iHashCode2 = (iHashCode + (rewardsErrorDialog == null ? 0 : rewardsErrorDialog.hashCode())) * 31;
            List list = this.d;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            RewardsOffersMessage rewardsOffersMessage = this.e;
            int iHashCode4 = (iHashCode3 + (rewardsOffersMessage == null ? 0 : rewardsOffersMessage.hashCode())) * 31;
            RewardsOffersHeader rewardsOffersHeader = this.f;
            return Boolean.hashCode(this.k) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.d((this.h.hashCode() + androidx.camera.core.impl.b.e((iHashCode4 + (rewardsOffersHeader != null ? rewardsOffersHeader.hashCode() : 0)) * 31, 31, this.g)) * 31, 31, this.i), 31, this.j);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(isLoading=");
            sb.append(this.f6349a);
            sb.append(", isRefreshing=false, errorState=");
            sb.append(this.b);
            sb.append(", errorDialog=");
            sb.append(this.c);
            sb.append(", sections=");
            sb.append(this.d);
            sb.append(", offersMessage=");
            sb.append(this.e);
            sb.append(", header=");
            sb.append(this.f);
            sb.append(", showKonfettiView=");
            sb.append(this.g);
            sb.append(", supportedRegion=");
            sb.append(this.h);
            sb.append(", dismissedBannerIds=");
            sb.append(this.i);
            sb.append(", showHomeOffersSection=");
            sb.append(this.j);
            sb.append(", showTigerNewOffers=");
            return YU.a.k(")", sb, this.k);
        }
    }
}
