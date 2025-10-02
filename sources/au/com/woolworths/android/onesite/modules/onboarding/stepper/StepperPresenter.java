package au.com.woolworths.android.onesite.modules.onboarding.stepper;

import au.com.woolworths.android.onesite.modules.mvp.BaseLifeCyclePresenterImpl;
import au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperContract;

/* loaded from: classes3.dex */
public class StepperPresenter extends BaseLifeCyclePresenterImpl<StepperContract.View> implements StepperContract.Presenter {
    @Override // au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperContract.Presenter
    public final void b(int i) {
        if (i == 2) {
            ((StepperContract.View) this.f4373a).H0();
        } else if (i != 3) {
            ((StepperContract.View) this.f4373a).R();
        } else {
            ((StepperContract.View) this.f4373a).J1();
        }
    }
}
