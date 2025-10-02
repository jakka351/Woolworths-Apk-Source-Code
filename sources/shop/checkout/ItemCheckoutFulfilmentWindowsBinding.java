package shop.checkout;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.Carousel;

/* loaded from: classes8.dex */
public abstract class ItemCheckoutFulfilmentWindowsBinding extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;
    public final Carousel y;
    public String z;

    public ItemCheckoutFulfilmentWindowsBinding(DataBindingComponent dataBindingComponent, View view, Carousel carousel) {
        super(dataBindingComponent, view, 0);
        this.y = carousel;
    }

    public abstract void L(String str);
}
