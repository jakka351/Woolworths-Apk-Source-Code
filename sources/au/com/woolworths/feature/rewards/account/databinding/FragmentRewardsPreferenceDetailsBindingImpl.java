package au.com.woolworths.feature.rewards.account.databinding;

import android.util.SparseIntArray;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContractLegacy;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsErrorState;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsViewModelLegacy;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentRewardsPreferenceDetailsBindingImpl extends FragmentRewardsPreferenceDetailsBinding {
    public static final ViewDataBinding.IncludedLayouts J;
    public static final SparseIntArray K;
    public long I;

    static {
        ViewDataBinding.IncludedLayouts includedLayouts = new ViewDataBinding.IncludedLayouts(8);
        J = includedLayouts;
        includedLayouts.a(2, new int[]{6}, new int[]{R.layout.include_rewards_generic_error_state_full_screen}, new String[]{"include_rewards_generic_error_state_full_screen"});
        SparseIntArray sparseIntArray = new SparseIntArray();
        K = sparseIntArray;
        sparseIntArray.put(R.id.recycler_view, 7);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void D(LifecycleOwner lifecycleOwner) {
        super.D(lifecycleOwner);
        this.A.D(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (230 == i) {
            L(((Boolean) obj).booleanValue());
            return true;
        }
        if (273 != i) {
            return false;
        }
        M((RewardsPreferenceDetailsViewModelLegacy) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsPreferenceDetailsBinding
    public final void L(boolean z) throws Throwable {
        this.G = z;
        synchronized (this) {
            this.I |= 4;
        }
        h(230);
        y();
    }

    @Override // au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsPreferenceDetailsBinding
    public final void M(RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy) throws Throwable {
        this.F = rewardsPreferenceDetailsViewModelLegacy;
        synchronized (this) {
            this.I |= 8;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        long j2;
        boolean z;
        CharSequence charSequence;
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState;
        Text text;
        synchronized (this) {
            j = this.I;
            this.I = 0L;
        }
        boolean z2 = this.G;
        RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacy = this.F;
        boolean z3 = (j & 20) != 0 ? !z2 : false;
        long j3 = j & 25;
        RewardsPreferenceDetailsErrorState rewardsPreferenceDetailsErrorState2 = null;
        if (j3 != 0) {
            MutableLiveData mutableLiveData = rewardsPreferenceDetailsViewModelLegacy != null ? rewardsPreferenceDetailsViewModelLegacy.n : null;
            I(0, mutableLiveData);
            RewardsPreferenceDetailsContractLegacy.ViewState viewState = mutableLiveData != null ? (RewardsPreferenceDetailsContractLegacy.ViewState) mutableLiveData.e() : null;
            j2 = 0;
            if (viewState != null) {
                rewardsPreferenceDetailsErrorState = viewState.d;
                z = viewState.c;
                text = viewState.f5739a;
            } else {
                z = false;
                rewardsPreferenceDetailsErrorState = null;
                text = null;
            }
            boolean z4 = rewardsPreferenceDetailsErrorState != null;
            if (j3 != 0) {
                j |= z4 ? 64L : 32L;
            }
            CharSequence text2 = text != null ? text.getText(this.h.getContext()) : null;
            i = z4 ? 0 : 8;
            CharSequence charSequence2 = text2;
            rewardsPreferenceDetailsErrorState2 = rewardsPreferenceDetailsErrorState;
            charSequence = charSequence2;
        } else {
            j2 = 0;
            z = false;
            charSequence = null;
        }
        if ((20 & j) != j2) {
            BindingAdaptersKt.o(this.y, z3);
            BindingAdaptersKt.o(this.B, z2);
        }
        if ((j & 25) != j2) {
            this.A.h.setVisibility(i);
            this.A.M(rewardsPreferenceDetailsErrorState2);
            BindingAdaptersKt.o(this.C, z);
            this.E.setTitle(charSequence);
        }
        if ((j & 24) != j2) {
            this.A.L(rewardsPreferenceDetailsViewModelLegacy);
        }
        this.A.k();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                if (this.I != 0) {
                    return true;
                }
                return this.A.p();
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
        this.A.r();
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
