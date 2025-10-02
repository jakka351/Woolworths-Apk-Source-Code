package au.com.woolworths.feature.product.list.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.product.list.generated.callback.OnFocusChangeListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeSearchableToolbarWrapperWithComposeBindingImpl extends IncludeSearchableToolbarWrapperWithComposeBinding implements OnFocusChangeListener.Listener {
    public static final SparseIntArray D;
    public final OnFocusChangeListener B;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.search_card, 2);
        sparseIntArray.put(R.id.vps_entry_point, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeSearchableToolbarWrapperWithComposeBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, D);
        SearchView searchView = (SearchView) objArrT[1];
        Toolbar toolbar = (Toolbar) objArrT[0];
        super(dataBindingComponent, view, searchView, toolbar);
        this.C = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        E(view);
        this.B = new OnFocusChangeListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (182 != i) {
            if (273 != i) {
                return false;
            }
            return true;
        }
        this.A = (View.OnFocusChangeListener) obj;
        synchronized (this) {
            this.C |= 1;
        }
        h(182);
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
        if ((j & 4) != 0) {
            this.y.setOnQueryTextFocusChangeListener(this.B);
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
