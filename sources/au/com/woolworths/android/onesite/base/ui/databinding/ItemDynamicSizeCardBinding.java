package au.com.woolworths.android.onesite.base.ui.databinding;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardClickListener;
import au.com.woolworths.android.onesite.dynamicsizecard.listeners.DynamicSizeCardImageLoaderListener;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardData;
import au.com.woolworths.sdui.shop.dynamicsizecard.DynamicSizeCardMargins;

/* loaded from: classes3.dex */
public abstract class ItemDynamicSizeCardBinding extends ViewDataBinding {
    public final ConstraintLayout A;
    public DynamicSizeCardData B;
    public DynamicSizeCardMargins C;
    public DynamicSizeCardClickListener D;
    public DynamicSizeCardImageLoaderListener E;
    public final TextView y;
    public final ImageView z;

    public ItemDynamicSizeCardBinding(View view, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, DataBindingComponent dataBindingComponent) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
        this.z = imageView;
        this.A = constraintLayout;
    }
}
