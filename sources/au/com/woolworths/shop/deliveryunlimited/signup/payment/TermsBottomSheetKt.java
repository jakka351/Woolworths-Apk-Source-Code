package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.RecomposeScopeImplKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobSupport;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class TermsBottomSheetKt {
    public static final void a(final int i, Composer composer, final SheetState sheetState, final PaymentContract.ViewState viewState, PaymentViewModel viewModel) {
        ComposerImpl composerImpl;
        final PaymentViewModel paymentViewModel;
        boolean z;
        Object termsBottomSheetKt$TermsBottomSheet$3$1;
        final PaymentViewModel paymentViewModel2;
        Intrinsics.h(viewModel, "viewModel");
        Intrinsics.h(viewState, "viewState");
        ComposerImpl composerImplV = composer.v(-1486052606);
        int i2 = (composerImplV.I(viewModel) ? 4 : 2) | i | (composerImplV.I(viewState) ? 32 : 16) | (composerImplV.n(sheetState) ? 256 : 128);
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
            composerImpl = composerImplV;
            paymentViewModel = viewModel;
        } else {
            composerImplV.u0();
            if ((i & 1) != 0 && !composerImplV.c0()) {
                composerImplV.j();
            }
            composerImplV.W();
            Object objG = composerImplV.G();
            Object obj = Composer.Companion.f1624a;
            if (objG == obj) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) objG;
            TermsBottomSheetData termsBottomSheetData = viewState.h;
            if (termsBottomSheetData instanceof TermsBottomSheetData.Terms) {
                TermsBottomSheetData.Terms terms = (TermsBottomSheetData.Terms) termsBottomSheetData;
                boolean z2 = viewState.f10891a != LoadingState.d;
                composerImplV.o(5004770);
                boolean zI = composerImplV.I(viewModel);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == obj) {
                    z = false;
                    Object termsBottomSheetKt$TermsBottomSheet$1$1 = new TermsBottomSheetKt$TermsBottomSheet$1$1(2, viewModel, PaymentViewModel.class, "onTermsChecked", "onTermsChecked(Lau/com/woolworths/shop/deliveryunlimited/signup/confirmsubscription/terms/TermItemUiModel;Z)V", 0);
                    composerImplV.A(termsBottomSheetKt$TermsBottomSheet$1$1);
                    objG2 = termsBottomSheetKt$TermsBottomSheet$1$1;
                } else {
                    z = false;
                }
                composerImplV.V(z);
                Function2 function2 = (Function2) ((KFunction) objG2);
                composerImplV.o(5004770);
                boolean zI2 = composerImplV.I(viewModel);
                Object objG3 = composerImplV.G();
                if (zI2 || objG3 == obj) {
                    Object termsBottomSheetKt$TermsBottomSheet$2$1 = new TermsBottomSheetKt$TermsBottomSheet$2$1(1, viewModel, PaymentViewModel.class, "onLinkClicked", "onLinkClicked(Lau/com/woolworths/shop/deliveryunlimited/signup/data/DeliveryUnlimitedSubscribeLink;)V", 0);
                    composerImplV.A(termsBottomSheetKt$TermsBottomSheet$2$1);
                    objG3 = termsBottomSheetKt$TermsBottomSheet$2$1;
                }
                composerImplV.V(z);
                Function1 function1 = (Function1) ((KFunction) objG3);
                composerImplV.o(5004770);
                boolean zI3 = composerImplV.I(viewModel);
                Object objG4 = composerImplV.G();
                if (zI3 || objG4 == obj) {
                    termsBottomSheetKt$TermsBottomSheet$3$1 = new TermsBottomSheetKt$TermsBottomSheet$3$1(1, viewModel, PaymentViewModel.class, "onTermsSubmitted", "onTermsSubmitted(Lau/com/woolworths/shop/deliveryunlimited/signup/payment/TermsBottomSheetData$Terms;)V", 0);
                    paymentViewModel2 = viewModel;
                    composerImplV.A(termsBottomSheetKt$TermsBottomSheet$3$1);
                } else {
                    termsBottomSheetKt$TermsBottomSheet$3$1 = objG4;
                    paymentViewModel2 = viewModel;
                }
                composerImplV.V(z);
                Function1 function12 = (Function1) ((KFunction) termsBottomSheetKt$TermsBottomSheet$3$1);
                composerImplV.o(-1746271574);
                int i3 = i2 & 896;
                boolean zI4 = composerImplV.I(coroutineScope) | ((((i3 ^ KyberEngine.KyberPolyBytes) <= 256 || !composerImplV.I(sheetState)) && (i2 & KyberEngine.KyberPolyBytes) != 256) ? z : true) | composerImplV.I(paymentViewModel2);
                Object objG5 = composerImplV.G();
                if (zI4 || objG5 == obj) {
                    objG5 = new Function0() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.h
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ((JobSupport) BuildersKt.c(coroutineScope, null, null, new TermsBottomSheetKt$TermsBottomSheet$4$1$1(sheetState, null), 3)).invokeOnCompletion(new au.com.woolworths.product.details.d(paymentViewModel2, 27));
                            return Unit.f24250a;
                        }
                    };
                    composerImplV.A(objG5);
                }
                composerImplV.V(z);
                composerImpl = composerImplV;
                paymentViewModel = paymentViewModel2;
                TermsModalKt.a(terms, z2, sheetState, function2, function1, function12, (Function0) objG5, null, composerImpl, i3);
            } else {
                composerImpl = composerImplV;
                paymentViewModel = viewModel;
                if (termsBottomSheetData != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImpl.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new Function2(viewState, sheetState, i) { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.i
                public final /* synthetic */ PaymentContract.ViewState e;
                public final /* synthetic */ SheetState f;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    TermsBottomSheetKt.a(RecomposeScopeImplKt.a(1), (Composer) obj2, this.f, this.e, this.d);
                    return Unit.f24250a;
                }
            };
        }
    }
}
