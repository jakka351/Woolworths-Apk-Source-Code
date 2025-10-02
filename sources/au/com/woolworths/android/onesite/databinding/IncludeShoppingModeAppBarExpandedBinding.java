package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.android.onesite.models.text.Text;
import au.com.woolworths.android.onesite.modules.main.CollectionModeHeaderInterface;
import au.com.woolworths.base.shopapp.modules.collectionmode.data.CollectionModeLabel;

/* loaded from: classes3.dex */
public abstract class IncludeShoppingModeAppBarExpandedBinding extends ViewDataBinding {
    public final TextView A;
    public CollectionModeHeaderInterface B;
    public CollectionModeLabel C;
    public Text D;
    public final IncludeBrandLabelBinding y;
    public final TextView z;

    public IncludeShoppingModeAppBarExpandedBinding(View view, TextView textView, TextView textView2, DataBindingComponent dataBindingComponent, IncludeBrandLabelBinding includeBrandLabelBinding) {
        super(dataBindingComponent, view, 1);
        this.y = includeBrandLabelBinding;
        this.z = textView;
        this.A = textView2;
    }
}
