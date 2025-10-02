package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class ReceiptPosbarcodeBindingImpl extends ReceiptPosbarcodeBinding {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.txtStoreInfo, 1);
        sparseIntArray.put(R.id.txtStoreAddress, 2);
        sparseIntArray.put(R.id.lblTaxInvoiceAbn, 3);
        sparseIntArray.put(R.id.sectionBarcode, 4);
        sparseIntArray.put(R.id.posBarcode, 5);
        sparseIntArray.put(R.id.txtBarcode, 6);
        sparseIntArray.put(R.id.txtTransactionInfo, 7);
        sparseIntArray.put(R.id.txtTransactionTime, 8);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 1L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
