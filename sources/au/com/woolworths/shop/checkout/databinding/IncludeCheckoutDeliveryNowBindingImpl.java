package au.com.woolworths.shop.checkout.databinding;

import android.content.Context;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.shop.checkout.domain.model.DeliveryNowWindow;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.woolworths.R;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class IncludeCheckoutDeliveryNowBindingImpl extends IncludeCheckoutDeliveryNowBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts K;
    public final ConstraintLayout H;
    public final OnClickListener I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        K = includedLayouts;
        includedLayouts.a(1, new int[]{7}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeCheckoutDeliveryNowBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, K, null);
        super(dataBindingComponent, view, (IncludeBrandLabelBinding) objArrT[7], (CheckableConstraintLayout) objArrT[1], (ImageView) objArrT[2], (CheckedTextView) objArrT[5], (CheckedTextView) objArrT[6], (CheckedTextView) objArrT[4], (CheckedTextView) objArrT[3]);
        this.J = -1L;
        IncludeBrandLabelBinding includeBrandLabelBinding = this.y;
        if (includeBrandLabelBinding != null) {
            includeBrandLabelBinding.n = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.H = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.I = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            M((FulfilmentWindowsSlotListener) obj);
            return true;
        }
        if (55 != i) {
            return false;
        }
        L((DeliveryNowWindow) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutDeliveryNowBinding
    public final void L(DeliveryNowWindow deliveryNowWindow) throws Throwable {
        this.F = deliveryNowWindow;
        synchronized (this) {
            this.J |= 4;
        }
        h(55);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutDeliveryNowBinding
    public final void M(FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener) throws Throwable {
        this.G = fulfilmentWindowsSlotListener;
        synchronized (this) {
            this.J |= 2;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        DeliveryNowWindow deliveryNowWindow = this.F;
        FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.G;
        if (fulfilmentWindowsSlotListener != null) {
            fulfilmentWindowsSlotListener.G2(deliveryNowWindow);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        long j3;
        long j4;
        int i;
        boolean z;
        BrandLabel brandLabel;
        boolean z2;
        boolean zM1;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z5;
        boolean z6;
        String str7;
        Boolean bool2;
        long j5;
        String strM;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.G;
        DeliveryNowWindow deliveryNowWindow = this.F;
        if ((j & 14) != 0) {
            long j6 = j & 12;
            if (j6 != 0) {
                j2 = 14;
                if (deliveryNowWindow != null) {
                    str7 = deliveryNowWindow.f;
                    bool2 = deliveryNowWindow.l;
                    j4 = 64;
                    str3 = deliveryNowWindow.g;
                    str4 = deliveryNowWindow.c;
                    j3 = 12;
                    str5 = deliveryNowWindow.d;
                    str6 = deliveryNowWindow.e;
                } else {
                    j3 = 12;
                    j4 = 64;
                    str7 = null;
                    bool2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                }
                i = 4;
                Context context = this.h.getContext();
                z = false;
                Intrinsics.h(context, "context");
                if (deliveryNowWindow != null) {
                    brandLabel = null;
                    z2 = true;
                    j5 = j;
                    strM = CollectionsKt.M(ArraysKt.F(new CharSequence[]{null, deliveryNowWindow.c, deliveryNowWindow.d, deliveryNowWindow.e, deliveryNowWindow.f}), null, null, null, null, 63);
                } else {
                    j5 = j;
                    brandLabel = null;
                    z2 = true;
                    strM = null;
                }
                boolean z7 = bool2 == null ? z2 : false;
                boolean z8 = str6 != null ? z2 : false;
                if (j6 != 0) {
                    z3 = z7;
                    boolean z9 = z8;
                    str = strM;
                    j = z7 ? j5 | 128 : j5 | j4;
                    bool = bool2;
                    str2 = str7;
                    z4 = z9;
                } else {
                    z3 = z7;
                    bool = bool2;
                    str2 = str7;
                    z4 = z8;
                    str = strM;
                    j = j5;
                }
            } else {
                j2 = 14;
                j3 = 12;
                j4 = 64;
                i = 4;
                z = false;
                brandLabel = null;
                z2 = true;
                z3 = false;
                z4 = false;
                str = null;
                str2 = null;
                bool = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
            }
            zM1 = fulfilmentWindowsSlotListener != null ? fulfilmentWindowsSlotListener.m1(deliveryNowWindow) : z;
        } else {
            j2 = 14;
            j3 = 12;
            j4 = 64;
            i = 4;
            z = false;
            brandLabel = null;
            z2 = true;
            zM1 = false;
            z3 = false;
            z4 = false;
            str = null;
            str2 = null;
            bool = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        long j7 = j & j4;
        if (j7 != 0) {
            z5 = z2;
            z6 = ViewDataBinding.B(bool) == z5 ? z5 : z;
            if (j7 != 0) {
                j |= z6 ? 32L : 16L;
            }
        } else {
            z5 = z2;
            z6 = z;
        }
        long j8 = j & j3;
        if (j8 == 0) {
            z6 = z;
        } else if (z3) {
            z6 = z5;
        }
        if (j8 != 0) {
            this.y.L(brandLabel);
            BindingAdaptersKt.o(this.y.h, z);
            ViewBindingAdapter.b(this.z, this.I, z6);
            BindingAdaptersKt.d(this.A, str3);
            ImageView imageView = this.A;
            Intrinsics.h(imageView, "imageView");
            if (Intrinsics.c(bool, Boolean.FALSE)) {
                imageView.setColorFilter(imageView.getContext().getColor(R.color.disabled_now_window_icon_tint));
            } else {
                imageView.clearColorFilter();
            }
            this.H.setEnabled(z6);
            TextViewBindingAdapter.b(this.B, str6);
            BindingAdaptersKt.o(this.B, z4);
            TextViewBindingAdapter.b(this.C, str2);
            TextViewBindingAdapter.b(this.D, str5);
            TextViewBindingAdapter.b(this.E, str4);
            if (ViewDataBinding.s >= i) {
                this.z.setContentDescription(str);
            }
        }
        if ((j & j2) != 0) {
            this.z.setChecked(zM1);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
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
            this.J = 8L;
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
            this.J |= 1;
        }
        return true;
    }
}
