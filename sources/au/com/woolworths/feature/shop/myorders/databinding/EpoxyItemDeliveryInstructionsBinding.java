package au.com.woolworths.feature.shop.myorders.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.feature.shop.myorders.details.OrderDetailsClickHandler;
import au.com.woolworths.feature.shop.myorders.details.models.DeliveryInstructionsData;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public abstract class EpoxyItemDeliveryInstructionsBinding extends ViewDataBinding {
    public final TextView A;
    public final Button B;
    public final TextView C;
    public final ImageButton D;
    public final TextView E;
    public final SwitchMaterial F;
    public DeliveryInstructionsData G;
    public OrderDetailsClickHandler H;
    public final IncludeHorizontalDividerBinding y;
    public final IncludeHorizontalDividerBinding z;

    public EpoxyItemDeliveryInstructionsBinding(DataBindingComponent dataBindingComponent, View view, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, IncludeHorizontalDividerBinding includeHorizontalDividerBinding2, TextView textView, Button button, TextView textView2, ImageButton imageButton, TextView textView3, SwitchMaterial switchMaterial) {
        super(dataBindingComponent, view, 2);
        this.y = includeHorizontalDividerBinding;
        this.z = includeHorizontalDividerBinding2;
        this.A = textView;
        this.B = button;
        this.C = textView2;
        this.D = imageButton;
        this.E = textView3;
        this.F = switchMaterial;
    }
}
