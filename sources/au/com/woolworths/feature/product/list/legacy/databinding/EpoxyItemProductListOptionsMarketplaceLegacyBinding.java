package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.feature.product.list.legacy.data.ProductFilterSwitch;
import com.google.android.material.switchmaterial.SwitchMaterial;

/* loaded from: classes3.dex */
public abstract class EpoxyItemProductListOptionsMarketplaceLegacyBinding extends ViewDataBinding {
    public final IncludeHorizontalDividerBinding A;
    public final ImageView B;
    public final SwitchMaterial C;
    public final TextView D;
    public ProductFilterSwitch E;
    public final TextView y;
    public final IncludeHorizontalDividerBinding z;

    public EpoxyItemProductListOptionsMarketplaceLegacyBinding(DataBindingComponent dataBindingComponent, View view, TextView textView, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, IncludeHorizontalDividerBinding includeHorizontalDividerBinding2, ImageView imageView, SwitchMaterial switchMaterial, TextView textView2) {
        super(dataBindingComponent, view, 2);
        this.y = textView;
        this.z = includeHorizontalDividerBinding;
        this.A = includeHorizontalDividerBinding2;
        this.B = imageView;
        this.C = switchMaterial;
        this.D = textView2;
    }
}
