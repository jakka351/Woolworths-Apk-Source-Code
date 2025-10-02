package com.woolworths.scanlibrary.ui.receipt.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import com.woolworths.scanlibrary.models.receipt.Voucher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/scanlibrary/ui/receipt/adapter/ParkingVoucher;", "Lcom/woolworths/scanlibrary/ui/receipt/adapter/ReceiptEntry;", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ParkingVoucher extends ReceiptEntry {
    public final Voucher b;

    public ParkingVoucher(Voucher voucher) {
        super(10);
        this.b = voucher;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ParkingVoucher) && Intrinsics.c(this.b, ((ParkingVoucher) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ParkingVoucher(parkingVoucher=" + this.b + ")";
    }
}
