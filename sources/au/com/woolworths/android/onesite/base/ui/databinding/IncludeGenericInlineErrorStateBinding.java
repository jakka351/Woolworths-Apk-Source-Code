package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.common.InlineErrorCause;
import au.com.woolworths.android.onesite.modules.common.InlineErrorStateClickHandler;

/* loaded from: classes3.dex */
public abstract class IncludeGenericInlineErrorStateBinding extends ViewDataBinding {
    public final ImageView A;
    public final ImageView B;
    public final TextView C;
    public InlineErrorCause D;
    public InlineErrorStateClickHandler E;
    public final View y;
    public final Button z;

    public IncludeGenericInlineErrorStateBinding(DataBindingComponent dataBindingComponent, View view, View view2, Button button, ImageView imageView, ImageView imageView2, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = view2;
        this.z = button;
        this.A = imageView;
        this.B = imageView2;
        this.C = textView;
    }

    public abstract void L(InlineErrorStateClickHandler inlineErrorStateClickHandler);

    public abstract void M(InlineErrorCause inlineErrorCause);
}
