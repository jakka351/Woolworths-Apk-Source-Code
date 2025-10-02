package au.com.woolworths.feature.shop.storelocator;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.widget.Toolbar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.adobe.data.ActionData;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.base.shopapp.appdata.LegacyShopAnalyticsManager;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBinding;
import au.com.woolworths.feature.shop.storelocator.databinding.StoreLocatorLocationMapInfoWindowBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.Store;
import au.com.woolworths.geolocation.location.DeviceLocationServiceCallback;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.Marker;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/StoreLocatorActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lau/com/woolworths/geolocation/location/DeviceLocationServiceCallback;", "Lcom/google/android/gms/maps/GoogleMap$OnInfoWindowClickListener;", "<init>", "()V", "storelocator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class StoreLocatorActivity extends Hilt_StoreLocatorActivity implements OnMapReadyCallback, DeviceLocationServiceCallback, GoogleMap.OnInfoWindowClickListener {
    public static final /* synthetic */ int J = 0;
    public PermissionFlagInteractorImpl A;
    public FeatureToggleManager B;
    public ActivityStoreLocatorBinding C;
    public GoogleMap F;
    public StoreLocatorEpoxyController G;
    public Activities.StoreLocator.ExtraStoreLocatorData H;
    public LocationInteractor x;
    public LaunchManager y;
    public LegacyShopAnalyticsManager z;
    public final ViewModelLazy D = new ViewModelLazy(Reflection.f24268a.b(StoreLocatorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final Lazy E = LazyKt.b(new Function0() { // from class: au.com.woolworths.feature.shop.storelocator.b
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = StoreLocatorActivity.J;
            Fragment fragmentF = this.d.getSupportFragmentManager().F(com.woolworths.R.id.map);
            Intrinsics.f(fragmentF, "null cannot be cast to non-null type com.google.android.gms.maps.SupportMapFragment");
            return (SupportMapFragment) fragmentF;
        }
    });
    public final ActivityResultLauncher I = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: au.com.woolworths.feature.shop.storelocator.c
        @Override // androidx.activity.result.ActivityResultCallback
        public final void a(Object obj) {
            ActivityResult result = (ActivityResult) obj;
            int i = StoreLocatorActivity.J;
            Intrinsics.h(result, "result");
            if (result.d == -1) {
                Intent intent = result.e;
                Store store = intent != null ? (Store) intent.getParcelableExtra("EXTRA_STORE") : null;
                Intrinsics.f(store, "null cannot be cast to non-null type au.com.woolworths.foundation.shop.storelocator.pickup.models.Store");
                StoreLocatorActivity storeLocatorActivity = this.d;
                Views.a(storeLocatorActivity);
                BuildersKt.c(LifecycleOwnerKt.a(storeLocatorActivity), null, null, new StoreLocatorActivity$storeDetailsLauncher$1$1(storeLocatorActivity, store, null), 3);
            }
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[StoreLocatorContract.StoreListDisplayMode.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                StoreLocatorContract.StoreListDisplayMode storeListDisplayMode = StoreLocatorContract.StoreListDisplayMode.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$onCreate$3", f = "StoreLocatorActivity.kt", l = {135}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$onCreate$3, reason: invalid class name */
    final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$onCreate$3$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<StoreLocatorContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                StoreLocatorContract.Actions actions = (StoreLocatorContract.Actions) obj;
                StoreLocatorActivity storeLocatorActivity = (StoreLocatorActivity) this.d;
                int i = StoreLocatorActivity.J;
                storeLocatorActivity.getClass();
                if (Intrinsics.c(actions, StoreLocatorContract.Actions.GoToSettings.f8120a)) {
                    ActivityExtKt.b(storeLocatorActivity);
                } else if (Intrinsics.c(actions, StoreLocatorContract.Actions.TurnOnDeviceLocation.f8125a)) {
                    LocationsKt.a(storeLocatorActivity, storeLocatorActivity);
                } else if (Intrinsics.c(actions, StoreLocatorContract.Actions.ShowPermissionsDialog.f8123a)) {
                    LocationsKt.e(storeLocatorActivity);
                } else if (Intrinsics.c(actions, StoreLocatorContract.Actions.HideKeyboard.f8121a)) {
                    Views.a(storeLocatorActivity);
                } else if (Intrinsics.c(actions, StoreLocatorContract.Actions.CompleteSetStoreLocation.f8119a)) {
                    storeLocatorActivity.setResult(-1, new Intent().putExtra("RESULT_MESSAGE_EXTRA", storeLocatorActivity.getString(com.woolworths.R.string.store_details_updated_message)));
                    Activities.StoreLocator.ExtraStoreLocatorData extraStoreLocatorData = storeLocatorActivity.H;
                    if (extraStoreLocatorData == null) {
                        Intrinsics.p("extras");
                        throw null;
                    }
                    if (extraStoreLocatorData.i == Activities.StoreLocator.StoreLocatorEntryPoint.d) {
                        LaunchManager launchManager = storeLocatorActivity.y;
                        if (launchManager == null) {
                            Intrinsics.p("launchManager");
                            throw null;
                        }
                        launchManager.a(LaunchManager.LaunchState.h);
                    }
                    storeLocatorActivity.finish();
                } else if (actions instanceof StoreLocatorContract.Actions.OpenStoreDetails) {
                    storeLocatorActivity.P4(((StoreLocatorContract.Actions.OpenStoreDetails) actions).f8122a);
                } else {
                    if (!(actions instanceof StoreLocatorContract.Actions.ShowSnackbarMessage)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i2 = ((StoreLocatorContract.Actions.ShowSnackbarMessage) actions).f8124a;
                    ActivityStoreLocatorBinding activityStoreLocatorBinding = storeLocatorActivity.C;
                    if (activityStoreLocatorBinding == null) {
                        Intrinsics.p("binding");
                        throw null;
                    }
                    Snackbar.i(activityStoreLocatorBinding.h, i2, 0).l();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass3(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return StoreLocatorActivity.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                int i2 = StoreLocatorActivity.J;
                StoreLocatorActivity storeLocatorActivity = StoreLocatorActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, storeLocatorActivity, StoreLocatorActivity.class, "handleActions", "handleActions(Lau/com/woolworths/feature/shop/storelocator/StoreLocatorContract$Actions;)V", 4), FlowExtKt.a(storeLocatorActivity.O4().m, storeLocatorActivity.getD(), Lifecycle.State.g));
                this.p = 1;
                if (FlowKt.g(flowKt__TransformKt$onEach$$inlined$unsafeTransform$1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f24250a;
        }
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void H4() {
        O4().p6();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void I2() {
        O4().p6();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void M() {
        O4().p6();
    }

    public final StoreLocatorViewModel O4() {
        return (StoreLocatorViewModel) this.D.getD();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final int P() {
        return com.woolworths.R.string.store_locator_device_location_unavailable_message;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P4(au.com.woolworths.foundation.shop.storelocator.pickup.models.Store r7) {
        /*
            r6 = this;
            au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel r0 = r6.O4()
            androidx.lifecycle.MutableLiveData r0 = r0.n
            java.lang.Object r0 = r0.e()
            au.com.woolworths.feature.shop.storelocator.StoreLocatorContract$ViewState r0 = (au.com.woolworths.feature.shop.storelocator.StoreLocatorContract.ViewState) r0
            if (r0 != 0) goto Lf
            return
        Lf:
            au.com.woolworths.feature.shop.storelocator.StoreLocatorContract$StoreListDisplayMode r1 = r0.b
            au.com.woolworths.feature.shop.storelocator.StoreLocatorContract$StoreListDisplayMode r2 = au.com.woolworths.feature.shop.storelocator.StoreLocatorContract.StoreListDisplayMode.d
            r3 = 0
            if (r1 != r2) goto L43
            java.util.List r0 = r0.c
            int r0 = r0.indexOf(r7)
            r1 = -1
            if (r0 == r1) goto L4b
            au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBinding r1 = r6.C
            if (r1 == 0) goto L45
            com.airbnb.epoxy.EpoxyRecyclerView r1 = r1.z
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L43
            r1 = 2131363623(0x7f0a0727, float:1.834706E38)
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "findViewById(...)"
            kotlin.jvm.internal.Intrinsics.g(r0, r1)
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.h(r7, r1)
            java.lang.String r1 = r7.d
            androidx.core.app.ActivityOptionsCompat r0 = androidx.core.app.ActivityOptionsCompat.b(r6, r0, r1)
            goto L53
        L43:
            r0 = r3
            goto L53
        L45:
            java.lang.String r7 = "binding"
            kotlin.jvm.internal.Intrinsics.p(r7)
            throw r3
        L4b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Try to open store location item in list that does not exist"
            r7.<init>(r0)
            throw r7
        L53:
            if (r0 == 0) goto L57
            r1 = 1
            goto L58
        L57:
            r1 = 0
        L58:
            au.com.woolworths.android.onesite.navigation.Activities$StoreLocator$ExtraStoreLocatorData r2 = r6.H
            if (r2 == 0) goto L86
            boolean r2 = r2.h
            java.lang.String r3 = "locationDetailsData"
            kotlin.jvm.internal.Intrinsics.h(r7, r3)
            au.com.woolworths.android.onesite.navigation.ApplicationType r3 = au.com.woolworths.android.onesite.navigation.ApplicationType.e
            au.com.woolworths.android.onesite.navigation.Activities$StoreDetails r4 = au.com.woolworths.android.onesite.navigation.Activities.StoreDetails.f4545a
            android.content.Intent r3 = au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt.a(r4, r3)
            au.com.woolworths.android.onesite.navigation.Activities$StoreDetails$Extras r4 = new au.com.woolworths.android.onesite.navigation.Activities$StoreDetails$Extras
            au.com.woolworths.android.onesite.navigation.Activities$StoreDetails$ExtrasByData r5 = new au.com.woolworths.android.onesite.navigation.Activities$StoreDetails$ExtrasByData
            r5.<init>(r7, r1)
            r4.<init>(r5, r2)
            java.lang.String r7 = "EXTRA_STORE_DETAILS_DATA"
            android.content.Intent r7 = r3.putExtra(r7, r4)
            java.lang.String r1 = "putExtra(...)"
            kotlin.jvm.internal.Intrinsics.g(r7, r1)
            androidx.activity.result.ActivityResultLauncher r1 = r6.I
            r1.a(r7, r0)
            return
        L86:
            java.lang.String r7 = "extras"
            kotlin.jvm.internal.Intrinsics.p(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity.P4(au.com.woolworths.foundation.shop.storelocator.pickup.models.Store):void");
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void i2() {
        O4().p6();
        LocationInteractor locationInteractor = this.x;
        if (locationInteractor != null) {
            locationInteractor.f(false);
        } else {
            Intrinsics.p("locationInteractor");
            throw null;
        }
    }

    @Override // au.com.woolworths.feature.shop.storelocator.Hilt_StoreLocatorActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_STORE_LOCATOR_DATA");
        if (parcelableExtra == null) {
            throw new IllegalArgumentException("No extra information to open Store Locator page!");
        }
        this.H = (Activities.StoreLocator.ExtraStoreLocatorData) parcelableExtra;
        this.C = (ActivityStoreLocatorBinding) DataBindingUtil.d(this, com.woolworths.R.layout.activity_store_locator);
        this.G = new StoreLocatorEpoxyController(O4());
        ActivityStoreLocatorBinding activityStoreLocatorBinding = this.C;
        if (activityStoreLocatorBinding == null) {
            Intrinsics.p("binding");
            throw null;
        }
        activityStoreLocatorBinding.D(this);
        activityStoreLocatorBinding.L(O4());
        EpoxyRecyclerView epoxyRecyclerView = activityStoreLocatorBinding.z;
        StoreLocatorEpoxyController storeLocatorEpoxyController = this.G;
        if (storeLocatorEpoxyController == null) {
            Intrinsics.p("epoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(storeLocatorEpoxyController);
        Toolbar toolbar = activityStoreLocatorBinding.H;
        Activities.StoreLocator.ExtraStoreLocatorData extraStoreLocatorData = this.H;
        if (extraStoreLocatorData == null) {
            Intrinsics.p("extras");
            throw null;
        }
        toolbar.setTitle(extraStoreLocatorData.d);
        ActivityStoreLocatorBinding activityStoreLocatorBinding2 = this.C;
        if (activityStoreLocatorBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        MaterialButtonToggleGroup materialButtonToggleGroup = activityStoreLocatorBinding2.G;
        materialButtonToggleGroup.b(com.woolworths.R.id.list_mode_button, true);
        materialButtonToggleGroup.f.add(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: au.com.woolworths.feature.shop.storelocator.d
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public final void a(int i, boolean z) {
                int i2 = StoreLocatorActivity.J;
                if (z) {
                    StoreLocatorActivity storeLocatorActivity = this.f8133a;
                    if (i == com.woolworths.R.id.list_mode_button) {
                        storeLocatorActivity.O4().q6(StoreLocatorContract.StoreListDisplayMode.d);
                    } else {
                        if (i != com.woolworths.R.id.map_mode_button) {
                            throw new IllegalStateException(YU.a.d(i, "Unrecognised Toggle Group Child Button ID "));
                        }
                        storeLocatorActivity.O4().q6(StoreLocatorContract.StoreListDisplayMode.e);
                    }
                }
            }
        });
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass3(null), 3);
        O4().n.f(this, new StoreLocatorActivity$sam$androidx_lifecycle_Observer$0(new a(this, 0)));
        O4().p6();
        ActivityStoreLocatorBinding activityStoreLocatorBinding3 = this.C;
        if (activityStoreLocatorBinding3 != null) {
            setSupportActionBar(activityStoreLocatorBinding3.H);
        } else {
            Intrinsics.p("binding");
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public final void onInfoWindowClick(Marker marker) {
        Intrinsics.h(marker, "marker");
        Object tag = marker.getTag();
        Intrinsics.f(tag, "null cannot be cast to non-null type au.com.woolworths.foundation.shop.storelocator.pickup.models.Store");
        P4((Store) tag);
        LegacyShopAnalyticsManager legacyShopAnalyticsManager = this.z;
        if (legacyShopAnalyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        ActionData actionDataA = ActionData.Companion.a("storeSelectorMapModeDidPressStoreDetail");
        actionDataA.b = "Store Selector screen";
        actionDataA.c = "1";
        legacyShopAnalyticsManager.d(actionDataA);
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public final void onMapReady(GoogleMap map) {
        Intrinsics.h(map, "map");
        this.F = map;
        Boolean bool = Boolean.TRUE;
        LocationInteractor locationInteractor = this.x;
        if (locationInteractor == null) {
            Intrinsics.p("locationInteractor");
            throw null;
        }
        if (!LocationsKt.b(locationInteractor.f8946a)) {
            bool = null;
        }
        map.setMyLocationEnabled(bool != null ? bool.booleanValue() : false);
        map.setInfoWindowAdapter(new GoogleMap.InfoWindowAdapter() { // from class: au.com.woolworths.feature.shop.storelocator.StoreLocatorActivity$onMapReady$1$2
            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public final View getInfoContents(Marker marker) {
                Intrinsics.h(marker, "marker");
                Object tag = marker.getTag();
                Store store = tag instanceof Store ? (Store) tag : null;
                if (store == null) {
                    return null;
                }
                LayoutInflater layoutInflater = this.f8118a.getLayoutInflater();
                int i = StoreLocatorLocationMapInfoWindowBinding.C;
                androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
                StoreLocatorLocationMapInfoWindowBinding storeLocatorLocationMapInfoWindowBinding = (StoreLocatorLocationMapInfoWindowBinding) ViewDataBinding.q(layoutInflater, com.woolworths.R.layout.store_locator_location_map_info_window, null, false, null);
                storeLocatorLocationMapInfoWindowBinding.L(store);
                storeLocatorLocationMapInfoWindowBinding.l();
                return storeLocatorLocationMapInfoWindowBinding.h;
            }

            @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
            public final View getInfoWindow(Marker marker) {
                Intrinsics.h(marker, "marker");
                return null;
            }
        });
        map.setOnInfoWindowClickListener(this);
        O4().o.f(this, new StoreLocatorActivity$sam$androidx_lifecycle_Observer$0(new a(this, 1)));
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        if (i == 101) {
            LocationInteractor locationInteractor = this.x;
            if (locationInteractor == null) {
                Intrinsics.p("locationInteractor");
                throw null;
            }
            if (LocationsKt.b(locationInteractor.f8946a)) {
                O4().p6();
            } else if (LocationsKt.d(this)) {
                LocationInteractor locationInteractor2 = this.x;
                if (locationInteractor2 == null) {
                    Intrinsics.p("locationInteractor");
                    throw null;
                }
                locationInteractor2.f(true);
            }
        } else {
            super.onRequestPermissionsResult(i, permissions, grantResults);
        }
        PermissionFlagInteractorImpl permissionFlagInteractorImpl = this.A;
        if (permissionFlagInteractorImpl != null) {
            permissionFlagInteractorImpl.e(this, permissions, grantResults);
        } else {
            Intrinsics.p("permissionFlagInteractor");
            throw null;
        }
    }
}
