package com.woolworths.scanlibrary.ui.receipt.adapter.viewholders;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.ui.a;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import com.woolworths.scanlibrary.databinding.ReceiptParkingVoucherBinding;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import com.woolworths.scanlibrary.ui.receipt.ReceiptActivity;
import com.woolworths.scanlibrary.ui.receipt.adapter.ParkingVoucher;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptAdapter;
import com.woolworths.scanlibrary.ui.receipt.adapter.ReceiptEntry;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/ParkingVoucherViewHolder;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/viewholders/BaseReceiptViewHolder;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ParkingVoucherViewHolder extends BaseReceiptViewHolder {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ReceiptParkingVoucherBinding f21309a;
    public final ReceiptAdapter.ReceiptAdapterListener b;

    /* JADX WARN: Illegal instructions before constructor call */
    public ParkingVoucherViewHolder(ReceiptParkingVoucherBinding receiptParkingVoucherBinding, ReceiptActivity receiptActivity) {
        View view = receiptParkingVoucherBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        super(view);
        this.f21309a = receiptParkingVoucherBinding;
        this.b = receiptActivity;
    }

    @Override // com.woolworths.scanlibrary.ui.receipt.adapter.viewholders.BaseReceiptViewHolder
    public final void c(ReceiptEntry entry) {
        Intrinsics.h(entry, "entry");
        if (entry instanceof ParkingVoucher) {
            Voucher voucher = ((ParkingVoucher) entry).b;
            String barcode = voucher.getBarcode();
            ReceiptParkingVoucherBinding receiptParkingVoucherBinding = this.f21309a;
            receiptParkingVoucherBinding.A.setText(barcode);
            receiptParkingVoucherBinding.y.a(barcode, BarcodeType.d);
            receiptParkingVoucherBinding.h.setOnClickListener(new a(23, this, voucher));
            receiptParkingVoucherBinding.l();
        }
    }
}
