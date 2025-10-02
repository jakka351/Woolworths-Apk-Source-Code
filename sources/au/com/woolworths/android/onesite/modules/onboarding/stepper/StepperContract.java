package au.com.woolworths.android.onesite.modules.onboarding.stepper;

import au.com.woolworths.android.onesite.modules.mvp.BaseLifeCyclePresenter;
import au.com.woolworths.android.onesite.modules.mvp.BaseView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes3.dex */
public interface StepperContract {

    public interface Presenter extends BaseLifeCyclePresenter<View> {
        void b(int i);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface Step {
    }

    public interface View extends BaseView {
        void H0();

        void J1();

        void R();
    }
}
