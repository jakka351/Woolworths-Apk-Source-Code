package au.com.woolworths.feature.shop.catalogue.listing.promotion;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.catalogue.listing.promotion.model.ListingHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract;", "", "Action", "ViewState", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PromotionListingContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract$Action;", "", "LaunchDeepLink", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract$Action$LaunchDeepLink;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Action {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract$Action$LaunchDeepLink;", "Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract$Action;", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchDeepLink extends Action {

            /* renamed from: a, reason: collision with root package name */
            public final String f6882a;

            public LaunchDeepLink(String deepLink) {
                Intrinsics.h(deepLink, "deepLink");
                this.f6882a = deepLink;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchDeepLink) && Intrinsics.c(this.f6882a, ((LaunchDeepLink) obj).f6882a);
            }

            public final int hashCode() {
                return this.f6882a.hashCode();
            }

            public final String toString() {
                return YU.a.h("LaunchDeepLink(deepLink=", this.f6882a, ")");
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/PromotionListingContract$ViewState;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6883a;
        public final Integer b;
        public final ListingHeader c;
        public final Flow d;

        public ViewState(boolean z, Integer num, ListingHeader listingHeader, Flow flow) {
            this.f6883a = z;
            this.b = num;
            this.c = listingHeader;
            this.d = flow;
        }

        public static ViewState a(ViewState viewState, Integer num, ListingHeader listingHeader, Flow flow, int i) {
            boolean z = viewState.f6883a;
            if ((i & 2) != 0) {
                num = viewState.b;
            }
            if ((i & 4) != 0) {
                listingHeader = viewState.c;
            }
            if ((i & 8) != 0) {
                flow = viewState.d;
            }
            viewState.getClass();
            return new ViewState(z, num, listingHeader, flow);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f6883a == viewState.f6883a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c) && Intrinsics.c(this.d, viewState.d);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6883a) * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            ListingHeader listingHeader = this.c;
            int iHashCode3 = (iHashCode2 + (listingHeader == null ? 0 : listingHeader.hashCode())) * 31;
            Flow flow = this.d;
            return iHashCode3 + (flow != null ? flow.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(showCart=" + this.f6883a + ", cartItemCount=" + this.b + ", header=" + this.c + ", items=" + this.d + ")";
        }
    }
}
