package au.com.woolworths.feature.shop.editorder.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderErrorViewModel;
import au.com.woolworths.feature.shop.editorder.errorscreen.EditOrderFullPageErrorState;
import au.com.woolworths.feature.shop.editorder.generated.callback.OnClickListener;
import com.woolworths.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class ActivityEditOrderErrorBindingImpl extends ActivityEditOrderErrorBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts F;
    public static final SparseIntArray G;
    public final OnClickListener D;
    public long E;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(4);
        F = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.toolbar, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityEditOrderErrorBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 4, F, G);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[2], (Button) objArrT[1], (Toolbar) objArrT[3]);
        this.E = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.z.setTag(null);
        E(view);
        this.D = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 == i) {
            M((EditOrderErrorViewModel) obj);
            return true;
        }
        if (53 != i) {
            return false;
        }
        L((Activities.EditOrderErrorActivity.Extras) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.editorder.databinding.ActivityEditOrderErrorBinding
    public final void L(Activities.EditOrderErrorActivity.Extras extras) throws Throwable {
        this.B = extras;
        synchronized (this) {
            this.E |= 4;
        }
        h(53);
        y();
    }

    @Override // au.com.woolworths.feature.shop.editorder.databinding.ActivityEditOrderErrorBinding
    public final void M(EditOrderErrorViewModel editOrderErrorViewModel) throws Throwable {
        this.C = editOrderErrorViewModel;
        synchronized (this) {
            this.E |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        EditOrderFullPageErrorState.CmoError cmoError;
        String str;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        Activities.EditOrderErrorActivity.Extras extras = this.B;
        long j2 = 12 & j;
        if (j2 != 0) {
            Intrinsics.h(extras, "extras");
            cmoError = new EditOrderFullPageErrorState.CmoError(extras.d, extras.e);
            str = extras.f;
        } else {
            cmoError = null;
            str = null;
        }
        if (j2 != 0) {
            this.y.M(cmoError);
            TextViewBindingAdapter.b(this.z, str);
        }
        if ((j & 8) != 0) {
            this.z.setOnClickListener(this.D);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.y.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.E = 8L;
        }
        this.y.r();
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
            this.E |= 1;
        }
        return true;
    }
}
