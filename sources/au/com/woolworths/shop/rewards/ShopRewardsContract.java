package au.com.woolworths.shop.rewards;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.rewards.tooltip.Tooltip;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/rewards/ShopRewardsContract;", "", "ViewState", "Actions", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ShopRewardsContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/rewards/ShopRewardsContract$Actions;", "", "ShowTooltip", "Lau/com/woolworths/shop/rewards/ShopRewardsContract$Actions$ShowTooltip;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/ShopRewardsContract$Actions$ShowTooltip;", "Lau/com/woolworths/shop/rewards/ShopRewardsContract$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class ShowTooltip extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final Tooltip.BalanceIndicator f12891a;

            public ShowTooltip(Tooltip.BalanceIndicator balanceIndicator) {
                this.f12891a = balanceIndicator;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowTooltip) && this.f12891a.equals(((ShowTooltip) obj).f12891a);
            }

            public final int hashCode() {
                return this.f12891a.d.hashCode();
            }

            public final String toString() {
                return "ShowTooltip(tooltip=" + this.f12891a + ")";
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/ShopRewardsContract$ViewState;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsPointsBalance f12892a;
        public final boolean b;
        public final boolean c;

        public ViewState(RewardsPointsBalance rewardsPointsBalance, boolean z, boolean z2) {
            this.f12892a = rewardsPointsBalance;
            this.b = z;
            this.c = z2;
        }

        public static ViewState a(ViewState viewState, RewardsPointsBalance rewardsPointsBalance, boolean z, int i) {
            if ((i & 1) != 0) {
                rewardsPointsBalance = viewState.f12892a;
            }
            boolean z2 = viewState.b;
            viewState.getClass();
            viewState.getClass();
            if ((i & 16) != 0) {
                z = viewState.c;
            }
            viewState.getClass();
            return new ViewState(rewardsPointsBalance, z2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f12892a, viewState.f12892a) && this.b == viewState.b && this.c == viewState.c;
        }

        public final int hashCode() {
            RewardsPointsBalance rewardsPointsBalance = this.f12892a;
            return Boolean.hashCode(this.c) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((rewardsPointsBalance == null ? 0 : rewardsPointsBalance.hashCode()) * 31, 961, this.b), 31, false);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(rewardsPointsBalance=");
            sb.append(this.f12892a);
            sb.append(", isRewardsPlus=");
            sb.append(this.b);
            sb.append(", message=null, isRefreshing=false, isUserRegionNz=");
            return YU.a.k(")", sb, this.c);
        }

        public /* synthetic */ ViewState(boolean z, int i) {
            this(null, (i & 2) != 0 ? false : z, false);
        }
    }
}
