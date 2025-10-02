package com.woolworths.scanlibrary.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.R;

/* loaded from: classes7.dex */
public class NetworkStateItemBindingImpl extends NetworkStateItemBinding {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.error_msg, 1);
        sparseIntArray.put(R.id.progress_bar, 2);
        sparseIntArray.put(R.id.retry, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NetworkStateItemBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, C);
        super(view, (ProgressBar) objArrT[2], (TextView) objArrT[1], (TextView) objArrT[3], dataBindingComponent);
        this.B = -1L;
        ((LinearLayout) objArrT[0]).setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) {
        if (174 != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        synchronized (this) {
            this.B = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
