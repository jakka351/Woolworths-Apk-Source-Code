package com.woolworths.scanlibrary.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Images;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.adapter.DatabindingUtils;

/* loaded from: classes7.dex */
public class ViewInterventionProductInfoBindingImpl extends ViewInterventionProductInfoBinding {
    public static final SparseIntArray J;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 6);
        sparseIntArray.put(R.id.scene_container, 7);
        sparseIntArray.put(R.id.badgeView, 8);
        sparseIntArray.put(R.id.lblPromotion, 9);
        sparseIntArray.put(R.id.labelRemoveItem, 10);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (5 == i) {
            L((Boolean) obj);
            return true;
        }
        if (145 != i) {
            return false;
        }
        M((Item) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewInterventionProductInfoBinding
    public final void L(Boolean bool) throws Throwable {
        this.H = bool;
        synchronized (this) {
            this.I |= 1;
        }
        h(5);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewInterventionProductInfoBinding
    public final void M(Item item) throws Throwable {
        this.G = item;
        synchronized (this) {
            this.I |= 2;
        }
        h(145);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        float dimension;
        float dimension2;
        float dimension3;
        float dimension4;
        int iN;
        Drawable drawableB;
        Drawable drawableB2;
        long j3;
        long j4;
        int dollars;
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        int i2;
        float f;
        int quantity;
        Item.Amount amount;
        String formattedUnitPriceLabel;
        String formattedDescription;
        String linenumber;
        Images images;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        Boolean bool = this.H;
        Item item = this.G;
        long j5 = j & 5;
        int cents = 0;
        if (j5 != 0) {
            boolean zB = ViewDataBinding.B(bool);
            if (j5 != 0) {
                j |= zB ? 87376L : 43688L;
            }
            dimension = this.B.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_end : R.dimen.sng_item_quantity_label_padding_end);
            drawableB2 = zB ? AppCompatResources.b(R.drawable.sng_ic_cornered_rectangle, this.B.getContext()) : null;
            dimension3 = this.B.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_bottom : R.dimen.sng_item_quantity_label_padding_bottom);
            dimension4 = this.B.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_top : R.dimen.sng_item_quantity_label_padding_top);
            if (zB) {
                j2 = 0;
                dimension2 = this.B.getResources().getDimension(R.dimen.sng_item_quantity_padding_start);
            } else {
                j2 = 0;
                dimension2 = this.B.getResources().getDimension(R.dimen.sng_item_quantity_label_padding_start);
            }
            iN = ViewDataBinding.n(zB ? R.color.sng_app_text_color : R.color.sng_gray6, this.B);
            drawableB = zB ? AppCompatResources.b(R.drawable.sng_ic_qty_arrows, this.B.getContext()) : null;
        } else {
            j2 = 0;
            dimension = BitmapDescriptorFactory.HUE_RED;
            dimension2 = 0.0f;
            dimension3 = 0.0f;
            dimension4 = 0.0f;
            iN = 0;
            drawableB = null;
            drawableB2 = null;
        }
        int i3 = ((j & 6) > j2 ? 1 : ((j & 6) == j2 ? 0 : -1));
        if (i3 != 0) {
            if (item != null) {
                formattedUnitPriceLabel = item.getFormattedUnitPriceLabel();
                formattedDescription = item.getFormattedDescription();
                linenumber = item.getLinenumber();
                quantity = item.getQuantity();
                images = item.getImages();
                amount = item.getAmount();
            } else {
                quantity = 0;
                amount = null;
                formattedUnitPriceLabel = null;
                formattedDescription = null;
                linenumber = null;
                images = null;
            }
            j4 = 5;
            str3 = String.format(this.A.getResources().getString(R.string.sng_transition_price_name), linenumber);
            String strValueOf = String.valueOf(linenumber);
            String strValueOf2 = String.valueOf(quantity);
            thumbnail = images != null ? images.getThumbnail() : null;
            if (amount != null) {
                cents = amount.getCents();
                dollars = amount.getDollars();
            } else {
                dollars = 0;
            }
            j3 = j;
            str4 = String.format(this.B.getResources().getString(R.string.sng_product_qty), strValueOf2);
            str = formattedUnitPriceLabel;
            i = i3;
            str5 = thumbnail;
            thumbnail = strValueOf;
            str2 = formattedDescription;
        } else {
            j3 = j;
            j4 = 5;
            dollars = 0;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            i = i3;
            str5 = null;
        }
        if (i != 0) {
            i2 = iN;
            f = dimension;
            if (ViewDataBinding.s >= 21) {
                this.z.setTransitionName(thumbnail);
                this.A.setTransitionName(str3);
            }
            DatabindingUtils.a(this.z, str5);
            this.A.setCents(cents);
            this.A.setDollar(dollars);
            TextViewBindingAdapter.b(this.B, str4);
            TextViewBindingAdapter.b(this.C, str);
            TextViewBindingAdapter.b(this.F, str2);
        } else {
            i2 = iN;
            f = dimension;
        }
        if ((j3 & j4) != j2) {
            this.B.setBackground(drawableB2);
            TextViewBindingAdapter.a(this.B, drawableB);
            ViewBindingAdapter.e(this.B, dimension2);
            ViewBindingAdapter.f(this.B, dimension4);
            ViewBindingAdapter.c(this.B, dimension3);
            ViewBindingAdapter.d(this.B, f);
            this.B.setTextColor(i2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
