package au.com.woolworths.shop.checkout.ui.confirmation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.ViewCompositionStrategy;
import androidx.compose.ui.unit.IntOffset;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.NavArgsLazy;
import au.com.woolworths.android.onesite.extensions.ViewExtKt;
import au.com.woolworths.design.wx.foundation.ThemeKt;
import au.com.woolworths.feature.product.list.v2.ui.d;
import au.com.woolworths.feature.shop.voc.score.VocContract;
import au.com.woolworths.feature.shop.voc.score.VocSurveyCardKt;
import au.com.woolworths.feature.shop.voc.score.VocViewModel;
import au.com.woolworths.shop.checkout.databinding.ActivityOrderConfirmationBinding;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity;
import au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationContract;
import au.com.woolworths.shop.checkout.ui.epoxy.controller.OrderConfirmationEpoxyController;
import au.com.woolworths.shop.checkout.ui.epoxy.decorator.OrderTotalDetailsSpaceItemDecorator;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/shop/checkout/ui/confirmation/OrderConfirmationActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/feature/shop/voc/score/VocContract$ViewState;", "viewState", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class OrderConfirmationActivity extends Hilt_OrderConfirmationActivity {
    public static final /* synthetic */ int D = 0;
    public ActivityResultLauncher A;
    public final NavArgsLazy B;
    public final Lazy C;
    public ActivityOrderConfirmationBinding x;
    public final ViewModelLazy y;
    public final ViewModelLazy z;

    public OrderConfirmationActivity() {
        Function0<ViewModelProvider.Factory> function0 = new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        };
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.y = new ViewModelLazy(reflectionFactory.b(OrderConfirmationViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, function0, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.z = new ViewModelLazy(reflectionFactory.b(VocViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$special$$inlined$viewModels$default$5
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getD();
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$special$$inlined$viewModels$default$4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelProviderFactory();
            }
        }, new Function0<CreationExtras>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$special$$inlined$viewModels$default$6
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return this.h.getDefaultViewModelCreationExtras();
            }
        });
        this.B = new NavArgsLazy(reflectionFactory.b(OrderConfirmationActivityArgs.class), new Function0<Bundle>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$special$$inlined$navArgs$1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                OrderConfirmationActivity orderConfirmationActivity = this.d;
                Intent intent = orderConfirmationActivity.getIntent();
                if (intent == null) {
                    throw new IllegalStateException("Activity " + orderConfirmationActivity + " has a null Intent");
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    return extras;
                }
                throw new IllegalStateException("Activity " + orderConfirmationActivity + " has null extras in " + intent);
            }
        });
        this.C = LazyKt.b(new a(this, 1));
    }

    public final OrderConfirmationViewModel O4() {
        return (OrderConfirmationViewModel) this.y.getD();
    }

    public final VocViewModel P4() {
        return (VocViewModel) this.z.getD();
    }

    @Override // au.com.woolworths.shop.checkout.ui.confirmation.Hilt_OrderConfirmationActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityOrderConfirmationBinding activityOrderConfirmationBinding = (ActivityOrderConfirmationBinding) DataBindingUtil.d(this, R.layout.activity_order_confirmation);
        activityOrderConfirmationBinding.D(this);
        activityOrderConfirmationBinding.O(O4());
        P4();
        EpoxyRecyclerView epoxyRecyclerView = activityOrderConfirmationBinding.A;
        epoxyRecyclerView.setController((OrderConfirmationEpoxyController) this.C.getD());
        Context context = epoxyRecyclerView.getContext();
        Intrinsics.g(context, "getContext(...)");
        epoxyRecyclerView.i(new OrderTotalDetailsSpaceItemDecorator(context));
        setSupportActionBar(activityOrderConfirmationBinding.B);
        FrameLayout footer = activityOrderConfirmationBinding.y;
        Intrinsics.g(footer, "footer");
        ViewExtKt.a(footer);
        this.x = activityOrderConfirmationBinding;
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new OrderConfirmationActivity$collectActions$1(this, null), 3);
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new OrderConfirmationActivity$collectActions$2(this, null), 3);
        P4().j.f(this, new OrderConfirmationActivity$sam$androidx_lifecycle_Observer$0(new b(this, 1)));
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new OrderConfirmationActivity$observeData$1(this, null), 3);
        OrderConfirmationViewModel orderConfirmationViewModelO4 = O4();
        NavArgsLazy navArgsLazy = this.B;
        String orderId = String.valueOf(((OrderConfirmationActivityArgs) navArgsLazy.getD()).f10715a);
        Intrinsics.h(orderId, "orderId");
        orderConfirmationViewModelO4.o = orderId;
        orderConfirmationViewModelO4.q6();
        P4().m = Long.valueOf(((OrderConfirmationActivityArgs) navArgsLazy.getD()).f10715a);
        ActivityOrderConfirmationBinding activityOrderConfirmationBinding2 = this.x;
        if (activityOrderConfirmationBinding2 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        final FrameLayout footer2 = activityOrderConfirmationBinding2.y;
        Intrinsics.g(footer2, "footer");
        final a aVar = new a(this, 0);
        this.A = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: au.com.woolworths.feature.shop.voc.score.a
            @Override // androidx.activity.result.ActivityResultCallback
            public final void a(Object obj) {
                ActivityResult result = (ActivityResult) obj;
                Intrinsics.h(result, "result");
                if (result.d == -1) {
                    aVar.invoke();
                    OrderConfirmationActivity orderConfirmationActivity = this;
                    BuildersKt.c(LifecycleOwnerKt.a(orderConfirmationActivity), null, null, new VocActionHandlerKt$registerForVocFreeTextActivityResult$1$1(orderConfirmationActivity, footer2, null), 3);
                }
            }
        });
        ActivityOrderConfirmationBinding activityOrderConfirmationBinding3 = this.x;
        if (activityOrderConfirmationBinding3 == null) {
            Intrinsics.p("binding");
            throw null;
        }
        ComposeView composeView = activityOrderConfirmationBinding3.C;
        composeView.setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed.f1986a);
        composeView.setContent(new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$onCreate$3$1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = OrderConfirmationActivity.D;
                    final OrderConfirmationActivity orderConfirmationActivity = this.d;
                    final MutableState mutableStateA = FlowExtKt.a(orderConfirmationActivity.P4().k, composer);
                    ThemeKt.b(6, composer, ComposableLambdaKt.c(1784507733, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity$onCreate$3$1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                final State state = mutableStateA;
                                boolean z = ((VocContract.ViewState) state.getD()).f8234a;
                                composer2.o(1849434622);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (objG == composer$Companion$Empty$1) {
                                    objG = new d(4);
                                    composer2.A(objG);
                                }
                                composer2.l();
                                EnterTransition enterTransitionN = EnterExitTransitionKt.n(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG);
                                composer2.o(1849434622);
                                Object objG2 = composer2.G();
                                if (objG2 == composer$Companion$Empty$1) {
                                    objG2 = new d(4);
                                    composer2.A(objG2);
                                }
                                composer2.l();
                                ExitTransition exitTransitionQ = EnterExitTransitionKt.q(AnimationSpecKt.d(BitmapDescriptorFactory.HUE_RED, 400.0f, new IntOffset(VisibilityThresholdsKt.a()), 1), (Function1) objG2);
                                final OrderConfirmationActivity orderConfirmationActivity2 = orderConfirmationActivity;
                                AnimatedVisibilityKt.d(z, null, enterTransitionN, exitTransitionQ, null, ComposableLambdaKt.c(-1174547075, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.checkout.ui.confirmation.OrderConfirmationActivity.onCreate.3.1.1.3
                                    @Override // kotlin.jvm.functions.Function3
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        AnimatedVisibilityScope AnimatedVisibility = (AnimatedVisibilityScope) obj5;
                                        Composer composer3 = (Composer) obj6;
                                        ((Number) obj7).intValue();
                                        Intrinsics.h(AnimatedVisibility, "$this$AnimatedVisibility");
                                        VocContract.ViewState viewState = (VocContract.ViewState) state.getD();
                                        composer3.o(5004770);
                                        OrderConfirmationActivity orderConfirmationActivity3 = orderConfirmationActivity2;
                                        boolean zI = composer3.I(orderConfirmationActivity3);
                                        Object objG3 = composer3.G();
                                        int i2 = 2;
                                        Object obj8 = Composer.Companion.f1624a;
                                        if (zI || objG3 == obj8) {
                                            objG3 = new b(orderConfirmationActivity3, 2);
                                            composer3.A(objG3);
                                        }
                                        Function1 function1 = (Function1) objG3;
                                        composer3.l();
                                        composer3.o(5004770);
                                        boolean zI2 = composer3.I(orderConfirmationActivity3);
                                        Object objG4 = composer3.G();
                                        if (zI2 || objG4 == obj8) {
                                            objG4 = new a(orderConfirmationActivity3, i2);
                                            composer3.A(objG4);
                                        }
                                        Function0 function0 = (Function0) objG4;
                                        composer3.l();
                                        int i3 = OrderConfirmationActivity.D;
                                        Object objP4 = orderConfirmationActivity3.P4();
                                        composer3.o(5004770);
                                        boolean zI3 = composer3.I(objP4);
                                        Object objG5 = composer3.G();
                                        if (zI3 || objG5 == obj8) {
                                            Object orderConfirmationActivity$onCreate$3$1$1$3$3$1 = new OrderConfirmationActivity$onCreate$3$1$1$3$3$1(3, objP4, VocViewModel.class, "onGiveFeedback", "onGiveFeedback(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
                                            composer3.A(orderConfirmationActivity$onCreate$3$1$1$3$3$1);
                                            objG5 = orderConfirmationActivity$onCreate$3$1$1$3$3$1;
                                        }
                                        composer3.l();
                                        Function3 function3 = (Function3) ((KFunction) objG5);
                                        composer3.o(5004770);
                                        boolean zI4 = composer3.I(orderConfirmationActivity3);
                                        Object objG6 = composer3.G();
                                        int i4 = 3;
                                        if (zI4 || objG6 == obj8) {
                                            objG6 = new a(orderConfirmationActivity3, i4);
                                            composer3.A(objG6);
                                        }
                                        Function0 function02 = (Function0) objG6;
                                        composer3.l();
                                        composer3.o(5004770);
                                        boolean zI5 = composer3.I(orderConfirmationActivity3);
                                        Object objG7 = composer3.G();
                                        if (zI5 || objG7 == obj8) {
                                            objG7 = new b(orderConfirmationActivity3, 3);
                                            composer3.A(objG7);
                                        }
                                        composer3.l();
                                        VocContract.ViewState viewState2 = VocContract.ViewState.m;
                                        VocSurveyCardKt.j(viewState, null, function1, function0, function3, function02, (Function1) objG7, composer3, 8, 2);
                                        return Unit.f24250a;
                                    }
                                }, composer2), composer2, 200064, 18);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1766644979));
        OnBackPressedDispatcherKt.a(getF(), this, new b(this, 0), 2);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                O4().k.f(OrderConfirmationContract.Action.NavigateToHome.f10718a);
                Callback.q();
                return true;
            }
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (isFinishing()) {
            P4().A6();
        }
    }
}
