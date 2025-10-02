package au.com.woolworths.shop.checkout.ui.summary.refund;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment;
import au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetViewModel;
import au.com.woolworths.foundation.shop.bottomsheet.BottomSheetContent;
import au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetContract;
import com.woolworths.R;
import java.util.Iterator;
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
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.ConstrainedOnceSequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlowImpl;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/refund/RefundBottomSheetFragment;", "Lau/com/woolworths/foundation/shop/bottomsheet/BaseBottomSheetFragment;", "<init>", "()V", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class RefundBottomSheetFragment extends BaseBottomSheetFragment {
    public final ViewModelLazy e;
    public final ResText f;
    public final NavArgsLazy g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/summary/refund/RefundBottomSheetFragment$Companion;", "", "", "REFUND_BOTTOM_SHEET_RESULT_KEY", "Ljava/lang/String;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$onCreate$1", f = "RefundBottomSheetFragment.kt", l = {36}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02451 extends AdaptedFunctionReference implements Function2<RefundBottomSheetContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Object next;
                SavedStateHandle savedStateHandle;
                RefundBottomSheetFragment refundBottomSheetFragment = (RefundBottomSheetFragment) this.d;
                refundBottomSheetFragment.getClass();
                if (!Intrinsics.c((RefundBottomSheetContract.Actions) obj, RefundBottomSheetContract.Actions.OnPrimaryCtaClick.f10828a)) {
                    throw new NoWhenBranchMatchedException();
                }
                NavController navControllerA = FragmentKt.a(refundBottomSheetFragment);
                Iterator it = CollectionsKt.l0(navControllerA.b.f).iterator();
                if (it.hasNext()) {
                    it.next();
                }
                Iterator f24664a = ((ConstrainedOnceSequence) SequencesKt.b(it)).getF24664a();
                while (true) {
                    if (!f24664a.hasNext()) {
                        next = null;
                        break;
                    }
                    next = f24664a.next();
                    if (!(((NavBackStackEntry) next).e instanceof NavGraph)) {
                        break;
                    }
                }
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) next;
                if (navBackStackEntry != null && (savedStateHandle = (SavedStateHandle) navBackStackEntry.l.getD()) != null) {
                    savedStateHandle.b(Boolean.TRUE, "REFUND_BOTTOM_SHEET_RESULT_KEY");
                }
                navControllerA.g();
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return RefundBottomSheetFragment.this.new AnonymousClass1(continuation);
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
                RefundBottomSheetFragment refundBottomSheetFragment = RefundBottomSheetFragment.this;
                SharedFlowImpl sharedFlowImpl = ((RefundViewModel) refundBottomSheetFragment.e.getD()).j;
                Lifecycle d = refundBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02451(2, refundBottomSheetFragment, RefundBottomSheetFragment.class, "handleAction", "handleAction(Lau/com/woolworths/shop/checkout/ui/summary/refund/RefundBottomSheetContract$Actions;)V", 4), FlowExtKt.a(sharedFlowImpl, d, Lifecycle.State.h));
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

    public RefundBottomSheetFragment() {
        final RefundBottomSheetFragment$special$$inlined$viewModels$default$1 refundBottomSheetFragment$special$$inlined$viewModels$default$1 = new RefundBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) refundBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.e = new ViewModelLazy(reflectionFactory.b(RefundViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$special$$inlined$viewModels$default$4
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
        this.f = new ResText(R.string.refund_bottom_sheet_title);
        this.g = new NavArgsLazy(reflectionFactory.b(RefundBottomSheetFragmentArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.checkout.ui.summary.refund.RefundBottomSheetFragment$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RefundBottomSheetFragment refundBottomSheetFragment = this.d;
                Bundle arguments = refundBottomSheetFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + refundBottomSheetFragment + " has null arguments");
            }
        });
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    public final BottomSheetContent I1(Bundle bundle) {
        return ((RefundBottomSheetFragmentArgs) this.g.getD()).f10829a;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    /* renamed from: Q1, reason: from getter */
    public final ResText getF() {
        return this.f;
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment
    public final BaseBottomSheetViewModel R1() {
        return (RefundViewModel) this.e.getD();
    }

    @Override // au.com.woolworths.foundation.shop.bottomsheet.BaseBottomSheetFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
    }
}
