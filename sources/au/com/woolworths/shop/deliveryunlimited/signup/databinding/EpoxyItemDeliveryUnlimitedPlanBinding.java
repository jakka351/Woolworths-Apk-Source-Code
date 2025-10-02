package au.com.woolworths.shop.deliveryunlimited.signup.databinding;

import android.view.View;
import android.widget.CheckedTextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeBrandLabelBinding;
import au.com.woolworths.product.tile.ProductPriceView;
import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSignUpPlanUiModel;
import au.com.woolworths.shop.deliveryunlimited.signup.selectplan.SelectPlanClickListener;
import au.com.woolworths.views.CheckableConstraintLayout;

/* loaded from: classes4.dex */
public abstract class EpoxyItemDeliveryUnlimitedPlanBinding extends ViewDataBinding {
    public final ProductPriceView A;
    public final CheckedTextView B;
    public final CheckedTextView C;
    public DeliveryUnlimitedSignUpPlanUiModel D;
    public SelectPlanClickListener E;
    public final IncludeBrandLabelBinding y;
    public final CheckableConstraintLayout z;

    public EpoxyItemDeliveryUnlimitedPlanBinding(DataBindingComponent dataBindingComponent, View view, IncludeBrandLabelBinding includeBrandLabelBinding, CheckableConstraintLayout checkableConstraintLayout, ProductPriceView productPriceView, CheckedTextView checkedTextView, CheckedTextView checkedTextView2) {
        super(dataBindingComponent, view, 1);
        this.y = includeBrandLabelBinding;
        this.z = checkableConstraintLayout;
        this.A = productPriceView;
        this.B = checkedTextView;
        this.C = checkedTextView2;
    }
}
