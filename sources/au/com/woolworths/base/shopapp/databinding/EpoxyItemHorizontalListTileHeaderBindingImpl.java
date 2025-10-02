package au.com.woolworths.base.shopapp.databinding;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;
import au.com.woolworths.base.shopapp.generated.callback.OnClickListener;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;

/* loaded from: classes3.dex */
public class EpoxyItemHorizontalListTileHeaderBindingImpl extends EpoxyItemHorizontalListTileHeaderBinding implements OnClickListener.Listener {
    public final OnClickListener J;
    public final OnClickListener K;
    public long L;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemHorizontalListTileHeaderBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, null, null);
        super(dataBindingComponent, view, (FrameLayout) objArrT[3], (Button) objArrT[6], (Button) objArrT[4], (ProgressBar) objArrT[7], (ProgressBar) objArrT[5], (TextView) objArrT[2], (TextView) objArrT[1]);
        this.L = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.J = new OnClickListener(this, 1);
        this.K = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (3 == i) {
            this.H = (HorizontalListActionState) obj;
            synchronized (this) {
                this.L |= 1;
            }
            h(3);
            y();
            return true;
        }
        if (157 == i) {
            this.G = (HorizontalListActionClickListener) obj;
            synchronized (this) {
                this.L |= 2;
            }
            h(157);
            y();
            return true;
        }
        if (53 == i) {
            this.F = (HorizontalListDataInterface) obj;
            synchronized (this) {
                this.L |= 4;
            }
            h(53);
            y();
            return true;
        }
        if (136 != i) {
            return false;
        }
        this.I = (Boolean) obj;
        synchronized (this) {
            this.L |= 8;
        }
        h(136);
        y();
        return true;
    }

    @Override // au.com.woolworths.base.shopapp.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        if (i == 1) {
            HorizontalListActionClickListener horizontalListActionClickListener = this.G;
            HorizontalListDataInterface horizontalListDataInterface = this.F;
            if (horizontalListActionClickListener != null) {
                horizontalListActionClickListener.G0(horizontalListDataInterface);
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        HorizontalListActionClickListener horizontalListActionClickListener2 = this.G;
        HorizontalListDataInterface horizontalListDataInterface2 = this.F;
        if (horizontalListActionClickListener2 != null) {
            horizontalListActionClickListener2.G0(horizontalListDataInterface2);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        long j2;
        boolean z3;
        boolean z4;
        String str;
        long j3;
        String str2;
        String str3;
        boolean zB;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        String d;
        String e;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        HorizontalListActionState horizontalListActionState = this.H;
        HorizontalListDataInterface horizontalListDataInterface = this.F;
        Boolean bool = this.I;
        long j4 = j & 25;
        boolean z9 = false;
        if (j4 != 0) {
            z = horizontalListActionState == HorizontalListActionState.e;
            z2 = horizontalListActionState != HorizontalListActionState.d;
            if (j4 != 0) {
                j |= z ? 4352L : 2176L;
            }
            if ((j & 25) != 0) {
                j |= z2 ? 1088L : 544L;
            }
        } else {
            z = false;
            z2 = false;
        }
        long j5 = j & 21;
        if (j5 != 0) {
            if ((j & 20) != 0) {
                if (horizontalListDataInterface != null) {
                    d = horizontalListDataInterface.getD();
                    e = horizontalListDataInterface.getE();
                } else {
                    d = null;
                    e = null;
                }
                z8 = !TextUtils.isEmpty(e);
            } else {
                z8 = false;
                d = null;
                e = null;
            }
            String f = horizontalListDataInterface != null ? horizontalListDataInterface.getF() : null;
            z3 = f != null;
            if (j5 != 0) {
                j = z3 ? j | llqqqql.c0063006300630063c0063 : j | 8192;
            }
            str = d;
            str2 = f;
            j3 = 0;
            str3 = e;
            z4 = z8;
            j2 = 25;
        } else {
            j2 = 25;
            z3 = false;
            z4 = false;
            str = null;
            j3 = 0;
            str2 = null;
            str3 = null;
        }
        boolean z10 = ((j & llqqqql.c0063006300630063c0063) == j3 || horizontalListActionState == HorizontalListActionState.f) ? false : true;
        if ((j & 4896) != j3) {
            zB = ViewDataBinding.B(bool);
            z5 = (j & 288) != j3 ? !zB : false;
        } else {
            zB = false;
            z5 = false;
        }
        long j6 = j & j2;
        if (j6 != j3) {
            boolean z11 = z2 ? true : z5;
            if (!z) {
                z5 = false;
            }
            z6 = z2 ? true : zB;
            if (!z) {
                zB = false;
            }
            z7 = z11;
        } else {
            zB = false;
            z5 = false;
            z6 = false;
            z7 = false;
        }
        long j7 = j & 21;
        if (j7 != j3 && z3) {
            z9 = z10;
        }
        if (j7 != j3) {
            BindingAdaptersKt.o(this.y, z9);
        }
        if ((16 & j) != j3) {
            this.z.setOnClickListener(this.K);
            this.A.setOnClickListener(this.J);
        }
        if ((j & 20) != j3) {
            TextViewBindingAdapter.b(this.z, str2);
            TextViewBindingAdapter.b(this.A, str2);
            TextViewBindingAdapter.b(this.D, str3);
            BindingAdaptersKt.o(this.D, z4);
            TextViewBindingAdapter.b(this.E, str);
        }
        if (j6 != j3) {
            BindingAdaptersKt.j(this.z, z7);
            BindingAdaptersKt.j(this.A, z6);
            BindingAdaptersKt.o(this.B, zB);
            BindingAdaptersKt.o(this.C, z5);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.L != 0;
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
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
