package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentProductListOptionsFilterLegacyBinding extends ViewDataBinding {
    public static final /* synthetic */ int G = 0;
    public final FrameLayout A;
    public final EpoxyRecyclerView B;
    public final StatefulButton C;
    public final Button D;
    public final Toolbar E;
    public ProductListOptionsViewModel F;
    public final FrameLayout y;
    public final Button z;

    public FragmentProductListOptionsFilterLegacyBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, Button button, FrameLayout frameLayout2, EpoxyRecyclerView epoxyRecyclerView, StatefulButton statefulButton, Button button2, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = frameLayout;
        this.z = button;
        this.A = frameLayout2;
        this.B = epoxyRecyclerView;
        this.C = statefulButton;
        this.D = button2;
        this.E = toolbar;
    }

    public abstract void L(ProductListOptionsViewModel productListOptionsViewModel);
}
