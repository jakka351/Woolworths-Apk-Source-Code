package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.shop.lists.data.entity.CategoryByProductEntity;
import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.entity.ProductsWithCategory;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0006H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "productItems", "<unused var>", "Lau/com/woolworths/shop/lists/data/entity/ProductsWithCategory;", "Lau/com/woolworths/shop/lists/data/entity/CategoryByProductEntity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryImpl$productsInShoppingList$1", f = "ShoppingListItemsLocalRepositoryImpl.kt", l = {66}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryImpl$productsInShoppingList$1 extends SuspendLambda implements Function4<List<? extends ProductListItemEntity>, ProductsWithCategory, CategoryByProductEntity, Continuation<? super List<? extends ProductListItemEntity>>, Object> {
    public int p;
    public /* synthetic */ List q;
    public final /* synthetic */ ShoppingListItemsLocalRepositoryImpl r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryImpl$productsInShoppingList$1(ShoppingListItemsLocalRepositoryImpl shoppingListItemsLocalRepositoryImpl, Continuation continuation) {
        super(4, continuation);
        this.r = shoppingListItemsLocalRepositoryImpl;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ShoppingListItemsLocalRepositoryImpl$productsInShoppingList$1 shoppingListItemsLocalRepositoryImpl$productsInShoppingList$1 = new ShoppingListItemsLocalRepositoryImpl$productsInShoppingList$1(this.r, (Continuation) obj4);
        shoppingListItemsLocalRepositoryImpl$productsInShoppingList$1.q = (List) obj;
        return shoppingListItemsLocalRepositoryImpl$productsInShoppingList$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = this.q;
            ResultKt.b(obj);
            return list;
        }
        ResultKt.b(obj);
        List list2 = this.q;
        this.q = list2;
        this.p = 1;
        return this.r.g(list2, this) == coroutineSingletons ? coroutineSingletons : list2;
    }
}
