package au.com.woolworths.shop.lists.data.utils;

import au.com.woolworths.shop.lists.data.entity.ProductListItemEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListEntity;
import au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity;
import au.com.woolworths.shop.lists.data.entity.TextListItemEntity;
import au.com.woolworths.shop.lists.data.model.ProductListItem;
import au.com.woolworths.shop.lists.data.model.ShoppingList;
import au.com.woolworths.shop.lists.data.model.ShoppingListWithItems;
import au.com.woolworths.shop.lists.data.model.TextListItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-lists-data_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ListsExtKt {
    public static final ProductListItem a(ProductListItemEntity productListItemEntity) {
        Intrinsics.h(productListItemEntity, "<this>");
        return new ProductListItem(productListItemEntity.getId(), productListItemEntity.getListId(), productListItemEntity.getLocalCreatedAt(), productListItemEntity.getLocalUpdatedAt(), productListItemEntity.isChecked(), productListItemEntity.getProductId(), productListItemEntity.getQuantity(), productListItemEntity.getProduct(), productListItemEntity.getProductFoundInResponse());
    }

    public static final ShoppingList b(ShoppingListEntity shoppingListEntity) {
        Intrinsics.h(shoppingListEntity, "<this>");
        return new ShoppingList(shoppingListEntity.getId(), shoppingListEntity.getTitle(), shoppingListEntity.getColor(), shoppingListEntity.getLocalUpdatedAt(), shoppingListEntity.isWatchlist(), shoppingListEntity.getRemoteId());
    }

    public static final ShoppingListWithItems c(ShoppingListWithItemsEntity shoppingListWithItemsEntity) {
        Intrinsics.h(shoppingListWithItemsEntity, "<this>");
        ShoppingList shoppingListB = b(shoppingListWithItemsEntity.getShoppingList());
        List<ProductListItemEntity> productItems = shoppingListWithItemsEntity.getProductItems();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(productItems, 10));
        Iterator<T> it = productItems.iterator();
        while (it.hasNext()) {
            arrayList.add(a((ProductListItemEntity) it.next()));
        }
        List<TextListItemEntity> textItems = shoppingListWithItemsEntity.getTextItems();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(textItems, 10));
        for (TextListItemEntity textListItemEntity : textItems) {
            Intrinsics.h(textListItemEntity, "<this>");
            arrayList2.add(new TextListItem(textListItemEntity.getId(), textListItemEntity.getListId(), textListItemEntity.getLocalCreatedAt(), textListItemEntity.getLocalUpdatedAt(), textListItemEntity.isChecked(), textListItemEntity.getText()));
        }
        return new ShoppingListWithItems(shoppingListB, arrayList, arrayList2);
    }
}
