package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel", f = "AddToListBottomSheetViewModel.kt", l = {328, 333}, m = "copyToList")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$copyToList$1 extends ContinuationImpl {
    public float p;
    public ShoppingList q;
    public ProductId r;
    public boolean s;
    public /* synthetic */ Object t;
    public final /* synthetic */ AddToListBottomSheetViewModel u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$copyToList$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.u = addToListBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return AddToListBottomSheetViewModel.p6(this.u, BitmapDescriptorFactory.HUE_RED, null, this);
    }
}
