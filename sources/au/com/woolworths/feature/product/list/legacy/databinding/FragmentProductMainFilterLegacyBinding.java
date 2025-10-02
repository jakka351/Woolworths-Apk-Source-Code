package au.com.woolworths.feature.product.list.legacy.databinding;

import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes3.dex */
public abstract class FragmentProductMainFilterLegacyBinding extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;
    public final FrameLayout A;
    public final StatefulButton B;
    public final Toolbar C;
    public ProductListOptionsViewModel D;
    public final FrameLayout y;
    public final EpoxyRecyclerView z;

    public FragmentProductMainFilterLegacyBinding(DataBindingComponent dataBindingComponent, View view, FrameLayout frameLayout, EpoxyRecyclerView epoxyRecyclerView, FrameLayout frameLayout2, StatefulButton statefulButton, Toolbar toolbar) {
        super(dataBindingComponent, view, 1);
        this.y = frameLayout;
        this.z = epoxyRecyclerView;
        this.A = frameLayout2;
        this.B = statefulButton;
        this.C = toolbar;
    }

    public abstract void L(ProductListOptionsViewModel productListOptionsViewModel);
}
