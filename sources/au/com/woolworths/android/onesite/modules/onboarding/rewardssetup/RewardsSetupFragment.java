package au.com.woolworths.android.onesite.modules.onboarding.rewardssetup;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.appdata.AppConfig;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.legacy.databinding.FragmentRewardsSetupBinding;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.e;
import au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupContract;
import au.com.woolworths.android.onesite.repository.LaunchManager;
import au.com.woolworths.android.onesite.rxutils.SchedulersProvider;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/rewardssetup/RewardsSetupFragment;", "Lau/com/woolworths/android/onesite/modules/LegacyBaseFragment;", "<init>", "()V", "Companion", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsSetupFragment extends Hilt_RewardsSetupFragment {
    public SchedulersProvider k;
    public FeatureToggleManager l;
    public AppConfig m;
    public boolean n;
    public final ViewModelLazy o = new ViewModelLazy(Reflection.f24268a.b(RewardsSetupViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.android.onesite.modules.onboarding.rewardssetup.RewardsSetupFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public FragmentRewardsSetupBinding p;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lau/com/woolworths/android/onesite/modules/onboarding/rewardssetup/RewardsSetupFragment$Companion;", "", "", "REWARDS_AUTH_REQUEST_CODE", "I", "", "REWARDS_CARD_PROMPT_ID", "Ljava/lang/String;", "DISPLAY_SKIP_BUTTON", "shop-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        RewardsSetupViewModel rewardsSetupViewModel = (RewardsSetupViewModel) this.o.getD();
        if (i2 != -1) {
            rewardsSetupViewModel.i = false;
            rewardsSetupViewModel.j = false;
        } else if (i == 5 || i == 10005) {
            rewardsSetupViewModel.i = true;
            rewardsSetupViewModel.j = false;
        } else {
            rewardsSetupViewModel.i = false;
            rewardsSetupViewModel.j = true;
        }
    }

    @Override // au.com.woolworths.android.onesite.modules.LegacyBaseFragment, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FragmentRewardsSetupBinding fragmentRewardsSetupBinding = (FragmentRewardsSetupBinding) DataBindingUtil.c(inflater, R.layout.fragment_rewards_setup, viewGroup, false, null);
        this.p = fragmentRewardsSetupBinding;
        if (fragmentRewardsSetupBinding == null) {
            Intrinsics.p("rewardsSetupFragmentBinding");
            throw null;
        }
        fragmentRewardsSetupBinding.D(getViewLifecycleOwner());
        fragmentRewardsSetupBinding.L((RewardsSetupViewModel) this.o.getD());
        FragmentRewardsSetupBinding fragmentRewardsSetupBinding2 = this.p;
        if (fragmentRewardsSetupBinding2 != null) {
            return fragmentRewardsSetupBinding2.h;
        }
        Intrinsics.p("rewardsSetupFragmentBinding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ViewModelLazy viewModelLazy = this.o;
        PublishSubject publishSubject = ((RewardsSetupViewModel) viewModelLazy.getD()).l;
        SchedulersProvider schedulersProvider = this.k;
        if (schedulersProvider == null) {
            Intrinsics.p("schedulersProvider");
            throw null;
        }
        ObservableObserveOn observableObserveOnF = publishSubject.f(schedulersProvider.b());
        LambdaObserver lambdaObserver = new LambdaObserver(new e(new androidx.navigation.fragment.e(this, 4), 10), Functions.e);
        observableObserveOnF.a(lambdaObserver);
        this.e.d(lambdaObserver);
        RewardsSetupViewModel rewardsSetupViewModel = (RewardsSetupViewModel) viewModelLazy.getD();
        PublishSubject publishSubject2 = rewardsSetupViewModel.k;
        LaunchManager launchManager = rewardsSetupViewModel.e;
        if (launchManager.b()) {
            publishSubject2.onNext(RewardsSetupContract.Actions.SetShoppingModeStepComplete.f4387a);
        }
        if (rewardsSetupViewModel.j) {
            publishSubject2.onNext(RewardsSetupContract.Actions.FinishWithResultOnboardingCancel.f4382a);
        } else if (rewardsSetupViewModel.i) {
            launchManager.c();
            rewardsSetupViewModel.p6(rewardsSetupViewModel.i);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        Intrinsics.h(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean("DISPLAY_SKIP_BUTTON", this.n);
    }

    @Override // au.com.woolworths.android.onesite.modules.LegacyBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        if (arguments == null) {
            throw new IllegalArgumentException("DISPLAY SKIP BUTTON flag is missing from the incoming intent");
        }
        boolean z = arguments.getBoolean("DISPLAY_SKIP_BUTTON", false);
        this.n = z;
        FragmentRewardsSetupBinding fragmentRewardsSetupBinding = this.p;
        if (fragmentRewardsSetupBinding != null) {
            fragmentRewardsSetupBinding.A.setVisibility(z ? 0 : 8);
        } else {
            Intrinsics.p("rewardsSetupFragmentBinding");
            throw null;
        }
    }
}
