package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.shop.lists.data.model.ShoppingList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel", f = "AddToListBottomSheetViewModel.kt", l = {444, 445}, m = "addMultipleProductsToList")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$addMultipleProductsToList$1 extends ContinuationImpl {
    public ShoppingList p;
    public /* synthetic */ Object q;
    public final /* synthetic */ AddToListBottomSheetViewModel r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$addMultipleProductsToList$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = addToListBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.q6(null, null, this);
    }
}
