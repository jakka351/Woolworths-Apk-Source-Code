package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {428}, m = "addProducts")
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$addProducts$1 extends ContinuationImpl {
    public Iterator p;
    public ProductListItemEntity q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$addProducts$1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = shoppingListItemsLocalRepositoryImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.g(null, this);
    }
}
