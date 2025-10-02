package au.com.woolworths.shop.rewards.priming;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.feature.rewards.account.authentication.RewardsAuthenticationActivity;
import au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class RewardsSetupPrimingActivity$listenToActions$1 extends AdaptedFunctionReference implements Function2<RewardsSetupPrimingContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        RewardsSetupPrimingContract.Actions actions = (RewardsSetupPrimingContract.Actions) obj;
        RewardsSetupPrimingActivity rewardsSetupPrimingActivity = (RewardsSetupPrimingActivity) this.d;
        int i = RewardsSetupPrimingActivity.A;
        rewardsSetupPrimingActivity.getClass();
        if (actions instanceof RewardsSetupPrimingContract.Actions.LaunchShoppingModeSelector) {
            boolean z = ((RewardsSetupPrimingContract.Actions.LaunchShoppingModeSelector) actions).f12899a;
            rewardsSetupPrimingActivity.startActivity(ActivityNavigatorKt.a(Activities.CollectionModeSetup.f4459a, ApplicationType.e));
            if (z) {
                rewardsSetupPrimingActivity.setResult(-1);
                rewardsSetupPrimingActivity.finish();
            }
        } else if (actions instanceof RewardsSetupPrimingContract.Actions.LaunchRewardsLogin) {
            RewardsAuthenticationActivity.Companion.a(rewardsSetupPrimingActivity);
        } else if (actions instanceof RewardsSetupPrimingContract.Actions.LaunchRewardsSignUp) {
            Intent intentA = ActivityNavigatorKt.a(Activities.Authentication.f4448a, ApplicationType.e);
            intentA.putExtra("EXTRA_AUTH_CONFIG", new Activities.Authentication.Extras(1));
            rewardsSetupPrimingActivity.startActivityForResult(intentA, 10005);
        } else if (actions instanceof RewardsSetupPrimingContract.Actions.LaunchHome) {
            rewardsSetupPrimingActivity.startActivity(Activities.MainActivity.f4487a.b());
            rewardsSetupPrimingActivity.setResult(-1);
            rewardsSetupPrimingActivity.finish();
        } else if (actions instanceof RewardsSetupPrimingContract.Actions.FinishWithResultOnboardingCancel) {
            rewardsSetupPrimingActivity.setResult(33);
            rewardsSetupPrimingActivity.finish();
        } else if (!(actions instanceof RewardsSetupPrimingContract.Actions.SetShoppingModeStepComplete)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f24250a;
    }
}
