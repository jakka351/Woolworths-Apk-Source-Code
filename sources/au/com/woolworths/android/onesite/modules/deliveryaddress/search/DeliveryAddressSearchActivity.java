package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.livedata.LiveDataAdapterKt;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.ActivityRequestCode;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityAddFullDeliveryAddressBySearchBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.ui.DeliveryAddressSearchToolbarKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.android.onesite.utils.Logout;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.internal.operators.observable.ObservableSubscribeOn;
import io.reactivex.subjects.PublishSubject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "<init>", "()V", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class DeliveryAddressSearchActivity extends Hilt_DeliveryAddressSearchActivity {
    public static final /* synthetic */ int J = 0;
    public ShopAccountInteractor B;
    public SchedulersProvider C;
    public FeatureToggleManager D;
    public ActivityAddFullDeliveryAddressBySearchBinding E;
    public DeliveryAddressSearchController F;
    public final ViewModelLazy G = new ViewModelLazy(Reflection.f24268a.b(DeliveryAddressSearchViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final DeliveryAddressSearchActivity deliveryAddressSearchActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<DeliveryAddressSearchViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    DeliveryAddressSearchViewModel.Factory factory = (DeliveryAddressSearchViewModel.Factory) obj;
                    Intent intent = deliveryAddressSearchActivity.getIntent();
                    Activities.DeliveryAddressSearchActivity.Extras extras = intent != null ? (Activities.DeliveryAddressSearchActivity.Extras) intent.getParcelableExtra("EXTRA_DATA") : null;
                    boolean z = extras != null ? extras.e : false;
                    boolean z2 = extras != null ? extras.e : false;
                    return factory.a(new DeliveryAddressSearchViewModel.ScreenOptions(extras != null ? extras.d : false, z, extras != null ? extras.g : false, z2));
                }
            });
        }
    });
    public final ActivityResultLauncher H = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 1));
    public final int I;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/android/onesite/modules/deliveryaddress/search/DeliveryAddressSearchActivity$Companion;", "", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static void a(AppCompatActivity appCompatActivity, int i, boolean z, boolean z2, boolean z3) {
            Intent intent = new Intent(appCompatActivity, (Class<?>) DeliveryAddressSearchActivity.class);
            intent.putExtra("EXTRA_DATA", new Activities.DeliveryAddressSearchActivity.Extras(z, z2, z3, false));
            intent.addFlags(603979776);
            appCompatActivity.startActivityForResult(intent, i);
        }
    }

    public DeliveryAddressSearchActivity() {
        this.u = true;
        this.I = R.layout.activity_add_full_delivery_address_by_search;
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getB() {
        return this.I;
    }

    public final DeliveryAddressSearchViewModel R4() {
        return (DeliveryAddressSearchViewModel) this.G.getD();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ActivityRequestCode[] activityRequestCodeArr = ActivityRequestCode.d;
        if (i == 4 && i2 == -1) {
            setResult(-1, intent);
            Views.a(this);
            finish();
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.deliveryaddress.search.Hilt_DeliveryAddressSearchActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.E = (ActivityAddFullDeliveryAddressBySearchBinding) DataBindingUtil.d(this, this.I);
        this.F = new DeliveryAddressSearchController(R4());
        final ActivityAddFullDeliveryAddressBySearchBinding activityAddFullDeliveryAddressBySearchBinding = this.E;
        if (activityAddFullDeliveryAddressBySearchBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityAddFullDeliveryAddressBySearchBinding.D(this);
        activityAddFullDeliveryAddressBySearchBinding.L(R4());
        EpoxyRecyclerView epoxyRecyclerView = activityAddFullDeliveryAddressBySearchBinding.z;
        DeliveryAddressSearchController deliveryAddressSearchController = this.F;
        if (deliveryAddressSearchController == null) {
            Intrinsics.p("deliveryAddressSearchController");
            throw null;
        }
        epoxyRecyclerView.setController(deliveryAddressSearchController);
        activityAddFullDeliveryAddressBySearchBinding.y.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchActivity$onCreate$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                DeliveryAddressSearchContract.ViewState viewState;
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    DeliveryAddressSearchViewModel deliveryAddressSearchViewModel = activityAddFullDeliveryAddressBySearchBinding.B;
                    String string = null;
                    MutableLiveData mutableLiveData = deliveryAddressSearchViewModel != null ? deliveryAddressSearchViewModel.r : null;
                    composer.o(-730694157);
                    MutableState mutableStateB = mutableLiveData == null ? null : LiveDataAdapterKt.b(mutableLiveData, mutableLiveData.e(), composer);
                    composer.l();
                    DeliveryAddressSearchViewModel.ScreenOptions screenOptions = (mutableStateB == null || (viewState = (DeliveryAddressSearchContract.ViewState) mutableStateB.getD()) == null) ? null : viewState.d;
                    if (screenOptions != null) {
                        boolean z = screenOptions.c;
                        boolean z2 = screenOptions.d;
                        DeliveryAddressSearchContract.ViewState viewState2 = (DeliveryAddressSearchContract.ViewState) mutableStateB.getD();
                        boolean z3 = true;
                        boolean z4 = viewState2 != null && viewState2.f4332a;
                        DeliveryAddressSearchContract.ViewState viewState3 = (DeliveryAddressSearchContract.ViewState) mutableStateB.getD();
                        List list = viewState3 != null ? viewState3.c : null;
                        if (list != null && !list.isEmpty()) {
                            z3 = false;
                        }
                        boolean z5 = screenOptions.c;
                        final DeliveryAddressSearchActivity deliveryAddressSearchActivity = this;
                        String string2 = z5 ? deliveryAddressSearchActivity.getString(R.string.add_account_address_title) : z2 ? deliveryAddressSearchActivity.getString(R.string.add_delivery_address_title) : null;
                        String string3 = (!z2 || z) ? deliveryAddressSearchActivity.getString(R.string.search_address_hint) : deliveryAddressSearchActivity.getString(R.string.add_new_address_hint);
                        Intrinsics.e(string3);
                        if (!z4 && z3 && z) {
                            string = deliveryAddressSearchActivity.getString(R.string.add_delivery_address_nz_subtitle);
                        }
                        String str = string;
                        composer.o(5004770);
                        boolean zI = composer.I(deliveryAddressSearchActivity);
                        Object objG = composer.G();
                        Object obj3 = Composer.Companion.f1624a;
                        if (zI || objG == obj3) {
                            final int i = 0;
                            objG = new Function0() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i) {
                                        case 0:
                                            deliveryAddressSearchActivity.finish();
                                            break;
                                        default:
                                            deliveryAddressSearchActivity.finish();
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer.A(objG);
                        }
                        Function0 function0 = (Function0) objG;
                        composer.l();
                        composer.o(5004770);
                        boolean zI2 = composer.I(deliveryAddressSearchActivity);
                        Object objG2 = composer.G();
                        if (zI2 || objG2 == obj3) {
                            final int i2 = 1;
                            objG2 = new Function0() { // from class: au.com.woolworths.android.onesite.modules.deliveryaddress.search.b
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    switch (i2) {
                                        case 0:
                                            deliveryAddressSearchActivity.finish();
                                            break;
                                        default:
                                            deliveryAddressSearchActivity.finish();
                                            break;
                                    }
                                    return Unit.f24250a;
                                }
                            };
                            composer.A(objG2);
                        }
                        Function0 function02 = (Function0) objG2;
                        composer.l();
                        composer.o(5004770);
                        boolean zI3 = composer.I(deliveryAddressSearchActivity);
                        Object objG3 = composer.G();
                        if (zI3 || objG3 == obj3) {
                            objG3 = new a(deliveryAddressSearchActivity, 1);
                            composer.A(objG3);
                        }
                        composer.l();
                        DeliveryAddressSearchToolbarKt.a(z5, string3, string2, str, function0, function02, (Function1) objG3, composer, 0);
                    }
                }
                return Unit.f24250a;
            }
        }, true, 1197003683));
        ActivityAddFullDeliveryAddressBySearchBinding activityAddFullDeliveryAddressBySearchBinding2 = this.E;
        if (activityAddFullDeliveryAddressBySearchBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityAddFullDeliveryAddressBySearchBinding2.A.A);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        R4().r.f(this, new androidx.compose.runtime.livedata.a(this, 2));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
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
        DeliveryAddressSearchViewModel deliveryAddressSearchViewModelR4 = R4();
        ActivityAddFullDeliveryAddressBySearchBinding activityAddFullDeliveryAddressBySearchBinding = this.E;
        if (activityAddFullDeliveryAddressBySearchBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        deliveryAddressSearchViewModelR4.q6(activityAddFullDeliveryAddressBySearchBinding.A.z.getQuery().toString());
        ShopAccountInteractor shopAccountInteractor = this.B;
        if (shopAccountInteractor == null) {
            Intrinsics.p("accountInteractor");
            throw null;
        }
        if (shopAccountInteractor.b.b.getBoolean("forced_logged_out", false)) {
            ShopAccountInteractor shopAccountInteractor2 = this.B;
            if (shopAccountInteractor2 == null) {
                Intrinsics.p("accountInteractor");
                throw null;
            }
            Logout.a(this, shopAccountInteractor2);
        } else {
            PublishSubject publishSubject = R4().s;
            SchedulersProvider schedulersProvider = this.C;
            if (schedulersProvider == null) {
                Intrinsics.p("schedulersProvider");
                throw null;
            }
            ObservableSubscribeOn observableSubscribeOnI = publishSubject.i(schedulersProvider.d());
            SchedulersProvider schedulersProvider2 = this.C;
            if (schedulersProvider2 == null) {
                Intrinsics.p("schedulersProvider");
                throw null;
            }
            ObservableObserveOn observableObserveOnF = observableSubscribeOnI.f(schedulersProvider2.b());
            LambdaObserver lambdaObserver = new LambdaObserver(new androidx.camera.core.impl.e(new a(this, 0), 21), Functions.e);
            observableObserveOnF.a(lambdaObserver);
            N4(lambdaObserver);
        }
        O4().a(Screens.d);
    }
}
