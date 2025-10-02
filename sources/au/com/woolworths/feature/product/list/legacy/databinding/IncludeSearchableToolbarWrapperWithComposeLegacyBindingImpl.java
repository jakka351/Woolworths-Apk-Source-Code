package au.com.woolworths.feature.product.list.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnFocusChangeListener;
import com.google.android.material.appbar.AppBarLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeSearchableToolbarWrapperWithComposeLegacyBindingImpl extends IncludeSearchableToolbarWrapperWithComposeLegacyBinding implements OnFocusChangeListener.Listener {
    public static final SparseIntArray F;
    public final OnFocusChangeListener D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.search_card, 3);
        sparseIntArray.put(R.id.vps_entry_point, 4);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeSearchableToolbarWrapperWithComposeLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 5, null, F);
        super(dataBindingComponent, view, (ConstraintLayout) objArrT[3], (SearchView) objArrT[1], (Toolbar) objArrT[2], (ComposeView) objArrT[4]);
        this.E = -1L;
        ((AppBarLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.D = new OnFocusChangeListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (182 == i) {
            L((View.OnFocusChangeListener) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.IncludeSearchableToolbarWrapperWithComposeLegacyBinding
    public final void L(View.OnFocusChangeListener onFocusChangeListener) throws Throwable {
        this.C = onFocusChangeListener;
        synchronized (this) {
            this.E |= 1;
        }
        h(182);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        if ((j & 4) != 0) {
            this.z.setOnQueryTextFocusChangeListener(this.D);
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
            this.E = 4L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
