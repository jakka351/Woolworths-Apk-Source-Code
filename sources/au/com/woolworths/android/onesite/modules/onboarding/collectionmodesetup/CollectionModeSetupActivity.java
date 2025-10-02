package au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.branch.BranchDeepLinkInteractorImpl;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityCollectionModeSetupBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupContract;
import au.com.woolworths.android.onesite.modules.onboarding.stepper.StepperView;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import com.woolworths.R;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupActivity;", "Lau/com/woolworths/android/onesite/modules/BaseShopAppActivity;", "<init>", "()V", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class CollectionModeSetupActivity extends Hilt_CollectionModeSetupActivity {
    public static final /* synthetic */ int I = 0;
    public FeatureToggleManager B;
    public SchedulersProvider C;
    public ShopAppNavigator D;
    public ActivityCollectionModeSetupBinding F;
    public BranchDeepLinkInteractorImpl G;
    public final ViewModelLazy E = new ViewModelLazy(Reflection.f24268a.b(CollectionModeSetupViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.CollectionModeSetupActivity$special$$inlined$viewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.getDefaultViewModelCreationExtras();
        }
    });
    public final int H = R.layout.activity_collection_mode_setup;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/collectionmodesetup/CollectionModeSetupActivity$Companion;", "", "", "SHOPPING_MODE_ONBOARDING_REQUEST_CODE", "I", "ADDRESS_ONBOARDING_REQUEST_CODE", "PICK_UP_MIGRATION_REQUEST_CODE", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity
    /* renamed from: P4, reason: from getter */
    public final int getH() {
        return this.H;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        CollectionModeSetupViewModel collectionModeSetupViewModel = (CollectionModeSetupViewModel) this.E.getD();
        if (i2 == -1 && CollectionModeSetupViewModel.l.contains(Integer.valueOf(i))) {
            collectionModeSetupViewModel.i = true;
            String stringExtra = intent != null ? intent.getStringExtra("RESULT_MESSAGE_EXTRA") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            collectionModeSetupViewModel.j = stringExtra;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.Hilt_CollectionModeSetupActivity, au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) throws NoSuchMethodException, SecurityException {
        super.onCreate(bundle);
        ActivityCollectionModeSetupBinding activityCollectionModeSetupBinding = (ActivityCollectionModeSetupBinding) DataBindingUtil.d(this, this.H);
        activityCollectionModeSetupBinding.L((CollectionModeSetupViewModel) this.E.getD());
        activityCollectionModeSetupBinding.G.setSpeed(0.9f);
        StepperView stepperView = activityCollectionModeSetupBinding.H;
        stepperView.getStepperPresenter().getClass();
        Activities.CollectionModeSetup.CollectionModeSetupData collectionModeSetupData = (Activities.CollectionModeSetup.CollectionModeSetupData) getIntent().getParcelableExtra("EXTRA_DATA");
        boolean z = collectionModeSetupData != null ? collectionModeSetupData.d : false;
        stepperView.setVisibility(z ? 8 : 0);
        activityCollectionModeSetupBinding.y.setVisibility(z ? 0 : 8);
        this.F = activityCollectionModeSetupBinding;
    }

    @Override // au.com.woolworths.android.onesite.modules.onboarding.collectionmodesetup.Hilt_CollectionModeSetupActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        ActivityCollectionModeSetupBinding activityCollectionModeSetupBinding = this.F;
        if (activityCollectionModeSetupBinding == null) {
            Intrinsics.p("activityCollectionModeSetupBinding");
            throw null;
        }
        activityCollectionModeSetupBinding.H.getStepperPresenter().destroy();
        super.onDestroy();
    }

    @Override // au.com.woolworths.android.onesite.modules.BaseShopAppActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        ActivityCollectionModeSetupBinding activityCollectionModeSetupBinding = this.F;
        if (activityCollectionModeSetupBinding == null) {
            Intrinsics.p("activityCollectionModeSetupBinding");
            throw null;
        }
        activityCollectionModeSetupBinding.H.getStepperPresenter().a();
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ActivityCollectionModeSetupBinding activityCollectionModeSetupBinding = this.F;
        if (activityCollectionModeSetupBinding == null) {
            Intrinsics.p("activityCollectionModeSetupBinding");
            throw null;
        }
        StepperView stepperView = activityCollectionModeSetupBinding.H;
        stepperView.getStepperPresenter().c(stepperView);
        ViewModelLazy viewModelLazy = this.E;
        PublishSubject publishSubject = ((CollectionModeSetupViewModel) viewModelLazy.getD()).k;
        SchedulersProvider schedulersProvider = this.C;
        if (schedulersProvider == null) {
            Intrinsics.p("schedulersProvider");
            throw null;
        }
        ObservableObserveOn observableObserveOnF = publishSubject.f(schedulersProvider.b());
        LambdaObserver lambdaObserver = new LambdaObserver(new e(new androidx.navigation.fragment.e(this, 3), 9), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        N4(lambdaObserver);
        ActivityCollectionModeSetupBinding activityCollectionModeSetupBinding2 = this.F;
        if (activityCollectionModeSetupBinding2 == null) {
            Intrinsics.p("activityCollectionModeSetupBinding");
            throw null;
        }
        activityCollectionModeSetupBinding2.H.setStepperStep(3);
        O4().a(Screens.o);
        CollectionModeSetupViewModel collectionModeSetupViewModel = (CollectionModeSetupViewModel) viewModelLazy.getD();
        LaunchManager launchManager = collectionModeSetupViewModel.g;
        if (collectionModeSetupViewModel.i) {
            launchManager.a(LaunchManager.LaunchState.h);
            launchManager.c();
            collectionModeSetupViewModel.h.onNext(new CollectionModeSetupContract.Actions.LaunchHome(collectionModeSetupViewModel.j));
        }
    }
}
