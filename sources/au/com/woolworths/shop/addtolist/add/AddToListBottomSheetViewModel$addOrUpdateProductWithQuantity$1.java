package au.com.woolworths.shop.addtolist.add;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel", f = "AddToListBottomSheetViewModel.kt", l = {545, 552}, m = "addOrUpdateProductWithQuantity")
/* loaded from: classes4.dex */
final class AddToListBottomSheetViewModel$addOrUpdateProductWithQuantity$1 extends ContinuationImpl {
    public ShoppingList p;
    public ProductCard q;
    public /* synthetic */ Object r;
    public final /* synthetic */ AddToListBottomSheetViewModel s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddToListBottomSheetViewModel$addOrUpdateProductWithQuantity$1(AddToListBottomSheetViewModel addToListBottomSheetViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = addToListBottomSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.r6(null, null, BitmapDescriptorFactory.HUE_RED, this);
    }
}
