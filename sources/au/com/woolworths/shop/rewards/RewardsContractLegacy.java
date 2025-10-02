package au.com.woolworths.shop.rewards;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.Metadata;

@StabilityInferred
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/rewards/RewardsContractLegacy;", "", "ViewState", "Actions", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsContractLegacy {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/rewards/RewardsContractLegacy$Actions;", "", "ShowBoosters", "Lau/com/woolworths/shop/rewards/RewardsContractLegacy$Actions$ShowBoosters;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/RewardsContractLegacy$Actions$ShowBoosters;", "Lau/com/woolworths/shop/rewards/RewardsContractLegacy$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ShowBoosters extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final ShowBoosters f12887a = new ShowBoosters();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/RewardsContractLegacy$ViewState;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12888a;

        public ViewState(boolean z) {
            this.f12888a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewState) && this.f12888a == ((ViewState) obj).f12888a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12888a);
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.n("ViewState(isLoading=", ")", this.f12888a);
        }
    }
}
