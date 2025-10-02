package au.com.woolworths.feature.rewards.redemptionsettings;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.base.rewards.account.data.RewardsRedemptionSettingMessage;
import au.com.woolworths.base.rewards.account.utils.RewardsAuthNavigator;
import au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsContract;
import au.com.woolworths.feature.rewards.redemptionsettings.databinding.FragmentRedemptionSettingsBottomSheetBinding;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.List;
import kotlin.Function;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsRedemptionSettingsBottomSheetFragment extends Hilt_RewardsRedemptionSettingsBottomSheetFragment {
    public AnalyticsManager i;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(RewardsRedemptionSettingsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "redemption-settings_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[RewardsRedemptionSettingsContract.SoftErrorType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RewardsRedemptionSettingsContract.SoftErrorType softErrorType = RewardsRedemptionSettingsContract.SoftErrorType.d;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                RewardsRedemptionSettingsContract.SoftErrorType softErrorType2 = RewardsRedemptionSettingsContract.SoftErrorType.d;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment$onCreateView$1", f = "RewardsRedemptionSettingsBottomSheetFragment.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment$onCreateView$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.redemptionsettings.RewardsRedemptionSettingsBottomSheetFragment$onCreateView$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01431 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ RewardsRedemptionSettingsBottomSheetFragment d;

            public C01431(RewardsRedemptionSettingsBottomSheetFragment rewardsRedemptionSettingsBottomSheetFragment) {
                this.d = rewardsRedemptionSettingsBottomSheetFragment;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, RewardsRedemptionSettingsBottomSheetFragment.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/redemptionsettings/RewardsRedemptionSettingsContract$Actions;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                Window window;
                View decorView;
                int i;
                RewardsRedemptionSettingsContract.Actions actions = (RewardsRedemptionSettingsContract.Actions) obj;
                boolean z = actions instanceof RewardsRedemptionSettingsContract.Actions.NavigateToWebSettings;
                RewardsRedemptionSettingsBottomSheetFragment rewardsRedemptionSettingsBottomSheetFragment = this.d;
                if (z) {
                    rewardsRedemptionSettingsBottomSheetFragment.dismiss();
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.ShowChangeConfirmationMessages) {
                    RewardsRedemptionSettingsContract.Actions.ShowChangeConfirmationMessages showChangeConfirmationMessages = (RewardsRedemptionSettingsContract.Actions.ShowChangeConfirmationMessages) actions;
                    rewardsRedemptionSettingsBottomSheetFragment.Q1(showChangeConfirmationMessages.f6430a, showChangeConfirmationMessages.b, 0);
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.LaunchStepUpAuthentication) {
                    KeyEventDispatcher.Component activity = rewardsRedemptionSettingsBottomSheetFragment.getActivity();
                    Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.base.rewards.account.utils.RewardsAuthNavigator");
                    RewardsRedemptionSettingsContract.Actions.LaunchStepUpAuthentication launchStepUpAuthentication = (RewardsRedemptionSettingsContract.Actions.LaunchStepUpAuthentication) actions;
                    ((RewardsAuthNavigator) activity).open2FAStepUpFlow(launchStepUpAuthentication.f6427a, launchStepUpAuthentication.b);
                } else if (actions instanceof RewardsRedemptionSettingsContract.Actions.ShowSoftErrorMessage) {
                    RewardsRedemptionSettingsContract.SoftErrorType softErrorType = ((RewardsRedemptionSettingsContract.Actions.ShowSoftErrorMessage) actions).f6431a;
                    Dialog dialog = rewardsRedemptionSettingsBottomSheetFragment.getDialog();
                    if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        int iOrdinal = softErrorType.ordinal();
                        if (iOrdinal == 0) {
                            i = com.woolworths.R.string.rewards_change_redemption_authentication_failed;
                        } else if (iOrdinal == 1) {
                            i = com.woolworths.R.string.rewards_change_redemption_server_error;
                        } else {
                            if (iOrdinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i = com.woolworths.R.string.rewards_change_redemption_network_error;
                        }
                        Snackbar.i(decorView, i, -1).l();
                    }
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
            return RewardsRedemptionSettingsBottomSheetFragment.this.new AnonymousClass1(continuation);
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
                RewardsRedemptionSettingsBottomSheetFragment rewardsRedemptionSettingsBottomSheetFragment = RewardsRedemptionSettingsBottomSheetFragment.this;
                SharedFlow sharedFlow = ((RewardsRedemptionSettingsViewModel) rewardsRedemptionSettingsBottomSheetFragment.j.getD()).k;
                C01431 c01431 = new C01431(rewardsRedemptionSettingsBottomSheetFragment);
                this.p = 1;
                if (sharedFlow.collect(c01431, this) == coroutineSingletons) {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [au.com.woolworths.feature.rewards.redemptionsettings.a] */
    public final void Q1(List list, au.com.woolworths.feature.rewards.card.overlay.ui.b bVar, int i) {
        List list2;
        int i2;
        if (i > list.size() - 1) {
            return;
        }
        if (i < list.size() - 1) {
            list2 = list;
            i2 = i;
            bVar = new a(this, list2, bVar, i2, 1);
        } else {
            list2 = list;
            i2 = i;
        }
        RewardsRedemptionSettingMessage rewardsRedemptionSettingMessage = (RewardsRedemptionSettingMessage) list2.get(i2);
        new AlertDialog.Builder(requireContext()).setTitle(rewardsRedemptionSettingMessage.getTitle()).setMessage(rewardsRedemptionSettingMessage.getMessage()).setPositiveButton(rewardsRedemptionSettingMessage.getButtonLabel(), new c(1, bVar)).setNegativeButton(com.woolworths.R.string.rewards_redemption_settings_confirm_change_cancel, (DialogInterface.OnClickListener) null).show();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentRedemptionSettingsBottomSheetBinding.A;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentRedemptionSettingsBottomSheetBinding fragmentRedemptionSettingsBottomSheetBinding = (FragmentRedemptionSettingsBottomSheetBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_redemption_settings_bottom_sheet, viewGroup, false, null);
        fragmentRedemptionSettingsBottomSheetBinding.D(getViewLifecycleOwner());
        fragmentRedemptionSettingsBottomSheetBinding.L((RewardsRedemptionSettingsViewModel) this.j.getD());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new AnonymousClass1(null), 3);
        View view = fragmentRedemptionSettingsBottomSheetBinding.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        super.onDismiss(dialog);
        KeyEventDispatcher.Component activity = getActivity();
        if (activity instanceof DialogInterface.OnDismissListener) {
            ((DialogInterface.OnDismissListener) activity).onDismiss(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        RewardsRedemptionSettingsViewModel rewardsRedemptionSettingsViewModel = (RewardsRedemptionSettingsViewModel) this.j.getD();
        RewardsRedemptionSettingsContract.AnalyticsImpressionType analyticsImpressionType = RewardsRedemptionSettingsContract.AnalyticsImpressionType.e;
        Intrinsics.h(analyticsImpressionType, "<set-?>");
        rewardsRedemptionSettingsViewModel.m = analyticsImpressionType;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        ViewCompat.C(view, getString(com.woolworths.R.string.rewards_redemption_settings_accessibility_title));
    }
}
