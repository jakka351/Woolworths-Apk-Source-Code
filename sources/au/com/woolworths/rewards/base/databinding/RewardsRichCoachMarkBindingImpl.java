package au.com.woolworths.rewards.base.databinding;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public class RewardsRichCoachMarkBindingImpl extends RewardsRichCoachMarkBinding {
    public final TextView H;
    public final TextView I;
    public long J;

    /* JADX WARN: Illegal instructions before constructor call */
    public RewardsRichCoachMarkBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 11, null, null);
        super(dataBindingComponent, view, (ImageButton) objArrT[3], (ConstraintLayout) objArrT[6], (TextView) objArrT[4], (Button) objArrT[7], (Button) objArrT[10], (Space) objArrT[5], (Space) objArrT[2], (TextView) objArrT[1]);
        this.J = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[8];
        this.H = textView;
        textView.setTag(null);
        TextView textView2 = (TextView) objArrT[9];
        this.I = textView2;
        textView2.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (38 == i) {
            synchronized (this) {
                this.J |= 1;
            }
            h(38);
            y();
            return true;
        }
        if (242 != i) {
            return false;
        }
        this.G = (Boolean) obj;
        synchronized (this) {
            this.J |= 2;
        }
        h(242);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        Drawable drawableB;
        Context context;
        int i;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        Boolean bool = this.G;
        long j2 = j & 5;
        if (j2 != 0) {
            if (j2 != 0) {
                j |= 32;
            }
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        long j3 = j & 6;
        if (j3 != 0) {
            boolean zB = ViewDataBinding.B(bool);
            if (j3 != 0) {
                j |= zB ? 16L : 8L;
            }
            if (zB) {
                context = this.y.getContext();
                i = R.drawable.ic_close_dark;
            } else {
                context = this.y.getContext();
                i = R.drawable.ic_round_close;
            }
            drawableB = AppCompatResources.b(i, context);
        } else {
            drawableB = null;
        }
        long j4 = 5 & j;
        if ((j & 6) != 0) {
            ImageButton view = this.y;
            Intrinsics.h(view, "view");
            view.setImageDrawable(drawableB);
        }
        if (j4 != 0) {
            BindingAdaptersKt.o(this.z, false);
            TextViewBindingAdapter.b(this.A, null);
            BindingAdaptersKt.o(this.A, false);
            TextViewBindingAdapter.b(this.B, null);
            BindingAdaptersKt.j(this.B, z2);
            BindingAdaptersKt.j(this.H, false);
            TextViewBindingAdapter.b(this.H, null);
            BindingAdaptersKt.j(this.I, z2);
            TextViewBindingAdapter.b(this.I, null);
            TextViewBindingAdapter.b(this.C, null);
            BindingAdaptersKt.j(this.C, z);
            BindingAdaptersKt.o(this.D, false);
            BindingAdaptersKt.o(this.E, false);
            TextViewBindingAdapter.b(this.F, null);
            BindingAdaptersKt.o(this.F, false);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.J != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
