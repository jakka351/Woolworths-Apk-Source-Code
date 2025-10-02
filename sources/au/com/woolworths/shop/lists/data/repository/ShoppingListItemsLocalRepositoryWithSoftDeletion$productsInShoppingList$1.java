package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.product.models.ProductId;
import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0001H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "productEntities", "softDeletedProductItems", "Lkotlin/Pair;", "", "Lau/com/woolworths/product/models/ProductId;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1", f = "ShoppingListItemsLocalRepositoryWithSoftDeletion.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1 extends SuspendLambda implements Function3<List<? extends ProductListItemEntity>, List<? extends Pair<? extends String, ? extends ProductId>>, Continuation<? super List<? extends ProductListItemEntity>>, Object> {
    public /* synthetic */ List p;
    public /* synthetic */ List q;
    public final /* synthetic */ String r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1(String str, Continuation continuation) {
        super(3, continuation);
        this.r = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1 shoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1 = new ShoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1(this.r, (Continuation) obj3);
        shoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1.p = (List) obj;
        shoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1.q = (List) obj2;
        return shoppingListItemsLocalRepositoryWithSoftDeletion$productsInShoppingList$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        List list = this.p;
        List list2 = this.q;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!list2.contains(new Pair(this.r, ((ProductListItemEntity) obj2).getProductId()))) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
