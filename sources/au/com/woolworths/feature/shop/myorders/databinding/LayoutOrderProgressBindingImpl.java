package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.details.models.ProgressStepper;
import au.com.woolworths.feature.shop.myorders.details.models.StepsToolTip;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipType;
import au.com.woolworths.feature.shop.myorders.details.models.TooltipTypeKt;
import au.com.woolworths.feature.shop.myorders.details.progressstepper.ProgressStepperContainer;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.woolworths.R;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public class LayoutOrderProgressBindingImpl extends LayoutOrderProgressBinding implements OnClickListener.Listener {
    public final OnClickListener E;
    public long F;

    /* JADX WARN: Illegal instructions before constructor call */
    public LayoutOrderProgressBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[1], (ImageView) objArrT[3], (ProgressStepperContainer) objArrT[2]);
        this.F = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        E(view);
        this.E = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (209 == i) {
            M((ProgressStepper) obj);
            return true;
        }
        if (256 == i) {
            N((StepsToolTip) obj);
            return true;
        }
        if (113 != i) {
            return false;
        }
        L((Function1) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.LayoutOrderProgressBinding
    public final void L(Function1 function1) throws Throwable {
        this.C = function1;
        synchronized (this) {
            this.F |= 4;
        }
        h(113);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.LayoutOrderProgressBinding
    public final void M(ProgressStepper progressStepper) throws Throwable {
        this.B = progressStepper;
        synchronized (this) {
            this.F |= 1;
        }
        h(209);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.LayoutOrderProgressBinding
    public final void N(StepsToolTip stepsToolTip) throws Throwable {
        this.D = stepsToolTip;
        synchronized (this) {
            this.F |= 2;
        }
        h(256);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        StepsToolTip stepsToolTip = this.D;
        Function1 function1 = this.C;
        if (function1 != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        String str;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        ProgressStepper progressStepper = this.B;
        long j2 = 9 & j;
        String str2 = null;
        TooltipType tooltipType = null;
        if (j2 != 0) {
            if (progressStepper != null) {
                tooltipType = progressStepper.e;
                str = progressStepper.f7775a;
            } else {
                str = null;
            }
            int i = tooltipType == null ? -1 : TooltipTypeKt.WhenMappings.f7776a[tooltipType.ordinal()];
            int i2 = i != 1 ? i != 2 ? 0 : R.drawable.ic_complete_circle : R.drawable.ic_info_circle;
            i = tooltipType != null ? 1 : 0;
            str2 = str;
            z = i;
            i = i2;
        } else {
            z = 0;
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.y, str2);
            this.z.setImageResource(i);
            BindingAdaptersKt.o(this.z, z);
            this.A.setProgressStepper(progressStepper);
        }
        if ((j & 8) != 0) {
            this.z.setOnClickListener(this.E);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 8L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
