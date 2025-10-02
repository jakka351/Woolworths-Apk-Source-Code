package au.com.woolworths.foundation.barcode.ui.view.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;

/* loaded from: classes4.dex */
public abstract class BarcodeHolderBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public boolean A;
    public final ImageView y;
    public final TextView z;

    public BarcodeHolderBinding(View view, ImageView imageView, TextView textView, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = imageView;
        this.z = textView;
    }

    public abstract void L(boolean z);
}
