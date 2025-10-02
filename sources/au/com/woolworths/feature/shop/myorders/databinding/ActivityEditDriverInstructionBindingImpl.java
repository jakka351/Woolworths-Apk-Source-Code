package au.com.woolworths.feature.shop.myorders.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnTextChanged;
import au.com.woolworths.feature.shop.myorders.generated.callback.StatefulButtonClickHandler;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityEditDriverInstructionBindingImpl extends ActivityEditDriverInstructionBinding implements OnTextChanged.Listener, StatefulButtonClickHandler.Listener {
    public static final SparseIntArray F;
    public final OnTextChanged C;
    public final StatefulButtonClickHandler D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 3);
        sparseIntArray.put(R.id.toolbar, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityEditDriverInstructionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, F);
        super(dataBindingComponent, view, (EditText) objArrT[1], (StatefulButton) objArrT[2], (Toolbar) objArrT[4]);
        this.E = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        this.C = new OnTextChanged(this);
        this.D = new StatefulButtonClickHandler(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((EditDriverInstructionsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.ActivityEditDriverInstructionBinding
    public final void L(EditDriverInstructionsViewModel editDriverInstructionsViewModel) throws Throwable {
        this.B = editDriverInstructionsViewModel;
        synchronized (this) {
            this.E |= 2;
        }
        h(273);
        y();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    @Override // androidx.databinding.ViewDataBinding
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = r9.E     // Catch: java.lang.Throwable -> L49
            r2 = 0
            r9.E = r2     // Catch: java.lang.Throwable -> L49
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L49
            au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel r4 = r9.B
            r5 = 7
            long r5 = r5 & r0
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            r6 = 0
            if (r5 == 0) goto L2b
            if (r4 == 0) goto L17
            androidx.lifecycle.MutableLiveData r4 = r4.k
            goto L18
        L17:
            r4 = r6
        L18:
            r7 = 0
            r9.I(r7, r4)
            if (r4 == 0) goto L25
            java.lang.Object r4 = r4.e()
            au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsContract$ViewState r4 = (au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsContract.ViewState) r4
            goto L26
        L25:
            r4 = r6
        L26:
            if (r4 == 0) goto L2b
            au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState r4 = r4.f7828a
            goto L2c
        L2b:
            r4 = r6
        L2c:
            r7 = 4
            long r0 = r0 & r7
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L41
            android.widget.EditText r0 = r9.y
            au.com.woolworths.feature.shop.myorders.generated.callback.OnTextChanged r1 = r9.C
            androidx.databinding.adapters.TextViewBindingAdapter.c(r0, r1, r6)
            au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton r0 = r9.z
            au.com.woolworths.feature.shop.myorders.generated.callback.StatefulButtonClickHandler r1 = r9.D
            r0.setClickHandler(r1)
        L41:
            if (r5 == 0) goto L48
            au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton r0 = r9.z
            r0.setStatefulButtonState(r4)
        L48:
            return
        L49:
            r0 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L49
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.myorders.databinding.ActivityEditDriverInstructionBindingImpl.j():void");
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
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.E |= 1;
        }
        return true;
    }
}
