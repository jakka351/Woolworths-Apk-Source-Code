package au.com.woolworths.shop.checkout.ui.fulfilmentwindows;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.ActionBarOnDestinationChangedListener;
import androidx.navigation.ui.AppBarConfiguration;
import au.com.woolworths.shop.checkout.databinding.ActivityFulfilmentWindowsBinding;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentExtraInfo;
import au.com.woolworths.shop.checkout.domain.model.FulfilmentWindows;
import au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsContract;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/fulfilmentwindows/FulfilmentWindowsActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class FulfilmentWindowsActivity extends Hilt_FulfilmentWindowsActivity {
    public static final /* synthetic */ int B = 0;
    public boolean A;
    public ActivityFulfilmentWindowsBinding x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(FulfilmentWindowsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getD();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.fulfilmentwindows.FulfilmentWindowsActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public NavHostController z;

    public final FulfilmentWindowsViewModel O4() {
        return (FulfilmentWindowsViewModel) this.y.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.fulfilmentwindows.Hilt_FulfilmentWindowsActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x = (ActivityFulfilmentWindowsBinding) DataBindingUtil.d(this, R.layout.activity_fulfilment_windows);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.nav_host_fragment);
        Intrinsics.f(fragmentF, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.z = ((NavHostFragment) fragmentF).E1();
        ActivityFulfilmentWindowsBinding activityFulfilmentWindowsBinding = this.x;
        if (activityFulfilmentWindowsBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityFulfilmentWindowsBinding.y);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.t();
        supportActionBar.s(true);
        NavHostController navHostController = this.z;
        if (navHostController == null) {
            Intrinsics.p("navController");
            throw null;
        }
        AppBarConfiguration.Builder builder = new AppBarConfiguration.Builder();
        FulfilmentWindowsActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 fulfilmentWindowsActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 = new FulfilmentWindowsActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0();
        builder.b = fulfilmentWindowsActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0;
        navHostController.a(new ActionBarOnDestinationChangedListener(this, new AppBarConfiguration(builder.f3520a, fulfilmentWindowsActivity$inlined$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new FulfilmentWindowsActivity$observeActions$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new FulfilmentWindowsActivity$collectViewState$1(this, null), 3);
        FulfilmentWindowsViewModel fulfilmentWindowsViewModelO4 = O4();
        BuildersKt.c(ViewModelKt.a(fulfilmentWindowsViewModelO4), null, null, new FulfilmentWindowsViewModel$fetchFulfilmentWindows$1(fulfilmentWindowsViewModelO4, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_fulfilment, menu);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        FulfilmentWindows fulfilmentWindows;
        FulfilmentExtraInfo fulfilmentExtraInfo;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            int itemId = item.getItemId();
            if (itemId == 16908332) {
                onBackPressed();
                Callback.q();
                return true;
            }
            if (itemId != R.id.fees_item) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
                Callback.q();
                return zOnOptionsItemSelected;
            }
            FulfilmentWindowsViewModel fulfilmentWindowsViewModelO4 = O4();
            FulfilmentWindowsContract.ViewState viewState = (FulfilmentWindowsContract.ViewState) fulfilmentWindowsViewModelO4.k.getValue();
            if (viewState != null && (fulfilmentWindows = viewState.c) != null && (fulfilmentExtraInfo = fulfilmentWindows.h) != null) {
                BuildersKt.c(ViewModelKt.a(fulfilmentWindowsViewModelO4), null, null, new FulfilmentWindowsViewModel$showFeesBottomSheet$1$1(fulfilmentWindowsViewModelO4, fulfilmentExtraInfo, null), 3);
            }
            Callback.q();
            return true;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        menu.findItem(R.id.fees_item).setVisible(this.A);
        return super.onPrepareOptionsMenu(menu);
    }
}
