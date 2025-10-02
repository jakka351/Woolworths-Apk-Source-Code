package au.com.woolworths.feature.rewards.offers;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract;", "", "Actions", "OfferFeedInlineBannerListener", "RewardsCtaCardListener", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsOfferBaseContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract$Actions;", "", "OpenUrl", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract$Actions$OpenUrl;", "Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract$Actions;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class OpenUrl extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final String f6237a;

            public OpenUrl(String url) {
                Intrinsics.h(url, "url");
                this.f6237a = url;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenUrl) && Intrinsics.c(this.f6237a, ((OpenUrl) obj).f6237a);
            }

            public final int hashCode() {
                return this.f6237a.hashCode();
            }

            public final String toString() {
                return YU.a.h("OpenUrl(url=", this.f6237a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract$OfferFeedInlineBannerListener;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferFeedInlineBannerListener {

        /* renamed from: a, reason: collision with root package name */
        public final Function1 f6238a;
        public final Function1 b;
        public final Function1 c;

        public OfferFeedInlineBannerListener(Function1 function1, Function1 function12, Function1 function13) {
            this.f6238a = function1;
            this.b = function12;
            this.c = function13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferFeedInlineBannerListener)) {
                return false;
            }
            OfferFeedInlineBannerListener offerFeedInlineBannerListener = (OfferFeedInlineBannerListener) obj;
            return Intrinsics.c(this.f6238a, offerFeedInlineBannerListener.f6238a) && Intrinsics.c(this.b, offerFeedInlineBannerListener.b) && Intrinsics.c(this.c, offerFeedInlineBannerListener.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f6238a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "OfferFeedInlineBannerListener(onDismiss=" + this.f6238a + ", onImpression=" + this.b + ", onClick=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/RewardsOfferBaseContract$RewardsCtaCardListener;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsCtaCardListener {

        /* renamed from: a, reason: collision with root package name */
        public final Function1 f6239a;

        public RewardsCtaCardListener(Function1 function1) {
            this.f6239a = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RewardsCtaCardListener) && Intrinsics.c(this.f6239a, ((RewardsCtaCardListener) obj).f6239a);
        }

        public final int hashCode() {
            return this.f6239a.hashCode();
        }

        public final String toString() {
            return "RewardsCtaCardListener(onClick=" + this.f6239a + ")";
        }
    }
}
