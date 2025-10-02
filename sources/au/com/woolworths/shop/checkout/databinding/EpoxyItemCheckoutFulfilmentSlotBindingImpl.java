package au.com.woolworths.shop.checkout.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlot;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindowsSlotBadge;
import au.com.woolworths.shop.checkout.generated.callback.OnClickListener;
import au.com.woolworths.shop.checkout.ui.listener.FulfilmentWindowsSlotListener;
import au.com.woolworths.views.CheckableConstraintLayout;
import com.woolworths.R;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemCheckoutFulfilmentSlotBindingImpl extends EpoxyItemCheckoutFulfilmentSlotBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public final CheckableConstraintLayout G;
    public final OnClickListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{4, 5}, new int[]{R.layout.include_brand_label, R.layout.include_brand_label}, new String[]{"include_brand_label", "include_brand_label"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.border, 6);
        sparseIntArray.put(R.id.was_price, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemCheckoutFulfilmentSlotBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, J, K);
        IncludeBrandLabelBinding includeBrandLabelBinding = (IncludeBrandLabelBinding) objArrT[4];
        IncludeBrandLabelBinding includeBrandLabelBinding2 = (IncludeBrandLabelBinding) objArrT[5];
        CheckedTextView checkedTextView = (CheckedTextView) objArrT[3];
        CheckedTextView checkedTextView2 = (CheckedTextView) objArrT[2];
        CheckedTextView checkedTextView3 = (CheckedTextView) objArrT[1];
        super(dataBindingComponent, view, includeBrandLabelBinding, includeBrandLabelBinding2, checkedTextView, checkedTextView2, checkedTextView3);
        this.I = -1L;
        IncludeBrandLabelBinding includeBrandLabelBinding3 = this.y;
        if (includeBrandLabelBinding3 != null) {
            includeBrandLabelBinding3.n = this;
        }
        IncludeBrandLabelBinding includeBrandLabelBinding4 = this.z;
        if (includeBrandLabelBinding4 != null) {
            includeBrandLabelBinding4.n = this;
        }
        CheckableConstraintLayout checkableConstraintLayout = (CheckableConstraintLayout) objArrT[0];
        this.G = checkableConstraintLayout;
        checkableConstraintLayout.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (139 == i) {
            this.F = (Boolean) obj;
            synchronized (this) {
                this.I |= 4;
            }
            h(139);
            y();
            return true;
        }
        if (157 == i) {
            this.E = (FulfilmentWindowsSlotListener) obj;
            synchronized (this) {
                this.I |= 8;
            }
            h(157);
            y();
            return true;
        }
        if (90 != i) {
            return false;
        }
        this.D = (FulfilmentWindowsSlot) obj;
        synchronized (this) {
            this.I |= 16;
        }
        h(90);
        y();
        return true;
    }

    @Override // au.com.woolworths.shop.checkout.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        FulfilmentWindowsSlotListener fulfilmentWindowsSlotListener = this.E;
        FulfilmentWindowsSlot fulfilmentWindowsSlot = this.D;
        if (fulfilmentWindowsSlotListener != null) {
            fulfilmentWindowsSlotListener.l5(fulfilmentWindowsSlot);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        boolean z;
        boolean z2;
        FulfilmentWindowsSlotBadge fulfilmentWindowsSlotBadge;
        String str;
        String str2;
        String str3;
        StringBuilder sb;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        Boolean bool = this.F;
        FulfilmentWindowsSlot fulfilmentWindowsSlot = this.D;
        long j3 = 36 & j;
        boolean zB = j3 != 0 ? ViewDataBinding.B(bool) : false;
        long j4 = 48 & j;
        if (j4 != 0) {
            Intrinsics.h(fulfilmentWindowsSlot, "<this>");
            StringBuilder sb2 = new StringBuilder();
            FulfilmentWindowsSlotBadge fulfilmentWindowsSlotBadge2 = (FulfilmentWindowsSlotBadge) CollectionsKt.F(fulfilmentWindowsSlot.i);
            if (fulfilmentWindowsSlotBadge2 != null) {
                sb2.append(fulfilmentWindowsSlotBadge2.e.concat(", "));
            }
            List list = fulfilmentWindowsSlot.i;
            FulfilmentWindowsSlotBadge fulfilmentWindowsSlotBadge3 = list.size() >= 2 ? (FulfilmentWindowsSlotBadge) list.get(1) : null;
            if (fulfilmentWindowsSlotBadge3 != null) {
                sb2.append(fulfilmentWindowsSlotBadge3.e.concat(", "));
            }
            sb2.append(fulfilmentWindowsSlot.f10617a.concat(", "));
            sb2.append(fulfilmentWindowsSlot.b.concat(", "));
            sb2.append(fulfilmentWindowsSlot.h);
            FulfilmentWindowsSlotBadge fulfilmentWindowsSlotBadge4 = (FulfilmentWindowsSlotBadge) CollectionsKt.F(fulfilmentWindowsSlot.i);
            List list2 = fulfilmentWindowsSlot.i;
            j2 = 0;
            fulfilmentWindowsSlotBadge = list2.size() >= 2 ? (FulfilmentWindowsSlotBadge) list2.get(1) : null;
            String str4 = fulfilmentWindowsSlot.b;
            String str5 = fulfilmentWindowsSlot.h;
            boolean z3 = fulfilmentWindowsSlot.e;
            String str6 = fulfilmentWindowsSlot.f10617a;
            z2 = fulfilmentWindowsSlotBadge4 != null;
            str2 = str4;
            z = fulfilmentWindowsSlotBadge != null;
            z = z3;
            sb = sb2;
            str = str5;
            fulfilmentWindowsSlotBadge = fulfilmentWindowsSlotBadge;
            fulfilmentWindowsSlotBadge = fulfilmentWindowsSlotBadge4;
            str3 = str6;
        } else {
            j2 = 0;
            z = false;
            z2 = false;
            fulfilmentWindowsSlotBadge = null;
            str = null;
            str2 = null;
            str3 = null;
            sb = null;
        }
        if (j4 != 0) {
            this.y.L(fulfilmentWindowsSlotBadge);
            this.y.N(Boolean.valueOf(z));
            BindingAdaptersKt.o(this.y.h, z2);
            this.z.L(fulfilmentWindowsSlotBadge);
            this.z.N(Boolean.valueOf(z));
            BindingAdaptersKt.o(this.z.h, z);
            this.G.setEnabled(z);
            TextViewBindingAdapter.b(this.A, str);
            TextViewBindingAdapter.b(this.B, str2);
            TextViewBindingAdapter.b(this.C, str3);
            if (ViewDataBinding.s >= 4) {
                this.G.setContentDescription(sb);
            }
        }
        if ((j & 32) != j2) {
            this.G.setOnClickListener(this.H);
        }
        if (j3 != 0) {
            this.G.setSelected(zB);
        }
        this.y.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.y.p() || this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 32L;
        }
        this.y.r();
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 1;
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
            this.I |= 2;
        }
        return true;
    }
}
