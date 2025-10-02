package au.com.woolworths.feature.product.list.legacy;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.feature.product.list.legacy.ProductListFragment;
import au.com.woolworths.feature.product.list.legacy.databinding.ActivityLegacyProductListBinding;
import au.com.woolworths.foundation.shop.marketplace.education.ui.EducationBottomSheetViewModel;
import au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment;
import au.com.woolworths.shop.addtolist.models.ListChangeEvent;
import au.com.woolworths.shop.addtolist.models.ListChangeEventKt;
import com.dynatrace.android.callback.Callback;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/LegacyProductListActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/shop/addtolist/add/AddToListBottomSheetFragment$BottomSheetHost;", "<init>", "()V", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class LegacyProductListActivity extends Hilt_LegacyProductListActivity implements AddToListBottomSheetFragment.BottomSheetHost {
    public static final /* synthetic */ int D = 0;
    public final ViewModelLazy A;
    public final ViewModelLazy B;
    public final ViewModelLazy C;
    public AnalyticsManager x;
    public ShopAppNavigator y;
    public ActivityLegacyProductListBinding z;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/LegacyProductListActivity$Companion;", "", "", "MAIN_OPTIONS", "Ljava/lang/String;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public LegacyProductListActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.A = new ViewModelLazy(reflectionFactory.b(ProductListViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.B = new ViewModelLazy(reflectionFactory.b(EducationBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.C = new ViewModelLazy(reflectionFactory.b(ProductListOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$8
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.LegacyProductListActivity$special$$inlined$viewModels$default$9
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final CoroutineScope A2() {
        return ViewModelKt.a((ProductListViewModel) this.A.getD());
    }

    @Override // au.com.woolworths.shop.addtolist.add.AddToListBottomSheetFragment.BottomSheetHost
    public final void E2(ListChangeEvent listChangeEvent) {
        if (listChangeEvent instanceof ListChangeEvent.AddToListSuccessEvent) {
            ListChangeEvent.AddToListSuccessEvent addToListSuccessEvent = (ListChangeEvent.AddToListSuccessEvent) listChangeEvent;
            ActivityLegacyProductListBinding activityLegacyProductListBinding = this.z;
            if (activityLegacyProductListBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            View view = activityLegacyProductListBinding.h;
            Intrinsics.g(view, "getRoot(...)");
            ListChangeEventKt.a(addToListSuccessEvent, this, view, false, 28);
            ((ProductListViewModel) this.A.getD()).H6(addToListSuccessEvent.h);
        }
    }

    @Override // au.com.woolworths.feature.product.list.legacy.Hilt_LegacyProductListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.ProductList.Extras extras = (Activities.ProductList.Extras) getIntent().getParcelableExtra("EXTRA_PRODUCT_LIST_INFO");
        if (extras == null) {
            throw new IllegalStateException("Product List: Activity should be launched with extra Product List Data!");
        }
        this.z = (ActivityLegacyProductListBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_legacy_product_list);
        if (bundle == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Intrinsics.g(supportFragmentManager, "getSupportFragmentManager(...)");
            FragmentTransaction fragmentTransactionE = supportFragmentManager.e();
            fragmentTransactionE.j(com.woolworths.R.id.fragment_container, ProductListFragment.Companion.a(new ProductListFragment.Extras(extras)), null);
            fragmentTransactionE.d();
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new LegacyProductListActivity$initActionsCollection$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new LegacyProductListActivity$initActionsCollection$2(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new LegacyProductListActivity$initActionsCollection$3(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() == 16908332) {
                onBackPressed();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
