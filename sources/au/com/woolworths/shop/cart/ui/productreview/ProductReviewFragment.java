package au.com.woolworths.shop.cart.ui.productreview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.android.onesite.navigation.ActivityNavigatorKt;
import au.com.woolworths.android.onesite.navigation.ApplicationType;
import au.com.woolworths.base.shopapp.BaseShopAppFeature;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.product.addtocart.AddToCartBottomSheetFragment;
import au.com.woolworths.shop.cart.analytics.CartScreens;
import au.com.woolworths.shop.cart.domain.model.PageResult;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewContract;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragmentDirections;
import au.com.woolworths.shop.cart.ui.productreview.ProductReviewViewModel;
import com.google.android.material.snackbar.Snackbar;
import com.woolworths.R;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$ViewState;", "viewState", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class ProductReviewFragment extends Hilt_ProductReviewFragment {
    public ProductReviewViewModel.Factory i;
    public FeatureToggleManager j;
    public final Lazy k = LazyKt.b(new c(this, 0));
    public final ViewModelLazy l;
    public final ActivityResultLauncher m;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$onCreate$1", f = "ProductReviewFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$onCreate$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public /* synthetic */ Object p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/shop/cart/ui/productreview/ProductReviewContract$Actions;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$onCreate$1$1", f = "ProductReviewFragment.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$onCreate$1$1, reason: invalid class name and collision with other inner class name */
        final class C02381 extends SuspendLambda implements Function2<ProductReviewContract.Actions, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;
            public final /* synthetic */ ProductReviewFragment q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02381(ProductReviewFragment productReviewFragment, Continuation continuation) {
                super(2, continuation);
                this.q = productReviewFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C02381 c02381 = new C02381(this.q, continuation);
                c02381.p = obj;
                return c02381;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                C02381 c02381 = (C02381) create((ProductReviewContract.Actions) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                c02381.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                ProductReviewContract.Actions actions = (ProductReviewContract.Actions) this.p;
                boolean zC = Intrinsics.c(actions, ProductReviewContract.Actions.ShowFulfilmentWindow.f10516a);
                ProductReviewFragment productReviewFragment = this.q;
                if (zC) {
                    ActivityResultLauncher activityResultLauncher = productReviewFragment.m;
                    FeatureToggleManager featureToggleManager = productReviewFragment.j;
                    if (featureToggleManager == null) {
                        Intrinsics.p("featureToggleManager");
                        throw null;
                    }
                    activityResultLauncher.a(featureToggleManager.c(BaseShopAppFeature.j) ? Activities.TimeSelectorActivity.b() : ActivityNavigatorKt.a(Activities.FulfilmentWindowSelectionActivity.f4476a, ApplicationType.e), null);
                } else if (Intrinsics.c(actions, ProductReviewContract.Actions.ShowSnackBarDeleteProductSuccess.f10518a)) {
                    productReviewFragment.Q1(R.string.cart_product_removed_message);
                } else if (Intrinsics.c(actions, ProductReviewContract.Actions.ShowSnackBarDeleteProductFail.f10517a)) {
                    productReviewFragment.Q1(R.string.product_review_remove_product_error);
                } else if (Intrinsics.c(actions, ProductReviewContract.Actions.ShowSnackBarUpdateProductFail.f10522a)) {
                    productReviewFragment.Q1(R.string.product_review_update_quantity_error);
                } else if (actions instanceof ProductReviewContract.Actions.OpenQuantitySelector) {
                    AddToCartBottomSheetFragment.Companion.b(productReviewFragment.getParentFragmentManager(), ((ProductReviewContract.Actions.OpenQuantitySelector) actions).f10515a, CartScreens.e);
                } else if (Intrinsics.c(actions, ProductReviewContract.Actions.ShowSnackBarDeliveryWindowSelected.f10519a)) {
                    productReviewFragment.Q1(R.string.product_review_delivery_window_selected);
                } else if (Intrinsics.c(actions, ProductReviewContract.Actions.ShowSnackBarPickUpWindowSelected.f10520a)) {
                    productReviewFragment.Q1(R.string.product_review_pickup_window_selected);
                } else if (actions instanceof ProductReviewContract.Actions.OpenProductReviewAlternative) {
                    FragmentKt.a(productReviewFragment).d(new ProductReviewFragmentDirections.ActionProductReviewFragmentToAlternative(((ProductReviewContract.Actions.OpenProductReviewAlternative) actions).f10514a));
                } else if (actions instanceof ProductReviewContract.Actions.NavigateToSearch) {
                    productReviewFragment.startActivity(Activities.Search.f4526a.b(new Activities.Search.Extras.ProductAlternative(((ProductReviewContract.Actions.NavigateToSearch) actions).f10513a, null)));
                } else {
                    if (!Intrinsics.c(actions, ProductReviewContract.Actions.ShowSnackBarReplaceProductSuccess.f10521a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    productReviewFragment.Q1(R.string.cart_product_replaced_message);
                }
                return Unit.f24250a;
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = ProductReviewFragment.this.new AnonymousClass1(continuation);
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
            ProductReviewFragment productReviewFragment = ProductReviewFragment.this;
            Flow flow = productReviewFragment.I1().p;
            Lifecycle d = productReviewFragment.getD();
            Intrinsics.g(d, "<get-lifecycle>(...)");
            FlowKt.E(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new C02381(productReviewFragment, null), FlowExtKt.a(flow, d, Lifecycle.State.h)), coroutineScope);
            return Unit.f24250a;
        }
    }

    public ProductReviewFragment() {
        c cVar = new c(this, 1);
        final ProductReviewFragment$special$$inlined$viewModels$default$1 productReviewFragment$special$$inlined$viewModels$default$1 = new ProductReviewFragment$special$$inlined$viewModels$default$1(this);
        final Lazy lazyA = LazyKt.a(LazyThreadSafetyMode.e, new Function0<ViewModelStoreOwner>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return (ViewModelStoreOwner) productReviewFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.l = new ViewModelLazy(Reflection.f24268a.b(ProductReviewViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((ViewModelStoreOwner) lazyA.getD()).getViewModelStore();
            }
        }, cVar, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$special$$inlined$viewModels$default$4
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
        ActivityResultLauncher activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new androidx.activity.compose.a(this, 15));
        Intrinsics.g(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.m = activityResultLauncherRegisterForActivityResult;
    }

    public final ProductReviewViewModel I1() {
        return (ProductReviewViewModel) this.l.getD();
    }

    public final void Q1(int i) {
        Snackbar.i(requireView(), i, 0).l();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass1(null), 3);
        getParentFragmentManager().o0(this, new androidx.fragment.app.h(new au.com.woolworths.feature.shop.homepage.presentation.marketplace.a(this, 25)));
        OnBackPressedDispatcherKt.a(requireActivity().getF(), null, new b(this, 0), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.h(inflater, "inflater");
        Context contextRequireContext = requireContext();
        Intrinsics.g(contextRequireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$onCreateView$1$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    final ProductReviewFragment productReviewFragment = this.d;
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(122761732, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.cart.ui.productreview.ProductReviewFragment$onCreateView$1$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                ProductReviewFragment productReviewFragment2 = productReviewFragment;
                                MutableState mutableStateA = androidx.lifecycle.compose.FlowExtKt.a(productReviewFragment2.I1().o, composer2);
                                boolean z = ((ProductReviewContract.ViewState) mutableStateA.getD()).f10523a;
                                PageResult pageResult = ((ProductReviewContract.ViewState) mutableStateA.getD()).b;
                                ProductReviewViewModel productReviewViewModelI1 = productReviewFragment2.I1();
                                composer2.o(5004770);
                                boolean zI = composer2.I(productReviewFragment2);
                                Object objG = composer2.G();
                                Object obj5 = Composer.Companion.f1624a;
                                if (zI || objG == obj5) {
                                    objG = new c(productReviewFragment2, 2);
                                    composer2.A(objG);
                                }
                                Function0 function0 = (Function0) objG;
                                composer2.l();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(productReviewFragment2);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == obj5) {
                                    objG2 = new c(productReviewFragment2, 3);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                ProductReviewScreenKt.c(z, pageResult, productReviewViewModelI1, function0, (Function0) objG2, composer2, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -235279940));
        return composeView;
    }
}
