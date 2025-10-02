package com.woolworths.scanlibrary.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Images;
import com.woolworths.scanlibrary.models.product.Is;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.adapter.DatabindingUtils;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import java.math.BigDecimal;

/* loaded from: classes7.dex */
public class ViewSimpleProductInfoBindingImpl extends ViewSimpleProductInfoBinding {
    public static final SparseIntArray M;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.guideline, 8);
        sparseIntArray.put(R.id.scene_container, 9);
        sparseIntArray.put(R.id.badgeView, 10);
        sparseIntArray.put(R.id.lblPromotion, 11);
        sparseIntArray.put(R.id.labelRemoveItem, 12);
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

    @Override // com.woolworths.scanlibrary.databinding.ViewSimpleProductInfoBinding
    public final void L(Boolean bool) throws Throwable {
        this.K = bool;
        synchronized (this) {
            this.L |= 1;
        }
        h(5);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.ViewSimpleProductInfoBinding
    public final void M(Item item) throws Throwable {
        this.J = item;
        synchronized (this) {
            this.L |= 2;
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
        int i;
        float f;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        float f2;
        int i2;
        int i3;
        int i4;
        int i5;
        String str6;
        float f3;
        float f4;
        String formattedUnitPriceLabel;
        String formattedDescription;
        Is itemIs;
        BigDecimal amountOfSaving;
        String linenumber;
        Images images;
        Item.Amount amount;
        int quantity;
        int cents;
        int dollars;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        Boolean bool = this.K;
        Item item = this.J;
        long j5 = j & 5;
        if (j5 != 0) {
            boolean zB = ViewDataBinding.B(bool);
            if (j5 != 0) {
                j |= zB ? 1381456L : 690728L;
            }
            dimension = this.C.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_end : R.dimen.sng_item_quantity_label_padding_end);
            drawableB2 = zB ? AppCompatResources.b(R.drawable.sng_ic_cornered_rectangle, this.C.getContext()) : null;
            dimension3 = this.C.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_bottom : R.dimen.sng_item_quantity_label_padding_bottom);
            dimension4 = this.C.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_top : R.dimen.sng_item_quantity_label_padding_top);
            if (zB) {
                j2 = 0;
                dimension2 = this.C.getResources().getDimension(R.dimen.sng_item_quantity_padding_start);
            } else {
                j2 = 0;
                dimension2 = this.C.getResources().getDimension(R.dimen.sng_item_quantity_label_padding_start);
            }
            iN = ViewDataBinding.n(zB ? R.color.sng_app_text_color : R.color.sng_gray6, this.C);
            drawableB = zB ? AppCompatResources.b(R.drawable.sng_ic_qty_arrows, this.C.getContext()) : null;
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
                itemIs = item.getItemIs();
                amountOfSaving = item.getAmountOfSaving();
                linenumber = item.getLinenumber();
                quantity = item.getQuantity();
                images = item.getImages();
                amount = item.getAmount();
            } else {
                formattedUnitPriceLabel = null;
                formattedDescription = null;
                itemIs = null;
                amountOfSaving = null;
                linenumber = null;
                images = null;
                amount = null;
                quantity = 0;
            }
            boolean zC = ItemExtKt.c(item);
            if (j6 != j2) {
                j |= zC ? llqqqql.c0063006300630063c0063 : 8192L;
            }
            boolean reducedtoclear = itemIs != null ? itemIs.getReducedtoclear() : false;
            if ((j & 6) != j2) {
                j |= reducedtoclear ? 256L : 128L;
            }
            j3 = 5;
            String str7 = String.format(this.I.getResources().getString(R.string.sng_label_saving), amountOfSaving);
            String str8 = String.format(this.B.getResources().getString(R.string.sng_transition_price_name), linenumber);
            String strValueOf = String.valueOf(linenumber);
            String strValueOf2 = String.valueOf(quantity);
            int i6 = zC ? 0 : 8;
            thumbnail = images != null ? images.getThumbnail() : null;
            if (amount != null) {
                cents = amount.getCents();
                dollars = amount.getDollars();
            } else {
                cents = 0;
                dollars = 0;
            }
            int i7 = reducedtoclear ? 0 : 8;
            long j7 = j;
            String str9 = String.format(this.C.getResources().getString(R.string.sng_product_qty), strValueOf2);
            int i8 = i7;
            i = iN;
            str3 = str7;
            i3 = i6;
            i2 = i8;
            str5 = str8;
            f = dimension;
            f2 = dimension3;
            str2 = formattedDescription;
            i4 = dollars;
            str4 = str9;
            str6 = thumbnail;
            str = formattedUnitPriceLabel;
            j4 = j7;
            thumbnail = strValueOf;
            i5 = cents;
        } else {
            j3 = 5;
            j4 = j;
            i = iN;
            f = dimension;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            f2 = dimension3;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            str6 = null;
        }
        if ((j4 & 6) != j2) {
            f4 = dimension4;
            f3 = dimension2;
            if (ViewDataBinding.s >= 21) {
                this.z.setTransitionName(thumbnail);
                this.B.setTransitionName(str5);
            }
            DatabindingUtils.a(this.z, str6);
            this.A.setVisibility(i3);
            this.B.setCents(i5);
            this.B.setDollar(i4);
            TextViewBindingAdapter.b(this.C, str4);
            TextViewBindingAdapter.b(this.D, str);
            TextViewBindingAdapter.b(this.H, str2);
            TextViewBindingAdapter.b(this.I, str3);
            this.I.setVisibility(i2);
        } else {
            f3 = dimension2;
            f4 = dimension4;
        }
        if ((j4 & j3) != j2) {
            this.C.setBackground(drawableB2);
            TextViewBindingAdapter.a(this.C, drawableB);
            ViewBindingAdapter.e(this.C, f3);
            ViewBindingAdapter.f(this.C, f4);
            ViewBindingAdapter.c(this.C, f2);
            ViewBindingAdapter.d(this.C, f);
            this.C.setTextColor(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.L != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.L = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
