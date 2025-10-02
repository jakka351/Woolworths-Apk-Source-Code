package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.inlinemessage.InlineMessage;

/* loaded from: classes3.dex */
public abstract class IncludeInlineMessageBinding extends ViewDataBinding {
    public InlineMessage A;
    public final ImageView y;
    public final TextView z;

    public IncludeInlineMessageBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }

    public abstract void L(InlineMessage inlineMessage);
}
