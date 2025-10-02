package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Images;
import com.woolworths.scanlibrary.models.product.Instoreprice;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.adapter.DatabindingUtils;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;

/* loaded from: classes7.dex */
public class ViewWeightRequiredProductInfoBindingImpl extends ViewWeightRequiredProductInfoBinding {
    public static final SparseIntArray H;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 5);
        sparseIntArray.put(R.id.scene_container, 6);
        sparseIntArray.put(R.id.badgeView, 7);
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

    @Override // com.woolworths.scanlibrary.databinding.ViewWeightRequiredProductInfoBinding
    public final void L(Item item) throws Throwable {
        this.F = item;
        synchronized (this) {
            this.G |= 1;
        }
        h(145);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        int i;
        int dollars;
        String str;
        String formattedDescription;
        String str2;
        String str3;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        Item item = this.F;
        long j3 = j & 3;
        int cents = 0;
        if (j3 != 0) {
            boolean zC = ItemExtKt.c(item);
            if (j3 != 0) {
                j |= zC ? 8L : 4L;
            }
            formattedDescription = item.getFormattedDescription();
            Item.Amount unitPrice = item.getUnitPrice();
            Instoreprice instoreprice = item.getInstoreprice();
            Images images = item.getImages();
            String linenumber = item.getLinenumber();
            int i2 = zC ? 0 : 8;
            j2 = 0;
            str = String.format(this.B.getResources().getString(R.string.sng_transition_price_name), linenumber);
            String strValueOf = String.valueOf(linenumber);
            if (unitPrice != null) {
                cents = unitPrice.getCents();
                dollars = unitPrice.getDollars();
            } else {
                dollars = 0;
            }
            String uom = instoreprice != null ? instoreprice.getUom() : null;
            thumbnail = images != null ? images.getThumbnail() : null;
            str3 = String.format(this.B.getResources().getString(R.string.sng_label_uom), uom);
            String str4 = thumbnail;
            thumbnail = strValueOf;
            i = cents;
            cents = i2;
            str2 = str4;
        } else {
            j2 = 0;
            i = 0;
            dollars = 0;
            str = null;
            formattedDescription = null;
            str2 = null;
            str3 = null;
        }
        if ((j & 3) != j2) {
            if (ViewDataBinding.s >= 21) {
                this.z.setTransitionName(thumbnail);
                this.B.setTransitionName(str);
            }
            DatabindingUtils.a(this.z, str2);
            this.A.setVisibility(cents);
            this.B.setCents(i);
            this.B.setDollar(dollars);
            this.B.setUnit(str3);
            TextViewBindingAdapter.b(this.E, formattedDescription);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
