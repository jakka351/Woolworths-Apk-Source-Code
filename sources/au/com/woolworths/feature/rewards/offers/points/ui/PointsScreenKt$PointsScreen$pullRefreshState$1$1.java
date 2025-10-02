package au.com.woolworths.feature.rewards.offers.points.ui;

import au.com.woolworths.feature.rewards.offers.points.RewardsPointsContract;
import au.com.woolworths.feature.rewards.offers.points.RewardsPointsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class PointsScreenKt$PointsScreen$pullRefreshState$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        RewardsPointsViewModel rewardsPointsViewModel = (RewardsPointsViewModel) this.receiver;
        MutableStateFlow mutableStateFlow = rewardsPointsViewModel.w;
        mutableStateFlow.setValue(RewardsPointsContract.ViewState.a((RewardsPointsContract.ViewState) mutableStateFlow.getValue(), false, null, null, false, null, null, 4093));
        rewardsPointsViewModel.y6();
        return Unit.f24250a;
    }
}
