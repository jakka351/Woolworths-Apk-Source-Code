package au.com.woolworths.shop.product.navigation.ui.subcategory;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.specials.SpecialsSubCategoryAnalytics;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.shop.cart.domain.interactor.CartUpdateInteractor;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import au.com.woolworths.shop.product.navigation.analytics.ProductCategoryTrackingDataKt;
import au.com.woolworths.shop.product.navigation.data.ProductCategoryList;
import au.com.woolworths.shop.product.navigation.databinding.ActivitySubCategoryBinding;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity;
import au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryContract;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Companion", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SubCategoryActivity extends Hilt_SubCategoryActivity {
    public static final /* synthetic */ int D = 0;
    public SubCategoryEpoxyController A;
    public final ViewModelLazy B = new ViewModelLazy(Reflection.f24268a.b(SubCategoryViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final CompositeDisposable C = new CompositeDisposable();
    public CartUpdateInteractor x;
    public FeatureToggleManager y;
    public ActivitySubCategoryBinding z;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryActivity$Companion;", "", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.product.navigation.ui.subcategory.SubCategoryActivity$onResume$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<SubCategoryContract.Actions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            SubCategoryContract.Actions p0 = (SubCategoryContract.Actions) obj;
            Intrinsics.h(p0, "p0");
            SubCategoryActivity subCategoryActivity = (SubCategoryActivity) this.receiver;
            int i = SubCategoryActivity.D;
            subCategoryActivity.getClass();
            if (p0 instanceof SubCategoryContract.Actions.LaunchSubCategory) {
                Activities.ProductSubCategory.Extras extras = ((SubCategoryContract.Actions.LaunchSubCategory) p0).f12645a;
                Intent intent = new Intent(subCategoryActivity, (Class<?>) SubCategoryActivity.class);
                intent.putExtra("EXTRA_PRODUCT_SUB_CATEGORY_INFO", extras);
                subCategoryActivity.startActivity(intent);
            } else {
                if (!(p0 instanceof SubCategoryContract.Actions.LaunchProductList)) {
                    throw new NoWhenBranchMatchedException();
                }
                SubCategoryContract.Actions.LaunchProductList launchProductList = (SubCategoryContract.Actions.LaunchProductList) p0;
                Activities.ProductList.ExtrasPageData extrasPageData = launchProductList.f12644a;
                Activities.ProductList.ExtraProductListSource extraProductListSource = launchProductList.b;
                Intent intentA = ActivityNavigatorKt.a(Activities.ProductList.f4505a, ApplicationType.e);
                intentA.putExtra("EXTRA_PRODUCT_LIST_INFO", new Activities.ProductList.Extras(extrasPageData, extraProductListSource, (Activities.ProductList.ExtrasConfig) null, 12));
                subCategoryActivity.startActivity(intentA);
            }
            return Unit.f24250a;
        }
    }

    public final SubCategoryViewModel O4() {
        return (SubCategoryViewModel) this.B.getD();
    }

    @Override // au.com.woolworths.shop.product.navigation.ui.subcategory.Hilt_SubCategoryActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.ProductSubCategory.Extras extras = (Activities.ProductSubCategory.Extras) getIntent().getParcelableExtra("EXTRA_PRODUCT_SUB_CATEGORY_INFO");
        if (extras == null) {
            throw new IllegalStateException("Product SubCategory page must have a non-null extra");
        }
        this.z = (ActivitySubCategoryBinding) DataBindingUtil.d(this, R.layout.activity_sub_category);
        this.A = new SubCategoryEpoxyController(O4());
        ActivitySubCategoryBinding activitySubCategoryBinding = this.z;
        if (activitySubCategoryBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activitySubCategoryBinding.D(this);
        activitySubCategoryBinding.L(O4());
        EpoxyRecyclerView epoxyRecyclerView = activitySubCategoryBinding.z;
        SubCategoryEpoxyController subCategoryEpoxyController = this.A;
        if (subCategoryEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(subCategoryEpoxyController);
        ActivitySubCategoryBinding activitySubCategoryBinding2 = this.z;
        if (activitySubCategoryBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activitySubCategoryBinding2.B);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.A(extras.d);
        O4().j.f(this, new Observer() { // from class: au.com.woolworths.shop.product.navigation.ui.subcategory.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                int i = SubCategoryActivity.D;
                ProductCategoryList productCategoryList = ((SubCategoryContract.ViewState) obj).b;
                if (productCategoryList != null) {
                    SubCategoryEpoxyController subCategoryEpoxyController2 = this.d.A;
                    if (subCategoryEpoxyController2 != null) {
                        subCategoryEpoxyController2.setData(productCategoryList);
                    } else {
                        Intrinsics.p("epoxyController");
                        throw null;
                    }
                }
            }
        });
        SubCategoryViewModel subCategoryViewModelO4 = O4();
        Activities.ProductSubCategory.ProductCategoryType productCategoryType = extras.f;
        Intrinsics.h(productCategoryType, "<set-?>");
        subCategoryViewModelO4.l = productCategoryType;
        O4().p6(extras.e);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [au.com.woolworths.android.onesite.analytics.Screen, java.lang.Enum] */
    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_cart_and_search, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.cart_item);
        CartUpdateInteractor cartUpdateInteractor = this.x;
        if (cartUpdateInteractor == null) {
            Intrinsics.p("cartUpdateInteractor");
            throw null;
        }
        menuItemFindItem.setVisible(cartUpdateInteractor.b.z());
        View actionView = menuItemFindItem.getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : 0;
        if (cartBadgeActionView == 0) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(ProductCategoryTrackingDataKt.a(O4().l).f12639a);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            int itemId = item.getItemId();
            if (itemId == 16908332) {
                onBackPressed();
                Callback.q();
                return true;
            }
            if (itemId != R.id.search) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
                Callback.q();
                return zOnOptionsItemSelected;
            }
            SubCategoryViewModel subCategoryViewModelO4 = O4();
            subCategoryViewModelO4.f.j(ProductCategoryTrackingDataKt.a(subCategoryViewModelO4.l).b, subCategoryViewModelO4.q6());
            startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.Generic(null)));
            Callback.q();
            return true;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        this.C.e();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        PublishSubject publishSubject = O4().k;
        final AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, this, SubCategoryActivity.class, "handleActions", "handleActions(Lau/com/woolworths/shop/product/navigation/ui/subcategory/SubCategoryContract$Actions;)V", 0);
        Consumer consumer = new Consumer() { // from class: au.com.woolworths.shop.product.navigation.ui.subcategory.b
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                int i = SubCategoryActivity.D;
                ((SubCategoryActivity.AnonymousClass1) anonymousClass1).invoke(obj);
            }
        };
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(consumer, Functions.e);
        publishSubject.a(lambdaObserver);
        DisposableKt.a(this.C, lambdaObserver);
        O4().f.g(SpecialsSubCategoryAnalytics.Home.Action.e);
    }
}
