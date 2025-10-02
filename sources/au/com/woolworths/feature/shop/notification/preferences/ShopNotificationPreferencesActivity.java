package au.com.woolworths.feature.shop.notification.preferences;

import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesContract;
import au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferenceScreens;
import au.com.woolworths.feature.shop.notification.preferences.databinding.ActivityShopNotificationPreferencesBinding;
import au.com.woolworths.feature.shop.notification.preferences.details.ShopNotificationPreferencesDetailsFragment;
import au.com.woolworths.feature.shop.notification.preferences.interactor.PreferencesCommInteractor;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.flow.SharedFlowImpl;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/ShopNotificationPreferencesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesActivity extends Hilt_ShopNotificationPreferencesActivity {
    public static final /* synthetic */ int A = 0;
    public PreferencesCommInteractor x;
    public final ViewModelLazy y = new ViewModelLazy(Reflection.f24268a.b(ShopNotificationPreferencesViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.notification.preferences.ShopNotificationPreferencesActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public Activities.PreferencesDetails.ExtrasData z;

    public final void O4(String str, String str2) {
        ShopNotificationPreferencesDetailsFragment shopNotificationPreferencesDetailsFragment = new ShopNotificationPreferencesDetailsFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("extra_argument", new ShopNotificationPreferencesDetailsFragment.Extras(str2, str));
        shopNotificationPreferencesDetailsFragment.setArguments(bundle);
        if (getSupportFragmentManager().G("ShopNotificationPreferencesDetailsFragment") != null) {
            return;
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
        FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
        fragmentTransactionE.j(com.woolworths.R.id.fragment_container, shopNotificationPreferencesDetailsFragment, "ShopNotificationPreferencesDetailsFragment");
        fragmentTransactionE.e();
    }

    @Override // au.com.woolworths.feature.shop.notification.preferences.Hilt_ShopNotificationPreferencesActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Activities.PreferencesDetails.ExtrasData extrasData;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null || (extrasData = (Activities.PreferencesDetails.ExtrasData) extras.getParcelable("EXTRA_DATA")) == null) {
            throw new IllegalArgumentException("Preference extra data is missing");
        }
        this.z = extrasData;
        ActivityShopNotificationPreferencesBinding activityShopNotificationPreferencesBinding = (ActivityShopNotificationPreferencesBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_shop_notification_preferences);
        if (activityShopNotificationPreferencesBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        Toolbar toolbar = activityShopNotificationPreferencesBinding.y;
        activityShopNotificationPreferencesBinding.D(this);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getString(com.woolworths.R.string.notifications_title));
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ShopNotificationPreferencesActivity$initActionListening$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ShopNotificationPreferencesActivity$initActionListening$2(this, null), 3);
        if (getSupportFragmentManager().G("ShopNotificationPreferencesDetailsFragment") == null) {
            ShopNotificationPreferencesViewModel shopNotificationPreferencesViewModel = (ShopNotificationPreferencesViewModel) this.y.getD();
            SharedFlowImpl sharedFlowImpl = shopNotificationPreferencesViewModel.g;
            if (shopNotificationPreferencesViewModel.e.d()) {
                sharedFlowImpl.f(ShopNotificationPreferencesContract.Actions.ShowDetailsScreen.f7901a);
            } else {
                sharedFlowImpl.f(ShopNotificationPreferencesContract.Actions.ShowGuestScreen.f7902a);
            }
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
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

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ShopNotificationPreferencesViewModel shopNotificationPreferencesViewModel = (ShopNotificationPreferencesViewModel) this.y.getD();
        AnalyticsManager analyticsManager = shopNotificationPreferencesViewModel.f;
        if (shopNotificationPreferencesViewModel.e.d()) {
            analyticsManager.a(NotificationPreferenceScreens.d);
        } else {
            analyticsManager.a(NotificationPreferenceScreens.e);
        }
    }
}
