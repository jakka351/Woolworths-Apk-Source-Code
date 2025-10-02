package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes3.dex */
public abstract class FragmentErrorDialogBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public final TextView A;
    public final Button y;
    public final ImageView z;

    public FragmentErrorDialogBinding(DataBindingComponent dataBindingComponent, View view, Button button, ImageView imageView, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = imageView;
        this.A = textView;
    }
}
