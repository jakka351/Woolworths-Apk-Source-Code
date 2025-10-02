package au.com.woolworths.shop.lists.ui.details.ui;

import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.details.analytics.ListDetailsActions;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsContract;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class ListDetailsView$setViewContent$1$1$1$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ListDetailsViewModel listDetailsViewModel = (ListDetailsViewModel) this.receiver;
        AnalyticsManager analyticsManager = listDetailsViewModel.g;
        Lazy lazy = listDetailsViewModel.u;
        MutableStateFlow mutableStateFlow = listDetailsViewModel.o;
        int iOrdinal = ((ListDetailsContract.BottomSheetViewState) mutableStateFlow.getValue()).ordinal();
        if (iOrdinal == 0) {
            mutableStateFlow.f(ListDetailsContract.BottomSheetViewState.f);
            analyticsManager.c(new ListDetailsActions.CollapseBottomSheetClick((ListDetailsAnalyticsParams) lazy.getD()));
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            mutableStateFlow.f(ListDetailsContract.BottomSheetViewState.e);
            analyticsManager.c(new ListDetailsActions.ExpandBottomSheetClick((ListDetailsAnalyticsParams) lazy.getD()));
        }
        return Unit.f24250a;
    }
}
