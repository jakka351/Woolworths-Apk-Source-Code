package au.com.woolworths.feature.shop.healthylifefoodtracker;

import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.feature.shop.healthylifefoodtracker.FoodTrackerContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class FoodTrackerActivity$collectActions$1 extends AdaptedFunctionReference implements Function2<FoodTrackerContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        FoodTrackerContract.Action action = (FoodTrackerContract.Action) obj;
        FoodTrackerActivity foodTrackerActivity = (FoodTrackerActivity) this.d;
        int i = FoodTrackerActivity.z;
        foodTrackerActivity.getClass();
        if (action instanceof FoodTrackerContract.Action.OpenUrl) {
            ContextExtKt.j(foodTrackerActivity, ((FoodTrackerContract.Action.OpenUrl) action).f7156a, null, null, null, 62);
        } else {
            if (!Intrinsics.c(action, FoodTrackerContract.Action.AddEdrRequest.f7155a)) {
                throw new NoWhenBranchMatchedException();
            }
            Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint rewardsSetupEntryPoint = Activities.RewardsSetupMoreActivity.RewardsSetupEntryPoint.d;
            FeatureToggleManager featureToggleManager = foodTrackerActivity.w;
            if (featureToggleManager == null) {
                Intrinsics.p("featureToggleManager");
                throw null;
            }
            foodTrackerActivity.startActivityForResult(Activities.RewardsSetupMoreActivity.f4522a.b(rewardsSetupEntryPoint, featureToggleManager.c(BaseShopAppFeature.R)), 10006);
        }
        return Unit.f24250a;
    }
}
