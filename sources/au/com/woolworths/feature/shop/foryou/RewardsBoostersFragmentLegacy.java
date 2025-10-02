package au.com.woolworths.feature.shop.foryou;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.lifecycle.b;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.fragment.HiddenStateEmittable;
import au.com.woolworths.android.onesite.modules.rewards.RewardsPointsBalance;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.feature.rewards.everydayextras.signup.compose.landing.ui.l;
import au.com.woolworths.feature.shop.foryou.RewardsBoostersContractLegacy;
import au.com.woolworths.feature.shop.foryou.analytics.RewardsBoostersPointsActionData;
import au.com.woolworths.feature.shop.foryou.databinding.FragmentRewardsBoostersBinding;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersFragmentLegacy;", "Landroidx/fragment/app/Fragment;", "Lau/com/woolworths/android/onesite/fragment/HiddenStateEmittable;", "<init>", "()V", "Companion", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@Deprecated
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RewardsBoostersFragmentLegacy extends Hilt_RewardsBoostersFragmentLegacy implements HiddenStateEmittable {
    public final ViewModelLazy i;
    public final AutoClearedValue j;
    public final CompositeDisposable k;
    public final SharedFlowImpl l;
    public final SharedFlow m;
    public static final /* synthetic */ KProperty[] o = {Reflection.f24268a.e(new MutablePropertyReference1Impl(RewardsBoostersFragmentLegacy.class, "fragmentBinding", "getFragmentBinding()Lau/com/woolworths/feature/shop/foryou/databinding/FragmentRewardsBoostersBinding;", 0))};
    public static final Companion n = new Companion();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/shop/foryou/RewardsBoostersFragmentLegacy$Companion;", "", "", "TAG", "Ljava/lang/String;", "EXTRA_NO_TOP_PADDING", "for-you_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy$onHiddenChanged$1", f = "RewardsBoostersFragmentLegacy.kt", l = {88}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy$onHiddenChanged$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ boolean r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, Continuation continuation) {
            super(2, continuation);
            this.r = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RewardsBoostersFragmentLegacy.this.new AnonymousClass1(this.r, continuation);
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
                SharedFlowImpl sharedFlowImpl = RewardsBoostersFragmentLegacy.this.l;
                Boolean boolValueOf = Boolean.valueOf(this.r);
                this.p = 1;
                if (sharedFlowImpl.emit(boolValueOf, this) == coroutineSingletons) {
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

    public RewardsBoostersFragmentLegacy() {
        final RewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$1 rewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$1 = new RewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) rewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(RewardsBoostersViewModelLegacy.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.foryou.RewardsBoostersFragmentLegacy$special$$inlined$viewModels$default$4
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
        this.j = new AutoClearedValue(this);
        this.k = new CompositeDisposable();
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        this.l = sharedFlowImplB;
        this.m = FlowKt.a(sharedFlowImplB);
    }

    @Override // au.com.woolworths.android.onesite.fragment.HiddenStateEmittable
    /* renamed from: F0, reason: from getter */
    public final SharedFlow getM() {
        return this.m;
    }

    public final FragmentRewardsBoostersBinding I1() {
        return (FragmentRewardsBoostersBinding) this.j.getValue(this, o[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        int i = FragmentRewardsBoostersBinding.E;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentRewardsBoostersBinding fragmentRewardsBoostersBinding = (FragmentRewardsBoostersBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_rewards_boosters, viewGroup, false, null);
        Intrinsics.g(fragmentRewardsBoostersBinding, "inflate(...)");
        fragmentRewardsBoostersBinding.D(getViewLifecycleOwner());
        fragmentRewardsBoostersBinding.M((RewardsBoostersViewModelLegacy) this.i.getD());
        this.j.b(this, o[0], fragmentRewardsBoostersBinding);
        View view = I1().h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        boolean zIsHidden = isHidden();
        ViewModelLazy viewModelLazy = this.i;
        if (!zIsHidden) {
            RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy = (RewardsBoostersViewModelLegacy) viewModelLazy.getD();
            Object objE = rewardsBoostersViewModelLegacy.j.e();
            Intrinsics.e(objE);
            RewardsPointsBalance rewardsPointsBalance = ((RewardsBoostersContractLegacy.ViewState) objE).f7134a;
            if (rewardsPointsBalance != null) {
                rewardsBoostersViewModelLegacy.g.j(RewardsBoostersPointsActionData.f, TrackingMetadata.Companion.a(TrackableValue.z2, Integer.valueOf(rewardsPointsBalance.f4393a)));
            }
        }
        if (!isHidden()) {
            RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy2 = (RewardsBoostersViewModelLegacy) viewModelLazy.getD();
            RewardsBoostersContractLegacy.Page page = RewardsBoostersContractLegacy.Page.d;
            Intrinsics.h(page, "page");
            RewardsBoostersContractLegacy.Page.POINTS points = (RewardsBoostersContractLegacy.Page.POINTS) page;
            rewardsBoostersViewModelLegacy2.g.a(points.g);
            rewardsBoostersViewModelLegacy2.h.b(points.h);
        }
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(z, null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        this.k.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        boolean zIsHidden = isHidden();
        ViewModelLazy viewModelLazy = this.i;
        if (!zIsHidden) {
            RewardsBoostersViewModelLegacy rewardsBoostersViewModelLegacy = (RewardsBoostersViewModelLegacy) viewModelLazy.getD();
            Object objE = rewardsBoostersViewModelLegacy.j.e();
            Intrinsics.e(objE);
            RewardsPointsBalance rewardsPointsBalance = ((RewardsBoostersContractLegacy.ViewState) objE).f7134a;
            if (rewardsPointsBalance != null) {
                rewardsBoostersViewModelLegacy.g.j(RewardsBoostersPointsActionData.f, TrackingMetadata.Companion.a(TrackableValue.z2, Integer.valueOf(rewardsPointsBalance.f4393a)));
            }
        }
        PublishSubject publishSubject = ((RewardsBoostersViewModelLegacy) viewModelLazy.getD()).k;
        b bVar = new b(3, new RewardsBoostersFragmentLegacy$initialiseViewDisposables$1(1, this, RewardsBoostersFragmentLegacy.class, "handleAction", "handleAction(Lau/com/woolworths/feature/shop/foryou/RewardsBoostersContractLegacy$Actions;)V", 0));
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(bVar, Functions.e);
        publishSubject.a(lambdaObserver);
        DisposableKt.a(this.k, lambdaObserver);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = I1().B;
        Intrinsics.g(toolbar, "toolbar");
        Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("no_top_padding")) {
            toolbar.setPadding(toolbar.getPaddingLeft(), 0, toolbar.getPaddingRight(), toolbar.getPaddingBottom());
        }
        ((RewardsBoostersViewModelLegacy) this.i.getD()).l.f(getViewLifecycleOwner(), new RewardsBoostersFragmentLegacy$sam$androidx_lifecycle_Observer$0(new l(this, 22)));
    }
}
