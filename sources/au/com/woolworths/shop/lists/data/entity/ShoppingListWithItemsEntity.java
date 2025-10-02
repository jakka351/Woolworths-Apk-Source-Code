package au.com.woolworths.shop.lists.data.entity;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.room.Embedded;
import androidx.room.Ignore;
import androidx.room.Relation;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0015HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\""}, d2 = {"Lau/com/woolworths/shop/lists/data/entity/ShoppingListWithItemsEntity;", "", "shoppingList", "Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "allProductItems", "", "Lau/com/woolworths/shop/lists/data/entity/ProductListItemEntity;", "allTextItems", "Lau/com/woolworths/shop/lists/data/entity/TextListItemEntity;", "<init>", "(Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;Ljava/util/List;Ljava/util/List;)V", "getShoppingList", "()Lau/com/woolworths/shop/lists/data/entity/ShoppingListEntity;", "getAllProductItems", "()Ljava/util/List;", "getAllTextItems", "productItems", "getProductItems", "textItems", "getTextItems", "itemCount", "", "getItemCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class ShoppingListWithItemsEntity {

    @Relation
    @NotNull
    private final List<ProductListItemEntity> allProductItems;

    @Relation
    @NotNull
    private final List<TextListItemEntity> allTextItems;

    @Ignore
    private final int itemCount;

    @Ignore
    @NotNull
    private final List<ProductListItemEntity> productItems;

    @Embedded
    @NotNull
    private final ShoppingListEntity shoppingList;

    @Ignore
    @NotNull
    private final List<TextListItemEntity> textItems;

    public ShoppingListWithItemsEntity(@NotNull ShoppingListEntity shoppingList, @NotNull List<ProductListItemEntity> allProductItems, @NotNull List<TextListItemEntity> allTextItems) {
        Intrinsics.h(shoppingList, "shoppingList");
        Intrinsics.h(allProductItems, "allProductItems");
        Intrinsics.h(allTextItems, "allTextItems");
        this.shoppingList = shoppingList;
        this.allProductItems = allProductItems;
        this.allTextItems = allTextItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : allProductItems) {
            if (!((ProductListItemEntity) obj).isLocalDeleted()) {
                arrayList.add(obj);
            }
        }
        this.productItems = CollectionsKt.u0(new Comparator() { // from class: au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity$special$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.a(Long.valueOf(((ProductListItemEntity) t2).getLocalCreatedAt()), Long.valueOf(((ProductListItemEntity) t).getLocalCreatedAt()));
            }
        }, arrayList);
        List<TextListItemEntity> list = this.allTextItems;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            if (!((TextListItemEntity) obj2).isLocalDeleted()) {
                arrayList2.add(obj2);
            }
        }
        List<TextListItemEntity> listU0 = CollectionsKt.u0(new Comparator() { // from class: au.com.woolworths.shop.lists.data.entity.ShoppingListWithItemsEntity$special$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.a(Long.valueOf(((TextListItemEntity) t2).getLocalCreatedAt()), Long.valueOf(((TextListItemEntity) t).getLocalCreatedAt()));
            }
        }, arrayList2);
        this.textItems = listU0;
        this.itemCount = listU0.size() + this.productItems.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingListWithItemsEntity copy$default(ShoppingListWithItemsEntity shoppingListWithItemsEntity, ShoppingListEntity shoppingListEntity, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingListEntity = shoppingListWithItemsEntity.shoppingList;
        }
        if ((i & 2) != 0) {
            list = shoppingListWithItemsEntity.allProductItems;
        }
        if ((i & 4) != 0) {
            list2 = shoppingListWithItemsEntity.allTextItems;
        }
        return shoppingListWithItemsEntity.copy(shoppingListEntity, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ShoppingListEntity getShoppingList() {
        return this.shoppingList;
    }

    @NotNull
    public final List<ProductListItemEntity> component2() {
        return this.allProductItems;
    }

    @NotNull
    public final List<TextListItemEntity> component3() {
        return this.allTextItems;
    }

    @NotNull
    public final ShoppingListWithItemsEntity copy(@NotNull ShoppingListEntity shoppingList, @NotNull List<ProductListItemEntity> allProductItems, @NotNull List<TextListItemEntity> allTextItems) {
        Intrinsics.h(shoppingList, "shoppingList");
        Intrinsics.h(allProductItems, "allProductItems");
        Intrinsics.h(allTextItems, "allTextItems");
        return new ShoppingListWithItemsEntity(shoppingList, allProductItems, allTextItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListWithItemsEntity)) {
            return false;
        }
        ShoppingListWithItemsEntity shoppingListWithItemsEntity = (ShoppingListWithItemsEntity) other;
        return Intrinsics.c(this.shoppingList, shoppingListWithItemsEntity.shoppingList) && Intrinsics.c(this.allProductItems, shoppingListWithItemsEntity.allProductItems) && Intrinsics.c(this.allTextItems, shoppingListWithItemsEntity.allTextItems);
    }

    @NotNull
    public final List<ProductListItemEntity> getAllProductItems() {
        return this.allProductItems;
    }

    @NotNull
    public final List<TextListItemEntity> getAllTextItems() {
        return this.allTextItems;
    }

    public final int getItemCount() {
        return this.itemCount;
    }

    @NotNull
    public final List<ProductListItemEntity> getProductItems() {
        return this.productItems;
    }

    @NotNull
    public final ShoppingListEntity getShoppingList() {
        return this.shoppingList;
    }

    @NotNull
    public final List<TextListItemEntity> getTextItems() {
        return this.textItems;
    }

    public int hashCode() {
        return this.allTextItems.hashCode() + b.d(this.shoppingList.hashCode() * 31, 31, this.allProductItems);
    }

    @NotNull
    public String toString() {
        ShoppingListEntity shoppingListEntity = this.shoppingList;
        List<ProductListItemEntity> list = this.allProductItems;
        List<TextListItemEntity> list2 = this.allTextItems;
        StringBuilder sb = new StringBuilder("ShoppingListWithItemsEntity(shoppingList=");
        sb.append(shoppingListEntity);
        sb.append(", allProductItems=");
        sb.append(list);
        sb.append(", allTextItems=");
        return a.t(sb, list2, ")");
    }
}
