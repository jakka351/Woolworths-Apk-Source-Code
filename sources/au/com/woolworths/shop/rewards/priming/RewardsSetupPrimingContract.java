package au.com.woolworths.shop.rewards.priming;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.shop.rewards.priming.data.PrimingScreenData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract;", "", "ViewState", "Actions", "Companion", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface RewardsSetupPrimingContract {

    @StabilityInferred
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;", "", "LaunchHome", "LaunchShoppingModeSelector", "FinishWithResultOnboardingCancel", "SetShoppingModeStepComplete", "LaunchRewardsLogin", "LaunchRewardsSignUp", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$FinishWithResultOnboardingCancel;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchHome;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchRewardsLogin;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchRewardsSignUp;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchShoppingModeSelector;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$SetShoppingModeStepComplete;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Actions {

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$FinishWithResultOnboardingCancel;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class FinishWithResultOnboardingCancel extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final FinishWithResultOnboardingCancel f12897a = new FinishWithResultOnboardingCancel();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchHome;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchHome extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final LaunchHome f12898a = new LaunchHome();
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchRewardsLogin;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchRewardsLogin extends Actions {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchRewardsSignUp;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LaunchRewardsSignUp extends Actions {
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$LaunchShoppingModeSelector;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class LaunchShoppingModeSelector extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f12899a;

            public LaunchShoppingModeSelector(boolean z) {
                this.f12899a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchShoppingModeSelector) && this.f12899a == ((LaunchShoppingModeSelector) obj).f12899a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f12899a);
            }

            public final String toString() {
                return a.n("LaunchShoppingModeSelector(shouldFinishScreen=", ")", this.f12899a);
            }
        }

        @StabilityInferred
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions$SetShoppingModeStepComplete;", "Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Actions;", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SetShoppingModeStepComplete extends Actions {

            /* renamed from: a, reason: collision with root package name */
            public static final SetShoppingModeStepComplete f12900a = new SetShoppingModeStepComplete();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$Companion;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        public static final ViewState f12901a = new ViewState(false, null);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/rewards/priming/RewardsSetupPrimingContract$ViewState;", "", "shop-rewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ViewState {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12902a;
        public final PrimingScreenData b;

        public ViewState(boolean z, PrimingScreenData primingScreenData) {
            this.f12902a = z;
            this.b = primingScreenData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewState)) {
                return false;
            }
            ViewState viewState = (ViewState) obj;
            return this.f12902a == viewState.f12902a && Intrinsics.c(this.b, viewState.b);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f12902a) * 31;
            PrimingScreenData primingScreenData = this.b;
            return iHashCode + (primingScreenData == null ? 0 : primingScreenData.hashCode());
        }

        public final String toString() {
            return "ViewState(isLoading=" + this.f12902a + ", primingScreenData=" + this.b + ")";
        }
    }
}
