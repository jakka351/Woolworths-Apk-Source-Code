package au.com.woolworths.shop.rewards.promo;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.foundation.ui.fullpagemessage.FullPageMessage;
import au.com.woolworths.rewards.modal.RewardsAppModalData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/rewards/promo/PromoRewardsAppContract;", "", "ViewState", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PromoRewardsAppContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/promo/PromoRewardsAppContract$ViewState;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12913a;
        public final FullPageMessage.Error b;
        public final RewardsAppModalData c;

        static {
            RewardsAppModalData.Companion companion = RewardsAppModalData.INSTANCE;
        }

        public ViewState(boolean z, FullPageMessage.Error error, RewardsAppModalData rewardsAppModalData) {
            this.f12913a = z;
            this.b = error;
            this.c = rewardsAppModalData;
        }

        public static ViewState a(ViewState viewState, boolean z, FullPageMessage.Error error, RewardsAppModalData rewardsAppModalData, int i) {
            if ((i & 1) != 0) {
                z = viewState.f12913a;
            }
            if ((i & 2) != 0) {
                error = viewState.b;
            }
            if ((i & 4) != 0) {
                rewardsAppModalData = viewState.c;
            }
            viewState.getClass();
            return new ViewState(z, error, rewardsAppModalData);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12913a == viewState.f12913a && Intrinsics.c(this.b, viewState.b) && Intrinsics.c(this.c, viewState.c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f12913a) * 31;
            FullPageMessage.Error error = this.b;
            int iHashCode2 = (iHashCode + (error == null ? 0 : error.hashCode())) * 31;
            RewardsAppModalData rewardsAppModalData = this.c;
            return iHashCode2 + (rewardsAppModalData != null ? rewardsAppModalData.hashCode() : 0);
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f12913a + ", fullPageError=" + this.b + ", rewardsAppModal=" + this.c + ")";
        }
    }
}
