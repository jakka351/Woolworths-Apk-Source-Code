package com.woolworths.scanlibrary.ui.receipt.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/Discount;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptEntry;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class Discount extends ReceiptEntry {
    public final String b;
    public final BigDecimal c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Discount(String discountName, BigDecimal amount) {
        super(5);
        Intrinsics.h(discountName, "discountName");
        Intrinsics.h(amount, "amount");
        this.b = discountName;
        this.c = amount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Discount)) {
            return false;
        }
        Discount discount = (Discount) obj;
        return Intrinsics.c(this.b, discount.b) && Intrinsics.c(this.c, discount.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Discount(discountName=" + this.b + ", amount=" + this.c + ")";
    }
}
