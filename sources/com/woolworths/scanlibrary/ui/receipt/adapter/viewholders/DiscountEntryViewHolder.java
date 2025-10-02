package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.databinding.ReceiptDiscountBinding;
import com.woolworths.scanlibrary.ui.receipt.adapter.Discount;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import com.woolworths.scanlibrary.util.discount.DiscountUtilKt;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/DiscountEntryViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DiscountEntryViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptDiscountBinding f21305a;

    /* JADX WARN: Illegal instructions before constructor call */
    public DiscountEntryViewHolder(ReceiptDiscountBinding receiptDiscountBinding) {
        View view = receiptDiscountBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21305a = receiptDiscountBinding;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        if (entry instanceof Discount) {
            ReceiptDiscountBinding receiptDiscountBinding = this.f21305a;
            Discount discount = (Discount) entry;
            receiptDiscountBinding.y.setText(DiscountUtilKt.a(discount.b));
            receiptDiscountBinding.z.setText(BigDecimalExtKt.a(discount.c));
            receiptDiscountBinding.l();
        }
    }
}
