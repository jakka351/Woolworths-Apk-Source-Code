package au.com.woolworths.shop.lists.ui.shoppinglist.sort;

import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.shop.lists.data.prefs.SortDirection;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.shoppinglist.analytics.SortByViewActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SortByView$setContent$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        SortDirection sortDirection;
        SortByViewModel sortByViewModel = (SortByViewModel) this.receiver;
        sortByViewModel.i.c(new SortByViewActions.SortingDirectionClicked((ListDetailsAnalyticsParams) sortByViewModel.p.getD()));
        SortByViewContract.ViewState viewState = (SortByViewContract.ViewState) sortByViewModel.q.getValue();
        Intrinsics.h(viewState, "<this>");
        if (viewState.b != 0) {
            int iOrdinal = sortByViewModel.j.e().ordinal();
            if (iOrdinal == 0) {
                sortDirection = SortDirection.e;
            } else {
                if (iOrdinal != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                sortDirection = SortDirection.d;
            }
            sortByViewModel.g.b(sortByViewModel.f.b(), sortDirection);
            sortByViewModel.q6().o1();
        } else {
            sortByViewModel.n.f(new SortByViewContract.Actions.ShowDialog(new ResText(R.string.shop_lists_sort_filter_info_title), new ResText(R.string.shop_lists_sort_filter_info_message)));
        }
        return Unit.f24250a;
    }
}
