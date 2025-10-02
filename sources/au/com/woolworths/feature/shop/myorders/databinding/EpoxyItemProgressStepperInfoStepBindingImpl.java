package au.com.woolworths.feature.shop.myorders.databinding;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.myorders.details.models.ToolTipStepInfo;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class EpoxyItemProgressStepperInfoStepBindingImpl extends EpoxyItemProgressStepperInfoStepBinding {
    public final ImageView C;
    public final View D;
    public long E;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemProgressStepperInfoStepBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
        super(dataBindingComponent, view, (TextView) objArrT[1], (TextView) objArrT[5], (TextView) objArrT[4]);
        this.E = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        ImageView imageView = (ImageView) objArrT[2];
        this.C = imageView;
        imageView.setTag(null);
        View view2 = (View) objArrT[3];
        this.D = view2;
        view2.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (255 != i) {
            return false;
        }
        this.B = (ToolTipStepInfo) obj;
        synchronized (this) {
            this.E |= 1;
        }
        h(255);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        String str;
        String str2;
        int i;
        int iN;
        boolean z;
        int i2;
        boolean z2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        ToolTipStepInfo toolTipStepInfo = this.B;
        long j3 = j & 3;
        String str3 = null;
        Boolean bool = null;
        if (j3 != 0) {
            if (toolTipStepInfo != null) {
                bool = toolTipStepInfo.f;
                str = toolTipStepInfo.h;
                str2 = toolTipStepInfo.g;
                z2 = toolTipStepInfo.e;
                i2 = toolTipStepInfo.d;
            } else {
                str = null;
                str2 = null;
                i2 = 0;
                z2 = false;
            }
            if (j3 != 0) {
                j |= z2 ? 128L : 64L;
            }
            z = bool != null;
            boolean zB = ViewDataBinding.B(bool);
            int i3 = z2 ? 0 : 4;
            String strValueOf = String.valueOf(i2);
            if ((j & 3) != 0) {
                j |= zB ? 32L : 16L;
            }
            if ((j & 3) != 0) {
                j |= !z2 ? 8L : 4L;
            }
            if (zB) {
                j2 = 0;
                iN = ViewDataBinding.n(R.color.color_accent, this.D);
            } else {
                j2 = 0;
                iN = ViewDataBinding.n(R.color.color_black_50, this.D);
            }
            str3 = strValueOf;
            i = z2 ? 4 : 0;
            i = i3;
        } else {
            j2 = 0;
            str = null;
            str2 = null;
            i = 0;
            iN = 0;
            z = false;
        }
        if ((j & 3) != j2) {
            this.C.setVisibility(i);
            this.D.setBackground(new ColorDrawable(iN));
            BindingAdaptersKt.o(this.D, z);
            TextViewBindingAdapter.b(this.y, str3);
            this.y.setVisibility(i);
            TextViewBindingAdapter.b(this.z, str);
            TextViewBindingAdapter.b(this.A, str2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
