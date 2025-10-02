package au.com.woolworths.shop.product.navigation.ui.product;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.lifecycle.b;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.Screens;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.shop.contentpage.ContentPageViewModel;
import au.com.woolworths.foundation.shop.instore.presence.presentation.InstorePresencePromptBottomSheetKt;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryContract;
import dagger.hilt.android.AndroidEntryPoint;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.observers.LambdaObserver;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.subjects.PublishSubject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "shop-product-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductCategoryFragment extends Hilt_ProductCategoryFragment {
    public final ViewModelLazy i;
    public final ViewModelLazy j;
    public final CompositeDisposable k;
    public Function0 l;
    public FeatureToggleManager m;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$onResume$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<ProductCategoryContract.Actions, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            ProductCategoryContract.Actions p0 = (ProductCategoryContract.Actions) obj;
            Intrinsics.h(p0, "p0");
            ProductCategoryFragment productCategoryFragment = (ProductCategoryFragment) this.receiver;
            if (!(p0 instanceof ProductCategoryContract.Actions.ShowInstorePrompt)) {
                productCategoryFragment.getClass();
                throw new NoWhenBranchMatchedException();
            }
            Function0 function0 = productCategoryFragment.l;
            if (function0 != null) {
                function0.invoke();
            }
            FragmentActivity fragmentActivityRequireActivity = productCategoryFragment.requireActivity();
            Intrinsics.g(fragmentActivityRequireActivity, "requireActivity(...)");
            productCategoryFragment.l = InstorePresencePromptBottomSheetKt.f(fragmentActivityRequireActivity, ((ProductCategoryContract.Actions.ShowInstorePrompt) p0).f12640a, (ProductCategoryViewModel) productCategoryFragment.i.getD());
            return Unit.f24250a;
        }
    }

    public ProductCategoryFragment() {
        final ProductCategoryFragment$special$$inlined$viewModels$default$1 productCategoryFragment$special$$inlined$viewModels$default$1 = new ProductCategoryFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.e;
        final Lazy lazyA = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) productCategoryFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.i = new ViewModelLazy(reflectionFactory.b(ProductCategoryViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$5
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
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$4
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
        final ProductCategoryFragment$special$$inlined$viewModels$default$6 productCategoryFragment$special$$inlined$viewModels$default$6 = new ProductCategoryFragment$special$$inlined$viewModels$default$6(this);
        final Lazy lazyA2 = LazyKt.a(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) productCategoryFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.j = new ViewModelLazy(reflectionFactory.b(ContentPageViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA2.getD()).getViewModelStore();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) ? this.h.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) lazyA2.getD();
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwner : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.b;
            }
        });
        this.k = new CompositeDisposable();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductCategoryFragment productCategoryFragment = this.d;
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(-1229206391, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.product.navigation.ui.product.ProductCategoryFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductCategoryFragment productCategoryFragment2 = productCategoryFragment;
                                ContentPageViewModel contentPageViewModel = (ContentPageViewModel) productCategoryFragment2.j.getD();
                                composer2.o(5004770);
                                boolean zI = composer2.I(productCategoryFragment2);
                                Object objG = composer2.G();
                                if (zI || objG == Composer.Companion.f1624a) {
                                    objG = new c(productCategoryFragment2, 27);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                ProductCategoryScreenKt.a(contentPageViewModel, (Function0) objG, composer2, 8);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1026493339));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.k.e();
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ViewModelLazy viewModelLazy = this.i;
        PublishSubject publishSubject = ((ProductCategoryViewModel) viewModelLazy.getD()).i;
        b bVar = new b(8, new AnonymousClass1(1, this, ProductCategoryFragment.class, "handleActions", "handleActions(Lau/com/woolworths/shop/product/navigation/ui/product/ProductCategoryContract$Actions;)V", 0));
        publishSubject.getClass();
        LambdaObserver lambdaObserver = new LambdaObserver(bVar, Functions.e);
        publishSubject.a(lambdaObserver);
        DisposableKt.a(this.k, lambdaObserver);
        ((ContentPageViewModel) this.j.getD()).q6(new Activities.ContentPage.ContentPageExtras(Activities.ContentPage.ContentPageType.j, "", ""));
        ProductCategoryViewModel productCategoryViewModel = (ProductCategoryViewModel) viewModelLazy.getD();
        productCategoryViewModel.e.a(Screens.u);
        BuildersKt.c(ViewModelKt.a(productCategoryViewModel), null, null, new ProductCategoryViewModel$instoreCheck$1(productCategoryViewModel, null), 3);
    }
}
