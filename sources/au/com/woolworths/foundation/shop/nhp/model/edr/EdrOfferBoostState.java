package au.com.woolworths.foundation.shop.nhp.model.edr;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.analytics.model.AnalyticsData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState;", "", "Idle", "Boosting", "Success", "Failed", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Boosting;", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Failed;", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Idle;", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Success;", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface EdrOfferBoostState {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Boosting;", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState;", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Boosting implements EdrOfferBoostState {

        /* renamed from: a, reason: collision with root package name */
        public static final Boosting f8780a = new Boosting();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Boosting);
        }

        public final int hashCode() {
            return 1538415892;
        }

        public final String toString() {
            return "Boosting";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Failed;", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState;", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Failed implements EdrOfferBoostState {

        /* renamed from: a, reason: collision with root package name */
        public final String f8781a;
        public final String b;
        public final AnalyticsData c;
        public final AnalyticsData d;

        public Failed(String str, String str2, AnalyticsData analyticsData, AnalyticsData analyticsData2) {
            this.f8781a = str;
            this.b = str2;
            this.c = analyticsData;
            this.d = analyticsData2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Failed)) {
                return false;
            }
            Failed failed = (Failed) obj;
            return Intrinsics.c(this.f8781a, failed.f8781a) && Intrinsics.c(this.b, failed.b) && Intrinsics.c(this.c, failed.c) && Intrinsics.c(this.d, failed.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f8781a.hashCode() * 31, 31, this.b);
            AnalyticsData analyticsData = this.c;
            int iHashCode = (iC + (analyticsData == null ? 0 : analyticsData.hashCode())) * 31;
            AnalyticsData analyticsData2 = this.d;
            return iHashCode + (analyticsData2 != null ? analyticsData2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Failed(message=", this.f8781a, ", eventSource=", this.b, ", impressionAnalytics=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Idle;", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState;", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Idle implements EdrOfferBoostState {

        /* renamed from: a, reason: collision with root package name */
        public static final Idle f8782a = new Idle();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Idle);
        }

        public final int hashCode() {
            return -1279913463;
        }

        public final String toString() {
            return "Idle";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState$Success;", "Lau/com/woolworths/foundation/shop/nhp/model/edr/EdrOfferBoostState;", "nhp-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Success implements EdrOfferBoostState {

        /* renamed from: a, reason: collision with root package name */
        public final String f8783a;
        public final RtlOfferBoostState b;
        public final RtlOfferStatus c;
        public final AnalyticsData d;

        public Success(String offerId, RtlOfferBoostState rtlOfferBoostState, RtlOfferStatus rtlOfferStatus, AnalyticsData analyticsData) {
            Intrinsics.h(offerId, "offerId");
            this.f8783a = offerId;
            this.b = rtlOfferBoostState;
            this.c = rtlOfferStatus;
            this.d = analyticsData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Success)) {
                return false;
            }
            Success success = (Success) obj;
            return Intrinsics.c(this.f8783a, success.f8783a) && this.b == success.b && this.c == success.c && Intrinsics.c(this.d, success.d);
        }

        public final int hashCode() {
            int iHashCode = this.f8783a.hashCode() * 31;
            RtlOfferBoostState rtlOfferBoostState = this.b;
            int iHashCode2 = (iHashCode + (rtlOfferBoostState == null ? 0 : rtlOfferBoostState.hashCode())) * 31;
            RtlOfferStatus rtlOfferStatus = this.c;
            int iHashCode3 = (iHashCode2 + (rtlOfferStatus == null ? 0 : rtlOfferStatus.hashCode())) * 31;
            AnalyticsData analyticsData = this.d;
            return iHashCode3 + (analyticsData != null ? analyticsData.hashCode() : 0);
        }

        public final String toString() {
            return "Success(offerId=" + this.f8783a + ", offerBoostState=" + this.b + ", offerStatus=" + this.c + ", analytics=" + this.d + ")";
        }
    }
}
