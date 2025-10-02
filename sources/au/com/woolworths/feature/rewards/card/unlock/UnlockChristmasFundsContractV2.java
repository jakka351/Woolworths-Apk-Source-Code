package au.com.woolworths.feature.rewards.card.unlock;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlock;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContractV2;", "", "ViewState", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UnlockChristmasFundsContractV2 {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContractV2$ViewState;", "", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsRedemptionUnlockConfirmation f5841a;
        public final boolean b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        static {
            RewardsRedemptionUnlockConfirmation.Companion companion = RewardsRedemptionUnlockConfirmation.INSTANCE;
            RewardsRedemptionUnlock.Companion companion2 = RewardsRedemptionUnlock.INSTANCE;
        }

        public ViewState(RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation, boolean z, boolean z2, boolean z3, boolean z4) {
            this.f5841a = rewardsRedemptionUnlockConfirmation;
            this.b = z;
            this.c = z2;
            this.d = z3;
            this.e = z4;
        }

        public static ViewState a(ViewState viewState, RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation, boolean z, boolean z2, boolean z3, boolean z4, int i) {
            viewState.getClass();
            if ((i & 2) != 0) {
                rewardsRedemptionUnlockConfirmation = viewState.f5841a;
            }
            RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation2 = rewardsRedemptionUnlockConfirmation;
            if ((i & 4) != 0) {
                z = viewState.b;
            }
            boolean z5 = z;
            if ((i & 8) != 0) {
                z2 = viewState.c;
            }
            boolean z6 = z2;
            if ((i & 16) != 0) {
                z3 = viewState.d;
            }
            boolean z7 = z3;
            if ((i & 32) != 0) {
                z4 = viewState.e;
            }
            viewState.getClass();
            return new ViewState(rewardsRedemptionUnlockConfirmation2, z5, z6, z7, z4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return Intrinsics.c(this.f5841a, viewState.f5841a) && this.b == viewState.b && this.c == viewState.c && this.d == viewState.d && this.e == viewState.e;
        }

        public final int hashCode() {
            RewardsRedemptionUnlockConfirmation rewardsRedemptionUnlockConfirmation = this.f5841a;
            return Boolean.hashCode(this.e) + androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e(androidx.camera.core.impl.b.e((rewardsRedemptionUnlockConfirmation == null ? 0 : rewardsRedemptionUnlockConfirmation.hashCode()) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewState(rewardsRedemptionUnlock=null, rewardsRedemptionUnlockConfirmation=");
            sb.append(this.f5841a);
            sb.append(", showRedemptionBottomSheet=");
            sb.append(this.b);
            sb.append(", isLoading=");
            au.com.woolworths.android.onesite.a.D(sb, this.c, ", showConfetti=", this.d, ", showError=");
            return YU.a.k(")", sb, this.e);
        }
    }
}
