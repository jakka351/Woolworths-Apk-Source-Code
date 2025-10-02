package au.com.woolworths.feature.shop.myorders.generated.callback;

import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityEditDriverInstructionBindingImpl;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionActivity;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsContract;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnTextChanged implements TextViewBindingAdapter.OnTextChanged {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityEditDriverInstructionBindingImpl f7849a;

    public interface Listener {
    }

    public OnTextChanged(ActivityEditDriverInstructionBindingImpl activityEditDriverInstructionBindingImpl) {
        this.f7849a = activityEditDriverInstructionBindingImpl;
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged
    public final void onTextChanged(CharSequence newInstructions, int i, int i2, int i3) {
        EditDriverInstructionsViewModel editDriverInstructionsViewModel = this.f7849a.B;
        if (editDriverInstructionsViewModel != null) {
            MutableLiveData mutableLiveData = editDriverInstructionsViewModel.h;
            Intrinsics.h(newInstructions, "newInstructions");
            EditDriverInstructionActivity.Extras extras = editDriverInstructionsViewModel.g;
            if (extras == null) {
                Intrinsics.p("extras");
                throw null;
            }
            if (Intrinsics.c(extras.e, newInstructions.toString())) {
                mutableLiveData.m(new EditDriverInstructionsContract.ViewState(StatefulButtonState.f));
            } else {
                mutableLiveData.m(new EditDriverInstructionsContract.ViewState(StatefulButtonState.d));
            }
        }
    }
}
