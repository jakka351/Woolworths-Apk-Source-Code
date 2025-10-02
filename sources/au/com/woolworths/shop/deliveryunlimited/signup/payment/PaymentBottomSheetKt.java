package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentFlowTypeData;
import au.com.woolworths.feature.shop.wpay.ui.addcreditcard.AddCreditCardModalKt;
import au.com.woolworths.feature.shop.wpay.ui.wpay.ModalBottomSheetData;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class PaymentBottomSheetKt {
    public static final void a(int i, Composer composer, SheetState sheetState, PaymentContract.ViewState viewState, PaymentViewModel viewModel) {
        int i2;
        Intrinsics.h(viewState, "viewState");
        Intrinsics.h(sheetState, "sheetState");
        Intrinsics.h(viewModel, "viewModel");
        ComposerImpl composerImplV = composer.v(1399926970);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerImplV.n(sheetState) : composerImplV.I(sheetState) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= composerImplV.I(viewModel) ? 256 : 128;
        }
        if ((i2 & 147) == 146 && composerImplV.c()) {
            composerImplV.j();
        } else {
            Object objG = composerImplV.G();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f1624a;
            if (objG == composer$Companion$Empty$1) {
                objG = androidx.camera.core.impl.b.h(composerImplV.y(), composerImplV);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objG;
            ModalBottomSheetData modalBottomSheetData = viewState.d;
            if (modalBottomSheetData instanceof ModalBottomSheetData.AddCreditCard) {
                ModalBottomSheetData.AddCreditCard addCreditCard = (ModalBottomSheetData.AddCreditCard) modalBottomSheetData;
                PaymentFlowTypeData paymentFlowTypeData = PaymentFlowTypeData.e;
                composerImplV.o(-1746271574);
                int i3 = i2 & 112;
                boolean zI = (i3 == 32 || ((i2 & 64) != 0 && composerImplV.I(sheetState))) | composerImplV.I(coroutineScope) | composerImplV.I(viewModel);
                Object objG2 = composerImplV.G();
                if (zI || objG2 == composer$Companion$Empty$1) {
                    objG2 = new a(0, coroutineScope, sheetState, viewModel);
                    composerImplV.A(objG2);
                }
                composerImplV.V(false);
                AddCreditCardModalKt.a(addCreditCard, sheetState, (Function1) objG2, paymentFlowTypeData, null, null, composerImplV, 3072 | i3);
            }
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.feature.shop.trafficdrivers.ui.a(viewState, sheetState, viewModel, i, 21);
        }
    }
}
