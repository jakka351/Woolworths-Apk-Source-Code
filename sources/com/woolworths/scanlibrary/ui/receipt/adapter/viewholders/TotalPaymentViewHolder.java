package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ReceiptTotalPaymentBinding;
import com.woolworths.scanlibrary.models.payment.PaymentInformation;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import com.woolworths.scanlibrary.ui.receipt.adapter.TotalPayment;
import com.woolworths.scanlibrary.util.extensions.BigDecimalExtKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/TotalPaymentViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TotalPaymentViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptTotalPaymentBinding f21313a;

    /* JADX WARN: Illegal instructions before constructor call */
    public TotalPaymentViewHolder(ReceiptTotalPaymentBinding receiptTotalPaymentBinding) {
        View view = receiptTotalPaymentBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21313a = receiptTotalPaymentBinding;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        if (entry instanceof TotalPayment) {
            ReceiptTotalPaymentBinding receiptTotalPaymentBinding = this.f21313a;
            Context context = receiptTotalPaymentBinding.h.getContext();
            Receipt receipt = ((TotalPayment) entry).b;
            receiptTotalPaymentBinding.A.setText(context.getResources().getQuantityString(R.plurals.sng_receipt_totaleft_count, receipt.getTotalQuantity(), Integer.valueOf(receipt.getTotalQuantity())));
            receiptTotalPaymentBinding.C.setText(BigDecimalExtKt.a(receipt.getTotalGst()));
            if (receipt.getPaymentInfo().isEmpty()) {
                receiptTotalPaymentBinding.y.setText(context.getString(R.string.sng_label_charged_zero));
                receiptTotalPaymentBinding.y.setVisibility(0);
                receiptTotalPaymentBinding.z.setText("");
                receiptTotalPaymentBinding.z.setVisibility(0);
                TextView textView = receiptTotalPaymentBinding.B;
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.g(ZERO, "ZERO");
                textView.setText(BigDecimalExtKt.a(ZERO));
            } else {
                PaymentInformation paymentInformation = receipt.getPaymentInfo().get(0);
                String cardSuffix = paymentInformation.getCardSuffix();
                if (cardSuffix != null && cardSuffix.length() > 0) {
                    TextView textView2 = receiptTotalPaymentBinding.y;
                    String string = context.getString(R.string.sng_card_suffix);
                    Intrinsics.g(string, "getString(...)");
                    a.B(new Object[]{paymentInformation.getCardSuffix()}, 1, string, textView2);
                    receiptTotalPaymentBinding.y.setVisibility(0);
                }
                receiptTotalPaymentBinding.z.setText(paymentInformation.getScheme());
                receiptTotalPaymentBinding.z.setVisibility(0);
                receiptTotalPaymentBinding.B.setText(BigDecimalExtKt.a(paymentInformation.getAmount()));
            }
            receiptTotalPaymentBinding.l();
        }
    }
}
