package com.woolworths.scanlibrary.ui.receipt.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.receipt.ReceiptItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/Item;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptEntry;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Item extends ReceiptEntry {
    public final ReceiptItem b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Item(ReceiptItem item) {
        super(3);
        Intrinsics.h(item, "item");
        this.b = item;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Item) && Intrinsics.c(this.b, ((Item) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Item(item=" + this.b + ")";
    }
}
