package au.com.woolworths.shop.checkout.databinding;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import androidx.lifecycle.LifecycleOwner;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.BrandLabel;
import au.com.woolworths.base.shopapp.modules.badge.BadgeApiData;
import au.com.woolworths.shop.checkout.domain.model.DirectToBootNowWindow;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.woolworths.R;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class IncludeCheckoutDirectToBootNowBindingImpl extends IncludeCheckoutDirectToBootNowBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final ConstraintLayout K;
    public final OnClickListener L;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        N = includedLayouts;
        includedLayouts.a(1, new int[]{8}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
        includedLayouts.a(3, new int[]{9}, new int[]{R.layout.include_brand_label}, new String[]{"include_brand_label"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.dtb_button_title_text, 10);
        sparseIntArray.put(R.id.dtb_divider, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeCheckoutDirectToBootNowBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, N, O);
        IncludeBrandLabelBinding includeBrandLabelBinding = (IncludeBrandLabelBinding) objArrT[8];
        LinearLayout linearLayout = (LinearLayout) objArrT[3];
        super(dataBindingComponent, view, includeBrandLabelBinding, linearLayout, (CheckableConstraintLayout) objArrT[1], (View) objArrT[11], (ImageView) objArrT[2], (CheckedTextView) objArrT[6], (CheckedTextView) objArrT[7], (CheckedTextView) objArrT[5], (CheckedTextView) objArrT[4], (IncludeBrandLabelBinding) objArrT[9]);
        this.M = -1L;
        IncludeBrandLabelBinding includeBrandLabelBinding2 = this.y;
        if (includeBrandLabelBinding2 != null) {
            includeBrandLabelBinding2.n = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.K = constraintLayout;
        constraintLayout.setTag(null);
        IncludeBrandLabelBinding includeBrandLabelBinding3 = this.H;
        if (includeBrandLabelBinding3 != null) {
            includeBrandLabelBinding3.n = this;
        }
        E(view);
        this.L = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
        this.H.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (157 == i) {
            M((FulfilmentWindowsSlotListener) obj);
            return true;
        }
        if (58 != i) {
            return false;
        }
        L((DirectToBootNowWindow) obj);
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutDirectToBootNowBinding
    public final void L(DirectToBootNowWindow directToBootNowWindow) throws Throwable {
        this.I = directToBootNowWindow;
        synchronized (this) {
            this.M |= 8;
        }
        h(58);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.databinding.IncludeCheckoutDirectToBootNowBinding
    public final void M(FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener) throws Throwable {
        this.J = fulfilmentWindowsSlotListener;
        synchronized (this) {
            this.M |= 4;
        }
        h(157);
        y();
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        DirectToBootNowWindow directToBootNowWindow = this.I;
        FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.J;
        if (fulfilmentWindowsSlotListener != null) {
            fulfilmentWindowsSlotListener.B0(directToBootNowWindow);
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
        boolean zB4;
        boolean z3;
        boolean z4;
        boolean z5;
        String str;
        String str2;
        BadgeApiData badgeApiData;
        Boolean bool;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z6;
        boolean z7;
        String str7;
        BadgeApiData badgeApiData2;
        Boolean bool2;
        long j5;
        String strM;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.J;
        DirectToBootNowWindow directToBootNowWindow = this.I;
        if ((j & 28) != 0) {
            long j6 = j & 24;
            if (j6 != 0) {
                j2 = 28;
                if (directToBootNowWindow != null) {
                    str7 = directToBootNowWindow.d;
                    badgeApiData2 = directToBootNowWindow.j;
                    j4 = 32;
                    str3 = directToBootNowWindow.e;
                    str4 = directToBootNowWindow.g;
                    j3 = 24;
                    str5 = directToBootNowWindow.f;
                    str6 = directToBootNowWindow.c;
                    i = 4;
                    bool2 = directToBootNowWindow.i;
                } else {
                    j3 = 24;
                    j4 = 32;
                    i = 4;
                    str7 = null;
                    badgeApiData2 = null;
                    bool2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                }
                z = false;
                Context context = this.h.getContext();
                brandLabel = null;
                Intrinsics.h(context, "context");
                if (directToBootNowWindow != null) {
                    BadgeApiData badgeApiData3 = directToBootNowWindow.j;
                    String label = badgeApiData3 != null ? badgeApiData3.getLabel() : null;
                    String str8 = directToBootNowWindow.c;
                    z2 = true;
                    String str9 = directToBootNowWindow.d;
                    j5 = j;
                    String str10 = directToBootNowWindow.e;
                    String str11 = directToBootNowWindow.f;
                    CharSequence[] charSequenceArr = new CharSequence[6];
                    charSequenceArr[0] = null;
                    charSequenceArr[1] = label;
                    charSequenceArr[2] = str8;
                    charSequenceArr[3] = str9;
                    charSequenceArr[i] = str10;
                    charSequenceArr[5] = str11;
                    strM = CollectionsKt.M(ArraysKt.F(charSequenceArr), null, null, null, null, 63);
                } else {
                    j5 = j;
                    z2 = true;
                    strM = null;
                }
                boolean z8 = badgeApiData2 != null ? z2 : false;
                boolean z9 = str3 != null ? z2 : false;
                boolean z10 = bool2 == null ? z2 : false;
                if (j6 != 0) {
                    j5 = z10 ? j5 | 64 : j5 | j4;
                }
                str2 = str7;
                bool = bool2;
                z4 = z9;
                badgeApiData = badgeApiData2;
                str = strM;
                z5 = z10;
                z3 = z8;
                j = j5;
            } else {
                j2 = 28;
                j3 = 24;
                j4 = 32;
                i = 4;
                z = false;
                brandLabel = null;
                z2 = true;
                z3 = false;
                z4 = false;
                z5 = false;
                str = null;
                str2 = null;
                badgeApiData = null;
                bool = null;
                str3 = null;
                str4 = null;
                str5 = null;
                str6 = null;
            }
            zB4 = fulfilmentWindowsSlotListener != null ? fulfilmentWindowsSlotListener.b4(directToBootNowWindow) : z;
        } else {
            j2 = 28;
            j3 = 24;
            j4 = 32;
            i = 4;
            z = false;
            brandLabel = null;
            z2 = true;
            zB4 = false;
            z3 = false;
            z4 = false;
            z5 = false;
            str = null;
            str2 = null;
            badgeApiData = null;
            bool = null;
            str3 = null;
            str4 = null;
            str5 = null;
            str6 = null;
        }
        long j7 = j & j4;
        long j8 = j;
        if (j7 != 0) {
            z6 = z2;
            z7 = ViewDataBinding.B(bool) == z6 ? z6 : z;
            if (j7 != 0) {
                j8 |= z7 ? 256L : 128L;
            }
        } else {
            z6 = z2;
            z7 = z;
        }
        long j9 = j8 & j3;
        if (j9 == 0) {
            z7 = z;
        } else if (z5) {
            z7 = z6;
        }
        if (j9 != 0) {
            this.y.L(brandLabel);
            BindingAdaptersKt.o(this.y.h, z);
            ViewBindingAdapter.b(this.A, this.L, z7);
            BindingAdaptersKt.d(this.C, str4);
            ImageView imageView = this.C;
            Intrinsics.h(imageView, "imageView");
            if (Intrinsics.c(bool, Boolean.FALSE)) {
                imageView.setColorFilter(imageView.getContext().getColor(R.color.disabled_now_window_icon_tint));
            } else {
                imageView.clearColorFilter();
            }
            TextViewBindingAdapter.b(this.D, str3);
            BindingAdaptersKt.o(this.D, z4);
            TextViewBindingAdapter.b(this.E, str5);
            TextViewBindingAdapter.b(this.F, str2);
            TextViewBindingAdapter.b(this.G, str6);
            this.K.setEnabled(z7);
            this.H.L(badgeApiData);
            BindingAdaptersKt.o(this.H.h, z3);
            if (ViewDataBinding.s >= i) {
                this.A.setContentDescription(str);
            }
        }
        if ((j8 & j2) != 0) {
            this.A.setChecked(zB4);
        }
        this.y.k();
        this.H.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.y.p() || this.H.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 16L;
        }
        this.y.r();
        this.H.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.M |= 2;
        }
        return true;
    }
}
