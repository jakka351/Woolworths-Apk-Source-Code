package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;

/* loaded from: classes3.dex */
public abstract class IncludePriceBreakdownBottomSheetBinding extends ViewDataBinding {
    public final View A;
    public final TextView B;
    public final FrameLayout C;
    public final View D;
    public final TextView E;
    public final View F;
    public Boolean G;
    public String H;
    public String I;
    public YourGroceriesContract.YourGroceriesClickHandler J;
    public final ImageButton y;
    public final LinearLayout z;

    public IncludePriceBreakdownBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, ImageButton imageButton, LinearLayout linearLayout, View view2, TextView textView, FrameLayout frameLayout, View view3, TextView textView2, View view4) {
        super(dataBindingComponent, view, 0);
        this.y = imageButton;
        this.z = linearLayout;
        this.A = view2;
        this.B = textView;
        this.C = frameLayout;
        this.D = view3;
        this.E = textView2;
        this.F = view4;
    }
}
