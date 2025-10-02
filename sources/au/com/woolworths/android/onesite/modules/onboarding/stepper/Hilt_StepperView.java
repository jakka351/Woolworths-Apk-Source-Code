package au.com.woolworths.android.onesite.modules.onboarding.stepper;

import android.widget.FrameLayout;
import dagger.hilt.android.internal.managers.ViewComponentManager;
import dagger.hilt.internal.GeneratedComponentManagerHolder;

/* loaded from: classes3.dex */
abstract class Hilt_StepperView extends FrameLayout implements GeneratedComponentManagerHolder {
    public ViewComponentManager d;
    public boolean e;

    @Override // dagger.hilt.internal.GeneratedComponentManager
    public final Object t3() {
        if (this.d == null) {
            this.d = new ViewComponentManager(this);
        }
        return this.d.t3();
    }
}
