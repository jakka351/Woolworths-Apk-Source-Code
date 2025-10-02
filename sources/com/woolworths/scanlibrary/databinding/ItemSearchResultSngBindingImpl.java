package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Images;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.adapter.DatabindingUtils;

/* loaded from: classes7.dex */
public class ItemSearchResultSngBindingImpl extends ItemSearchResultSngBinding {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.imgPromotionBadge, 5);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 != i) {
            return false;
        }
        this.D = (Item) obj;
        synchronized (this) {
            this.E |= 1;
        }
        h(145);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int dollars;
        String description;
        String inStoreLocation;
        Item.Amount unitPrice;
        Images images;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        Item item = this.D;
        long j2 = j & 3;
        int cents = 0;
        String thumbnail = null;
        if (j2 != 0) {
            if (item != null) {
                unitPrice = item.getUnitPrice();
                inStoreLocation = item.getInStoreLocation();
                images = item.getImages();
                description = item.getDescription();
            } else {
                unitPrice = null;
                description = null;
                inStoreLocation = null;
                images = null;
            }
            if (unitPrice != null) {
                cents = unitPrice.getCents();
                dollars = unitPrice.getDollars();
            } else {
                dollars = 0;
            }
            if (images != null) {
                thumbnail = images.getThumbnail();
            }
        } else {
            dollars = 0;
            description = null;
            inStoreLocation = null;
        }
        if (j2 != 0) {
            this.y.setCents(cents);
            this.y.setDollar(dollars);
            DatabindingUtils.a(this.z, thumbnail);
            TextViewBindingAdapter.b(this.A, inStoreLocation);
            TextViewBindingAdapter.b(this.C, description);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
