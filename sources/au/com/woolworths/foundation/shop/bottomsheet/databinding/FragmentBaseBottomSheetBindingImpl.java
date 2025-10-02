package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.foundation.shop.bottomsheet.generated.callback.OnClickListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.woolworths.R;

/* loaded from: classes4.dex */
public class FragmentBaseBottomSheetBindingImpl extends FragmentBaseBottomSheetBinding implements OnClickListener.Listener {
    public static final SparseIntArray G;
    public final FrameLayout D;
    public final OnClickListener E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.bottom_sheet_epoxy_recycler_view, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentBaseBottomSheetBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, null, G);
        super(dataBindingComponent, view, (ImageButton) objArrT[2], (EpoxyRecyclerView) objArrT[3], (ImageView) objArrT[1]);
        this.F = -1L;
        this.y.setTag(null);
        this.A.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArrT[0];
        this.D = frameLayout;
        frameLayout.setTag(null);
        E(view);
        this.E = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((BaseBottomSheetViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.databinding.FragmentBaseBottomSheetBinding
    public final void L(BaseBottomSheetViewModel baseBottomSheetViewModel) throws Throwable {
        this.B = baseBottomSheetViewModel;
        synchronized (this) {
            this.F |= 2;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        BaseBottomSheetViewModel baseBottomSheetViewModel = this.B;
        if (baseBottomSheetViewModel != null) {
            baseBottomSheetViewModel.g.f(BaseBottomSheetContract.Actions.Dismiss.f8662a);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        BaseBottomSheetViewModel baseBottomSheetViewModel = this.B;
        long j2 = 7 & j;
        boolean z2 = false;
        if (j2 != 0) {
            BottomSheetContent.FinchInfo finchInfo = null;
            MutableLiveData mutableLiveData = baseBottomSheetViewModel != null ? baseBottomSheetViewModel.f : null;
            I(0, mutableLiveData);
            BaseBottomSheetContract.ViewState viewState = mutableLiveData != null ? (BaseBottomSheetContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                boolean z3 = viewState.d;
                finchInfo = viewState.b;
                z = z3;
            } else {
                z = false;
            }
            if (finchInfo != null) {
                z2 = true;
            }
        } else {
            z = false;
        }
        if ((j & 4) != 0) {
            this.y.setOnClickListener(this.E);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z2);
            BindingAdaptersKt.j(this.A, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.F = 4L;
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
            this.F |= 1;
        }
        return true;
    }
}
