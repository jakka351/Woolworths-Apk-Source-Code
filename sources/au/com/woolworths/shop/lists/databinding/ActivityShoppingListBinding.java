package au.com.woolworths.shop.lists.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsView;
import au.com.woolworths.shop.lists.ui.details.ui.ListDetailsViewListener;
import au.com.woolworths.shop.lists.ui.shoppinglist.main.ShoppingListDetailsContract;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByView;
import au.com.woolworths.shop.lists.ui.shoppinglist.sort.SortByViewListener;
import au.com.woolworths.shop.lists.ui.watchlist.toggle.WatchlistToggleView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes4.dex */
public abstract class ActivityShoppingListBinding extends ViewDataBinding {
    public final TextView A;
    public final CollapsingToolbarLayout B;
    public final ConstraintLayout C;
    public final CoordinatorLayout D;
    public final View E;
    public final TextView F;
    public final ComposeView G;
    public final View H;
    public final MaterialButton I;
    public final EpoxyRecyclerView J;
    public final Button K;
    public final ConstraintLayout L;
    public final SortByView M;
    public final SwipeRefreshLayout N;
    public final Toolbar O;
    public final ListDetailsView P;
    public final WatchlistToggleView Q;
    public ShoppingListDetailsContract.IShoppingListDetailsViewModel R;
    public Boolean S;
    public String T;
    public ListDetailsViewListener U;
    public SortByViewListener V;
    public final AppBarLayout y;
    public final IncludeBoostAllBannerBinding z;

    public ActivityShoppingListBinding(DataBindingComponent dataBindingComponent, View view, AppBarLayout appBarLayout, IncludeBoostAllBannerBinding includeBoostAllBannerBinding, TextView textView, CollapsingToolbarLayout collapsingToolbarLayout, ConstraintLayout constraintLayout, CoordinatorLayout coordinatorLayout, View view2, TextView textView2, ComposeView composeView, View view3, MaterialButton materialButton, EpoxyRecyclerView epoxyRecyclerView, Button button, ConstraintLayout constraintLayout2, SortByView sortByView, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, ListDetailsView listDetailsView, WatchlistToggleView watchlistToggleView) {
        super(dataBindingComponent, view, 2);
        this.y = appBarLayout;
        this.z = includeBoostAllBannerBinding;
        this.A = textView;
        this.B = collapsingToolbarLayout;
        this.C = constraintLayout;
        this.D = coordinatorLayout;
        this.E = view2;
        this.F = textView2;
        this.G = composeView;
        this.H = view3;
        this.I = materialButton;
        this.J = epoxyRecyclerView;
        this.K = button;
        this.L = constraintLayout2;
        this.M = sortByView;
        this.N = swipeRefreshLayout;
        this.O = toolbar;
        this.P = listDetailsView;
        this.Q = watchlistToggleView;
    }

    public abstract void L(ListDetailsViewListener listDetailsViewListener);

    public abstract void M(Boolean bool);

    public abstract void N(String str);

    public abstract void O(SortByViewListener sortByViewListener);

    public abstract void P(ShoppingListDetailsContract.IShoppingListDetailsViewModel iShoppingListDetailsViewModel);
}
