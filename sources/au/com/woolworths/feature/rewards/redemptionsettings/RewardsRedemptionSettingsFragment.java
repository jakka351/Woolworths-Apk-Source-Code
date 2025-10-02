package au.com.woolworths.feature.rewards.redemptionsettings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.FragmentRedemptionSettingsBinding;
import com.airbnb.epoxy.EpoxyRecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsFragment extends Hilt_RewardsRedemptionSettingsFragment {
    public AnalyticsManager i;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(RewardsRedemptionSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public RewardsRedemptionSettingsEpoxyController k;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment$onCreateView$1", f = "RewardsRedemptionSettingsFragment.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment$onCreateView$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsFragment$onCreateView$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01441 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ RewardsRedemptionSettingsFragment d;

            public C01441(RewardsRedemptionSettingsFragment rewardsRedemptionSettingsFragment) {
                this.d = rewardsRedemptionSettingsFragment;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, RewardsRedemptionSettingsFragment.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                RewardsRedemptionSettingsContract.Actions actions = (RewardsRedemptionSettingsContract.Actions) obj;
                boolean z = actions instanceof RewardsRedemptionSettingsContract.Actions.LaunchRedemptionSettings;
                RewardsRedemptionSettingsFragment rewardsRedemptionSettingsFragment = this.d;
                if (z) {
                    RewardsRedemptionSettingsContract.Actions.LaunchRedemptionSettings launchRedemptionSettings = (RewardsRedemptionSettingsContract.Actions.LaunchRedemptionSettings) actions;
                    new AlertDialog.Builder(rewardsRedemptionSettingsFragment.requireContext()).setTitle(com.woolworths.R.string.rewards_redemption_settings_change_dialog_title).setMessage(com.woolworths.R.string.rewards_redemption_settings_change_dialog_message).setPositiveButton(com.woolworths.R.string.continue_text, new b(rewardsRedemptionSettingsFragment, launchRedemptionSettings.f6426a, launchRedemptionSettings.b, 1)).setNegativeButton(com.woolworths.R.string.cancel, new au.com.woolworths.base.wallet.digipay.framesview.a(rewardsRedemptionSettingsFragment, 4)).show();
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.OpenUrl) {
                    FragmentActivity fragmentActivityRequireActivity = rewardsRedemptionSettingsFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
                    ContextExtKt.e(fragmentActivityRequireActivity, ((RewardsRedemptionSettingsContract.Actions.OpenUrl) actions).f6429a);
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.NavigateToWebSettings) {
                    String str = ((RewardsRedemptionSettingsContract.Actions.NavigateToWebSettings) actions).f6428a;
                    FragmentActivity fragmentActivityRequireActivity2 = rewardsRedemptionSettingsFragment.requireActivity();
                    Intrinsics.g(fragmentActivityRequireActivity2, "requireActivity(...)");
                    ContextExtKt.j(fragmentActivityRequireActivity2, str, null, null, null, 62);
                }
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                return Unit.f24250a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.c(b(), ((FunctionAdapter) obj).b());
                }
                return false;
            }

            public final int hashCode() {
                return b().hashCode();
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsRedemptionSettingsFragment.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
            return CoroutineSingletons.d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                RewardsRedemptionSettingsFragment rewardsRedemptionSettingsFragment = RewardsRedemptionSettingsFragment.this;
                SharedFlow sharedFlow = rewardsRedemptionSettingsFragment.I1().k;
                C01441 c01441 = new C01441(rewardsRedemptionSettingsFragment);
                this.p = 1;
                if (sharedFlow.collect(c01441, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    public final RewardsRedemptionSettingsViewModel I1() {
        return (RewardsRedemptionSettingsViewModel) this.j.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = new RewardsRedemptionSettingsEpoxyController(I1());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentRedemptionSettingsBinding.B;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentRedemptionSettingsBinding fragmentRedemptionSettingsBinding = (FragmentRedemptionSettingsBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_redemption_settings, viewGroup, false, null);
        fragmentRedemptionSettingsBinding.D(getViewLifecycleOwner());
        View view = fragmentRedemptionSettingsBinding.h;
        fragmentRedemptionSettingsBinding.L(I1());
        EpoxyRecyclerView epoxyRecyclerView = fragmentRedemptionSettingsBinding.z;
        RewardsRedemptionSettingsEpoxyController rewardsRedemptionSettingsEpoxyController = this.k;
        if (rewardsRedemptionSettingsEpoxyController == null) {
            Intrinsics.p("bottomSheetEpoxyController");
            throw null;
        }
        epoxyRecyclerView.setController(rewardsRedemptionSettingsEpoxyController);
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new AnonymousClass1(null), 3);
        I1().l.f(getViewLifecycleOwner(), new RewardsRedemptionSettingsFragment$sam$androidx_lifecycle_Observer$0(new l(this, 7)));
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AnalyticsManager analyticsManager = this.i;
        if (analyticsManager != null) {
            analyticsManager.a(Screens.A);
        } else {
            Intrinsics.p("analyticsManager");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        I1().q6();
    }
}
