package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.offers.OfferActivationScreen;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationResult;", "", "Offer", "Section", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ActivationResult {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult;", "Success", "Error", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer$Error;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer$Success;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Offer extends ActivationResult {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferData f6267a;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer$Error;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends Offer {
            public final RewardsOfferData b;
            public final RewardsOfferFeed c;
            public final Exception d;
            public final String e;
            public final OfferActivationScreen f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(RewardsOfferData offer, RewardsOfferFeed rewardsOfferFeed, Exception exc, String str, OfferActivationScreen screen, int i) {
                super(offer);
                str = (i & 8) != 0 ? null : str;
                Intrinsics.h(offer, "offer");
                Intrinsics.h(screen, "screen");
                this.b = offer;
                this.c = rewardsOfferFeed;
                this.d = exc;
                this.e = str;
                this.f = screen;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult
            public final boolean a() {
                return false;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult.Offer
            /* renamed from: b, reason: from getter */
            public final RewardsOfferData getF6267a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.c(this.b, error.b) && Intrinsics.c(this.c, error.c) && this.d.equals(error.d) && Intrinsics.c(this.e, error.e) && Intrinsics.c(this.f, error.f);
            }

            public final int hashCode() {
                int iHashCode = this.b.hashCode() * 31;
                RewardsOfferFeed rewardsOfferFeed = this.c;
                int iHashCode2 = (this.d.hashCode() + ((iHashCode + (rewardsOfferFeed == null ? 0 : rewardsOfferFeed.hashCode())) * 31)) * 31;
                String str = this.e;
                return Boolean.hashCode(false) + ((this.f.hashCode() + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31);
            }

            public final String toString() {
                return "Error(offer=" + this.b + ", offerFeed=" + this.c + ", error=" + this.d + ", errorMessage=" + this.e + ", screen=" + this.f + ", isSuccessful=false)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer$Success;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Offer;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success extends Offer {
            public final RewardsOfferData b;
            public final RewardsOfferFeed c;
            public final OfferActivationScreen d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(RewardsOfferData rewardsOfferData, RewardsOfferFeed rewardsOfferFeed, OfferActivationScreen screen) {
                super(rewardsOfferData);
                Intrinsics.h(screen, "screen");
                this.b = rewardsOfferData;
                this.c = rewardsOfferFeed;
                this.d = screen;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult
            public final boolean a() {
                return true;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult.Offer
            /* renamed from: b, reason: from getter */
            public final RewardsOfferData getF6267a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.b.equals(success.b) && this.c.equals(success.c) && Intrinsics.c(this.d, success.d);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Success(offer=" + this.b + ", offerFeed=" + this.c + ", screen=" + this.d + ", isSuccessful=true)";
            }
        }

        public Offer(RewardsOfferData rewardsOfferData) {
            this.f6267a = rewardsOfferData;
        }

        /* renamed from: b, reason: from getter */
        public RewardsOfferData getF6267a() {
            return this.f6267a;
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult;", "Success", "Error", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section$Error;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section$Success;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Section extends ActivationResult {

        /* renamed from: a, reason: collision with root package name */
        public final OffersSections f6268a;

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section$Error;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Error extends Section {
            public final OffersSections b;
            public final RewardsOfferFeed c;
            public final Exception d;
            public final String e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(OffersSections section, RewardsOfferFeed rewardsOfferFeed, Exception exc, String str, int i) {
                super(section);
                str = (i & 8) != 0 ? null : str;
                Intrinsics.h(section, "section");
                this.b = section;
                this.c = rewardsOfferFeed;
                this.d = exc;
                this.e = str;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult
            public final boolean a() {
                return false;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult.Section
            /* renamed from: b, reason: from getter */
            public final OffersSections getF6268a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Error)) {
                    return false;
                }
                Error error = (Error) obj;
                return Intrinsics.c(this.b, error.b) && Intrinsics.c(this.c, error.c) && this.d.equals(error.d) && Intrinsics.c(this.e, error.e);
            }

            public final int hashCode() {
                int iHashCode = this.b.hashCode() * 31;
                RewardsOfferFeed rewardsOfferFeed = this.c;
                int iHashCode2 = (this.d.hashCode() + ((iHashCode + (rewardsOfferFeed == null ? 0 : rewardsOfferFeed.hashCode())) * 31)) * 31;
                String str = this.e;
                return Boolean.hashCode(false) + ((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31);
            }

            public final String toString() {
                return "Error(section=" + this.b + ", offerFeed=" + this.c + ", error=" + this.d + ", errorMessage=" + this.e + ", isSuccessful=false)";
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section$Success;", "Lau/com/woolworths/feature/rewards/offers/data/ActivationResult$Section;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Success extends Section {
            public final OffersSections b;
            public final RewardsOfferFeed c;
            public final OfferActivationScreen d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(OffersSections offersSections, RewardsOfferFeed rewardsOfferFeed, OfferActivationScreen screen) {
                super(offersSections);
                Intrinsics.h(screen, "screen");
                this.b = offersSections;
                this.c = rewardsOfferFeed;
                this.d = screen;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult
            public final boolean a() {
                return true;
            }

            @Override // au.com.woolworths.feature.rewards.offers.data.ActivationResult.Section
            /* renamed from: b, reason: from getter */
            public final OffersSections getF6268a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Success)) {
                    return false;
                }
                Success success = (Success) obj;
                return this.b.equals(success.b) && this.c.equals(success.c) && Intrinsics.c(this.d, success.d);
            }

            public final int hashCode() {
                return Boolean.hashCode(true) + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "Success(section=" + this.b + ", offerFeed=" + this.c + ", screen=" + this.d + ", isSuccessful=true)";
            }
        }

        public Section(OffersSections offersSections) {
            this.f6268a = offersSections;
        }

        /* renamed from: b, reason: from getter */
        public OffersSections getF6268a() {
            return this.f6268a;
        }
    }

    public abstract boolean a();
}
