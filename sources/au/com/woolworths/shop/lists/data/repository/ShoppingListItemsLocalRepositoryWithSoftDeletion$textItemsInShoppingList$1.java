package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\n"}, d2 = {"<anonymous>", "", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;", "textItemEntities", "softDeletedTextItemIds", "", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1", f = "ShoppingListItemsLocalRepositoryWithSoftDeletion.kt", l = {}, m = "invokeSuspend")
@SourceDebugExtension
/* loaded from: classes4.dex */
final class ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1 extends SuspendLambda implements Function3<List<? extends TextListItemEntity>, Set<? extends String>, Continuation<? super List<? extends TextListItemEntity>>, Object> {
    public /* synthetic */ List p;
    public /* synthetic */ Set q;

    public ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1() {
        super(3, null);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1 shoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1 = new ShoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1(3, (Continuation) obj3);
        shoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1.p = (List) obj;
        shoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1.q = (Set) obj2;
        return shoppingListItemsLocalRepositoryWithSoftDeletion$textItemsInShoppingList$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        List list = this.p;
        Set set = this.q;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!set.contains(((TextListItemEntity) obj2).getId())) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
