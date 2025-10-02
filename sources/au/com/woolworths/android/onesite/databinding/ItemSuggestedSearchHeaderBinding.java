package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class ItemSuggestedSearchHeaderBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final Button y;
    public final TextView z;

    public ItemSuggestedSearchHeaderBinding(View view, Button button, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = textView;
    }
}
