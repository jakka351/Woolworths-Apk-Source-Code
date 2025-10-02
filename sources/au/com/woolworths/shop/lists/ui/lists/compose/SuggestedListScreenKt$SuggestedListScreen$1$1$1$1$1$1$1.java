package au.com.woolworths.shop.lists.ui.lists.compose;

import au.com.woolworths.shop.lists.data.model.SuggestedListItem;
import au.com.woolworths.shop.lists.ui.lists.suggested.SuggestedListsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class SuggestedListScreenKt$SuggestedListScreen$1$1$1$1$1$1$1 extends FunctionReferenceImpl implements Function1<SuggestedListItem, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SuggestedListItem p0 = (SuggestedListItem) obj;
        Intrinsics.h(p0, "p0");
        ((SuggestedListsViewModel) this.receiver).q6(p0);
        return Unit.f24250a;
    }
}
