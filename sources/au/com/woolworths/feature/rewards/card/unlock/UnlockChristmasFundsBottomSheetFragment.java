package au.com.woolworths.feature.rewards.card.unlock;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.databinding.DataBinderMapperImpl;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.e;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.extensions.LiveDataExtKt;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.feature.rewards.card.analytics.UnlockChristmasFundsActionData;
import au.com.woolworths.feature.rewards.card.databinding.FragmentUnlockChristmasFundsBottomSheetBinding;
import au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsContract;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlock;
import au.com.woolworths.rewards.base.data.RewardsRedemptionUnlockConfirmation;
import au.com.woolworths.views.unlockslider.UnlockSlider;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.ParticleSystem;
import nl.dionsegijn.konfetti.models.ConfettiConfig;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;
import nl.dionsegijn.konfetti.modules.LocationModule;
import nl.dionsegijn.konfetti.modules.VelocityModule;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "Lau/com/woolworths/views/unlockslider/UnlockSlider$OnProgressChangedListener;", "<init>", "()V", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class UnlockChristmasFundsBottomSheetFragment extends Hilt_UnlockChristmasFundsBottomSheetFragment implements UnlockSlider.OnProgressChangedListener {
    public static final /* synthetic */ KProperty[] m = {Reflection.f24268a.e(new MutablePropertyReference1Impl(UnlockChristmasFundsBottomSheetFragment.class, "binding", "getBinding()Lau/com/woolworths/feature/rewards/card/databinding/FragmentUnlockChristmasFundsBottomSheetBinding;", 0))};
    public final AutoClearedValue i = new AutoClearedValue(this);
    public LottieAnimationView j;
    public KonfettiView k;
    public final ViewModelLazy l;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\bR\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\bR\u0014\u0010\u0016\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "UNLOCK_DATA", "", "CONFETTI_SPEED", "F", "", "CONFETTI_DIRECTION", "D", "", "CONFETTI_DURATION", "J", "", "CONFETTI_SIZE", "I", "CONFETTI_POSITION_OFFSET", "CONFETTI_PARTICLES_PER_SECOND", "CONFETTI_MAX_PARTICLES", "CONFETTI_ELEVATION", "LOTTIE_PROGRESS_AT_SLIDER_MAX", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment$onCreate$1", f = "UnlockChristmasFundsBottomSheetFragment.kt", l = {57}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01341 extends AdaptedFunctionReference implements Function2<UnlockChristmasFundsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) throws Resources.NotFoundException {
                Window window;
                View decorView;
                UnlockChristmasFundsContract.Actions actions = (UnlockChristmasFundsContract.Actions) obj;
                UnlockChristmasFundsBottomSheetFragment unlockChristmasFundsBottomSheetFragment = (UnlockChristmasFundsBottomSheetFragment) this.d;
                KProperty[] kPropertyArr = UnlockChristmasFundsBottomSheetFragment.m;
                if (actions instanceof UnlockChristmasFundsContract.Actions.OpenUrl) {
                    Context contextRequireContext = unlockChristmasFundsBottomSheetFragment.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    ContextExtKt.e(contextRequireContext, ((UnlockChristmasFundsContract.Actions.OpenUrl) actions).f5837a);
                } else if (actions instanceof UnlockChristmasFundsContract.Actions.Dismiss) {
                    unlockChristmasFundsBottomSheetFragment.dismiss();
                } else if (actions instanceof UnlockChristmasFundsContract.Actions.ShowError) {
                    Dialog dialog = unlockChristmasFundsBottomSheetFragment.getDialog();
                    if (dialog != null && (window = dialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        Snackbar snackbarI = Snackbar.i(decorView, R.string.unlock_christmas_funds_error, 0);
                        snackbarI.f(unlockChristmasFundsBottomSheetFragment.Q1().C);
                        snackbarI.l();
                    }
                } else {
                    if (!(actions instanceof UnlockChristmasFundsContract.Actions.ShowConfetti)) {
                        unlockChristmasFundsBottomSheetFragment.getClass();
                        throw new NoWhenBranchMatchedException();
                    }
                    KonfettiView konfettiView = unlockChristmasFundsBottomSheetFragment.k;
                    if (konfettiView != null) {
                        ParticleSystem particleSystem = new ParticleSystem(konfettiView);
                        String[] stringArray = konfettiView.getResources().getStringArray(R.array.funds_confetti_colors);
                        Intrinsics.g(stringArray, "getStringArray(...)");
                        ArrayList arrayList = new ArrayList(stringArray.length);
                        for (String str : stringArray) {
                            Intrinsics.e(str);
                            arrayList.add(Integer.valueOf(Color.parseColor(str)));
                        }
                        particleSystem.c = CollectionsKt.F0(arrayList);
                        double radians = Math.toRadians(0.0d);
                        VelocityModule velocityModule = particleSystem.b;
                        velocityModule.f26658a = radians;
                        velocityModule.b = Double.valueOf(Math.toRadians(359.0d));
                        velocityModule.getClass();
                        velocityModule.c = 15.0f < ((float) 0) ? BitmapDescriptorFactory.HUE_RED : 15.0f;
                        ConfettiConfig confettiConfig = particleSystem.f;
                        confettiConfig.f26651a = true;
                        confettiConfig.b = 1500L;
                        Drawable drawable = konfettiView.getContext().getDrawable(R.drawable.ic_confetti);
                        Intrinsics.e(drawable);
                        particleSystem.a(new Shape.DrawableShape(drawable, true));
                        particleSystem.b(new Size(12));
                        Float fValueOf = Float.valueOf(konfettiView.getWidth() + 50.0f);
                        Float fValueOf2 = Float.valueOf(-50.0f);
                        LocationModule locationModule = particleSystem.f26633a;
                        locationModule.f26657a = -50.0f;
                        locationModule.b = fValueOf;
                        locationModule.c = -50.0f;
                        locationModule.d = fValueOf2;
                        particleSystem.c();
                    }
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return UnlockChristmasFundsBottomSheetFragment.this.new AnonymousClass1(continuation);
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
                KProperty[] kPropertyArr = UnlockChristmasFundsBottomSheetFragment.m;
                UnlockChristmasFundsBottomSheetFragment unlockChristmasFundsBottomSheetFragment = UnlockChristmasFundsBottomSheetFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01341(2, unlockChristmasFundsBottomSheetFragment, UnlockChristmasFundsBottomSheetFragment.class, "handleAction", "handleAction(Lau/com/woolworths/feature/rewards/card/unlock/UnlockChristmasFundsContract$Actions;)V", 4), ((UnlockChristmasFundsViewModel) unlockChristmasFundsBottomSheetFragment.l.getD()).j);
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

    public UnlockChristmasFundsBottomSheetFragment() {
        final UnlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$1 unlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$1 = new UnlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) unlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l = new ViewModelLazy(Reflection.f24268a.b(UnlockChristmasFundsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.card.unlock.UnlockChristmasFundsBottomSheetFragment$special$$inlined$viewModels$default$4
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

    @Override // au.com.woolworths.views.unlockslider.UnlockSlider.OnProgressChangedListener
    public final void L0(float f) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2 = this.j;
        if (lottieAnimationView2 == null || lottieAnimationView2.getVisibility() != 0 || (lottieAnimationView = this.j) == null) {
            return;
        }
        lottieAnimationView.setProgress(f * 0.5f);
    }

    public final FragmentUnlockChristmasFundsBottomSheetBinding Q1() {
        return (FragmentUnlockChristmasFundsBottomSheetBinding) this.i.getValue(this, m[0]);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        RewardsRedemptionUnlock rewardsRedemptionUnlock;
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        ViewModelLazy viewModelLazy = this.l;
        ((UnlockChristmasFundsViewModel) viewModelLazy.getD()).i.f(this, new UnlockChristmasFundsBottomSheetFragment$sam$androidx_lifecycle_Observer$0(new e(this, 26)));
        Bundle arguments = getArguments();
        if (arguments == null || (rewardsRedemptionUnlock = (RewardsRedemptionUnlock) arguments.getParcelable("UNLOCK_DATA")) == null) {
            throw new IllegalStateException("Unlock data is required");
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) requireContext().getSystemService(AccessibilityManager.class);
        UnlockChristmasFundsViewModel unlockChristmasFundsViewModel = (UnlockChristmasFundsViewModel) viewModelLazy.getD();
        UnlockChristmasFundsContract.UnlockType unlockType = !(accessibilityManager != null ? accessibilityManager.isEnabled() : false) ? UnlockChristmasFundsContract.UnlockType.d : UnlockChristmasFundsContract.UnlockType.e;
        RewardsRedemptionUnlockConfirmation unlockConfirmation = rewardsRedemptionUnlock.getUnlockConfirmation();
        Intrinsics.e(unlockConfirmation);
        unlockChristmasFundsViewModel.g.m(new UnlockChristmasFundsContract.ViewState(UnlockChristmasFundsContract.UnlockState.d, unlockType, unlockConfirmation));
        unlockChristmasFundsViewModel.f.c(new UnlockChristmasFundsActionData.SheetImpression(unlockConfirmation.getAnalyticsLabel()));
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Window window;
        View decorView;
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        if (this.k == null && (window = dialogOnCreateDialog.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            KonfettiView konfettiView = new KonfettiView(decorView.getContext());
            ViewCompat.F(konfettiView, 10.0f);
            konfettiView.setTranslationZ(10.0f);
            ((ViewGroup) decorView).addView(konfettiView);
            this.k = konfettiView;
        }
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentUnlockChristmasFundsBottomSheetBinding.J;
        DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentUnlockChristmasFundsBottomSheetBinding fragmentUnlockChristmasFundsBottomSheetBinding = (FragmentUnlockChristmasFundsBottomSheetBinding) ViewDataBinding.q(inflater, R.layout.fragment_unlock_christmas_funds_bottom_sheet, viewGroup, false, null);
        Intrinsics.g(fragmentUnlockChristmasFundsBottomSheetBinding, "inflate(...)");
        fragmentUnlockChristmasFundsBottomSheetBinding.D(getViewLifecycleOwner());
        fragmentUnlockChristmasFundsBottomSheetBinding.L((UnlockChristmasFundsViewModel) this.l.getD());
        this.j = (LottieAnimationView) fragmentUnlockChristmasFundsBottomSheetBinding.h.findViewById(R.id.lottie_view);
        this.i.b(this, m[0], fragmentUnlockChristmasFundsBottomSheetBinding);
        ViewCompat.C(Q1().h, getString(R.string.unlock_christmas_funds_accessibility_title));
        View view = Q1().h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.j = null;
        KonfettiView konfettiView = this.k;
        if (konfettiView != null) {
            ViewParent parent = konfettiView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(konfettiView);
            }
        }
        this.k = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        Intrinsics.h(dialog, "dialog");
        super.onDismiss(dialog);
        UnlockChristmasFundsViewModel unlockChristmasFundsViewModel = (UnlockChristmasFundsViewModel) this.l.getD();
        if (((UnlockChristmasFundsContract.ViewState) LiveDataExtKt.a(unlockChristmasFundsViewModel.i)).f5840a == UnlockChristmasFundsContract.UnlockState.f) {
            unlockChristmasFundsViewModel.e.b.f(Unit.f24250a);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        UnlockSlider unlockSlider = Q1().G;
        unlockSlider.getClass();
        unlockSlider.o.add(this);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        UnlockSlider unlockSlider = Q1().G;
        unlockSlider.getClass();
        unlockSlider.o.remove(this);
    }
}
