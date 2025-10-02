package au.com.woolworths.android.onesite.databinding;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import au.com.woolworths.android.onesite.modules.main.MainViewModel;
import au.com.woolworths.feature.shop.homepage.presentation.modeselector.ModeSelectorSubHeaderView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.card.MaterialCardView;

/* loaded from: classes3.dex */
public abstract class ActivityMainBinding extends ViewDataBinding {
    public final FrameLayout A;
    public final ModeSelectorSubHeaderView B;
    public final ImageView C;
    public final MaterialCardView D;
    public final FrameLayout E;
    public final AppBarLayout F;
    public final IncludeToolbarHomeCollectionModesBinding G;
    public final ComposeView H;
    public final CoordinatorLayout I;
    public MainViewModel J;
    public String K;
    public final BottomNavigationView y;
    public final IncludeShoppingModeDnBannerBinding z;

    public ActivityMainBinding(DataBindingComponent dataBindingComponent, View view, BottomNavigationView bottomNavigationView, IncludeShoppingModeDnBannerBinding includeShoppingModeDnBannerBinding, FrameLayout frameLayout, ModeSelectorSubHeaderView modeSelectorSubHeaderView, ImageView imageView, MaterialCardView materialCardView, FrameLayout frameLayout2, AppBarLayout appBarLayout, IncludeToolbarHomeCollectionModesBinding includeToolbarHomeCollectionModesBinding, ComposeView composeView, CoordinatorLayout coordinatorLayout) {
        super(dataBindingComponent, view, 3);
        this.y = bottomNavigationView;
        this.z = includeShoppingModeDnBannerBinding;
        this.A = frameLayout;
        this.B = modeSelectorSubHeaderView;
        this.C = imageView;
        this.D = materialCardView;
        this.E = frameLayout2;
        this.F = appBarLayout;
        this.G = includeToolbarHomeCollectionModesBinding;
        this.H = composeView;
        this.I = coordinatorLayout;
    }

    public abstract void L(String str);

    public abstract void M(MainViewModel mainViewModel);
}
