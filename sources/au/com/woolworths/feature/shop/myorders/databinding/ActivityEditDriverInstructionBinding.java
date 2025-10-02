package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.feature.shop.myorders.editdriverinstruction.EditDriverInstructionsViewModel;

/* loaded from: classes3.dex */
public abstract class ActivityEditDriverInstructionBinding extends ViewDataBinding {
    public final Toolbar A;
    public EditDriverInstructionsViewModel B;
    public final EditText y;
    public final StatefulButton z;

    public ActivityEditDriverInstructionBinding(DataBindingComponent dataBindingComponent, View view, EditText editText, StatefulButton statefulButton, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = editText;
        this.z = statefulButton;
        this.A = toolbar;
    }

    public abstract void L(EditDriverInstructionsViewModel editDriverInstructionsViewModel);
}
