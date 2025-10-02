package au.com.woolworths.feature.rewards.account.preferences;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public class RewardsPreferenceDetailsBottomSheetFragment extends Hilt_RewardsPreferenceDetailsBottomSheetFragment {
    public final ViewModelLazy i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_PREFERENCES_KEY", "EXTRA_IS_BOTTOM_SHEET", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public RewardsPreferenceDetailsBottomSheetFragment() {
        final RewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$1 rewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$1 = new RewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) rewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(RewardsPreferenceDetailsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
    }

    public final RewardsPreferenceDetailsViewModel Q1() {
        return (RewardsPreferenceDetailsViewModel) this.i.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Intrinsics.h(inflater, "inflater");
        RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelQ1 = Q1();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("preferences_key")) == null) {
            throw new IllegalArgumentException("preferences_key cannot be null");
        }
        rewardsPreferenceDetailsViewModelQ1.k = string;
        Q1().l = Q1().q6().equals("pushNotifications");
        RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelQ12 = Q1();
        Bundle arguments2 = getArguments();
        rewardsPreferenceDetailsViewModelQ12.m = arguments2 != null ? arguments2.getString("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sourceScreen") : null;
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        final ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final RewardsPreferenceDetailsBottomSheetFragment rewardsPreferenceDetailsBottomSheetFragment = this.d;
                    final ComposeView composeView2 = composeView;
                    ThemeKt.a(48, composer, ComposableLambdaKt.c(1669914413, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsBottomSheetFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final RewardsPreferenceDetailsBottomSheetFragment rewardsPreferenceDetailsBottomSheetFragment2 = rewardsPreferenceDetailsBottomSheetFragment;
                                RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelQ13 = rewardsPreferenceDetailsBottomSheetFragment2.Q1();
                                RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelQ14 = rewardsPreferenceDetailsBottomSheetFragment2.Q1();
                                composer2.o(5004770);
                                boolean zI = composer2.I(rewardsPreferenceDetailsViewModelQ14);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    RewardsPreferenceDetailsBottomSheetFragment$onCreateView$1$1$1$1$1 rewardsPreferenceDetailsBottomSheetFragment$onCreateView$1$1$1$1$1 = new RewardsPreferenceDetailsBottomSheetFragment$onCreateView$1$1$1$1$1(0, rewardsPreferenceDetailsViewModelQ14, RewardsPreferenceDetailsViewModel.class, "onRetry", "onRetry()V", 0);
                                    composer2.A(rewardsPreferenceDetailsBottomSheetFragment$onCreateView$1$1$1$1$1);
                                    objG = rewardsPreferenceDetailsBottomSheetFragment$onCreateView$1$1$1$1$1;
                                }
                                KFunction kFunction = (KFunction) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(rewardsPreferenceDetailsBottomSheetFragment2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    objG2 = new au.com.woolworths.design.core.ui.component.experimental.chip.e(rewardsPreferenceDetailsBottomSheetFragment2, 13);
                                    composer2.A(objG2);
                                }
                                Function2 function2 = (Function2) objG2;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(rewardsPreferenceDetailsBottomSheetFragment2);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    objG3 = new androidx.navigation.fragment.e(rewardsPreferenceDetailsBottomSheetFragment2, 19);
                                    composer2.A(objG3);
                                }
                                Function1 function1 = (Function1) objG3;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(rewardsPreferenceDetailsBottomSheetFragment2);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    final int i = 0;
                                    objG4 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.preferences.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i) {
                                                case 0:
                                                    rewardsPreferenceDetailsBottomSheetFragment2.Q1().r6();
                                                    break;
                                                default:
                                                    FragmentActivity activity = rewardsPreferenceDetailsBottomSheetFragment2.getActivity();
                                                    if (activity != null) {
                                                        activity.finish();
                                                    }
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG4);
                                }
                                Function0 function0 = (Function0) objG4;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(rewardsPreferenceDetailsBottomSheetFragment2);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    final int i2 = 1;
                                    objG5 = new Function0() { // from class: au.com.woolworths.feature.rewards.account.preferences.c
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            switch (i2) {
                                                case 0:
                                                    rewardsPreferenceDetailsBottomSheetFragment2.Q1().r6();
                                                    break;
                                                default:
                                                    FragmentActivity activity = rewardsPreferenceDetailsBottomSheetFragment2.getActivity();
                                                    if (activity != null) {
                                                        activity.finish();
                                                    }
                                                    break;
                                            }
                                            return Unit.f24250a;
                                        }
                                    };
                                    composer2.A(objG5);
                                }
                                Function0 function02 = (Function0) objG5;
                                composer2.l();
                                Function0 function03 = (Function0) kFunction;
                                composer2.o(5004770);
                                ComposeView composeView3 = composeView2;
                                boolean zI6 = composer2.I(composeView3);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new d(composeView3, 0);
                                    composer2.A(objG6);
                                }
                                Function0 function04 = (Function0) objG6;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(composeView3);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == composer$Companion$Empty$1) {
                                    objG7 = new androidx.navigation.fragment.e(composeView3, 20);
                                    composer2.A(objG7);
                                }
                                composer2.l();
                                RewardsPreferenceDetailsContentKt.l(rewardsPreferenceDetailsViewModelQ13, true, function2, function1, function0, function02, function03, function04, (Function1) objG7, composer2, 48);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 2009130400));
        return composeView;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        super.onDismiss(dialog);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Q1().p6();
        RewardsPreferenceDetailsViewModel rewardsPreferenceDetailsViewModelQ1 = Q1();
        rewardsPreferenceDetailsViewModelQ1.h.a((Screens) rewardsPreferenceDetailsViewModelQ1.o.getD());
    }
}
