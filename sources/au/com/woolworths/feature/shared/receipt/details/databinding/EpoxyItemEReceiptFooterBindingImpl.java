package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shared.receipt.details.EReceiptBarcodeTypeExtKt;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptBarcode;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptBarcodeType;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailFooter;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import au.com.woolworths.foundation.barcode.ui.BarcodeViewKt;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptFooterBindingImpl extends EpoxyItemEReceiptFooterBinding {
    public static final SparseIntArray G;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.ereceipt_details_footer, 5);
        sparseIntArray.put(R.id.barcode_layout, 6);
        sparseIntArray.put(R.id.placeholder, 7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (134 == i) {
            ((Boolean) obj).getClass();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.E = (EReceiptDetailFooter) obj;
        synchronized (this) {
            this.F |= 2;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String abnAndStore;
        String transactionDetails;
        String value;
        BarcodeType barcodeTypeA;
        EReceiptBarcode barcode;
        EReceiptBarcodeType type;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        EReceiptDetailFooter eReceiptDetailFooter = this.E;
        long j2 = j & 6;
        if (j2 != 0) {
            if (eReceiptDetailFooter != null) {
                transactionDetails = eReceiptDetailFooter.getTransactionDetails();
                barcode = eReceiptDetailFooter.getBarcode();
                abnAndStore = eReceiptDetailFooter.getAbnAndStore();
            } else {
                abnAndStore = null;
                transactionDetails = null;
                barcode = null;
            }
            if (barcode != null) {
                type = barcode.getType();
                value = barcode.getValue();
            } else {
                value = null;
                type = null;
            }
            barcodeTypeA = EReceiptBarcodeTypeExtKt.a(type);
            z = value != null;
            z = value == null;
            if (j2 != 0) {
                j = z ? j | 16 : j | 8;
            }
            if ((j & 6) != 0) {
                j |= z ? 64L : 32L;
            }
        } else {
            z = false;
            abnAndStore = null;
            transactionDetails = null;
            value = null;
            barcodeTypeA = null;
        }
        String string = (j & 16) != 0 ? this.B.getResources().getString(R.string.barcode_content_description, value) : null;
        long j3 = j & 6;
        String string2 = j3 != 0 ? z ? this.B.getResources().getString(R.string.e_receipt_barcode_unavailable) : value : null;
        String string3 = j3 != 0 ? z ? string : this.B.getResources().getString(R.string.e_receipt_barcode_unavailable) : null;
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.y, abnAndStore);
            BarcodeViewKt.a(this.z, value, barcodeTypeA, this.C);
            TextViewBindingAdapter.b(this.B, string2);
            TextViewBindingAdapter.b(this.D, transactionDetails);
            if (ViewDataBinding.s >= 4) {
                this.B.setContentDescription(string3);
            }
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
            this.F = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
