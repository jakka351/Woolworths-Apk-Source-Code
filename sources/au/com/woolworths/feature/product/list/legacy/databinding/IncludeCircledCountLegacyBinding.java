package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class IncludeCircledCountLegacyBinding extends ViewDataBinding {
    public Integer A;
    public Integer B;
    public final TextView y;
    public Boolean z;

    public IncludeCircledCountLegacyBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }

    public abstract void L(Integer num);

    public abstract void M(Integer num);
}
