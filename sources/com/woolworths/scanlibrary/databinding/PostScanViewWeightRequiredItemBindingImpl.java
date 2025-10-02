package com.woolworths.scanlibrary.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Images;
import com.woolworths.scanlibrary.models.product.Instoreprice;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.adapter.DatabindingUtils;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;

/* loaded from: classes7.dex */
public class PostScanViewWeightRequiredItemBindingImpl extends PostScanViewWeightRequiredItemBinding {
    public static final SparseIntArray I;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(R.id.weightedItemsList, 6);
        sparseIntArray.put(R.id.productView, 7);
        sparseIntArray.put(R.id.lblPromotion, 8);
        sparseIntArray.put(R.id.labelRemoveItem, 9);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 != i) {
            return false;
        }
        L((Item) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewWeightRequiredItemBinding
    public final void L(Item item) throws Throwable {
        this.G = item;
        synchronized (this) {
            this.H |= 1;
        }
        h(145);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        int i;
        int dollars;
        String str;
        String str2;
        String description;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        Item item = this.G;
        long j3 = j & 3;
        int cents = 0;
        if (j3 != 0) {
            boolean zC = ItemExtKt.c(item);
            if (j3 != 0) {
                j |= zC ? 8L : 4L;
            }
            String formattedDescription = item.getFormattedDescription();
            description = item.getDescription();
            Item.Amount unitPrice = item.getUnitPrice();
            Instoreprice instoreprice = item.getInstoreprice();
            Images images = item.getImages();
            int i2 = zC ? 0 : 8;
            j2 = 0;
            String string = this.E.getResources().getString(R.string.sng_msg_item_delete, formattedDescription);
            if (unitPrice != null) {
                cents = unitPrice.getCents();
                dollars = unitPrice.getDollars();
            } else {
                dollars = 0;
            }
            String uom = instoreprice != null ? instoreprice.getUom() : null;
            thumbnail = images != null ? images.getThumbnail() : null;
            String str3 = String.format(this.D.getResources().getString(R.string.sng_label_uom), uom);
            str2 = string;
            str = str3;
            i = cents;
            cents = i2;
        } else {
            j2 = 0;
            i = 0;
            dollars = 0;
            str = null;
            str2 = null;
            description = null;
        }
        if ((j & 3) != j2) {
            DatabindingUtils.a(this.z, thumbnail);
            this.A.setVisibility(cents);
            this.D.setCents(i);
            this.D.setDollar(dollars);
            this.D.setUnit(str);
            TextViewBindingAdapter.b(this.E, str2);
            TextViewBindingAdapter.b(this.F, description);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
