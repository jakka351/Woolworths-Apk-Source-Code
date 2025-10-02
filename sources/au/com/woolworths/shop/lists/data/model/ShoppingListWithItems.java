package au.com.woolworths.shop.lists.data.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0011HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lau/com/woolworths/shop/lists/data/model/ShoppingListWithItems;", "", "shoppingList", "Lau/com/woolworths/shop/lists/data/model/ShoppingList;", "productItems", "", "Lau/com/woolworths/shop/lists/data/model/ProductListItem;", "textItems", "Lau/com/woolworths/shop/lists/data/model/TextListItem;", "<init>", "(Lau/com/woolworths/shop/lists/data/model/ShoppingList;Ljava/util/List;Ljava/util/List;)V", "getShoppingList", "()Lau/com/woolworths/shop/lists/data/model/ShoppingList;", "getProductItems", "()Ljava/util/List;", "getTextItems", "itemCount", "", "getItemCount", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final /* data */ class ShoppingListWithItems {

    @NotNull
    private final List<ProductListItem> productItems;

    @NotNull
    private final ShoppingList shoppingList;

    @NotNull
    private final List<TextListItem> textItems;

    public ShoppingListWithItems(@NotNull ShoppingList shoppingList, @NotNull List<ProductListItem> productItems, @NotNull List<TextListItem> textItems) {
        Intrinsics.h(shoppingList, "shoppingList");
        Intrinsics.h(productItems, "productItems");
        Intrinsics.h(textItems, "textItems");
        this.shoppingList = shoppingList;
        this.productItems = productItems;
        this.textItems = textItems;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShoppingListWithItems copy$default(ShoppingListWithItems shoppingListWithItems, ShoppingList shoppingList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            shoppingList = shoppingListWithItems.shoppingList;
        }
        if ((i & 2) != 0) {
            list = shoppingListWithItems.productItems;
        }
        if ((i & 4) != 0) {
            list2 = shoppingListWithItems.textItems;
        }
        return shoppingListWithItems.copy(shoppingList, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ShoppingList getShoppingList() {
        return this.shoppingList;
    }

    @NotNull
    public final List<ProductListItem> component2() {
        return this.productItems;
    }

    @NotNull
    public final List<TextListItem> component3() {
        return this.textItems;
    }

    @NotNull
    public final ShoppingListWithItems copy(@NotNull ShoppingList shoppingList, @NotNull List<ProductListItem> productItems, @NotNull List<TextListItem> textItems) {
        Intrinsics.h(shoppingList, "shoppingList");
        Intrinsics.h(productItems, "productItems");
        Intrinsics.h(textItems, "textItems");
        return new ShoppingListWithItems(shoppingList, productItems, textItems);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShoppingListWithItems)) {
            return false;
        }
        ShoppingListWithItems shoppingListWithItems = (ShoppingListWithItems) other;
        return Intrinsics.c(this.shoppingList, shoppingListWithItems.shoppingList) && Intrinsics.c(this.productItems, shoppingListWithItems.productItems) && Intrinsics.c(this.textItems, shoppingListWithItems.textItems);
    }

    public final int getItemCount() {
        if (!Intrinsics.c(this.shoppingList.isWatchlist(), Boolean.TRUE)) {
            return this.textItems.size() + this.productItems.size();
        }
        List<ProductListItem> list = this.productItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((ProductListItem) obj).isChecked()) {
                arrayList.add(obj);
            }
        }
        return arrayList.size();
    }

    @NotNull
    public final List<ProductListItem> getProductItems() {
        return this.productItems;
    }

    @NotNull
    public final ShoppingList getShoppingList() {
        return this.shoppingList;
    }

    @NotNull
    public final List<TextListItem> getTextItems() {
        return this.textItems;
    }

    public int hashCode() {
        return this.textItems.hashCode() + b.d(this.shoppingList.hashCode() * 31, 31, this.productItems);
    }

    @NotNull
    public String toString() {
        ShoppingList shoppingList = this.shoppingList;
        List<ProductListItem> list = this.productItems;
        List<TextListItem> list2 = this.textItems;
        StringBuilder sb = new StringBuilder("ShoppingListWithItems(shoppingList=");
        sb.append(shoppingList);
        sb.append(", productItems=");
        sb.append(list);
        sb.append(", textItems=");
        return a.t(sb, list2, ")");
    }
}
