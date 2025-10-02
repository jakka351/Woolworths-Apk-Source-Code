package au.com.woolworths.feature.rewards.offers.listpage;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.rewards.offers.data.RewardsOfferListPageFooter;
import au.com.woolworths.foundation.rewards.model.RewardsEmptyState;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract;", "", "ViewState", "ViewStateUi", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OffersListPageContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewState;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final String f6359a;
        public final OfferListPageType b;
        public final List c;
        public final RewardsEmptyState d;
        public final String e;
        public final RewardsOfferListPageFooter f;
        public final FullPageMessage.Error g;
        public final boolean h;
        public final RewardsOfferData i;
        public final Text j;
        public final List k;
        public final boolean l;

        public ViewState(String pageName, OfferListPageType offerListPageType, List list, RewardsEmptyState rewardsEmptyState, String str, RewardsOfferListPageFooter rewardsOfferListPageFooter, FullPageMessage.Error error, boolean z, RewardsOfferData rewardsOfferData, Text text, List dismissedBannerIds, boolean z2) {
            Intrinsics.h(pageName, "pageName");
            Intrinsics.h(dismissedBannerIds, "dismissedBannerIds");
            this.f6359a = pageName;
            this.b = offerListPageType;
            this.c = list;
            this.d = rewardsEmptyState;
            this.e = str;
            this.f = rewardsOfferListPageFooter;
            this.g = error;
            this.h = z;
            this.i = rewardsOfferData;
            this.j = text;
            this.k = dismissedBannerIds;
            this.l = z2;
        }

        public static ViewState a(ViewState viewState, List list, RewardsEmptyState rewardsEmptyState, String str, RewardsOfferListPageFooter rewardsOfferListPageFooter, FullPageMessage.Error error, boolean z, RewardsOfferData rewardsOfferData, Text text, List list2, boolean z2, int i) {
            String pageName = viewState.f6359a;
            OfferListPageType offerListPageType = viewState.b;
            if ((i & 4) != 0) {
                list = viewState.c;
            }
            List list3 = list;
            RewardsEmptyState rewardsEmptyState2 = (i & 8) != 0 ? viewState.d : rewardsEmptyState;
            String str2 = (i & 16) != 0 ? viewState.e : str;
            RewardsOfferListPageFooter rewardsOfferListPageFooter2 = (i & 32) != 0 ? viewState.f : rewardsOfferListPageFooter;
            FullPageMessage.Error error2 = (i & 64) != 0 ? viewState.g : error;
            boolean z3 = (i & 128) != 0 ? viewState.h : z;
            RewardsOfferData rewardsOfferData2 = (i & 256) != 0 ? viewState.i : rewardsOfferData;
            Text text2 = (i & 512) != 0 ? viewState.j : text;
            List dismissedBannerIds = (i & 1024) != 0 ? viewState.k : list2;
            boolean z4 = (i & 2048) != 0 ? viewState.l : z2;
            viewState.getClass();
            Intrinsics.h(pageName, "pageName");
            Intrinsics.h(dismissedBannerIds, "dismissedBannerIds");
            return new ViewState(pageName, offerListPageType, list3, rewardsEmptyState2, str2, rewardsOfferListPageFooter2, error2, z3, rewardsOfferData2, text2, dismissedBannerIds, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f6359a, viewState.f6359a) && this.b == viewState.b && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d) && Intrinsics.c(this.e, viewState.e) && Intrinsics.c(this.f, viewState.f) && Intrinsics.c(this.g, viewState.g) && this.h == viewState.h && Intrinsics.c(this.i, viewState.i) && Intrinsics.c(this.j, viewState.j) && Intrinsics.c(this.k, viewState.k) && this.l == viewState.l;
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f6359a.hashCode() * 31)) * 31;
            List list = this.c;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            RewardsEmptyState rewardsEmptyState = this.d;
            int iHashCode3 = (iHashCode2 + (rewardsEmptyState == null ? 0 : rewardsEmptyState.hashCode())) * 31;
            String str = this.e;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            RewardsOfferListPageFooter rewardsOfferListPageFooter = this.f;
            int iHashCode5 = (iHashCode4 + (rewardsOfferListPageFooter == null ? 0 : rewardsOfferListPageFooter.hashCode())) * 31;
            FullPageMessage.Error error = this.g;
            int iE = androidx.camera.core.impl.b.e((iHashCode5 + (error == null ? 0 : error.hashCode())) * 31, 31, this.h);
            RewardsOfferData rewardsOfferData = this.i;
            int iHashCode6 = (iE + (rewardsOfferData == null ? 0 : rewardsOfferData.hashCode())) * 31;
            Text text = this.j;
            return Boolean.hashCode(this.l) + androidx.camera.core.impl.b.d((iHashCode6 + (text != null ? text.hashCode() : 0)) * 31, 31, this.k);
        }

        public final String toString() {
            return "ViewState(pageName=" + this.f6359a + ", pageType=" + this.b + ", data=" + this.c + ", emptyState=" + this.d + ", navigationTitle=" + this.e + ", footer=" + this.f + ", error=" + this.g + ", isLoading=" + this.h + ", offerActivated=" + this.i + ", snackBarMessage=" + this.j + ", dismissedBannerIds=" + this.k + ", displayRoundel=" + this.l + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi;", "", "Loading", "Empty", "Error", "Content", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Content;", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Empty;", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Error;", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Loading;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface ViewStateUi {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Content;", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Content implements ViewStateUi {

            /* renamed from: a, reason: collision with root package name */
            public final OfferListPageType f6360a;
            public final List b;
            public final String c;
            public final RewardsOfferListPageFooter d;

            public Content(OfferListPageType offerListPageType, List data, String str, RewardsOfferListPageFooter rewardsOfferListPageFooter) {
                Intrinsics.h(data, "data");
                this.f6360a = offerListPageType;
                this.b = data;
                this.c = str;
                this.d = rewardsOfferListPageFooter;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return false;
                }
                Content content = (Content) obj;
                return this.f6360a == content.f6360a && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d);
            }

            public final int hashCode() {
                int iD = androidx.camera.core.impl.b.d(this.f6360a.hashCode() * 31, 31, this.b);
                String str = this.c;
                int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
                RewardsOfferListPageFooter rewardsOfferListPageFooter = this.d;
                return iHashCode + (rewardsOfferListPageFooter != null ? rewardsOfferListPageFooter.hashCode() : 0);
            }

            public final String toString() {
                return "Content(pageType=" + this.f6360a + ", data=" + this.b + ", navigationTitle=" + this.c + ", footer=" + this.d + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Empty;", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Empty implements ViewStateUi {

            /* renamed from: a, reason: collision with root package name */
            public final String f6361a;
            public final RewardsEmptyState b;

            public Empty(String str, RewardsEmptyState emptyState) {
                Intrinsics.h(emptyState, "emptyState");
                this.f6361a = str;
                this.b = emptyState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Empty)) {
                    return false;
                }
                Empty empty = (Empty) obj;
                return Intrinsics.c(this.f6361a, empty.f6361a) && Intrinsics.c(this.b, empty.b);
            }

            public final int hashCode() {
                String str = this.f6361a;
                return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
            }

            public final String toString() {
                return "Empty(navigationTitle=" + this.f6361a + ", emptyState=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Error;", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error implements ViewStateUi {

            /* renamed from: a, reason: collision with root package name */
            public final FullPageMessage.Error f6362a;
            public final OfferListPageType b;

            public Error(FullPageMessage.Error error, OfferListPageType offerListPageType) {
                Intrinsics.h(error, "error");
                this.f6362a = error;
                this.b = offerListPageType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.c(this.f6362a, error.f6362a) && this.b == error.b;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.f6362a.hashCode() * 31);
            }

            public final String toString() {
                return "Error(error=" + this.f6362a + ", pageType=" + this.b + ")";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi$Loading;", "Lau/com/woolworths/feature/rewards/offers/listpage/OffersListPageContract$ViewStateUi;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Loading implements ViewStateUi {

            /* renamed from: a, reason: collision with root package name */
            public static final Loading f6363a = new Loading();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Loading);
            }

            public final int hashCode() {
                return -404520817;
            }

            public final String toString() {
                return "Loading";
            }
        }

        default String a() {
            return getClass().getSimpleName();
        }
    }
}
