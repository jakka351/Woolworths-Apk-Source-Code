package com.woolworths.scanlibrary.models.receipt;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"isMeasuredByNumber", "", "Lcom/woolworths/scanlibrary/models/receipt/ReceiptItem;", "scanGoLibrary_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ReceiptItemKt {
    public static final boolean isMeasuredByNumber(@NotNull ReceiptItem receiptItem) {
        Intrinsics.h(receiptItem, "<this>");
        String uom = receiptItem.getUom();
        Intrinsics.h(uom, "<this>");
        return uom.compareToIgnoreCase("ea") == 0 && StringsKt.i0(receiptItem.getQuantity()) != null;
    }
}
