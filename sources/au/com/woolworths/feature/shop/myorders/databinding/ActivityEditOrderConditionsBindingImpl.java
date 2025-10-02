package au.com.woolworths.feature.shop.myorders.databinding;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.android.onesite.utils.ScrimUtil;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsContract;
import au.com.woolworths.feature.shop.myorders.editorderconditions.EditOrderConditionsViewModel;
import au.com.woolworths.feature.shop.myorders.editorderconditions.analytics.EditOrderConditionsActions;
import au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityEditOrderConditionsBindingImpl extends ActivityEditOrderConditionsBinding implements OnClickListener.Listener {
    public static final SparseIntArray H;
    public final OnClickListener F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(R.id.appbar, 5);
        sparseIntArray.put(R.id.toolbar, 6);
        sparseIntArray.put(R.id.content_wrapper, 7);
        sparseIntArray.put(R.id.content, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityEditOrderConditionsBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, null, H);
        Button button = (Button) objArrT[3];
        StatefulButton statefulButton = (StatefulButton) objArrT[2];
        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) objArrT[8];
        super(dataBindingComponent, view, button, statefulButton, epoxyRecyclerView, (FrameLayout) objArrT[4], (View) objArrT[1], (Toolbar) objArrT[6]);
        this.G = -1L;
        this.y.setTag(null);
        this.z.setTag(null);
        ((CoordinatorLayout) objArrT[0]).setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        E(view);
        this.F = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((EditOrderConditionsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.myorders.databinding.ActivityEditOrderConditionsBinding
    public final void L(EditOrderConditionsViewModel editOrderConditionsViewModel) throws Throwable {
        this.E = editOrderConditionsViewModel;
        synchronized (this) {
            this.G |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.myorders.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        EditOrderConditionsViewModel editOrderConditionsViewModel = this.E;
        if (editOrderConditionsViewModel != null) {
            editOrderConditionsViewModel.g.c(EditOrderConditionsActions.f);
            editOrderConditionsViewModel.j.f(EditOrderConditionsContract.Actions.NavigateBack.f7838a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        StatefulButtonState statefulButtonState;
        boolean z;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        EditOrderConditionsViewModel editOrderConditionsViewModel = this.E;
        long j2 = j & 7;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = editOrderConditionsViewModel != null ? editOrderConditionsViewModel.l : null;
            I(0, mutableLiveData);
            EditOrderConditionsContract.ViewState viewState = mutableLiveData != null ? (EditOrderConditionsContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z = viewState.f7843a;
                statefulButtonState = viewState.b;
            } else {
                statefulButtonState = null;
                z = false;
            }
            z = statefulButtonState == null;
            if (j2 != 0) {
                j |= z ? 16L : 8L;
            }
        } else {
            statefulButtonState = null;
            z = false;
        }
        long j3 = 7 & j;
        StatefulButtonState statefulButtonState2 = j3 != 0 ? z ? StatefulButtonState.f : statefulButtonState : null;
        if ((4 & j) != 0) {
            this.y.setOnClickListener(this.F);
            View view = this.C;
            ScrimUtil.a(view, 80, new ColorDrawable(ViewDataBinding.n(R.color.color_scrim_shadow, view)));
        }
        if ((j & 6) != 0) {
            this.z.setClickHandler(editOrderConditionsViewModel);
        }
        if (j3 != 0) {
            this.z.setStatefulButtonState(statefulButtonState2);
            BindingAdaptersKt.o(this.B, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.G = 4L;
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
            this.G |= 1;
        }
        return true;
    }
}
