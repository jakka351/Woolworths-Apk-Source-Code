package au.com.woolworths.feature.shop.storelocator.databinding;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ContentLoadingProgressBar;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentContainerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.android.onesite.base.ui.databinding.IncludeGenericErrorStateBinding;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.button.MaterialButtonToggleGroup;

/* loaded from: classes3.dex */
public abstract class ActivityStoreLocatorBinding extends ViewDataBinding {
    public final Button A;
    public final ContentLoadingProgressBar B;
    public final FragmentContainerView C;
    public final Button D;
    public final SearchView E;
    public final SwipeRefreshLayout F;
    public final MaterialButtonToggleGroup G;
    public final Toolbar H;
    public StoreLocatorViewModel I;
    public final IncludeGenericErrorStateBinding y;
    public final EpoxyRecyclerView z;

    public ActivityStoreLocatorBinding(DataBindingComponent dataBindingComponent, View view, IncludeGenericErrorStateBinding includeGenericErrorStateBinding, EpoxyRecyclerView epoxyRecyclerView, Button button, ContentLoadingProgressBar contentLoadingProgressBar, FragmentContainerView fragmentContainerView, Button button2, SearchView searchView, SwipeRefreshLayout swipeRefreshLayout, MaterialButtonToggleGroup materialButtonToggleGroup, Toolbar toolbar) {
        super(dataBindingComponent, view, 2);
        this.y = includeGenericErrorStateBinding;
        this.z = epoxyRecyclerView;
        this.A = button;
        this.B = contentLoadingProgressBar;
        this.C = fragmentContainerView;
        this.D = button2;
        this.E = searchView;
        this.F = swipeRefreshLayout;
        this.G = materialButtonToggleGroup;
        this.H = toolbar;
    }

    public abstract void L(StoreLocatorViewModel storeLocatorViewModel);
}
