package com.woolworths.scanlibrary.databinding;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ImageView;
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
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class PostScanViewSimpleItemBindingImpl extends PostScanViewSimpleItemBinding {
    public static final SparseIntArray N;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(R.id.weightedItemsList, 9);
        sparseIntArray.put(R.id.productView, 10);
        sparseIntArray.put(R.id.lblPromotion, 11);
        sparseIntArray.put(R.id.labelRemoveItem, 12);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (5 == i) {
            L((Boolean) obj);
            return true;
        }
        if (145 == i) {
            N((Item) obj);
            return true;
        }
        if (95 != i) {
            return false;
        }
        M((Boolean) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewSimpleItemBinding
    public final void L(Boolean bool) throws Throwable {
        this.L = bool;
        synchronized (this) {
            this.M |= 1;
        }
        h(5);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewSimpleItemBinding
    public final void M(Boolean bool) throws Throwable {
        this.K = bool;
        synchronized (this) {
            this.M |= 4;
        }
        h(95);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewSimpleItemBinding
    public final void N(Item item) throws Throwable {
        this.J = item;
        synchronized (this) {
            this.M |= 2;
        }
        h(145);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        long j3;
        Drawable drawableB;
        Drawable drawableB2;
        float dimension;
        float dimension2;
        float dimension3;
        int iN;
        float dimension4;
        long j4;
        Boolean bool;
        int i;
        float f;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        float f3;
        float dimension5;
        Resources resources;
        int i6;
        String formattedUnitPriceLabel;
        String formattedDescription;
        Is itemIs;
        BigDecimal amountOfSaving;
        Images images;
        Item.Amount amount;
        int quantity;
        int cents;
        int dollars;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        Boolean bool2 = this.L;
        Item item = this.J;
        Boolean bool3 = this.K;
        long j5 = j & 9;
        if (j5 != 0) {
            boolean zB = ViewDataBinding.B(bool2);
            if (j5 != 0) {
                j |= zB ? 10627232L : 5313616L;
            }
            dimension4 = this.C.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_end : R.dimen.sng_item_quantity_label_padding_end);
            drawableB2 = zB ? AppCompatResources.b(R.drawable.sng_ic_cornered_rectangle, this.C.getContext()) : null;
            if (zB) {
                j2 = 0;
                dimension = this.C.getResources().getDimension(R.dimen.sng_item_quantity_padding_bottom);
            } else {
                j2 = 0;
                dimension = this.C.getResources().getDimension(R.dimen.sng_item_quantity_label_padding_bottom);
            }
            dimension2 = this.C.getResources().getDimension(zB ? R.dimen.sng_item_quantity_padding_top : R.dimen.sng_item_quantity_label_padding_top);
            if (zB) {
                j3 = 9;
                dimension3 = this.C.getResources().getDimension(R.dimen.sng_item_quantity_padding_start);
            } else {
                j3 = 9;
                dimension3 = this.C.getResources().getDimension(R.dimen.sng_item_quantity_label_padding_start);
            }
            iN = ViewDataBinding.n(zB ? R.color.sng_app_text_color : R.color.sng_gray6, this.C);
            drawableB = zB ? AppCompatResources.b(R.drawable.sng_ic_qty_arrows, this.C.getContext()) : null;
        } else {
            j2 = 0;
            j3 = 9;
            drawableB = null;
            drawableB2 = null;
            dimension = BitmapDescriptorFactory.HUE_RED;
            dimension2 = BitmapDescriptorFactory.HUE_RED;
            dimension3 = BitmapDescriptorFactory.HUE_RED;
            iN = 0;
            dimension4 = BitmapDescriptorFactory.HUE_RED;
        }
        long j6 = j & 10;
        if (j6 != j2) {
            if (item != null) {
                formattedUnitPriceLabel = item.getFormattedUnitPriceLabel();
                formattedDescription = item.getFormattedDescription();
                itemIs = item.getItemIs();
                amountOfSaving = item.getAmountOfSaving();
                quantity = item.getQuantity();
                images = item.getImages();
                amount = item.getAmount();
            } else {
                formattedUnitPriceLabel = null;
                formattedDescription = null;
                itemIs = null;
                amountOfSaving = null;
                images = null;
                amount = null;
                quantity = 0;
            }
            boolean zC = ItemExtKt.c(item);
            if (j6 != j2) {
                j |= zC ? llqqqql.ccccc00630063 : llqqqql.c0063006300630063c0063;
            }
            String string = this.G.getResources().getString(R.string.sng_msg_item_delete, formattedDescription);
            String str7 = String.format(this.I.getResources().getString(R.string.sng_label_saving), amountOfSaving);
            String strValueOf = String.valueOf(quantity);
            int i7 = zC ? 0 : 8;
            boolean reducedtoclear = itemIs != null ? itemIs.getReducedtoclear() : false;
            if ((j & 10) != j2) {
                j |= reducedtoclear ? 512L : 256L;
            }
            String thumbnail = images != null ? images.getThumbnail() : null;
            if (amount != null) {
                cents = amount.getCents();
                dollars = amount.getDollars();
            } else {
                cents = 0;
                dollars = 0;
            }
            long j7 = j;
            String str8 = String.format(this.C.getResources().getString(R.string.sng_product_qty), strValueOf);
            int i8 = reducedtoclear ? 0 : 8;
            bool = bool3;
            str3 = str7;
            str6 = thumbnail;
            str2 = formattedDescription;
            i4 = cents;
            i5 = dollars;
            f = dimension4;
            str5 = string;
            i3 = i7;
            i2 = i8;
            i = iN;
            str4 = str8;
            str = formattedUnitPriceLabel;
            j4 = j7;
        } else {
            j4 = j;
            bool = bool3;
            i = iN;
            f = dimension4;
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        long j8 = j4 & 12;
        if (j8 != j2) {
            boolean zB2 = ViewDataBinding.B(bool);
            if (j8 != j2) {
                j4 |= zB2 ? 524288L : llqqqql.c00630063cc00630063;
            }
            if (zB2) {
                f2 = dimension;
                resources = this.A.getResources();
                f3 = dimension2;
                i6 = R.dimen.sng_promotion_badge_size_small;
            } else {
                f2 = dimension;
                f3 = dimension2;
                resources = this.A.getResources();
                i6 = R.dimen.sng_promotion_badge_size;
            }
            dimension5 = resources.getDimension(i6);
        } else {
            f2 = dimension;
            f3 = dimension2;
            dimension5 = BitmapDescriptorFactory.HUE_RED;
        }
        if ((j4 & 10) != j2) {
            DatabindingUtils.a(this.z, str6);
            this.A.setVisibility(i3);
            this.B.setCents(i4);
            this.B.setDollar(i5);
            TextViewBindingAdapter.b(this.C, str4);
            TextViewBindingAdapter.b(this.D, str);
            TextViewBindingAdapter.b(this.G, str5);
            TextViewBindingAdapter.b(this.H, str2);
            TextViewBindingAdapter.b(this.I, str3);
            this.I.setVisibility(i2);
        }
        if ((j4 & 12) != j2) {
            ImageView view = this.A;
            Intrinsics.h(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i9 = (int) dimension5;
            layoutParams.height = i9;
            view.setLayoutParams(layoutParams);
            ImageView view2 = this.A;
            Intrinsics.h(view2, "view");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            layoutParams2.height = i9;
            view2.setLayoutParams(layoutParams2);
        }
        if ((j4 & j3) != j2) {
            this.C.setBackground(drawableB2);
            TextViewBindingAdapter.a(this.C, drawableB);
            ViewBindingAdapter.e(this.C, dimension3);
            ViewBindingAdapter.f(this.C, f3);
            ViewBindingAdapter.c(this.C, f2);
            ViewBindingAdapter.d(this.C, f);
            this.C.setTextColor(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
