package au.com.woolworths.android.onesite.base.ui.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.generated.callback.OnFocusChangeListener;
import au.com.woolworths.android.onesite.base.ui.generated.callback.OnQueryTextChange;
import au.com.woolworths.android.onesite.base.ui.generated.callback.OnQueryTextSubmit;
import au.com.woolworths.android.onesite.bindings.SearchViewCompatBindingAdapterKt;
import com.google.android.material.appbar.AppBarLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class IncludeSearchableToolbarWrapperBindingImpl extends IncludeSearchableToolbarWrapperBinding implements OnFocusChangeListener.Listener, OnQueryTextChange.Listener, OnQueryTextSubmit.Listener {
    public static final SparseIntArray J;
    public final OnFocusChangeListener F;
    public final OnQueryTextChange G;
    public final OnQueryTextSubmit H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 2);
        sparseIntArray.put(R.id.search_card, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public IncludeSearchableToolbarWrapperBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, J);
        super(dataBindingComponent, view, (CardView) objArrT[3], (SearchView) objArrT[1], (Toolbar) objArrT[2]);
        this.I = -1L;
        ((AppBarLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.F = new OnFocusChangeListener(this);
        this.G = new OnQueryTextChange(this);
        this.H = new OnQueryTextSubmit(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (221 == i) {
            O((String) obj);
            return true;
        }
        if (183 == i) {
            N((SearchViewBindingAdapter.OnQueryTextSubmit) obj);
            return true;
        }
        if (182 == i) {
            M((View.OnFocusChangeListener) obj);
            return true;
        }
        if (181 != i) {
            return false;
        }
        L((SearchViewBindingAdapter.OnQueryTextChange) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding
    public final void L(SearchViewBindingAdapter.OnQueryTextChange onQueryTextChange) throws Throwable {
        this.C = onQueryTextChange;
        synchronized (this) {
            this.I |= 8;
        }
        h(181);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding
    public final void M(View.OnFocusChangeListener onFocusChangeListener) throws Throwable {
        this.E = onFocusChangeListener;
        synchronized (this) {
            this.I |= 4;
        }
        h(182);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding
    public final void N(SearchViewBindingAdapter.OnQueryTextSubmit onQueryTextSubmit) throws Throwable {
        this.D = onQueryTextSubmit;
        synchronized (this) {
            this.I |= 2;
        }
        h(183);
        y();
    }

    @Override // au.com.woolworths.android.onesite.base.ui.databinding.IncludeSearchableToolbarWrapperBinding
    public final void O(String str) throws Throwable {
        this.B = str;
        synchronized (this) {
            this.I |= 1;
        }
        h(221);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        String str = this.B;
        long j2 = 17 & j;
        if ((j & 16) != 0) {
            this.z.setOnQueryTextFocusChangeListener(this.F);
            SearchViewCompatBindingAdapterKt.a(this.z, this.H, this.G);
        }
        if (j2 != 0) {
            this.z.setQueryHint(str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.I != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 16L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
