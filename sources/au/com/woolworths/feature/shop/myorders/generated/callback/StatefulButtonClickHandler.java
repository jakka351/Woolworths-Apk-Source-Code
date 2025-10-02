package au.com.woolworths.feature.shop.myorders.generated.callback;

import android.view.View;
import android.widget.EditText;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;
import au.com.woolworths.feature.shop.myorders.databinding.ActivityEditDriverInstructionBindingImpl;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel;

/* loaded from: classes3.dex */
public final class StatefulButtonClickHandler implements au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler {
    public final ActivityEditDriverInstructionBindingImpl d;

    public interface Listener {
    }

    public StatefulButtonClickHandler(ActivityEditDriverInstructionBindingImpl activityEditDriverInstructionBindingImpl) {
        this.d = activityEditDriverInstructionBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonClickHandler
    public final void T2(View view, StatefulButtonState statefulButtonState) {
        ActivityEditDriverInstructionBindingImpl activityEditDriverInstructionBindingImpl = this.d;
        EditText editText = activityEditDriverInstructionBindingImpl.y;
        EditDriverInstructionsViewModel editDriverInstructionsViewModel = activityEditDriverInstructionBindingImpl.B;
        if (editDriverInstructionsViewModel == null || editText == null) {
            return;
        }
        editText.getText();
        if (editText.getText() != null) {
            editText.getText().toString();
            editDriverInstructionsViewModel.q6(editText.getText().toString());
        }
    }
}
