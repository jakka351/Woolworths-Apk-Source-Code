package com.woolworths.scanlibrary.ui.productsearch.adapter;

import androidx.recyclerview.widget.DiffUtil;
import com.woolworths.scanlibrary.models.product.Item;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/woolworths/scanlibrary/ui/productsearch/adapter/ProductSearchResultItemAdapter$Companion$ITEM_COMPARATOR$1", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/woolworths/scanlibrary/models/product/Item;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductSearchResultItemAdapter$Companion$ITEM_COMPARATOR$1 extends DiffUtil.ItemCallback<Item> {
    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean a(Object obj, Object obj2) {
        Item oldItem = (Item) obj;
        Item newItem = (Item) obj2;
        Intrinsics.h(oldItem, "oldItem");
        Intrinsics.h(newItem, "newItem");
        return oldItem.equals(newItem);
    }

    @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
    public final boolean b(Object obj, Object obj2) {
        Item oldItem = (Item) obj;
        Item newItem = (Item) obj2;
        Intrinsics.h(oldItem, "oldItem");
        Intrinsics.h(newItem, "newItem");
        return Intrinsics.c(oldItem.getLinenumber(), newItem.getLinenumber());
    }
}
