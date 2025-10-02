package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.HorizontalListData;
import au.com.woolworths.base.shopapp.epoxy.HorizontalListActionClickListener;

/* loaded from: classes3.dex */
public abstract class EpoxyItemOrderHorizontalListTileHeaderBinding extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public HorizontalListData C;
    public HorizontalListActionClickListener D;
    public final Button y;
    public final ComposeView z;

    public EpoxyItemOrderHorizontalListTileHeaderBinding(DataBindingComponent dataBindingComponent, View view, Button button, ComposeView composeView, TextView textView, TextView textView2) {
        super(dataBindingComponent, view, 0);
        this.y = button;
        this.z = composeView;
        this.A = textView;
        this.B = textView2;
    }
}
