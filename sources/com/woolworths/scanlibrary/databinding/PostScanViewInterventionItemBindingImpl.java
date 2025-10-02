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
public class PostScanViewInterventionItemBindingImpl extends PostScanViewInterventionItemBinding {
    public static final SparseIntArray K;
    public long J;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.weightedItemsList, 7);
        sparseIntArray.put(R.id.productView, 8);
        sparseIntArray.put(R.id.lblPromotion, 9);
        sparseIntArray.put(R.id.textView3, 10);
        sparseIntArray.put(R.id.labelRemoveItem, 11);
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

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewInterventionItemBinding
    public final void L(Boolean bool) throws Throwable {
        this.I = bool;
        synchronized (this) {
            this.J |= 1;
        }
        h(5);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewInterventionItemBinding
    public final void M(Item item) throws Throwable {
        this.H = item;
        synchronized (this) {
            this.J |= 2;
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
        Drawable drawableB;
        Drawable drawableB2;
        int iN;
        long j3;
        long j4;
        String str;
        String str2;
        String string;
        String str3;
        int dollars;
        int cents;
        Item.Amount amount;
        String formattedUnitPriceLabel;
        String formattedDescription;
        Images images;
        int quantity;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        Boolean bool = this.I;
        Item item = this.H;
        long j5 = j & 5;
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
            drawableB = null;
            drawableB2 = null;
            iN = 0;
        }
        long j6 = j & 6;
        if (j6 != j2) {
            if (item != null) {
                formattedUnitPriceLabel = item.getFormattedUnitPriceLabel();
                formattedDescription = item.getFormattedDescription();
                quantity = item.getQuantity();
                images = item.getImages();
                amount = item.getAmount();
            } else {
                amount = null;
                formattedUnitPriceLabel = null;
                formattedDescription = null;
                images = null;
                quantity = 0;
            }
            j4 = 5;
            string = this.F.getResources().getString(R.string.sng_msg_item_delete, formattedDescription);
            String strValueOf = String.valueOf(quantity);
            thumbnail = images != null ? images.getThumbnail() : null;
            if (amount != null) {
                cents = amount.getCents();
                dollars = amount.getDollars();
            } else {
                dollars = 0;
                cents = 0;
            }
            j3 = j;
            str = String.format(this.B.getResources().getString(R.string.sng_product_qty), strValueOf);
            str2 = formattedUnitPriceLabel;
            str3 = formattedDescription;
        } else {
            j3 = j;
            j4 = 5;
            str = null;
            str2 = null;
            string = null;
            str3 = null;
            dollars = 0;
            cents = 0;
        }
        if (j6 != j2) {
            DatabindingUtils.a(this.z, thumbnail);
            this.A.setCents(cents);
            this.A.setDollar(dollars);
            TextViewBindingAdapter.b(this.B, str);
            TextViewBindingAdapter.b(this.C, str2);
            TextViewBindingAdapter.b(this.F, string);
            TextViewBindingAdapter.b(this.G, str3);
        }
        if ((j3 & j4) != j2) {
            this.B.setBackground(drawableB2);
            TextViewBindingAdapter.a(this.B, drawableB);
            ViewBindingAdapter.e(this.B, dimension2);
            ViewBindingAdapter.f(this.B, dimension4);
            ViewBindingAdapter.c(this.B, dimension3);
            ViewBindingAdapter.d(this.B, dimension);
            this.B.setTextColor(iN);
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
            this.J = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
