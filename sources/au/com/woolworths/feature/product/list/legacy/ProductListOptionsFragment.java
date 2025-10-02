package au.com.woolworths.feature.product.list.legacy;

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
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.base.shopapp.ui.infosection.InfoSectionFragment;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListOptionsActions;
import au.com.woolworths.feature.product.list.legacy.compose.filter.ProductListOptionsScreenKt;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductMainFilterLegacyBinding;
import au.com.woolworths.feature.product.list.legacy.ui.ProductListOptionSpannedItemDecoration;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.google.android.material.snackbar.Snackbar;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.MutableStateFlow;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsFragment extends Hilt_ProductListOptionsFragment {
    public FeatureToggleManager i;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(ProductListOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public FragmentProductMainFilterLegacyBinding k;
    public ProductListOptionsController l;
    public Activities.ProductList.Extras m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsFragment$Companion;", "", "", "EXTRA_PRODUCT_FILTER", "Ljava/lang/String;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$onViewCreated$1", f = "ProductListOptionsFragment.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$onViewCreated$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01191 extends AdaptedFunctionReference implements Function2<ProductListOptionsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProductListOptionsContract.Actions actions = (ProductListOptionsContract.Actions) obj;
                ProductListOptionsFragment productListOptionsFragment = (ProductListOptionsFragment) this.d;
                if (actions instanceof ProductListOptionsContract.Actions.ShowMessage) {
                    FeatureToggleManager featureToggleManager = productListOptionsFragment.i;
                    if (featureToggleManager == null) {
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    }
                    if (!featureToggleManager.c(BaseShopAppFeature.o0)) {
                        View viewRequireView = productListOptionsFragment.requireView();
                        ResText resText = ((ProductListOptionsContract.Actions.ShowMessage) actions).f5333a;
                        Context contextRequireContext = productListOptionsFragment.requireContext();
                        Intrinsics.g(contextRequireContext, "requireContext(...)");
                        Snackbar snackbarJ = Snackbar.j(null, viewRequireView, resText.getText(contextRequireContext), 0);
                        FragmentProductMainFilterLegacyBinding fragmentProductMainFilterLegacyBinding = productListOptionsFragment.k;
                        if (fragmentProductMainFilterLegacyBinding == null) {
                            Intrinsics.p("fragmentBinding");
                            throw null;
                        }
                        snackbarJ.f(fragmentProductMainFilterLegacyBinding.A);
                        snackbarJ.l();
                    }
                } else {
                    productListOptionsFragment.getClass();
                    if (actions instanceof ProductListOptionsContract.Actions.LaunchMarketplaceHowItWorks) {
                        InfoSectionFragment.Companion.a(((ProductListOptionsContract.Actions.LaunchMarketplaceHowItWorks) actions).f5331a, null).show(productListOptionsFragment.getChildFragmentManager(), "InfoSectionFragment");
                    } else if (!(actions instanceof ProductListOptionsContract.Actions.SeeResults) && !(actions instanceof ProductListOptionsContract.Actions.LaunchFilterOptions)) {
                        throw new NoWhenBranchMatchedException();
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
            return ProductListOptionsFragment.this.new AnonymousClass1(continuation);
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
                ProductListOptionsFragment productListOptionsFragment = ProductListOptionsFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01191(2, productListOptionsFragment, ProductListOptionsFragment.class, "handleActions", "handleActions(Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsContract$Actions;)V", 4), FlowExtKt.a(productListOptionsFragment.I1().n, productListOptionsFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
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

    public final ProductListOptionsViewModel I1() {
        return (ProductListOptionsViewModel) this.j.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        FeatureToggleManager featureToggleManager = this.i;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.o0)) {
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$onCreateView$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final ProductListOptionsFragment productListOptionsFragment = this.d;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(-1858979184, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFragment$onCreateView$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    ProductListOptionsScreenKt.b(productListOptionsFragment.I1(), composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, -1475344936));
            return composeView;
        }
        int i = FragmentProductMainFilterLegacyBinding.E;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentProductMainFilterLegacyBinding fragmentProductMainFilterLegacyBinding = (FragmentProductMainFilterLegacyBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_product_main_filter_legacy, null, false, null);
        this.k = fragmentProductMainFilterLegacyBinding;
        if (fragmentProductMainFilterLegacyBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentProductMainFilterLegacyBinding.D(this);
        FragmentProductMainFilterLegacyBinding fragmentProductMainFilterLegacyBinding2 = this.k;
        if (fragmentProductMainFilterLegacyBinding2 != null) {
            return fragmentProductMainFilterLegacyBinding2.h;
        }
        Intrinsics.p("fragmentBinding");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Object value;
        super.onResume();
        ProductListOptionsViewModel productListOptionsViewModelI1 = I1();
        productListOptionsViewModelI1.g.j(ProductListOptionsActions.f, productListOptionsViewModelI1.v6());
        MutableStateFlow mutableStateFlow = I1().i;
        if (((ProductListOptionsContract.ViewState) mutableStateFlow.getValue()).d != null) {
            do {
                value = mutableStateFlow.getValue();
            } while (!mutableStateFlow.d(value, ProductListOptionsContract.ViewState.a((ProductListOptionsContract.ViewState) value, false, null, null, null, null, null, false, null, 0, 4087)));
        }
        I1().I6();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new AnonymousClass1(null), 3);
        Bundle arguments = getArguments();
        Activities.ProductList.Extras extras = arguments != null ? (Activities.ProductList.Extras) arguments.getParcelable("EXTRA_PRODUCT_FILTER") : null;
        if (extras == null) {
            extras = null;
        }
        if (extras == null) {
            throw new IllegalStateException("Product Filter: Main fragment should be launched with extra product filter");
        }
        this.m = extras;
        ProductListOptionsViewModel productListOptionsViewModelI1 = I1();
        Activities.ProductList.Extras extras2 = this.m;
        if (extras2 == null) {
            Intrinsics.p("extras");
            throw null;
        }
        productListOptionsViewModelI1.o = extras2;
        FeatureToggleManager featureToggleManager = this.i;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.o0)) {
            return;
        }
        FragmentProductMainFilterLegacyBinding fragmentProductMainFilterLegacyBinding = this.k;
        if (fragmentProductMainFilterLegacyBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentProductMainFilterLegacyBinding.L(I1());
        FragmentProductMainFilterLegacyBinding fragmentProductMainFilterLegacyBinding2 = this.k;
        if (fragmentProductMainFilterLegacyBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentProductMainFilterLegacyBinding2.C.setNavigationOnClickListener(new m(this, 3));
        this.l = new ProductListOptionsController(I1(), I1(), I1(), I1(), I1());
        FragmentProductMainFilterLegacyBinding fragmentProductMainFilterLegacyBinding3 = this.k;
        if (fragmentProductMainFilterLegacyBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        EpoxyRecyclerView epoxyRecyclerView = fragmentProductMainFilterLegacyBinding3.z;
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        epoxyRecyclerView.i(new ProductListOptionSpannedItemDecoration(contextRequireContext));
        ProductListOptionsController productListOptionsController = this.l;
        if (productListOptionsController == null) {
            Intrinsics.p("controller");
            throw null;
        }
        epoxyRecyclerView.setController(productListOptionsController);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ProductListOptionsFragment$initViewStateObserver$1(this, null), 3);
    }
}
