package au.com.woolworths.feature.rewards.offers.detail;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;

@Deprecated
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsParamsLegacy;", "", "OfferIdOnly", "OfferIdWithOfferType", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsParamsLegacy$OfferIdOnly;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsParamsLegacy$OfferIdWithOfferType;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OfferDetailsParamsLegacy {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsParamsLegacy$OfferIdOnly;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsParamsLegacy;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferIdOnly implements OfferDetailsParamsLegacy {

        /* renamed from: a, reason: collision with root package name */
        public final String f6310a;

        public OfferIdOnly(String str) {
            this.f6310a = str;
        }

        @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsParamsLegacy
        /* renamed from: a, reason: from getter */
        public final String getF6311a() {
            return this.f6310a;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsParamsLegacy$OfferIdWithOfferType;", "Lau/com/woolworths/feature/rewards/offers/detail/OfferDetailsParamsLegacy;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OfferIdWithOfferType implements OfferDetailsParamsLegacy {

        /* renamed from: a, reason: collision with root package name */
        public final String f6311a;
        public final String b;

        public OfferIdWithOfferType(String str, String str2) {
            this.f6311a = str;
            this.b = str2;
        }

        @Override // au.com.woolworths.feature.rewards.offers.detail.OfferDetailsParamsLegacy
        /* renamed from: a, reason: from getter */
        public final String getF6311a() {
            return this.f6311a;
        }
    }

    /* renamed from: a */
    String getF6311a();
}
