package au.com.woolworths.shop.lists.ui.lists.menu;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.ui.lists.menu.ListsBottomSheetViewModel", f = "ListsBottomSheetViewModel.kt", l = {55}, m = "isDeleteAllowed")
/* loaded from: classes4.dex */
final class ListsBottomSheetViewModel$isDeleteAllowed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ListsBottomSheetViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListsBottomSheetViewModel$isDeleteAllowed$1(ListsBottomSheetViewModel listsBottomSheetViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = listsBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return ListsBottomSheetViewModel.p6(this.q, this);
    }
}
