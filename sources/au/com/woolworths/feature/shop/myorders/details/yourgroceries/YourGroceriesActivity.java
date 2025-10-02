package au.com.woolworths.feature.shop.myorders.details.yourgroceries;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.activity.compose.ComponentActivityKt;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AlertDialog;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.featuretoggles.FeatureToggleManager;
import au.com.woolworths.android.onesite.navigation.Activities;
import au.com.woolworths.base.shopapp.navigation.ShopAppNavigator;
import au.com.woolworths.design.core.ui.foundation.CoreThemeKt;
import au.com.woolworths.feature.product.list.b;
import au.com.woolworths.feature.shop.myorders.MyOrdersFeature;
import au.com.woolworths.feature.shop.myorders.details.analytics.MyOrdersScreens;
import au.com.woolworths.feature.shop.myorders.details.help.HelpActionView;
import au.com.woolworths.feature.shop.myorders.details.help.HelpAndSupportActivity;
import au.com.woolworths.feature.shop.myorders.details.help.OrderDetailsHelpActivity;
import au.com.woolworths.feature.shop.myorders.details.ui.compose.yourgroceries.YourGroceriesScreenKt;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesContract;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesViewModel;
import au.com.woolworths.feature.shop.myorders.details.yourgroceries.paymentsummary.YourGroceriesPaymentSummaryActivity;
import com.dynatrace.android.callback.Callback;
import com.woolworths.R;
import dagger.hilt.android.AndroidEntryPoint;
import dagger.hilt.android.lifecycle.HiltViewModelExtensions;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.SharedFlow;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$ViewState;", "viewState", "my-orders_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@AndroidEntryPoint
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class YourGroceriesActivity extends Hilt_YourGroceriesActivity {
    public static final /* synthetic */ int C = 0;
    public final ViewModelLazy A = new ViewModelLazy(Reflection.f24268a.b(YourGroceriesViewModel.class), new Function0<ViewModelStore>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$special$$inlined$assistedViewModels$1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$special$$inlined$assistedViewModels$2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.d.getDefaultViewModelProviderFactory();
        }
    }, new Function0<CreationExtras>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$special$$inlined$assistedViewModels$3
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            CreationExtras defaultViewModelCreationExtras = this.d.getDefaultViewModelCreationExtras();
            final YourGroceriesActivity yourGroceriesActivity = this;
            return HiltViewModelExtensions.a(defaultViewModelCreationExtras, new Function1<YourGroceriesViewModel.Factory, ViewModel>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$special$$inlined$assistedViewModels$3.1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    YourGroceriesViewModel.Factory factory = (YourGroceriesViewModel.Factory) obj;
                    Intent intent = yourGroceriesActivity.getIntent();
                    Activities.OrderDetailsYourGroceries.Extras extras = intent != null ? (Activities.OrderDetailsYourGroceries.Extras) intent.getParcelableExtra("EXTRA_DATA") : null;
                    if (extras != null) {
                        return factory.a(extras.d);
                    }
                    throw new IllegalArgumentException("Extras not provided");
                }
            });
        }
    });
    public final ActivityResultLauncher B = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new b(4));
    public AnalyticsManager x;
    public FeatureToggleManager y;
    public ShopAppNavigator z;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$onCreate$2", f = "YourGroceriesActivity.kt", l = {90}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$onCreate$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Lau/com/woolworths/feature/shop/myorders/details/yourgroceries/YourGroceriesContract$Action;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @DebugMetadata(c = "au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$onCreate$2$1", f = "YourGroceriesActivity.kt", l = {}, m = "invokeSuspend")
        /* renamed from: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity$onCreate$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements Function2<YourGroceriesContract.Action, Continuation<? super Unit>, Object> {
            public /* synthetic */ Object p;

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
                anonymousClass1.p = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((YourGroceriesContract.Action) obj, (Continuation) obj2);
                Unit unit = Unit.f24250a;
                anonymousClass1.invokeSuspend(unit);
                return unit;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
                ResultKt.b(obj);
                YourGroceriesContract.Action action = (YourGroceriesContract.Action) this.p;
                Timber.f27013a.b("Handling your groceries action: " + action, new Object[0]);
                return Unit.f24250a;
            }
        }

        public AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return YourGroceriesActivity.this.new AnonymousClass2(continuation);
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
                int i2 = YourGroceriesActivity.C;
                final YourGroceriesActivity yourGroceriesActivity = YourGroceriesActivity.this;
                FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new AnonymousClass1(2, null), FlowExtKt.a(yourGroceriesActivity.O4().m, yourGroceriesActivity.getD(), Lifecycle.State.h));
                FlowCollector flowCollector = new FlowCollector() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity.onCreate.2.2
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) throws NumberFormatException {
                        YourGroceriesContract.Action action = (YourGroceriesContract.Action) obj2;
                        int i3 = YourGroceriesActivity.C;
                        boolean z = action instanceof YourGroceriesContract.Action.OpenProductDetails;
                        YourGroceriesActivity yourGroceriesActivity2 = yourGroceriesActivity;
                        if (z) {
                            String str = ((YourGroceriesContract.Action.OpenProductDetails) action).f7813a;
                            ShopAppNavigator shopAppNavigator = yourGroceriesActivity2.z;
                            if (shopAppNavigator == null) {
                                Intrinsics.p("shopAppNavigator");
                                throw null;
                            }
                            shopAppNavigator.d(str);
                        } else if (action instanceof YourGroceriesContract.Action.ShowMessageDialog) {
                            YourGroceriesContract.Action.ShowMessageDialog showMessageDialog = (YourGroceriesContract.Action.ShowMessageDialog) action;
                            String str2 = showMessageDialog.f7814a;
                            new AlertDialog.Builder(yourGroceriesActivity2).setTitle(str2).setMessage(showMessageDialog.b).setPositiveButton(R.string.ok, (DialogInterface.OnClickListener) null).setCancelable(true).show();
                        } else if (action instanceof YourGroceriesContract.Action.OpenPaymentSummary) {
                            YourGroceriesPaymentSummaryActivity.Extras extras = new YourGroceriesPaymentSummaryActivity.Extras(((YourGroceriesContract.Action.OpenPaymentSummary) action).f7812a.c);
                            Intent intent = new Intent(yourGroceriesActivity2, (Class<?>) YourGroceriesPaymentSummaryActivity.class);
                            intent.putExtra(".extra_payment_info", extras);
                            yourGroceriesActivity2.B.a(intent, null);
                        } else if (action instanceof YourGroceriesContract.Action.OpenOrderDetailsHelpActivity) {
                            FeatureToggleManager featureToggleManager = yourGroceriesActivity2.y;
                            if (featureToggleManager == null) {
                                Intrinsics.p("featureToggleManager");
                                throw null;
                            }
                            if (featureToggleManager.c(MyOrdersFeature.d)) {
                                int i4 = HelpAndSupportActivity.y;
                                HelpAndSupportActivity.Companion.a(yourGroceriesActivity2, ((YourGroceriesContract.Action.OpenOrderDetailsHelpActivity) action).f7811a, MyOrdersScreens.i);
                            } else {
                                int i5 = OrderDetailsHelpActivity.y;
                                OrderDetailsHelpActivity.Companion.a(yourGroceriesActivity2, ((YourGroceriesContract.Action.OpenOrderDetailsHelpActivity) action).f7811a, MyOrdersScreens.i);
                            }
                        } else if (!(action instanceof YourGroceriesContract.Action.ShowRatingSuccess)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        return Unit.f24250a;
                    }
                };
                this.p = 1;
                if (flowKt__TransformKt$onEach$$inlined$unsafeTransform$1.collect(flowCollector, this) == coroutineSingletons) {
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

    public final YourGroceriesViewModel O4() {
        return (YourGroceriesViewModel) this.A.getD();
    }

    @Override // au.com.woolworths.feature.shop.myorders.details.yourgroceries.Hilt_YourGroceriesActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentActivityKt.a(this, new ComposableLambdaImpl(new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity.onCreate.1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && composer.c()) {
                    composer.j();
                } else {
                    int i = YourGroceriesActivity.C;
                    final YourGroceriesActivity yourGroceriesActivity = YourGroceriesActivity.this;
                    final MutableState mutableStateA = androidx.lifecycle.compose.FlowExtKt.a(yourGroceriesActivity.O4().k, composer);
                    CoreThemeKt.c(6, composer, ComposableLambdaKt.c(898560970, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.feature.shop.myorders.details.yourgroceries.YourGroceriesActivity.onCreate.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            Composer composer2 = (Composer) obj3;
                            if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                                composer2.j();
                            } else {
                                YourGroceriesContract.ViewState viewState = (YourGroceriesContract.ViewState) mutableStateA.getD();
                                int i2 = YourGroceriesActivity.C;
                                YourGroceriesActivity yourGroceriesActivity2 = yourGroceriesActivity;
                                SharedFlow sharedFlow = yourGroceriesActivity2.O4().m;
                                composer2.o(5004770);
                                boolean zI = composer2.I(yourGroceriesActivity2);
                                Object objG = composer2.G();
                                Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                                if (zI || objG == composer$Companion$Empty$1) {
                                    YourGroceriesActivity$onCreate$1$1$1$1 yourGroceriesActivity$onCreate$1$1$1$1 = new YourGroceriesActivity$onCreate$1$1$1$1(0, yourGroceriesActivity2, YourGroceriesActivity.class, "finish", "finish()V", 0);
                                    composer2.A(yourGroceriesActivity$onCreate$1$1$1$1);
                                    objG = yourGroceriesActivity$onCreate$1$1$1$1;
                                }
                                composer2.l();
                                Function0 function0 = (Function0) ((KFunction) objG);
                                YourGroceriesViewModel yourGroceriesViewModelO4 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI2 = composer2.I(yourGroceriesViewModelO4);
                                Object objG2 = composer2.G();
                                if (zI2 || objG2 == composer$Companion$Empty$1) {
                                    YourGroceriesActivity$onCreate$1$1$2$1 yourGroceriesActivity$onCreate$1$1$2$1 = new YourGroceriesActivity$onCreate$1$1$2$1(0, yourGroceriesViewModelO4, YourGroceriesViewModel.class, "onHelpClicked", "onHelpClicked()V", 0);
                                    composer2.A(yourGroceriesActivity$onCreate$1$1$2$1);
                                    objG2 = yourGroceriesActivity$onCreate$1$1$2$1;
                                }
                                composer2.l();
                                Function0 function02 = (Function0) ((KFunction) objG2);
                                YourGroceriesViewModel yourGroceriesViewModelO42 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI3 = composer2.I(yourGroceriesViewModelO42);
                                Object objG3 = composer2.G();
                                if (zI3 || objG3 == composer$Companion$Empty$1) {
                                    YourGroceriesActivity$onCreate$1$1$3$1 yourGroceriesActivity$onCreate$1$1$3$1 = new YourGroceriesActivity$onCreate$1$1$3$1(1, yourGroceriesViewModelO42, YourGroceriesViewModel.class, "onFullfilmentFilterSelected", "onFullfilmentFilterSelected(Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesFilterGroupItem$YourGroceriesFilterItem;)V", 0);
                                    composer2.A(yourGroceriesActivity$onCreate$1$1$3$1);
                                    objG3 = yourGroceriesActivity$onCreate$1$1$3$1;
                                }
                                composer2.l();
                                Function1 function1 = (Function1) ((KFunction) objG3);
                                YourGroceriesViewModel yourGroceriesViewModelO43 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI4 = composer2.I(yourGroceriesViewModelO43);
                                Object objG4 = composer2.G();
                                if (zI4 || objG4 == composer$Companion$Empty$1) {
                                    YourGroceriesActivity$onCreate$1$1$4$1 yourGroceriesActivity$onCreate$1$1$4$1 = new YourGroceriesActivity$onCreate$1$1$4$1(1, yourGroceriesViewModelO43, YourGroceriesViewModel.class, "onFulfillmentStatusClicked", "onFulfillmentStatusClicked(Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesFullfilmentStatusItem;)V", 0);
                                    composer2.A(yourGroceriesActivity$onCreate$1$1$4$1);
                                    objG4 = yourGroceriesActivity$onCreate$1$1$4$1;
                                }
                                composer2.l();
                                Function1 function12 = (Function1) ((KFunction) objG4);
                                YourGroceriesViewModel yourGroceriesViewModelO44 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI5 = composer2.I(yourGroceriesViewModelO44);
                                Object objG5 = composer2.G();
                                if (zI5 || objG5 == composer$Companion$Empty$1) {
                                    YourGroceriesActivity$onCreate$1$1$5$1 yourGroceriesActivity$onCreate$1$1$5$1 = new YourGroceriesActivity$onCreate$1$1$5$1(1, yourGroceriesViewModelO44, YourGroceriesViewModel.class, "onOpenProductDetails", "onOpenProductDetails(Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesProductItem;)V", 0);
                                    composer2.A(yourGroceriesActivity$onCreate$1$1$5$1);
                                    objG5 = yourGroceriesActivity$onCreate$1$1$5$1;
                                }
                                composer2.l();
                                Function1 function13 = (Function1) ((KFunction) objG5);
                                YourGroceriesViewModel yourGroceriesViewModelO45 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI6 = composer2.I(yourGroceriesViewModelO45);
                                Object objG6 = composer2.G();
                                if (zI6 || objG6 == composer$Companion$Empty$1) {
                                    objG6 = new YourGroceriesActivity$onCreate$1$1$6$1(1, yourGroceriesViewModelO45, YourGroceriesViewModel.class, "onOpenProductDetails", "onOpenProductDetails(Lau/com/woolworths/feature/shop/myorders/details/epoxy/YourGroceriesSubstitutedProduct;)V", 0);
                                    composer2.A(objG6);
                                }
                                composer2.l();
                                Function1 function14 = (Function1) ((KFunction) objG6);
                                YourGroceriesViewModel yourGroceriesViewModelO46 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI7 = composer2.I(yourGroceriesViewModelO46);
                                Object objG7 = composer2.G();
                                if (zI7 || objG7 == composer$Companion$Empty$1) {
                                    objG7 = new YourGroceriesActivity$onCreate$1$1$7$1(0, yourGroceriesViewModelO46, YourGroceriesViewModel.class, "fetchYourGroceries", "fetchYourGroceries()Lkotlinx/coroutines/Job;", 8);
                                    composer2.A(objG7);
                                }
                                Function0 function03 = (Function0) objG7;
                                composer2.l();
                                YourGroceriesViewModel yourGroceriesViewModelO47 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI8 = composer2.I(yourGroceriesViewModelO47);
                                Object objG8 = composer2.G();
                                if (zI8 || objG8 == composer$Companion$Empty$1) {
                                    YourGroceriesActivity$onCreate$1$1$8$1 yourGroceriesActivity$onCreate$1$1$8$1 = new YourGroceriesActivity$onCreate$1$1$8$1(0, yourGroceriesViewModelO47, YourGroceriesViewModel.class, "onBottomSheetArrowClicked", "onBottomSheetArrowClicked()V", 0);
                                    composer2.A(yourGroceriesActivity$onCreate$1$1$8$1);
                                    objG8 = yourGroceriesActivity$onCreate$1$1$8$1;
                                }
                                composer2.l();
                                Function0 function04 = (Function0) ((KFunction) objG8);
                                YourGroceriesViewModel yourGroceriesViewModelO48 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI9 = composer2.I(yourGroceriesViewModelO48);
                                Object objG9 = composer2.G();
                                if (zI9 || objG9 == composer$Companion$Empty$1) {
                                    YourGroceriesActivity$onCreate$1$1$9$1 yourGroceriesActivity$onCreate$1$1$9$1 = new YourGroceriesActivity$onCreate$1$1$9$1(2, yourGroceriesViewModelO48, YourGroceriesViewModel.class, "rateSubstitution", "rateSubstitution(Ljava/lang/String;Z)V", 0);
                                    composer2.A(yourGroceriesActivity$onCreate$1$1$9$1);
                                    objG9 = yourGroceriesActivity$onCreate$1$1$9$1;
                                }
                                composer2.l();
                                Function2 function2 = (Function2) ((KFunction) objG9);
                                YourGroceriesViewModel yourGroceriesViewModelO49 = yourGroceriesActivity2.O4();
                                composer2.o(5004770);
                                boolean zI10 = composer2.I(yourGroceriesViewModelO49);
                                Object objG10 = composer2.G();
                                if (zI10 || objG10 == composer$Companion$Empty$1) {
                                    objG10 = new YourGroceriesActivity$onCreate$1$1$10$1(0, yourGroceriesViewModelO49, YourGroceriesViewModel.class, "trackUnhappySubstitutionBannerShow", "trackUnhappySubstitutionBannerShow()V", 0);
                                    composer2.A(objG10);
                                }
                                composer2.l();
                                YourGroceriesScreenKt.a(viewState, sharedFlow, function0, function02, function1, function12, function13, function14, function03, function04, function2, (Function0) ((KFunction) objG10), composer2, 0, 0);
                            }
                            return Unit.f24250a;
                        }
                    }, composer));
                }
                return Unit.f24250a;
            }
        }, true, -1815921298));
        O4().r6();
        BuildersKt.c(LifecycleOwnerKt.a(this), null, null, new AnonymousClass2(null), 3);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        Intrinsics.h(menu, "menu");
        getMenuInflater().inflate(R.menu.menu_help, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.action_help);
        View actionView = menuItemFindItem != null ? menuItemFindItem.getActionView() : null;
        Intrinsics.f(actionView, "null cannot be cast to non-null type au.com.woolworths.feature.shop.myorders.details.help.HelpActionView");
        ((HelpActionView) actionView).setClickHandler(O4());
        return true;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.p(item);
        try {
            Intrinsics.h(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.q();
            return zOnOptionsItemSelected;
        } catch (Throwable th) {
            Callback.q();
            throw th;
        }
    }
}
