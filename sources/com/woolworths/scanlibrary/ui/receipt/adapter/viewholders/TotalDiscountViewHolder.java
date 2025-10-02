package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.databinding.ReceiptTotalDiscountBinding;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import com.woolworths.scanlibrary.ui.receipt.adapter.TotalDiscount;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/TotalDiscountViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TotalDiscountViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptTotalDiscountBinding f21312a;

    /* JADX WARN: Illegal instructions before constructor call */
    public TotalDiscountViewHolder(ReceiptTotalDiscountBinding receiptTotalDiscountBinding) {
        View view = receiptTotalDiscountBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21312a = receiptTotalDiscountBinding;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        if (entry instanceof TotalDiscount) {
            ReceiptTotalDiscountBinding receiptTotalDiscountBinding = this.f21312a;
            TextView textView = receiptTotalDiscountBinding.y;
            BigDecimal bigDecimalAbs = ((TotalDiscount) entry).b.abs();
            Intrinsics.g(bigDecimalAbs, "abs(...)");
            textView.setText(BigDecimalExtKt.a(bigDecimalAbs));
            receiptTotalDiscountBinding.l();
        }
    }
}
