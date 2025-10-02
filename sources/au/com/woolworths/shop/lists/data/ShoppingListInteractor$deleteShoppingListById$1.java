package au.com.woolworths.shop.lists.data;

import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListInteractor", f = "ShoppingListInteractor.kt", l = {128, 129}, m = "deleteShoppingListById")
/* loaded from: classes4.dex */
final class ShoppingListInteractor$deleteShoppingListById$1 extends ContinuationImpl {
    public ShoppingListEntity p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShoppingListInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListInteractor$deleteShoppingListById$1(ShoppingListInteractor shoppingListInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = shoppingListInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(null, this);
    }
}
