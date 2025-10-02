package au.com.woolworths.shop.lists.data.repository;

import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\n"}, d2 = {"<anonymous>", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListWithItemsEntity;", "list", "productItems", "", "Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "textItems", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.lists.data.repository.ShoppingListLocalRepository$shoppingListWithItems$1", f = "ShoppingListLocalRepository.kt", l = {83}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShoppingListLocalRepository$shoppingListWithItems$1 extends SuspendLambda implements Function4<ShoppingListWithItemsEntity, List<? extends ProductListItemEntity>, List<? extends TextListItemEntity>, Continuation<? super ShoppingListWithItemsEntity>, Object> {
    public int p;
    public /* synthetic */ ShoppingListWithItemsEntity q;
    public /* synthetic */ List r;
    public /* synthetic */ List s;
    public final /* synthetic */ ShoppingListLocalRepository t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingListLocalRepository$shoppingListWithItems$1(ShoppingListLocalRepository shoppingListLocalRepository, Continuation continuation) {
        super(4, continuation);
        this.t = shoppingListLocalRepository;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ShoppingListLocalRepository$shoppingListWithItems$1 shoppingListLocalRepository$shoppingListWithItems$1 = new ShoppingListLocalRepository$shoppingListWithItems$1(this.t, (Continuation) obj4);
        shoppingListLocalRepository$shoppingListWithItems$1.q = (ShoppingListWithItemsEntity) obj;
        shoppingListLocalRepository$shoppingListWithItems$1.r = (List) obj2;
        shoppingListLocalRepository$shoppingListWithItems$1.s = (List) obj3;
        return shoppingListLocalRepository$shoppingListWithItems$1.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ShoppingListWithItemsEntity shoppingListWithItemsEntityCopy$default;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.p;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ShoppingListWithItemsEntity shoppingListWithItemsEntity = this.q;
            ResultKt.b(obj);
            return shoppingListWithItemsEntity;
        }
        ResultKt.b(obj);
        ShoppingListWithItemsEntity shoppingListWithItemsEntity2 = this.q;
        List list = this.r;
        List list2 = this.s;
        if (shoppingListWithItemsEntity2 == null || (shoppingListWithItemsEntityCopy$default = ShoppingListWithItemsEntity.copy$default(shoppingListWithItemsEntity2, null, list, list2, 1, null)) == null) {
            return null;
        }
        ShoppingListItemsLocalRepository shoppingListItemsLocalRepository = this.t.c;
        List<ProductListItemEntity> productItems = shoppingListWithItemsEntity2.getProductItems();
        this.q = shoppingListWithItemsEntityCopy$default;
        this.r = null;
        this.p = 1;
        return shoppingListItemsLocalRepository.g(productItems, this) == coroutineSingletons ? coroutineSingletons : shoppingListWithItemsEntityCopy$default;
    }
}
