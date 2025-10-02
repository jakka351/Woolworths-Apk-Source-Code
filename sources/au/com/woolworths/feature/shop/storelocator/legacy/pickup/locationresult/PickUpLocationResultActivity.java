package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult;

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
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocationResultBinding;
import au.com.woolworths.foundation.shop.storelocator.pickup.models.PickUpSuburb;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import com.xwray.groupie.GroupAdapter;
import com.xwray.groupie.Section;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.internal.operators.observable.ObservableObserveOn;
import io.reactivex.subjects.PublishSubject;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "<init>", "()V", "Companion", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class PickUpLocationResultActivity extends Hilt_PickUpLocationResultActivity {
    public static final /* synthetic */ int I = 0;
    public SchedulersProvider B;
    public FeatureToggleManager C;
    public ActivityPickUpLocationResultBinding D;
    public final ViewModelLazy E = new ViewModelLazy(Reflection.f24268a.b(PickUpLocationResultViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final GroupAdapter F = new GroupAdapter();
    public final Section G = new Section();
    public final int H = R.layout.activity_pick_up_location_result;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/storelocator/legacy/pickup/locationresult/PickUpLocationResultActivity$Companion;", "", "", "EXTRA_PICK_UP_SUBURB", "Ljava/lang/String;", "storelocator-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getH() {
        return this.H;
    }

    public final PickUpLocationResultViewModel R4() {
        return (PickUpLocationResultViewModel) this.E.getD();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 202109) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.Hilt_PickUpLocationResultActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityPickUpLocationResultBinding activityPickUpLocationResultBinding = (ActivityPickUpLocationResultBinding) DataBindingUtil.d(this, this.H);
        this.D = activityPickUpLocationResultBinding;
        if (activityPickUpLocationResultBinding == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        activityPickUpLocationResultBinding.D(this);
        activityPickUpLocationResultBinding.L(R4());
        ActivityPickUpLocationResultBinding activityPickUpLocationResultBinding2 = this.D;
        if (activityPickUpLocationResultBinding2 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        setSupportActionBar(activityPickUpLocationResultBinding2.B);
        ActionBar supportActionBar = getSupportActionBar();
        Intrinsics.e(supportActionBar);
        supportActionBar.s(true);
        PickUpSuburb pickUpSuburb = (PickUpSuburb) getIntent().getParcelableExtra("extra_pick_up_suburb");
        if (pickUpSuburb == null) {
            throw new IllegalArgumentException("Postcode intent extra must be provided");
        }
        String str = pickUpSuburb.f;
        ActionBar supportActionBar2 = getSupportActionBar();
        Intrinsics.e(supportActionBar2);
        supportActionBar2.A(getString(R.string.pick_up_location_result_title, pickUpSuburb.d, pickUpSuburb.e, str));
        R4().p6(str);
        Section section = this.G;
        GroupAdapter groupAdapter = this.F;
        groupAdapter.G(section);
        ActivityPickUpLocationResultBinding activityPickUpLocationResultBinding3 = this.D;
        if (activityPickUpLocationResultBinding3 == null) {
            Intrinsics.p("activityBinding");
            throw null;
        }
        RecyclerView recyclerView = activityPickUpLocationResultBinding3.z;
        Intrinsics.e(recyclerView);
        ViewExtKt.a(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(groupAdapter);
        R4().j.f(this, new PickUpLocationResultActivity$sam$androidx_lifecycle_Observer$0(new a(this, 1)));
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
        LambdaObserver lambdaObserver = new LambdaObserver(new au.com.woolworths.feature.shop.delivery.address.a(new a(this, 0), 15), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        N4(lambdaObserver);
    }
}
