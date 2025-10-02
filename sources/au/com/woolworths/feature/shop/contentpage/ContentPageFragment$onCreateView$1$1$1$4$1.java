package au.com.woolworths.feature.shop.contentpage;

import au.com.woolworths.feature.shop.contentpage.ContentPageContract;
import au.com.woolworths.feature.shop.contentpage.data.SnackBarActionEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ContentPageFragment$onCreateView$1$1$1$4$1 extends FunctionReferenceImpl implements Function1<SnackBarActionEvent, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SnackBarActionEvent p0 = (SnackBarActionEvent) obj;
        Intrinsics.h(p0, "p0");
        ContentPageViewModel contentPageViewModel = (ContentPageViewModel) this.receiver;
        contentPageViewModel.getClass();
        if (!(p0 instanceof SnackBarActionEvent.OnShoppingListViewClick)) {
            throw new NoWhenBranchMatchedException();
        }
        contentPageViewModel.q.f(new ContentPageContract.Actions.ViewShoppingList(((SnackBarActionEvent.OnShoppingListViewClick) p0).f7023a));
        return Unit.f24250a;
    }
}
