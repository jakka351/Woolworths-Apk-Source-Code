package au.com.woolworths.feature.shop.onboarding.databinding;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.viewpager2.widget.ViewPager2;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.shop.onboarding.OnboardingContract;
import au.com.woolworths.feature.shop.onboarding.OnboardingErrorState;
import au.com.woolworths.feature.shop.onboarding.OnboardingViewModel;
import au.com.woolworths.feature.shop.onboarding.generated.callback.OnClickListener;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.tbuonomo.viewpagerdotsindicator.WormDotsIndicator;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityOnboardingBindingImpl extends ActivityOnboardingBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public final OnClickListener H;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        J = includedLayouts;
        includedLayouts.a(0, new int[]{2}, new int[]{R.layout.include_generic_error_state}, new String[]{"include_generic_error_state"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.loading_layout, 1);
        sparseIntArray.put(R.id.toolbar, 3);
        sparseIntArray.put(R.id.toolbar_title, 4);
        sparseIntArray.put(R.id.view_pager, 5);
        sparseIntArray.put(R.id.dots_indicator, 6);
        sparseIntArray.put(R.id.recycler_view, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityOnboardingBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, J, K);
        super(dataBindingComponent, view, (WormDotsIndicator) objArrT[6], (IncludeGenericErrorStateBinding) objArrT[2], (View) objArrT[1], (EpoxyRecyclerView) objArrT[7], (ConstraintLayout) objArrT[0], (Toolbar) objArrT[3], (AppCompatTextView) objArrT[4], (ViewPager2) objArrT[5]);
        this.I = -1L;
        IncludeGenericErrorStateBinding includeGenericErrorStateBinding = this.z;
        if (includeGenericErrorStateBinding != null) {
            includeGenericErrorStateBinding.n = this;
        }
        this.C.setTag(null);
        E(view);
        this.H = new OnClickListener(this);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.z.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((OnboardingViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.onboarding.databinding.ActivityOnboardingBinding
    public final void L(OnboardingViewModel onboardingViewModel) throws Throwable {
        this.G = onboardingViewModel;
        synchronized (this) {
            this.I |= 4;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.feature.shop.onboarding.generated.callback.OnClickListener.Listener
    public final void a(int i) {
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        boolean z;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        OnboardingViewModel onboardingViewModel = this.G;
        long j2 = j & 13;
        OnboardingErrorState onboardingErrorState = null;
        int i = 0;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = onboardingViewModel != null ? onboardingViewModel.m : null;
            I(0, mutableLiveData);
            OnboardingContract.ViewState viewState = mutableLiveData != null ? (OnboardingContract.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                onboardingErrorState = viewState.d;
                z = viewState.f7959a;
            } else {
                z = false;
            }
            boolean z2 = onboardingErrorState == null;
            if (j2 != 0) {
                j |= z2 ? 32L : 16L;
            }
            if (z2) {
                i = 8;
            }
        } else {
            z = false;
        }
        if ((13 & j) != 0) {
            this.z.h.setVisibility(i);
            this.z.M(onboardingErrorState);
            BindingAdaptersKt.o(this.A, z);
        }
        if ((12 & j) != 0) {
            this.z.L(onboardingViewModel);
        }
        if ((j & 8) != 0) {
            this.A.setOnClickListener(this.H);
        }
        this.z.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.z.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.I = 8L;
        }
        this.z.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.I |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.I |= 2;
        }
        return true;
    }
}
