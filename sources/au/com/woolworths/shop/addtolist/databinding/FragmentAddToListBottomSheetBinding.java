package au.com.woolworths.shop.addtolist.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeHorizontalDividerBinding;
import au.com.woolworths.android.onesite.modules.customviews.statefulbutton.StatefulButton;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetViewModel;
import au.com.woolworths.views.horizontalselector.HorizontalSelectorView;
import com.airbnb.epoxy.EpoxyRecyclerView;

/* loaded from: classes4.dex */
public abstract class FragmentAddToListBottomSheetBinding extends ViewDataBinding {
    public final TextView A;
    public final FrameLayout B;
    public final HorizontalSelectorView C;
    public final Group D;
    public final Group E;
    public final Group F;
    public final FrameLayout G;
    public final StatefulButton H;
    public final EpoxyRecyclerView I;
    public final TextView J;
    public final View K;
    public final Button L;
    public ProductCard M;
    public AddToListBottomSheetViewModel N;
    public View O;
    public final EpoxyItemListsAddBinding y;
    public final IncludeHorizontalDividerBinding z;

    public FragmentAddToListBottomSheetBinding(DataBindingComponent dataBindingComponent, View view, EpoxyItemListsAddBinding epoxyItemListsAddBinding, IncludeHorizontalDividerBinding includeHorizontalDividerBinding, TextView textView, FrameLayout frameLayout, HorizontalSelectorView horizontalSelectorView, Group group, Group group2, Group group3, FrameLayout frameLayout2, StatefulButton statefulButton, EpoxyRecyclerView epoxyRecyclerView, TextView textView2, View view2, Button button) {
        super(dataBindingComponent, view, 3);
        this.y = epoxyItemListsAddBinding;
        this.z = includeHorizontalDividerBinding;
        this.A = textView;
        this.B = frameLayout;
        this.C = horizontalSelectorView;
        this.D = group;
        this.E = group2;
        this.F = group3;
        this.G = frameLayout2;
        this.H = statefulButton;
        this.I = epoxyRecyclerView;
        this.J = textView2;
        this.K = view2;
        this.L = button;
    }

    public abstract void L(View view);

    public abstract void M(ProductCard productCard);

    public abstract void N(AddToListBottomSheetViewModel addToListBottomSheetViewModel);
}
