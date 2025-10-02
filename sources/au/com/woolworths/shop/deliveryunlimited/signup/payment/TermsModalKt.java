package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.DragHandleBehaviour;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.ModalBottomSheetKt;
import au.com.woolworths.design.core.ui.component.experimental.modalbottomsheet.SheetState;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsBottomSheetData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-delivery-unlimited-sign-up_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TermsModalKt {
    public static final void a(final TermsBottomSheetData.Terms bottomSheetData, final boolean z, SheetState sheetState, final Function2 onTermsChecked, final Function1 onLinkClicked, final Function1 onTermsSubmitted, Function0 onDismissModal, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        Intrinsics.h(bottomSheetData, "bottomSheetData");
        Intrinsics.h(sheetState, "sheetState");
        Intrinsics.h(onTermsChecked, "onTermsChecked");
        Intrinsics.h(onLinkClicked, "onLinkClicked");
        Intrinsics.h(onTermsSubmitted, "onTermsSubmitted");
        Intrinsics.h(onDismissModal, "onDismissModal");
        ComposerImpl composerImplV = composer.v(1136896630);
        if ((i & 6) == 0) {
            i2 = (composerImplV.I(bottomSheetData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerImplV.p(z) ? 32 : 16;
        }
        if ((i & KyberEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? composerImplV.n(sheetState) : composerImplV.I(sheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerImplV.I(onTermsChecked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerImplV.I(onLinkClicked) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerImplV.I(onTermsSubmitted) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerImplV.I(onDismissModal) ? 1048576 : 524288;
        }
        int i3 = i2 | 12582912;
        if ((4793491 & i3) == 4793490 && composerImplV.c()) {
            composerImplV.j();
            modifier2 = modifier;
        } else {
            DragHandleBehaviour dragHandleBehaviour = DragHandleBehaviour.e;
            ComposableLambdaImpl composableLambdaImplC = ComposableLambdaKt.c(361665387, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: au.com.woolworths.shop.deliveryunlimited.signup.payment.TermsModalKt$TermsModal$1
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ColumnScope ModalBottomSheet = (ColumnScope) obj;
                    Composer composer2 = (Composer) obj2;
                    int iIntValue = ((Number) obj3).intValue();
                    Intrinsics.h(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((iIntValue & 17) == 16 && composer2.c()) {
                        composer2.j();
                    } else {
                        TermsContentKt.a(bottomSheetData, onTermsChecked, onLinkClicked, onTermsSubmitted, z, composer2, 0);
                    }
                    return Unit.f24250a;
                }
            }, composerImplV);
            int i4 = i3 >> 18;
            int i5 = (i4 & 112) | (i4 & 14) | 12607488 | (i3 & 896);
            Modifier.Companion companion = Modifier.Companion.d;
            ModalBottomSheetKt.a(onDismissModal, companion, sheetState, null, dragHandleBehaviour, 0L, 0L, composableLambdaImplC, composerImplV, i5, 104);
            modifier2 = companion;
        }
        RecomposeScopeImpl recomposeScopeImplX = composerImplV.X();
        if (recomposeScopeImplX != null) {
            recomposeScopeImplX.d = new au.com.woolworths.design.core.ui.component.stable.button.g(bottomSheetData, z, sheetState, onTermsChecked, onLinkClicked, onTermsSubmitted, onDismissModal, modifier2, i);
        }
    }
}
