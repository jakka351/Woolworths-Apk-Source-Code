package com.woolworths.scanlibrary.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.woolworths.scanlibrary.ui.checkout.stepup.StepUpDialogFragment;

/* loaded from: classes7.dex */
public abstract class FragmentStepupDialogBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final View A;
    public final ViewPaymentErrorBinding B;
    public final Button C;
    public StepUpDialogFragment.StepUpViewModel D;
    public final Button y;
    public final FrameLayout z;

    public FragmentStepupDialogBinding(DataBindingComponent dataBindingComponent, View view, Button button, FrameLayout frameLayout, View view2, ViewPaymentErrorBinding viewPaymentErrorBinding, Button button2) {
        super(dataBindingComponent, view, 9);
        this.y = button;
        this.z = frameLayout;
        this.A = view2;
        this.B = viewPaymentErrorBinding;
        this.C = button2;
    }

    public abstract void L(StepUpDialogFragment.StepUpViewModel stepUpViewModel);
}
