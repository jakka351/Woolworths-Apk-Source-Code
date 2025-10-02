package com.woolworths.scanlibrary.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Item;

/* loaded from: classes7.dex */
public class PostScanViewUnknownItemBindingImpl extends PostScanViewUnknownItemBinding {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.weightedItemsList, 2);
        sparseIntArray.put(R.id.productView, 3);
        sparseIntArray.put(R.id.scene_container, 4);
        sparseIntArray.put(R.id.imageProduct, 5);
        sparseIntArray.put(R.id.labelRemoveItem, 6);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 != i) {
            return false;
        }
        L((Item) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewUnknownItemBinding
    public final void L(Item item) throws Throwable {
        this.A = item;
        synchronized (this) {
            this.B |= 1;
        }
        h(145);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        Item item = this.A;
        long j2 = j & 3;
        if (j2 != 0) {
            string = this.z.getResources().getString(R.string.sng_msg_item_delete, item != null ? item.getFormattedDescription() : null);
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.z, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
