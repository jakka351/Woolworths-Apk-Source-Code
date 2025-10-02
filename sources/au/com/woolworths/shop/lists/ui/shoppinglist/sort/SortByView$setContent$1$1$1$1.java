package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SortByView$setContent$1$1$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SortByViewModel sortByViewModel = (SortByViewModel) this.receiver;
        StateFlow stateFlow = sortByViewModel.q;
        SharedFlowImpl sharedFlowImpl = sortByViewModel.n;
        SortByViewContract.ViewState viewState = (SortByViewContract.ViewState) stateFlow.getValue();
        Intrinsics.h(viewState, "<this>");
        if (viewState.b != 0) {
            sharedFlowImpl.f(SortByViewContract.Actions.ShowSortBySelectionDialog.f12442a);
        } else {
            sharedFlowImpl.f(new SortByViewContract.Actions.ShowDialog(new ResText(R.string.shop_lists_sort_filter_info_title), new ResText(R.string.shop_lists_sort_filter_info_message)));
        }
        sortByViewModel.q6().o1();
        return Unit.f24250a;
    }
}
