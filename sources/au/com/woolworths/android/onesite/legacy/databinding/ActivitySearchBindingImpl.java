package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewStubProxy;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivitySearchBindingImpl extends ActivitySearchBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts K;
    public static final SparseIntArray L;
    public final OnClickListener I;
    public long J;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(12);
        K = includedLayouts;
        includedLayouts.a(1, new int[]{3, 4, 5}, new int[]{R.layout.include_search_suggestion, R.layout.include_unable_to_load, R.layout.include_connection_error}, new String[]{"include_search_suggestion", "include_unable_to_load", "include_connection_error"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.view_loading, 2);
        sparseIntArray.put(R.id.app_bar, 6);
        sparseIntArray.put(R.id.search_toolbar, 7);
        sparseIntArray.put(R.id.search_text, 8);
        sparseIntArray.put(R.id.vpf_entry_point, 9);
        sparseIntArray.put(R.id.vps_entry_point, 10);
        sparseIntArray.put(R.id.edit_order_banner, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivitySearchBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 12, K, L);
        super(dataBindingComponent, view, (IncludeConnectionErrorBinding) objArrT[5], new ViewStubProxy((ViewStub) objArrT[11]), (IncludeSearchSuggestionBinding) objArrT[3], (SearchView) objArrT[8], (Toolbar) objArrT[7], (IncludeUnableToLoadBinding) objArrT[4], (View) objArrT[2], (ImageView) objArrT[9], (ComposeView) objArrT[10]);
        this.J = -1L;
        IncludeConnectionErrorBinding includeConnectionErrorBinding = this.y;
        if (includeConnectionErrorBinding != null) {
            includeConnectionErrorBinding.n = this;
        }
        this.z.d = this;
        ((CoordinatorLayout) objArrT[0]).setTag(null);
        ((ConstraintLayout) objArrT[1]).setTag(null);
        IncludeSearchSuggestionBinding includeSearchSuggestionBinding = this.A;
        if (includeSearchSuggestionBinding != null) {
            includeSearchSuggestionBinding.n = this;
        }
        IncludeUnableToLoadBinding includeUnableToLoadBinding = this.D;
        if (includeUnableToLoadBinding != null) {
            includeUnableToLoadBinding.n = this;
        }
        E(view);
        this.I = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (241 != i) {
            return false;
        }
        L((Boolean) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.databinding.ActivitySearchBinding
    public final void L(Boolean bool) throws Throwable {
        this.H = bool;
        synchronized (this) {
            this.J |= 8;
        }
        h(241);
        y();
    }

    @Override // au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.J;
            this.J = 0L;
        }
        long j2 = 24 & j;
        boolean zB = j2 != 0 ? ViewDataBinding.B(this.H) : false;
        if ((j & 16) != 0) {
            this.E.setOnClickListener(this.I);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.E, zB);
        }
        this.A.k();
        this.D.k();
        this.y.k();
        ViewDataBinding viewDataBinding = this.z.b;
        if (viewDataBinding != null) {
            viewDataBinding.k();
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.A.p() || this.D.p() || this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.J = 16L;
        }
        this.A.r();
        this.D.r();
        this.y.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.J |= 2;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.J |= 4;
        }
        return true;
    }
}
