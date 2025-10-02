package au.com.woolworths.shop.lists.ui.watchlist.bottomsheet;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.core.view.KeyEventDispatcher;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetContract;
import au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Function;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.internal.ChannelFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "BottomSheetHost", "Companion", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class WatchlistBottomSheetFragment extends Hilt_WatchlistBottomSheetFragment {
    public final Lazy i;
    public final ActivityResultLauncher j;
    public final ViewModelLazy k;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetFragment$BottomSheetHost;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface BottomSheetHost {
        void u2();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetFragment$Companion;", "", "", "TAG", "Ljava/lang/String;", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$onCreateView$1", f = "WatchlistBottomSheetFragment.kt", l = {50}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$onCreateView$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$onCreateView$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C02611 implements FlowCollector, FunctionAdapter {
            public final /* synthetic */ WatchlistBottomSheetFragment d;

            public C02611(WatchlistBottomSheetFragment watchlistBottomSheetFragment) {
                this.d = watchlistBottomSheetFragment;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function b() {
                return new AdaptedFunctionReference(2, this.d, WatchlistBottomSheetFragment.class, "handleAction", "handleAction(Lau/com/woolworths/shop/lists/ui/watchlist/bottomsheet/WatchlistBottomSheetContract$Action;)V", 4);
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                WatchlistBottomSheetContract.Action action = (WatchlistBottomSheetContract.Action) obj;
                WatchlistBottomSheetFragment watchlistBottomSheetFragment = this.d;
                watchlistBottomSheetFragment.getClass();
                if (action instanceof WatchlistBottomSheetContract.Action.OptInToPushNotification) {
                    if (((WatchlistBottomSheetContract.Action.OptInToPushNotification) action).f12490a || Build.VERSION.SDK_INT < 33 || watchlistBottomSheetFragment.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                        watchlistBottomSheetFragment.dismiss();
                        watchlistBottomSheetFragment.startActivity(Activities.PreferencesDetails.f4501a.b());
                    } else {
                        watchlistBottomSheetFragment.j.a("android.permission.POST_NOTIFICATIONS", null);
                    }
                } else {
                    if (!(action instanceof WatchlistBottomSheetContract.Action.Dismiss)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    watchlistBottomSheetFragment.dismiss();
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
            return WatchlistBottomSheetFragment.this.new AnonymousClass1(continuation);
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
                WatchlistBottomSheetFragment watchlistBottomSheetFragment = WatchlistBottomSheetFragment.this;
                Flow flow = ((WatchlistBottomSheetViewModel) watchlistBottomSheetFragment.k.getD()).g;
                Lifecycle d = watchlistBottomSheetFragment.getD();
                Intrinsics.g(d, "<get-lifecycle>(...)");
                Flow flowA = FlowExtKt.a(flow, d, Lifecycle.State.g);
                C02611 c02611 = new C02611(watchlistBottomSheetFragment);
                this.p = 1;
                if (((ChannelFlow) flowA).collect(c02611, this) == coroutineSingletons) {
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

    public WatchlistBottomSheetFragment() {
        final int i = 0;
        this.i = LazyKt.b(new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.a
            public final /* synthetic */ WatchlistBottomSheetFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        KeyEventDispatcher.Component activity = this.e.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment.BottomSheetHost");
                        return (WatchlistBottomSheetFragment.BottomSheetHost) activity;
                    default:
                        return this.e.requireActivity().getDefaultViewModelProviderFactory();
                }
            }
        });
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestPermission(), new androidx.activity.compose.a(this, 18));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.j = activityResultLauncherRegisterForActivityResult;
        final int i2 = 1;
        Function0 function0 = new Function0(this) { // from class: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.a
            public final /* synthetic */ WatchlistBottomSheetFragment e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        KeyEventDispatcher.Component activity = this.e.getActivity();
                        Intrinsics.f(activity, "null cannot be cast to non-null type au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment.BottomSheetHost");
                        return (WatchlistBottomSheetFragment.BottomSheetHost) activity;
                    default:
                        return this.e.requireActivity().getDefaultViewModelProviderFactory();
                }
            }
        };
        final WatchlistBottomSheetFragment$special$$inlined$viewModels$default$1 watchlistBottomSheetFragment$special$$inlined$viewModels$default$1 = new WatchlistBottomSheetFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) watchlistBottomSheetFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k = new ViewModelLazy(Reflection.f24268a.b(WatchlistBottomSheetViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getD();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$special$$inlined$viewModels$default$4
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

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new AnonymousClass1(null), 3);
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnDetachedFromWindowOrReleasedFromPool.f1985a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$setContent$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final WatchlistBottomSheetFragment watchlistBottomSheetFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1441384523, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.lists.ui.watchlist.bottomsheet.WatchlistBottomSheetFragment$setContent$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            ViewModelLazy viewModelLazy = watchlistBottomSheetFragment.k;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                WatchlistBottomSheetViewModel watchlistBottomSheetViewModel = (WatchlistBottomSheetViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(watchlistBottomSheetViewModel);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    WatchlistBottomSheetFragment$setContent$1$1$1$1 watchlistBottomSheetFragment$setContent$1$1$1$1 = new WatchlistBottomSheetFragment$setContent$1$1$1$1(0, watchlistBottomSheetViewModel, WatchlistBottomSheetViewModel.class, "onPrimaryCtaClick", "onPrimaryCtaClick()V", 0);
                                    composer2.A(watchlistBottomSheetFragment$setContent$1$1$1$1);
                                    objG = watchlistBottomSheetFragment$setContent$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                WatchlistBottomSheetViewModel watchlistBottomSheetViewModel2 = (WatchlistBottomSheetViewModel) viewModelLazy.getD();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(watchlistBottomSheetViewModel2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    WatchlistBottomSheetFragment$setContent$1$1$2$1 watchlistBottomSheetFragment$setContent$1$1$2$1 = new WatchlistBottomSheetFragment$setContent$1$1$2$1(0, watchlistBottomSheetViewModel2, WatchlistBottomSheetViewModel.class, "onSecondaryCtaClick", "onSecondaryCtaClick()V", 0);
                                    composer2.A(watchlistBottomSheetFragment$setContent$1$1$2$1);
                                    objG2 = watchlistBottomSheetFragment$setContent$1$1$2$1;
                                }
                                composer2.l();
                                WatchlistBottomSheetScreenKt.a(function0, (Function0) ((KFunction) objG2), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, 1617029523));
        return composeView;
    }
}
