package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import au.com.woolworths.analytics.supers.lists.SnapAListAnalytics;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SortByView$setContent$1$1$3$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SortByViewModel sortByViewModel = (SortByViewModel) this.receiver;
        SharedFlowImpl sharedFlowImpl = sortByViewModel.n;
        sortByViewModel.i.g(SnapAListAnalytics.ListDetails.Action.e);
        if (sortByViewModel.h.d()) {
            sharedFlowImpl.f(SortByViewContract.Actions.ShowSnapAListBottomSheet.f12440a);
        } else {
            sharedFlowImpl.f(SortByViewContract.Actions.LaunchSnapAListGuestOnboardingScreen.f12437a);
        }
        return Unit.f24250a;
    }
}
