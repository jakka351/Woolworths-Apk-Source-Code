package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.main.tooltip.CoachMark;

/* loaded from: classes3.dex */
public abstract class ToolTipContentWithTitleBinding extends ViewDataBinding {
    public final TextView A;
    public CoachMark B;
    public final Button y;
    public final ImageView z;

    public ToolTipContentWithTitleBinding(DataBindingComponent dataBindingComponent, View view, Button button, ImageView imageView, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = imageView;
        this.A = textView;
    }
}
