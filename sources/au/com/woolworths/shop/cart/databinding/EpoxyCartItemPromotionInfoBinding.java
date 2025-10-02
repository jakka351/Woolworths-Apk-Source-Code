package au.com.woolworths.shop.cart.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.foundation.shop.cart.data.model.CartPromotionInfo;
import au.com.woolworths.shop.cart.ui.ProductSectionItemListener;

/* loaded from: classes4.dex */
public abstract class EpoxyCartItemPromotionInfoBinding extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public CartPromotionInfo C;
    public ProductSectionItemListener D;
    public final IncludeHorizontalDividerBinding y;
    public final ImageView z;

    public EpoxyCartItemPromotionInfoBinding(DataBindingComponent dataBindingComponent, View view, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, ImageView imageView, TextView textView, ImageView imageView2) {
        super(dataBindingComponent, view, 1);
        this.y = includeHorizontalDividerBinding;
        this.z = imageView;
        this.A = textView;
        this.B = imageView2;
    }
}
