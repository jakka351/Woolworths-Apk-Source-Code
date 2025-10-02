package au.com.woolworths.feature.product.list.legacy;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
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
import au.com.woolworths.analytics.model.TrackableValue;
import au.com.woolworths.analytics.model.TrackingMetadata;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.extensions.ContextExtKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.models.text.ResText;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.legacy.ProductListOptionsContract;
import au.com.woolworths.feature.product.list.legacy.analytics.ProductListScreens;
import au.com.woolworths.feature.product.list.legacy.compose.filter.child.ProductListChildFilterScreenKt;
import au.com.woolworths.feature.product.list.legacy.databinding.FragmentProductListOptionsFilterLegacyBinding;
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
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsFilterFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Companion", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ProductListOptionsFilterFragment extends Hilt_ProductListOptionsFilterFragment {
    public FragmentProductListOptionsFilterLegacyBinding i;
    public final ViewModelLazy j = new ViewModelLazy(Reflection.f24268a.b(ProductListOptionsViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$special$$inlined$activityViewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.h.requireActivity().getDefaultViewModelCreationExtras();
        }
    });
    public FeatureToggleManager k;
    public AnalyticsManager l;
    public ProductListOptionsFilterController m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsFilterFragment$Companion;", "", "", "EXTRA_PRODUCT_LIST_OPTIONS_FILTER", "Ljava/lang/String;", "Extras", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @StabilityInferred
        @Parcelize
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsFilterFragment$Companion$Extras;", "Landroid/os/Parcelable;", "product-list-legacy_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final /* data */ class Extras implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Extras> CREATOR = new Creator();
            public final String d;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Extras> {
                @Override // android.os.Parcelable.Creator
                public final Extras createFromParcel(Parcel parcel) {
                    Intrinsics.h(parcel, "parcel");
                    return new Extras(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Extras[] newArray(int i) {
                    return new Extras[i];
                }
            }

            public Extras(String filterId) {
                Intrinsics.h(filterId, "filterId");
                this.d = filterId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Extras) && Intrinsics.c(this.d, ((Extras) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return YU.a.h("Extras(filterId=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.h(dest, "dest");
                dest.writeString(this.d);
            }
        }

        public static ProductListOptionsFilterFragment a(String filterId) {
            Intrinsics.h(filterId, "filterId");
            ProductListOptionsFilterFragment productListOptionsFilterFragment = new ProductListOptionsFilterFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelable("EXTRA_PRODUCT_LIST_OPTIONS_FILTER", new Extras(filterId));
            productListOptionsFilterFragment.setArguments(bundle);
            return productListOptionsFilterFragment;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onViewCreated$1", f = "ProductListOptionsFilterFragment.kt", l = {122}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onViewCreated$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onViewCreated$1$1, reason: invalid class name and collision with other inner class name */
        final /* synthetic */ class C01181 extends AdaptedFunctionReference implements Function2<ProductListOptionsContract.FilterOptionsActions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProductListOptionsContract.FilterOptionsActions filterOptionsActions = (ProductListOptionsContract.FilterOptionsActions) obj;
                ProductListOptionsFilterFragment productListOptionsFilterFragment = (ProductListOptionsFilterFragment) this.d;
                if (!(filterOptionsActions instanceof ProductListOptionsContract.FilterOptionsActions.OpenUrl)) {
                    productListOptionsFilterFragment.getClass();
                    throw new NoWhenBranchMatchedException();
                }
                Context contextRequireContext = productListOptionsFilterFragment.requireContext();
                Intrinsics.g(contextRequireContext, "requireContext(...)");
                ContextExtKt.e(contextRequireContext, ((ProductListOptionsContract.FilterOptionsActions.OpenUrl) filterOptionsActions).f5334a);
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListOptionsFilterFragment.this.new AnonymousClass1(continuation);
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
                ProductListOptionsFilterFragment productListOptionsFilterFragment = ProductListOptionsFilterFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C01181(2, productListOptionsFilterFragment, ProductListOptionsFilterFragment.class, "handleFilterActions", "handleFilterActions(Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsContract$FilterOptionsActions;)V", 4), FlowExtKt.a(productListOptionsFilterFragment.I1().l, productListOptionsFilterFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onViewCreated$2", f = "ProductListOptionsFilterFragment.kt", l = {129}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onViewCreated$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onViewCreated$2$1, reason: invalid class name */
        final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function2<ProductListOptionsContract.Actions, Continuation<? super Unit>, Object>, SuspendFunction {
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                ProductListOptionsContract.Actions actions = (ProductListOptionsContract.Actions) obj;
                ProductListOptionsFilterFragment productListOptionsFilterFragment = (ProductListOptionsFilterFragment) this.d;
                if (actions instanceof ProductListOptionsContract.Actions.ShowMessage) {
                    View viewRequireView = productListOptionsFilterFragment.requireView();
                    ResText resText = ((ProductListOptionsContract.Actions.ShowMessage) actions).f5333a;
                    Context contextRequireContext = productListOptionsFilterFragment.requireContext();
                    Intrinsics.g(contextRequireContext, "requireContext(...)");
                    Snackbar snackbarJ = Snackbar.j(null, viewRequireView, resText.getText(contextRequireContext), 0);
                    FragmentProductListOptionsFilterLegacyBinding fragmentProductListOptionsFilterLegacyBinding = productListOptionsFilterFragment.i;
                    if (fragmentProductListOptionsFilterLegacyBinding == null) {
                        Intrinsics.p("fragmentBinding");
                        throw null;
                    }
                    snackbarJ.f(fragmentProductListOptionsFilterLegacyBinding.y);
                    snackbarJ.l();
                } else {
                    productListOptionsFilterFragment.getClass();
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ProductListOptionsFilterFragment.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                ProductListOptionsFilterFragment productListOptionsFilterFragment = ProductListOptionsFilterFragment.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, productListOptionsFilterFragment, ProductListOptionsFilterFragment.class, "handleActions", "handleActions(Lau/com/woolworths/feature/product/list/legacy/ProductListOptionsContract$Actions;)V", 4), FlowExtKt.a(productListOptionsFilterFragment.I1().n, productListOptionsFilterFragment.getViewLifecycleOwner().getD(), Lifecycle.State.h));
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
        FeatureToggleManager featureToggleManager = this.k;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.o0)) {
            Context contextRequireContext = requireContext();
            Intrinsics.g(contextRequireContext, "requireContext(...)");
            ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
            composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
            composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onCreateView$1$1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Composer composer = (Composer) obj;
                    if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                        composer.j();
                    } else {
                        final ProductListOptionsFilterFragment productListOptionsFilterFragment = this.d;
                        ThemeKt.b(6, composer, ComposableLambdaKt.c(-878784032, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.product.list.legacy.ProductListOptionsFilterFragment$onCreateView$1$1.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj3, Object obj4) {
                                Composer composer2 = (Composer) obj3;
                                if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                    composer2.j();
                                } else {
                                    ProductListOptionsFilterFragment productListOptionsFilterFragment2 = productListOptionsFilterFragment;
                                    ProductListOptionsViewModel productListOptionsViewModelI1 = productListOptionsFilterFragment2.I1();
                                    composer2.o(5004770);
                                    boolean zI = composer2.I(productListOptionsFilterFragment2);
                                    Object objG = composer2.G();
                                    if (zI || objG == Composer.Companion.f1624a) {
                                        objG = new h(productListOptionsFilterFragment2, 2);
                                        composer2.A(objG);
                                    }
                                    composer2.l();
                                    ProductListChildFilterScreenKt.b(productListOptionsViewModelI1, (Function0) objG, composer2, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer));
                    }
                    return Unit.f24250a;
                }
            }, true, 2046685480));
            return composeView;
        }
        int i = FragmentProductListOptionsFilterLegacyBinding.G;
        androidx.databinding.DataBinderMapperImpl dataBinderMapperImpl = DataBindingUtil.f2545a;
        FragmentProductListOptionsFilterLegacyBinding fragmentProductListOptionsFilterLegacyBinding = (FragmentProductListOptionsFilterLegacyBinding) ViewDataBinding.q(inflater, com.woolworths.R.layout.fragment_product_list_options_filter_legacy, null, false, null);
        this.i = fragmentProductListOptionsFilterLegacyBinding;
        if (fragmentProductListOptionsFilterLegacyBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentProductListOptionsFilterLegacyBinding.D(this);
        FragmentProductListOptionsFilterLegacyBinding fragmentProductListOptionsFilterLegacyBinding2 = this.i;
        if (fragmentProductListOptionsFilterLegacyBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        View view = fragmentProductListOptionsFilterLegacyBinding2.h;
        Intrinsics.g(view, "getRoot(...)");
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Companion.Extras extras;
        super.onResume();
        Bundle arguments = getArguments();
        if (arguments == null || (extras = (Companion.Extras) arguments.getParcelable("EXTRA_PRODUCT_LIST_OPTIONS_FILTER")) == null) {
            throw new IllegalArgumentException("ProductListOptionFilterFragment should be provided extras with filter id");
        }
        String str = extras.d;
        AnalyticsManager analyticsManager = this.l;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        analyticsManager.e(ProductListScreens.d, TrackingMetadata.Companion.a(TrackableValue.v0, str));
        I1().H6(str);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        FeatureToggleManager featureToggleManager = this.k;
        if (featureToggleManager == null) {
            Intrinsics.p("featureToggleManager");
            throw null;
        }
        if (featureToggleManager.c(BaseShopAppFeature.o0)) {
            return;
        }
        FragmentProductListOptionsFilterLegacyBinding fragmentProductListOptionsFilterLegacyBinding = this.i;
        if (fragmentProductListOptionsFilterLegacyBinding == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentProductListOptionsFilterLegacyBinding.L(I1());
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner), null, null, new AnonymousClass1(null), 3);
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.g(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        BuildersKt.c(LifecycleOwnerKt.a(viewLifecycleOwner2), null, null, new AnonymousClass2(null), 3);
        ProductListOptionsViewModel productListOptionsViewModelI1 = I1();
        ProductListOptionsViewModel productListOptionsViewModelI12 = I1();
        AnalyticsManager analyticsManager = this.l;
        if (analyticsManager == null) {
            Intrinsics.p("analyticsManager");
            throw null;
        }
        ProductListOptionsFilterController productListOptionsFilterController = new ProductListOptionsFilterController(productListOptionsViewModelI1, productListOptionsViewModelI12, analyticsManager);
        this.m = productListOptionsFilterController;
        FragmentProductListOptionsFilterLegacyBinding fragmentProductListOptionsFilterLegacyBinding2 = this.i;
        if (fragmentProductListOptionsFilterLegacyBinding2 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentProductListOptionsFilterLegacyBinding2.B.setController(productListOptionsFilterController);
        FragmentProductListOptionsFilterLegacyBinding fragmentProductListOptionsFilterLegacyBinding3 = this.i;
        if (fragmentProductListOptionsFilterLegacyBinding3 == null) {
            Intrinsics.p("fragmentBinding");
            throw null;
        }
        fragmentProductListOptionsFilterLegacyBinding3.E.setNavigationOnClickListener(new m(this, 2));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new ProductListOptionsFilterFragment$initViewStateObserver$1(this, null), 3);
    }
}
