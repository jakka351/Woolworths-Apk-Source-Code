package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.shop.lists.data.model.ShoppingList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel", f = "AddToListBottomSheetViewModel.kt", l = {520}, m = "multipleAddToList")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$multipleAddToList$1 extends ContinuationImpl {
    public ShoppingList p;
    public List q;
    public Iterator r;
    public /* synthetic */ Object s;
    public final /* synthetic */ AddToListBottomSheetViewModel t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$multipleAddToList$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = addToListBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.z6(null, null, this);
    }
}
