package au.com.woolworths.android.onesite.legacy.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener;
import au.com.woolworths.android.onesite.modules.onboarding.analytics.RewardsSetupActions;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupContract;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupViewModel;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import com.woolworths.R;

/* loaded from: classes3.dex */
public class FragmentRewardsSetupBindingImpl extends FragmentRewardsSetupBinding implements OnClickListener.Listener {
    public static final SparseIntArray G;
    public final OnClickListener C;
    public final OnClickListener D;
    public final OnClickListener E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(R.id.sign_up_layout, 3);
        sparseIntArray.put(R.id.rewards_card_image_view, 4);
        sparseIntArray.put(R.id.title_text_view, 5);
        sparseIntArray.put(R.id.instructions_text_view, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentRewardsSetupBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        Object[] objArrT = ViewDataBinding.t(dataBindingComponent, view, 7, null, G);
        Button button = (Button) objArrT[1];
        View view2 = (View) objArrT[3];
        Button button2 = (Button) objArrT[2];
        super(dataBindingComponent, view, button, view2, button2);
        this.F = -1L;
        this.y.setTag(null);
        ((ConstraintLayout) objArrT[0]).setTag(null);
        this.A.setTag(null);
        E(view);
        this.C = new OnClickListener(this, 1);
        this.D = new OnClickListener(this, 3);
        this.E = new OnClickListener(this, 2);
        r();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean G(int i, Object obj) throws Throwable {
        if (273 != i) {
            return false;
        }
        L((RewardsSetupViewModel) obj);
        return true;
    }

    @Override // au.com.woolworths.android.onesite.legacy.databinding.FragmentRewardsSetupBinding
    public final void L(RewardsSetupViewModel rewardsSetupViewModel) throws Throwable {
        this.B = rewardsSetupViewModel;
        synchronized (this) {
            this.F |= 1;
        }
        h(273);
        y();
    }

    @Override // au.com.woolworths.android.onesite.legacy.generated.callback.OnClickListener.Listener
    public final void a(int i) {
        RewardsSetupViewModel rewardsSetupViewModel;
        if (i == 1) {
            RewardsSetupViewModel rewardsSetupViewModel2 = this.B;
            if (rewardsSetupViewModel2 != null) {
                rewardsSetupViewModel2.f.c(RewardsSetupActions.f);
                rewardsSetupViewModel2.k.onNext(RewardsSetupContract.Actions.LaunchRewardsLogin.f4384a);
                return;
            }
            return;
        }
        if (i != 2) {
            if (i == 3 && (rewardsSetupViewModel = this.B) != null) {
                rewardsSetupViewModel.f.c(RewardsSetupActions.g);
                rewardsSetupViewModel.k.onNext(RewardsSetupContract.Actions.LaunchRewardsSignUp.f4385a);
                return;
            }
            return;
        }
        RewardsSetupViewModel rewardsSetupViewModel3 = this.B;
        if (rewardsSetupViewModel3 != null) {
            rewardsSetupViewModel3.p6(false);
            LegacyShopAnalyticsManager legacyShopAnalyticsManager = rewardsSetupViewModel3.g;
            ActionData actionDataA = ActionData.Companion.a("Skip");
            actionDataA.b(rewardsSetupViewModel3.h);
            actionDataA.c = "1";
            legacyShopAnalyticsManager.d(actionDataA);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void j() {
        long j;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        if ((j & 2) != 0) {
            this.y.setOnClickListener(this.C);
            this.z.setOnClickListener(this.D);
            this.A.setOnClickListener(this.E);
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
            this.F = 2L;
        }
        y();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean w(int i, int i2, Object obj) {
        return false;
    }
}
