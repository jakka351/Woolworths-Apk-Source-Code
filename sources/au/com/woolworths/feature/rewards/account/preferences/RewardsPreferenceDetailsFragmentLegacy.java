package au.com.woolworths.feature.rewards.account.preferences;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.OneShotPreDrawListener;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsPreferenceDetailsBinding;
import au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsContractLegacy;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.snackbar.Snackbar;
import com.salesforce.marketingcloud.UrlHandler;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsFragmentLegacy;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public class RewardsPreferenceDetailsFragmentLegacy extends Hilt_RewardsPreferenceDetailsFragmentLegacy {
    public FragmentRewardsPreferenceDetailsBinding i;
    public final ViewModelLazy j;
    public RewardsPreferenceDetailsController k;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsFragmentLegacy$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_PREFERENCES_KEY", "EXTRA_SHOULD_HIDE_TOOLBAR", "", "BOTTOM_SHEET_HEIGHT_PERCENT", "D", "account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$onCreate$1", f = "RewardsPreferenceDetailsFragmentLegacy.kt", l = {46}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", UrlHandler.ACTION, "Lau/com/woolworths/feature/rewards/account/preferences/RewardsPreferenceDetailsContractLegacy$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$onCreate$1$1", f = "RewardsPreferenceDetailsFragmentLegacy.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C01261 extends SuspendLambda implements Function2<RewardsPreferenceDetailsContractLegacy.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ RewardsPreferenceDetailsFragmentLegacy q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01261(RewardsPreferenceDetailsFragmentLegacy rewardsPreferenceDetailsFragmentLegacy, Continuation continuation) {
                super(2, continuation);
                this.q = rewardsPreferenceDetailsFragmentLegacy;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C01261 c01261 = new C01261(this.q, continuation);
                c01261.p = obj;
                return c01261;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C01261 c01261 = (C01261) create((RewardsPreferenceDetailsContractLegacy.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c01261.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                this.q.b2((RewardsPreferenceDetailsContractLegacy.Actions) this.p);
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsPreferenceDetailsFragmentLegacy.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                RewardsPreferenceDetailsFragmentLegacy rewardsPreferenceDetailsFragmentLegacy = RewardsPreferenceDetailsFragmentLegacy.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01261(rewardsPreferenceDetailsFragmentLegacy, null), rewardsPreferenceDetailsFragmentLegacy.R1().o);
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

    public RewardsPreferenceDetailsFragmentLegacy() {
        final RewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$1 rewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$1 = new RewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) rewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j = new ViewModelLazy(Reflection.f24268a.b(RewardsPreferenceDetailsViewModelLegacy.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$special$$inlined$viewModels$default$4
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

    public RewardsPreferenceDetailsViewModelLegacy R1() {
        return (RewardsPreferenceDetailsViewModelLegacy) this.j.getD();
    }

    public void b2(RewardsPreferenceDetailsContractLegacy.Actions action) {
        Intrinsics.h(action, "action");
        if (action instanceof RewardsPreferenceDetailsContractLegacy.Actions.ShowSnackBarErrorMessage) {
            RewardsPreferenceDetailsContractLegacy.ToggleErrorType toggleErrorType = ((RewardsPreferenceDetailsContractLegacy.Actions.ShowSnackBarErrorMessage) action).f5737a;
            FragmentRewardsPreferenceDetailsBinding fragmentRewardsPreferenceDetailsBinding = this.i;
            if (fragmentRewardsPreferenceDetailsBinding != null) {
                Snackbar.i(fragmentRewardsPreferenceDetailsBinding.z, toggleErrorType.d, 0).l();
                return;
            } else {
                Intrinsics.p("binding");
                throw null;
            }
        }
        if (action instanceof RewardsPreferenceDetailsContractLegacy.Actions.ShowSnackBarMessage) {
            String str = ((RewardsPreferenceDetailsContractLegacy.Actions.ShowSnackBarMessage) action).f5738a;
            FragmentRewardsPreferenceDetailsBinding fragmentRewardsPreferenceDetailsBinding2 = this.i;
            if (fragmentRewardsPreferenceDetailsBinding2 != null) {
                Snackbar.j(null, fragmentRewardsPreferenceDetailsBinding2.z, str, 0).l();
                return;
            } else {
                Intrinsics.p("binding");
                throw null;
            }
        }
        if (!(action instanceof RewardsPreferenceDetailsContractLegacy.Actions.OpenExternalLink)) {
            if (!action.equals(RewardsPreferenceDetailsContractLegacy.Actions.GoToPushSettings.f5735a)) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
            ContextExtKt.e(fragmentActivityRequireActivity, ((RewardsPreferenceDetailsContractLegacy.Actions.OpenExternalLink) action).f5736a);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        this.k = new RewardsPreferenceDetailsController(R1());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        Intrinsics.h(inflater, "inflater");
        RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacyR1 = R1();
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("preferences_key")) == null) {
            throw new IllegalArgumentException("preferences_key cannot be null");
        }
        rewardsPreferenceDetailsViewModelLegacyR1.getClass();
        rewardsPreferenceDetailsViewModelLegacyR1.h = string;
        RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacyR12 = R1();
        Bundle arguments2 = getArguments();
        rewardsPreferenceDetailsViewModelLegacyR12.i = arguments2 != null ? arguments2.getString("au.com.woolworths.rewards.base.RewardsDeepLink.Extras.sourceScreen") : null;
        int i = FragmentRewardsPreferenceDetailsBinding.H;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentRewardsPreferenceDetailsBinding fragmentRewardsPreferenceDetailsBinding = (FragmentRewardsPreferenceDetailsBinding) ViewDataBinding.q(inflater, R.layout.fragment_rewards_preference_details, viewGroup, false, null);
        Intrinsics.g(fragmentRewardsPreferenceDetailsBinding, "inflate(...)");
        fragmentRewardsPreferenceDetailsBinding.D(getViewLifecycleOwner());
        EpoxyRecyclerView epoxyRecyclerView = fragmentRewardsPreferenceDetailsBinding.D;
        epoxyRecyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        RewardsPreferenceDetailsController rewardsPreferenceDetailsController = this.k;
        if (rewardsPreferenceDetailsController == null) {
            Intrinsics.p("controller");
            throw null;
        }
        epoxyRecyclerView.setController(rewardsPreferenceDetailsController);
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        RewardsPreferenceDetailsItemDecorator rewardsPreferenceDetailsItemDecorator = new RewardsPreferenceDetailsItemDecorator(contextRequireContext);
        Drawable drawable = requireContext().getDrawable(R.drawable.rewards_horizontal_divider);
        Intrinsics.e(drawable);
        rewardsPreferenceDetailsItemDecorator.f3664a = drawable;
        rewardsPreferenceDetailsItemDecorator.f = drawable;
        epoxyRecyclerView.i(rewardsPreferenceDetailsItemDecorator);
        fragmentRewardsPreferenceDetailsBinding.M(R1());
        Bundle arguments3 = getArguments();
        fragmentRewardsPreferenceDetailsBinding.L(arguments3 != null ? arguments3.getBoolean("should_hide_toolbar") : false);
        this.i = fragmentRewardsPreferenceDetailsBinding;
        FragmentActivity activity = getActivity();
        Intrinsics.f(activity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        AppCompatActivity appCompatActivity = (AppCompatActivity) activity;
        FragmentRewardsPreferenceDetailsBinding fragmentRewardsPreferenceDetailsBinding2 = this.i;
        if (fragmentRewardsPreferenceDetailsBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        appCompatActivity.setSupportActionBar(fragmentRewardsPreferenceDetailsBinding2.E);
        FragmentRewardsPreferenceDetailsBinding fragmentRewardsPreferenceDetailsBinding3 = this.i;
        if (fragmentRewardsPreferenceDetailsBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        fragmentRewardsPreferenceDetailsBinding3.D.setItemAnimator(null);
        R1().n.f(getViewLifecycleOwner(), new RewardsPreferenceDetailsFragmentLegacy$sam$androidx_lifecycle_Observer$0(new androidx.navigation.fragment.e(this, 21)));
        FragmentRewardsPreferenceDetailsBinding fragmentRewardsPreferenceDetailsBinding4 = this.i;
        if (fragmentRewardsPreferenceDetailsBinding4 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        View view = fragmentRewardsPreferenceDetailsBinding4.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        super.onDismiss(dialog);
        KeyEventDispatcher.Component activity = getActivity();
        DialogInterface.OnDismissListener onDismissListener = activity instanceof DialogInterface.OnDismissListener ? (DialogInterface.OnDismissListener) activity : null;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialog);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        R1().p6();
        RewardsPreferenceDetailsViewModelLegacy rewardsPreferenceDetailsViewModelLegacyR1 = R1();
        rewardsPreferenceDetailsViewModelLegacyR1.g.a((Screens) rewardsPreferenceDetailsViewModelLegacyR1.k.getD());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(final View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        final Dialog dialog = getDialog();
        if (dialog != null) {
            final View decorView = requireActivity().getWindow().getDecorView();
            Intrinsics.g(decorView, "getDecorView(...)");
            OneShotPreDrawListener.a(decorView, new Runnable() { // from class: au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsFragmentLegacy$onViewCreated$lambda$5$$inlined$doOnPreDraw$1
                @Override // java.lang.Runnable
                public final void run() {
                    int measuredHeight = (int) (decorView.getMeasuredHeight() * 0.75d);
                    view.getLayoutParams().height = measuredHeight;
                    View viewFindViewById = dialog.findViewById(R.id.design_bottom_sheet);
                    if (viewFindViewById != null) {
                        BottomSheetBehavior.F(viewFindViewById).N(measuredHeight);
                    }
                }
            });
        }
    }
}
