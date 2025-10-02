package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.product.tile.ProductPriceViewKt;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnClickListener;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemDeliveryUnlimitedPlanBindingImpl extends EpoxyItemDeliveryUnlimitedPlanBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts H;
    public final OnClickListener F;
    public long G;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(6);
        H = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryUnlimitedPlanBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, H, null);
        super(dataBindingComponent, view, (IncludeBrandLabelBinding) objArrT[5], (CheckableConstraintLayout) objArrT[1], (ProductPriceView) objArrT[4], (CheckedTextView) objArrT[3], (CheckedTextView) objArrT[2]);
        this.G = -1L;
        IncludeBrandLabelBinding includeBrandLabelBinding = this.y;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.F = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (35 == i) {
            this.E = (SelectPlanClickListener) obj;
            synchronized (this) {
                this.G |= 2;
            }
            h(35);
            y();
            return true;
        }
        if (53 != i) {
            return false;
        }
        this.D = (DeliveryUnlimitedSignUpPlanUiModel) obj;
        synchronized (this) {
            this.G |= 4;
        }
        h(53);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.deliveryunlimited.signup.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        SelectPlanClickListener selectPlanClickListener = this.E;
        DeliveryUnlimitedSignUpPlanUiModel deliveryUnlimitedSignUpPlanUiModel = this.D;
        if (selectPlanClickListener != null) {
            selectPlanClickListener.y0(deliveryUnlimitedSignUpPlanUiModel);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        int i;
        BrandLabel brandLabel;
        String str;
        String str2;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        DeliveryUnlimitedSignUpPlanUiModel deliveryUnlimitedSignUpPlanUiModel = this.D;
        long j2 = 12 & j;
        boolean z2 = false;
        if (j2 != 0) {
            if (deliveryUnlimitedSignUpPlanUiModel != null) {
                str = deliveryUnlimitedSignUpPlanUiModel.b;
                z = deliveryUnlimitedSignUpPlanUiModel.f;
                str2 = deliveryUnlimitedSignUpPlanUiModel.c;
                i = deliveryUnlimitedSignUpPlanUiModel.d;
                brandLabel = deliveryUnlimitedSignUpPlanUiModel.e;
            } else {
                z = false;
                i = 0;
                brandLabel = null;
                str = null;
                str2 = null;
            }
            if (brandLabel != null) {
                z2 = true;
            }
        } else {
            z = false;
            i = 0;
            brandLabel = null;
            str = null;
            str2 = null;
        }
        if (j2 != 0) {
            this.y.L(brandLabel);
            BindingAdaptersKt.o(this.y.h, z2);
            this.z.setChecked(z);
            ProductPriceView view = this.A;
            Intrinsics.h(view, "view");
            view.setPriceChecked(z);
            ProductPriceViewKt.a(this.A, Integer.valueOf(i), null);
            TextViewBindingAdapter.b(this.B, str2);
            TextViewBindingAdapter.b(this.C, str);
        }
        if ((j & 8) != 0) {
            this.z.setOnClickListener(this.F);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.G != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 8L;
        }
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.G |= 1;
        }
        return true;
    }
}
