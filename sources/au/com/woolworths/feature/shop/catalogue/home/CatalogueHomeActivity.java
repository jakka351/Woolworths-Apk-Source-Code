package au.com.woolworths.feature.shop.catalogue.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResultLauncher;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.feature.shop.catalogue.CatalogueScreen;
import au.com.woolworths.feature.shop.catalogue.SelectStore;
import au.com.woolworths.feature.shop.catalogue.common.AnalyticsAction;
import au.com.woolworths.feature.shop.catalogue.databinding.ActivityCatalogueHomeBinding;
import au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeContract;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueCard;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueHome;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTracking;
import au.com.woolworths.feature.shop.catalogue.home.model.CatalogueTrackingKt;
import au.com.woolworths.feature.shop.catalogue.home.model.SpecialsCard;
import au.com.woolworths.feature.shop.catalogue.home.model.TermsAndConditions;
import au.com.woolworths.feature.shop.catalogue.intro.CatalogueIntroActivity;
import au.com.woolworths.shop.cart.ui.CartBadgeActionView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/CatalogueHomeActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CatalogueHomeActivity extends Hilt_CatalogueHomeActivity {
    public static final /* synthetic */ int E = 0;
    public final Lazy A;
    public final CatalogueHomeEpoxyController D;
    public FeatureToggleManager x;
    public ActivityCatalogueHomeBinding y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(CatalogueHomeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.catalogue.home.CatalogueHomeActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher B = registerForActivityResult(new SelectStore(CatalogueIntroActivity.class, "extra_catalogue_intro"), new CatalogueHomeActivity$selectInitialStore$1(this));
    public final ActivityResultLauncher C = registerForActivityResult(new SelectStore(), new CatalogueHomeActivity$selectSubsequentStore$1(this));

    public CatalogueHomeActivity() {
        final int i = 0;
        this.A = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.a
            public final /* synthetic */ CatalogueHomeActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                Unit unit = Unit.f24250a;
                CatalogueHomeActivity catalogueHomeActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = CatalogueHomeActivity.E;
                        return (Activities.CatalogueHome.Extras) catalogueHomeActivity.getIntent().getParcelableExtra("extra_catalogue_home");
                    case 1:
                        int i4 = CatalogueHomeActivity.E;
                        catalogueHomeActivity.O4().q6();
                        return unit;
                    case 2:
                        int i5 = CatalogueHomeActivity.E;
                        CatalogueHomeViewModel catalogueHomeViewModelO4 = catalogueHomeActivity.O4();
                        CatalogueHome catalogueHome = ((CatalogueHomeContract.ViewState) catalogueHomeViewModelO4.k.getValue()).b;
                        if (catalogueHome != null) {
                            catalogueHomeViewModelO4.h.c(CatalogueHomeAction.h);
                            BufferedChannel bufferedChannel = catalogueHomeViewModelO4.i;
                            ArrayList arrayList = catalogueHome.f6856a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (obj instanceof TermsAndConditions) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((TermsAndConditions) it.next()).b);
                            }
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchTermsAndConditions(CollectionsKt.G(arrayList3)));
                        }
                        return unit;
                    default:
                        FeatureToggleManager featureToggleManager = catalogueHomeActivity.x;
                        if (featureToggleManager != null) {
                            return featureToggleManager;
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                }
            }
        });
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.a
            public final /* synthetic */ CatalogueHomeActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                Unit unit = Unit.f24250a;
                CatalogueHomeActivity catalogueHomeActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = CatalogueHomeActivity.E;
                        return (Activities.CatalogueHome.Extras) catalogueHomeActivity.getIntent().getParcelableExtra("extra_catalogue_home");
                    case 1:
                        int i4 = CatalogueHomeActivity.E;
                        catalogueHomeActivity.O4().q6();
                        return unit;
                    case 2:
                        int i5 = CatalogueHomeActivity.E;
                        CatalogueHomeViewModel catalogueHomeViewModelO4 = catalogueHomeActivity.O4();
                        CatalogueHome catalogueHome = ((CatalogueHomeContract.ViewState) catalogueHomeViewModelO4.k.getValue()).b;
                        if (catalogueHome != null) {
                            catalogueHomeViewModelO4.h.c(CatalogueHomeAction.h);
                            BufferedChannel bufferedChannel = catalogueHomeViewModelO4.i;
                            ArrayList arrayList = catalogueHome.f6856a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (obj instanceof TermsAndConditions) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((TermsAndConditions) it.next()).b);
                            }
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchTermsAndConditions(CollectionsKt.G(arrayList3)));
                        }
                        return unit;
                    default:
                        FeatureToggleManager featureToggleManager = catalogueHomeActivity.x;
                        if (featureToggleManager != null) {
                            return featureToggleManager;
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                }
            }
        };
        final int i3 = 0;
        Function1 function1 = new Function1(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.b
            public final /* synthetic */ CatalogueHomeActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i4 = i3;
                Unit unit = Unit.f24250a;
                CatalogueHomeActivity catalogueHomeActivity = this.e;
                switch (i4) {
                    case 0:
                        CatalogueCard catalogue = (CatalogueCard) obj;
                        int i5 = CatalogueHomeActivity.E;
                        Intrinsics.h(catalogue, "catalogue");
                        CatalogueHomeViewModel catalogueHomeViewModelO4 = catalogueHomeActivity.O4();
                        BufferedChannel bufferedChannel = catalogueHomeViewModelO4.i;
                        AnalyticsManager analyticsManager = catalogueHomeViewModelO4.h;
                        AnalyticsAction analyticsAction = CatalogueHomeAction.f;
                        CatalogueTracking catalogueTracking = catalogue.f;
                        analyticsManager.j(analyticsAction, CatalogueTrackingKt.a(catalogueTracking));
                        String str = catalogue.g;
                        if (str != null && !StringsKt.D(str)) {
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchCatalogueBrowse(str));
                            break;
                        } else {
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchCatalogueDetails(catalogueTracking, catalogue.f6855a));
                            break;
                        }
                        break;
                    default:
                        SpecialsCard specials = (SpecialsCard) obj;
                        int i6 = CatalogueHomeActivity.E;
                        Intrinsics.h(specials, "specials");
                        CatalogueHomeViewModel catalogueHomeViewModelO42 = catalogueHomeActivity.O4();
                        catalogueHomeViewModelO42.h.j(CatalogueHomeAction.f, TrackingMetadata.Companion.a(TrackableValue.J, specials.c));
                        catalogueHomeViewModelO42.i.k(new CatalogueHomeContract.Action.LaunchCatalogueBrowse(null));
                        break;
                }
                return unit;
            }
        };
        final int i4 = 1;
        Function1 function12 = new Function1(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.b
            public final /* synthetic */ CatalogueHomeActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i42 = i4;
                Unit unit = Unit.f24250a;
                CatalogueHomeActivity catalogueHomeActivity = this.e;
                switch (i42) {
                    case 0:
                        CatalogueCard catalogue = (CatalogueCard) obj;
                        int i5 = CatalogueHomeActivity.E;
                        Intrinsics.h(catalogue, "catalogue");
                        CatalogueHomeViewModel catalogueHomeViewModelO4 = catalogueHomeActivity.O4();
                        BufferedChannel bufferedChannel = catalogueHomeViewModelO4.i;
                        AnalyticsManager analyticsManager = catalogueHomeViewModelO4.h;
                        AnalyticsAction analyticsAction = CatalogueHomeAction.f;
                        CatalogueTracking catalogueTracking = catalogue.f;
                        analyticsManager.j(analyticsAction, CatalogueTrackingKt.a(catalogueTracking));
                        String str = catalogue.g;
                        if (str != null && !StringsKt.D(str)) {
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchCatalogueBrowse(str));
                            break;
                        } else {
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchCatalogueDetails(catalogueTracking, catalogue.f6855a));
                            break;
                        }
                        break;
                    default:
                        SpecialsCard specials = (SpecialsCard) obj;
                        int i6 = CatalogueHomeActivity.E;
                        Intrinsics.h(specials, "specials");
                        CatalogueHomeViewModel catalogueHomeViewModelO42 = catalogueHomeActivity.O4();
                        catalogueHomeViewModelO42.h.j(CatalogueHomeAction.f, TrackingMetadata.Companion.a(TrackableValue.J, specials.c));
                        catalogueHomeViewModelO42.i.k(new CatalogueHomeContract.Action.LaunchCatalogueBrowse(null));
                        break;
                }
                return unit;
            }
        };
        final int i5 = 2;
        final int i6 = 3;
        this.D = new CatalogueHomeEpoxyController(function0, function1, function12, new Function0(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.a
            public final /* synthetic */ CatalogueHomeActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i5;
                Unit unit = Unit.f24250a;
                CatalogueHomeActivity catalogueHomeActivity = this.e;
                switch (i22) {
                    case 0:
                        int i32 = CatalogueHomeActivity.E;
                        return (Activities.CatalogueHome.Extras) catalogueHomeActivity.getIntent().getParcelableExtra("extra_catalogue_home");
                    case 1:
                        int i42 = CatalogueHomeActivity.E;
                        catalogueHomeActivity.O4().q6();
                        return unit;
                    case 2:
                        int i52 = CatalogueHomeActivity.E;
                        CatalogueHomeViewModel catalogueHomeViewModelO4 = catalogueHomeActivity.O4();
                        CatalogueHome catalogueHome = ((CatalogueHomeContract.ViewState) catalogueHomeViewModelO4.k.getValue()).b;
                        if (catalogueHome != null) {
                            catalogueHomeViewModelO4.h.c(CatalogueHomeAction.h);
                            BufferedChannel bufferedChannel = catalogueHomeViewModelO4.i;
                            ArrayList arrayList = catalogueHome.f6856a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (obj instanceof TermsAndConditions) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((TermsAndConditions) it.next()).b);
                            }
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchTermsAndConditions(CollectionsKt.G(arrayList3)));
                        }
                        return unit;
                    default:
                        FeatureToggleManager featureToggleManager = catalogueHomeActivity.x;
                        if (featureToggleManager != null) {
                            return featureToggleManager;
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                }
            }
        }, LazyKt.b(new Function0(this) { // from class: au.com.woolworths.feature.shop.catalogue.home.a
            public final /* synthetic */ CatalogueHomeActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i6;
                Unit unit = Unit.f24250a;
                CatalogueHomeActivity catalogueHomeActivity = this.e;
                switch (i22) {
                    case 0:
                        int i32 = CatalogueHomeActivity.E;
                        return (Activities.CatalogueHome.Extras) catalogueHomeActivity.getIntent().getParcelableExtra("extra_catalogue_home");
                    case 1:
                        int i42 = CatalogueHomeActivity.E;
                        catalogueHomeActivity.O4().q6();
                        return unit;
                    case 2:
                        int i52 = CatalogueHomeActivity.E;
                        CatalogueHomeViewModel catalogueHomeViewModelO4 = catalogueHomeActivity.O4();
                        CatalogueHome catalogueHome = ((CatalogueHomeContract.ViewState) catalogueHomeViewModelO4.k.getValue()).b;
                        if (catalogueHome != null) {
                            catalogueHomeViewModelO4.h.c(CatalogueHomeAction.h);
                            BufferedChannel bufferedChannel = catalogueHomeViewModelO4.i;
                            ArrayList arrayList = catalogueHome.f6856a;
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj : arrayList) {
                                if (obj instanceof TermsAndConditions) {
                                    arrayList2.add(obj);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.s(arrayList2, 10));
                            Iterator it = arrayList2.iterator();
                            while (it.hasNext()) {
                                arrayList3.add(((TermsAndConditions) it.next()).b);
                            }
                            bufferedChannel.k(new CatalogueHomeContract.Action.LaunchTermsAndConditions(CollectionsKt.G(arrayList3)));
                        }
                        return unit;
                    default:
                        FeatureToggleManager featureToggleManager = catalogueHomeActivity.x;
                        if (featureToggleManager != null) {
                            return featureToggleManager;
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                }
            }
        }));
    }

    public final CatalogueHomeViewModel O4() {
        return (CatalogueHomeViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.feature.shop.catalogue.home.Hilt_CatalogueHomeActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = ActivityCatalogueHomeBinding.C;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        ActivityCatalogueHomeBinding activityCatalogueHomeBinding = (ActivityCatalogueHomeBinding) ViewDataBinding.q(layoutInflater, R.layout.activity_catalogue_home, null, false, null);
        this.y = activityCatalogueHomeBinding;
        if (activityCatalogueHomeBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setContentView(activityCatalogueHomeBinding.h);
        ActivityCatalogueHomeBinding activityCatalogueHomeBinding2 = this.y;
        if (activityCatalogueHomeBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        RecyclerView recyclerView = activityCatalogueHomeBinding2.A;
        CatalogueHomeEpoxyController catalogueHomeEpoxyController = this.D;
        recyclerView.setAdapter(catalogueHomeEpoxyController.getAdapter());
        ActivityCatalogueHomeBinding activityCatalogueHomeBinding3 = this.y;
        if (activityCatalogueHomeBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityCatalogueHomeBinding3.A.setLayoutManager(catalogueHomeEpoxyController.getLayoutManager(this));
        ActivityCatalogueHomeBinding activityCatalogueHomeBinding4 = this.y;
        if (activityCatalogueHomeBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        setSupportActionBar(activityCatalogueHomeBinding4.B);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        supportActionBar.s(true);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CatalogueHomeActivity$collectActions$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new CatalogueHomeActivity$observeViewState$1(this, null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        if (!O4().g.b.z()) {
            return true;
        }
        getMenuInflater().inflate(R.menu.menu_cart_only, menu);
        View actionView = menu.findItem(R.id.cart_item).getActionView();
        CartBadgeActionView cartBadgeActionView = actionView instanceof CartBadgeActionView ? (CartBadgeActionView) actionView : null;
        if (cartBadgeActionView == null) {
            return true;
        }
        cartBadgeActionView.setAnalyticsScreen(CatalogueScreen.f);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                finish();
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
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
        CatalogueHomeViewModel catalogueHomeViewModelO4 = O4();
        Activities.CatalogueHome.Extras extras = (Activities.CatalogueHome.Extras) this.A.getD();
        MutableStateFlow mutableStateFlow = catalogueHomeViewModelO4.k;
        if (((CatalogueHomeContract.ViewState) mutableStateFlow.getValue()).f6843a || ((CatalogueHomeContract.ViewState) mutableStateFlow.getValue()).b != null) {
            catalogueHomeViewModelO4.t6(extras);
        } else {
            BuildersKt.c(ViewModelKt.a(catalogueHomeViewModelO4), null, null, new CatalogueHomeViewModel$onReady$1(catalogueHomeViewModelO4, extras, null), 3);
        }
    }
}
