package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.google.android.material.chip.ChipGroup;

/* loaded from: classes3.dex */
public class EpoxyItemOrderYourGroceriesFilterGroupBindingImpl extends EpoxyItemOrderYourGroceriesFilterGroupBinding {
    public final TextView B;
    public long C;

    /* JADX WARN: Illegal instructions before constructor call */
    public EpoxyItemOrderYourGroceriesFilterGroupBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 3, null, null);
        super(dataBindingComponent, view, (ChipGroup) objArrT[1]);
        this.C = -1L;
        this.y.setTag(null);
        ((LinearLayout) objArrT[0]).setTag(null);
        TextView textView = (TextView) objArrT[2];
        this.B = textView;
        textView.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (92 == i) {
            this.z = (ChipGroup.OnCheckedChangeListener) obj;
            synchronized (this) {
                this.C |= 1;
            }
            h(92);
            y();
            return true;
        }
        if (50 != i) {
            return false;
        }
        this.A = (String) obj;
        synchronized (this) {
            this.C |= 2;
        }
        h(50);
        y();
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        ChipGroup.OnCheckedChangeListener onCheckedChangeListener = this.z;
        String str = this.A;
        long j2 = 5 & j;
        long j3 = j & 6;
        if (j2 != 0) {
            this.y.setOnCheckedChangeListener(onCheckedChangeListener);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.B, str);
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
