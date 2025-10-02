package au.com.woolworths.feature.rewards.redemptionsettings.databinding;

import android.util.SparseIntArray;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.bindings.BindingAdaptersKt;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsViewModel;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentRedemptionSettingsBottomSheetBindingImpl extends FragmentRedemptionSettingsBottomSheetBinding {
    public static final SparseIntArray C;
    public long B;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        C = sparseIntArray;
        sparseIntArray.put(R.id.grab_handle_image_view, 2);
        sparseIntArray.put(R.id.container, 3);
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((RewardsRedemptionSettingsViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.feature.rewards.redemptionsettings.databinding.FragmentRedemptionSettingsBottomSheetBinding
    public final void L(RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel) throws Throwable {
        this.z = rewardsRedemptionSettingsViewModel;
        synchronized (this) {
            this.B |= 2;
        }
        h(273);
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel = this.z;
        long j2 = j & 7;
        if (j2 != 0) {
            MutableLiveData mutableLiveData = rewardsRedemptionSettingsViewModel != null ? rewardsRedemptionSettingsViewModel.l : null;
            I(0, mutableLiveData);
            RewardsRedemptionSettingsContract.ViewState viewState = mutableLiveData != null ? (RewardsRedemptionSettingsContract.ViewState) mutableLiveData.e() : null;
            z = !(viewState != null ? viewState.f6432a : false);
        }
        if (j2 != 0) {
            BindingAdaptersKt.o(this.y, z);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void r() {
        synchronized (this) {
            this.B = 4L;
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
            this.B |= 1;
        }
        return true;
    }
}
