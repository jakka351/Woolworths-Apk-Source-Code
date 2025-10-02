package au.com.woolworths.feature.rewards.card.outage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.utils.AutoClearedValue;
import au.com.woolworths.feature.rewards.card.databinding.FragmentRewardsCardOutageBottomSheetBinding;
import au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableContract;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/rewards/card/outage/ServiceUnavailableBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Companion", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ServiceUnavailableBottomSheetDialogFragment extends Hilt_ServiceUnavailableBottomSheetDialogFragment {
    public static final /* synthetic */ KProperty[] k = {Reflection.f24268a.e(new MutablePropertyReference1Impl(ServiceUnavailableBottomSheetDialogFragment.class, "binding", "getBinding()Lau/com/woolworths/feature/rewards/card/databinding/FragmentRewardsCardOutageBottomSheetBinding;", 0))};
    public final ViewModelLazy i;
    public final AutoClearedValue j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/feature/rewards/card/outage/ServiceUnavailableBottomSheetDialogFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "BUNDLE_EXTRA_TITLE", "BUNDLE_EXTRA_MESSAGE", "card_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1", f = "ServiceUnavailableBottomSheetDialogFragment.kt", l = {40}, m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$2, reason: invalid class name */
        final /* synthetic */ class AnonymousClass2 extends AdaptedFunctionReference implements Function2<ServiceUnavailableContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ServiceUnavailableBottomSheetDialogFragment serviceUnavailableBottomSheetDialogFragment = (ServiceUnavailableBottomSheetDialogFragment) this.d;
                KProperty[] kPropertyArr = ServiceUnavailableBottomSheetDialogFragment.k;
                if (((ServiceUnavailableContract.Actions) obj) instanceof ServiceUnavailableContract.Actions.DismissBottomSheet) {
                    serviceUnavailableBottomSheetDialogFragment.dismiss();
                } else {
                    serviceUnavailableBottomSheetDialogFragment.getClass();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ServiceUnavailableBottomSheetDialogFragment.this.new AnonymousClass1(continuation);
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
                KProperty[] kPropertyArr = ServiceUnavailableBottomSheetDialogFragment.k;
                final ServiceUnavailableBottomSheetDialogFragment serviceUnavailableBottomSheetDialogFragment = ServiceUnavailableBottomSheetDialogFragment.this;
                final Flow flow = ((ServiceUnavailableViewModel) serviceUnavailableBottomSheetDialogFragment.i.getD()).f;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass2(2, serviceUnavailableBottomSheetDialogFragment, ServiceUnavailableBottomSheetDialogFragment.class, "handleActions", "handleActions(Lau/com/woolworths/feature/rewards/card/outage/ServiceUnavailableContract$Actions;)V", 4), new Flow<ServiceUnavailableContract.Actions>() { // from class: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1

                    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                    @SourceDebugExtension
                    /* renamed from: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    public final class AnonymousClass2<T> implements FlowCollector {
                        public final /* synthetic */ FlowCollector d;
                        public final /* synthetic */ ServiceUnavailableBottomSheetDialogFragment e;

                        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                        @DebugMetadata(c = "au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1$2", f = "ServiceUnavailableBottomSheetDialogFragment.kt", l = {50}, m = "emit")
                        /* renamed from: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        public final class AnonymousClass1 extends ContinuationImpl {
                            public /* synthetic */ Object p;
                            public int q;

                            public AnonymousClass1(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            public final Object invokeSuspend(Object obj) {
                                this.p = obj;
                                this.q |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(FlowCollector flowCollector, ServiceUnavailableBottomSheetDialogFragment serviceUnavailableBottomSheetDialogFragment) {
                            this.d = flowCollector;
                            this.e = serviceUnavailableBottomSheetDialogFragment;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1$2$1 r0 = (au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.q
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.q = r1
                                goto L18
                            L13:
                                au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1$2$1 r0 = new au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.p
                                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.d
                                int r2 = r0.q
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                kotlin.ResultKt.b(r6)
                                goto L52
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                kotlin.ResultKt.b(r6)
                                r6 = r5
                                au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableContract$Actions r6 = (au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableContract.Actions) r6
                                au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment r6 = r4.e
                                androidx.lifecycle.Lifecycle r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r6 = r6.getD()
                                androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.h
                                int r6 = r6.compareTo(r2)
                                if (r6 < 0) goto L52
                                r0.q = r3
                                kotlinx.coroutines.flow.FlowCollector r6 = r4.d
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L52
                                return r1
                            L52:
                                kotlin.Unit r5 = kotlin.Unit.f24250a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$onCreateView$1$invokeSuspend$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    @Override // kotlinx.coroutines.flow.Flow
                    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                        Object objCollect = flow.collect(new AnonymousClass2(flowCollector, serviceUnavailableBottomSheetDialogFragment), continuation);
                        return objCollect == CoroutineSingletons.d ? objCollect : Unit.f24250a;
                    }
                });
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

    public ServiceUnavailableBottomSheetDialogFragment() {
        final ServiceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$1 serviceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$1 = new ServiceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) serviceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(ServiceUnavailableViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.rewards.card.outage.ServiceUnavailableBottomSheetDialogFragment$special$$inlined$viewModels$default$4
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
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        ViewDataBinding viewDataBindingC = DataBindingUtil.c(inflater, R.layout.fragment_rewards_card_outage_bottom_sheet, viewGroup, false, null);
        FragmentRewardsCardOutageBottomSheetBinding fragmentRewardsCardOutageBottomSheetBinding = (FragmentRewardsCardOutageBottomSheetBinding) viewDataBindingC;
        fragmentRewardsCardOutageBottomSheetBinding.D(getViewLifecycleOwner());
        fragmentRewardsCardOutageBottomSheetBinding.L((ServiceUnavailableViewModel) this.i.getD());
        TextView textView = fragmentRewardsCardOutageBottomSheetBinding.A;
        Bundle arguments = getArguments();
        textView.setText(arguments != null ? arguments.getString("bundle_extra_title") : null);
        TextView textView2 = fragmentRewardsCardOutageBottomSheetBinding.z;
        Bundle arguments2 = getArguments();
        textView2.setText(arguments2 != null ? arguments2.getString("bundle_extra_message") : null);
        Intrinsics.g(viewDataBindingC, "apply(...)");
        KProperty[] kPropertyArr = k;
        KProperty kProperty = kPropertyArr[0];
        AutoClearedValue autoClearedValue = this.j;
        autoClearedValue.b(this, kProperty, (FragmentRewardsCardOutageBottomSheetBinding) viewDataBindingC);
        View view = ((FragmentRewardsCardOutageBottomSheetBinding) autoClearedValue.getValue(this, kPropertyArr[0])).h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }
}
