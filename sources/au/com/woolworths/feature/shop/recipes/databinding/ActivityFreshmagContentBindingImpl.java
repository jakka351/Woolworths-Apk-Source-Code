package au.com.woolworths.feature.shop.recipes.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.SeekBarBindingAdapter;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.viewpager.widget.ViewPager;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.ResWithArgText;
import au.com.woolworths.feature.shop.recipes.freshmag.content.domain.FreshMagContentViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentContract;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentErrorState;
import au.com.woolworths.feature.shop.recipes.freshmag.content.presentation.FreshMagContentExtKt;
import au.com.woolworths.feature.shop.recipes.generated.callback.OnProgressChanged;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityFreshmagContentBindingImpl extends ActivityFreshmagContentBinding implements OnProgressChanged.Listener {
    public static final ViewDataBinding.IncludedLayouts L;
    public static final SparseIntArray M;
    public final Group I;
    public final OnProgressChanged J;
    public long K;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(9);
        L = includedLayouts;
        includedLayouts.a(0, new int[]{5}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(R.id.appbar_layout, 6);
        sparseIntArray.put(R.id.toolbar, 7);
        sparseIntArray.put(R.id.freshmag_content_viewpager, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityFreshmagContentBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 9, L, M);
        super(dataBindingComponent, view, (IncludeGenericErrorStateBinding) objArrT[5], (TextView) objArrT[3], (AppCompatSeekBar) objArrT[2], (ViewPager) objArrT[8], (ProgressBar) objArrT[4], (Toolbar) objArrT[7]);
        this.K = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.y;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        Group group = (Group) objArrT[1];
        this.I = group;
        group.setTag(null);
        this.C.setTag(null);
        E(view);
        this.J = new OnProgressChanged(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (84 == i) {
            M((FreshMagContentContract.FreshMagContent) obj);
            return true;
        }
        if (76 == i) {
            L((FreshMagContentErrorState) obj);
            return true;
        }
        if (273 == i) {
            O((FreshMagContentViewModel) obj);
            return true;
        }
        if (196 != i) {
            return false;
        }
        N((FreshMagContentContract.PageState) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBinding
    public final void L(FreshMagContentErrorState freshMagContentErrorState) throws Throwable {
        this.F = freshMagContentErrorState;
        synchronized (this) {
            this.K |= 4;
        }
        h(76);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBinding
    public final void M(FreshMagContentContract.FreshMagContent freshMagContent) throws Throwable {
        this.G = freshMagContent;
        synchronized (this) {
            this.K |= 2;
        }
        h(84);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBinding
    public final void N(FreshMagContentContract.PageState pageState) throws Throwable {
        this.H = pageState;
        synchronized (this) {
            this.K |= 16;
        }
        h(196);
        y();
    }

    @Override // au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagContentBinding
    public final void O(FreshMagContentViewModel freshMagContentViewModel) throws Throwable {
        this.E = freshMagContentViewModel;
        synchronized (this) {
            this.K |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        int size;
        long j2;
        boolean z;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        FreshMagContentContract.FreshMagContent freshMagContent = this.G;
        FreshMagContentErrorState freshMagContentErrorState = this.F;
        FreshMagContentContract.PageState pageState = this.H;
        long j3 = 34 & j;
        CharSequence text = null;
        boolean z2 = false;
        if (j3 != 0) {
            ResWithArgText resWithArgTextA = FreshMagContentExtKt.a(freshMagContent);
            size = freshMagContent == null ? 0 : freshMagContent.f8040a.size() - 1;
            if (resWithArgTextA != null) {
                text = resWithArgTextA.getText(this.h.getContext());
            }
        } else {
            size = 0;
        }
        long j4 = 36 & j;
        boolean z3 = (j4 == 0 || freshMagContentErrorState == null) ? false : true;
        long j5 = 48 & j;
        if (j5 != 0) {
            z = pageState == FreshMagContentContract.PageState.d;
            j2 = 0;
            z2 = pageState == FreshMagContentContract.PageState.e;
        } else {
            j2 = 0;
            z = false;
        }
        if (j4 != 0) {
            this.y.M(freshMagContentErrorState);
            BindingAdaptersKt.o(this.y.h, z3);
        }
        if (j3 != 0) {
            TextViewBindingAdapter.b(this.z, text);
            this.A.setMax(size);
        }
        if ((j & 32) != j2) {
            SeekBarBindingAdapter.a(this.A, this.J);
        }
        if (j5 != 0) {
            BindingAdaptersKt.p(this.I, z2);
            BindingAdaptersKt.o(this.C, z);
        }
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.K != 0) {
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
            this.K = 32L;
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
            this.K |= 1;
        }
        return true;
    }
}
