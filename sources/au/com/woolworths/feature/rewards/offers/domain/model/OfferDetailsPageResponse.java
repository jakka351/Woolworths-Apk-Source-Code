package au.com.woolworths.feature.rewards.offers.domain.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsFooter;
import au.com.woolworths.foundation.rewards.offers.model.OfferDetailsHeader;
import au.com.woolworths.rewards.base.data.IconAsset;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse;", "", "OfferDetailsPage", "RewardsErrorEmptyState", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse$OfferDetailsPage;", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse$RewardsErrorEmptyState;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OfferDetailsPageResponse {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse$OfferDetailsPage;", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsPage implements OfferDetailsPageResponse {

        /* renamed from: a, reason: collision with root package name */
        public final OfferDetailsHeader f6337a;
        public final List b;
        public final OfferDetailsFooter c;
        public final RewardsOfferAnalyticsData d;

        public OfferDetailsPage(OfferDetailsHeader header, List list, OfferDetailsFooter offerDetailsFooter, RewardsOfferAnalyticsData offerAnalytics) {
            Intrinsics.h(header, "header");
            Intrinsics.h(offerAnalytics, "offerAnalytics");
            this.f6337a = header;
            this.b = list;
            this.c = offerDetailsFooter;
            this.d = offerAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailsPage)) {
                return false;
            }
            OfferDetailsPage offerDetailsPage = (OfferDetailsPage) obj;
            return Intrinsics.c(this.f6337a, offerDetailsPage.f6337a) && Intrinsics.c(this.b, offerDetailsPage.b) && Intrinsics.c(this.c, offerDetailsPage.c) && Intrinsics.c(this.d, offerDetailsPage.d);
        }

        public final int hashCode() {
            int iD = b.d(this.f6337a.hashCode() * 31, 31, this.b);
            OfferDetailsFooter offerDetailsFooter = this.c;
            return this.d.hashCode() + ((iD + (offerDetailsFooter == null ? 0 : offerDetailsFooter.hashCode())) * 31);
        }

        public final String toString() {
            return "OfferDetailsPage(header=" + this.f6337a + ", content=" + this.b + ", footer=" + this.c + ", offerAnalytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse$RewardsErrorEmptyState;", "Lau/com/woolworths/feature/rewards/offers/domain/model/OfferDetailsPageResponse;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsErrorEmptyState implements OfferDetailsPageResponse {

        /* renamed from: a, reason: collision with root package name */
        public final IconAsset f6338a;
        public final String b;
        public final String c;
        public final ContentCta d;

        public RewardsErrorEmptyState(IconAsset iconAsset, String str, String str2, ContentCta contentCta) {
            this.f6338a = iconAsset;
            this.b = str;
            this.c = str2;
            this.d = contentCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsErrorEmptyState)) {
                return false;
            }
            RewardsErrorEmptyState rewardsErrorEmptyState = (RewardsErrorEmptyState) obj;
            return Intrinsics.c(this.f6338a, rewardsErrorEmptyState.f6338a) && Intrinsics.c(this.b, rewardsErrorEmptyState.b) && Intrinsics.c(this.c, rewardsErrorEmptyState.c) && Intrinsics.c(this.d, rewardsErrorEmptyState.d);
        }

        public final int hashCode() {
            IconAsset iconAsset = this.f6338a;
            int iHashCode = (iconAsset == null ? 0 : iconAsset.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ContentCta contentCta = this.d;
            return iHashCode3 + (contentCta != null ? contentCta.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsErrorEmptyState(emptyStateIconAsset=" + this.f6338a + ", emptyStateTitle=" + this.b + ", emptyStateMessage=" + this.c + ", emptyStateAction=" + this.d + ")";
        }
    }
}
