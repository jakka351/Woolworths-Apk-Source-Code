package au.com.woolworths.feature.shop.foryou.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeInlineMessageBinding;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersContractLegacy;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersViewModelLegacy;
import au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersPointsActionData;
import au.com.woolworths.rewards.base.CustomCollapsingToolbarLayout;
import au.com.woolworths.rewards.base.databinding.IncludeBalanceIndicatorBinding;
import au.com.woolworths.rewards.tooltip.Tooltip;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public class FragmentRewardsBoostersBindingImpl extends FragmentRewardsBoostersBinding {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public final IncludeBalanceIndicatorBinding F;
    public final ImageView G;
    public Function0Impl H;
    public long I;

    public static class Function0Impl implements Function0<Unit> {
        public RewardsBoostersViewModelLegacy d;

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String str;
            RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy = this.d;
            rewardsBoostersViewModelLegacy.g.c(RewardsBoostersPointsActionData.e);
            Object objE = rewardsBoostersViewModelLegacy.l.e();
            Intrinsics.e(objE);
            RewardsPointsBalance rewardsPointsBalance = ((RewardsBoostersContractLegacy.ViewState) objE).f7134a;
            if (rewardsPointsBalance == null || (str = rewardsPointsBalance.c) == null) {
                return null;
            }
            rewardsBoostersViewModelLegacy.i.onNext(new RewardsBoostersContractLegacy.Actions.ShowTooltip(new Tooltip.BalanceIndicator(str)));
            return null;
        }
    }

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        J = includedLayouts;
        includedLayouts.a(1, new int[]{5}, new int[]{R.layout.include_inline_message}, new String[]{"include_inline_message"});
        includedLayouts.a(2, new int[]{4}, new int[]{R.layout.include_balance_indicator}, new String[]{"include_balance_indicator"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.app_bar_layout, 6);
        sparseIntArray.put(R.id.container, 7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentRewardsBoostersBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 8, J, K);
        IncludeInlineMessageBinding includeInlineMessageBinding = (IncludeInlineMessageBinding) objArrT[5];
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) objArrT[0];
        CustomCollapsingToolbarLayout customCollapsingToolbarLayout = (CustomCollapsingToolbarLayout) objArrT[1];
        super(dataBindingComponent, view, includeInlineMessageBinding, coordinatorLayout, customCollapsingToolbarLayout, (Toolbar) objArrT[2]);
        this.I = -1L;
        IncludeInlineMessageBinding includeInlineMessageBinding2 = this.y;
        if (includeInlineMessageBinding2 != null) {
            includeInlineMessageBinding2.n = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        IncludeBalanceIndicatorBinding includeBalanceIndicatorBinding = (IncludeBalanceIndicatorBinding) objArrT[4];
        this.F = includeBalanceIndicatorBinding;
        if (includeBalanceIndicatorBinding != null) {
            includeBalanceIndicatorBinding.n = this;
        }
        ImageView imageView = (ImageView) objArrT[3];
        this.G = imageView;
        imageView.setTag(null);
        this.B.setTag(null);
        E(view);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.F.D(lifecycleOwner);
        this.y.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (171 == i) {
            L((InlineMessage) obj);
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((RewardsBoostersViewModelLegacy) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.shop.foryou.databinding.FragmentRewardsBoostersBinding
    public final void L(InlineMessage inlineMessage) throws Throwable {
        this.D = inlineMessage;
        synchronized (this) {
            this.I |= 4;
        }
        h(171);
        y();
    }

    @Override // au.com.woolworths.feature.shop.foryou.databinding.FragmentRewardsBoostersBinding
    public final void M(RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy) throws Throwable {
        this.C = rewardsBoostersViewModelLegacy;
        synchronized (this) {
            this.I |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        RewardsPointsBalance rewardsPointsBalance;
        Drawable drawableB;
        Function0Impl function0Impl;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        InlineMessage inlineMessage = this.D;
        RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy = this.C;
        boolean z = false;
        boolean z2 = ((j & 20) == 0 || inlineMessage == null) ? false : true;
        long j2 = j & 25;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = rewardsBoostersViewModelLegacy != null ? rewardsBoostersViewModelLegacy.l : null;
            I(0, mutableLiveData);
            RewardsBoostersContractLegacy.ViewState viewState = mutableLiveData != null ? (RewardsBoostersContractLegacy.ViewState) mutableLiveData.e() : null;
            if (viewState != null) {
                z = viewState.b;
                rewardsPointsBalance = viewState.f7134a;
            } else {
                rewardsPointsBalance = null;
            }
            if (j2 != 0) {
                j |= z ? 64L : 32L;
            }
            drawableB = AppCompatResources.b(z ? R.drawable.ic_boosters_everyday_rewards_plus : R.drawable.ic_boosters_everyday_rewards, this.G.getContext());
            if ((j & 24) == 0 || rewardsBoostersViewModelLegacy == null) {
                function0Impl = null;
            } else {
                function0Impl = this.H;
                if (function0Impl == null) {
                    function0Impl = new Function0Impl();
                    this.H = function0Impl;
                }
                function0Impl.d = rewardsBoostersViewModelLegacy;
            }
        } else {
            rewardsPointsBalance = null;
            drawableB = null;
            function0Impl = null;
        }
        if ((j & 20) != 0) {
            this.y.L(inlineMessage);
            BindingAdaptersKt.o(this.y.h, z2);
        }
        if ((j & 24) != 0) {
            this.F.L(function0Impl);
        }
        if ((j & 25) != 0) {
            this.F.M(rewardsPointsBalance);
            this.G.setImageDrawable(drawableB);
        }
        this.F.k();
        this.y.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.F.p() || this.y.p();
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
        this.F.r();
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
