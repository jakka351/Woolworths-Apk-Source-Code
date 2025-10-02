package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButtonState;

/* loaded from: classes3.dex */
public abstract class StatefulButtonCheckedBinding extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;
    public final TextView A;
    public StatefulButtonState B;
    public final View y;
    public final View z;

    public StatefulButtonCheckedBinding(DataBindingComponent dataBindingComponent, View view, View view2, View view3, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = view2;
        this.z = view3;
        this.A = textView;
    }

    public abstract void L(StatefulButtonState statefulButtonState);
}
