package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.databinding.ReceiptDatetimeBinding;
import com.woolworths.scanlibrary.ui.receipt.adapter.DateTime;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import com.woolworths.scanlibrary.util.extensions.DateExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/DateTimeViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DateTimeViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptDatetimeBinding f21304a;

    /* JADX WARN: Illegal instructions before constructor call */
    public DateTimeViewHolder(ReceiptDatetimeBinding receiptDatetimeBinding) {
        View view = receiptDatetimeBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21304a = receiptDatetimeBinding;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        if (entry instanceof DateTime) {
            TextView textView = this.f21304a.z;
            DateExtKt.a("EEEE d MMM yyyy", null);
            throw null;
        }
    }
}
