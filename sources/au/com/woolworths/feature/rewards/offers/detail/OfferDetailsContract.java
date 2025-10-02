package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.offers.domain.model.OfferDetailsPageResponse;
import au.com.woolworths.foundation.rewards.common.ui.errors.data.FullPageError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract;", "", "Action", "ViewState", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OfferDetailsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action;", "", "NavigateUp", "OpenUrl", "ShowBoostFailureSnackbar", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action$NavigateUp;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action$ShowBoostFailureSnackbar;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action$NavigateUp;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class NavigateUp extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final NavigateUp f6302a = new NavigateUp();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NavigateUp);
            }

            public final int hashCode() {
                return 1993809955;
            }

            public final String toString() {
                return "NavigateUp";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action$OpenUrl;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6303a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f6303a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f6303a, ((OpenUrl) obj).f6303a);
            }

            public final int hashCode() {
                return this.f6303a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f6303a, ")");
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action$ShowBoostFailureSnackbar;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$Action;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowBoostFailureSnackbar extends Action {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowBoostFailureSnackbar f6304a = new ShowBoostFailureSnackbar();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof ShowBoostFailureSnackbar);
            }

            public final int hashCode() {
                return -653493984;
            }

            public final String toString() {
                return "ShowBoostFailureSnackbar";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState;", "", "Content", "EmptyState", "Loading", "Error", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$EmptyState;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$Loading;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewState {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$Content;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f6305a;
            public final boolean b;
            public final OfferDetailsPageResponse.OfferDetailsPage c;
            public final boolean d;

            public Content(boolean z, boolean z2, OfferDetailsPageResponse.OfferDetailsPage offerPage, boolean z3) {
                Intrinsics.h(offerPage, "offerPage");
                this.f6305a = z;
                this.b = z2;
                this.c = offerPage;
                this.d = z3;
            }

            public static Content c(Content content, boolean z, OfferDetailsPageResponse.OfferDetailsPage offerPage, boolean z2, int i) {
                boolean z3 = (i & 1) != 0 ? content.f6305a : false;
                if ((i & 2) != 0) {
                    z = content.b;
                }
                if ((i & 4) != 0) {
                    offerPage = content.c;
                }
                if ((i & 8) != 0) {
                    z2 = content.d;
                }
                Intrinsics.h(offerPage, "offerPage");
                return new Content(z3, z, offerPage, z2);
            }

            @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract.ViewState
            public final int a() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return this.f6305a == content.f6305a && this.b == content.b && Intrinsics.c(this.c, content.c) && this.d == content.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + ((this.c.hashCode() + androidx.camera.core.impl.b.e(Boolean.hashCode(this.f6305a) * 31, 31, this.b)) * 31);
            }

            public final String toString() {
                StringBuilder sbV = androidx.camera.core.impl.b.v("Content(showKonfettiView=", ", isBoosting=", ", offerPage=", this.f6305a, this.b);
                sbV.append(this.c);
                sbV.append(", displayRoundel=");
                sbV.append(this.d);
                sbV.append(")");
                return sbV.toString();
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$EmptyState;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class EmptyState implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final OfferDetailsPageResponse.RewardsErrorEmptyState f6306a;

            public EmptyState(OfferDetailsPageResponse.RewardsErrorEmptyState rewardsErrorEmptyState) {
                this.f6306a = rewardsErrorEmptyState;
            }

            @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract.ViewState
            public final int a() {
                return 1;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EmptyState) && Intrinsics.c(this.f6306a, ((EmptyState) obj).f6306a);
            }

            public final int hashCode() {
                return this.f6306a.hashCode();
            }

            public final String toString() {
                return "EmptyState(emptyState=" + this.f6306a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$Error;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageError f6307a;

            public Error(FullPageError fullPageError) {
                this.f6307a = fullPageError;
            }

            @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract.ViewState
            public final int a() {
                return 3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.c(this.f6307a, ((Error) obj).f6307a);
            }

            public final int hashCode() {
                return this.f6307a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.f6307a + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState$Loading;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsContract$ViewState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewState {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6308a = new Loading();

            @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsContract.ViewState
            public final int a() {
                return 2;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -1576345735;
            }

            public final String toString() {
                return "Loading";
            }
        }

        int a();

        default Content b() {
            if (this instanceof Content) {
                return (Content) this;
            }
            return null;
        }
    }
}
