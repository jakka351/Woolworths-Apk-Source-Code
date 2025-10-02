package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import com.woolworths.R;
import com.woolworths.scanlibrary.databinding.ReceiptPosbarcodeBinding;
import com.woolworths.scanlibrary.models.receipt.Receipt;
import com.woolworths.scanlibrary.models.receipt.ReceiptStore;
import com.woolworths.scanlibrary.models.receipt.Transaction;
import com.woolworths.scanlibrary.ui.receipt.adapter.PosBarcode;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import com.woolworths.scanlibrary.util.extensions.DateExtKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/PosBarcodeViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PosBarcodeViewHolder extends BaseReceiptViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptPosbarcodeBinding f21310a;

    /* JADX WARN: Illegal instructions before constructor call */
    public PosBarcodeViewHolder(ReceiptPosbarcodeBinding receiptPosbarcodeBinding) {
        View view = receiptPosbarcodeBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21310a = receiptPosbarcodeBinding;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        if (entry instanceof PosBarcode) {
            ReceiptPosbarcodeBinding receiptPosbarcodeBinding = this.f21310a;
            Context context = receiptPosbarcodeBinding.h.getContext();
            Receipt receipt = ((PosBarcode) entry).b;
            ReceiptStore storeInfo = receipt.getStoreInfo();
            String barcode = receipt.getBarcode();
            Transaction transaction = receipt.getTransaction();
            TextView textView = receiptPosbarcodeBinding.B;
            String string = context.getString(R.string.sng_receipt_store_info);
            Intrinsics.g(string, "getString(...)");
            a.B(new Object[]{storeInfo.getName(), storeInfo.getId()}, 2, string, textView);
            TextView textView2 = receiptPosbarcodeBinding.A;
            String string2 = context.getString(R.string.sng_receipt_store_address);
            Intrinsics.g(string2, "getString(...)");
            a.B(new Object[]{storeInfo.getAddress(), storeInfo.getPhone()}, 2, string2, textView2);
            receiptPosbarcodeBinding.z.setText(barcode);
            Intrinsics.h(barcode, "barcode");
            Intrinsics.g(barcode.substring(0, 3), "substring(...)");
            String strSubstring = barcode.substring(3, 7);
            Intrinsics.g(strSubstring, "substring(...)");
            String strSubstring2 = barcode.substring(7, 10);
            Intrinsics.g(strSubstring2, "substring(...)");
            String strSubstring3 = barcode.substring(10, 14);
            Intrinsics.g(strSubstring3, "substring(...)");
            Intrinsics.g(barcode.substring(14, 20), "substring(...)");
            TextView textView3 = receiptPosbarcodeBinding.C;
            String string3 = context.getString(R.string.sng_receipt_barcode_info);
            Intrinsics.g(string3, "getString(...)");
            a.B(new Object[]{strSubstring, strSubstring2, strSubstring3}, 3, string3, textView3);
            receiptPosbarcodeBinding.y.a(barcode, BarcodeType.d);
            receiptPosbarcodeBinding.D.setText(DateExtKt.a("HH:mm", transaction.getTxnTime()) + "  " + DateExtKt.a("dd/MM/yyyy", transaction.getTxnTime()));
            receiptPosbarcodeBinding.l();
        }
    }
}
