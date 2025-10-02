package au.com.woolworths.shared.ui.views.databinding;

import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.airbnb.epoxy.Carousel;

/* loaded from: classes4.dex */
public abstract class LayoutHorizontalSelectorBinding extends ViewDataBinding {
    public static final /* synthetic */ int B = 0;
    public final View A;
    public final View y;
    public final Carousel z;

    public LayoutHorizontalSelectorBinding(DataBindingComponent dataBindingComponent, View view, View view2, Carousel carousel, View view3) {
        super(dataBindingComponent, view, 0);
        this.y = view2;
        this.z = carousel;
        this.A = view3;
    }
}
