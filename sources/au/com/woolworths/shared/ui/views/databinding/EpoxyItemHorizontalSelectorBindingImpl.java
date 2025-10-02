package au.com.woolworths.shared.ui.views.databinding;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.shared.ui.views.generated.callback.OnClickListener;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorItemClickListener;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorViewListener;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class EpoxyItemHorizontalSelectorBindingImpl extends EpoxyItemHorizontalSelectorBinding implements OnClickListener.Listener {
    public final ConstraintLayout F;
    public final OnClickListener G;
    public long H;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemHorizontalSelectorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(view, (ImageView) objArrT[2], (TextView) objArrT[1], dataBindingComponent);
        this.H = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.F = constraintLayout;
        constraintLayout.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        this.G = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (110 == i) {
            this.A = (Integer) obj;
            synchronized (this) {
                this.H |= 1;
            }
            h(110);
            y();
            return true;
        }
        if (272 == i) {
            this.B = (HorizontalSelectorViewListener) obj;
            synchronized (this) {
                this.H |= 2;
            }
            h(272);
            y();
            return true;
        }
        if (150 == i) {
            this.D = (String) obj;
            synchronized (this) {
                this.H |= 4;
            }
            h(150);
            y();
            return true;
        }
        if (37 == i) {
            this.C = (HorizontalSelectorItemClickListener) obj;
            synchronized (this) {
                this.H |= 8;
            }
            h(37);
            y();
            return true;
        }
        if (149 != i) {
            return false;
        }
        this.E = ((Integer) obj).intValue();
        synchronized (this) {
            this.H |= 16;
        }
        h(149);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.H;
            this.H = 0L;
        }
        Integer num = this.A;
        HorizontalSelectorViewListener horizontalSelectorViewListener = this.B;
        String str = this.D;
        int i = this.E;
        long j2 = 35 & j;
        boolean z = false;
        if (j2 != 0) {
            int iZ = ViewDataBinding.z(num);
            int iF5 = horizontalSelectorViewListener != null ? horizontalSelectorViewListener.f5() : 0;
            strY1 = horizontalSelectorViewListener != null ? horizontalSelectorViewListener.y1(iZ, this.h.getContext()) : null;
            if (iZ == iF5) {
                z = true;
            }
        }
        long j3 = 36 & j;
        if ((48 & j) != 0) {
            ConstraintLayout view = this.F;
            Intrinsics.h(view, "view");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.g(layoutParams, "getLayoutParams(...)");
            layoutParams.width = view.getContext().getResources().getDimensionPixelSize(i);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
            if (ViewDataBinding.s >= 4) {
                this.z.setContentDescription(strY1);
            }
        }
        if ((j & 32) != 0) {
            this.z.setOnClickListener(this.G);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.z, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.H = 32L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
