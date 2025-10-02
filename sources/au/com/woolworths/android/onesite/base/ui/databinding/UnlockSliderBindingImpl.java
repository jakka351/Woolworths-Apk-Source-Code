package au.com.woolworths.android.onesite.base.ui.databinding;

import android.content.res.ColorStateList;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class UnlockSliderBindingImpl extends UnlockSliderBinding {
    public static final SparseIntArray M;
    public final TextView K;
    public long L;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.slider_button_drag_area, 6);
        sparseIntArray.put(R.id.slider_button_text_center, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnlockSliderBindingImpl(DataBindingComponent dataBindingComponent, View[] viewArr) {
        Object[] objArrU = ViewDataBinding.u(dataBindingComponent, viewArr, 8, M);
        super(dataBindingComponent, viewArr[0], (ImageView) objArrU[3], (ProgressBar) objArrU[4], (View) objArrU[0], (ConstraintLayout) objArrU[2], (Space) objArrU[6], (TextView) objArrU[5], (Space) objArrU[7]);
        this.L = -1L;
        this.y.setTag(null);
        TextView textView = (TextView) objArrU[1];
        this.K = textView;
        textView.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        F(viewArr);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (24 == i) {
            L((String) obj);
            return true;
        }
        if (142 == i) {
            N(((Boolean) obj).booleanValue());
            return true;
        }
        if (25 == i) {
            M(((Integer) obj).intValue());
            return true;
        }
        if (261 != i) {
            return false;
        }
        O((String) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.UnlockSliderBinding
    public final void L(String str) throws Throwable {
        this.G = str;
        synchronized (this) {
            this.L |= 1;
        }
        h(24);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.UnlockSliderBinding
    public final void M(int i) throws Throwable {
        this.H = i;
        synchronized (this) {
            this.L |= 4;
        }
        h(25);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.UnlockSliderBinding
    public final void N(boolean z) throws Throwable {
        this.I = z;
        synchronized (this) {
            this.L |= 2;
        }
        h(142);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.UnlockSliderBinding
    public final void O(String str) throws Throwable {
        this.F = str;
        synchronized (this) {
            this.L |= 8;
        }
        h(261);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.L;
            this.L = 0L;
        }
        String str = this.G;
        boolean z = this.I;
        int i = this.H;
        String str2 = this.F;
        long j2 = 17 & j;
        long j3 = 18 & j;
        boolean z2 = j3 != 0 ? !z : false;
        long j4 = 20 & j;
        long j5 = j & 24;
        if (j3 != 0) {
            BindingAdaptersKt.o(this.y, z2);
            BindingAdaptersKt.o(this.z, z);
        }
        if (j5 != 0) {
            TextViewBindingAdapter.b(this.K, str2);
        }
        if (j4 != 0 && ViewDataBinding.s >= 21) {
            this.B.setBackgroundTintList(ColorStateList.valueOf(i));
        }
        if (j2 != 0) {
            TextViewBindingAdapter.b(this.D, str);
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
