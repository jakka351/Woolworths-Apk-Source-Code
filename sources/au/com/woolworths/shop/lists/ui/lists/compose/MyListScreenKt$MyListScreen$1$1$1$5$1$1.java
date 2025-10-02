package au.com.woolworths.shop.lists.ui.lists.compose;

import au.com.woolworths.shop.buyagain.analytics.BuyAgainEntryActions;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import au.com.woolworths.shop.lists.ui.ListScreen;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsContract;
import au.com.woolworths.shop.lists.ui.lists.mylists.MyListsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class MyListScreenKt$MyListScreen$1$1$1$5$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        MyListsViewModel myListsViewModel = (MyListsViewModel) this.receiver;
        myListsViewModel.j.c(new BuyAgainEntryActions.EntryPointClick(new ListScreen.Lists(ListsAnalyticsAppSection.e)));
        myListsViewModel.o.f(MyListsContract.Actions.LaunchBuyAgain.f12331a);
        return Unit.f24250a;
    }
}
