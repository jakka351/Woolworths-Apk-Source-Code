package au.com.woolworths.feature.shop.myorders.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.CompoundButtonBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryInstructionsData;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnCheckedChangeListener;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class EpoxyItemDeliveryInstructionsBindingImpl extends EpoxyItemDeliveryInstructionsBinding implements OnClickListener.Listener, OnCheckedChangeListener.Listener {
    public static final ViewDataBinding.IncludedLayouts M;
    public final OnClickListener I;
    public final OnClickListener J;
    public final OnCheckedChangeListener K;
    public long L;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        M = includedLayouts;
        includedLayouts.a(0, new int[]{7, 8}, new int[]{R.layout.include_horizontal_divider, R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider", "include_horizontal_divider"});
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemDeliveryInstructionsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, M, null);
        super(dataBindingComponent, view, (IncludeHorizontalDividerBinding) objArrT[7], (IncludeHorizontalDividerBinding) objArrT[8], (TextView) objArrT[2], (Button) objArrT[3], (TextView) objArrT[4], (ImageButton) objArrT[5], (TextView) objArrT[1], (SwitchMaterial) objArrT[6]);
        this.L = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = this.y;
        if (includeHorizontalDividerBinding != null) {
            includeHorizontalDividerBinding.n = this;
        }
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = this.z;
        if (includeHorizontalDividerBinding2 != null) {
            includeHorizontalDividerBinding2.n = this;
        }
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        E(view);
        this.I = new OnClickListener(this, 1);
        this.J = new OnClickListener(this, 2);
        this.K = new OnCheckedChangeListener(this, 3);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (53 == i) {
            this.G = (DeliveryInstructionsData) obj;
            synchronized (this) {
                this.L |= 4;
            }
            h(53);
            y();
            return true;
        }
        if (92 != i) {
            return false;
        }
        this.H = (OrderDetailsClickHandler) obj;
        synchronized (this) {
            this.L |= 8;
        }
        h(92);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        OrderDetailsClickHandler orderDetailsClickHandler;
        if (i != 1) {
            if (i == 2 && (orderDetailsClickHandler = this.H) != null) {
                orderDetailsClickHandler.S2();
                return;
            }
            return;
        }
        OrderDetailsClickHandler orderDetailsClickHandler2 = this.H;
        DeliveryInstructionsData deliveryInstructionsData = this.G;
        if (orderDetailsClickHandler2 == null || deliveryInstructionsData == null) {
            return;
        }
        orderDetailsClickHandler2.j3(deliveryInstructionsData.b);
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnCheckedChangeListener.Listener
    public final void c(CompoundButton compoundButton, boolean z) {
        OrderDetailsClickHandler orderDetailsClickHandler = this.H;
        if (orderDetailsClickHandler != null) {
            orderDetailsClickHandler.V3(z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        String string;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        DeliveryInstructionsData deliveryInstructionsData = this.G;
        long j2 = 20 & j;
        String str3 = null;
        if (j2 != 0) {
            if (deliveryInstructionsData != null) {
                z4 = deliveryInstructionsData.e;
                str = deliveryInstructionsData.d;
                z2 = deliveryInstructionsData.g;
                str2 = deliveryInstructionsData.f7752a;
                z5 = deliveryInstructionsData.c;
            } else {
                str = null;
                str2 = null;
                z4 = false;
                z2 = false;
                z5 = false;
            }
            Context context = this.h.getContext();
            Intrinsics.h(deliveryInstructionsData, "<this>");
            Intrinsics.h(context, "context");
            String str4 = deliveryInstructionsData.b;
            if (str4.length() == 0) {
                string = context.getString(R.string.empty_driver_instruction_placeholder);
                Intrinsics.g(string, "getString(...)");
            } else {
                string = str4;
            }
            boolean z6 = deliveryInstructionsData.h;
            boolean z7 = !z4;
            z = z5;
            z3 = z6;
            z = z;
            z = z7;
            str3 = string;
        } else {
            str = null;
            str2 = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.z.h, z);
            TextViewBindingAdapter.b(this.A, str3);
            this.B.setEnabled(z2);
            TextViewBindingAdapter.b(this.C, str);
            BindingAdaptersKt.o(this.C, z);
            BindingAdaptersKt.o(this.D, z);
            TextViewBindingAdapter.b(this.E, str2);
            CompoundButtonBindingAdapter.a(this.F, z);
            this.F.setEnabled(z3);
            BindingAdaptersKt.o(this.F, z);
        }
        if ((j & 16) != 0) {
            this.B.setOnClickListener(this.I);
            this.D.setOnClickListener(this.J);
            this.F.setOnCheckedChangeListener(this.K);
        }
        this.y.k();
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.L != 0) {
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
            this.L = 16L;
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
                this.L |= 1;
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
            this.L |= 2;
        }
        return true;
    }
}
