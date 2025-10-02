package au.com.woolworths.promotion.banner.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class ActivityPromotionBindingImpl extends ActivityPromotionBinding {
    public static final SparseIntArray D;
    public final TextView B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityPromotionBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, D);
        super(dataBindingComponent, view, (Toolbar) objArrT[1]);
        this.C = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[2];
        this.B = textView;
        textView.setTag(null);
        this.y.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (263 == i) {
            M((String) obj);
            return true;
        }
        if (166 != i) {
            return false;
        }
        L((String) obj);
        return true;
    }

    @Override // au.com.woolworths.promotion.banner.databinding.ActivityPromotionBinding
    public final void L(String str) throws Throwable {
        this.A = str;
        synchronized (this) {
            this.C |= 2;
        }
        h(166);
        y();
    }

    @Override // au.com.woolworths.promotion.banner.databinding.ActivityPromotionBinding
    public final void M(String str) throws Throwable {
        this.z = str;
        synchronized (this) {
            this.C |= 1;
        }
        h(263);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        String str = this.z;
        String str2 = this.A;
        long j2 = 5 & j;
        if ((j & 6) != 0) {
            BindingAdaptersKt.l(this.B, str2, false, null, null);
        }
        if (j2 != 0) {
            this.y.setTitle(str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.C = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
