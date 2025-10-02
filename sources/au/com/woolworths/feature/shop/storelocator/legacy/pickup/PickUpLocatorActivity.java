package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import au.com.woolworths.android.onesite.ActivityRequestCode;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.repository.PermissionFlagInteractorImpl;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.utils.Views;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocatorBinding;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.geolocation.location.DeviceLocationServiceCallback;
import au.com.woolworths.geolocation.location.LocationInteractor;
import au.com.woolworths.geolocation.location.LocationsKt;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.xwray.groupie.Group;
import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.Section;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/PickUpLocatorActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "Lau/com/woolworths/geolocation/location/DeviceLocationServiceCallback;", "<init>", "()V", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickUpLocatorActivity extends Hilt_PickUpLocatorActivity implements DeviceLocationServiceCallback {
    public static final /* synthetic */ int K = 0;
    public SchedulersProvider B;
    public LocationInteractor C;
    public PermissionFlagInteractorImpl D;
    public FeatureToggleManager E;
    public final ViewModelLazy F;
    public ActivityPickUpLocatorBinding G;
    public GroupAdapter H;
    public final LinkedHashMap I;
    public final int J;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[PickUpLocatorContract.PageState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PickUpLocatorContract.PageState pageState = PickUpLocatorContract.PageState.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public PickUpLocatorActivity() {
        this.u = true;
        this.F = new ViewModelLazy(Reflection.f24268a.b(PickUpLocatorViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.I = new LinkedHashMap();
        this.J = R.layout.activity_pick_up_locator;
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void H4() {
        R4().p6();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void I2() {
        R4().p6();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void M() {
        R4().p6();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final int P() {
        return R.string.pickup_store_locator_device_location_unavailable_message;
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getJ() {
        return this.J;
    }

    public final PickUpLocatorViewModel R4() {
        return (PickUpLocatorViewModel) this.F.getD();
    }

    @Override // au.com.woolworths.geolocation.location.DeviceLocationServiceCallback
    public final void i2() {
        R4().p6();
        LocationInteractor locationInteractor = this.C;
        if (locationInteractor != null) {
            locationInteractor.f(false);
        } else {
            Intrinsics.p("locationInteractor");
            throw null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        ActivityRequestCode[] activityRequestCodeArr = ActivityRequestCode.d;
        if (i == 0 || i == 202109) {
            if (i2 == -1) {
                setResult(-1, new Intent().putExtra("RESULT_MESSAGE_EXTRA", getString(R.string.store_details_updated_message)));
                finish();
                return;
            }
            return;
        }
        if (i == 102) {
            R4().p6();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.pickup.Hilt_PickUpLocatorActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        LinkedHashMap linkedHashMap;
        super.onCreate(bundle);
        ActivityPickUpLocatorBinding activityPickUpLocatorBinding = (ActivityPickUpLocatorBinding) DataBindingUtil.d(this, R.layout.activity_pick_up_locator);
        this.G = activityPickUpLocatorBinding;
        if (activityPickUpLocatorBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityPickUpLocatorBinding.D(this);
        activityPickUpLocatorBinding.L(R4());
        ActivityPickUpLocatorBinding activityPickUpLocatorBinding2 = this.G;
        if (activityPickUpLocatorBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityPickUpLocatorBinding2.B.A);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        Iterator it = ((AbstractList) PickUpLocatorContract.SectionType.h).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.I;
            if (!zHasNext) {
                break;
            }
            PickUpLocatorContract.SectionType sectionType = (PickUpLocatorContract.SectionType) it.next();
            Section section = new Section();
            PickUpLocationItemHeader pickUpLocationItemHeader = new PickUpLocationItemHeader(sectionType);
            int iO = section.o();
            section.e = pickUpLocationItemHeader;
            int iO2 = section.o();
            if (iO > 0) {
                section.m(0, iO);
            }
            if (iO2 > 0) {
                section.l(0, iO2);
            }
            if (!section.g) {
                section.g = true;
                section.p();
            }
            linkedHashMap.put(sectionType, section);
        }
        this.H = new GroupAdapter();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            GroupAdapter groupAdapter = this.H;
            if (groupAdapter == null) {
                Intrinsics.p("groupAdapter");
                throw null;
            }
            groupAdapter.G((Group) entry.getValue());
        }
        ActivityPickUpLocatorBinding activityPickUpLocatorBinding3 = this.G;
        if (activityPickUpLocatorBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        RecyclerView recyclerView = activityPickUpLocatorBinding3.z;
        Intrinsics.e(recyclerView);
        ViewExtKt.a(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GroupAdapter groupAdapter2 = this.H;
        if (groupAdapter2 == null) {
            Intrinsics.p("groupAdapter");
            throw null;
        }
        recyclerView.setAdapter(groupAdapter2);
        R4().k.f(this, new PickUpLocatorActivity$sam$androidx_lifecycle_Observer$0(new b(this, 1)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        Callback.p(menuItem);
        try {
            Intrinsics.h(menuItem, "menuItem");
            if (menuItem.getItemId() != 16908332) {
                boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] permissions, int[] grantResults) {
        Intrinsics.h(permissions, "permissions");
        Intrinsics.h(grantResults, "grantResults");
        if (i == 101) {
            if (LocationsKt.d(this)) {
                LocationInteractor locationInteractor = this.C;
                if (locationInteractor == null) {
                    Intrinsics.p("locationInteractor");
                    throw null;
                }
                locationInteractor.f(true);
            }
            R4().p6();
        } else {
            super.onRequestPermissionsResult(i, permissions, grantResults);
        }
        PermissionFlagInteractorImpl permissionFlagInteractorImpl = this.D;
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
        PublishSubject publishSubject = R4().m;
        SchedulersProvider schedulersProvider = this.B;
        if (schedulersProvider == null) {
            Intrinsics.p("schedulersProvider");
            throw null;
        }
        ObservableObserveOn observableObserveOnF = publishSubject.f(schedulersProvider.b());
        LambdaObserver lambdaObserver = new LambdaObserver(new c(0, new b(this, 0)), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        N4(lambdaObserver);
        R4().p6();
    }
}
