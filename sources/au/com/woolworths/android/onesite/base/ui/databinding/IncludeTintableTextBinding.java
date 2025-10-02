package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.tintabletext.TintableTextData;

/* loaded from: classes3.dex */
public abstract class IncludeTintableTextBinding extends ViewDataBinding {
    public final TextView A;
    public TintableTextData B;
    public final ImageView y;
    public final ImageView z;

    public IncludeTintableTextBinding(DataBindingComponent dataBindingComponent, View view, ImageView imageView, ImageView imageView2, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = imageView2;
        this.A = textView;
    }

    public abstract void L(TintableTextData tintableTextData);
}
