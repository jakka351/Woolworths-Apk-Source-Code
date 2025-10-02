package au.com.woolworths.android.onesite.modules.search.searchscreen;

import android.content.pm.ShortcutManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.SearchView;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.analytics.Screen;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.analytics.supers.products.ProductFinderAnalytics;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.events.ForcedLogoutEvent;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.legacy.databinding.ActivitySearchBinding;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeConnectionErrorBinding;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeSearchSuggestionBinding;
import au.com.woolworths.android.onesite.legacy.databinding.IncludeUnableToLoadBinding;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchActions;
import au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchContract;
import au.com.woolworths.android.onesite.modules.search.searchscreen.SearchViewModel;
import au.com.woolworths.android.onesite.modules.shortcuts.Shortcuts;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.rxutils.RxBus;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.modules.search.SearchKeywordType;
import au.com.woolworths.base.shopapp.modules.search.SearchType;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchRowSectionKt;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.SearchTilesSectionKt;
import au.com.woolworths.feature.product.list.legacy.compose.productsearch.VoiceProductSearchEntryIconKt;
import au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor;
import au.com.woolworths.foundation.feature.di.AssistedViewModelFactory;
import au.com.woolworths.foundation.shop.editorder.ui.EditOrderBannerView;
import au.com.woolworths.sdui.model.action.ActionType;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "<init>", "()V", "Companion", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class SearchActivity extends Hilt_SearchActivity implements SearchView.OnQueryTextListener {
    public static final /* synthetic */ int R = 0;
    public FeatureToggleManager B;
    public ShopAccountInteractor C;
    public TrafficDriversInteractor D;
    public ShopAppNavigator E;
    public SearchViewModel.Factory F;
    public SearchView H;
    public ActivitySearchBinding I;
    public IncludeUnableToLoadBinding J;
    public IncludeConnectionErrorBinding K;
    public SearchAutoCompleteAdapter L;
    public final Lazy N;
    public final Lazy O;
    public final Lazy P;
    public final ViewModelLazy Q;
    public final int G = R.layout.activity_search;
    public final CompositeDisposable M = new CompositeDisposable();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/searchscreen/SearchActivity$Companion;", "", "", "PARAM_CURRENT_PAGE", "Ljava/lang/String;", "PARAM_PRODUCT_SOURCE", "PAGE_SEARCH", "SOURCE_SEARCH_OLIVE_ENTRY_POINT", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4407a;

        static {
            int[] iArr = new int[SearchContract.ViewState.Screen.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SearchContract.ViewState.Screen screen = SearchContract.ViewState.Screen.d;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                SearchContract.ViewState.Screen screen2 = SearchContract.ViewState.Screen.d;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                SearchContract.ViewState.Screen screen3 = SearchContract.ViewState.Screen.d;
                iArr[1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ActionType.values().length];
            try {
                iArr2[1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f4407a = iArr2;
        }
    }

    public SearchActivity() {
        final int i = 0;
        this.N = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.f
            public final /* synthetic */ SearchActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                SearchActivity searchActivity = this.e;
                switch (i2) {
                    case 0:
                        int i3 = SearchActivity.R;
                        Parcelable parcelableExtra = searchActivity.getIntent().getParcelableExtra("extraData");
                        if (parcelableExtra != null) {
                            return (Activities.Search.Extras) parcelableExtra;
                        }
                        throw new IllegalArgumentException("Extras are required for SearchActivity. Use Search.createIntent when launching this activity.");
                    case 1:
                        int i4 = SearchActivity.R;
                        FeatureToggleManager featureToggleManager = searchActivity.B;
                        if (featureToggleManager != null) {
                            return Boolean.valueOf(featureToggleManager.c(BaseShopAppFeature.W));
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    case 2:
                        int i5 = SearchActivity.R;
                        Activities.Search.Extras extrasR4 = searchActivity.R4();
                        if (extrasR4 instanceof Activities.Search.Extras.BuyAgain) {
                            return Activities.ProductList.ProductListType.p;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.Generic) {
                            return Activities.ProductList.ProductListType.D;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductAlternative) {
                            return Activities.ProductList.ProductListType.t;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductFinder) {
                            return Activities.ProductList.ProductListType.w;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceProductFinder) {
                            return Activities.ProductList.ProductListType.H;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceWithMapsProductFinder) {
                            return Activities.ProductList.ProductListType.J;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        int i6 = SearchActivity.R;
                        return new AssistedViewModelFactory(searchActivity, new a(searchActivity, 2));
                }
            }
        });
        final int i2 = 1;
        this.O = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.f
            public final /* synthetic */ SearchActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                SearchActivity searchActivity = this.e;
                switch (i22) {
                    case 0:
                        int i3 = SearchActivity.R;
                        Parcelable parcelableExtra = searchActivity.getIntent().getParcelableExtra("extraData");
                        if (parcelableExtra != null) {
                            return (Activities.Search.Extras) parcelableExtra;
                        }
                        throw new IllegalArgumentException("Extras are required for SearchActivity. Use Search.createIntent when launching this activity.");
                    case 1:
                        int i4 = SearchActivity.R;
                        FeatureToggleManager featureToggleManager = searchActivity.B;
                        if (featureToggleManager != null) {
                            return Boolean.valueOf(featureToggleManager.c(BaseShopAppFeature.W));
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    case 2:
                        int i5 = SearchActivity.R;
                        Activities.Search.Extras extrasR4 = searchActivity.R4();
                        if (extrasR4 instanceof Activities.Search.Extras.BuyAgain) {
                            return Activities.ProductList.ProductListType.p;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.Generic) {
                            return Activities.ProductList.ProductListType.D;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductAlternative) {
                            return Activities.ProductList.ProductListType.t;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductFinder) {
                            return Activities.ProductList.ProductListType.w;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceProductFinder) {
                            return Activities.ProductList.ProductListType.H;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceWithMapsProductFinder) {
                            return Activities.ProductList.ProductListType.J;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        int i6 = SearchActivity.R;
                        return new AssistedViewModelFactory(searchActivity, new a(searchActivity, 2));
                }
            }
        });
        final int i3 = 2;
        this.P = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.f
            public final /* synthetic */ SearchActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i3;
                SearchActivity searchActivity = this.e;
                switch (i22) {
                    case 0:
                        int i32 = SearchActivity.R;
                        Parcelable parcelableExtra = searchActivity.getIntent().getParcelableExtra("extraData");
                        if (parcelableExtra != null) {
                            return (Activities.Search.Extras) parcelableExtra;
                        }
                        throw new IllegalArgumentException("Extras are required for SearchActivity. Use Search.createIntent when launching this activity.");
                    case 1:
                        int i4 = SearchActivity.R;
                        FeatureToggleManager featureToggleManager = searchActivity.B;
                        if (featureToggleManager != null) {
                            return Boolean.valueOf(featureToggleManager.c(BaseShopAppFeature.W));
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    case 2:
                        int i5 = SearchActivity.R;
                        Activities.Search.Extras extrasR4 = searchActivity.R4();
                        if (extrasR4 instanceof Activities.Search.Extras.BuyAgain) {
                            return Activities.ProductList.ProductListType.p;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.Generic) {
                            return Activities.ProductList.ProductListType.D;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductAlternative) {
                            return Activities.ProductList.ProductListType.t;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductFinder) {
                            return Activities.ProductList.ProductListType.w;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceProductFinder) {
                            return Activities.ProductList.ProductListType.H;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceWithMapsProductFinder) {
                            return Activities.ProductList.ProductListType.J;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        int i6 = SearchActivity.R;
                        return new AssistedViewModelFactory(searchActivity, new a(searchActivity, 2));
                }
            }
        });
        final int i4 = 3;
        this.Q = new ViewModelLazy(Reflection.f24268a.b(SearchViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0(this) { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.f
            public final /* synthetic */ SearchActivity e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i4;
                SearchActivity searchActivity = this.e;
                switch (i22) {
                    case 0:
                        int i32 = SearchActivity.R;
                        Parcelable parcelableExtra = searchActivity.getIntent().getParcelableExtra("extraData");
                        if (parcelableExtra != null) {
                            return (Activities.Search.Extras) parcelableExtra;
                        }
                        throw new IllegalArgumentException("Extras are required for SearchActivity. Use Search.createIntent when launching this activity.");
                    case 1:
                        int i42 = SearchActivity.R;
                        FeatureToggleManager featureToggleManager = searchActivity.B;
                        if (featureToggleManager != null) {
                            return Boolean.valueOf(featureToggleManager.c(BaseShopAppFeature.W));
                        }
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    case 2:
                        int i5 = SearchActivity.R;
                        Activities.Search.Extras extrasR4 = searchActivity.R4();
                        if (extrasR4 instanceof Activities.Search.Extras.BuyAgain) {
                            return Activities.ProductList.ProductListType.p;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.Generic) {
                            return Activities.ProductList.ProductListType.D;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductAlternative) {
                            return Activities.ProductList.ProductListType.t;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.ProductFinder) {
                            return Activities.ProductList.ProductListType.w;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceProductFinder) {
                            return Activities.ProductList.ProductListType.H;
                        }
                        if (extrasR4 instanceof Activities.Search.Extras.VoiceWithMapsProductFinder) {
                            return Activities.ProductList.ProductListType.J;
                        }
                        throw new NoWhenBranchMatchedException();
                    default:
                        int i6 = SearchActivity.R;
                        return new AssistedViewModelFactory(searchActivity, new a(searchActivity, 2));
                }
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.u = true;
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getG() {
        return this.G;
    }

    public final Activities.Search.Extras R4() {
        return (Activities.Search.Extras) this.N.getD();
    }

    public final Activities.ProductList.ProductListType S4() {
        return (Activities.ProductList.ProductListType) this.P.getD();
    }

    public final SearchViewModel T4() {
        return (SearchViewModel) this.Q.getD();
    }

    @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.Hilt_SearchActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        super.onCreate(bundle);
        ActivitySearchBinding activitySearchBinding = (ActivitySearchBinding) DataBindingUtil.d(this, this.G);
        this.H = activitySearchBinding.B;
        this.J = activitySearchBinding.D;
        this.K = activitySearchBinding.y;
        setSupportActionBar(activitySearchBinding.C);
        ImageView imageView = activitySearchBinding.F;
        IncludeSearchSuggestionBinding includeSearchSuggestionBinding = activitySearchBinding.A;
        imageView.setVisibility(S4().l ? 0 : 8);
        imageView.setOnClickListener(new d(this, 2));
        activitySearchBinding.G.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$initVoiceEntryPoints$2$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SearchActivity searchActivity = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(2064575338, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$initVoiceEntryPoints$2$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                Modifier modifierQ = SizeKt.q(Modifier.Companion.d, 28);
                                int i = SearchActivity.R;
                                SearchViewModel searchViewModelT4 = searchActivity.T4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(searchViewModelT4);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new SearchActivity$initVoiceEntryPoints$2$1$1$1$1(0, searchViewModelT4, SearchViewModel.class, "onVpsButtonClicked", "onVpsButtonClicked()V", 0);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                VoiceProductSearchEntryIconKt.a(48, 0, composer2, modifierQ, (Function0) ((KFunction) objG));
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 868724550));
        includeSearchSuggestionBinding.A.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$initVoiceEntryPoints$3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SearchActivity searchActivity = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1844883733, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$initVoiceEntryPoints$3.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = SearchActivity.R;
                                SearchActivity searchActivity2 = searchActivity;
                                SearchViewModel searchViewModelT4 = searchActivity2.T4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(searchViewModelT4);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$3$1$1$1 searchActivity$initVoiceEntryPoints$3$1$1$1 = new SearchActivity$initVoiceEntryPoints$3$1$1$1(0, searchViewModelT4, SearchViewModel.class, "onVoiceSearchTileClicked", "onVoiceSearchTileClicked()V", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$3$1$1$1);
                                    objG = searchActivity$initVoiceEntryPoints$3$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                SearchViewModel searchViewModelT42 = searchActivity2.T4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(searchViewModelT42);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$3$1$2$1 searchActivity$initVoiceEntryPoints$3$1$2$1 = new SearchActivity$initVoiceEntryPoints$3$1$2$1(0, searchViewModelT42, SearchViewModel.class, "onScanBarcodeClicked", "onScanBarcodeClicked()V", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$3$1$2$1);
                                    objG2 = searchActivity$initVoiceEntryPoints$3$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                SearchViewModel searchViewModelT43 = searchActivity2.T4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(searchViewModelT43);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$3$1$3$1 searchActivity$initVoiceEntryPoints$3$1$3$1 = new SearchActivity$initVoiceEntryPoints$3$1$3$1(0, searchViewModelT43, SearchViewModel.class, "onBuyAgainClicked", "onBuyAgainClicked()V", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$3$1$3$1);
                                    objG3 = searchActivity$initVoiceEntryPoints$3$1$3$1;
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG3);
                                SearchViewModel searchViewModelT44 = searchActivity2.T4();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(searchViewModelT44);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$3$1$4$1 searchActivity$initVoiceEntryPoints$3$1$4$1 = new SearchActivity$initVoiceEntryPoints$3$1$4$1(0, searchViewModelT44, SearchViewModel.class, "onOliveClicked", "onOliveClicked()V", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$3$1$4$1);
                                    objG4 = searchActivity$initVoiceEntryPoints$3$1$4$1;
                                }
                                composer2.l();
                                Function0 function04 = (Function0) ((KFunction) objG4);
                                SearchViewConditionsChecker searchViewConditionsChecker = searchActivity2.T4().z;
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(searchViewConditionsChecker);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$3$1$5$1 searchActivity$initVoiceEntryPoints$3$1$5$1 = new SearchActivity$initVoiceEntryPoints$3$1$5$1(1, searchViewConditionsChecker, SearchViewConditionsChecker.class, "shouldDisplaySearchTile", "shouldDisplaySearchTile(Lau/com/woolworths/feature/product/list/legacy/compose/productsearch/SearchTile;)Z", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$3$1$5$1);
                                    objG5 = searchActivity$initVoiceEntryPoints$3$1$5$1;
                                }
                                composer2.l();
                                SearchTilesSectionKt.f(function0, function02, function03, function04, (Function1) ((KFunction) objG5), ((Boolean) searchActivity2.T4().z.f.getD()).booleanValue(), null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 656009615));
        includeSearchSuggestionBinding.z.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$initVoiceEntryPoints$4
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SearchActivity searchActivity = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-731871724, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$initVoiceEntryPoints$4.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                int i = SearchActivity.R;
                                SearchActivity searchActivity2 = searchActivity;
                                SearchViewModel searchViewModelT4 = searchActivity2.T4();
                                composer2.o(5004770);
                                boolean zI = composer2.I(searchViewModelT4);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$4$1$1$1 searchActivity$initVoiceEntryPoints$4$1$1$1 = new SearchActivity$initVoiceEntryPoints$4$1$1$1(0, searchViewModelT4, SearchViewModel.class, "onScanBarcodeClicked", "onScanBarcodeClicked()V", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$4$1$1$1);
                                    objG = searchActivity$initVoiceEntryPoints$4$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                SearchViewModel searchViewModelT42 = searchActivity2.T4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(searchViewModelT42);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$4$1$2$1 searchActivity$initVoiceEntryPoints$4$1$2$1 = new SearchActivity$initVoiceEntryPoints$4$1$2$1(0, searchViewModelT42, SearchViewModel.class, "onBuyAgainClicked", "onBuyAgainClicked()V", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$4$1$2$1);
                                    objG2 = searchActivity$initVoiceEntryPoints$4$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                SearchViewModel searchViewModelT43 = searchActivity2.T4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(searchViewModelT43);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$4$1$3$1 searchActivity$initVoiceEntryPoints$4$1$3$1 = new SearchActivity$initVoiceEntryPoints$4$1$3$1(0, searchViewModelT43, SearchViewModel.class, "onOliveClicked", "onOliveClicked()V", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$4$1$3$1);
                                    objG3 = searchActivity$initVoiceEntryPoints$4$1$3$1;
                                }
                                composer2.l();
                                Function0 function03 = (Function0) ((KFunction) objG3);
                                SearchViewConditionsChecker searchViewConditionsChecker = searchActivity2.T4().z;
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(searchViewConditionsChecker);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    SearchActivity$initVoiceEntryPoints$4$1$4$1 searchActivity$initVoiceEntryPoints$4$1$4$1 = new SearchActivity$initVoiceEntryPoints$4$1$4$1(1, searchViewConditionsChecker, SearchViewConditionsChecker.class, "shouldDisplaySearchTile", "shouldDisplaySearchTile(Lau/com/woolworths/feature/product/list/legacy/compose/productsearch/SearchTile;)Z", 0);
                                    composer2.A(searchActivity$initVoiceEntryPoints$4$1$4$1);
                                    objG4 = searchActivity$initVoiceEntryPoints$4$1$4$1;
                                }
                                composer2.l();
                                SearchRowSectionKt.d(function0, function02, function03, (Function1) ((KFunction) objG4), null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1739917240));
        this.I = activitySearchBinding;
        if (((Boolean) this.O.getD()).booleanValue()) {
            ActivitySearchBinding activitySearchBinding2 = this.I;
            if (activitySearchBinding2 == null) {
                Intrinsics.p("activityBinding");
                throw null;
            }
            ViewStub viewStub = activitySearchBinding2.z.f2550a;
            View viewInflate = viewStub != null ? viewStub.inflate() : null;
            EditOrderBannerView editOrderBannerView = viewInflate instanceof EditOrderBannerView ? (EditOrderBannerView) viewInflate : null;
            if (editOrderBannerView != null) {
                editOrderBannerView.setEvenHandler(T4());
            }
        }
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        this.L = new SearchAutoCompleteAdapter(T4());
        IncludeUnableToLoadBinding includeUnableToLoadBinding = this.J;
        if (includeUnableToLoadBinding == null) {
            Intrinsics.p("unableToLoadLayoutBinding");
            throw null;
        }
        includeUnableToLoadBinding.z.setOnClickListener(new d(this, 0));
        IncludeConnectionErrorBinding includeConnectionErrorBinding = this.K;
        if (includeConnectionErrorBinding == null) {
            Intrinsics.p("connectionErrorLayoutBinding");
            throw null;
        }
        includeConnectionErrorBinding.z.setOnClickListener(new d(this, 1));
        SearchView searchView = this.H;
        if (searchView == null) {
            Intrinsics.p("searchView");
            throw null;
        }
        searchView.s(R4().getD(), false);
        searchView.setOnQueryTextListener(this);
        searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                int i = SearchActivity.R;
                SearchViewModel searchViewModelT4 = this.d.T4();
                if (z) {
                    searchViewModelT4.u.f(SearchContract.Actions.ShowSearchSuggestion.f4420a);
                }
            }
        });
        ((ShortcutManager) getSystemService(ShortcutManager.class)).reportShortcutUsed(Shortcuts.j.d);
        T4().y.f(this, new SearchActivity$sam$androidx_lifecycle_Observer$0(new a(this, 0)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new SearchActivity$observeActions$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new SearchActivity$observeTrafficDriversState$1(this, null), 3);
        ActivitySearchBinding activitySearchBinding3 = this.I;
        if (activitySearchBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        RecyclerView recyclerView = activitySearchBinding3.A.y;
        SearchAutoCompleteAdapter searchAutoCompleteAdapter = this.L;
        if (searchAutoCompleteAdapter == null) {
            Intrinsics.p("autoCompleteAdapter");
            throw null;
        }
        recyclerView.setAdapter(searchAutoCompleteAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        ViewExtKt.a(recyclerView);
        recyclerView.k(new RecyclerView.OnScrollListener() { // from class: au.com.woolworths.android.onesite.modules.search.searchscreen.SearchActivity$initRecyclerView$1$1
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void a(int i, RecyclerView recyclerView2) {
                if (i == 1) {
                    int i2 = SearchActivity.R;
                    this.f4408a.T4().u.f(SearchContract.Actions.AutocompleteSuggestionScrolling.f4410a);
                }
            }
        });
        T4().u.f(SearchContract.Actions.ShowSearchSuggestion.f4420a);
    }

    @Override // au.com.woolworths.android.onesite.modules.search.searchscreen.Hilt_SearchActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.M.e();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() != 16908332) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
                Callback.q();
                return zOnOptionsItemSelected;
            }
            Views.a(this);
            finish();
            Callback.q();
            return true;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextChange(String text) {
        Intrinsics.h(text, "text");
        T4().p.onNext(text);
        return false;
    }

    @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
    public final boolean onQueryTextSubmit(String query) {
        Intrinsics.h(query, "query");
        SearchView searchView = this.H;
        if (searchView == null) {
            Intrinsics.p("searchView");
            throw null;
        }
        searchView.s(query, false);
        SearchViewModel searchViewModelT4 = T4();
        SearchView searchView2 = this.H;
        if (searchView2 == null) {
            Intrinsics.p("searchView");
            throw null;
        }
        String query2 = searchView2.getQuery().toString();
        SearchKeywordType searchKeywordType = SearchKeywordType.e;
        boolean z = S4().j;
        Intrinsics.h(query2, "query");
        AnalyticsManager analyticsManager = searchViewModelT4.h;
        if (StringsKt.D(query2)) {
            return false;
        }
        searchViewModelT4.p6(query2);
        TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(TrackableValue.J2, query2);
        TrackableValue trackableValue = TrackableValue.Q2;
        SearchType[] searchTypeArr = SearchType.d;
        trackingMetadataA.b(trackableValue, "products");
        trackingMetadataA.b(TrackableValue.K2, "Self-Typed");
        if (z) {
            analyticsManager.i(ProductFinderAnalytics.ProductFinder.Action.i, trackingMetadataA);
        } else {
            analyticsManager.j(SearchActions.e, trackingMetadataA);
        }
        searchViewModelT4.u.f((!query2.equalsIgnoreCase("Everyday Market") || searchViewModelT4.f.b()) ? new SearchContract.Actions.OpenSearchResults(query2) : SearchContract.Actions.LaunchMarketplace.f4412a);
        return false;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        SearchViewModel searchViewModelT4 = T4();
        boolean z = S4().l;
        boolean z2 = S4().j;
        AnalyticsManager analyticsManager = searchViewModelT4.h;
        if (z) {
            TrackableValue trackableValue = TrackableValue.m0;
            Category category = Category.g;
            TrackingMetadata trackingMetadataA = TrackingMetadata.Companion.a(trackableValue, "impression");
            trackingMetadataA.b(TrackableValue.n0, "voice product finder");
            trackingMetadataA.b(TrackableValue.p0, "Search");
            if (z2) {
                analyticsManager.b(new Screen() { // from class: au.com.woolworths.android.onesite.modules.search.analytics.ProductFinderTrackingKt$generateProductFinderScreenAnalytics$1
                    public final String d;
                    public final String e;
                    public final Object f;

                    {
                        ProductFinderAnalytics.ProductFinder productFinder = ProductFinderAnalytics.ProductFinder.d;
                        this.d = "product finder search";
                        this.e = "productfinder_search_screen";
                        this.f = ProductFinderAnalytics.ProductFinder.e;
                    }

                    @Override // au.com.woolworths.analytics.Event
                    /* renamed from: d, reason: from getter */
                    public final String getE() {
                        return this.e;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                    @Override // au.com.woolworths.analytics.Event
                    public final Map getData() {
                        return this.f;
                    }

                    @Override // au.com.woolworths.analytics.Screen
                    /* renamed from: getName, reason: from getter */
                    public final String getD() {
                        return this.d;
                    }
                }, trackingMetadataA);
            } else {
                analyticsManager.e(SearchScreens.d, trackingMetadataA);
            }
        } else {
            analyticsManager.a(SearchScreens.d);
        }
        ObservableObserveOn observableObserveOnF = RxBus.a().c(ForcedLogoutEvent.class).f(AndroidSchedulers.a());
        LambdaObserver lambdaObserver = new LambdaObserver(new c(0, new a(this, 1)), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        N4(lambdaObserver);
        T4().u.f(SearchContract.Actions.ShowSearchSuggestion.f4420a);
    }
}
