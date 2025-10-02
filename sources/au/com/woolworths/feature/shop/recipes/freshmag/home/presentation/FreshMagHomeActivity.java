package au.com.woolworths.feature.shop.recipes.freshmag.home.presentation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.compose.ComponentActivityKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.recipes.databinding.ActivityFreshmagHomeBinding;
import au.com.woolworths.feature.shop.recipes.freshmag.FreshMagScreen;
import au.com.woolworths.feature.shop.recipes.freshmag.home.domain.FreshMagHomeViewModel;
import au.com.woolworths.feature.shop.recipes.freshmag.home.ui.FreshMagHomeScreenKt;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/recipes/freshmag/home/presentation/FreshMagHomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "recipes_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class FreshMagHomeActivity extends Hilt_FreshMagHomeActivity {
    public static final /* synthetic */ int C = 0;
    public FreshMagHomeController A;
    public CartBadgeActionView B;
    public FeatureToggleManager x;
    public ActivityFreshmagHomeBinding y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(FreshMagHomeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });

    public final FreshMagHomeViewModel O4() {
        return (FreshMagHomeViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.Hilt_FreshMagHomeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (((Boolean) O4().n.getD()).booleanValue()) {
            ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity.onCreate.1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final FreshMagHomeActivity freshMagHomeActivity = FreshMagHomeActivity.this;
                        CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1847684025, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.recipes.freshmag.home.presentation.FreshMagHomeActivity.onCreate.1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    composer2.o(5004770);
                                    FreshMagHomeActivity freshMagHomeActivity2 = freshMagHomeActivity;
                                    boolean zI = composer2.I(freshMagHomeActivity2);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new FreshMagHomeActivity$onCreate$1$1$1$1(0, freshMagHomeActivity2, FreshMagHomeActivity.class, "finish", "finish()V", 0);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    int i = FreshMagHomeActivity.C;
                                    FreshMagHomeScreenKt.b((Function0) ((KFunction) objG), freshMagHomeActivity2.O4(), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 1792903147));
        } else {
            ActivityFreshmagHomeBinding activityFreshmagHomeBinding = (ActivityFreshmagHomeBinding) DataBindingUtil.d(this, R.layout.activity_freshmag_home);
            this.y = activityFreshmagHomeBinding;
            if (activityFreshmagHomeBinding == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            setSupportActionBar(activityFreshmagHomeBinding.B);
            this.A = new FreshMagHomeController(O4());
            ActivityFreshmagHomeBinding activityFreshmagHomeBinding2 = this.y;
            if (activityFreshmagHomeBinding2 == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            activityFreshmagHomeBinding2.D(this);
            EpoxyRecyclerView epoxyRecyclerView = activityFreshmagHomeBinding2.A;
            FreshMagHomeController freshMagHomeController = this.A;
            if (freshMagHomeController == null) {
                Intrinsics.p("epoxyController");
                throw null;
            }
            epoxyRecyclerView.setController(freshMagHomeController);
            O4().k.f(this, new FreshMagHomeActivity$sam$androidx_lifecycle_Observer$0(new au.com.woolworths.feature.shop.instore.navigation.map.utils.a(this, 12)));
            BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new FreshMagHomeActivity$listenToActions$1(this, null), 3);
        }
        O4().q6();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        if (!((Boolean) O4().n.getD()).booleanValue()) {
            getMenuInflater().inflate(R.menu.menu_cart_only, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
            View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
            CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
            if (cartBadgeActionView != null) {
                cartBadgeActionView.setAnalyticsScreen(FreshMagScreen.e);
            }
            if (cartBadgeActionView != null) {
                cartBadgeActionView.setVisibility(8);
            }
            this.B = cartBadgeActionView;
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (((Boolean) O4().n.getD()).booleanValue() || menuItem.getItemId() != 16908332) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
                Callback.q();
                return zOnOptionsItemSelected;
            }
            onBackPressed();
            Callback.q();
            return true;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        O4().g.a(FreshMagScreen.e);
    }
}
