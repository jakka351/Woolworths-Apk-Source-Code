package au.com.woolworths.android.onesite.base.ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class StatefulButtonCheckedBindingImpl extends StatefulButtonCheckedBinding {
    public static final SparseIntArray F;
    public final ConstraintLayout D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.checked_state_fill, 1);
        sparseIntArray.put(R.id.checked_state_background, 2);
        sparseIntArray.put(R.id.checked_state_icon, 3);
        sparseIntArray.put(R.id.checked_state_text, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public StatefulButtonCheckedBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, F);
        View view2 = (View) objArrT[2];
        View view3 = (View) objArrT[1];
        super(dataBindingComponent, view, view2, view3, (TextView) objArrT[4]);
        this.E = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrT[0];
        this.D = constraintLayout;
        constraintLayout.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (251 != i) {
            return false;
        }
        L((StatefulButtonState) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.StatefulButtonCheckedBinding
    public final void L(StatefulButtonState statefulButtonState) throws Throwable {
        this.B = statefulButtonState;
        synchronized (this) {
            this.E |= 1;
        }
        h(251);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        StatefulButtonState statefulButtonState = this.B;
        long j2 = j & 3;
        boolean z = false;
        if (j2 != 0 && statefulButtonState == StatefulButtonState.g) {
            z = true;
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.D, z);
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
