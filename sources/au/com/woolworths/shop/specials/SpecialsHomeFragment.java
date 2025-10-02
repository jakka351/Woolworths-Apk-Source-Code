package au.com.woolworths.shop.specials;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.analytics.supers.specials.SpecialsAnalytics;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.foundation.shop.collectionmode.CollectionModeInteractor;
import au.com.woolworths.shop.specials.ui.SpecialsHomeScreenKt;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/specials/SpecialsHomeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "specials_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class SpecialsHomeFragment extends Hilt_SpecialsHomeFragment {
    public final ViewModelLazy i;
    public FeatureToggleManager j;
    public ShopAppNavigator k;

    public SpecialsHomeFragment() {
        final SpecialsHomeFragment$special$$inlined$viewModels$default$1 specialsHomeFragment$special$$inlined$viewModels$default$1 = new SpecialsHomeFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) specialsHomeFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i = new ViewModelLazy(Reflection.f24268a.b(SpecialsHomeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$special$$inlined$viewModels$default$4
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
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final SpecialsHomeFragment specialsHomeFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1256496693, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.specials.SpecialsHomeFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            int iIntValue = ((Number) obj4).intValue();
                            SpecialsHomeFragment specialsHomeFragment2 = specialsHomeFragment;
                            ViewModelLazy viewModelLazy = specialsHomeFragment2.i;
                            if ((iIntValue & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                SpecialsHomeScreenKt.f((SpecialsHomeViewModel) viewModelLazy.getD(), composer2, 0);
                                Flow flow = ((SpecialsHomeViewModel) viewModelLazy.getD()).r;
                                Lifecycle d = specialsHomeFragment2.getD();
                                Intrinsics.g(d, "<get-lifecycle>(...)");
                                FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new SpecialsHomeFragment$collectActions$1(2, specialsHomeFragment2, SpecialsHomeFragment.class, "handleAction", "handleAction(Lau/com/woolworths/shop/specials/SpecialsHomeContract$Action;)V", 4), FlowExtKt.a(flow, d, Lifecycle.State.g)), LifecycleOwnerKt.a(specialsHomeFragment2));
                                SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) viewModelLazy.getD();
                                FragmentActivity activity = specialsHomeFragment2.getActivity();
                                specialsHomeViewModel.q6(activity != null ? activity.getIntent() : null);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1794478723));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        SpecialsHomeViewModel specialsHomeViewModel = (SpecialsHomeViewModel) this.i.getD();
        MutableStateFlow mutableStateFlow = specialsHomeViewModel.s;
        CollectionModeInteractor collectionModeInteractor = specialsHomeViewModel.e;
        mutableStateFlow.f(new Triple(collectionModeInteractor.w(), collectionModeInteractor.y(), collectionModeInteractor.J()));
        specialsHomeViewModel.i.f(SpecialsAnalytics.Home.d);
    }
}
