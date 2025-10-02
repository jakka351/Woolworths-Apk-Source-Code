package au.com.woolworths.base.shopapp.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.HorizontalListDataInterface;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionState;

/* loaded from: classes3.dex */
public abstract class EpoxyItemHorizontalListTileHeaderBinding extends ViewDataBinding {
    public final Button A;
    public final ProgressBar B;
    public final ProgressBar C;
    public final TextView D;
    public final TextView E;
    public HorizontalListDataInterface F;
    public HorizontalListActionClickListener G;
    public HorizontalListActionState H;
    public Boolean I;
    public final FrameLayout y;
    public final Button z;

    public EpoxyItemHorizontalListTileHeaderBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, Button button, Button button2, ProgressBar progressBar, ProgressBar progressBar2, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = frameLayout;
        this.z = button;
        this.A = button2;
        this.B = progressBar;
        this.C = progressBar2;
        this.D = textView;
        this.E = textView2;
    }
}
