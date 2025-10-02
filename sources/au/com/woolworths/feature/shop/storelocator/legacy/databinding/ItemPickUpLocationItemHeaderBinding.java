package au.com.woolworths.feature.shop.storelocator.legacy.databinding;

import android.view.View;
import android.widget.TextView;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;

/* loaded from: classes3.dex */
public abstract class ItemPickUpLocationItemHeaderBinding extends ViewDataBinding {
    public final TextView y;
    public PickUpLocatorContract.SectionType z;

    public ItemPickUpLocationItemHeaderBinding(DataBindingComponent dataBindingComponent, View view, TextView textView) {
        super(dataBindingComponent, view, 0);
        this.y = textView;
    }

    public abstract void L(PickUpLocatorContract.SectionType sectionType);
}
