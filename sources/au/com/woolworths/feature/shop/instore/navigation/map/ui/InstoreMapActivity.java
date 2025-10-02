package au.com.woolworths.feature.shop.instore.navigation.map.ui;

import android.os.Bundle;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.Event;
import au.com.woolworths.analytics.supers.products.MapsAnalytics;
import au.com.woolworths.android.onesite.extensions.ActivityExtKt;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Floor;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientAppEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientError;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapContract;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel;
import au.com.woolworths.feature.shop.instore.navigation.map.ui.MapAnalyticsEvent;
import au.com.woolworths.feature.shop.instore.navigation.map.utils.MapEventTracker;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.geolocation.location.DeviceLocationServiceCallback;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import au.com.woolworths.product.analytics.ProductAnalyticsExtKt;
import au.com.woolworths.product.models.InStoreLocationData;
import au.com.woolworths.product.models.ProductCard;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lau/com/woolworths/geolocation/location/DeviceLocationServiceCallback;", "<init>", "()V", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstoreMapActivity extends Hilt_InstoreMapActivity implements DeviceLocationServiceCallback {
    public static final /* synthetic */ int B = 0;
    public LocationInteractor x;
    public PermissionFlagInteractorImpl y;
    public final ViewModelLazy z = new ViewModelLazy(Reflection.f24268a.b(InstoreMapViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final ActivityResultLauncher A = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new au.com.woolworths.feature.product.list.b(2));

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/ui/InstoreMapActivity$Companion;", "", "", "FEEDBACK_FORM_ID", "Ljava/lang/String;", "", "VIBRATE_DURATION", "J", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void H4() {
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void I2() {
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void M() {
    }

    public final InstoreMapViewModel O4() {
        return (InstoreMapViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final int P() {
        return R.string.maps_device_location_unavailable_message;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void P4() {
        /*
            r9 = this;
            au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapViewModel r0 = r9.O4()
            au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor r1 = r0.f
            java.lang.String r1 = r1.a()
            java.lang.String r2 = ""
            if (r1 != 0) goto Lf
            r1 = r2
        Lf:
            au.com.woolworths.product.models.ProductCard r3 = r0.u
            if (r3 == 0) goto L3d
            au.com.woolworths.product.models.InStoreLocationData r3 = r3.getInStoreLocation()
            if (r3 == 0) goto L3d
            au.com.woolworths.product.models.InstoreLocationDetailsData r3 = r3.getDetails()
            if (r3 == 0) goto L3d
            double r4 = r3.getX()
            double r6 = r3.getY()
            java.lang.String r3 = "{"
            java.lang.String r8 = ", "
            java.lang.StringBuilder r3 = androidx.constraintlayout.core.state.a.n(r4, r3, r8)
            r3.append(r6)
            java.lang.String r4 = "}"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L3e
        L3d:
            r3 = r2
        L3e:
            au.com.woolworths.product.models.ProductCard r0 = r0.u
            if (r0 == 0) goto L4a
            java.lang.String r0 = r0.getProductId()
            if (r0 != 0) goto L49
            goto L4a
        L49:
            r2 = r0
        L4a:
            kotlin.Pair r0 = new kotlin.Pair
            java.lang.String r4 = "storeId"
            r0.<init>(r4, r1)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r4 = "productLocation"
            r1.<init>(r4, r3)
            kotlin.Pair r3 = new kotlin.Pair
            java.lang.String r4 = "productId"
            r3.<init>(r4, r2)
            kotlin.Pair[] r0 = new kotlin.Pair[]{r0, r1, r3}
            java.util.Map r0 = kotlin.collections.MapsKt.j(r0)
            au.com.woolworths.android.onesite.navigation.ApplicationType r1 = au.com.woolworths.android.onesite.navigation.ApplicationType.d
            au.com.woolworths.android.onesite.navigation.Activities$Feedback2Form r1 = au.com.woolworths.android.onesite.navigation.Activities.Feedback2Form.f4473a
            java.lang.String r2 = "10152"
            android.content.Intent r0 = r1.b(r2, r0)
            r1 = 0
            androidx.activity.result.ActivityResultLauncher r2 = r9.A
            r2.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity.P4():void");
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void i2() {
        LocationInteractor locationInteractor = this.x;
        if (locationInteractor != null) {
            locationInteractor.f(false);
        } else {
            Intrinsics.p("locationInteractor");
            throw null;
        }
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.Hilt_InstoreMapActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Activities.OriientInstoreMapActivity.OriientInstoreMapExtras oriientInstoreMapExtras = (Activities.OriientInstoreMapActivity.OriientInstoreMapExtras) getIntent().getParcelableExtra("EXTRA_DATA");
        InstoreMapViewModel instoreMapViewModelO4 = O4();
        BuildersKt.c(ViewModelKt.a(instoreMapViewModelO4), null, null, new InstoreMapViewModel$fetchStoreMap$1(instoreMapViewModelO4, oriientInstoreMapExtras != null ? oriientInstoreMapExtras.getE() : null, null), 3);
        if (oriientInstoreMapExtras instanceof Activities.OriientInstoreMapActivity.OriientInstoreMapExtras.MapProductCardsExtras) {
            List list = ((Activities.OriientInstoreMapActivity.OriientInstoreMapExtras.MapProductCardsExtras) oriientInstoreMapExtras).d;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof ProductCard) {
                    arrayList.add(obj);
                }
            }
            InstoreMapViewModel instoreMapViewModelO42 = O4();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                InStoreLocationData inStoreLocation = ((ProductCard) next).getInStoreLocation();
                if ((inStoreLocation != null ? inStoreLocation.getDetails() : null) != null) {
                    arrayList2.add(next);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            instoreMapViewModelO42.B6(arrayList2);
        } else if (oriientInstoreMapExtras instanceof Activities.OriientInstoreMapActivity.OriientInstoreMapExtras.MapProductIdsExtras) {
            InstoreMapViewModel instoreMapViewModelO43 = O4();
            List productIds = ((Activities.OriientInstoreMapActivity.OriientInstoreMapExtras.MapProductIdsExtras) oriientInstoreMapExtras).d;
            Intrinsics.h(productIds, "productIds");
            instoreMapViewModelO43.B6(null);
            BuildersKt.c(ViewModelKt.a(instoreMapViewModelO43), null, null, new InstoreMapViewModel$setProductIds$1(instoreMapViewModelO43, productIds, null), 3);
        } else if (oriientInstoreMapExtras != null) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new InstoreMapActivity$observeActions$1(this, null), 3);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                Composer composer = (Composer) obj2;
                if ((((Number) obj3).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final InstoreMapActivity instoreMapActivity = InstoreMapActivity.this;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(787060367, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity.onCreate.1.1
                        /* JADX WARN: Type inference failed for: r5v4, types: [au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity$onCreate$1$1$1] */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            Composer composer2 = (Composer) obj4;
                            if ((((Number) obj5).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final InstoreMapActivity instoreMapActivity2 = instoreMapActivity;
                                ?? r5 = new InstoreMapCallbacks() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapActivity.onCreate.1.1.1
                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void a(OriientAppEvent event) {
                                        Intrinsics.h(event, "event");
                                        int i = InstoreMapActivity.B;
                                        instoreMapActivity2.O4().n.a(event);
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void b() {
                                        Object value;
                                        int i = InstoreMapActivity.B;
                                        InstoreMapViewModel instoreMapViewModelO44 = instoreMapActivity2.O4();
                                        InstoreNavigationInteractor instoreNavigationInteractor = instoreMapViewModelO44.g;
                                        MutableStateFlow mutableStateFlow = instoreMapViewModelO44.s;
                                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                                        if (contentB != null) {
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, null, false, false, true, InstoreMapContract.ViewState.DebugInfo.a(contentB.o, instoreNavigationInteractor.a(), instoreNavigationInteractor.b(), contentB.d, null, null, null, null, 120), false, false, null, null, null, 1023999)));
                                        }
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void c(MapAnalyticsEvent event) {
                                        Intrinsics.h(event, "event");
                                        int i = InstoreMapActivity.B;
                                        instoreMapActivity2.O4().G6(event);
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void d() {
                                        int i = InstoreMapActivity.B;
                                        InstoreMapActivity instoreMapActivity3 = instoreMapActivity2;
                                        instoreMapActivity3.O4().G6(MapAnalyticsEvent.CloseMapClick.f7390a);
                                        instoreMapActivity3.finish();
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void e() {
                                        Object value;
                                        int i = InstoreMapActivity.B;
                                        MutableStateFlow mutableStateFlow = instoreMapActivity2.O4().s;
                                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                                        if (contentB != null) {
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1040383)));
                                        }
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void f(OriientError error) {
                                        Object value;
                                        Intrinsics.h(error, "error");
                                        int i = InstoreMapActivity.B;
                                        MutableStateFlow mutableStateFlow = instoreMapActivity2.O4().s;
                                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                                        if (contentB != null) {
                                            boolean z = error instanceof OriientError.NotInStore ? false : contentB.f;
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, z, null, null, null, null, false, false, false, null, false, false, null, null, null, 1048415)));
                                        }
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void g() {
                                        int i = InstoreMapActivity.B;
                                        InstoreMapActivity instoreMapActivity3 = instoreMapActivity2;
                                        instoreMapActivity3.O4().G6(MapAnalyticsEvent.NoThanksClickFromLocationRationale.f7395a);
                                        instoreMapActivity3.O4().w6();
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void h() {
                                        InstoreMapActivity instoreMapActivity3 = instoreMapActivity2;
                                        ActivityExtKt.b(instoreMapActivity3);
                                        int i = InstoreMapActivity.B;
                                        instoreMapActivity3.O4().G6(MapAnalyticsEvent.GoToSettingsClickFromLocationRationale.f7392a);
                                        instoreMapActivity3.O4().w6();
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void i(int i) {
                                        List list2;
                                        ProductCard productCard;
                                        int i2 = InstoreMapActivity.B;
                                        InstoreMapViewModel instoreMapViewModelO44 = instoreMapActivity2.O4();
                                        if (((InstoreMapContract.ViewState) instoreMapViewModelO44.s.getValue()).b() == null || (list2 = instoreMapViewModelO44.t) == null || (productCard = (ProductCard) list2.get(i)) == null) {
                                            return;
                                        }
                                        instoreMapViewModelO44.D6(productCard);
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void j(Floor floor) {
                                        Intrinsics.h(floor, "floor");
                                        int i = InstoreMapActivity.B;
                                        InstoreMapViewModel instoreMapViewModelO44 = instoreMapActivity2.O4();
                                        if (instoreMapViewModelO44.x6()) {
                                            return;
                                        }
                                        MapEventTracker mapEventTracker = instoreMapViewModelO44.m;
                                        final String str = floor.b;
                                        ProductCard productCard = instoreMapViewModelO44.u;
                                        mapEventTracker.getClass();
                                        MapsAnalytics.ProductFinderMap.Action.d.getClass();
                                        mapEventTracker.a(new Event(str) { // from class: au.com.woolworths.analytics.supers.products.MapsAnalytics$ProductFinderMap$Action$Companion$multilevelButtonClick$1
                                            public final Object d;

                                            {
                                                SpreadBuilder spreadBuilder = new SpreadBuilder(4);
                                                spreadBuilder.b(MapsAnalytics.ProductFinderMap.e);
                                                spreadBuilder.a(new Pair("event.Category", "product finder"));
                                                spreadBuilder.a(new Pair("event.Action", "button_click"));
                                                androidx.constraintlayout.core.state.a.y("event.Label", str, spreadBuilder);
                                                ArrayList arrayList3 = spreadBuilder.f24269a;
                                                this.d = MapsKt.j((Pair[]) arrayList3.toArray(new Pair[arrayList3.size()]));
                                            }

                                            @Override // au.com.woolworths.analytics.Event
                                            /* renamed from: d */
                                            public final String getD() {
                                                return "productfinder_button_click";
                                            }

                                            public final boolean equals(Object obj6) {
                                                if (!(obj6 instanceof Event)) {
                                                    return false;
                                                }
                                                Event event = (Event) obj6;
                                                return "productfinder_button_click".equals(event.getD()) && Intrinsics.c(this.d, event.getData()) && Intrinsics.c(null, event.getF());
                                            }

                                            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
                                            @Override // au.com.woolworths.analytics.Event
                                            public final Map getData() {
                                                return this.d;
                                            }
                                        }, productCard != null ? ProductAnalyticsExtKt.h(productCard, null, null, 7) : null);
                                        instoreMapViewModelO44.z6(floor);
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void k(InstoreMapErrorState errorState) {
                                        Intrinsics.h(errorState, "errorState");
                                        int i = InstoreMapActivity.B;
                                        InstoreMapViewModel instoreMapViewModelO44 = instoreMapActivity2.O4();
                                        if (InstoreMapViewModel.WhenMappings.f7387a[errorState.ordinal()] != 1) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        BuildersKt.c(ViewModelKt.a(instoreMapViewModelO44), null, null, new InstoreMapViewModel$retryOnError$1(instoreMapViewModelO44, null), 3);
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void l() {
                                        int i = InstoreMapActivity.B;
                                        InstoreMapActivity instoreMapActivity3 = instoreMapActivity2;
                                        instoreMapActivity3.O4().G6(MapAnalyticsEvent.ShowFeedback.f7398a);
                                        instoreMapActivity3.P4();
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void m() {
                                        int i = InstoreMapActivity.B;
                                        instoreMapActivity2.O4().F6();
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void n() {
                                        Object value;
                                        int i = InstoreMapActivity.B;
                                        InstoreMapViewModel instoreMapViewModelO44 = instoreMapActivity2.O4();
                                        Bark.Companion companion = Bark.f8483a;
                                        ReportOwner reportOwner = new ReportOwner(ReportOwner.Squad.u);
                                        PositioningInteractor positioningInteractor = instoreMapViewModelO44.j;
                                        Bark.Barker.i(reportOwner, "onCancelCalibration() isCalibrationNeeded=" + positioningInteractor.h().getValue() + " calibrationProgress=" + positioningInteractor.f().getValue() + " positioningState=" + positioningInteractor.c().getValue(), null, 12);
                                        instoreMapViewModelO44.F6();
                                        MapEventTracker mapEventTracker = instoreMapViewModelO44.m;
                                        mapEventTracker.b = true;
                                        mapEventTracker.f7409a.g(MapsAnalytics.Calibration.Action.f);
                                        BuildersKt.c(ViewModelKt.a(instoreMapViewModelO44), null, null, new InstoreMapViewModel$onCancelCalibration$2(instoreMapViewModelO44, null), 3);
                                        MutableStateFlow mutableStateFlow = instoreMapViewModelO44.s;
                                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                                        if (contentB != null) {
                                            do {
                                                value = mutableStateFlow.getValue();
                                            } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1048543)));
                                        }
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void o() {
                                        int i = InstoreMapActivity.B;
                                        InstoreMapViewModel instoreMapViewModelO44 = instoreMapActivity2.O4();
                                        if (instoreMapViewModelO44.x6()) {
                                            instoreMapViewModelO44.F6();
                                        }
                                        instoreMapViewModelO44.w.f(InstoreMapContract.Action.ShowNavigationFeedback.f7380a);
                                    }

                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void p() {
                                        LocationsKt.e(instoreMapActivity2);
                                    }

                                    /* JADX WARN: Type inference failed for: r12v2, types: [au.com.woolworths.android.onesite.analytics.MarketplaceTrackingValue, java.lang.Float, kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext, kotlinx.coroutines.CoroutineStart] */
                                    @Override // au.com.woolworths.feature.shop.instore.navigation.map.ui.InstoreMapCallbacks
                                    public final void q() {
                                        Object value;
                                        Object value2;
                                        int i;
                                        ?? r12;
                                        MapEventTracker mapEventTracker;
                                        int i2 = InstoreMapActivity.B;
                                        InstoreMapViewModel instoreMapViewModelO44 = instoreMapActivity2.O4();
                                        MapEventTracker mapEventTracker2 = instoreMapViewModelO44.m;
                                        MutableStateFlow mutableStateFlow = instoreMapViewModelO44.s;
                                        InstoreMapContract.ViewState.Content contentB = ((InstoreMapContract.ViewState) mutableStateFlow.getValue()).b();
                                        if (contentB != null) {
                                            InstoreMapContract.ViewState.LocationServicesUnavailableState locationServicesUnavailableStateH6 = instoreMapViewModelO44.H6();
                                            int i3 = locationServicesUnavailableStateH6 == null ? -1 : InstoreMapViewModel.WhenMappings.b[locationServicesUnavailableStateH6.ordinal()];
                                            if (i3 == 1) {
                                                do {
                                                    value = mutableStateFlow.getValue();
                                                } while (!mutableStateFlow.d(value, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, null, true, false, false, null, false, false, null, null, null, 1047551)));
                                                return;
                                            }
                                            if (i3 == 2) {
                                                do {
                                                    value2 = mutableStateFlow.getValue();
                                                } while (!mutableStateFlow.d(value2, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, false, null, null, null, null, false, false, false, null, false, false, null, null, null, 1046527)));
                                                return;
                                            }
                                            char c = 3;
                                            if (i3 == 3) {
                                                instoreMapViewModelO44.w.f(InstoreMapContract.Action.TurnOnDeviceLocation.f7381a);
                                                return;
                                            }
                                            int i4 = 7;
                                            if (instoreMapViewModelO44.x6()) {
                                                ProductCard productCard = instoreMapViewModelO44.u;
                                                mapEventTracker2.getClass();
                                                mapEventTracker2.a(MapsAnalytics.ProductFinderMap.Action.j, productCard != null ? ProductAnalyticsExtKt.h(productCard, null, null, 7) : null);
                                                instoreMapViewModelO44.F6();
                                                return;
                                            }
                                            while (true) {
                                                Object value3 = mutableStateFlow.getValue();
                                                i = i4;
                                                r12 = trackingMetadata;
                                                mapEventTracker = mapEventTracker2;
                                                if (mutableStateFlow.d(value3, InstoreMapContract.ViewState.Content.c(contentB, null, null, null, null, null, instoreMapViewModelO44.j.g(), null, null, null, null, false, false, false, null, false, false, null, null, null, 1048543))) {
                                                    break;
                                                }
                                                trackingMetadata = r12;
                                                i4 = i;
                                                mapEventTracker2 = mapEventTracker;
                                                c = 3;
                                            }
                                            ProductCard productCard2 = instoreMapViewModelO44.u;
                                            mapEventTracker.getClass();
                                            mapEventTracker.a(MapsAnalytics.ProductFinderMap.Action.f, productCard2 != null ? ProductAnalyticsExtKt.h(productCard2, r12, r12, i) : r12);
                                            Job jobC = BuildersKt.c(ViewModelKt.a(instoreMapViewModelO44), r12, r12, new InstoreMapViewModel$startActiveMapping$1(instoreMapViewModelO44, r12), 3);
                                            MutableStateFlow mutableStateFlow2 = instoreMapViewModelO44.q;
                                            instoreMapViewModelO44.r = jobC;
                                            mutableStateFlow2.f(InstoreMapContract.ViewState.NavigationState.e);
                                            Floor floor = instoreMapViewModelO44.A;
                                            if (floor != null) {
                                                instoreMapViewModelO44.h.d(floor);
                                            }
                                            BuildersKt.c(ViewModelKt.a(instoreMapViewModelO44), r12, r12, new InstoreMapViewModel$onNavigateClick$1$5(instoreMapViewModelO44, r12), 3);
                                        }
                                    }
                                };
                                int i = InstoreMapActivity.B;
                                InstoreMapScreenKt.b(r5, instoreMapActivity2.O4(), null, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -122432441));
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        if (i == 101) {
            if (LocationsKt.d(this)) {
                LocationInteractor locationInteractor = this.x;
                if (locationInteractor == null) {
                    Intrinsics.p("locationInteractor");
                    throw null;
                }
                locationInteractor.f(true);
            }
            O4().H6();
        } else {
            super.onRequestPermissionsResult(i, permissions, grantResults);
        }
        PermissionFlagInteractorImpl permissionFlagInteractorImpl = this.y;
        if (permissionFlagInteractorImpl != null) {
            permissionFlagInteractorImpl.e(this, permissions, grantResults);
        } else {
            Intrinsics.p("permissionFlagInteractor");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        O4().H6();
    }
}
