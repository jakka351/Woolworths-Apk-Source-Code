package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class FragmentProgressDialogBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public String A;
    public final View y;
    public final TextView z;

    public FragmentProgressDialogBinding(View view, View view2, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = view2;
        this.z = textView;
    }

    public abstract void L(String str);
}
