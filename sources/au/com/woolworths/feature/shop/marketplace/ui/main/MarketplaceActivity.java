package au.com.woolworths.feature.shop.marketplace.ui.main;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.marketplace.databinding.ActivityMarketplaceBinding;
import au.com.woolworths.feature.shop.marketplace.ui.main.MarketplaceActions;
import au.com.woolworths.feature.shop.marketplace.ui.marketplace.MarketplaceFragment;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/marketplace/ui/main/MarketplaceActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "marketplace_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class MarketplaceActivity extends Hilt_MarketplaceActivity {
    public CartUpdateInteractor x;
    public AnalyticsManager y;
    public FeatureToggleManager z;

    @Override // au.com.woolworths.feature.shop.marketplace.ui.main.Hilt_MarketplaceActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(((ActivityMarketplaceBinding) DataBindingUtil.d(this, R.layout.activity_marketplace)).z);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
        fragmentTransactionE.j(R.id.container, new MarketplaceFragment(), null);
        fragmentTransactionE.f();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_cart_and_search, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            int itemId = item.getItemId();
            boolean zOnOptionsItemSelected = true;
            if (itemId == 16908332) {
                onBackPressed();
            } else if (itemId == R.id.search) {
                AnalyticsManager analyticsManager = this.y;
                if (analyticsManager == null) {
                    Intrinsics.p("analyticsManager");
                    throw null;
                }
                analyticsManager.c(MarketplaceActions.SearchIconClick.f);
                startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        if (menu == null || (menuItemFindItem = menu.findItem(R.id.cart_item)) == null) {
            return true;
        }
        CartUpdateInteractor cartUpdateInteractor = this.x;
        if (cartUpdateInteractor == null) {
            Intrinsics.p("cartUpdateInteractor");
            throw null;
        }
        menuItemFindItem.setVisible(cartUpdateInteractor.b.z());
        View actionView = menuItemFindItem.getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView == null) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(Screens.m);
        return true;
    }
}
