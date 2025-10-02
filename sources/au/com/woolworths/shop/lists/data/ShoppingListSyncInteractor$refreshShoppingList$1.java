package au.com.woolworths.shop.lists.data;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.ShoppingListSyncInteractor", f = "ShoppingListSyncInteractor.kt", l = {109}, m = "refreshShoppingList")
/* loaded from: classes4.dex */
final class ShoppingListSyncInteractor$refreshShoppingList$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ ShoppingListSyncInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListSyncInteractor$refreshShoppingList$1(ShoppingListSyncInteractor shoppingListSyncInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = shoppingListSyncInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.c(null, this);
    }
}
