package au.com.woolworths.shop.lists.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion", f = "ShoppingListItemsLocalRepositoryWithSoftDeletion.kt", l = {58}, m = "productListInShoppingList")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryWithSoftDeletion$productListInShoppingList$1 extends ContinuationImpl {
    public String p;
    public /* synthetic */ Object q;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryWithSoftDeletion r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryWithSoftDeletion$productListInShoppingList$1(ShoppingListItemsLocalRepositoryWithSoftDeletion shoppingListItemsLocalRepositoryWithSoftDeletion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = shoppingListItemsLocalRepositoryWithSoftDeletion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.m(null, this);
    }
}
