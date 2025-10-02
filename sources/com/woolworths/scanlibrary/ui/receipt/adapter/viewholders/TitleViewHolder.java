package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ReceiptTitleBinding;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import com.woolworths.scanlibrary.ui.receipt.adapter.Title;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/TitleViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TitleViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptTitleBinding f21311a;

    /* JADX WARN: Illegal instructions before constructor call */
    public TitleViewHolder(ReceiptTitleBinding receiptTitleBinding) {
        View view = receiptTitleBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21311a = receiptTitleBinding;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        boolean z = entry instanceof Title;
        ReceiptTitleBinding receiptTitleBinding = this.f21311a;
        if (z) {
            TextView textView = receiptTitleBinding.z;
            String string = this.itemView.getContext().getString(R.string.sng_receipt_title);
            Intrinsics.g(string, "getString(...)");
            Title title = (Title) entry;
            String str = title.c;
            a.B(new Object[]{title.b}, 1, string, textView);
            if (str != null && !StringsKt.D(str)) {
                receiptTitleBinding.y.setVisibility(0);
                receiptTitleBinding.y.setText(str);
            }
        }
        receiptTitleBinding.l();
    }
}
