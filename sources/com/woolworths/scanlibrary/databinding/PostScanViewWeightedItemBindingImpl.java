package com.woolworths.scanlibrary.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import com.woolworths.scanlibrary.models.product.Images;
import com.woolworths.scanlibrary.models.product.Instoreprice;
import com.woolworths.scanlibrary.models.product.Item;
import com.woolworths.scanlibrary.util.adapter.DatabindingUtils;
import com.woolworths.scanlibrary.util.extensions.ItemExtKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public class PostScanViewWeightedItemBindingImpl extends PostScanViewWeightedItemBinding {
    public static final SparseIntArray L;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.weightedItemsList, 8);
        sparseIntArray.put(R.id.productView, 9);
        sparseIntArray.put(R.id.lblPromotion, 10);
        sparseIntArray.put(R.id.labelRemoveItem, 11);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (145 == i) {
            M((Item) obj);
            return true;
        }
        if (95 != i) {
            return false;
        }
        L((Boolean) obj);
        return true;
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewWeightedItemBinding
    public final void L(Boolean bool) throws Throwable {
        this.J = bool;
        synchronized (this) {
            this.K |= 2;
        }
        h(95);
        y();
    }

    @Override // com.woolworths.scanlibrary.databinding.PostScanViewWeightedItemBinding
    public final void M(Item item) throws Throwable {
        this.I = item;
        synchronized (this) {
            this.K |= 1;
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
        String str3;
        String description;
        Resources resources;
        int i2;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        Item item = this.I;
        Boolean bool = this.J;
        long j3 = j & 5;
        float dimension = BitmapDescriptorFactory.HUE_RED;
        int cents = 0;
        if (j3 != 0) {
            boolean zC = ItemExtKt.c(item);
            if (j3 != 0) {
                j |= zC ? 16L : 8L;
            }
            String formattedDescription = item.getFormattedDescription();
            description = item.getDescription();
            Instoreprice instoreprice = item.getInstoreprice();
            Images images = item.getImages();
            Item.Amount amount = item.getAmount();
            Float size = item.getSize();
            int i3 = zC ? 0 : 8;
            j2 = 0;
            String string = this.G.getResources().getString(R.string.sng_msg_item_delete, formattedDescription);
            float fFloatValue = size == null ? 0.0f : size.floatValue();
            double pricegst = instoreprice != null ? instoreprice.getPricegst() : 0.0d;
            thumbnail = images != null ? images.getThumbnail() : null;
            if (amount != null) {
                cents = amount.getCents();
                dollars = amount.getDollars();
            } else {
                dollars = 0;
            }
            String str4 = String.format(this.C.getResources().getString(R.string.sng_measure_weight), Float.valueOf(fFloatValue));
            str2 = String.format(this.B.getResources().getString(R.string.price_per_kg), Double.valueOf(pricegst));
            str = str4;
            i = cents;
            cents = i3;
            str3 = string;
        } else {
            j2 = 0;
            i = 0;
            dollars = 0;
            str = null;
            str2 = null;
            str3 = null;
            description = null;
        }
        long j4 = j & 6;
        if (j4 != j2) {
            boolean zB = ViewDataBinding.B(bool);
            if (j4 != j2) {
                j |= zB ? 64L : 32L;
            }
            if (zB) {
                resources = this.A.getResources();
                i2 = R.dimen.sng_promotion_badge_size_small;
            } else {
                resources = this.A.getResources();
                i2 = R.dimen.sng_promotion_badge_size;
            }
            dimension = resources.getDimension(i2);
        }
        if ((j & 5) != j2) {
            DatabindingUtils.a(this.z, thumbnail);
            this.A.setVisibility(cents);
            TextViewBindingAdapter.b(this.B, str2);
            TextViewBindingAdapter.b(this.C, str);
            this.F.setCents(i);
            this.F.setDollar(dollars);
            TextViewBindingAdapter.b(this.G, str3);
            TextViewBindingAdapter.b(this.H, description);
        }
        if ((j & 6) != j2) {
            ImageView view = this.A;
            Intrinsics.h(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int i4 = (int) dimension;
            layoutParams.height = i4;
            view.setLayoutParams(layoutParams);
            ImageView view2 = this.A;
            Intrinsics.h(view2, "view");
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            layoutParams2.height = i4;
            view2.setLayoutParams(layoutParams2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.K = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
