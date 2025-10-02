package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import android.content.Context;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PersistentCompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.lifecycle.compose.FlowExtKt;
import au.com.woolworths.design.core.ui.component.experimental.dialog.AlertDialogKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetStateKt;
import au.com.woolworths.design.core.ui.component.experimental.topbar.TopNavBarKt;
import au.com.woolworths.design.core.ui.component.stable.ScaffoldKt;
import au.com.woolworths.design.core.ui.component.stable.iconbutton.IconButtonKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostKt;
import au.com.woolworths.design.core.ui.component.stable.snackbar.SnackbarHostState;
import au.com.woolworths.design.core.ui.foundation.CoreTheme;
import au.com.woolworths.feature.shop.wpay.domain.model.PageResult;
import au.com.woolworths.feature.shop.wpay.ui.common.component.LoadingScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.component.WappleLoadingScreenKt;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.feature.shop.wpay.ui.wpay.AlertDialogData;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CreditCardActions;
import au.com.woolworths.feature.shop.wpay.ui.wpay.CvvActions;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.flow.Flow;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0010\u0010\u0001\u001a\u0004\u0018\u00010\u00008\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroid/webkit/WebView;", "webView", "Lau/com/woolworths/shop/deliveryunlimited/signup/payment/PaymentContract$ViewState;", "viewState", "shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PaymentScreenKt {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        static {
            int[] iArr = new int[LoadingState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LoadingState loadingState = LoadingState.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                LoadingState loadingState2 = LoadingState.d;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final void a(PaymentViewModel paymentViewModel, Composer composer, final int i) {
        final PaymentViewModel paymentViewModel2;
        boolean z;
        Object obj;
        Object paymentScreenKt$PaymentScreen$4$1;
        final PaymentViewModel viewModel = paymentViewModel;
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(-798663298);
        int i2 = i | (composerImplV.I(viewModel) ? 4 : 2);
        if ((i2 & 3) == 2 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Context context = (Context) composerImplV.x(AndroidCompositionLocals_androidKt.b);
            composerImplV.o(1849434622);
            Object objG = composerImplV.G();
            Object obj2 = Composer.Companion.f1624a;
            if (objG == obj2) {
                objG = new SnackbarHostState();
                composerImplV.A(objG);
            }
            final SnackbarHostState snackbarHostState = (SnackbarHostState) objG;
            Object objD = au.com.woolworths.android.onesite.a.d(1849434622, composerImplV, false);
            if (objD == obj2) {
                objD = SnapshotStateKt.f(null);
                composerImplV.A(objD);
            }
            final MutableState mutableState = (MutableState) objD;
            composerImplV.V(false);
            Flow flow = viewModel.n;
            composerImplV.o(-1224400529);
            boolean zI = composerImplV.I(viewModel) | composerImplV.I(context);
            Object objG2 = composerImplV.G();
            if (zI || objG2 == obj2) {
                PaymentScreenKt$PaymentScreen$1$1 paymentScreenKt$PaymentScreen$1$1 = new PaymentScreenKt$PaymentScreen$1$1(viewModel, context, snackbarHostState, mutableState, null);
                composerImplV.A(paymentScreenKt$PaymentScreen$1$1);
                objG2 = paymentScreenKt$PaymentScreen$1$1;
            }
            composerImplV.V(false);
            EffectsKt.e(composerImplV, flow, (Function2) objG2);
            final MutableState mutableStateA = FlowExtKt.a(viewModel.l, composerImplV);
            ScaffoldKt.a(null, ComposableLambdaKt.c(-1308445118, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentScreenKt$PaymentScreen$2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    Composer composer2 = (Composer) obj3;
                    if ((((Number) obj4).intValue() & 3) == 2 && composer2.c()) {
                        composer2.j();
                    } else {
                        String strC = StringResources_androidKt.c(composer2, R.string.delivery_unlimited_sign_up_confirm_subscription_page_title);
                        final PaymentViewModel paymentViewModel3 = viewModel;
                        TopNavBarKt.a(strC, null, 0L, 0L, 0L, null, null, ComposableLambdaKt.c(-693099084, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentScreenKt$PaymentScreen$2.1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                Composer composer3 = (Composer) obj5;
                                if ((((Number) obj6).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    ImageVector imageVector = CoreTheme.e(composer3).e.b;
                                    composer3.o(5004770);
                                    PaymentViewModel paymentViewModel4 = paymentViewModel3;
                                    boolean zI2 = composer3.I(paymentViewModel4);
                                    Object objG3 = composer3.G();
                                    if (zI2 || objG3 == Composer.Companion.f1624a) {
                                        PaymentScreenKt$PaymentScreen$2$1$1$1 paymentScreenKt$PaymentScreen$2$1$1$1 = new PaymentScreenKt$PaymentScreen$2$1$1$1(0, paymentViewModel4, PaymentViewModel.class, "onDismiss", "onDismiss()V", 0);
                                        composer3.A(paymentScreenKt$PaymentScreen$2$1$1$1);
                                        objG3 = paymentScreenKt$PaymentScreen$2$1$1$1;
                                    }
                                    composer3.l();
                                    IconButtonKt.c(imageVector, "", (Function0) ((KFunction) objG3), null, false, null, 0L, composer3, 48, 120);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), null, composer2, 100663296, 766);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), null, null, 0L, null, ComposableLambdaKt.c(-1123298805, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentScreenKt$PaymentScreen$3
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    PaddingValues paddingValues = (PaddingValues) obj3;
                    Composer composer2 = (Composer) obj4;
                    int iIntValue = ((Number) obj5).intValue();
                    Intrinsics.h(paddingValues, "paddingValues");
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= composer2.n(paddingValues) ? 4 : 2;
                    }
                    if ((iIntValue & 19) == 18 && composer2.c()) {
                        composer2.j();
                    } else {
                        Modifier modifierE = PaddingKt.e(Modifier.Companion.d, paddingValues);
                        MeasurePolicy measurePolicyD = BoxKt.d(Alignment.Companion.f1719a, false);
                        int p = composer2.getP();
                        PersistentCompositionLocalMap persistentCompositionLocalMapD = composer2.d();
                        Modifier modifierD = ComposedModifierKt.d(composer2, modifierE);
                        ComposeUiNode.e3.getClass();
                        Function0 function0 = ComposeUiNode.Companion.b;
                        if (composer2.w() == null) {
                            ComposablesKt.b();
                            throw null;
                        }
                        composer2.i();
                        if (composer2.getO()) {
                            composer2.K(function0);
                        } else {
                            composer2.e();
                        }
                        Updater.b(composer2, measurePolicyD, ComposeUiNode.Companion.g);
                        Updater.b(composer2, persistentCompositionLocalMapD, ComposeUiNode.Companion.f);
                        Function2 function2 = ComposeUiNode.Companion.j;
                        if (composer2.getO() || !Intrinsics.c(composer2.G(), Integer.valueOf(p))) {
                            androidx.camera.core.impl.b.z(p, composer2, p, function2);
                        }
                        Updater.b(composer2, modifierD, ComposeUiNode.Companion.d);
                        final String strC = StringResources_androidKt.c(composer2, R.string.checkout_payment_unable_to_retrieve_cvv);
                        State state = mutableStateA;
                        PageResult pageResult = ((PaymentContract.ViewState) state.getD()).b;
                        String str = ((PaymentContract.ViewState) state.getD()).c;
                        boolean z2 = ((PaymentContract.ViewState) state.getD()).e;
                        String str2 = ((PaymentContract.ViewState) state.getD()).f;
                        String str3 = ((PaymentContract.ViewState) state.getD()).i;
                        composer2.o(5004770);
                        final PaymentViewModel paymentViewModel3 = viewModel;
                        boolean zI2 = composer2.I(paymentViewModel3);
                        Object objG3 = composer2.G();
                        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
                        if (zI2 || objG3 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$1$1 paymentScreenKt$PaymentScreen$3$1$1$1 = new PaymentScreenKt$PaymentScreen$3$1$1$1(1, paymentViewModel3, PaymentViewModel.class, "onAddCreditCard", "onAddCreditCard(Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Add;)V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$1$1);
                            objG3 = paymentScreenKt$PaymentScreen$3$1$1$1;
                        }
                        composer2.l();
                        Function1 function1 = (Function1) ((KFunction) objG3);
                        composer2.o(5004770);
                        boolean zI3 = composer2.I(paymentViewModel3);
                        Object objG4 = composer2.G();
                        if (zI3 || objG4 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$2$1 paymentScreenKt$PaymentScreen$3$1$2$1 = new PaymentScreenKt$PaymentScreen$3$1$2$1(2, paymentViewModel3, PaymentViewModel.class, "onDeleteCreditCard", "onDeleteCreditCard(Ljava/lang/String;Z)V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$2$1);
                            objG4 = paymentScreenKt$PaymentScreen$3$1$2$1;
                        }
                        composer2.l();
                        Function2 function22 = (Function2) ((KFunction) objG4);
                        composer2.o(5004770);
                        boolean zI4 = composer2.I(paymentViewModel3);
                        Object objG5 = composer2.G();
                        if (zI4 || objG5 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$3$1 paymentScreenKt$PaymentScreen$3$1$3$1 = new PaymentScreenKt$PaymentScreen$3$1$3$1(2, paymentViewModel3, PaymentViewModel.class, "onToggleSelectPaymentMethod", "onToggleSelectPaymentMethod(Ljava/lang/String;Z)V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$3$1);
                            objG5 = paymentScreenKt$PaymentScreen$3$1$3$1;
                        }
                        composer2.l();
                        CreditCardActions creditCardActions = new CreditCardActions(function1, function22, (Function2) ((KFunction) objG5));
                        composer2.o(5004770);
                        Object objG6 = composer2.G();
                        if (objG6 == composer$Companion$Empty$1) {
                            objG6 = new au.com.woolworths.feature.rewards.everydayextras.signup.compose.chooseplan.ui.b(mutableState, 25);
                            composer2.A(objG6);
                        }
                        Function1 function12 = (Function1) objG6;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI5 = composer2.I(paymentViewModel3);
                        Object objG7 = composer2.G();
                        if (zI5 || objG7 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$5$1 paymentScreenKt$PaymentScreen$3$1$5$1 = new PaymentScreenKt$PaymentScreen$3$1$5$1(0, paymentViewModel3, PaymentViewModel.class, "onCvvLoaded", "onCvvLoaded()V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$5$1);
                            objG7 = paymentScreenKt$PaymentScreen$3$1$5$1;
                        }
                        composer2.l();
                        Function0 function02 = (Function0) ((KFunction) objG7);
                        composer2.o(-1633490746);
                        boolean zI6 = composer2.I(paymentViewModel3) | composer2.n(strC);
                        Object objG8 = composer2.G();
                        if (zI6 || objG8 == composer$Companion$Empty$1) {
                            objG8 = new Function2() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.g
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj6, Object obj7) {
                                    paymentViewModel3.s6((String) obj6, (String) obj7, strC);
                                    return Unit.f24250a;
                                }
                            };
                            composer2.A(objG8);
                        }
                        Function2 function23 = (Function2) objG8;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI7 = composer2.I(paymentViewModel3);
                        Object objG9 = composer2.G();
                        if (zI7 || objG9 == composer$Companion$Empty$1) {
                            objG9 = new PaymentScreenKt$PaymentScreen$3$1$7$1(0, paymentViewModel3, PaymentViewModel.class, "onCvvLoadTryAgain", "onCvvLoadTryAgain()V", 0);
                            composer2.A(objG9);
                        }
                        composer2.l();
                        Function0 function03 = (Function0) ((KFunction) objG9);
                        composer2.o(5004770);
                        boolean zI8 = composer2.I(paymentViewModel3);
                        Object objG10 = composer2.G();
                        if (zI8 || objG10 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$8$1 paymentScreenKt$PaymentScreen$3$1$8$1 = new PaymentScreenKt$PaymentScreen$3$1$8$1(2, paymentViewModel3, PaymentViewModel.class, "onCvvPostMessage", "onCvvPostMessage(Ljava/lang/String;I)V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$8$1);
                            objG10 = paymentScreenKt$PaymentScreen$3$1$8$1;
                        }
                        composer2.l();
                        CvvActions cvvActions = new CvvActions(function12, function02, function23, function03, (Function2) ((KFunction) objG10));
                        composer2.o(5004770);
                        boolean zI9 = composer2.I(paymentViewModel3);
                        Object objG11 = composer2.G();
                        if (zI9 || objG11 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$9$1 paymentScreenKt$PaymentScreen$3$1$9$1 = new PaymentScreenKt$PaymentScreen$3$1$9$1(0, paymentViewModel3, PaymentViewModel.class, "fetchDeliveryUnlimitedPayment", "fetchDeliveryUnlimitedPayment(Lau/com/woolworths/feature/shop/wpay/ui/common/model/LoadingState;Lau/com/woolworths/feature/shop/wpay/ui/common/model/ErrorState;Ljava/lang/String;)V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$9$1);
                            objG11 = paymentScreenKt$PaymentScreen$3$1$9$1;
                        }
                        Function0 function04 = (Function0) objG11;
                        composer2.l();
                        composer2.o(5004770);
                        boolean zI10 = composer2.I(paymentViewModel3);
                        Object objG12 = composer2.G();
                        if (zI10 || objG12 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$10$1 paymentScreenKt$PaymentScreen$3$1$10$1 = new PaymentScreenKt$PaymentScreen$3$1$10$1(0, paymentViewModel3, PaymentViewModel.class, "onSubscribeClick", "onSubscribeClick()V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$10$1);
                            objG12 = paymentScreenKt$PaymentScreen$3$1$10$1;
                        }
                        composer2.l();
                        Function0 function05 = (Function0) ((KFunction) objG12);
                        composer2.o(5004770);
                        boolean zI11 = composer2.I(paymentViewModel3);
                        Object objG13 = composer2.G();
                        if (zI11 || objG13 == composer$Companion$Empty$1) {
                            PaymentScreenKt$PaymentScreen$3$1$11$1 paymentScreenKt$PaymentScreen$3$1$11$1 = new PaymentScreenKt$PaymentScreen$3$1$11$1(1, paymentViewModel3, PaymentViewModel.class, "onAddCreditCard", "onAddCreditCard(Lau/com/woolworths/feature/shop/wpay/domain/model/payment/PaymentMethodItem$CreditCard$Add;)V", 0);
                            composer2.A(paymentScreenKt$PaymentScreen$3$1$11$1);
                            objG13 = paymentScreenKt$PaymentScreen$3$1$11$1;
                        }
                        composer2.l();
                        final SnackbarHostState snackbarHostState2 = snackbarHostState;
                        PaymentContentKt.d(pageResult, str, z2, str2, str3, creditCardActions, cvvActions, function04, function05, (Function1) ((KFunction) objG13), null, ComposableLambdaKt.c(-1620833075, new Function2<Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentScreenKt$PaymentScreen$3$1$12
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj6, Object obj7) {
                                Composer composer3 = (Composer) obj6;
                                if ((((Number) obj7).intValue() & 3) == 2 && composer3.c()) {
                                    composer3.j();
                                } else {
                                    SnackbarHostKt.b(snackbarHostState2, BoxScopeInstance.f944a.g(Modifier.Companion.d, Alignment.Companion.h), composer3, 6, 0);
                                }
                                return Unit.f24250a;
                            }
                        }, composer2), composer2, 0);
                        composer2.f();
                    }
                    return Unit.f24250a;
                }
            }, composerImplV), composerImplV, 12582960, 125);
            composerImplV = composerImplV;
            SheetState sheetStateA = SheetStateKt.a(6, 0, composerImplV);
            TermsBottomSheetKt.a(i2 & 14, composerImplV, sheetStateA, (PaymentContract.ViewState) mutableStateA.getD(), viewModel);
            int iOrdinal = ((PaymentContract.ViewState) mutableStateA.getD()).f10891a.ordinal();
            if (iOrdinal == 0) {
                paymentViewModel2 = viewModel;
                z = false;
                obj = obj2;
                composerImplV.o(1144415682);
                composerImplV.V(false);
            } else if (iOrdinal == 1) {
                composerImplV.o(1283844247);
                obj = obj2;
                z = false;
                paymentViewModel2 = paymentViewModel;
                LoadingScreenKt.a(null, Color.b(CoreTheme.b(composerImplV).e.f4848a.d, 0.5f), composerImplV, 0, 1);
                composerImplV.V(false);
            } else {
                if (iOrdinal != 2) {
                    throw au.com.woolworths.android.onesite.a.w(1283840928, composerImplV, false);
                }
                composerImplV.o(1283848083);
                WappleLoadingScreenKt.a(0, 1, composerImplV, null);
                composerImplV.V(false);
                paymentViewModel2 = viewModel;
                z = false;
                obj = obj2;
            }
            PaymentBottomSheetKt.a((i2 << 6) & 896, composerImplV, sheetStateA, (PaymentContract.ViewState) mutableStateA.getD(), paymentViewModel2);
            AlertDialogData alertDialogData = ((PaymentContract.ViewState) mutableStateA.getD()).g;
            if (alertDialogData == null) {
                RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
                if (recomposeScopeImplX != null) {
                    final int i3 = 0;
                    recomposeScopeImplX.d = new Function2(paymentViewModel2, i, i3) { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.e
                        public final /* synthetic */ int d;
                        public final /* synthetic */ PaymentViewModel e;

                        {
                            this.d = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            int i4 = this.d;
                            Composer composer2 = (Composer) obj3;
                            ((Integer) obj4).getClass();
                            switch (i4) {
                                case 0:
                                    PaymentScreenKt.a(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                                default:
                                    PaymentScreenKt.a(this.e, composer2, RecomposeScopeImplKt.a(1));
                                    break;
                            }
                            return Unit.f24250a;
                        }
                    };
                    return;
                }
                return;
            }
            if (alertDialogData instanceof AlertDialogData.DeleteCreditCard) {
                String strC = StringResources_androidKt.c(composerImplV, R.string.checkout_payment_delete_credit_card_dialog_title);
                String strC2 = StringResources_androidKt.c(composerImplV, R.string.checkout_payment_delete_credit_card_dialog_msg);
                String strC3 = StringResources_androidKt.c(composerImplV, R.string.checkout_payment_delete_credit_card_dialog_button_confirm);
                String strC4 = StringResources_androidKt.c(composerImplV, R.string.checkout_payment_delete_credit_card_dialog_button_dismiss);
                composerImplV.o(5004770);
                boolean zI2 = composerImplV.I(paymentViewModel2);
                Object objG3 = composerImplV.G();
                if (zI2 || objG3 == obj) {
                    PaymentViewModel paymentViewModel3 = paymentViewModel2;
                    paymentScreenKt$PaymentScreen$4$1 = new PaymentScreenKt$PaymentScreen$4$1(0, paymentViewModel3, PaymentViewModel.class, "onDismissAlertDialog", "onDismissAlertDialog()V", 0);
                    viewModel = paymentViewModel3;
                    composerImplV.A(paymentScreenKt$PaymentScreen$4$1);
                } else {
                    paymentScreenKt$PaymentScreen$4$1 = objG3;
                    viewModel = paymentViewModel2;
                }
                KFunction kFunction = (KFunction) paymentScreenKt$PaymentScreen$4$1;
                composerImplV.V(z);
                composerImplV.o(-1633490746);
                boolean zI3 = composerImplV.I(viewModel) | composerImplV.I(alertDialogData);
                Object objG4 = composerImplV.G();
                if (zI3 || objG4 == obj) {
                    objG4 = new f(0, viewModel, alertDialogData);
                    composerImplV.A(objG4);
                }
                composerImplV.V(z);
                AlertDialogKt.a(strC2, strC4, null, strC, strC3, (Function0) objG4, (Function0) kFunction, composerImplV, 0, 4);
            } else {
                viewModel = paymentViewModel2;
            }
        }
        RecomposeScopeImpl recomposeScopeImplX2 = composerImplV.X();
        if (recomposeScopeImplX2 != null) {
            final int i4 = 1;
            recomposeScopeImplX2.d = new Function2(viewModel, i, i4) { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.e
                public final /* synthetic */ int d;
                public final /* synthetic */ PaymentViewModel e;

                {
                    this.d = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    int i42 = this.d;
                    Composer composer2 = (Composer) obj3;
                    ((Integer) obj4).getClass();
                    switch (i42) {
                        case 0:
                            PaymentScreenKt.a(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                        default:
                            PaymentScreenKt.a(this.e, composer2, RecomposeScopeImplKt.a(1));
                            break;
                    }
                    return Unit.f24250a;
                }
            };
        }
    }
}
