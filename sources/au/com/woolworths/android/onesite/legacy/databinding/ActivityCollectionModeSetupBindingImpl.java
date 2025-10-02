package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.collectionmode.common.CollectionMode;
import au.com.woolworths.android.onesite.modules.collectionmode.common.DeliveryModeVariant;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupViewModel;
import au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class ActivityCollectionModeSetupBindingImpl extends ActivityCollectionModeSetupBinding implements OnClickListener.Listener {
    public static final ViewDataBinding.IncludedLayouts N;
    public static final SparseIntArray O;
    public final OnClickListener J;
    public final OnClickListener K;
    public final OnClickListener L;
    public long M;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(14);
        N = includedLayouts;
        includedLayouts.a(0, new int[]{4, 5, 6, 7}, new int[]{R.layout.include_horizontal_divider, R.layout.include_horizontal_divider, R.layout.include_horizontal_divider, R.layout.include_horizontal_divider}, new String[]{"include_horizontal_divider", "include_horizontal_divider", "include_horizontal_divider", "include_horizontal_divider"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 8);
        sparseIntArray.put(R.id.toolbar, 9);
        sparseIntArray.put(R.id.stepper_view, 10);
        sparseIntArray.put(R.id.shopping_mode_lottie_animation_view, 11);
        sparseIntArray.put(R.id.choose_mode_text_view, 12);
        sparseIntArray.put(R.id.instructions_text_view, 13);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActivityCollectionModeSetupBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 14, N, O);
        AppBarLayout appBarLayout = (AppBarLayout) objArrT[8];
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding = (IncludeHorizontalDividerBinding) objArrT[6];
        TextView textView = (TextView) objArrT[2];
        TextView textView2 = (TextView) objArrT[3];
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding2 = (IncludeHorizontalDividerBinding) objArrT[7];
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding3 = (IncludeHorizontalDividerBinding) objArrT[4];
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding4 = (IncludeHorizontalDividerBinding) objArrT[5];
        TextView textView3 = (TextView) objArrT[1];
        LottieAnimationView lottieAnimationView = (LottieAnimationView) objArrT[11];
        StepperView stepperView = (StepperView) objArrT[10];
        super(dataBindingComponent, view, appBarLayout, includeHorizontalDividerBinding, textView, textView2, includeHorizontalDividerBinding2, includeHorizontalDividerBinding3, includeHorizontalDividerBinding4, textView3, lottieAnimationView, stepperView);
        this.M = -1L;
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding5 = this.z;
        if (includeHorizontalDividerBinding5 != null) {
            includeHorizontalDividerBinding5.n = this;
        }
        this.A.setTag(null);
        this.B.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding6 = this.C;
        if (includeHorizontalDividerBinding6 != null) {
            includeHorizontalDividerBinding6.n = this;
        }
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding7 = this.D;
        if (includeHorizontalDividerBinding7 != null) {
            includeHorizontalDividerBinding7.n = this;
        }
        IncludeHorizontalDividerBinding includeHorizontalDividerBinding8 = this.E;
        if (includeHorizontalDividerBinding8 != null) {
            includeHorizontalDividerBinding8.n = this;
        }
        this.F.setTag(null);
        E(view);
        this.J = new OnClickListener(this, 2);
        this.K = new OnClickListener(this, 3);
        this.L = new OnClickListener(this, 1);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((CollectionModeSetupViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.databinding.ActivityCollectionModeSetupBinding
    public final void L(CollectionModeSetupViewModel collectionModeSetupViewModel) throws Throwable {
        this.I = collectionModeSetupViewModel;
        synchronized (this) {
            this.M |= 16;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        CollectionModeSetupViewModel collectionModeSetupViewModel;
        if (i == 1) {
            CollectionModeSetupViewModel collectionModeSetupViewModel2 = this.I;
            if (collectionModeSetupViewModel2 != null) {
                collectionModeSetupViewModel2.p6(CollectionMode.PickUp.d);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (collectionModeSetupViewModel = this.I) != null) {
                collectionModeSetupViewModel.p6(CollectionMode.InStore.d);
                return;
            }
            return;
        }
        CollectionModeSetupViewModel collectionModeSetupViewModel3 = this.I;
        if (collectionModeSetupViewModel3 != null) {
            collectionModeSetupViewModel3.p6(new CollectionMode.Delivery(DeliveryModeVariant.DeliveryStandard));
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        if ((j & 32) != 0) {
            this.A.setOnClickListener(this.J);
            this.B.setOnClickListener(this.K);
            this.F.setOnClickListener(this.L);
        }
        this.D.k();
        this.E.k();
        this.z.k();
        this.C.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.D.p() || this.E.p() || this.z.p() || this.C.p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.M = 32L;
        }
        this.D.r();
        this.E.r();
        this.z.r();
        this.C.r();
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 1;
            }
            return true;
        }
        if (i == 1) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 2;
            }
            return true;
        }
        if (i == 2) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.M |= 4;
            }
            return true;
        }
        if (i != 3) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.M |= 8;
        }
        return true;
    }
}
