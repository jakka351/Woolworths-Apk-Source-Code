package au.com.woolworths.feature.product.list.legacy.databinding;

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
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonBindingKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import au.com.woolworths.feature.product.list.legacy.analytics.SeeResultsClickSource;
import au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener;
import au.com.woolworths.feature.product.list.legacy.generated.callback.StatefulButtonClickHandler;
import au.com.woolworths.feature.product.list.legacy.ui.ChildFilterMenuState;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public class FragmentProductListOptionsFilterLegacyBindingImpl extends FragmentProductListOptionsFilterLegacyBinding implements OnClickListener.Listener, StatefulButtonClickHandler.Listener {
    public static final SparseIntArray L;
    public final OnClickListener H;
    public final StatefulButtonClickHandler I;
    public final OnClickListener J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(R.id.product_list_options_appbar, 6);
        sparseIntArray.put(R.id.barrier, 7);
        sparseIntArray.put(R.id.recycler_view, 8);
        sparseIntArray.put(R.id.button_container, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentProductListOptionsFilterLegacyBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 10, null, L);
        FrameLayout frameLayout = (FrameLayout) objArrT[9];
        Button button = (Button) objArrT[2];
        FrameLayout frameLayout2 = (FrameLayout) objArrT[5];
        super(dataBindingComponent, view, frameLayout, button, frameLayout2, (EpoxyRecyclerView) objArrT[8], (StatefulButton) objArrT[4], (Button) objArrT[3], (Toolbar) objArrT[1]);
        this.K = -1L;
        this.z.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        this.E.setTag(null);
        E(view);
        this.H = new OnClickListener(this, 2);
        this.I = new StatefulButtonClickHandler(this, 3);
        this.J = new OnClickListener(this, 1);
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

    @Override // au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListOptionsFilterLegacyBinding
    public final void L(ProductListOptionsViewModel productListOptionsViewModel) throws Throwable {
        this.F = productListOptionsViewModel;
        synchronized (this) {
            this.K |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        ProductListOptionsViewModel productListOptionsViewModel;
        if (i != 1) {
            if (i == 2 && (productListOptionsViewModel = this.F) != null) {
                productListOptionsViewModel.G6();
                return;
            }
            return;
        }
        ProductListOptionsViewModel productListOptionsViewModel2 = this.F;
        if (productListOptionsViewModel2 != null) {
            productListOptionsViewModel2.D6();
        }
    }

    @Override // au.com.woolworths.feature.product.list.legacy.generated.callback.StatefulButtonClickHandler.Listener
    public final void b(int i) {
        ProductListOptionsViewModel productListOptionsViewModel = this.F;
        if (productListOptionsViewModel != null) {
            productListOptionsViewModel.F6(SeeResultsClickSource.f);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() throws Resources.NotFoundException {
        long j;
        long j2;
        long j3;
        String quantityString;
        CharSequence text;
        StatefulButtonState statefulButtonState;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ChildFilterMenuState childFilterMenuState;
        Text text2;
        int i;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        ProductListOptionsViewModel productListOptionsViewModel = this.F;
        long j4 = j & 7;
        if (j4 != 0) {
            StateFlow stateFlow = productListOptionsViewModel != null ? productListOptionsViewModel.j : null;
            ViewDataBindingKtx.a(this, 0, stateFlow);
            ProductListOptionsContract.ViewState viewState = stateFlow != null ? (ProductListOptionsContract.ViewState) stateFlow.getValue() : null;
            if (viewState != null) {
                z3 = viewState.f5335a;
                statefulButtonState = viewState.j;
                childFilterMenuState = viewState.h;
                text2 = viewState.c;
                i = viewState.i;
            } else {
                statefulButtonState = null;
                childFilterMenuState = null;
                text2 = null;
                i = 0;
                z3 = false;
            }
            z4 = !z3;
            boolean z5 = statefulButtonState == null;
            j2 = 0;
            z = childFilterMenuState == ChildFilterMenuState.d;
            z = childFilterMenuState == ChildFilterMenuState.e;
            j3 = 7;
            this.C.getResources().getQuantityString(R.plurals.product_filters_see_x_results, i, Integer.valueOf(i));
            quantityString = this.C.getResources().getQuantityString(R.plurals.product_filters_see_x_results, i, Integer.valueOf(i));
            if (j4 != 0) {
                j |= z5 ? 16L : 8L;
            }
            text = text2 != null ? text2.getText(this.h.getContext()) : null;
            z2 = z;
            z = z5;
        } else {
            j2 = 0;
            j3 = 7;
            quantityString = null;
            text = null;
            statefulButtonState = null;
            z = false;
            z2 = false;
            z3 = false;
            z4 = false;
        }
        long j5 = j & j3;
        StatefulButtonState statefulButtonState2 = j5 != j2 ? z ? StatefulButtonState.d : statefulButtonState : null;
        if ((j & 4) != j2) {
            this.z.setOnClickListener(this.J);
            this.C.setClickHandler(this.I);
            this.D.setOnClickListener(this.H);
        }
        if (j5 != j2) {
            BindingAdaptersKt.o(this.z, z);
            this.z.setEnabled(z4);
            BindingAdaptersKt.o(this.A, z3);
            this.C.setStatefulButtonState(statefulButtonState2);
            StatefulButtonBindingKt.a(this.C, quantityString);
            BindingAdaptersKt.o(this.D, z2);
            this.D.setEnabled(z4);
            this.E.setTitle(text);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.K = 4L;
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
            this.K |= 1;
        }
        return true;
    }
}
