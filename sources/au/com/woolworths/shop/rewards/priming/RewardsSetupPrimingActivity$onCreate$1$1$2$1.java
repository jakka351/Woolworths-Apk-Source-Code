package au.com.woolworths.shop.rewards.priming;

import android.content.Intent;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.shop.rewards.priming.analytics.RewardsSetupActions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class RewardsSetupPrimingActivity$onCreate$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardsSetupPrimingActivity rewardsSetupPrimingActivity = (RewardsSetupPrimingActivity) this.receiver;
        int i = RewardsSetupPrimingActivity.A;
        rewardsSetupPrimingActivity.O4().g.c(RewardsSetupActions.g);
        Intent intentA = ActivityNavigatorKt.a(Activities.Authentication.f4448a, ApplicationType.e);
        intentA.putExtra("EXTRA_AUTH_CONFIG", new Activities.Authentication.Extras(1));
        rewardsSetupPrimingActivity.startActivityForResult(intentA, 10005);
        return Unit.f24250a;
    }
}
