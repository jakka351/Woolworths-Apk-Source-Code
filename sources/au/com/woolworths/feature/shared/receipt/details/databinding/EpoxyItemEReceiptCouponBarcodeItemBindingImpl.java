package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shared.receipt.details.EReceiptBarcodeTypeExtKt;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptBarcode;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptBarcodeType;
import au.com.woolworths.foundation.barcode.encoder.BarcodeType;
import au.com.woolworths.foundation.barcode.ui.BarcodeViewKt;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptCouponBarcodeItemBindingImpl extends EpoxyItemEReceiptCouponBarcodeItemBinding {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(R.id.barcode_layout, 3);
        sparseIntArray.put(R.id.placeholder, 4);
        sparseIntArray.put(R.id.barcode_barrier, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (15 != i) {
            return false;
        }
        this.C = (EReceiptBarcode) obj;
        synchronized (this) {
            this.D |= 1;
        }
        h(15);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        boolean z;
        String value;
        BarcodeType barcodeTypeA;
        EReceiptBarcodeType type;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        EReceiptBarcode eReceiptBarcode = this.C;
        long j2 = j & 3;
        String str = null;
        if (j2 != 0) {
            if (eReceiptBarcode != null) {
                type = eReceiptBarcode.getType();
                value = eReceiptBarcode.getValue();
            } else {
                value = null;
                type = null;
            }
            barcodeTypeA = EReceiptBarcodeTypeExtKt.a(type);
            boolean z2 = value == null;
            z = value != null;
            if (j2 != 0) {
                j |= z2 ? 8L : 4L;
            }
            if ((j & 3) != 0) {
                j = z ? j | 32 : j | 16;
            }
            z = z;
            z = z2;
        } else {
            z = false;
            value = null;
            barcodeTypeA = null;
        }
        long j3 = 3 & j;
        String string = j3 != 0 ? z ? this.A.getResources().getString(R.string.e_receipt_barcode_unavailable) : value : null;
        String string2 = (j & 32) != 0 ? this.A.getResources().getString(R.string.barcode_content_description, value) : null;
        if (j3 != 0) {
            if (!z) {
                string2 = this.A.getResources().getString(R.string.e_receipt_barcode_unavailable);
            }
            str = string2;
        }
        if (j3 != 0) {
            BarcodeViewKt.a(this.y, value, barcodeTypeA, this.B);
            TextViewBindingAdapter.b(this.A, string);
            if (ViewDataBinding.s >= 4) {
                this.A.setContentDescription(str);
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.D = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
