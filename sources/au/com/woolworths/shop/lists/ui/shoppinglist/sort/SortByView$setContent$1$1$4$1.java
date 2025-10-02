package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import androidx.lifecycle.ViewModelKt;
import au.com.woolworths.android.onesite.models.text.PluralResText;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import com.woolworths.R;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SortByView$setContent$1$1$4$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SortByViewModel sortByViewModel = (SortByViewModel) this.receiver;
        SharedFlowImpl sharedFlowImpl = sortByViewModel.n;
        Lazy lazy = sortByViewModel.v;
        StateFlow stateFlow = sortByViewModel.q;
        SortByViewContract.ViewState viewState = (SortByViewContract.ViewState) stateFlow.getValue();
        Intrinsics.h(viewState, "<this>");
        if (viewState.c == 0) {
            sharedFlowImpl.f(new SortByViewContract.Actions.ShowDialog(new ResText(R.string.shop_lists_magic_match_empty_list_dialog_title), new ResText(R.string.shop_lists_magic_match_empty_list_dialog_body)));
        } else if (((SortByViewContract.ViewState) stateFlow.getValue()).c > ((Number) lazy.getD()).intValue()) {
            sharedFlowImpl.f(new SortByViewContract.Actions.ShowMaxItemsDialog(new PluralResText(R.plurals.shop_lists_magic_match_max_items_dialog_title, ((Number) lazy.getD()).intValue()), new ResText(R.string.shop_lists_magic_match_max_items_dialog_body), new ResText(R.string.shop_lists_button_cancel), new ResText(R.string.shop_lists_button_continue)));
        } else {
            BuildersKt.c(ViewModelKt.a(sortByViewModel), null, null, new SortByViewModel$launchMagicMatchScreen$1(sortByViewModel, null), 3);
            sortByViewModel.q6().h0();
        }
        return Unit.f24250a;
    }
}
