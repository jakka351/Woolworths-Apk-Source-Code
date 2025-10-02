package au.com.woolworths.feature.rewards.account.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public class EpoxyItemAccountHomeOptionBindingImpl extends EpoxyItemAccountHomeOptionBinding implements OnClickListener.Listener {
    public final ConstraintLayout I;
    public final TextView J;
    public final OnClickListener K;
    public long L;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemAccountHomeOptionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 6, null, null);
        super(dataBindingComponent, view, (ProgressBar) objArrT[5], (TextView) objArrT[3], (ImageView) objArrT[2], (ImageView) objArrT[4]);
        this.L = -1L;
        this.y.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        TextView textView = (TextView) objArrT[1];
        this.J = textView;
        textView.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        E(view);
        this.K = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (234 == i) {
            this.E = (Boolean) obj;
            synchronized (this) {
                this.L |= 1;
            }
            h(234);
            y();
            return true;
        }
        if (232 == i) {
            this.D = (Boolean) obj;
            synchronized (this) {
                this.L |= 2;
            }
            h(232);
            y();
            return true;
        }
        if (233 == i) {
            this.G = (Boolean) obj;
            synchronized (this) {
                this.L |= 4;
            }
            h(233);
            y();
            return true;
        }
        if (263 == i) {
            this.C = (Text) obj;
            synchronized (this) {
                this.L |= 8;
            }
            h(263);
            y();
            return true;
        }
        if (177 == i) {
            this.H = (Function0) obj;
            synchronized (this) {
                this.L |= 16;
            }
            h(177);
            y();
            return true;
        }
        if (231 != i) {
            return false;
        }
        this.F = (Boolean) obj;
        synchronized (this) {
            this.L |= 32;
        }
        h(231);
        y();
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        Function0 function0 = this.H;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        Boolean bool = this.E;
        Boolean bool2 = this.D;
        Boolean bool3 = this.G;
        Text text = this.C;
        Boolean bool4 = this.F;
        long j2 = j & 65;
        boolean zBooleanValue = false;
        if (j2 != 0) {
            z = bool == null;
            if (j2 != 0) {
                j |= z ? 256L : 128L;
            }
        } else {
            z = false;
        }
        long j3 = j & 66;
        if (j3 != 0) {
            z2 = bool2 == null;
            if (j3 != 0) {
                j |= z2 ? llqqqql.c0063006300630063c0063 : 8192L;
            }
        } else {
            z2 = false;
        }
        long j4 = j & 68;
        if (j4 != 0) {
            z3 = bool3 == null;
            if (j4 != 0) {
                j |= z3 ? 4096L : llqqqql.ccc00630063c0063;
            }
        } else {
            z3 = false;
        }
        CharSequence text2 = ((j & 72) == 0 || text == null) ? null : text.getText(this.h.getContext());
        long j5 = j & 96;
        if (j5 != 0) {
            z4 = bool4 == null;
            if (j5 != 0) {
                j |= z4 ? llqqqql.c00630063c0063c0063 : 512L;
            }
        } else {
            z4 = false;
        }
        long j6 = 65 & j;
        boolean zBooleanValue2 = (j6 == 0 || z) ? false : bool.booleanValue();
        long j7 = j & 96;
        boolean zBooleanValue3 = (j7 == 0 || z4) ? false : bool4.booleanValue();
        long j8 = j & 68;
        boolean zBooleanValue4 = (j8 == 0 || z3) ? false : bool3.booleanValue();
        long j9 = j & 66;
        if (j9 != 0 && !z2) {
            zBooleanValue = bool2.booleanValue();
        }
        if (j7 != 0) {
            BindingAdaptersKt.o(this.y, zBooleanValue3);
        }
        if ((64 & j) != 0) {
            this.I.setOnClickListener(this.K);
        }
        if ((j & 72) != 0) {
            TextViewBindingAdapter.b(this.J, text2);
        }
        if (j9 != 0) {
            BindingAdaptersKt.o(this.z, zBooleanValue);
        }
        if (j8 != 0) {
            BindingAdaptersKt.o(this.A, zBooleanValue4);
        }
        if (j6 != 0) {
            BindingAdaptersKt.o(this.B, zBooleanValue2);
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
            this.L = 64L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
