package au.com.woolworths.feature.rewards.offers.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.foundation.rewards.model.RewardsEmptyState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage;", "", "OfferList", "Empty", "Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage$Empty;", "Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage$OfferList;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface RewardsOfferListPage {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage$Empty;", "Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Empty implements RewardsOfferListPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f6289a;
        public final RewardsEmptyState b;

        public Empty(String str, RewardsEmptyState rewardsEmptyState) {
            this.f6289a = str;
            this.b = rewardsEmptyState;
        }

        @Override // au.com.woolworths.feature.rewards.offers.data.RewardsOfferListPage
        /* renamed from: a, reason: from getter */
        public final String getF6290a() {
            return this.f6289a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) obj;
            return Intrinsics.c(this.f6289a, empty.f6289a) && Intrinsics.c(this.b, empty.b);
        }

        public final int hashCode() {
            String str = this.f6289a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "Empty(navigationTitle=" + this.f6289a + ", state=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage$OfferList;", "Lau/com/woolworths/feature/rewards/offers/data/RewardsOfferListPage;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferList implements RewardsOfferListPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f6290a;
        public final ArrayList b;
        public final RewardsOfferListPageFooter c;

        public OfferList(String str, ArrayList arrayList, RewardsOfferListPageFooter rewardsOfferListPageFooter) {
            this.f6290a = str;
            this.b = arrayList;
            this.c = rewardsOfferListPageFooter;
        }

        @Override // au.com.woolworths.feature.rewards.offers.data.RewardsOfferListPage
        /* renamed from: a, reason: from getter */
        public final String getF6290a() {
            return this.f6290a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferList)) {
                return false;
            }
            OfferList offerList = (OfferList) obj;
            return Intrinsics.c(this.f6290a, offerList.f6290a) && this.b.equals(offerList.b) && Intrinsics.c(this.c, offerList.c);
        }

        public final int hashCode() {
            String str = this.f6290a;
            int iB = a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            RewardsOfferListPageFooter rewardsOfferListPageFooter = this.c;
            return iB + (rewardsOfferListPageFooter != null ? rewardsOfferListPageFooter.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbX = d.x("OfferList(navigationTitle=", this.f6290a, ", sections=", ", footer=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    /* renamed from: a */
    String getF6290a();
}
