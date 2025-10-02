package au.com.woolworths.feature.product.list.databinding;

import android.content.res.Resources;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.ViewDataBindingKtx;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.product.list.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.analytics.SeeResultsClickSource;
import au.com.woolworths.feature.product.list.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.generated.callback.StatefulButtonClickHandler;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentProductMainFilterBindingImpl extends FragmentProductMainFilterBinding implements StatefulButtonClickHandler.Listener, OnClickListener.Listener {
    public static final SparseIntArray J;
    public final Button F;
    public final StatefulButtonClickHandler G;
    public final OnClickListener H;
    public long I;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(R.id.product_list_options_appbar, 4);
        sparseIntArray.put(R.id.toolbar, 5);
        sparseIntArray.put(R.id.recycler_view, 6);
        sparseIntArray.put(R.id.see_results_container, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentProductMainFilterBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, null, J);
        FrameLayout frameLayout = (FrameLayout) objArrT[3];
        super(dataBindingComponent, view, frameLayout, (EpoxyRecyclerView) objArrT[6], (FrameLayout) objArrT[7], (StatefulButton) objArrT[2], (Toolbar) objArrT[5]);
        this.I = -1L;
        ((ConstraintLayout) objArrT[0]).setTag(null);
        Button button = (Button) objArrT[1];
        this.F = button;
        button.setTag(null);
        this.y.setTag(null);
        this.B.setTag(null);
        E(view);
        this.G = new StatefulButtonClickHandler(this, 2);
        this.H = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((ProductListOptionsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.product.list.databinding.FragmentProductMainFilterBinding
    public final void L(ProductListOptionsViewModel productListOptionsViewModel) throws Throwable {
        this.D = productListOptionsViewModel;
        synchronized (this) {
            this.I |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductListOptionsViewModel productListOptionsViewModel = this.D;
        if (productListOptionsViewModel != null) {
            productListOptionsViewModel.D6();
        }
    }

    @Override // au.com.woolworths.feature.product.list.generated.callback.StatefulButtonClickHandler.Listener
    public final void b(int i) {
        ProductListOptionsViewModel productListOptionsViewModel = this.D;
        if (productListOptionsViewModel != null) {
            productListOptionsViewModel.E6(SeeResultsClickSource.e);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        long j3;
        String quantityString;
        StatefulButtonState statefulButtonState;
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        ProductListOptionsViewModel productListOptionsViewModel = this.D;
        long j4 = j & 7;
        boolean z4 = false;
        if (j4 != 0) {
            StateFlow stateFlow = productListOptionsViewModel != null ? productListOptionsViewModel.j : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            ProductListOptionsContract.ViewState viewState = stateFlow != null ? (ProductListOptionsContract.ViewState) stateFlow.getValue() : null;
            if (viewState != null) {
                z2 = viewState.f5258a;
                statefulButtonState = viewState.j;
                z3 = viewState.g;
                i = viewState.i;
            } else {
                statefulButtonState = null;
                i = 0;
                z2 = false;
                z3 = false;
            }
            if (j4 != 0) {
                j = z3 ? j | 64 : j | 32;
            }
            z = statefulButtonState == null;
            j2 = 0;
            j3 = 7;
            this.B.getResources().getQuantityString(R.plurals.product_filters_see_x_results, i, Integer.valueOf(i));
            quantityString = this.B.getResources().getQuantityString(R.plurals.product_filters_see_x_results, i, Integer.valueOf(i));
            if ((j & 7) != 0) {
                j |= z ? 16L : 8L;
            }
        } else {
            j2 = 0;
            j3 = 7;
            quantityString = null;
            statefulButtonState = null;
            z = false;
            z2 = false;
            z3 = false;
        }
        long j5 = j & j3;
        StatefulButtonState statefulButtonState2 = j5 != j2 ? z ? StatefulButtonState.d : statefulButtonState : null;
        boolean z5 = (j & 64) != j2 ? !z2 : false;
        if (j5 != j2 && z3) {
            z4 = z5;
        }
        if ((j & 4) != j2) {
            this.F.setOnClickListener(this.H);
            this.B.setClickHandler(this.G);
        }
        if (j5 != j2) {
            this.F.setEnabled(z4);
            BindingAdaptersKt.o(this.y, z2);
            this.B.setStatefulButtonState(statefulButtonState2);
            StatefulButtonBindingKt.a(this.B, quantityString);
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
            this.I = 4L;
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
            this.I |= 1;
        }
        return true;
    }
}
