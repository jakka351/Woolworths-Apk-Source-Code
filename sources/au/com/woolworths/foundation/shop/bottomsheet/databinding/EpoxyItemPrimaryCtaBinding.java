package au.com.woolworths.foundation.shop.bottomsheet.databinding;

import android.view.View;
import android.widget.Button;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetContract;

/* loaded from: classes4.dex */
public abstract class EpoxyItemPrimaryCtaBinding extends ViewDataBinding {
    public BaseBottomSheetContract.CtaClickListener A;
    public final Button y;
    public ContentCta z;

    public EpoxyItemPrimaryCtaBinding(DataBindingComponent dataBindingComponent, View view, Button button) {
        super(dataBindingComponent, view, 0);
        this.y = button;
    }
}
