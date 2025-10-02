package au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet;

import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.shop.lists.data.prefs.SortBy;
import au.com.woolworths.shop.lists.ui.ListDetailsAnalyticsParams;
import au.com.woolworths.shop.lists.ui.shoppinglist.analytics.ShoppingListDetailsActions;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.sortbottomsheet.SortByBottomSheetFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SortByBottomSheetFragment$setContent$1$1$1$1 extends FunctionReferenceImpl implements Function1<SortBy, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SortBy p0 = (SortBy) obj;
        Intrinsics.h(p0, "p0");
        SortByBottomSheetFragment sortByBottomSheetFragment = (SortByBottomSheetFragment) this.receiver;
        ((SortByBottomSheetFragment.BottomSheetHost) sortByBottomSheetFragment.i.getD()).Q1(p0);
        SortByBottomSheetViewModel sortByBottomSheetViewModel = (SortByBottomSheetViewModel) sortByBottomSheetFragment.j.getD();
        String string = sortByBottomSheetFragment.getString(p0.e);
        Intrinsics.g(string, "getString(...)");
        sortByBottomSheetViewModel.f.j(new ShoppingListDetailsActions.SortingOptionClicked((ListDetailsAnalyticsParams) sortByBottomSheetViewModel.j.getD()), TrackingMetadata.Companion.a(TrackableValue.V1, string));
        sortByBottomSheetFragment.dismiss();
        return Unit.f24250a;
    }
}
