package au.com.woolworths.shop.cart.ui.productalternative;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.h;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import au.com.woolworths.analytics.supers.productreview.ProductReviewAlternativeAnalytics;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.cart.ui.c;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeContract;
import au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeViewModel;
import dagger.hilt.android.AndroidEntryPoint;
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
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$ViewState;", "viewState", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewAlternativeFragment extends Hilt_ProductReviewAlternativeFragment {
    public ProductReviewAlternativeViewModel.Factory i;
    public final NavArgsLazy j;
    public final ViewModelLazy k;
    public FeatureToggleManager l;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$onCreate$1", f = "ProductReviewAlternativeFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/cart/ui/productalternative/ProductReviewAlternativeContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$onCreate$1$1", f = "ProductReviewAlternativeFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C02371 extends SuspendLambda implements Function2<ProductReviewAlternativeContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ProductReviewAlternativeFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02371(ProductReviewAlternativeFragment productReviewAlternativeFragment, Continuation continuation) {
                super(2, continuation);
                this.q = productReviewAlternativeFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02371 c02371 = new C02371(this.q, continuation);
                c02371.p = obj;
                return c02371;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C02371 c02371 = (C02371) create((ProductReviewAlternativeContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02371.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ProductReviewAlternativeContract.Actions actions = (ProductReviewAlternativeContract.Actions) this.p;
                boolean zC = Intrinsics.c(actions, ProductReviewAlternativeContract.Actions.NavigateBack.f10504a);
                ProductReviewAlternativeFragment productReviewAlternativeFragment = this.q;
                if (zC) {
                    productReviewAlternativeFragment.requireActivity().getF().d();
                } else if (actions instanceof ProductReviewAlternativeContract.Actions.DisplayAddToCartBottomSheet) {
                    ProductReviewAlternativeContract.Actions.DisplayAddToCartBottomSheet displayAddToCartBottomSheet = (ProductReviewAlternativeContract.Actions.DisplayAddToCartBottomSheet) actions;
                    ProductCard productCard = displayAddToCartBottomSheet.f10503a;
                    AddToCartBottomSheetFragment.Companion.a(productReviewAlternativeFragment.getParentFragmentManager(), new AddToCartBottomSheetFragment.Extras(displayAddToCartBottomSheet.b, false, new AddToCartBottomSheetFragment.ProductBottomSheetHostScreen("Product Review alternatives", String.valueOf(ProductReviewAlternativeAnalytics.ProductReviewAlternatives.d.getData().get("app.Section")), "productreviewalternatives_screen"), productCard, 8));
                } else {
                    if (!(actions instanceof ProductReviewAlternativeContract.Actions.NavigateToSearch)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productReviewAlternativeFragment.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.ProductAlternative(((ProductReviewAlternativeContract.Actions.NavigateToSearch) actions).f10505a, null)));
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ProductReviewAlternativeFragment.this.new AnonymousClass1(continuation);
            anonymousClass1.p = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f24250a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            ResultKt.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.p;
            ProductReviewAlternativeFragment productReviewAlternativeFragment = ProductReviewAlternativeFragment.this;
            Flow flow = productReviewAlternativeFragment.I1().l;
            Lifecycle d = productReviewAlternativeFragment.getD();
            Intrinsics.g(d, "<get-lifecycle>(...)");
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02371(productReviewAlternativeFragment, null), FlowExtKt.a(flow, d, Lifecycle.State.h)), coroutineScope);
            return Unit.f24250a;
        }
    }

    public ProductReviewAlternativeFragment() {
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.j = new NavArgsLazy(reflectionFactory.b(ProductReviewAlternativeFragmentArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                ProductReviewAlternativeFragment productReviewAlternativeFragment = this.d;
                Bundle arguments = productReviewAlternativeFragment.getArguments();
                if (arguments != null) {
                    return arguments;
                }
                throw new IllegalStateException("Fragment " + productReviewAlternativeFragment + " has null arguments");
            }
        });
        c cVar = new c(this, 1);
        final ProductReviewAlternativeFragment$special$$inlined$viewModels$default$1 productReviewAlternativeFragment$special$$inlined$viewModels$default$1 = new ProductReviewAlternativeFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) productReviewAlternativeFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.k = new ViewModelLazy(reflectionFactory.b(ProductReviewAlternativeViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, cVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$special$$inlined$viewModels$default$4
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

    public final ProductReviewAlternativeViewModel I1() {
        return (ProductReviewAlternativeViewModel) this.k.getD();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        getParentFragmentManager().o0(this, new h(new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(this, 24)));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductReviewAlternativeFragment productReviewAlternativeFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1420665227, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productalternative.ProductReviewAlternativeFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductReviewAlternativeFragment productReviewAlternativeFragment2 = productReviewAlternativeFragment;
                                MutableState mutableStateA = androidx.lifecycle.compose.FlowExtKt.a(productReviewAlternativeFragment2.I1().k, composer2);
                                ProductReviewAlternativeScreenKt.b(((ProductReviewAlternativeContract.ViewState) mutableStateA.getD()).f10506a, ((ProductReviewAlternativeContract.ViewState) mutableStateA.getD()).b, ((ProductReviewAlternativeContract.ViewState) mutableStateA.getD()).c, productReviewAlternativeFragment2.I1(), composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -2088249645));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (((ProductReviewAlternativeContract.ViewState) I1().k.getValue()).d) {
            getParentFragmentManager().X();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.h(view, "view");
        super.onViewCreated(view, bundle);
        I1().p6();
    }
}
