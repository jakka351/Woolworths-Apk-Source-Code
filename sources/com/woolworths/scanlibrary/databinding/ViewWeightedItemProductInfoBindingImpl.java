package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Images;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.adapter.DatabindingUtils;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;

/* loaded from: classes7.dex */
public class ViewWeightedItemProductInfoBindingImpl extends ViewWeightedItemProductInfoBinding {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 8);
        sparseIntArray.put(R.id.scene_container, 9);
        sparseIntArray.put(R.id.badgeView, 10);
        sparseIntArray.put(R.id.lblPromotion, 11);
        sparseIntArray.put(R.id.labelRemoveItem, 12);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 != i) {
            return false;
        }
        L((Item) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewWeightedItemProductInfoBinding
    public final void L(Item item) throws Throwable {
        this.I = item;
        synchronized (this) {
            this.J |= 1;
        }
        h(145);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int i;
        int dollars;
        String str;
        String measure;
        String formattedDescription;
        String tareCode;
        String strValueOf;
        Images images;
        String linenumber;
        Item.Amount amount;
        Float size;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        Item item = this.I;
        long j2 = j & 3;
        int cents = 0;
        if (j2 != 0) {
            if (item != null) {
                measure = item.getMeasure();
                formattedDescription = item.getFormattedDescription();
                tareCode = item.getTareCode();
                images = item.getImages();
                linenumber = item.getLinenumber();
                amount = item.getAmount();
                size = item.getSize();
            } else {
                measure = null;
                formattedDescription = null;
                tareCode = null;
                images = null;
                linenumber = null;
                amount = null;
                size = null;
            }
            boolean zC = ItemExtKt.c(item);
            if (j2 != 0) {
                j |= zC ? 8L : 4L;
            }
            thumbnail = images != null ? images.getThumbnail() : null;
            String strValueOf2 = String.valueOf(linenumber);
            float fFloatValue = size == null ? BitmapDescriptorFactory.HUE_RED : size.floatValue();
            int i2 = zC ? 0 : 8;
            if (amount != null) {
                cents = amount.getCents();
                dollars = amount.getDollars();
            } else {
                dollars = 0;
            }
            strValueOf = String.valueOf(fFloatValue);
            int i3 = cents;
            cents = i2;
            i = i3;
            String str2 = thumbnail;
            thumbnail = strValueOf2;
            str = str2;
        } else {
            i = 0;
            dollars = 0;
            str = null;
            measure = null;
            formattedDescription = null;
            tareCode = null;
            strValueOf = null;
        }
        if ((j & 3) != 0) {
            if (ViewDataBinding.s >= 21) {
                this.z.setTransitionName(thumbnail);
            }
            DatabindingUtils.a(this.z, str);
            this.A.setVisibility(cents);
            this.B.setCents(i);
            this.B.setDollar(dollars);
            TextViewBindingAdapter.b(this.C, tareCode);
            TextViewBindingAdapter.b(this.D, strValueOf);
            TextViewBindingAdapter.b(this.E, measure);
            TextViewBindingAdapter.b(this.H, formattedDescription);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
