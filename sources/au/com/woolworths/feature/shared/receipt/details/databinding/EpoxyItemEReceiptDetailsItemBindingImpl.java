package au.com.woolworths.feature.shared.receipt.details.databinding;

import android.content.res.Resources;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shared.receipt.details.data.EReceiptDetailsItem;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemEReceiptDetailsItemBindingImpl extends EpoxyItemEReceiptDetailsItemBinding {
    public long D;

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 != i) {
            return false;
        }
        this.C = (EReceiptDetailsItem) obj;
        synchronized (this) {
            this.D |= 1;
        }
        h(53);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        String str;
        String str2;
        String str3;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        EReceiptDetailsItem eReceiptDetailsItem = this.C;
        long j2 = j & 3;
        String string = null;
        if (j2 != 0) {
            if (eReceiptDetailsItem != null) {
                String prefixChar = eReceiptDetailsItem.getPrefixChar();
                String description = eReceiptDetailsItem.getDescription();
                str = prefixChar;
                string = eReceiptDetailsItem.getAmount();
                str2 = description;
            } else {
                str = null;
                str2 = null;
            }
            str3 = string;
            string = this.z.getResources().getString(R.string.receipt_price_content_description, string);
        } else {
            str = null;
            str2 = null;
            str3 = null;
        }
        if (j2 != 0) {
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(string);
            }
            TextViewBindingAdapter.b(this.z, str3);
            TextViewBindingAdapter.b(this.A, str);
            TextViewBindingAdapter.b(this.B, str2);
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
